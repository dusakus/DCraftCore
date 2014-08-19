package dusakus.dcraftcore;

import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import dusakus.dcraftcore.datastore.ModData;
import dusakus.dcraftcore.proxies.IDCProxy;
import dusakus.dcraftcore.util.ConfigHandler;
import net.minecraft.item.Item;
import net.minecraftforge.common.config.ConfigElement;

@Mod(modid = ModData.ModID, version = ModData.Version, guiFactory = ModData.GuiFactory)
public class DCraftCore
{

    @Mod.Instance(ModData.ModID)
    public static DCraftCore instance;

    @SidedProxy(clientSide = ModData.Proxy_CLIENT, serverSide = ModData.Proxy_SERVER)
    public static IDCProxy proxy;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        ConfigHandler.init(event.getSuggestedConfigurationFile());
        FMLCommonHandler.instance().bus().register(new ConfigHandler());
        dusakus.dcraftcore.items.InitRegistry.init();
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
