package fr.samlegamer.macawsbridgesbyg;

import fr.samlegamer.macawsbridgesbyg.block.MBBYGBlocksRegistry;
import fr.samlegamer.macawsbridgesbyg.item.MBBYGItemsRegistry;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.RenderTypeLookup;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(value = MacawsBridgesBYG.MODID)
@Mod.EventBusSubscriber(modid = MacawsBridgesBYG.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class MacawsBridgesBYG
{
	public static final String MODID = "macawsbridgesbyg";
		
	public MacawsBridgesBYG()
	{
		FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
		FMLJavaModLoadingContext.get().getModEventBus().addListener(this::ClientSetup);
				
		IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
		MBBYGBlocksRegistry.BLOCKS_REGISTRY.register(bus);
		MBBYGBlocksRegistry.registry();
		MBBYGItemsRegistry.ITEMS_REGISTRY.register(bus);
	}
	
	private void setup(FMLCommonSetupEvent event)
	{
		
	}
	
	private void ClientSetup(FMLClientSetupEvent event)
	{
		RenderTypeLookup.setRenderLayer(MBBYGBlocksRegistry.bridgeWoodObjAll.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBBYGBlocksRegistry.ropeWoodObjAll.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBBYGBlocksRegistry.PierWoodObjAll.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBBYGBlocksRegistry.StairWoodObjAll.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBBYGBlocksRegistry.RailWoodObjAll.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBBYGBlocksRegistry.RopeStairWoodObjAll.get(), RenderType.cutout());
		
     	RenderTypeLookup.setRenderLayer(MBBYGBlocksRegistry.cryptic_stone_bridge.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBBYGBlocksRegistry.dacite_bricks_bridge.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBBYGBlocksRegistry.polished_travertine_bridge.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBBYGBlocksRegistry.purpur_stone_bridge.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBBYGBlocksRegistry.red_rock_bricks_bridge.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBBYGBlocksRegistry.scoria_stone_bricks_bridge.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBBYGBlocksRegistry.soapstone_bricks_bridge.get(), RenderType.cutout());
		
     	RenderTypeLookup.setRenderLayer(MBBYGBlocksRegistry.cryptic_stone_bridge_pier.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBBYGBlocksRegistry.dacite_bricks_bridge_pier.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBBYGBlocksRegistry.polished_travertine_bridge_pier.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBBYGBlocksRegistry.purpur_stone_bridge_pier.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBBYGBlocksRegistry.red_rock_bricks_bridge_pier.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBBYGBlocksRegistry.scoria_stone_bricks_bridge_pier.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBBYGBlocksRegistry.soapstone_bricks_bridge_pier.get(), RenderType.cutout());

        RenderTypeLookup.setRenderLayer(MBBYGBlocksRegistry.cryptic_stone_bridge_stair.get(), RenderType.cutout());
     	RenderTypeLookup.setRenderLayer(MBBYGBlocksRegistry.dacite_bricks_bridge_stair.get(), RenderType.cutout());
     	RenderTypeLookup.setRenderLayer(MBBYGBlocksRegistry.polished_travertine_bridge_stair.get(), RenderType.cutout());
     	RenderTypeLookup.setRenderLayer(MBBYGBlocksRegistry.purpur_stone_bridge_stair.get(), RenderType.cutout());
     	RenderTypeLookup.setRenderLayer(MBBYGBlocksRegistry.red_rock_bricks_bridge_stair.get(), RenderType.cutout());
     	RenderTypeLookup.setRenderLayer(MBBYGBlocksRegistry.scoria_stone_bricks_bridge_stair.get(), RenderType.cutout());
     	RenderTypeLookup.setRenderLayer(MBBYGBlocksRegistry.soapstone_bricks_bridge_stair.get(), RenderType.cutout());
	}
}