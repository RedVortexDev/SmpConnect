package me.redvortex.smpconnect.item;

import me.redvortex.smpconnect.SMPConnect;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {

    public static final Item RAW_DRAGONITE = register("raw_dragonite", ItemGroups.INGREDIENTS, new Item(new FabricItemSettings()));
    public static final Item DRAGONITE = register("dragonite", ItemGroups.INGREDIENTS, new Item(new FabricItemSettings()));


    public static Item register(String name, ItemGroup group, Item item) {
            ItemGroupEvents.modifyEntriesEvent(ModItemGroup.ITEM_GROUP).register(entries -> entries.add(item));
            ItemGroupEvents.modifyEntriesEvent(group).register(entries -> entries.add(item));
            return Registry.register(Registries.ITEM, new Identifier(SMPConnect.MOD_ID, name), item);
    }

    public static void registerItems() {
        SMPConnect.LOGGER.info("Registering mod items!");
    }
}
