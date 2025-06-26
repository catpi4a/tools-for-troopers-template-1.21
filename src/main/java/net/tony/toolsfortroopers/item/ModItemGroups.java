package net.tony.toolsfortroopers.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.tony.toolsfortroopers.ToolsForTroopers;
import net.tony.toolsfortroopers.block.ModBlocks;

public class ModItemGroups {

    public static final ItemGroup TITANIUM_ITEMS_GROUPS = Registry.register(Registries.ITEM_GROUP, Identifier.of(ToolsForTroopers.MOD_ID, "titanium_items_group"), FabricItemGroup.builder()
            .icon(() -> new ItemStack(ModItems.TITANIUM_INGOT))
            .displayName(Text.translatable("itemgroup.toolsfortroopers.titanium_items_group"))
                    .entries((displayContext, entries) -> {
                      entries.add(ModItems.TITANIUM_INGOT);
                      entries.add(ModItems.RAW_TITANIUM);
                    }).build());
    public static final ItemGroup TITANIUM_BLOCKS_GROUPS = Registry.register(Registries.ITEM_GROUP, Identifier.of(ToolsForTroopers.MOD_ID, "titanium_block_group"), FabricItemGroup.builder()
            .icon(() -> new ItemStack(ModBlocks.TITANIUM_ORE))
            .displayName(Text.translatable("itemgroup.toolsfortroopers.titanium_blocks_group"))
            .entries((displayContext, entries) -> {
                entries.add(ModBlocks.TITANIUM_BLOCK);
                entries.add(ModBlocks.TITANIUM_ORE);
            }).build());



    public static void registerItemGroups(){
        ToolsForTroopers.LOGGER.info("Registering item groups");
    }

}
