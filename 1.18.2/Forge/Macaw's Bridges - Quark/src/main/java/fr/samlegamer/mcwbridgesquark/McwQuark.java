package fr.samlegamer.mcwbridgesquark;

import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import vazkii.quark.base.Quark;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import com.mcwbridges.kikoz.MacawsBridges;
import fr.samlegamer.mcwbridgesquark.block.MBQBlocksRegistry;

@Mod(McwQuark.MODID)
@Mod.EventBusSubscriber(modid = McwQuark.MODID, bus=Mod.EventBusSubscriber.Bus.MOD)
public class McwQuark
{
	public static final String MODID = "mcwbridgesquark";
	
    private static final Logger LOGGER = LogManager.getLogger();

    public McwQuark()
    {
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::ClientSetup);
        LOGGER.info("Macaw's Bridges - Quark : Loading ...");
		IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
		MBQBlocksRegistry.ITEMS_REGISTRY.register(bus);
		MBQBlocksRegistry.BLOCKS_REGISTRY.register(bus);
		MBQBlocksRegistry.registry();
        LOGGER.info("Macaw's Bridges - Quark : Is Charged");
    }
	
	private void ClientSetup(FMLClientSetupEvent event)
	{
		ItemBlockRenderTypes.setRenderLayer(MBQBlocksRegistry.BridgesAll.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MBQBlocksRegistry.PierBridgesAll.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MBQBlocksRegistry.StairBridgesAll.get(), RenderType.cutout());
	}
	
	private void require(Quark quark, MacawsBridges bridges) {}
}