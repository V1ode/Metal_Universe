package net.project.project.item;

import net.minecraft.block.Blocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class ModItemGroup {

    public static final ItemGroup IRON_BLOCK = new ItemGroup("Wires") {
        @Override
        public ItemStack createIcon() {
            return new ItemStack(Blocks.IRON_BLOCK);
        }
    };
}
