package net.tony.toolsfortroopers;

import net.fabricmc.api.ModInitializer;

import net.tony.toolsfortroopers.block.ModBlocks;
import net.tony.toolsfortroopers.item.ModItemGroups;
import net.tony.toolsfortroopers.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ToolsForTroopers implements ModInitializer {

	public static final String MOD_ID = "toolsfortroopers";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();

		ModItemGroups.registerItemGroups();
	}
}