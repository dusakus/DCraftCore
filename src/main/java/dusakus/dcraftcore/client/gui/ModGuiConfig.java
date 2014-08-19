package dusakus.dcraftcore.client.gui;

import cpw.mods.fml.client.config.GuiConfig;
import cpw.mods.fml.client.config.IConfigElement;
import dusakus.dcraftcore.datastore.ModData;
import dusakus.dcraftcore.datastore.StAcc;
import net.minecraft.client.gui.GuiScreen;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.common.config.ConfigElement;

import java.util.List;

/**
 * Created by dusakus on 2014-08-19.
 */
public class ModGuiConfig extends GuiConfig {
    public ModGuiConfig(GuiScreen guiScreen)
    {
        super(guiScreen,
                new ConfigElement(StAcc.modConfigWrapper.getCategory(StAcc.modConfigWrapper.getCategoryNames().toArray()[0].toString())).getChildElements(),
                ModData.ModID,
                false,
                false,
                GuiConfig.getAbridgedConfigPath(StAcc.modConfigWrapper.toString()));
    }
}
