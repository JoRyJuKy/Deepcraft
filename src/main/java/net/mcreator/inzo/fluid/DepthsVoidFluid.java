
package net.mcreator.inzo.fluid;

public abstract class DepthsVoidFluid extends ForgeFlowingFluid {
	public static final ForgeFlowingFluid.Properties PROPERTIES = new ForgeFlowingFluid.Properties(() -> InzoModFluidTypes.DEPTHS_VOID_TYPE.get(), () -> InzoModFluids.DEPTHS_VOID.get(), () -> InzoModFluids.FLOWING_DEPTHS_VOID.get())
			.explosionResistance(100f).block(() -> (LiquidBlock) InzoModBlocks.DEPTHS_VOID.get());

	private DepthsVoidFluid() {
		super(PROPERTIES);
	}

	public static class Source extends DepthsVoidFluid {
		public int getAmount(FluidState state) {
			return 8;
		}

		public boolean isSource(FluidState state) {
			return true;
		}
	}

	public static class Flowing extends DepthsVoidFluid {
		protected void createFluidStateDefinition(StateDefinition.Builder<Fluid, FluidState> builder) {
			super.createFluidStateDefinition(builder);
			builder.add(LEVEL);
		}

		public int getAmount(FluidState state) {
			return state.getValue(LEVEL);
		}

		public boolean isSource(FluidState state) {
			return false;
		}
	}
}
