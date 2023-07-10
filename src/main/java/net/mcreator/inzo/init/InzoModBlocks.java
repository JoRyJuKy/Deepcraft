
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.inzo.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.inzo.block.DepthsPortalBlock;
import net.mcreator.inzo.InzoMod;

public class InzoModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, InzoMod.MODID);
	public static final RegistryObject<Block> DEPTHS_PORTAL = REGISTRY.register("depths_portal", () -> new DepthsPortalBlock());
}
