
/*
 * MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.inzo.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fluids.FluidType;

import net.mcreator.inzo.fluid.types.DepthsVoidFluidType;
import net.mcreator.inzo.InzoMod;

public class InzoModFluidTypes {
	public static final DeferredRegister<FluidType> REGISTRY = DeferredRegister.create(ForgeRegistries.Keys.FLUID_TYPES, InzoMod.MODID);
	public static final RegistryObject<FluidType> DEPTHS_VOID_TYPE = REGISTRY.register("depths_void", () -> new DepthsVoidFluidType());
}
