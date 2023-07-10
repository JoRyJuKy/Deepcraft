
package net.mcreator.inzo.block;

import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.LiquidBlock;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.Entity;
import net.minecraft.core.BlockPos;

import net.mcreator.inzo.procedures.DepthsVoidMobplayerCollidesBlockProcedure;
import net.mcreator.inzo.init.InzoModFluids;

public class DepthsVoidBlock extends LiquidBlock {
	public DepthsVoidBlock() {
		super(() -> InzoModFluids.DEPTHS_VOID.get(), BlockBehaviour.Properties.of(Material.LAVA).strength(100f).noCollission().noLootTable());
	}

	@Override
	public void entityInside(BlockState blockstate, Level world, BlockPos pos, Entity entity) {
		super.entityInside(blockstate, world, pos, entity);
		DepthsVoidMobplayerCollidesBlockProcedure.execute(world, pos.getX(), pos.getY(), pos.getZ());
	}
}
