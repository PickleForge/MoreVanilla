package com.amazedkeys.pickleforge.morevanilla.blocks;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.tool.attribute.v1.FabricToolTags;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.ItemGroup;

public class ExampleBaseBlock extends Block implements BaseBlock {

    public ExampleBaseBlock() {
        super(
                FabricBlockSettings.of(Material.WOOL)
                        .breakByHand(false)
                        .breakByTool(FabricToolTags.HOES)
                        .strength(2,0.6f)
        );
    }

    @Override
    public String getBlockName() {
        return "example_block";
    }

    @Override
    public ItemGroup getItemGroup() {
        return ItemGroup.MISC;
    }
}
