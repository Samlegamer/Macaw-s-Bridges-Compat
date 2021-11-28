package fr.samlegamer.macawsbridgesenhancedmushrooms;

import fr.samlegamer.macawsbridgesenhancedmushrooms.block.MBEMBlockRegistry;
import fr.samlegamer.macawsbridgesenhancedmushrooms.item.MBEMItemRegistry;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.RenderTypeLookup;
//import net.minecraft.client.renderer.RenderType;
//import net.minecraft.client.renderer.RenderTypeLookup;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(value = MacawsBridgesEnhancedMushrooms.MODID)
@Mod.EventBusSubscriber(modid = MacawsBridgesEnhancedMushrooms.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class MacawsBridgesEnhancedMushrooms
{
	public static final String MODID = "macawsbridgesenhancedmushrooms";
	
	public MacawsBridgesEnhancedMushrooms()
	{
		FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
		FMLJavaModLoadingContext.get().getModEventBus().addListener(this::ClientSetup);
				
		IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
		MBEMItemRegistry.ITEMS_REGISTRY.register(bus);
		MBEMBlockRegistry.BLOCKS_REGISTRY.register(bus);
	}
	
	private void setup(FMLCommonSetupEvent event){}
	
	private void ClientSetup(FMLClientSetupEvent event)
	{
	 	RenderTypeLookup.setRenderLayer(MBEMBlockRegistry.brown_mushroom_log_bridge_middle.get(), RenderType.cutout());
	 	//RenderTypeLookup.setRenderLayer(MBEMBlockRegistry.glowshroom_log_bridge_middle.get(), RenderType.cutout());
	 	RenderTypeLookup.setRenderLayer(MBEMBlockRegistry.red_mushroom_log_bridge_middle.get(), RenderType.cutout());
	 	
	 	RenderTypeLookup.setRenderLayer(MBEMBlockRegistry.rope_brown_mushroom_bridge.get(), RenderType.cutout());
	 	//RenderTypeLookup.setRenderLayer(MBEMBlockRegistry.rope_glowshroom_bridge.get(), RenderType.cutout());
	 	RenderTypeLookup.setRenderLayer(MBEMBlockRegistry.rope_red_mushroom_bridge.get(), RenderType.cutout());
	 	
	 	RenderTypeLookup.setRenderLayer(MBEMBlockRegistry.brown_mushroom_bridge_pier.get(), RenderType.cutout());
	 	//RenderTypeLookup.setRenderLayer(MBEMBlockRegistry.glowshroom_bridge_pier.get(), RenderType.cutout());
	 	RenderTypeLookup.setRenderLayer(MBEMBlockRegistry.red_mushroom_bridge_pier.get(), RenderType.cutout());
	 	
	 	RenderTypeLookup.setRenderLayer(MBEMBlockRegistry.brown_mushroom_log_bridge_stair.get(), RenderType.cutout());
	 	//RenderTypeLookup.setRenderLayer(MBEMBlockRegistry.glowshroom_log_bridge_stair.get(), RenderType.cutout());
	 	RenderTypeLookup.setRenderLayer(MBEMBlockRegistry.red_mushroom_log_bridge_stair.get(), RenderType.cutout());
	 	
	 	RenderTypeLookup.setRenderLayer(MBEMBlockRegistry.brown_mushroom_rail_bridge.get(), RenderType.cutout());
	 	//RenderTypeLookup.setRenderLayer(MBEMBlockRegistry.glowshroom_rail_bridge.get(), RenderType.cutout());
	 	RenderTypeLookup.setRenderLayer(MBEMBlockRegistry.red_mushroom_rail_bridge.get(), RenderType.cutout());
	}
}