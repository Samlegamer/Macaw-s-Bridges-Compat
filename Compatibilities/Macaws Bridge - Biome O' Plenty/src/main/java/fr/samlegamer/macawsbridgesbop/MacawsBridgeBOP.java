package fr.samlegamer.macawsbridgesbop;

import fr.samlegamer.macawsbridgesbop.blocks.MBBOPBlocksRegistry;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.RenderTypeLookup;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(value = MacawsBridgeBOP.MODID)
@Mod.EventBusSubscriber(modid = MacawsBridgeBOP.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class MacawsBridgeBOP
{
	public static final String MODID = "macawsbridgesbop";
		
	public MacawsBridgeBOP()
	{
		FMLJavaModLoadingContext.get().getModEventBus().addListener(this::ClientSetup);
		IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
		MBBOPBlocksRegistry.BLOCKS_REGISTRY.register(bus);
		MBBOPBlocksRegistry.registry();
		MBBOPBlocksRegistry.ITEMS_REGISTRY.register(bus);
	}
	
	
	private void ClientSetup(FMLClientSetupEvent event)
	{
		RenderTypeLookup.setRenderLayer(MBBOPBlocksRegistry.LogBridgesAll.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBBOPBlocksRegistry.RopeBridgesAll.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBBOPBlocksRegistry.PierBridgesAll.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBBOPBlocksRegistry.StairBridgesAll.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBBOPBlocksRegistry.RailBridgesAll.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBBOPBlocksRegistry.RopeStairBridgesAll.get(), RenderType.cutout());
	}	
}