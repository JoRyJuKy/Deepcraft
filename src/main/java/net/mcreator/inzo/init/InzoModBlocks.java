
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.inzo.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.inzo.block.DepthsVoidBlock;
import net.mcreator.inzo.block.DepthsPortalBlock;
import net.mcreator.inzo.block.DeepTurfBlock;
import net.mcreator.inzo.block.DeepStoneBlock;
import net.mcreator.inzo.InzoMod;

public class InzoModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, InzoMod.MODID);
	public static final RegistryObject<Block> DEPTHS_PORTAL = REGISTRY.register("depths_portal", () -> new DepthsPortalBlock());
	public static final RegistryObject<Block> DEEP_TURF = REGISTRY.register("deep_turf", () -> new DeepTurfBlock());
	public static final RegistryObject<Block> DEEP_STONE = REGISTRY.register("deep_stone", () -> new DeepStoneBlock());
	public static final RegistryObject<Block> DEPTHS_VOID = REGISTRY.register("depths_void", () -> new DepthsVoidBlock());
}
