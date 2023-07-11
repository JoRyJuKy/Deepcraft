
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.inzo.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.extensions.IForgeMenuType;

import net.minecraft.world.inventory.MenuType;

import net.mcreator.inzo.world.inventory.LensguiMenu;
import net.mcreator.inzo.InzoMod;

public class InzoModMenus {
	public static final DeferredRegister<MenuType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.MENU_TYPES, InzoMod.MODID);
	public static final RegistryObject<MenuType<LensguiMenu>> LENSGUI = REGISTRY.register("lensgui", () -> IForgeMenuType.create(LensguiMenu::new));
}
