
package net.mcreator.inzo.client.renderer;

public class WhirlpoolRenderer extends GeoEntityRenderer<WhirlpoolEntity> {
	public WhirlpoolRenderer(EntityRendererProvider.Context renderManager) {
		super(renderManager, new WhirlpoolModel());
		this.shadowRadius = 0f;
	}

	@Override
	public RenderType getRenderType(WhirlpoolEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}

	@Override
	public void preRender(PoseStack poseStack, WhirlpoolEntity entity, BakedGeoModel model, MultiBufferSource bufferSource, VertexConsumer buffer, boolean isReRender, float partialTick, int packedLight, int packedOverlay, float red, float green,
			float blue, float alpha) {
		float scale = 1f;
		this.scaleHeight = scale;
		this.scaleWidth = scale;
		super.preRender(poseStack, entity, model, bufferSource, buffer, isReRender, partialTick, packedLight, packedOverlay, red, green, blue, alpha);
	}

}