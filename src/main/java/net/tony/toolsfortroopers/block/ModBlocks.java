package net.tony.toolsfortroopers.block;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.tony.toolsfortroopers.ToolsForTroopers;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

public class ModBlocks {
    public static final Block TITANIUM_BLOCK = registerBlock("titanium_block", new Block(AbstractBlock.Settings.create().strength(6f, 7f).requiresTool().sounds(BlockSoundGroup.METAL)));

    public static final Block TITANIUM_ORE = registerBlock("titanium_ore", new Block(AbstractBlock.Settings.create().strength(5f, 6f).requiresTool().sounds(BlockSoundGroup.NETHER_ORE)));

    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, Identifier.of(ToolsForTroopers.MOD_ID, name), block);
    }

    private static void registerBlockItem(String name, Block block) {
        Registry.register(Registries.ITEM, Identifier.of(ToolsForTroopers.MOD_ID, name),
                new BlockItem(block, new Item.Settings()));
    }

    public static void registerModBlocks() {
        ToolsForTroopers.LOGGER.info("Registering Mod Blocks for " + ToolsForTroopers.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(entries -> {
            entries.add(ModBlocks.TITANIUM_BLOCK);
            entries.add(ModBlocks.TITANIUM_ORE);
        });
    }
}