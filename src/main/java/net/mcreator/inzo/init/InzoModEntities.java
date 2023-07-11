
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.inzo.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;

import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;

import net.mcreator.inzo.entity.WhirlpoolEntityEntity;
import net.mcreator.inzo.entity.ThresherEntity;
import net.mcreator.inzo.entity.MegalodauntEntity;
import net.mcreator.inzo.InzoMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class InzoModEntities {
	public static final DeferredRegister<EntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, InzoMod.MODID);
	public static final RegistryObject<EntityType<MegalodauntEntity>> MEGALODAUNT = register("megalodaunt",
			EntityType.Builder.<MegalodauntEntity>of(MegalodauntEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(MegalodauntEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<ThresherEntity>> THRESHER = register("thresher",
			EntityType.Builder.<ThresherEntity>of(ThresherEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(ThresherEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<WhirlpoolEntityEntity>> WHIRLPOOL_ENTITY = register("whirlpool_entity",
			EntityType.Builder.<WhirlpoolEntityEntity>of(WhirlpoolEntityEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(WhirlpoolEntityEntity::new)

					.sized(0.6f, 1.8f));

	private static <T extends Entity> RegistryObject<EntityType<T>> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		return REGISTRY.register(registryname, () -> (EntityType<T>) entityTypeBuilder.build(registryname));
	}

	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		event.enqueueWork(() -> {
			MegalodauntEntity.init();
			ThresherEntity.init();
			WhirlpoolEntityEntity.init();
		});
	}

	@SubscribeEvent
	public static void registerAttributes(EntityAttributeCreationEvent event) {
		event.put(MEGALODAUNT.get(), MegalodauntEntity.createAttributes().build());
		event.put(THRESHER.get(), ThresherEntity.createAttributes().build());
		event.put(WHIRLPOOL_ENTITY.get(), WhirlpoolEntityEntity.createAttributes().build());
	}
}
