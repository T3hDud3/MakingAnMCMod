package com.T3hDud3.MakingAnMCMod;

import com.T3hDud3.MakingAnMCMod.proxy.IProxy;
import com.T3hDud3.MakingAnMCMod.ref.ref;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = ref.Mod_ID, name = ref.Mod_Name, version = ref.Version)

public class MakingAnMCMod {
    @Mod.Instance(ref.Mod_ID)
    public static MakingAnMCMod instance;

    @SidedProxy(clientSide = ref.ClientProxy, serverSide = ref.ServerProxy)
    public static IProxy proxy;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {

    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event)
    {

    }

    @Mod.EventHandler
    public void init(FMLPostInitializationEvent event)
    {

    }
}
