package net.mcreator.inzo.client.gui;

public class LensguiScreen extends AbstractContainerScreen<LensguiMenu> {

	private final static HashMap<String, Object> guistate = LensguiMenu.guistate;

	private final Level world;
	private final int x, y, z;
	private final Player entity;

	Button button_transfer_energy;

	public LensguiScreen(LensguiMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 176;
		this.imageHeight = 166;
	}

	private static final ResourceLocation texture = new ResourceLocation("inzo:textures/screens/lensgui.png");

	@Override
	public void render(PoseStack ms, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(ms);
		super.render(ms, mouseX, mouseY, partialTicks);
		this.renderTooltip(ms, mouseX, mouseY);

	}

	@Override
	protected void renderBg(PoseStack ms, float partialTicks, int gx, int gy) {
		RenderSystem.setShaderColor(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();

		RenderSystem.setShaderTexture(0, texture);
		this.blit(ms, this.leftPos, this.topPos, 0, 0, this.imageWidth, this.imageHeight, this.imageWidth, this.imageHeight);

		RenderSystem.disableBlend();
	}

	@Override
	public boolean keyPressed(int key, int b, int c) {
		if (key == 256) {
			this.minecraft.player.closeContainer();
			return true;
		}

		return super.keyPressed(key, b, c);
	}

	@Override
	public void containerTick() {
		super.containerTick();
	}

	@Override
	protected void renderLabels(PoseStack poseStack, int mouseX, int mouseY) {
		this.font.draw(poseStack, Component.translatable("gui.inzo.lensgui.label_lens"), 8, 8, -12829636);
	}

	@Override
	public void onClose() {
		super.onClose();
	}

	@Override
	public void init() {
		super.init();

		button_transfer_energy = Button.builder(Component.translatable("gui.inzo.lensgui.button_transfer_energy"), e -> {
			if (true) {
				InzoMod.PACKET_HANDLER.sendToServer(new LensguiButtonMessage(0, x, y, z));
				LensguiButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		}).bounds(this.leftPos + 61, this.topPos + 56, 103, 20).build();

		guistate.put("button:button_transfer_energy", button_transfer_energy);
		this.addRenderableWidget(button_transfer_energy);

	}

}
