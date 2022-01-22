package net.ma77.tct;

import net.fabricmc.api.ModInitializer;
import net.ma77.tct.item.ModItems;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class TheCavemansTools implements ModInitializer {
	public static final String MODID = "tct";
	public static final Logger LOGGER = LogManager.getLogger(MODID);

	@Override
	public void onInitialize() {

		ModItems.registerModItems();

	}
}
