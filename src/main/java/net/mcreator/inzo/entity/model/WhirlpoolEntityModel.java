package net.mcreator.inzo.entity.model;

import software.bernie.geckolib.core.animation.AnimationState;

public class WhirlpoolEntityModel extends GeoModel<WhirlpoolEntityEntity> {
	@Override
	public ResourceLocation getAnimationResource(WhirlpoolEntityEntity entity) {
		return new ResourceLocation("inzo", "animations/whirlpool.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(WhirlpoolEntityEntity entity) {
		return new ResourceLocation("inzo", "geo/whirlpool.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(WhirlpoolEntityEntity entity) {
		return new ResourceLocation("inzo", "textures/entities/" + entity.getTexture() + ".png");
	}

}