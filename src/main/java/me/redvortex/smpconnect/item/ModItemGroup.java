package me.redvortex.smpconnect.item;

import me.redvortex.smpconnect.SMPConnect;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Items;
import net.minecraft.util.Identifier;

public class ModItemGroup {
    public static final ItemGroup ITEM_GROUP = FabricItemGroup.builder(new Identifier(SMPConnect.MOD_ID, "item_group"))
            .icon(Items.END_CRYSTAL::getDefaultStack)
            .build();
}
