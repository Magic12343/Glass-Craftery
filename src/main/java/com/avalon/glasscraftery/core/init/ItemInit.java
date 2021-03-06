package com.avalon.glasscraftery.core.init;

import com.avalon.glasscraftery.GlassCraftery;


import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Rarity;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ItemInit {

	public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS,
			GlassCraftery.MOD_ID);


	// Block Items
	public static final RegistryObject<BlockItem> GLASS_CHAIN = ITEMS.register("glass_chain",
			() -> new BlockItem(BlockInit.GLASS_CHAIN.get(),
					new Item.Properties().group(ItemGroup.DECORATIONS)));
	public static final RegistryObject<BlockItem> GLASS_LANTERN = ITEMS.register("glass_lantern",
			() -> new BlockItem(BlockInit.GLASS_LANTERN.get(),
					new Item.Properties().group(ItemGroup.DECORATIONS)));
	public static final RegistryObject<BlockItem> RETRO_GLASS = ITEMS.register("retro_glass",
			() -> new BlockItem(BlockInit.RETRO_GLASS.get(),
					new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
	public static final RegistryObject<BlockItem> RETRO_GLASS_PANE = ITEMS.register("retro_glass_pane",
			() -> new BlockItem(BlockInit.RETRO_GLASS_PANE.get(),
					new Item.Properties().group(ItemGroup.DECORATIONS)));
	
	public static final RegistryObject<BlockItem> SOUL_GLASS_CHAIN = ITEMS.register("soul_glass_chain",
			() -> new BlockItem(BlockInit.SOUL_GLASS_CHAIN.get(),
					new Item.Properties().group(ItemGroup.DECORATIONS)));
	public static final RegistryObject<BlockItem> SOUL_GLASS_LANTERN = ITEMS.register("soul_glass_lantern",
			() -> new BlockItem(BlockInit.SOUL_GLASS_LANTERN.get(),
					new Item.Properties().group(ItemGroup.DECORATIONS)));
	public static final RegistryObject<BlockItem> SOUL_GLASS = ITEMS.register("soul_glass",
			() -> new BlockItem(BlockInit.SOUL_GLASS.get(),
					new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
	public static final RegistryObject<BlockItem> SOUL_GLASS_PANE = ITEMS.register("soul_glass_pane",
			() -> new BlockItem(BlockInit.SOUL_GLASS_PANE.get(),
					new Item.Properties().group(ItemGroup.DECORATIONS)));
	
	public static final RegistryObject<BlockItem> OAK_WINDOW = ITEMS.register("oak_window",
			() -> new BlockItem(BlockInit.OAK_WINDOW.get(),
					new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
	public static final RegistryObject<BlockItem> SPRUCE_WINDOW = ITEMS.register("spruce_window",
			() -> new BlockItem(BlockInit.SPRUCE_WINDOW.get(),
					new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
	public static final RegistryObject<BlockItem> BIRCH_WINDOW = ITEMS.register("birch_window",
			() -> new BlockItem(BlockInit.BIRCH_WINDOW.get(),
					new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
	public static final RegistryObject<BlockItem> JUNGLE_WINDOW = ITEMS.register("jungle_window",
			() -> new BlockItem(BlockInit.JUNGLE_WINDOW.get(),
					new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
	public static final RegistryObject<BlockItem> ACACIA_WINDOW = ITEMS.register("acacia_window",
			() -> new BlockItem(BlockInit.ACACIA_WINDOW.get(),
					new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
	public static final RegistryObject<BlockItem> DARK_OAK_WINDOW = ITEMS.register("dark_oak_window",
			() -> new BlockItem(BlockInit.DARK_OAK_WINDOW.get(),
					new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
	public static final RegistryObject<BlockItem> CRIMSON_WINDOW = ITEMS.register("crimson_window",
			() -> new BlockItem(BlockInit.CRIMSON_WINDOW.get(),
					new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
	public static final RegistryObject<BlockItem> WARPED_WINDOW = ITEMS.register("warped_window",
			() -> new BlockItem(BlockInit.WARPED_WINDOW.get(),
					new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
	
	public static final RegistryObject<BlockItem> OAK_WINDOW_PANE = ITEMS.register("oak_window_pane",
			() -> new BlockItem(BlockInit.OAK_WINDOW_PANE.get(),
					new Item.Properties().group(ItemGroup.DECORATIONS)));
	public static final RegistryObject<BlockItem> SPRUCE_WINDOW_PANE = ITEMS.register("spruce_window_pane",
			() -> new BlockItem(BlockInit.SPRUCE_WINDOW_PANE.get(),
					new Item.Properties().group(ItemGroup.DECORATIONS)));
	public static final RegistryObject<BlockItem> BIRCH_WINDOW_PANE = ITEMS.register("birch_window_pane",
			() -> new BlockItem(BlockInit.BIRCH_WINDOW_PANE.get(),
					new Item.Properties().group(ItemGroup.DECORATIONS)));
	public static final RegistryObject<BlockItem> JUNGLE_WINDOW_PANE = ITEMS.register("jungle_window_pane",
			() -> new BlockItem(BlockInit.JUNGLE_WINDOW_PANE.get(),
					new Item.Properties().group(ItemGroup.DECORATIONS)));
	public static final RegistryObject<BlockItem> ACACIA_WINDOW_PANE = ITEMS.register("acacia_window_pane",
			() -> new BlockItem(BlockInit.ACACIA_WINDOW_PANE.get(),
					new Item.Properties().group(ItemGroup.DECORATIONS)));
	public static final RegistryObject<BlockItem> DARK_OAK_WINDOW_PANE = ITEMS.register("dark_oak_window_pane",
			() -> new BlockItem(BlockInit.DARK_OAK_WINDOW_PANE.get(),
					new Item.Properties().group(ItemGroup.DECORATIONS)));
	public static final RegistryObject<BlockItem> CRIMSON_WINDOW_PANE = ITEMS.register("crimson_window_pane",
			() -> new BlockItem(BlockInit.CRIMSON_WINDOW_PANE.get(),
					new Item.Properties().group(ItemGroup.DECORATIONS)));
	public static final RegistryObject<BlockItem> WARPED_WINDOW_PANE = ITEMS.register("warped_window_pane",
			() -> new BlockItem(BlockInit.WARPED_WINDOW_PANE.get(),
					new Item.Properties().group(ItemGroup.DECORATIONS)));
	
	public static final RegistryObject<BlockItem> GLASSY_OAK_DOOR = ITEMS.register("glassy_oak_door",
			() -> new BlockItem(BlockInit.GLASSY_OAK_DOOR.get(),
					new Item.Properties().group(ItemGroup.REDSTONE)));
	public static final RegistryObject<BlockItem> GLASSY_SPRUCE_DOOR = ITEMS.register("glassy_spruce_door",
			() -> new BlockItem(BlockInit.GLASSY_SPRUCE_DOOR.get(),
					new Item.Properties().group(ItemGroup.REDSTONE)));
	public static final RegistryObject<BlockItem> GLASSY_BIRCH_DOOR = ITEMS.register("glassy_birch_door",
			() -> new BlockItem(BlockInit.GLASSY_BIRCH_DOOR.get(),
					new Item.Properties().group(ItemGroup.REDSTONE)));
	public static final RegistryObject<BlockItem> GLASSY_JUNGLE_DOOR = ITEMS.register("glassy_jungle_door",
			() -> new BlockItem(BlockInit.GLASSY_JUNGLE_DOOR.get(),
					new Item.Properties().group(ItemGroup.REDSTONE)));
	public static final RegistryObject<BlockItem> GLASSY_ACACIA_DOOR = ITEMS.register("glassy_acacia_door",
			() -> new BlockItem(BlockInit.GLASSY_ACACIA_DOOR.get(),
					new Item.Properties().group(ItemGroup.REDSTONE)));
	public static final RegistryObject<BlockItem> GLASSY_DARK_OAK_DOOR = ITEMS.register("glassy_dark_oak_door",
			() -> new BlockItem(BlockInit.GLASSY_DARK_OAK_DOOR.get(),
					new Item.Properties().group(ItemGroup.REDSTONE)));
	public static final RegistryObject<BlockItem> GLASSY_CRIMSON_DOOR = ITEMS.register("glassy_crimson_door",
			() -> new BlockItem(BlockInit.GLASSY_CRIMSON_DOOR.get(),
					new Item.Properties().group(ItemGroup.REDSTONE)));
	public static final RegistryObject<BlockItem> GLASSY_WARPED_DOOR = ITEMS.register("glassy_warped_door",
			() -> new BlockItem(BlockInit.GLASSY_WARPED_DOOR.get(),
					new Item.Properties().group(ItemGroup.REDSTONE)));
	
	public static final RegistryObject<BlockItem> GLASSY_OAK_TRAPDOOR = ITEMS.register("glassy_oak_trapdoor",
			() -> new BlockItem(BlockInit.GLASSY_OAK_TRAPDOOR.get(),
					new Item.Properties().group(ItemGroup.REDSTONE)));
	public static final RegistryObject<BlockItem> GLASSY_SPRUCE_TRAPDOOR = ITEMS.register("glassy_spruce_trapdoor",
			() -> new BlockItem(BlockInit.GLASSY_SPRUCE_TRAPDOOR.get(),
					new Item.Properties().group(ItemGroup.REDSTONE)));
	public static final RegistryObject<BlockItem> GLASSY_BIRCH_TRAPDOOR = ITEMS.register("glassy_birch_trapdoor",
			() -> new BlockItem(BlockInit.GLASSY_BIRCH_TRAPDOOR.get(),
					new Item.Properties().group(ItemGroup.REDSTONE)));
	public static final RegistryObject<BlockItem> GLASSY_JUNGLE_TRAPDOOR = ITEMS.register("glassy_jungle_trapdoor",
			() -> new BlockItem(BlockInit.GLASSY_JUNGLE_TRAPDOOR.get(),
					new Item.Properties().group(ItemGroup.REDSTONE)));
	public static final RegistryObject<BlockItem> GLASSY_ACACIA_TRAPDOOR = ITEMS.register("glassy_acacia_trapdoor",
			() -> new BlockItem(BlockInit.GLASSY_ACACIA_TRAPDOOR.get(),
					new Item.Properties().group(ItemGroup.REDSTONE)));
	public static final RegistryObject<BlockItem> GLASSY_DARK_OAK_TRAPDOOR = ITEMS.register("glassy_dark_oak_trapdoor",
			() -> new BlockItem(BlockInit.GLASSY_DARK_OAK_TRAPDOOR.get(),
					new Item.Properties().group(ItemGroup.REDSTONE)));
	public static final RegistryObject<BlockItem> GLASSY_CRIMSON_TRAPDOOR = ITEMS.register("glassy_crimson_trapdoor",
			() -> new BlockItem(BlockInit.GLASSY_CRIMSON_TRAPDOOR.get(),
					new Item.Properties().group(ItemGroup.REDSTONE)));
	public static final RegistryObject<BlockItem> GLASSY_WARPED_TRAPDOOR = ITEMS.register("glassy_warped_trapdoor",
			() -> new BlockItem(BlockInit.GLASSY_WARPED_TRAPDOOR.get(),
					new Item.Properties().group(ItemGroup.REDSTONE)));


}
