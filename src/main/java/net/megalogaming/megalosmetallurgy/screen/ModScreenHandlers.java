package net.megalogaming.megalosmetallurgy.screen;

import net.fabricmc.fabric.api.screenhandler.v1.ScreenHandlerRegistry;
import net.megalogaming.megalosmetallurgy.MegalosMetallurgy;
import net.minecraft.screen.ScreenHandlerType;
import net.minecraft.util.Identifier;

public class ModScreenHandlers {
    public static ScreenHandlerType<MetallurgicFurnaceScreenHandler> METALLURGIC_FURNACE_SCREEN_HANDLER;

    public static void registerAllScreenHandlers(){
        METALLURGIC_FURNACE_SCREEN_HANDLER =
                ScreenHandlerRegistry.registerSimple(new Identifier(MegalosMetallurgy.MOD_ID, "metallurgic_furnace"),
                        MetallurgicFurnaceScreenHandler::new);
    }
}
