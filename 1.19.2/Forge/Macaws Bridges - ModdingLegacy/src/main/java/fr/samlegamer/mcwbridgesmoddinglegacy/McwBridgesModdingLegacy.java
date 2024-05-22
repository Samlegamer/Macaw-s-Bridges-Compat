package fr.samlegamer.mcwbridgesmoddinglegacy;

import java.util.Random;
import com.mcwbridges.kikoz.init.BlockInit;
import fr.samlegamer.mcwbridgesmoddinglegacy.block.MBMLBlockRegistry;
import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.ModList;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(value = McwBridgesModdingLegacy.MODID)
@Mod.EventBusSubscriber(modid = McwBridgesModdingLegacy.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class McwBridgesModdingLegacy
{
	public static final String MODID = "mcwbridgesmoddinglegacy";
	public static final Tab CMT = new Tab("bridgesmoddinglegacy_tab");
	
	public McwBridgesModdingLegacy()
	{
		FMLJavaModLoadingContext.get().getModEventBus().addListener(this::ClientSetup);
		
		IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
		MBMLBlockRegistry.BLOCKS_REGISTRY.register(bus);
		MBMLBlockRegistry.ITEMS_REGISTRY.register(bus);
	}
	
	private void ClientSetup(FMLClientSetupEvent event)
	{
		ItemBlockRenderTypes.setRenderLayer(MBMLBlockRegistry.bsky_bluebright_log_bridge_middle.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MBMLBlockRegistry.bsky_cherry_log_bridge_middle.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MBMLBlockRegistry.bsky_crystallized_log_bridge_middle.get(), RenderType.translucent());
		ItemBlockRenderTypes.setRenderLayer(MBMLBlockRegistry.bsky_dusk_log_bridge_middle.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MBMLBlockRegistry.bsky_frostbright_log_bridge_middle.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MBMLBlockRegistry.bsky_lunar_log_bridge_middle.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MBMLBlockRegistry.bsky_maple_log_bridge_middle.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MBMLBlockRegistry.bsky_starlit_log_bridge_middle.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MBMLBlockRegistry.bsky_bluebright_bridge_pier.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MBMLBlockRegistry.bsky_cherry_bridge_pier.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MBMLBlockRegistry.bsky_crystallized_bridge_pier.get(), RenderType.translucent());
		ItemBlockRenderTypes.setRenderLayer(MBMLBlockRegistry.bsky_dusk_bridge_pier.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MBMLBlockRegistry.bsky_frostbright_bridge_pier.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MBMLBlockRegistry.bsky_lunar_bridge_pier.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MBMLBlockRegistry.bsky_maple_bridge_pier.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MBMLBlockRegistry.bsky_starlit_bridge_pier.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MBMLBlockRegistry.bsky_bluebright_rail_bridge.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MBMLBlockRegistry.bsky_cherry_rail_bridge.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MBMLBlockRegistry.bsky_crystallized_rail_bridge.get(), RenderType.translucent());
		ItemBlockRenderTypes.setRenderLayer(MBMLBlockRegistry.bsky_dusk_rail_bridge.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MBMLBlockRegistry.bsky_frostbright_rail_bridge.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MBMLBlockRegistry.bsky_lunar_rail_bridge.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MBMLBlockRegistry.bsky_maple_rail_bridge.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MBMLBlockRegistry.bsky_starlit_rail_bridge.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MBMLBlockRegistry.rope_bsky_bluebright_bridge.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MBMLBlockRegistry.rope_bsky_cherry_bridge.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MBMLBlockRegistry.rope_bsky_crystallized_bridge.get(), RenderType.translucent());
		ItemBlockRenderTypes.setRenderLayer(MBMLBlockRegistry.rope_bsky_dusk_bridge.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MBMLBlockRegistry.rope_bsky_frostbright_bridge.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MBMLBlockRegistry.rope_bsky_lunar_bridge.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MBMLBlockRegistry.rope_bsky_maple_bridge.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MBMLBlockRegistry.rope_bsky_starlit_bridge.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MBMLBlockRegistry.bsky_bluebright_rope_bridge_stair.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MBMLBlockRegistry.bsky_cherry_rope_bridge_stair.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MBMLBlockRegistry.bsky_crystallized_rope_bridge_stair.get(), RenderType.translucent());
		ItemBlockRenderTypes.setRenderLayer(MBMLBlockRegistry.bsky_dusk_rope_bridge_stair.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MBMLBlockRegistry.bsky_frostbright_rope_bridge_stair.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MBMLBlockRegistry.bsky_lunar_rope_bridge_stair.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MBMLBlockRegistry.bsky_maple_rope_bridge_stair.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MBMLBlockRegistry.bsky_starlit_rope_bridge_stair.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MBMLBlockRegistry.bsky_bluebright_log_bridge_stair.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MBMLBlockRegistry.bsky_cherry_log_bridge_stair.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MBMLBlockRegistry.bsky_crystallized_log_bridge_stair.get(), RenderType.translucent());
		ItemBlockRenderTypes.setRenderLayer(MBMLBlockRegistry.bsky_dusk_log_bridge_stair.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MBMLBlockRegistry.bsky_frostbright_log_bridge_stair.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MBMLBlockRegistry.bsky_lunar_log_bridge_stair.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MBMLBlockRegistry.bsky_maple_log_bridge_stair.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MBMLBlockRegistry.bsky_starlit_log_bridge_stair.get(), RenderType.cutout());
	}
	
	static class Tab extends CreativeModeTab
	{
		public Tab(String label) { super(label); }
		
		@Override
		public ItemStack makeIcon()
		{
			ItemStack itmSky = new ItemStack(MBMLBlockRegistry.bsky_bluebright_log_bridge_middle.get());
			ItemStack itmPwood = new ItemStack(MBMLBlockRegistry.pwood_purple_heart_log_bridge_middle.get());
			ItemStack itmNone = new ItemStack(BlockInit.OAK_LOG_BRIDGE_MIDDLE.get());
			ItemStack itm = itmNone;
			
			if(ModList.get().isLoaded("premium_wood") && !ModList.get().isLoaded("blue_skies"))
			{
				itm = itmPwood;
			}

			if(ModList.get().isLoaded("blue_skies") && !ModList.get().isLoaded("premium_wood"))
			{
				itm = itmSky;
			}

			if(ModList.get().isLoaded("blue_skies") && ModList.get().isLoaded("premium_wood"))
			{
				Random rnd = new Random();
				int i;
				i = rnd.nextInt(1);
				switch(i)
				{
				case 0:
					itm = itmSky;
					break;
				case 1:
					itm = itmPwood;
					break;
				}
			}
			return itm;
		}
	}
}