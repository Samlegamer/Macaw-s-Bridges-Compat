package fr.samlegamer.macawsbridgesbetterlands;

import fr.samlegamer.macawsbridgesbetterlands.block.MBBBlocksRegistry;
import fr.samlegamer.macawsbridgesbetterlands.item.MBBItemsRegistry;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.RenderTypeLookup;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(value = MacawsBridgesBetterlands.MODID)
@Mod.EventBusSubscriber(modid = MacawsBridgesBetterlands.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class MacawsBridgesBetterlands
{
	public static final String MODID = "macawsbridgesbetterlands";
		
	public MacawsBridgesBetterlands()
	{
		FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
		FMLJavaModLoadingContext.get().getModEventBus().addListener(this::ClientSetup);
				
		IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
		MBBItemsRegistry.ITEMS_REGISTRY.register(bus);
		MBBBlocksRegistry.BLOCKS_REGISTRY.register(bus);
	}
	
	private void setup(FMLCommonSetupEvent event){}
	
	private void ClientSetup(FMLClientSetupEvent event)
	{
		RenderTypeLookup.setRenderLayer(MBBBlocksRegistry.black_terracotta_bricks_bridge.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBBBlocksRegistry.blue_terracotta_bricks_bridge.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBBBlocksRegistry.brown_terracotta_bricks_bridge.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBBBlocksRegistry.claystone_bricks_bridge.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBBBlocksRegistry.cyan_terracotta_bricks_bridge.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBBBlocksRegistry.gray_terracotta_bricks_bridge.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBBBlocksRegistry.green_terracotta_bricks_bridge.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBBBlocksRegistry.light_blue_terracotta_bricks_bridge.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBBBlocksRegistry.light_gray_terracotta_bricks_bridge.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBBBlocksRegistry.lime_terracotta_bricks_bridge.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBBBlocksRegistry.magenta_terracotta_bricks_bridge.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBBBlocksRegistry.orange_terracotta_bricks_bridge.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBBBlocksRegistry.red_terracotta_bricks_bridge.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBBBlocksRegistry.terracotta_bricks_bridge.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBBBlocksRegistry.white_terracotta_bricks_bridge.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBBBlocksRegistry.yellow_terracotta_bricks_bridge.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBBBlocksRegistry.juniper_log_bridge_middle.get(), RenderType.cutout());
		
		RenderTypeLookup.setRenderLayer(MBBBlocksRegistry.rope_juniper_bridge.get(), RenderType.cutout());
		
	 	RenderTypeLookup.setRenderLayer(MBBBlocksRegistry.black_terracotta_bricks_bridge_pier.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBBBlocksRegistry.blue_terracotta_bricks_bridge_pier.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBBBlocksRegistry.brown_terracotta_bricks_bridge_pier.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBBBlocksRegistry.claystone_bricks_bridge_pier.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBBBlocksRegistry.cyan_terracotta_bricks_bridge_pier.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBBBlocksRegistry.gray_terracotta_bricks_bridge_pier.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBBBlocksRegistry.green_terracotta_bricks_bridge_pier.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBBBlocksRegistry.light_blue_terracotta_bricks_bridge_pier.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBBBlocksRegistry.light_gray_terracotta_bricks_bridge_pier.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBBBlocksRegistry.lime_terracotta_bricks_bridge_pier.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBBBlocksRegistry.magenta_terracotta_bricks_bridge_pier.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBBBlocksRegistry.orange_terracotta_bricks_bridge_pier.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBBBlocksRegistry.red_terracotta_bricks_bridge_pier.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBBBlocksRegistry.terracotta_bricks_bridge_pier.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBBBlocksRegistry.white_terracotta_bricks_bridge_pier.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBBBlocksRegistry.yellow_terracotta_bricks_bridge_pier.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBBBlocksRegistry.juniper_bridge_pier.get(), RenderType.cutout());
		
	 	RenderTypeLookup.setRenderLayer(MBBBlocksRegistry.black_terracotta_bricks_bridge_stair.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBBBlocksRegistry.blue_terracotta_bricks_bridge_stair.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBBBlocksRegistry.brown_terracotta_bricks_bridge_stair.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBBBlocksRegistry.claystone_bricks_bridge_stair.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBBBlocksRegistry.cyan_terracotta_bricks_bridge_stair.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBBBlocksRegistry.gray_terracotta_bricks_bridge_stair.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBBBlocksRegistry.green_terracotta_bricks_bridge_stair.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBBBlocksRegistry.light_blue_terracotta_bricks_bridge_stair.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBBBlocksRegistry.light_gray_terracotta_bricks_bridge_stair.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBBBlocksRegistry.lime_terracotta_bricks_bridge_stair.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBBBlocksRegistry.magenta_terracotta_bricks_bridge_stair.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBBBlocksRegistry.orange_terracotta_bricks_bridge_stair.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBBBlocksRegistry.red_terracotta_bricks_bridge_stair.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBBBlocksRegistry.terracotta_bricks_bridge_stair.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBBBlocksRegistry.white_terracotta_bricks_bridge_stair.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBBBlocksRegistry.yellow_terracotta_bricks_bridge_stair.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBBBlocksRegistry.juniper_log_bridge_stair.get(), RenderType.cutout());
		
		RenderTypeLookup.setRenderLayer(MBBBlocksRegistry.juniper_rail_bridge.get(), RenderType.cutout());
	}
}