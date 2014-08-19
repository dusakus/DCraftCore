package dusakus.dcraftcore.items;

import cpw.mods.fml.common.registry.EntityRegistry;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.server.FMLServerHandler;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.server.MinecraftServer;
import net.minecraft.server.management.PlayerManager;

/**
 * Created by dusakus on 2014-08-19.
 */
public class StaffOfRemoval extends ItemBASE {

    public StaffOfRemoval() {
        super();
        this.setUnlocalizedName("staffofremoval");
    }

    @Override
    public boolean onLeftClickEntity(ItemStack stack, EntityPlayer player, Entity entity) {
        if (!entity.isEntityInvulnerable())
            stack.setStackDisplayName("Target: " + entity.getEntityId());
        return super.onLeftClickEntity(stack, player, entity);
    }

    @Override
    public boolean onDroppedByPlayer(ItemStack item, EntityPlayer player) {
        if (item.getDisplayName().startsWith("Target:")) {
            int ID = Integer.parseInt(item.getDisplayName().replace("Target: ", ""));
          if(player.getEntityWorld().getEntityByID(ID)!=null){
            Entity target = player.getEntityWorld().getEntityByID(ID);
            player.getEntityWorld().createExplosion(target, target.lastTickPosX, target.lastTickPosY, target.lastTickPosZ, 8.0F, true);
        }}

        return super.onDroppedByPlayer(item, player);
    }
}
