package com.amazedkeys.pickleforge.morevanilla;

import net.fabricmc.api.ModInitializer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;

import java.rmi.registry.Registry;

public class MoreVanilla implements ModInitializer {

	public static final Item EXAMPLE_ITEM = new Item(new Item.Settings().group(ItemGroup.MISC));

	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.

		System.out.println("Loading MoreVanilla");

		// Register items
		Registry<T>.register(Registry.ITEM, new Identifier(""), object_1);
	}
}
