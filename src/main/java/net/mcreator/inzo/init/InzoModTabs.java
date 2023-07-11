
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.inzo.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.CreativeModeTabEvent;

import net.minecraft.world.item.CreativeModeTabs;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class InzoModTabs {
	@SubscribeEvent
	public static void buildTabContentsVanilla(CreativeModeTabEvent.BuildContents tabData) {

		if (tabData.getTab() == CreativeModeTabs.BUILDING_BLOCKS) {
			tabData.accept(InzoModBlocks.LENS.get().asItem());
		}

		if (tabData.getTab() == CreativeModeTabs.COMBAT) {
			tabData.accept(InzoModItems.BELL_CATALYST.get());
			tabData.accept(InzoModItems.AWAKENED_RESONANCE_CATALYST.get());
		}

		if (tabData.getTab() == CreativeModeTabs.SPAWN_EGGS) {
			tabData.accept(InzoModItems.MEGALODAUNT_SPAWN_EGG.get());
			tabData.accept(InzoModItems.THRESHER_SPAWN_EGG.get());
			tabData.accept(InzoModItems.WHIRLPOOL_SPAWN_EGG.get());
		}

		if (tabData.getTab() == CreativeModeTabs.INGREDIENTS) {
			tabData.accept(InzoModItems.UMBRAL_OBSIDIAN.get());
			tabData.accept(InzoModItems.VOIDSTONE_SHARD.get());
			tabData.accept(InzoModItems.LIGHT_CORE.get());
			tabData.accept(InzoModItems.RADIANT_SHARD.get());
		}

		if (tabData.getTab() == CreativeModeTabs.TOOLS_AND_UTILITIES) {
			tabData.accept(InzoModItems.DEPTHS.get());
		}

		if (tabData.getTab() == CreativeModeTabs.NATURAL_BLOCKS) {
			tabData.accept(InzoModBlocks.DEEP_TURF.get().asItem());
			tabData.accept(InzoModBlocks.DEEP_STONE.get().asItem());
			tabData.accept(InzoModBlocks.VOIDTOUCHED_DEEPSTONE.get().asItem());
			tabData.accept(InzoModBlocks.UMBRAL_STONE.get().asItem());
		}
	}
}
