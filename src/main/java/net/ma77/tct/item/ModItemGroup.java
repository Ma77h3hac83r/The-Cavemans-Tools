package net.ma77.tct.item;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.ma77.tct.TheCavemansTools;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class ModItemGroup {
    public static final ItemGroup THECAVEMANSTOOLS = FabricItemGroupBuilder.build(new Identifier(TheCavemansTools.MODID, "thecavemanstools"), () -> new ItemStack(ModItems.DAGGER));
}
