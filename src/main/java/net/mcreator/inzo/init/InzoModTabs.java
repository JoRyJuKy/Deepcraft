
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

		if (tabData.getTab() == CreativeModeTabs.COMBAT) {
			tabData.accept(InzoModItems.BELL_CATALYST.get());
			tabData.accept(InzoModItems.AWAKENED_RESONANCE_CATALYST.get());
		}

		if (tabData.getTab() == CreativeModeTabs.SPAWN_EGGS) {
			tabData.accept(InzoModItems.MEGALODAUNT_SPAWN_EGG.get());
		}

		if (tabData.getTab() == CreativeModeTabs.INGREDIENTS) {
			tabData.accept(InzoModItems.UMBRAL_OBSIDIAN.get());
		}

		if (tabData.getTab() == CreativeModeTabs.TOOLS_AND_UTILITIES) {
			tabData.accept(InzoModItems.DEPTHS.get());
		}
	}
}
