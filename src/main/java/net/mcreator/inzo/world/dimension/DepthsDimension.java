
package net.mcreator.inzo.world.dimension;

@Mod.EventBusSubscriber
public class DepthsDimension {

	@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
	public static class DimensionSpecialEffectsHandler {

		@SubscribeEvent
		@OnlyIn(Dist.CLIENT)
		public static void registerDimensionSpecialEffects(RegisterDimensionSpecialEffectsEvent event) {
			DimensionSpecialEffects customEffect = new DimensionSpecialEffects(Float.NaN, true, DimensionSpecialEffects.SkyType.NONE, false, false) {

				@Override
				public Vec3 getBrightnessDependentFogColor(Vec3 color, float sunHeight) {
					return new Vec3(0.0549019608, 0.1450980392, 0.1764705882);
				}

				@Override
				public boolean isFoggyAt(int x, int y) {
					return true;
				}
			};

			event.register(new ResourceLocation("inzo:depths"), customEffect);
		}

	}

}
