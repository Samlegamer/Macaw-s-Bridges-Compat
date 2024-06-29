package fr.samlegamer.macawsbridgesplus;

import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import fr.samlegamer.macawsbridgesplus.block.MBPBlocksRegistry;

@Mod(MacawsBridgesPlus.MODID)
public class MacawsBridgesPlus
{
	public static final String MODID = "macawsbridgesplus";
	
    private static final Logger LOGGER = LogManager.getLogger();

    public MacawsBridgesPlus()
    {
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::ClientSetup);

        LOGGER.info("Macaw's Bridges + : Loading ...");
		IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
		MBPBlocksRegistry.ITEMS_REGISTRY.register(bus);
        MBPBlocksRegistry.BLOCKS_REGISTRY.register(bus);
        //Vanilla.InitWaxables();
        LOGGER.info("Macaw's Bridges + : Is Charged");
    }
    
	private void setup(FMLCommonSetupEvent event)
	{
		//Vanilla.init();
	}
	
	private void ClientSetup(FMLClientSetupEvent event)
	{
	 	ItemBlockRenderTypes.setRenderLayer(MBPBlocksRegistry.copper_bridges.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MBPBlocksRegistry.exposed_copper_bridges.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MBPBlocksRegistry.weathered_copper_bridges.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MBPBlocksRegistry.oxidized_copper_bridges.get(), RenderType.cutout());
	
		ItemBlockRenderTypes.setRenderLayer(MBPBlocksRegistry.cut_copper_bridges.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MBPBlocksRegistry.cut_exposed_copper_bridges.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MBPBlocksRegistry.cut_weathered_copper_bridges.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MBPBlocksRegistry.cut_oxidized_copper_bridges.get(), RenderType.cutout());

	 	ItemBlockRenderTypes.setRenderLayer(MBPBlocksRegistry.waxed_copper_bridges.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MBPBlocksRegistry.waxed_exposed_copper_bridges.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MBPBlocksRegistry.waxed_weathered_copper_bridges.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MBPBlocksRegistry.waxed_oxidized_copper_bridges.get(), RenderType.cutout());
	
		ItemBlockRenderTypes.setRenderLayer(MBPBlocksRegistry.waxed_cut_copper_bridges.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MBPBlocksRegistry.waxed_cut_exposed_copper_bridges.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MBPBlocksRegistry.waxed_cut_weathered_copper_bridges.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MBPBlocksRegistry.waxed_cut_oxidized_copper_bridges.get(), RenderType.cutout());
	}
}