package net.mcreator.inzo.entity.model;

import software.bernie.geckolib.core.animation.AnimationState;

public class WhirlpoolModel extends GeoModel<WhirlpoolEntity> {
	@Override
	public ResourceLocation getAnimationResource(WhirlpoolEntity entity) {
		return new ResourceLocation("inzo", "animations/whirlpool.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(WhirlpoolEntity entity) {
		return new ResourceLocation("inzo", "geo/whirlpool.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(WhirlpoolEntity entity) {
		return new ResourceLocation("inzo", "textures/entities/" + entity.getTexture() + ".png");
	}

}