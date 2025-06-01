package com.tristan.firstlearn.items;

import com.tristan.firstlearn.FirstLearn;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {

    public static final Item DAHLIA_SEEDS = registerItem("dahlia_seeds", new Item(new Item.Settings()));

    private static Item registerItem (String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(FirstLearn.MOD_ID, name), item);
    }

    public static void registerModItems() {
        FirstLearn.LOGGER.info("Registering Mod Items for " + FirstLearn.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.NATURAL).register(fabricItemGroupEntries -> {
            fabricItemGroupEntries.add(DAHLIA_SEEDS);
        });
    }

}
