
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.inzo.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.ForgeSpawnEggItem;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

import net.mcreator.inzo.item.VoidstoneShardItem;
import net.mcreator.inzo.item.UmbralObsidianItem;
import net.mcreator.inzo.item.Resonance8Item;
import net.mcreator.inzo.item.Resonance7Item;
import net.mcreator.inzo.item.Resonance6Item;
import net.mcreator.inzo.item.Resonance5Item;
import net.mcreator.inzo.item.Resonance4Item;
import net.mcreator.inzo.item.Resonance3Item;
import net.mcreator.inzo.item.Resonance2Item;
import net.mcreator.inzo.item.Resonance1Item;
import net.mcreator.inzo.item.RadiantShardItem;
import net.mcreator.inzo.item.LightCoreItem;
import net.mcreator.inzo.item.DepthsItem;
import net.mcreator.inzo.item.BellCatalystItem;
import net.mcreator.inzo.item.AwakenedResonanceCatalystItem;
import net.mcreator.inzo.InzoMod;

public class InzoModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, InzoMod.MODID);
	public static final RegistryObject<Item> UMBRAL_OBSIDIAN = REGISTRY.register("umbral_obsidian", () -> new UmbralObsidianItem());
	public static final RegistryObject<Item> MEGALODAUNT_SPAWN_EGG = REGISTRY.register("megalodaunt_spawn_egg", () -> new ForgeSpawnEggItem(InzoModEntities.MEGALODAUNT, -5004643, -8423328, new Item.Properties()));
	public static final RegistryObject<Item> DEPTHS = REGISTRY.register("depths", () -> new DepthsItem());
	public static final RegistryObject<Item> BELL_CATALYST = REGISTRY.register("bell_catalyst", () -> new BellCatalystItem());
	public static final RegistryObject<Item> AWAKENED_RESONANCE_CATALYST = REGISTRY.register("awakened_resonance_catalyst", () -> new AwakenedResonanceCatalystItem());
	public static final RegistryObject<Item> RESONANCE_1 = REGISTRY.register("resonance_1", () -> new Resonance1Item());
	public static final RegistryObject<Item> RESONANCE_2 = REGISTRY.register("resonance_2", () -> new Resonance2Item());
	public static final RegistryObject<Item> RESONANCE_3 = REGISTRY.register("resonance_3", () -> new Resonance3Item());
	public static final RegistryObject<Item> RESONANCE_4 = REGISTRY.register("resonance_4", () -> new Resonance4Item());
	public static final RegistryObject<Item> RESONANCE_5 = REGISTRY.register("resonance_5", () -> new Resonance5Item());
	public static final RegistryObject<Item> RESONANCE_6 = REGISTRY.register("resonance_6", () -> new Resonance6Item());
	public static final RegistryObject<Item> RESONANCE_7 = REGISTRY.register("resonance_7", () -> new Resonance7Item());
	public static final RegistryObject<Item> RESONANCE_8 = REGISTRY.register("resonance_8", () -> new Resonance8Item());
	public static final RegistryObject<Item> THRESHER_SPAWN_EGG = REGISTRY.register("thresher_spawn_egg", () -> new ForgeSpawnEggItem(InzoModEntities.THRESHER, -1, -1, new Item.Properties()));
	public static final RegistryObject<Item> WHIRLPOOL_SPAWN_EGG = REGISTRY.register("whirlpool_spawn_egg", () -> new ForgeSpawnEggItem(InzoModEntities.WHIRLPOOL, -1, -1, new Item.Properties()));
	public static final RegistryObject<Item> DEEP_TURF = block(InzoModBlocks.DEEP_TURF);
	public static final RegistryObject<Item> DEEP_STONE = block(InzoModBlocks.DEEP_STONE);
	public static final RegistryObject<Item> VOIDSTONE_SHARD = REGISTRY.register("voidstone_shard", () -> new VoidstoneShardItem());
	public static final RegistryObject<Item> VOIDTOUCHED_DEEPSTONE = block(InzoModBlocks.VOIDTOUCHED_DEEPSTONE);
	public static final RegistryObject<Item> UMBRAL_STONE = block(InzoModBlocks.UMBRAL_STONE);
	public static final RegistryObject<Item> LIGHT_CORE = REGISTRY.register("light_core", () -> new LightCoreItem());
	public static final RegistryObject<Item> LENS = block(InzoModBlocks.LENS);
	public static final RegistryObject<Item> RADIANT_SHARD = REGISTRY.register("radiant_shard", () -> new RadiantShardItem());

	private static RegistryObject<Item> block(RegistryObject<Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}
}
