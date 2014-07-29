package com.T3hDud3.MakingAnMCMod.handler;

import com.T3hDud3.MakingAnMCMod.ref.ref;
import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;
import cpw.mods.fml.client.event.ConfigChangedEvent;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.common.config.Configuration;

import java.io.File;

import static net.minecraftforge.common.config.Configuration.CATEGORY_GENERAL;

public class ConfigHandler {
    public static Configuration config;
    public static boolean ExValue = false;

    public static void init(File configFile) {
        if (configFile == null) {
            config = new Configuration(configFile);
        }
    }

    @SubscribeEvent
    public void onConfigChangedEvent (ConfigChangedEvent.OnConfigChangedEvent event) {
        if (event.modID.equalsIgnoreCase(ref.Mod_ID)) {
            loadConfiguration();
        }
    }

    public void loadConfiguration() {
        ExValue = config.getBoolean("ExValue", config.CATEGORY_GENERAL, false, "This is an example boolean.");

        if (config.hasChanged()) {
            config.save();
        }
    }
}
