package net.mcreator.inzo.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

public class DepthsVoidMobplayerCollidesBlockProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (((Entity) world.getEntitiesOfClass(Player.class, AABB.ofSize(new Vec3(x, y, z), 4, 4, 4), e -> true).stream().sorted(new Object() {
			Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
				return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
			}
		}.compareDistOf(x, y, z)).findFirst().orElse(null)) instanceof LivingEntity _entity)
			_entity.hurt(new DamageSource(_entity.level.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.GENERIC)) {
				@Override
				public Component getLocalizedDeathMessage(LivingEntity _msgEntity) {
					return Component.translatable("death.attack." + "The void called ");
				}
			}, 20000);
	}
}
