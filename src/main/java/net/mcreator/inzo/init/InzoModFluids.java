
/*
 * MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.inzo.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.material.FlowingFluid;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.ItemBlockRenderTypes;

import net.mcreator.inzo.fluid.DepthsVoidFluid;
import net.mcreator.inzo.InzoMod;

public class InzoModFluids {
	public static final DeferredRegister<Fluid> REGISTRY = DeferredRegister.create(ForgeRegistries.FLUIDS, InzoMod.MODID);
	public static final RegistryObject<FlowingFluid> DEPTHS_VOID = REGISTRY.register("depths_void", () -> new DepthsVoidFluid.Source());
	public static final RegistryObject<FlowingFluid> FLOWING_DEPTHS_VOID = REGISTRY.register("flowing_depths_void", () -> new DepthsVoidFluid.Flowing());

	@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
	public static class ClientSideHandler {
		@SubscribeEvent
		public static void clientSetup(FMLClientSetupEvent event) {
			ItemBlockRenderTypes.setRenderLayer(DEPTHS_VOID.get(), RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(FLOWING_DEPTHS_VOID.get(), RenderType.translucent());
		}
	}
}
