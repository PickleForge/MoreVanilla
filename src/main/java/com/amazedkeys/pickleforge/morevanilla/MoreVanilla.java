package com.amazedkeys.pickleforge.morevanilla;

import com.amazedkeys.pickleforge.morevanilla.blocks.BaseBlock;
import com.amazedkeys.pickleforge.morevanilla.blocks.ExampleBaseBlock;
import net.fabricmc.api.ModInitializer;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class MoreVanilla implements ModInitializer {

	// public static final Item EXAMPLE_ITEM = new Item(new Item.Settings().group(ItemGroup.MISC));

	public static Block EXAMPLE_BLOCK = new ExampleBaseBlock();

	public static BaseBlock[] blocks = {new ExampleBaseBlock()};

	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.

		System.out.println("Loading MoreVanilla");

		// Register items
		// Registry<T>.register(Registry.ITEM, new Identifier("assets.morevanilla", "example_item"), EXAMPLE_ITEM);

		// Register blocks
		for (int i = 0; i < blocks.length; i++) {
			Registry.register(Registry.BLOCK, new Identifier("morevanilla", blocks[i].getBlockName()), (Block) blocks[i]);
			Registry.register(
					Registry.ITEM,
					new Identifier("morevanilla", blocks[i].getBlockName()),
					new BlockItem((Block) blocks[i], new Item.Settings().group(blocks[i].getItemGroup()))
			);
		}

	}
}
