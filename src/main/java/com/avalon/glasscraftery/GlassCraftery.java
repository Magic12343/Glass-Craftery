package com.avalon.glasscraftery;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.avalon.glasscraftery.core.init.BlockInit;
import com.avalon.glasscraftery.core.init.ItemInit;
import com.avalon.glasscraftery.world.OreGeneration;

import net.minecraft.entity.item.PaintingType;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegistryEvent.Register;
import net.minecraftforge.eventbus.api.EventPriority;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.IForgeRegistry;

@Mod(GlassCraftery.MOD_ID)
public class GlassCraftery 
{
	public static final Logger LOGGER = LogManager.getLogger();
	public static final String MOD_ID = "glasscraftery";

	public GlassCraftery() {
		IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
		bus.addListener(this::setup);

		ItemInit.ITEMS.register(bus);
		BlockInit.BLOCKS.register(bus);

		MinecraftForge.EVENT_BUS.register(this);
		
	}

	private void setup(final FMLCommonSetupEvent event) {

	}
	
	{

        FMLJavaModLoadingContext.get().getModEventBus().addGenericListener(PaintingType.class, this::registerPaintings);
    }

		
		 private void registerPaintings (Register<PaintingType> event) {
		        
		        final IForgeRegistry<PaintingType> registry = event.getRegistry();
		        
		        registry.register(this.createPainting("cabeson", 64, 32));

		    }
		    
		    private PaintingType createPainting (String id, int width, int height) {
		        
		        final PaintingType type = new PaintingType(width, height);
		        type.setRegistryName("glasscraftery", id);
		        return type;
		    }
	}

