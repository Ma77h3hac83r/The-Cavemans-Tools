package net.ma77.tct.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.ma77.tct.TheCavemansTools;
import net.ma77.tct.item.custom.*;
import net.minecraft.item.*;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {

    // WEAPONS
    public static final Item DAGGER = registerItem("dagger", new ModSwordItem(ModToolMaterial.STONE, 2, 1f, new FabricItemSettings().group(ModItemGroup.THECAVEMANSTOOLS)));
    //public static final Item BOW = registerItem("bow", new ModBowItem(ModToolMaterial.STONE, new FabricItemSettings().group(ModItemGroup.THECAVEMANSTOOLS)));
    //public static final Item ARROW = registerItem("arrow", new Item(new FabricItemSettings().group(ModItemGroup.THECAVEMANSTOOLS)));

    // TOOLS
    public static final Item PICKAXE = registerItem("pickaxe", new ModPickaxeItem(ModToolMaterial.STONE, 2, 1f, new FabricItemSettings().group(ModItemGroup.THECAVEMANSTOOLS)));
    public static final Item SHOVEL = registerItem("shovel", new ShovelItem(ModToolMaterial.STONE, 2, 1f, new FabricItemSettings().group(ModItemGroup.THECAVEMANSTOOLS)));
    public static final Item AXE = registerItem("axe", new ModAxeItem(ModToolMaterial.STONE, 2, 1f, new FabricItemSettings().group(ModItemGroup.THECAVEMANSTOOLS)));
    public static final Item TROWEL = registerItem("trowel", new ModHoeItem(ModToolMaterial.STONE, 2, 1f, new FabricItemSettings().group(ModItemGroup.THECAVEMANSTOOLS)));

    // PARTS
    //public static final Item BOW_HANDLE = registerItem("bow_handle", new Item(new FabricItemSettings().group(ModItemGroup.THECAVEMANSTOOLS)));
    public static final Item LONG_HANDLE = registerItem("long_handle", new Item(new FabricItemSettings().group(ModItemGroup.THECAVEMANSTOOLS)));
    public static final Item SHORT_HANDLE = registerItem("short_handle", new Item(new FabricItemSettings().group(ModItemGroup.THECAVEMANSTOOLS)));
    public static final Item SHORT_BLADE = registerItem("short_blade", new Item(new FabricItemSettings().group(ModItemGroup.THECAVEMANSTOOLS)));
    //public static final Item ARROW_HEAD = registerItem("arrow_head", new Item(new FabricItemSettings().group(ModItemGroup.THECAVEMANSTOOLS)));
    public static final Item AXE_HEAD = registerItem("axe_head", new Item(new FabricItemSettings().group(ModItemGroup.THECAVEMANSTOOLS)));
    public static final Item PICKAXE_HEAD = registerItem("pickaxe_head", new Item(new FabricItemSettings().group(ModItemGroup.THECAVEMANSTOOLS)));
    public static final Item SHOVEL_HEAD = registerItem("shovel_head", new Item(new FabricItemSettings().group(ModItemGroup.THECAVEMANSTOOLS)));
    public static final Item BINDING = registerItem("binding", new Item(new FabricItemSettings().group(ModItemGroup.THECAVEMANSTOOLS)));
    //public static final Item BOWSTRING = registerItem("bowstring", new Item(new FabricItemSettings().group(ModItemGroup.THECAVEMANSTOOLS)));
    //public static final Item FLETCHLING = registerItem("fletchling", new Item(new FabricItemSettings().group(ModItemGroup.THECAVEMANSTOOLS)));
    //public static final Item LEAF = registerItem("leaf", new Item(new FabricItemSettings().group(ModItemGroup.THECAVEMANSTOOLS)));
    //public static final Item SHAFT = registerItem("shaft", new Item(new FabricItemSettings().group(ModItemGroup.THECAVEMANSTOOLS)));
    //public static final Item STOCK = registerItem("stock", new Item(new FabricItemSettings().group(ModItemGroup.THECAVEMANSTOOLS)));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(TheCavemansTools.MODID, name), item);
    }

    public static void registerModItems() {
        TheCavemansTools.LOGGER.info("Registering Mod Items for " + TheCavemansTools.MODID);
    }
}
