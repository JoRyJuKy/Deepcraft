
package net.mcreator.inzo.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.inzo.entity.MegalodauntEntity;
import net.mcreator.inzo.client.model.ModelSharko_deepwoken;

public class MegalodauntRenderer extends MobRenderer<MegalodauntEntity, ModelSharko_deepwoken<MegalodauntEntity>> {
	public MegalodauntRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelSharko_deepwoken(context.bakeLayer(ModelSharko_deepwoken.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(MegalodauntEntity entity) {
		return new ResourceLocation("inzo:textures/entities/sharko_texture_2.png");
	}
}
