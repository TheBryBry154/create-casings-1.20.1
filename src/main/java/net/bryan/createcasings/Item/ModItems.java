package net.bryan.createcasings.Item;

import net.bryan.createcasings.CreateCasings;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item WHEEL = registerItem("wheel", new Item(new FabricItemSettings()));
    public static final Item Thing = registerItem("thing", new Item(new FabricItemSettings()));
    public static final Item TYTAN = registerItem("tytan", new Item(new FabricItemSettings().food(ModFoodComponents.TYTAN)));
    public static final Item WIZARD = registerItem("wizard", new Item(new FabricItemSettings().food(ModFoodComponents.WIZARD)));
    public static final Item BRYBRY = registerItem("brybry", new Item(new FabricItemSettings()));


    private static void addItemsToIngredientTabItemGroup(FabricItemGroupEntries entries) {
        entries.add(Thing); entries.add(WHEEL); entries.add(TYTAN); entries.add(WIZARD); entries.add(BRYBRY);
    }

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(CreateCasings.MOD_ID, name), item);

    }

    public static void registerModItems() {
    CreateCasings.LOGGER.info("registering Mod Items for " + CreateCasings.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INVENTORY).register(ModItems::addItemsToIngredientTabItemGroup);
}

}


