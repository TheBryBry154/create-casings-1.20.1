package net.bryan.createcasings.Item;

import net.bryan.createcasings.CreateCasings;
import net.bryan.createcasings.block.ModBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {

    public static final ItemGroup YAP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(CreateCasings.MOD_ID, "yap"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.yap"))
                    .icon(() -> new ItemStack(ModItems.Thing)).entries((displayContext, entries) -> {
                        entries.add(ModBlocks.YAP_BLOCK);
                        entries.add(ModBlocks.GOOF_BLOCK);
                        entries.add(ModBlocks.SILVERN_BLOCK);
                        entries.add(ModBlocks.DMV_BLOCK);
                        entries.add(ModBlocks.GOOBER_BLOCK);
                        entries.add(ModBlocks.RACER_BLOCK);
                        entries.add(ModItems.Thing);
                        entries.add(ModItems.WHEEL);
                        entries.add(ModItems.TYTAN);
                        entries.add(ModItems.WIZARD);
                        entries.add(ModItems.BRYBRY);



                    }).build());

            public static void registerItemGroups() {
                CreateCasings.LOGGER.info("Registering Item Groups for " +CreateCasings.MOD_ID);

            }
}
