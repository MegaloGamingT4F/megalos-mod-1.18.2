package net.megalogaming.megalosmod.screen;

import com.mojang.blaze3d.systems.RenderSystem;
import net.megalogaming.megalosmod.MegalosMod;
import net.minecraft.client.gui.screen.ingame.HandledScreen;
import net.minecraft.client.render.GameRenderer;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.screen.ScreenHandler;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class MetallurgicFurnaceScreen extends HandledScreen<MetallurgicFurnaceScreenHandler> {
    private static final Identifier TEXTURE =
            new Identifier(MegalosMod.MOD_ID, "textures/gui/metallurgic_furnace_gui.png");

    public MetallurgicFurnaceScreen(MetallurgicFurnaceScreenHandler handler, PlayerInventory inventory, Text title) {
        super(handler, inventory, title);
    }
    @Override
    protected void init(){
        super.init();
        titleX = (backgroundWidth - textRenderer.getWidth(title)) / 2;
    }

    @Override
    protected void drawBackground(MatrixStack matrices, float delta, int mouseX, int mouseY) {
        RenderSystem.setShader(GameRenderer::getPositionTexShader);
        RenderSystem.setShaderColor(1.0F, 1.0F, 1.0F, 1.0F);
        RenderSystem.setShaderTexture(0, TEXTURE);
        int x = (width - backgroundWidth) / 2;
        int y = (height - backgroundHeight) / 2;
        drawTexture(matrices, x, y, 0, 0, backgroundWidth, backgroundHeight);
        if(handler.isCrafting()) {
            drawTexture(matrices, x + 73, y + 22, 176, 14, handler.getScaledProgress(), 36);
        }

        if(handler.hasFuel()) {
            drawTexture(matrices, x + 115, y + 36 + 14 - handler.getScaledFuelProgress(), 176,
                    14 - handler.getScaledFuelProgress(), 14, handler.getScaledFuelProgress());
        }
    }

    @Override
    public void render(MatrixStack matrices, int mouseX, int mouseY, float delta){
        renderBackground(matrices);
        super.render(matrices, mouseX, mouseY, delta);
        drawMouseoverTooltip(matrices, mouseX, mouseY);
    }
}
