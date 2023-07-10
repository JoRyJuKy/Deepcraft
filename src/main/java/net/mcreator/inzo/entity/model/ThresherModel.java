package net.mcreator.inzo.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.inzo.entity.ThresherEntity;

public class ThresherModel extends GeoModel<ThresherEntity> {
	@Override
	public ResourceLocation getAnimationResource(ThresherEntity entity) {
		return new ResourceLocation("inzo", "animations/thresher.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ThresherEntity entity) {
		return new ResourceLocation("inzo", "geo/thresher.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ThresherEntity entity) {
		return new ResourceLocation("inzo", "textures/entities/" + entity.getTexture() + ".png");
	}

}
