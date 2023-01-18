package me.redvortex.smpconnect.block;

import me.redvortex.smpconnect.SMPConnect;
import me.redvortex.smpconnect.item.ModItemGroup;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModBlocks {

    public final Block DRAGONITE_BLOCK = register("dragonite_block", new Block(FabricBlockSettings.of(Material.METAL).strength(4f)), ItemGroups.BUILDING_BLOCKS);

    public static Block register(String name, Block block, ItemGroup group) {
        registerBlockItem(name, block, group);
        return Registry.register(Registries.BLOCK, new Identifier(SMPConnect.MOD_ID, name), block);
    }

    public static Item registerBlockItem(String name, Block block, ItemGroup group) {
        ItemGroupEvents.modifyEntriesEvent(ModItemGroup.ITEM_GROUP).register(entries -> entries.add(block));
        ItemGroupEvents.modifyEntriesEvent(group).register(entries -> entries.add(block));
        return Registry.register(Registries.ITEM, new Identifier(SMPConnect.MOD_ID, name), new BlockItem(block, new FabricItemSettings()));
    }

    public static void registerBlocks() {
        SMPConnect.LOGGER.info("Registering mod blocks!");
    }
}
