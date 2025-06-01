package com.tristan.firstlearn;

import com.tristan.firstlearn.items.ModItems;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class FirstLearn implements ModInitializer {
	public static final String MOD_ID = "firstlearn";

	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();

	}
}