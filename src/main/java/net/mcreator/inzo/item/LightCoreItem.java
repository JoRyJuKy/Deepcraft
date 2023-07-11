
package net.mcreator.inzo.item;

import net.minecraft.world.entity.ai.attributes.Attributes;
import javax.annotation.Nullable;

public class LightCoreItem extends Item {
	public LightCoreItem() {
		super(new Item.Properties().durability(25).fireResistant().rarity(Rarity.EPIC));
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
		list.add(Component.literal("Restored with radiant energy"));
		list.add(Component.literal("it shines brighter than the sun in the sky."));
	}
}