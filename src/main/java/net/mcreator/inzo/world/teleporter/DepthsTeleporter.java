
package net.mcreator.inzo.world.teleporter;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class DepthsTeleporter implements ITeleporter {

	public static final TicketType<BlockPos> CUSTOM_PORTAL = TicketType.create("depths_portal", Vec3i::compareTo, 300);

	public static Holder<PoiType> poi = null;

	@SubscribeEvent
	public static void registerPointOfInterest(RegisterEvent event) {
		event.register(ForgeRegistries.Keys.POI_TYPES, registerHelper -> {
			PoiType poiType = new PoiType(ImmutableSet.copyOf(InzoModBlocks.DEPTHS_PORTAL.get().getStateDefinition().getPossibleStates()), 0, 1);
			registerHelper.register("depths_portal", poiType);
			poi = ForgeRegistries.POI_TYPES.getHolder(poiType).get();
		});
	}

	private final ServerLevel level;
	private final BlockPos entityEnterPos;

	public DepthsTeleporter(ServerLevel worldServer, BlockPos entityEnterPos) {
		this.level = worldServer;
		this.entityEnterPos = entityEnterPos;
	}

	/* failed to load code for net.minecraft.world.level.portal.PortalForcer */

	/* failed to load code for net.minecraft.world.level.portal.PortalForcer */

	/* failed to load code for net.minecraft.world.level.portal.PortalForcer */

	@Override
	public Entity placeEntity(Entity entity, ServerLevel currentWorld, ServerLevel server, float yaw, Function<Boolean, Entity> repositionEntity) {
		PortalInfo portalinfo = getPortalInfo(entity, server);

		if (entity instanceof ServerPlayer player) {
			player.setLevel(server);
			server.addDuringPortalTeleport(player);

			entity.setYRot(portalinfo.yRot % 360.0F);
			entity.setXRot(portalinfo.xRot % 360.0F);

			entity.moveTo(portalinfo.pos.x, portalinfo.pos.y, portalinfo.pos.z);

			CriteriaTriggers.CHANGED_DIMENSION.trigger(player, currentWorld.dimension(), server.dimension());

			return entity;
		} else {
			Entity entityNew = entity.getType().create(server);
			if (entityNew != null) {
				entityNew.restoreFrom(entity);
				entityNew.moveTo(portalinfo.pos.x, portalinfo.pos.y, portalinfo.pos.z, portalinfo.yRot, entityNew.getXRot());
				entityNew.setDeltaMovement(portalinfo.speed);
				server.addDuringTeleport(entityNew);
			}
			return entityNew;
		}
	}

	private PortalInfo getPortalInfo(Entity entity, ServerLevel server) {
		WorldBorder worldborder = server.getWorldBorder();
		double d0 = Math.max(-2.9999872E7D, worldborder.getMinX() + 16.);
		double d1 = Math.max(-2.9999872E7D, worldborder.getMinZ() + 16.);
		double d2 = Math.min(2.9999872E7D, worldborder.getMaxX() - 16.);
		double d3 = Math.min(2.9999872E7D, worldborder.getMaxZ() - 16.);
		double d4 = DimensionType.getTeleportationScale(entity.level.dimensionType(), server.dimensionType());
		BlockPos blockpos1 = BlockPos.containing(Mth.clamp(entity.getX() * d4, d0, d2), entity.getY(), Mth.clamp(entity.getZ() * d4, d1, d3));
		return this.getExitPortal(entity, blockpos1, worldborder).map(repositioner -> {
			BlockState blockstate = entity.level.getBlockState(this.entityEnterPos);
			Direction.Axis direction$axis;
			Vec3 vector3d;

			if (blockstate.hasProperty(BlockStateProperties.HORIZONTAL_AXIS)) {
				direction$axis = blockstate.getValue(BlockStateProperties.HORIZONTAL_AXIS);
				BlockUtil.FoundRectangle teleportationrepositioner$result = BlockUtil.getLargestRectangleAround(this.entityEnterPos, direction$axis, 21, Direction.Axis.Y, 21, pos -> entity.level.getBlockState(pos) == blockstate);
				vector3d = DepthsPortalShape.getRelativePosition(teleportationrepositioner$result, direction$axis, entity.position(), entity.getDimensions(entity.getPose()));
			} else {
				direction$axis = Direction.Axis.X;
				vector3d = new Vec3(0.5, 0, 0);
			}

			return DepthsPortalShape.createPortalInfo(server, repositioner, direction$axis, vector3d, entity, entity.getDeltaMovement(), entity.getYRot(), entity.getXRot());
		}).orElse(new PortalInfo(entity.position(), Vec3.ZERO, entity.getYRot(), entity.getXRot()));
	}

	protected Optional<BlockUtil.FoundRectangle> getExitPortal(Entity entity, BlockPos pos, WorldBorder worldBorder) {
		Optional<BlockUtil.FoundRectangle> optional = this.findPortalAround(pos, false, worldBorder);

		if (entity instanceof ServerPlayer) {
			if (optional.isPresent()) {
				return optional;
			} else {
				Direction.Axis direction$axis = entity.level.getBlockState(this.entityEnterPos).getOptionalValue(NetherPortalBlock.AXIS).orElse(Direction.Axis.X);
				return this.createPortal(pos, direction$axis);
			}
		} else {
			return optional;
		}
	}

	private boolean canPortalReplaceBlock(BlockPos.MutableBlockPos pos) {
		BlockState blockstate = this.level.getBlockState(pos);
		return blockstate.canBeReplaced() && blockstate.getFluidState().isEmpty();
	}

}
