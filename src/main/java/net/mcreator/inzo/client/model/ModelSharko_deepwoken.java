package net.mcreator.inzo.client.model;

import net.minecraft.world.entity.Entity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.model.geom.builders.PartDefinition;
import net.minecraft.client.model.geom.builders.MeshDefinition;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.CubeDeformation;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.EntityModel;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

// Made with Blockbench 4.7.4
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports
public class ModelSharko_deepwoken<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("inzo", "model_sharko_deepwoken"), "main");
	public final ModelPart leg;
	public final ModelPart leg2;
	public final ModelPart body;
	public final ModelPart corals;
	public final ModelPart head;
	public final ModelPart arm;
	public final ModelPart arm2;

	public ModelSharko_deepwoken(ModelPart root) {
		this.leg = root.getChild("leg");
		this.leg2 = root.getChild("leg2");
		this.body = root.getChild("body");
		this.corals = root.getChild("corals");
		this.head = root.getChild("head");
		this.arm = root.getChild("arm");
		this.arm2 = root.getChild("arm2");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition leg = partdefinition.addOrReplaceChild(
				"leg", CubeListBuilder.create().texOffs(103, 76).addBox(-6.804F, -23.814F, 3.402F, 6.804F, 6.804F, 3.402F, new CubeDeformation(0.0F)).texOffs(0, 72)
						.addBox(-20.412F, -23.814F, -3.402F, 6.804F, 23.814F, 6.804F, new CubeDeformation(0.0F)).texOffs(0, 103).addBox(-20.412F, -6.804F, -10.206F, 6.804F, 6.804F, 6.804F, new CubeDeformation(0.0F)),
				PartPose.offset(10.206F, 24.0F, 0.0F));
		PartDefinition leg2 = partdefinition.addOrReplaceChild(
				"leg2", CubeListBuilder.create().texOffs(103, 48).addBox(-34.02F, -23.814F, 3.402F, 6.804F, 6.804F, 3.402F, new CubeDeformation(0.0F)).texOffs(54, 52)
						.addBox(-20.412F, -23.814F, -3.402F, 6.804F, 23.814F, 6.804F, new CubeDeformation(0.0F)).texOffs(102, 34).addBox(-20.412F, -6.804F, -10.206F, 6.804F, 6.804F, 6.804F, new CubeDeformation(0.0F)),
				PartPose.offset(23.814F, 24.0F, 0.0F));
		PartDefinition body = partdefinition.addOrReplaceChild(
				"body", CubeListBuilder.create().texOffs(0, 0).addBox(-10.206F, -51.03F, 6.804F, 20.412F, 34.02F, 6.804F, new CubeDeformation(0.0F)).texOffs(0, 41)
						.addBox(-10.206F, -47.628F, 13.608F, 20.412F, 23.814F, 6.804F, new CubeDeformation(0.0F)).texOffs(92, 28).addBox(-6.804F, -23.814F, 13.608F, 13.608F, 3.402F, 3.402F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));
		PartDefinition corals = partdefinition.addOrReplaceChild("corals",
				CubeListBuilder.create().texOffs(100, 100).addBox(-6.804F, -51.03F, 20.412F, 13.608F, 13.608F, 3.402F, new CubeDeformation(0.0F)).texOffs(96, 0).addBox(-6.804F, -54.432F, 13.608F, 13.608F, 10.206F, 3.402F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));
		PartDefinition midcoral_r1 = corals.addOrReplaceChild("midcoral_r1", CubeListBuilder.create().texOffs(54, 28).addBox(-6.804F, -20.412F, 47.628F, 13.608F, 13.608F, 10.206F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.9599F, 0.0F, 0.0F));
		PartDefinition head = partdefinition.addOrReplaceChild("head",
				CubeListBuilder.create().texOffs(54, 0).addBox(-6.804F, -64.638F, 0.0F, 13.608F, 13.608F, 13.608F, new CubeDeformation(0.0F)).texOffs(28, 103).addBox(-3.402F, -57.834F, 13.608F, 6.804F, 6.804F, 3.402F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));
		PartDefinition arm = partdefinition.addOrReplaceChild("arm", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));
		PartDefinition upperarm_r1 = arm.addOrReplaceChild("upperarm_r1", CubeListBuilder.create().texOffs(82, 52).addBox(-17.01F, -44.226F, 20.412F, 6.804F, 17.01F, 6.804F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.3054F, 0.0F, 0.0F));
		PartDefinition lowerarm_r1 = arm.addOrReplaceChild("lowerarm_r1", CubeListBuilder.create().texOffs(75, 76).addBox(-17.01F, -37.422F, -10.206F, 6.804F, 20.412F, 6.804F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.5236F, 0.0F, 0.0F));
		PartDefinition arm2 = partdefinition.addOrReplaceChild("arm2", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));
		PartDefinition upperarm_r2 = arm2.addOrReplaceChild("upperarm_r2", CubeListBuilder.create().texOffs(82, 52).addBox(10.206F, -44.226F, 20.412F, 6.804F, 17.01F, 6.804F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.3054F, 0.0F, 0.0F));
		PartDefinition lowerarm_r2 = arm2.addOrReplaceChild("lowerarm_r2", CubeListBuilder.create().texOffs(28, 76).addBox(10.206F, -37.422F, -10.206F, 6.804F, 20.412F, 6.804F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.5236F, 0.0F, 0.0F));
		return LayerDefinition.create(meshdefinition, 256, 256);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		leg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		leg2.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		corals.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		arm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		arm2.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
	}
}
