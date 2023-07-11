
package net.mcreator.inzo.client.renderer;

public class WhirlpoolEntityRenderer extends GeoEntityRenderer<WhirlpoolEntityEntity> {
	public WhirlpoolEntityRenderer(EntityRendererProvider.Context renderManager) {
		super(renderManager, new WhirlpoolEntityModel());
		this.shadowRadius = 0.5f;
	}

	@Override
	public RenderType getRenderType(WhirlpoolEntityEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}

	@Override
	public void preRender(PoseStack poseStack, WhirlpoolEntityEntity entity, BakedGeoModel model, MultiBufferSource bufferSource, VertexConsumer buffer, boolean isReRender, float partialTick, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		float scale = 1f;
		this.scaleHeight = scale;
		this.scaleWidth = scale;
		super.preRender(poseStack, entity, model, bufferSource, buffer, isReRender, partialTick, packedLight, packedOverlay, red, green, blue, alpha);
	}

}