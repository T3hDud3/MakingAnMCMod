package com.T3hDud3.MakingAnMCMod;

import com.T3hDud3.MakingAnMCMod.handler.ConfigHandler;
import com.T3hDud3.MakingAnMCMod.proxy.IProxy;
import com.T3hDud3.MakingAnMCMod.ref.ref;
import com.T3hDud3.MakingAnMCMod.util.LogHelper;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = ref.Mod_ID, name = ref.Mod_Name, version = ref.Version, guiFactory = ref.Gui_Factory_Class)

public class MakingAnMCMod {
    @Mod.Instance(ref.Mod_ID)
    public static MakingAnMCMod instance;

    @SidedProxy(clientSide = ref.Client_Proxy, serverSide = ref.Server_Proxy)
    public static IProxy proxy;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        ConfigHandler.init(event.getSuggestedConfigurationFile());
        FMLCommonHandler.instance().bus().register(new ConfigHandler());
        LogHelper.info("Pre Initialization Complete.");
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event)
    {
        LogHelper.info("Initialization Complete.");
    }

    @Mod.EventHandler
    public void init(FMLPostInitializationEvent event)
    {
        LogHelper.info("Post Initialization Complete.");
    }
}
