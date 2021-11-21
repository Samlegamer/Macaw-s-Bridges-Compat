package fr.samlegamer.macawsbridgesbop;

import fr.samlegamer.macawsbridgesbop.blocks.MBBOPBlocksRegistry;
import fr.samlegamer.macawsbridgesbop.items.MBBOPItemsRegistry;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.RenderTypeLookup;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(value = MacawsBridgeBOP.MODID)
@Mod.EventBusSubscriber(modid = MacawsBridgeBOP.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class MacawsBridgeBOP
{
	public static final String MODID = "macawsbridgesbop";
		
	public MacawsBridgeBOP()
	{
		FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
		FMLJavaModLoadingContext.get().getModEventBus().addListener(this::ClientSetup);
				
		IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
		MBBOPBlocksRegistry.BLOCKS_REGISTRY.register(bus);
		MBBOPItemsRegistry.ITEMS_REGISTRY.register(bus);
	}
	
	private void setup(FMLCommonSetupEvent event)
	{
		
	}
	
	private void ClientSetup(FMLClientSetupEvent event)
	{
		RenderTypeLookup.setRenderLayer(MBBOPBlocksRegistry.CHERRY_LOG_BRIDGE_MIDDLE.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBBOPBlocksRegistry.DEAD_LOG_BRIDGE_MIDDLE.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBBOPBlocksRegistry.FIR_LOG_BRIDGE_MIDDLE.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBBOPBlocksRegistry.HELLBARK_LOG_BRIDGE_MIDDLE.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBBOPBlocksRegistry.JACARANDA_LOG_BRIDGE_MIDDLE.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBBOPBlocksRegistry.MAGIC_LOG_BRIDGE_MIDDLE.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBBOPBlocksRegistry.MAHOGANY_LOG_BRIDGE_MIDDLE.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBBOPBlocksRegistry.PALM_LOG_BRIDGE_MIDDLE.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBBOPBlocksRegistry.REDWOOD_LOG_BRIDGE_MIDDLE.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBBOPBlocksRegistry.UMBRAN_LOG_BRIDGE_MIDDLE.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBBOPBlocksRegistry.WILLOW_LOG_BRIDGE_MIDDLE.get(), RenderType.cutout());
		
		RenderTypeLookup.setRenderLayer(MBBOPBlocksRegistry.ORANGE_SANDSTONE_BRIDGE_MIDDLE.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBBOPBlocksRegistry.WHITE_SANDSTONE_BRIDGE_MIDDLE.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBBOPBlocksRegistry.BLACK_SANDSTONE_BRIDGE_MIDDLE.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBBOPBlocksRegistry.MUD_BRICK_BRIDGE_MIDDLE.get(), RenderType.cutout());
		
		RenderTypeLookup.setRenderLayer(MBBOPBlocksRegistry.CHERRY_LOG_ROPE_BRIDGE_MIDDLE.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBBOPBlocksRegistry.DEAD_LOG_ROPE_BRIDGE_MIDDLE.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBBOPBlocksRegistry.FIR_LOG_ROPE_BRIDGE_MIDDLE.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBBOPBlocksRegistry.HELLBARK_ROPE_LOG_BRIDGE_MIDDLE.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBBOPBlocksRegistry.JACARANDA_ROPE_LOG_BRIDGE_MIDDLE.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBBOPBlocksRegistry.MAGIC_LOG_ROPE_BRIDGE_MIDDLE.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBBOPBlocksRegistry.MAHOGANY_LOG_ROPE_BRIDGE_MIDDLE.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBBOPBlocksRegistry.PALM_LOG_ROPE_BRIDGE_MIDDLE.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBBOPBlocksRegistry.REDWOOD_ROPE_LOG_BRIDGE_MIDDLE.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBBOPBlocksRegistry.UMBRAN_ROPE_LOG_BRIDGE_MIDDLE.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBBOPBlocksRegistry.WILLOW_ROPE_LOG_BRIDGE_MIDDLE.get(), RenderType.cutout());
	
     	RenderTypeLookup.setRenderLayer(MBBOPBlocksRegistry.cherry_bridge_pier.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBBOPBlocksRegistry.dead_bridge_pier.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBBOPBlocksRegistry.fir_bridge_pier.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBBOPBlocksRegistry.hellbark_bridge_pier.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBBOPBlocksRegistry.jacaranda_bridge_pier.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBBOPBlocksRegistry.magic_bridge_pier.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBBOPBlocksRegistry.mahogany_bridge_pier.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBBOPBlocksRegistry.palm_bridge_pier.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBBOPBlocksRegistry.redwood_bridge_pier.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBBOPBlocksRegistry.umbran_bridge_pier.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBBOPBlocksRegistry.willow_bridge_pier.get(), RenderType.cutout());
		
		RenderTypeLookup.setRenderLayer(MBBOPBlocksRegistry.cherry_log_bridge_stair.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBBOPBlocksRegistry.dead_log_bridge_stair.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBBOPBlocksRegistry.fir_log_bridge_stair.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBBOPBlocksRegistry.hellbark_log_bridge_stair.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBBOPBlocksRegistry.jacaranda_log_bridge_stair.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBBOPBlocksRegistry.magic_log_bridge_stair.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBBOPBlocksRegistry.mahogany_log_bridge_stair.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBBOPBlocksRegistry.palm_log_bridge_stair.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBBOPBlocksRegistry.redwood_log_bridge_stair.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBBOPBlocksRegistry.umbran_log_bridge_stair.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBBOPBlocksRegistry.willow_log_bridge_stair.get(), RenderType.cutout());
		
		RenderTypeLookup.setRenderLayer(MBBOPBlocksRegistry.cherry_rail_bridge.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBBOPBlocksRegistry.dead_rail_bridge.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBBOPBlocksRegistry.fir_rail_bridge.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBBOPBlocksRegistry.hellbark_rail_bridge.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBBOPBlocksRegistry.jacaranda_rail_bridge.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBBOPBlocksRegistry.magic_rail_bridge.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBBOPBlocksRegistry.mahogany_rail_bridge.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBBOPBlocksRegistry.palm_rail_bridge.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBBOPBlocksRegistry.redwood_rail_bridge.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBBOPBlocksRegistry.umbran_rail_bridge.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBBOPBlocksRegistry.willow_rail_bridge.get(), RenderType.cutout());
	}
}