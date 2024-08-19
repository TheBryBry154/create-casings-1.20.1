package net.bryan.createcasings;

import net.bryan.createcasings.Item.ModItemGroups;
import net.bryan.createcasings.Item.ModItems;
import net.bryan.createcasings.block.ModBlocks;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CreateCasings implements ModInitializer {
	public static final String MOD_ID = "createcasings";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {

		ModItemGroups.registerItemGroups();
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
	}

}
