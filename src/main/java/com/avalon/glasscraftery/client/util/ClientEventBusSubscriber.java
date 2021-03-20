package com.avalon.glasscraftery.client.util;

import com.avalon.glasscraftery.GlassCraftery;
import com.avalon.glasscraftery.core.init.BlockInit;

import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.RenderTypeLookup;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

@Mod.EventBusSubscriber(modid = GlassCraftery.MOD_ID, bus = Bus.MOD, value = Dist.CLIENT)
public class ClientEventBusSubscriber {

	@SubscribeEvent
	public static void clientSetup(FMLClientSetupEvent event) {


		RenderTypeLookup.setRenderLayer(BlockInit.GLASS_CHAIN.get(), RenderType.getCutoutMipped());
		RenderTypeLookup.setRenderLayer(BlockInit.GLASS_LANTERN.get(), RenderType.getCutoutMipped());
		RenderTypeLookup.setRenderLayer(BlockInit.RETRO_GLASS.get(), RenderType.getCutoutMipped());
		RenderTypeLookup.setRenderLayer(BlockInit.RETRO_GLASS_PANE.get(), RenderType.getCutoutMipped());
		
		RenderTypeLookup.setRenderLayer(BlockInit.SOUL_GLASS_CHAIN.get(), RenderType.getTranslucent());
		RenderTypeLookup.setRenderLayer(BlockInit.SOUL_GLASS_LANTERN.get(), RenderType.getTranslucent());
		RenderTypeLookup.setRenderLayer(BlockInit.SOUL_GLASS.get(), RenderType.getTranslucent());
		RenderTypeLookup.setRenderLayer(BlockInit.SOUL_GLASS_PANE.get(), RenderType.getTranslucent());
		
		RenderTypeLookup.setRenderLayer(BlockInit.OAK_WINDOW.get(), RenderType.getCutoutMipped());
		RenderTypeLookup.setRenderLayer(BlockInit.SPRUCE_WINDOW.get(), RenderType.getCutoutMipped());
		RenderTypeLookup.setRenderLayer(BlockInit.BIRCH_WINDOW.get(), RenderType.getCutoutMipped());
		RenderTypeLookup.setRenderLayer(BlockInit.JUNGLE_WINDOW.get(), RenderType.getCutoutMipped());
		RenderTypeLookup.setRenderLayer(BlockInit.ACACIA_WINDOW.get(), RenderType.getCutoutMipped());
		RenderTypeLookup.setRenderLayer(BlockInit.DARK_OAK_WINDOW.get(), RenderType.getCutoutMipped());
		RenderTypeLookup.setRenderLayer(BlockInit.CRIMSON_WINDOW.get(), RenderType.getTranslucent());
		RenderTypeLookup.setRenderLayer(BlockInit.WARPED_WINDOW.get(), RenderType.getTranslucent());
		
		RenderTypeLookup.setRenderLayer(BlockInit.OAK_WINDOW_PANE.get(), RenderType.getCutoutMipped());
		RenderTypeLookup.setRenderLayer(BlockInit.SPRUCE_WINDOW_PANE.get(), RenderType.getCutoutMipped());
		RenderTypeLookup.setRenderLayer(BlockInit.BIRCH_WINDOW_PANE.get(), RenderType.getCutoutMipped());
		RenderTypeLookup.setRenderLayer(BlockInit.JUNGLE_WINDOW_PANE.get(), RenderType.getCutoutMipped());
		RenderTypeLookup.setRenderLayer(BlockInit.ACACIA_WINDOW_PANE.get(), RenderType.getCutoutMipped());
		RenderTypeLookup.setRenderLayer(BlockInit.DARK_OAK_WINDOW_PANE.get(), RenderType.getCutoutMipped());
		RenderTypeLookup.setRenderLayer(BlockInit.CRIMSON_WINDOW_PANE.get(), RenderType.getTranslucent());
		RenderTypeLookup.setRenderLayer(BlockInit.WARPED_WINDOW_PANE.get(), RenderType.getTranslucent());
		
		RenderTypeLookup.setRenderLayer(BlockInit.GLASSY_OAK_DOOR.get(), RenderType.getCutoutMipped());
		RenderTypeLookup.setRenderLayer(BlockInit.GLASSY_SPRUCE_DOOR.get(), RenderType.getCutoutMipped());
		RenderTypeLookup.setRenderLayer(BlockInit.GLASSY_BIRCH_DOOR.get(), RenderType.getCutoutMipped());
		RenderTypeLookup.setRenderLayer(BlockInit.GLASSY_JUNGLE_DOOR.get(), RenderType.getCutoutMipped());
		RenderTypeLookup.setRenderLayer(BlockInit.GLASSY_ACACIA_DOOR.get(), RenderType.getCutoutMipped());
		RenderTypeLookup.setRenderLayer(BlockInit.GLASSY_DARK_OAK_DOOR.get(), RenderType.getCutoutMipped());
		RenderTypeLookup.setRenderLayer(BlockInit.GLASSY_CRIMSON_DOOR.get(), RenderType.getTranslucent());
		RenderTypeLookup.setRenderLayer(BlockInit.GLASSY_WARPED_DOOR.get(), RenderType.getTranslucent());
		
		RenderTypeLookup.setRenderLayer(BlockInit.GLASSY_OAK_TRAPDOOR.get(), RenderType.getCutoutMipped());
		RenderTypeLookup.setRenderLayer(BlockInit.GLASSY_SPRUCE_TRAPDOOR.get(), RenderType.getCutoutMipped());
		RenderTypeLookup.setRenderLayer(BlockInit.GLASSY_BIRCH_TRAPDOOR.get(), RenderType.getCutoutMipped());
		RenderTypeLookup.setRenderLayer(BlockInit.GLASSY_JUNGLE_TRAPDOOR.get(), RenderType.getCutoutMipped());
		RenderTypeLookup.setRenderLayer(BlockInit.GLASSY_ACACIA_TRAPDOOR.get(), RenderType.getCutoutMipped());
		RenderTypeLookup.setRenderLayer(BlockInit.GLASSY_DARK_OAK_TRAPDOOR.get(), RenderType.getCutoutMipped());
		RenderTypeLookup.setRenderLayer(BlockInit.GLASSY_CRIMSON_TRAPDOOR.get(), RenderType.getTranslucent());
		RenderTypeLookup.setRenderLayer(BlockInit.GLASSY_WARPED_TRAPDOOR.get(), RenderType.getTranslucent());
;
		
	}
}