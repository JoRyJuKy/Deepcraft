
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.inzo.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.ForgeSpawnEggItem;

import net.minecraft.world.item.Item;

import net.mcreator.inzo.item.UmbralObsidianItem;
import net.mcreator.inzo.item.Resonance8Item;
import net.mcreator.inzo.item.Resonance7Item;
import net.mcreator.inzo.item.Resonance6Item;
import net.mcreator.inzo.item.Resonance5Item;
import net.mcreator.inzo.item.Resonance4Item;
import net.mcreator.inzo.item.Resonance3Item;
import net.mcreator.inzo.item.Resonance2Item;
import net.mcreator.inzo.item.Resonance1Item;
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
}
