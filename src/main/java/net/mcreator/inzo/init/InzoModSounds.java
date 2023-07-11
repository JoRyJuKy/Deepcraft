
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.inzo.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;

import net.mcreator.inzo.InzoMod;

public class InzoModSounds {
	public static final DeferredRegister<SoundEvent> REGISTRY = DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, InzoMod.MODID);
	public static final RegistryObject<SoundEvent> MEGALODAUNTROAR = REGISTRY.register("megalodauntroar", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("inzo", "megalodauntroar")));
	public static final RegistryObject<SoundEvent> BELL = REGISTRY.register("bell", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("inzo", "bell")));
	public static final RegistryObject<SoundEvent> OSCILLATION = REGISTRY.register("oscillation", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("inzo", "oscillation")));
}
