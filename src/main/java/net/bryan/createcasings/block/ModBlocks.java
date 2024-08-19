package net.bryan.createcasings.block;

import net.bryan.createcasings.CreateCasings;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.AmethystBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.GrassBlock;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

public class ModBlocks {

    public static final Block YAP_BLOCK = registerBlock("yap_block",
            new Block((FabricBlockSettings.copyOf(Blocks.IRON_BLOCK))));

    public static final Block GOOF_BLOCK = registerBlock( "goof_block",
            new Block((FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).sounds(BlockSoundGroup.WOOD))));



    private static Block registerBlock(String name, Block block) {
    registerBlockItem(name, block);
return Registry.register(Registries.BLOCK, new Identifier(CreateCasings.MOD_ID, name),block);
}

    private static Item registerBlockItem(String name, Block block) {
        return Registry.register(Registries.ITEM, new Identifier(CreateCasings.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings()));
    }
    public static  void  registerModBlocks() {
        CreateCasings.LOGGER.info("registerModBlocks for " + CreateCasings.MOD_ID);
    }

}
