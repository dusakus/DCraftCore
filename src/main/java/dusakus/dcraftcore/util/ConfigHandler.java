package dusakus.dcraftcore.util;

import cpw.mods.fml.client.event.ConfigChangedEvent;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import dusakus.dcraftcore.datastore.ConfigContent;
import dusakus.dcraftcore.datastore.ModData;
import dusakus.dcraftcore.datastore.StAcc;
import net.minecraftforge.common.config.Configuration;

import java.io.File;

/**
 * Created by bartek on 2014-08-19.
 */
public class ConfigHandler {

    public static void init(File configFileIN){
        Configuration config = new Configuration(configFileIN);

        try {
            config.load();

            ConfigContent.loadContent(config);
        } catch (Exception e) {

        } finally {
            if (config.hasChanged()){
                config.save();
            }
            StAcc.modConfigWrapper = config;
        }
    }

    @SubscribeEvent
    public void configChangedEvent(ConfigChangedEvent.OnConfigChangedEvent event){
        if (event.modID.equalsIgnoreCase(ModData.ModID)){
            ConfigContent.loadContent(StAcc.modConfigWrapper);
            if(StAcc.modConfigWrapper.hasChanged()){
                StAcc.modConfigWrapper.save();
            }
        }
    }
}
