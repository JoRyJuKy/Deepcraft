
package net.mcreator.inzo.world.features.treedecorators;

import com.mojang.serialization.Codec;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD) public class CoralForestFruitDecorator extends CocoaDecorator {

    public static Codec<CoralForestFruitDecorator> CODEC = Codec.unit(CoralForestFruitDecorator::new);

    public static TreeDecoratorType<?> DECORATOR_TYPE = new TreeDecoratorType<>(CODEC);

    @SubscribeEvent public static void registerPointOfInterest(RegisterEvent event) {
        event.register(ForgeRegistries.Keys.TREE_DECORATOR_TYPES, registerHelper -> registerHelper.register("coral_forest_tree_fruit_decorator", DECORATOR_TYPE));
    }

    public CoralForestFruitDecorator() {
        super(0.2f);
    }

    @Override protected TreeDecoratorType<?> type() {
        return DECORATOR_TYPE;
    }

    @Override /* failed to load code for net.minecraft.world.level.levelgen.feature.treedecorators.CocoaDecorator */

}
