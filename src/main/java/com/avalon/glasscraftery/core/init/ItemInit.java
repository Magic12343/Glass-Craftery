package com.avalon.glasscraftery.core.init;

import com.avalon.glasscraftery.GlassCraftery;


import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
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
					new Item.Properties().group(GlassCraftery.TUTORIAL_GROUP)));
	public static final RegistryObject<BlockItem> GLASS_LANTERN = ITEMS.register("glass_lantern",
			() -> new BlockItem(BlockInit.GLASS_LANTERN.get(),
					new Item.Properties().group(GlassCraftery.TUTORIAL_GROUP)));
	public static final RegistryObject<BlockItem> RETRO_GLASS = ITEMS.register("retro_glass",
			() -> new BlockItem(BlockInit.RETRO_GLASS.get(),
					new Item.Properties().group(GlassCraftery.TUTORIAL_GROUP)));
	public static final RegistryObject<BlockItem> RETRO_GLASS_PANE = ITEMS.register("retro_glass_pane",
			() -> new BlockItem(BlockInit.RETRO_GLASS_PANE.get(),
					new Item.Properties().group(GlassCraftery.TUTORIAL_GROUP)));
	
	public static final RegistryObject<BlockItem> SOUL_GLASS_CHAIN = ITEMS.register("soul_glass_chain",
			() -> new BlockItem(BlockInit.SOUL_GLASS_CHAIN.get(),
					new Item.Properties().group(GlassCraftery.TUTORIAL_GROUP)));
	public static final RegistryObject<BlockItem> SOUL_GLASS_LANTERN = ITEMS.register("soul_glass_lantern",
			() -> new BlockItem(BlockInit.SOUL_GLASS_LANTERN.get(),
					new Item.Properties().group(GlassCraftery.TUTORIAL_GROUP)));
	public static final RegistryObject<BlockItem> SOUL_GLASS = ITEMS.register("soul_glass",
			() -> new BlockItem(BlockInit.SOUL_GLASS.get(),
					new Item.Properties().group(GlassCraftery.TUTORIAL_GROUP)));
	public static final RegistryObject<BlockItem> SOUL_GLASS_PANE = ITEMS.register("soul_glass_pane",
			() -> new BlockItem(BlockInit.SOUL_GLASS_PANE.get(),
					new Item.Properties().group(GlassCraftery.TUTORIAL_GROUP)));


}
