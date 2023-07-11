
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.inzo.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;

import net.minecraft.world.level.levelgen.feature.Feature;

import net.mcreator.inzo.world.features.WhirlpoolStructureFeature;
import net.mcreator.inzo.InzoMod;

@Mod.EventBusSubscriber
public class InzoModFeatures {
	public static final DeferredRegister<Feature<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.FEATURES, InzoMod.MODID);
	public static final RegistryObject<Feature<?>> WHIRLPOOL_STRUCTURE = REGISTRY.register("whirlpool_structure", WhirlpoolStructureFeature::new);
}
