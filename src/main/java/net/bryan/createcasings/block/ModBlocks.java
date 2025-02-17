package net.bryan.createcasings.block;

import net.bryan.createcasings.CreateCasings;
import net.bryan.createcasings.block.custom.DmvBlock;
import net.bryan.createcasings.block.custom.GooberBlock;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.AmethystBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.GrassBlock;
import net.minecraft.block.enums.Instrument;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import oshi.util.platform.unix.solaris.KstatUtil;


public class ModBlocks {

    public static final Block YAP_BLOCK = registerBlock("yap_block",
            new Block((FabricBlockSettings.copyOf(Blocks.IRON_BLOCK))));

    public static final Block GOOF_BLOCK = registerBlock("goof_block",
            new Block((FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).sounds(BlockSoundGroup.WOOD))));

    public static final Block SILVERN_BLOCK = registerBlock("silvern_block",
            new Block((FabricBlockSettings.copyOf(Blocks.AMETHYST_BLOCK).luminance(122).sounds(BlockSoundGroup.WET_GRASS).instrument(Instrument.GUITAR))));

    public static final Block DMV_BLOCK = registerBlock("dmv_block",
            new DmvBlock((FabricBlockSettings.copyOf(Blocks.CONDUIT).sounds(BlockSoundGroup.POWDER_SNOW).luminance(99))));

    public static final Block GOOBER_BLOCK = registerBlock("goober_block",
            new GooberBlock((FabricBlockSettings.copyOf(Blocks.WET_SPONGE).sounds((BlockSoundGroup.HONEY)))));

    public static final Block RACER_BLOCK = registerBlock("racer_block",
            new Block((FabricBlockSettings.copyOf(Blocks.ICE).sounds(BlockSoundGroup.SOUL_SOIL).strength(200, 100).luminance(900))));

    public static final Block WHATOK_BLOCK = registerBlock("whatok_block",
            new Block((FabricBlockSettings.copyOf(Blocks.REDSTONE_BLOCK).sounds(BlockSoundGroup.DECORATED_POT_SHATTER).strength(200, 100).luminance(900))));


    public static final Block BEN_BLOCK = registerBlock("ben_block",
            new Block ((FabricBlockSettings.copyOf(Blocks.WHITE_WOOL).sounds(BlockSoundGroup.WOOL).strength(2000, 1000).luminance(0))));

    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(CreateCasings.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block) {
        return Registry.register(Registries.ITEM, new Identifier(CreateCasings.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings()));
    }

    public static void registerModBlocks() {
        CreateCasings.LOGGER.info("registerModBlocks for " + CreateCasings.MOD_ID);


    }

}
