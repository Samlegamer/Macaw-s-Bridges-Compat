package fr.samlegamer.macawsbridgesbop;

import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import fr.samlegamer.macawsbridgesbop.block.MBBOPBlocksRegistry;
import fr.samlegamer.macawsbridgesbop.item.MBBOPItemsRegistry;

@Mod(MacawsBridgesBOP.MODID)
@Mod.EventBusSubscriber(modid = MacawsBridgesBOP.MODID, bus=Mod.EventBusSubscriber.Bus.MOD)
public class MacawsBridgesBOP
{
	public static final String MODID = "macawsbridgesbop";
	
    private static final Logger LOGGER = LogManager.getLogger();

    public MacawsBridgesBOP()
    {
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::ClientSetup);
        
        LOGGER.info("Macaw's Bridges - Biome O' Plenty : Loading ...");
		IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
        MBBOPItemsRegistry.ITEMS_REGISTRY.register(bus);
        MBBOPBlocksRegistry.BLOCKS_REGISTRY.register(bus);
        LOGGER.info("Macaw's Bridges - Biome O' Plenty : Is Charged");
    }
    
	private void setup(FMLCommonSetupEvent event)
	{
		
	}
	
	private void ClientSetup(FMLClientSetupEvent event)
	{
		ItemBlockRenderTypes.setRenderLayer(MBBOPBlocksRegistry.CHERRY_LOG_BRIDGE_MIDDLE.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MBBOPBlocksRegistry.DEAD_LOG_BRIDGE_MIDDLE.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MBBOPBlocksRegistry.FIR_LOG_BRIDGE_MIDDLE.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MBBOPBlocksRegistry.HELLBARK_LOG_BRIDGE_MIDDLE.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MBBOPBlocksRegistry.JACARANDA_LOG_BRIDGE_MIDDLE.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MBBOPBlocksRegistry.MAGIC_LOG_BRIDGE_MIDDLE.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MBBOPBlocksRegistry.MAHOGANY_LOG_BRIDGE_MIDDLE.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MBBOPBlocksRegistry.PALM_LOG_BRIDGE_MIDDLE.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MBBOPBlocksRegistry.REDWOOD_LOG_BRIDGE_MIDDLE.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MBBOPBlocksRegistry.UMBRAN_LOG_BRIDGE_MIDDLE.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MBBOPBlocksRegistry.WILLOW_LOG_BRIDGE_MIDDLE.get(), RenderType.cutout());
		
		ItemBlockRenderTypes.setRenderLayer(MBBOPBlocksRegistry.ORANGE_SANDSTONE_BRIDGE_MIDDLE.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MBBOPBlocksRegistry.WHITE_SANDSTONE_BRIDGE_MIDDLE.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MBBOPBlocksRegistry.BLACK_SANDSTONE_BRIDGE_MIDDLE.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MBBOPBlocksRegistry.MUD_BRICK_BRIDGE_MIDDLE.get(), RenderType.cutout());
		
		ItemBlockRenderTypes.setRenderLayer(MBBOPBlocksRegistry.CHERRY_LOG_ROPE_BRIDGE_MIDDLE.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MBBOPBlocksRegistry.DEAD_LOG_ROPE_BRIDGE_MIDDLE.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MBBOPBlocksRegistry.FIR_LOG_ROPE_BRIDGE_MIDDLE.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MBBOPBlocksRegistry.HELLBARK_ROPE_LOG_BRIDGE_MIDDLE.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MBBOPBlocksRegistry.JACARANDA_ROPE_LOG_BRIDGE_MIDDLE.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MBBOPBlocksRegistry.MAGIC_LOG_ROPE_BRIDGE_MIDDLE.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MBBOPBlocksRegistry.MAHOGANY_LOG_ROPE_BRIDGE_MIDDLE.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MBBOPBlocksRegistry.PALM_LOG_ROPE_BRIDGE_MIDDLE.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MBBOPBlocksRegistry.REDWOOD_ROPE_LOG_BRIDGE_MIDDLE.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MBBOPBlocksRegistry.UMBRAN_ROPE_LOG_BRIDGE_MIDDLE.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MBBOPBlocksRegistry.WILLOW_ROPE_LOG_BRIDGE_MIDDLE.get(), RenderType.cutout());
	
     	ItemBlockRenderTypes.setRenderLayer(MBBOPBlocksRegistry.cherry_bridge_pier.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MBBOPBlocksRegistry.dead_bridge_pier.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MBBOPBlocksRegistry.fir_bridge_pier.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MBBOPBlocksRegistry.hellbark_bridge_pier.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MBBOPBlocksRegistry.jacaranda_bridge_pier.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MBBOPBlocksRegistry.magic_bridge_pier.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MBBOPBlocksRegistry.mahogany_bridge_pier.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MBBOPBlocksRegistry.palm_bridge_pier.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MBBOPBlocksRegistry.redwood_bridge_pier.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MBBOPBlocksRegistry.umbran_bridge_pier.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MBBOPBlocksRegistry.willow_bridge_pier.get(), RenderType.cutout());
		
		ItemBlockRenderTypes.setRenderLayer(MBBOPBlocksRegistry.cherry_log_bridge_stair.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MBBOPBlocksRegistry.dead_log_bridge_stair.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MBBOPBlocksRegistry.fir_log_bridge_stair.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MBBOPBlocksRegistry.hellbark_log_bridge_stair.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MBBOPBlocksRegistry.jacaranda_log_bridge_stair.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MBBOPBlocksRegistry.magic_log_bridge_stair.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MBBOPBlocksRegistry.mahogany_log_bridge_stair.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MBBOPBlocksRegistry.palm_log_bridge_stair.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MBBOPBlocksRegistry.redwood_log_bridge_stair.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MBBOPBlocksRegistry.umbran_log_bridge_stair.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MBBOPBlocksRegistry.willow_log_bridge_stair.get(), RenderType.cutout());
		
		ItemBlockRenderTypes.setRenderLayer(MBBOPBlocksRegistry.cherry_rail_bridge.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MBBOPBlocksRegistry.dead_rail_bridge.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MBBOPBlocksRegistry.fir_rail_bridge.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MBBOPBlocksRegistry.hellbark_rail_bridge.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MBBOPBlocksRegistry.jacaranda_rail_bridge.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MBBOPBlocksRegistry.magic_rail_bridge.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MBBOPBlocksRegistry.mahogany_rail_bridge.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MBBOPBlocksRegistry.palm_rail_bridge.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MBBOPBlocksRegistry.redwood_rail_bridge.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MBBOPBlocksRegistry.umbran_rail_bridge.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MBBOPBlocksRegistry.willow_rail_bridge.get(), RenderType.cutout());
	}
}