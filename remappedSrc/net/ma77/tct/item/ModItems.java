package net.ma77.tct.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.ma77.tct.TheCavemansTools;
import net.ma77.tct.item.custom.*;
import net.minecraft.item.*;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {

    // WEAPONS
    public static final Item DAGGER = registerItem("dagger", new SwordItem(ModToolMaterial.STONE, 2, 1f, new FabricItemSettings().group(ModItemGroup.TCT)));
    public static final Item SIMPLE_BOW = registerItem("simple_bow", new BowItem(new FabricItemSettings().group(ModItemGroup.TCT)));
    public static final Item ARROW = registerItem("arrow", new Item(new FabricItemSettings().group(ModItemGroup.TCT)));

    // TOOLS
    public static final Item PICKAXE = registerItem("pickaxe", new ModPickaxeItem(ModToolMaterial.STONE, 2, 1f, new FabricItemSettings().group(ModItemGroup.TCT)));
    public static final Item SHOVEL = registerItem("shovel", new ShovelItem(ModToolMaterial.STONE, 2, 1f, new FabricItemSettings().group(ModItemGroup.TCT)));
    public static final Item AXE = registerItem("axe", new ModAxeItem(ModToolMaterial.STONE, 2, 1f, new FabricItemSettings().group(ModItemGroup.TCT)));
    public static final Item TROWEL = registerItem("trowel", new ModHoeItem(ModToolMaterial.STONE, 2, 1f, new FabricItemSettings().group(ModItemGroup.TCT)));

    // PARTS
    public static final Item BOW_HANDLE = registerItem("bow_handle", new Item(new FabricItemSettings().group(ModItemGroup.TCT)));
    public static final Item LONG_HANDLE = registerItem("long_handle", new Item(new FabricItemSettings().group(ModItemGroup.TCT)));
    public static final Item SHORT_HANDLE = registerItem("short_handle", new Item(new FabricItemSettings().group(ModItemGroup.TCT)));
    public static final Item ARROW_HEAD = registerItem("arrow_head", new Item(new FabricItemSettings().group(ModItemGroup.TCT)));
    public static final Item AXE_HEAD = registerItem("axe_head", new Item(new FabricItemSettings().group(ModItemGroup.TCT)));
    public static final Item PICKAXE_HEAD = registerItem("pickaxe_head", new Item(new FabricItemSettings().group(ModItemGroup.TCT)));
    public static final Item SHOVEL_HEAD = registerItem("shovel_head", new Item(new FabricItemSettings().group(ModItemGroup.TCT)));
    public static final Item CORD = registerItem("cord", new Item(new FabricItemSettings().group(ModItemGroup.TCT)));
    public static final Item BINDING = registerItem("binding", new Item(new FabricItemSettings().group(ModItemGroup.TCT)));
    public static final Item BOWSTRING = registerItem("bowstring", new Item(new FabricItemSettings().group(ModItemGroup.TCT)));
    public static final Item FLETCHLING = registerItem("fletchling", new Item(new FabricItemSettings().group(ModItemGroup.TCT)));
    public static final Item LEAF = registerItem("leaf", new Item(new FabricItemSettings().group(ModItemGroup.TCT)));
    public static final Item SHAFT = registerItem("shaft", new Item(new FabricItemSettings().group(ModItemGroup.TCT)));
    //public static final Item STOCK = registerItem("stock", new Item(new FabricItemSettings().group(ModItemGroup.TCT)));

    public static final Item COPPER_AXE_HEAD = registerItem("copper_axe_head", new Item(new FabricItemSettings().group(ModItemGroup.TCT)));
    public static final Item COPPER_PICKAXE_HEAD = registerItem("copper_pickaxe_head", new Item(new FabricItemSettings().group(ModItemGroup.TCT)));
    public static final Item COPPER_SHOVEL_HEAD = registerItem("copper_shovel_head", new Item(new FabricItemSettings().group(ModItemGroup.TCT)));

    public static final Item IRON_AXE_HEAD = registerItem("iron_axe_head", new Item(new FabricItemSettings().group(ModItemGroup.TCT)));
    public static final Item IRON_PICKAXE_HEAD = registerItem("iron_pickaxe_head", new Item(new FabricItemSettings().group(ModItemGroup.TCT)));
    public static final Item IRON_SHOVEL_HEAD = registerItem("iron_shovel_head", new Item(new FabricItemSettings().group(ModItemGroup.TCT)));

    // CASTS
    public static final Item CAST_BLANK = registerItem("cast_blank", new Item(new FabricItemSettings().group(ModItemGroup.TCT)));
    public static final Item CAST_LONG_HANDLE = registerItem("cast_long_handle", new Item(new FabricItemSettings().group(ModItemGroup.TCT)));
    public static final Item CAST_SHORT_HANDLE = registerItem("cast_short_handle", new Item(new FabricItemSettings().group(ModItemGroup.TCT)));
    public static final Item CAST_ARROW_HEAD = registerItem("cast_arrow_head", new Item(new FabricItemSettings().group(ModItemGroup.TCT)));
    public static final Item CAST_AXE_HEAD = registerItem("cast_axe_head", new Item(new FabricItemSettings().group(ModItemGroup.TCT)));
    public static final Item CAST_PICKAXE_HEAD = registerItem("cast_pickaxe_head", new Item(new FabricItemSettings().group(ModItemGroup.TCT)));
    public static final Item CAST_SHOVEL_HEAD = registerItem("cast_shovel_head", new Item(new FabricItemSettings().group(ModItemGroup.TCT)));
    public static final Item CAST_SHAFT = registerItem("cast_shaft", new Item(new FabricItemSettings().group(ModItemGroup.TCT)));

    // ITEMS
    public static final Item CRUCIBLE = registerItem("crucible", new Item(new FabricItemSettings().group(ModItemGroup.TCT)));
    public static final Item CRUCIBLE_COPPER = registerItem("crucible_copper", new Item(new FabricItemSettings().group(ModItemGroup.TCT)));
    public static final Item CRUCIBLE_IRON = registerItem("crucible_iron", new Item(new FabricItemSettings().group(ModItemGroup.TCT)));


    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(TheCavemansTools.MODID, name), item);
    }

    public static void registerModItems() {
        TheCavemansTools.LOGGER.info("Registering Mod Items for " + TheCavemansTools.MODID);
    }
}
