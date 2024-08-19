package net.bryan.createcasings.Item;

import net.bryan.createcasings.CreateCasings;
import net.fabricmc.fabric.api.item.v1.FabricItem;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.fabricmc.fabric.impl.itemgroup.FabricItemGroup;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {

    public static final Item Thing = registerItem("thing", new Item(new FabricItemSettings()));


    private static void additemstoingredienttabItemGroup(FabricItemGroupEntries entries) {
        entries.add(Thing);
    }

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(CreateCasings.MOD_ID, name), item);

    }

    public static void registerModItems() {
    CreateCasings.LOGGER.info("registering Mod Items for " + CreateCasings.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INVENTORY).register(ModItems::additemstoingredienttabItemGroup);
}

}


