package dusakus.dcraftcore;

import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;

@Mod(modid = DCraftCore.MODID, version = DCraftCore.VERSION)
public class DCraftCore
{
    public static final String MODID = "dcraftcore";
    public static final String VERSION = "1710.0.1 r0";

    @Mod.Instance("dcraftcore")
    public static DCraftCore instance;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {

    }

    @EventHandler
    public void init(FMLInitializationEvent event)
    {

    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {

    }
}
