package dusakus.dcraftcore.items;

import cpw.mods.fml.common.registry.GameRegistry;

/**
 * Created by dusakus on 2014-08-19.
 */
public class InitRegistry {

    public static final ItemBASE staffofremoval = new StaffOfRemoval();

    public static void init(){
        GameRegistry.registerItem(staffofremoval, "StaffOfRemoval");
    }
}
