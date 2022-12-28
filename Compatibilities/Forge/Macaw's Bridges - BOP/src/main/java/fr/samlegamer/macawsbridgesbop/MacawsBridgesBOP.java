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
        MBBOPBlocksRegistry.registry();
        LOGGER.info("Macaw's Bridges - Biome O' Plenty : Is Charged");
    }
	
	private void ClientSetup(FMLClientSetupEvent event)
	{
		ItemBlockRenderTypes.setRenderLayer(MBBOPBlocksRegistry.LogBridgesAll.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MBBOPBlocksRegistry.RopeBridgesAll.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MBBOPBlocksRegistry.PierBridgesAll.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MBBOPBlocksRegistry.StairBridgesAll.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MBBOPBlocksRegistry.RailBridgesAll.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MBBOPBlocksRegistry.RopeStairBridgesAll.get(), RenderType.cutout());
	}
}