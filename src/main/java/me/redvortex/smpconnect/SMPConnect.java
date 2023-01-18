package me.redvortex.smpconnect;

import me.redvortex.smpconnect.block.ModBlocks;
import me.redvortex.smpconnect.item.ModItems;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SMPConnect implements ModInitializer {
	public static final String MOD_ID = "smpconnect";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerItems();
		ModBlocks.registerBlocks();
	}
}
