package com.T3hDud3.MakingAnMCMod.client.gui;

import com.T3hDud3.MakingAnMCMod.handler.ConfigHandler;
import com.T3hDud3.MakingAnMCMod.ref.ref;
import cpw.mods.fml.client.config.GuiConfig;
import net.minecraft.client.gui.GuiScreen;
import net.minecraftforge.common.config.ConfigElement;
import net.minecraftforge.common.config.Configuration;

public class ModGuiConfig extends GuiConfig {

    public ModGuiConfig(GuiScreen guiScreen) {
        super(guiScreen,
                new ConfigElement (ConfigHandler.config.getCategory(Configuration.CATEGORY_GENERAL)).getChildElements(),
                ref.Mod_ID,
                false,
                false,
                GuiConfig.getAbridgedConfigPath(ConfigHandler.config.toString()));
    }
}
