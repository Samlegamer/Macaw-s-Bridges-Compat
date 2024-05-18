package fr.samlegamer.macawsbridgesbop;

import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import fr.samlegamer.macawsbridgesbop.block.MBBOPBlocksRegistry;

@Mod(MacawsBridgesBOP.MODID)
@Mod.EventBusSubscriber(modid = MacawsBridgesBOP.MODID, bus=Mod.EventBusSubscriber.Bus.MOD)
public class MacawsBridgesBOP
{
	public static final String MODID = "macawsbridgesbop";
    private static final Logger LOGGER = LogManager.getLogger();

    public MacawsBridgesBOP()
    {
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::ClientSetup);
        
        LOGGER.info("Macaw's Bridges - Biome O' Plenty : Loading ...");
		IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
		MBBOPBlocksRegistry.ITEMS_REGISTRY.register(bus);
        MBBOPBlocksRegistry.BLOCKS_REGISTRY.register(bus);
        LOGGER.info("Macaw's Bridges - Biome O' Plenty : Is Charged");
    }
	
	private void ClientSetup(FMLClientSetupEvent event)
	{
		ItemBlockRenderTypes.setRenderLayer(MBBOPBlocksRegistry.cherry_log_bridge_middle.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MBBOPBlocksRegistry.dead_log_bridge_middle.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MBBOPBlocksRegistry.fir_log_bridge_middle.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MBBOPBlocksRegistry.hellbark_log_bridge_middle.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MBBOPBlocksRegistry.jacaranda_log_bridge_middle.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MBBOPBlocksRegistry.magic_log_bridge_middle.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MBBOPBlocksRegistry.mahogany_log_bridge_middle.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MBBOPBlocksRegistry.palm_log_bridge_middle.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MBBOPBlocksRegistry.redwood_log_bridge_middle.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MBBOPBlocksRegistry.umbran_log_bridge_middle.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MBBOPBlocksRegistry.willow_log_bridge_middle.get(), RenderType.cutout());
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
		ItemBlockRenderTypes.setRenderLayer(MBBOPBlocksRegistry.rope_cherry_bridge.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MBBOPBlocksRegistry.rope_dead_bridge.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MBBOPBlocksRegistry.rope_fir_bridge.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MBBOPBlocksRegistry.rope_hellbark_bridge.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MBBOPBlocksRegistry.rope_jacaranda_bridge.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MBBOPBlocksRegistry.rope_magic_bridge.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MBBOPBlocksRegistry.rope_mahogany_bridge.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MBBOPBlocksRegistry.rope_palm_bridge.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MBBOPBlocksRegistry.rope_redwood_bridge.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MBBOPBlocksRegistry.rope_umbran_bridge.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MBBOPBlocksRegistry.rope_willow_bridge.get(), RenderType.cutout());
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
		ItemBlockRenderTypes.setRenderLayer(MBBOPBlocksRegistry.cherry_rope_bridge_stair.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MBBOPBlocksRegistry.dead_rope_bridge_stair.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MBBOPBlocksRegistry.fir_rope_bridge_stair.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MBBOPBlocksRegistry.hellbark_rope_bridge_stair.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MBBOPBlocksRegistry.jacaranda_rope_bridge_stair.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MBBOPBlocksRegistry.magic_rope_bridge_stair.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MBBOPBlocksRegistry.mahogany_rope_bridge_stair.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MBBOPBlocksRegistry.palm_rope_bridge_stair.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MBBOPBlocksRegistry.redwood_rope_bridge_stair.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MBBOPBlocksRegistry.umbran_rope_bridge_stair.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MBBOPBlocksRegistry.willow_rope_bridge_stair.get(), RenderType.cutout());

	}
	
}