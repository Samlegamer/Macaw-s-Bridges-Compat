package fr.samlegamer.mcwbridgesmoddinglegacy;

import java.util.Random;
import com.mcwbridges.kikoz.init.BlockInit;
import fr.samlegamer.mcwbridgesmoddinglegacy.block.MBMLBlockRegistry;
import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.event.CreativeModeTabEvent;
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
	private static CreativeModeTab MB_ML;
	
	public McwBridgesModdingLegacy()
	{
		FMLJavaModLoadingContext.get().getModEventBus().addListener(this::ClientSetup);
		FMLJavaModLoadingContext.get().getModEventBus().addListener(this::CreateTab);
		FMLJavaModLoadingContext.get().getModEventBus().addListener(this::AddTab);
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

		ItemBlockRenderTypes.setRenderLayer(MBMLBlockRegistry.pwood_magic_log_bridge_middle.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MBMLBlockRegistry.pwood_magic_rope_bridge_stair.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MBMLBlockRegistry.rope_pwood_magic_bridge.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MBMLBlockRegistry.pwood_magic_bridge_pier.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MBMLBlockRegistry.pwood_magic_log_bridge_stair.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MBMLBlockRegistry.pwood_magic_rail_bridge.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MBMLBlockRegistry.pwood_maple_log_bridge_middle.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MBMLBlockRegistry.pwood_maple_rope_bridge_stair.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MBMLBlockRegistry.rope_pwood_maple_bridge.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MBMLBlockRegistry.pwood_maple_bridge_pier.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MBMLBlockRegistry.pwood_maple_log_bridge_stair.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MBMLBlockRegistry.pwood_maple_rail_bridge.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MBMLBlockRegistry.pwood_purple_heart_log_bridge_middle.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MBMLBlockRegistry.pwood_purple_heart_rope_bridge_stair.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MBMLBlockRegistry.rope_pwood_purple_heart_bridge.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MBMLBlockRegistry.pwood_purple_heart_bridge_pier.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MBMLBlockRegistry.pwood_purple_heart_log_bridge_stair.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MBMLBlockRegistry.pwood_purple_heart_rail_bridge.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MBMLBlockRegistry.pwood_silverbell_log_bridge_middle.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MBMLBlockRegistry.pwood_silverbell_rope_bridge_stair.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MBMLBlockRegistry.rope_pwood_silverbell_bridge.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MBMLBlockRegistry.pwood_silverbell_bridge_pier.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MBMLBlockRegistry.pwood_silverbell_log_bridge_stair.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MBMLBlockRegistry.pwood_silverbell_rail_bridge.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MBMLBlockRegistry.pwood_tiger_log_bridge_middle.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MBMLBlockRegistry.pwood_tiger_rope_bridge_stair.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MBMLBlockRegistry.rope_pwood_tiger_bridge.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MBMLBlockRegistry.pwood_tiger_bridge_pier.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MBMLBlockRegistry.pwood_tiger_log_bridge_stair.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MBMLBlockRegistry.pwood_tiger_rail_bridge.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MBMLBlockRegistry.pwood_willow_log_bridge_middle.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MBMLBlockRegistry.pwood_willow_rope_bridge_stair.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MBMLBlockRegistry.rope_pwood_willow_bridge.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MBMLBlockRegistry.pwood_willow_bridge_pier.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MBMLBlockRegistry.pwood_willow_log_bridge_stair.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MBMLBlockRegistry.pwood_willow_rail_bridge.get(), RenderType.cutout());
	}
	
	private void CreateTab(CreativeModeTabEvent.Register event)
    {
		MB_ML = event.registerCreativeModeTab(new ResourceLocation("bridgesmoddinglegacy_tab"), builder -> builder
        .icon(() -> setVisual())
        .title(Component.literal("Macaw's Bridges - Modding Legacy")));
    }
	
	private void AddTab(CreativeModeTabEvent.BuildContents event)
    {
    	 if (event.getTab() == MB_ML)
    	 {
    		 if(ModList.get().isLoaded("blue_skies"))
    		 {
	    		 event.accept(MBMLBlockRegistry.bsky_bluebright_log_bridge_middle.get());
	
	    		 event.accept(MBMLBlockRegistry.rope_bsky_bluebright_bridge.get());
	
	    		 event.accept(MBMLBlockRegistry.bsky_bluebright_bridge_pier.get());
	
	    		 event.accept(MBMLBlockRegistry.bsky_bluebright_log_bridge_stair.get());
	
	    		 event.accept(MBMLBlockRegistry.bsky_bluebright_rope_bridge_stair.get());
	
	    		 event.accept(MBMLBlockRegistry.bsky_bluebright_rail_bridge.get());
	
	    		 event.accept(MBMLBlockRegistry.bsky_cherry_log_bridge_middle.get());
	
	    		 event.accept(MBMLBlockRegistry.rope_bsky_cherry_bridge.get());
	
	    		 event.accept(MBMLBlockRegistry.bsky_cherry_bridge_pier.get());
	
	    		 event.accept(MBMLBlockRegistry.bsky_cherry_log_bridge_stair.get());
	
	    		 event.accept(MBMLBlockRegistry.bsky_cherry_rope_bridge_stair.get());
	
	    		 event.accept(MBMLBlockRegistry.bsky_cherry_rail_bridge.get());
	
	    		 event.accept(MBMLBlockRegistry.bsky_crystallized_log_bridge_middle.get());
	
	    		 event.accept(MBMLBlockRegistry.rope_bsky_crystallized_bridge.get());
	
	    		 event.accept(MBMLBlockRegistry.bsky_crystallized_bridge_pier.get());
	
	    		 event.accept(MBMLBlockRegistry.bsky_crystallized_log_bridge_stair.get());
	
	    		 event.accept(MBMLBlockRegistry.bsky_crystallized_rope_bridge_stair.get());
	
	    		 event.accept(MBMLBlockRegistry.bsky_crystallized_rail_bridge.get());
	
	    		 event.accept(MBMLBlockRegistry.bsky_dusk_log_bridge_middle.get());
	
	    		 event.accept(MBMLBlockRegistry.rope_bsky_dusk_bridge.get());
	
	    		 event.accept(MBMLBlockRegistry.bsky_dusk_bridge_pier.get());
	
	    		 event.accept(MBMLBlockRegistry.bsky_dusk_log_bridge_stair.get());
	
	    		 event.accept(MBMLBlockRegistry.bsky_dusk_rope_bridge_stair.get());
	
	    		 event.accept(MBMLBlockRegistry.bsky_dusk_rail_bridge.get());
	
	    		 event.accept(MBMLBlockRegistry.bsky_frostbright_log_bridge_middle.get());
	
	    		 event.accept(MBMLBlockRegistry.rope_bsky_frostbright_bridge.get());
	
	    		 event.accept(MBMLBlockRegistry.bsky_frostbright_bridge_pier.get());
	
	    		 event.accept(MBMLBlockRegistry.bsky_frostbright_log_bridge_stair.get());
	
	    		 event.accept(MBMLBlockRegistry.bsky_frostbright_rope_bridge_stair.get());
	
	    		 event.accept(MBMLBlockRegistry.bsky_frostbright_rail_bridge.get());
	
	    		 event.accept(MBMLBlockRegistry.bsky_lunar_log_bridge_middle.get());
	
	    		 event.accept(MBMLBlockRegistry.rope_bsky_lunar_bridge.get());
	
	    		 event.accept(MBMLBlockRegistry.bsky_lunar_bridge_pier.get());
	
	    		 event.accept(MBMLBlockRegistry.bsky_lunar_log_bridge_stair.get());
	
	    		 event.accept(MBMLBlockRegistry.bsky_lunar_rope_bridge_stair.get());
	
	    		 event.accept(MBMLBlockRegistry.bsky_lunar_rail_bridge.get());
	
	    		 event.accept(MBMLBlockRegistry.bsky_maple_log_bridge_middle.get());
	
	    		 event.accept(MBMLBlockRegistry.rope_bsky_maple_bridge.get());
	
	    		 event.accept(MBMLBlockRegistry.bsky_maple_bridge_pier.get());
	
	    		 event.accept(MBMLBlockRegistry.bsky_maple_log_bridge_stair.get());
	
	    		 event.accept(MBMLBlockRegistry.bsky_maple_rope_bridge_stair.get());
	
	    		 event.accept(MBMLBlockRegistry.bsky_maple_rail_bridge.get());
	
	    		 event.accept(MBMLBlockRegistry.bsky_starlit_log_bridge_middle.get());
	
	    		 event.accept(MBMLBlockRegistry.rope_bsky_starlit_bridge.get());
	
	    		 event.accept(MBMLBlockRegistry.bsky_starlit_bridge_pier.get());
	
	    		 event.accept(MBMLBlockRegistry.bsky_starlit_log_bridge_stair.get());
	
	    		 event.accept(MBMLBlockRegistry.bsky_starlit_rope_bridge_stair.get());
	
	    		 event.accept(MBMLBlockRegistry.bsky_starlit_rail_bridge.get());
    		 }
    		 
    		 if(ModList.get().isLoaded("premium_wood"))
    		 {
	    		 event.accept(MBMLBlockRegistry.pwood_magic_log_bridge_middle.get());
	
	    		 event.accept(MBMLBlockRegistry.rope_pwood_magic_bridge.get());
	
	    		 event.accept(MBMLBlockRegistry.pwood_magic_bridge_pier.get());
	
	    		 event.accept(MBMLBlockRegistry.pwood_magic_log_bridge_stair.get());
	
	    		 event.accept(MBMLBlockRegistry.pwood_magic_rope_bridge_stair.get());
	
	    		 event.accept(MBMLBlockRegistry.pwood_magic_rail_bridge.get());
	
	    		 event.accept(MBMLBlockRegistry.pwood_maple_log_bridge_middle.get());
	
	    		 event.accept(MBMLBlockRegistry.rope_pwood_maple_bridge.get());
	
	    		 event.accept(MBMLBlockRegistry.pwood_maple_bridge_pier.get());
	
	    		 event.accept(MBMLBlockRegistry.pwood_maple_log_bridge_stair.get());
	
	    		 event.accept(MBMLBlockRegistry.pwood_maple_rope_bridge_stair.get());
	
	    		 event.accept(MBMLBlockRegistry.pwood_maple_rail_bridge.get());
	
	    		 event.accept(MBMLBlockRegistry.pwood_purple_heart_log_bridge_middle.get());
	
	    		 event.accept(MBMLBlockRegistry.rope_pwood_purple_heart_bridge.get());
	
	    		 event.accept(MBMLBlockRegistry.pwood_purple_heart_bridge_pier.get());
	
	    		 event.accept(MBMLBlockRegistry.pwood_purple_heart_log_bridge_stair.get());
	
	    		 event.accept(MBMLBlockRegistry.pwood_purple_heart_rope_bridge_stair.get());
	
	    		 event.accept(MBMLBlockRegistry.pwood_purple_heart_rail_bridge.get());
	
	    		 event.accept(MBMLBlockRegistry.pwood_silverbell_log_bridge_middle.get());
	
	    		 event.accept(MBMLBlockRegistry.rope_pwood_silverbell_bridge.get());
	
	    		 event.accept(MBMLBlockRegistry.pwood_silverbell_bridge_pier.get());
	
	    		 event.accept(MBMLBlockRegistry.pwood_silverbell_log_bridge_stair.get());
	
	    		 event.accept(MBMLBlockRegistry.pwood_silverbell_rope_bridge_stair.get());
	
	    		 event.accept(MBMLBlockRegistry.pwood_silverbell_rail_bridge.get());
	
	    		 event.accept(MBMLBlockRegistry.pwood_tiger_log_bridge_middle.get());
	
	    		 event.accept(MBMLBlockRegistry.rope_pwood_tiger_bridge.get());
	
	    		 event.accept(MBMLBlockRegistry.pwood_tiger_bridge_pier.get());
	
	    		 event.accept(MBMLBlockRegistry.pwood_tiger_log_bridge_stair.get());
	
	    		 event.accept(MBMLBlockRegistry.pwood_tiger_rope_bridge_stair.get());
	
	    		 event.accept(MBMLBlockRegistry.pwood_tiger_rail_bridge.get());
	
	    		 event.accept(MBMLBlockRegistry.pwood_willow_log_bridge_middle.get());
	
	    		 event.accept(MBMLBlockRegistry.rope_pwood_willow_bridge.get());
	
	    		 event.accept(MBMLBlockRegistry.pwood_willow_bridge_pier.get());
	
	    		 event.accept(MBMLBlockRegistry.pwood_willow_log_bridge_stair.get());
	
	    		 event.accept(MBMLBlockRegistry.pwood_willow_rope_bridge_stair.get());
	
	    		 event.accept(MBMLBlockRegistry.pwood_willow_rail_bridge.get());
	
	    		 event.accept(MBMLBlockRegistry.pwood_magic_log_bridge_middle.get());
	
	    		 event.accept(MBMLBlockRegistry.rope_pwood_magic_bridge.get());
	
	    		 event.accept(MBMLBlockRegistry.pwood_magic_bridge_pier.get());
	
	    		 event.accept(MBMLBlockRegistry.pwood_magic_log_bridge_stair.get());
	
	    		 event.accept(MBMLBlockRegistry.pwood_magic_rope_bridge_stair.get());
	
	    		 event.accept(MBMLBlockRegistry.pwood_magic_rail_bridge.get());
	
	    		 event.accept(MBMLBlockRegistry.pwood_maple_log_bridge_middle.get());
	
	    		 event.accept(MBMLBlockRegistry.rope_pwood_maple_bridge.get());
	
	    		 event.accept(MBMLBlockRegistry.pwood_maple_bridge_pier.get());
	
	    		 event.accept(MBMLBlockRegistry.pwood_maple_log_bridge_stair.get());
	
	    		 event.accept(MBMLBlockRegistry.pwood_maple_rope_bridge_stair.get());
	
	    		 event.accept(MBMLBlockRegistry.pwood_maple_rail_bridge.get());
	
	    		 event.accept(MBMLBlockRegistry.pwood_purple_heart_log_bridge_middle.get());
	
	    		 event.accept(MBMLBlockRegistry.rope_pwood_purple_heart_bridge.get());
	
	    		 event.accept(MBMLBlockRegistry.pwood_purple_heart_bridge_pier.get());
	
	    		 event.accept(MBMLBlockRegistry.pwood_purple_heart_log_bridge_stair.get());
	
	    		 event.accept(MBMLBlockRegistry.pwood_purple_heart_rope_bridge_stair.get());
	
	    		 event.accept(MBMLBlockRegistry.pwood_purple_heart_rail_bridge.get());
	
	    		 event.accept(MBMLBlockRegistry.pwood_silverbell_log_bridge_middle.get());
	
	    		 event.accept(MBMLBlockRegistry.rope_pwood_silverbell_bridge.get());
	
	    		 event.accept(MBMLBlockRegistry.pwood_silverbell_bridge_pier.get());
	
	    		 event.accept(MBMLBlockRegistry.pwood_silverbell_log_bridge_stair.get());
	
	    		 event.accept(MBMLBlockRegistry.pwood_silverbell_rope_bridge_stair.get());
	
	    		 event.accept(MBMLBlockRegistry.pwood_silverbell_rail_bridge.get());
	
	    		 event.accept(MBMLBlockRegistry.pwood_tiger_log_bridge_middle.get());
	
	    		 event.accept(MBMLBlockRegistry.rope_pwood_tiger_bridge.get());
	
	    		 event.accept(MBMLBlockRegistry.pwood_tiger_bridge_pier.get());
	
	    		 event.accept(MBMLBlockRegistry.pwood_tiger_log_bridge_stair.get());
	
	    		 event.accept(MBMLBlockRegistry.pwood_tiger_rope_bridge_stair.get());
	
	    		 event.accept(MBMLBlockRegistry.pwood_tiger_rail_bridge.get());
	
	    		 event.accept(MBMLBlockRegistry.pwood_willow_log_bridge_middle.get());
	
	    		 event.accept(MBMLBlockRegistry.rope_pwood_willow_bridge.get());
	
	    		 event.accept(MBMLBlockRegistry.pwood_willow_bridge_pier.get());
	
	    		 event.accept(MBMLBlockRegistry.pwood_willow_log_bridge_stair.get());
	
	    		 event.accept(MBMLBlockRegistry.pwood_willow_rope_bridge_stair.get());
	
	    		 event.accept(MBMLBlockRegistry.pwood_willow_rail_bridge.get());
    		 }
    	 }
    }
	
	public ItemStack setVisual()
	{
		ItemStack itmSky = new ItemStack(MBMLBlockRegistry.bsky_bluebright_log_bridge_middle.get());
		ItemStack itmPwood = new ItemStack(MBMLBlockRegistry.pwood_purple_heart_log_bridge_middle.get());
		ItemStack itm = new ItemStack(BlockInit.OAK_LOG_BRIDGE_MIDDLE.get());
		
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