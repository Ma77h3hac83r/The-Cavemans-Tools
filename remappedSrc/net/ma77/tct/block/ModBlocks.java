package net.ma77.tct.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.ma77.tct.TheCavemansTools;
import net.ma77.tct.item.ModItemGroup;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModBlocks {

    public static final Block MELTER = registerBlock("melter", new Block(FabricBlockSettings.of(Material.STONE).strength(6f).requiresTool()), ModItemGroup.TCT);
    public static final Block TOOL_FORGE = registerBlock("tool_forge", new Block(FabricBlockSettings.of(Material.STONE).strength(6f).requiresTool()), ModItemGroup.TCT);

    private static Block registerBlock(String name, Block block, ItemGroup group) {
        registerBlockItem(name, block, group);
        return Registry.register(Registry.BLOCK, new Identifier(TheCavemansTools.MODID, name), block);
    }

    private static Item registerBlockItem(String name, Block block, ItemGroup group) {
        return Registry.register(Registry.ITEM, new Identifier(TheCavemansTools.MODID, name), new BlockItem(block, new FabricItemSettings().group(group)));
    }

    public static void registerModBlocks() {
        TheCavemansTools.LOGGER.info("Registering ModBlocks for " + TheCavemansTools.MODID);
    }
}
