package dusakus.dcraftcore.datastore;

import net.minecraftforge.common.config.Configuration;

/**
 * Created by bartek on 2014-08-19.
 */
public class ConfigContent {
    public static void loadContent(Configuration config) {
        LoadedConfig.sampleString = config.getString("SampleString", "SAMPLES", "done","Sample");
        LoadedConfig.sampleInt = config.getInt("SampleInt", "SAMPLES",10,0,99,"Sample");
        LoadedConfig.sampleBoolean = config.getBoolean("SampleBoolean", "SAMPLES", true,"Sample");
    }
}
