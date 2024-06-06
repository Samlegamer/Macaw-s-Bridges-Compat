package fr.samlegamer.mcwbridgesabnormals;

import fr.samlegamer.mcwbridgesabnormals.block.MBABlocksRegistry;
import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.ModList;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(value = McwBridgesAbnormals.MODID)
@Mod.EventBusSubscriber(modid = McwBridgesAbnormals.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class McwBridgesAbnormals
{
	public static final String MODID = "mcwbridgesabnormals";
	
	public McwBridgesAbnormals()
	{
		FMLJavaModLoadingContext.get().getModEventBus().addListener(this::ClientSetup);
		FMLJavaModLoadingContext.get().getModEventBus().addListener(this::AddTab);
		IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
		MBABlocksRegistry.BLOCKS_REGISTRY.register(bus);
		MBABlocksRegistry.ITEMS_REGISTRY.register(bus);
		MBABlocksRegistry.Item_Group.register(bus);
	}
	
	private void ClientSetup(FMLClientSetupEvent event)
	{
		ItemBlockRenderTypes.setRenderLayer(MBABlocksRegistry.honeycomb_brick_bridge.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MBABlocksRegistry.honeycomb_tile_bridge.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MBABlocksRegistry.honeycomb_brick_bridge_stair.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MBABlocksRegistry.honeycomb_tile_bridge_stair.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MBABlocksRegistry.honeycomb_tile_bridge_pier.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MBABlocksRegistry.honeycomb_brick_bridge_pier.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MBABlocksRegistry.red_arid_sandstone_bridge.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MBABlocksRegistry.arid_sandstone_bridge.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MBABlocksRegistry.red_arid_sandstone_bridge_stair.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MBABlocksRegistry.arid_sandstone_bridge_pier.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MBABlocksRegistry.red_arid_sandstone_bridge_pier.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MBABlocksRegistry.arid_sandstone_bridge_stair.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MBABlocksRegistry.maple_log_bridge_middle.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MBABlocksRegistry.maple_bridge_pier.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MBABlocksRegistry.maple_log_bridge_stair.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MBABlocksRegistry.maple_rail_bridge.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MBABlocksRegistry.rope_maple_bridge.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MBABlocksRegistry.maple_rope_bridge_stair.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MBABlocksRegistry.snail_shell_bricks_bridge.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MBABlocksRegistry.snail_shell_bricks_bridge_pier.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MBABlocksRegistry.snail_shell_bricks_bridge_stair.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MBABlocksRegistry.snail_shell_tiles_bridge.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MBABlocksRegistry.snail_shell_tiles_bridge_pier.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MBABlocksRegistry.snail_shell_tiles_bridge_stair.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MBABlocksRegistry.cherry_log_bridge_middle.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MBABlocksRegistry.wisteria_log_bridge_middle.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MBABlocksRegistry.willow_log_bridge_middle.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MBABlocksRegistry.cherry_bridge_pier.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MBABlocksRegistry.wisteria_bridge_pier.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MBABlocksRegistry.willow_bridge_pier.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MBABlocksRegistry.cherry_rail_bridge.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MBABlocksRegistry.wisteria_rail_bridge.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MBABlocksRegistry.willow_rail_bridge.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MBABlocksRegistry.rope_cherry_bridge.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MBABlocksRegistry.rope_wisteria_bridge.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MBABlocksRegistry.rope_willow_bridge.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MBABlocksRegistry.cherry_log_bridge_stair.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MBABlocksRegistry.wisteria_log_bridge_stair.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MBABlocksRegistry.willow_log_bridge_stair.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MBABlocksRegistry.driftwood_log_bridge_middle.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MBABlocksRegistry.river_log_bridge_middle.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MBABlocksRegistry.driftwood_bridge_pier.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MBABlocksRegistry.river_bridge_pier.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MBABlocksRegistry.driftwood_rail_bridge.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MBABlocksRegistry.river_rail_bridge.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MBABlocksRegistry.rope_driftwood_bridge.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MBABlocksRegistry.rope_river_bridge.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MBABlocksRegistry.driftwood_log_bridge_stair.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MBABlocksRegistry.river_log_bridge_stair.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MBABlocksRegistry.poise_log_bridge_middle.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MBABlocksRegistry.rope_poise_bridge.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MBABlocksRegistry.poise_log_bridge_stair.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MBABlocksRegistry.poise_rail_bridge.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MBABlocksRegistry.poise_rope_bridge_stair.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MBABlocksRegistry.aspen_log_bridge_middle.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MBABlocksRegistry.grimwood_log_bridge_middle.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MBABlocksRegistry.kousa_log_bridge_middle.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MBABlocksRegistry.morado_log_bridge_middle.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MBABlocksRegistry.rosewood_log_bridge_middle.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MBABlocksRegistry.yucca_log_bridge_middle.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MBABlocksRegistry.rope_aspen_bridge.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MBABlocksRegistry.rope_grimwood_bridge.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MBABlocksRegistry.rope_kousa_bridge.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MBABlocksRegistry.rope_morado_bridge.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MBABlocksRegistry.rope_rosewood_bridge.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MBABlocksRegistry.rope_yucca_bridge.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MBABlocksRegistry.aspen_bridge_pier.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MBABlocksRegistry.grimwood_bridge_pier.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MBABlocksRegistry.kousa_bridge_pier.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MBABlocksRegistry.morado_bridge_pier.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MBABlocksRegistry.rosewood_bridge_pier.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MBABlocksRegistry.yucca_bridge_pier.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MBABlocksRegistry.aspen_log_bridge_stair.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MBABlocksRegistry.grimwood_log_bridge_stair.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MBABlocksRegistry.kousa_log_bridge_stair.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MBABlocksRegistry.morado_log_bridge_stair.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MBABlocksRegistry.rosewood_log_bridge_stair.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MBABlocksRegistry.yucca_log_bridge_stair.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MBABlocksRegistry.aspen_rope_bridge_stair.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MBABlocksRegistry.grimwood_rope_bridge_stair.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MBABlocksRegistry.kousa_rope_bridge_stair.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MBABlocksRegistry.morado_rope_bridge_stair.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MBABlocksRegistry.rosewood_rope_bridge_stair.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MBABlocksRegistry.yucca_rope_bridge_stair.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MBABlocksRegistry.aspen_rail_bridge.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MBABlocksRegistry.grimwood_rail_bridge.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MBABlocksRegistry.kousa_rail_bridge.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MBABlocksRegistry.morado_rail_bridge.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MBABlocksRegistry.rosewood_rail_bridge.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MBABlocksRegistry.yucca_rail_bridge.get(), RenderType.cutout());
	}
	
	 private void AddTab(BuildCreativeModeTabContentsEvent event)
	 {
    	 if (event.getTab() == MBABlocksRegistry.MBA_CT.get())
    	 {
    		 addTotabBuzzierBees(event);
    		 addTotabAtmospheric(event);
    		 addTotabAutumnity(event);
    		 addTotabEnvironmental(event);
    		 addTotabUpgradeAquatic(event);
    		 addTotabEndergetic(event);
    	 }
    }

	private void addTotabEndergetic(BuildCreativeModeTabContentsEvent event)
	{
		if(ModList.get().isLoaded("endergetic"))
		{
	   		 event.accept(MBABlocksRegistry.poise_log_bridge_middle.get());
	
	   		 event.accept(MBABlocksRegistry.rope_poise_bridge.get());
	
	   		 event.accept(MBABlocksRegistry.poise_bridge_pier.get());
	
	   		 event.accept(MBABlocksRegistry.poise_log_bridge_stair.get());
	
	   		 event.accept(MBABlocksRegistry.poise_rope_bridge_stair.get());
	
	   		 event.accept(MBABlocksRegistry.poise_rail_bridge.get());
		}
	}

	
	private void addTotabUpgradeAquatic(BuildCreativeModeTabContentsEvent event)
	{
		if(ModList.get().isLoaded("upgrade_aquatic"))
		{
	   		 event.accept(MBABlocksRegistry.driftwood_log_bridge_middle.get());
	
	   		 event.accept(MBABlocksRegistry.rope_driftwood_bridge.get());
	
	   		 event.accept(MBABlocksRegistry.driftwood_bridge_pier.get());
	
	   		 event.accept(MBABlocksRegistry.driftwood_log_bridge_stair.get());
	
	   		 event.accept(MBABlocksRegistry.driftwood_rope_bridge_stair.get());
	
	   		 event.accept(MBABlocksRegistry.driftwood_rail_bridge.get());
	
	   		 event.accept(MBABlocksRegistry.river_log_bridge_middle.get());
	
	   		 event.accept(MBABlocksRegistry.rope_river_bridge.get());
	
	   		 event.accept(MBABlocksRegistry.river_bridge_pier.get());
	
	   		 event.accept(MBABlocksRegistry.river_log_bridge_stair.get());
	
	   		 event.accept(MBABlocksRegistry.river_rope_bridge_stair.get());
	
	   		 event.accept(MBABlocksRegistry.river_rail_bridge.get());
		}
	}
	 
	private void addTotabEnvironmental(BuildCreativeModeTabContentsEvent event)
	{
		if(ModList.get().isLoaded("environmental"))
		{
	   		 event.accept(MBABlocksRegistry.cherry_log_bridge_middle.get());
	
	   		 event.accept(MBABlocksRegistry.rope_cherry_bridge.get());
	
	   		 event.accept(MBABlocksRegistry.cherry_bridge_pier.get());
	
	   		 event.accept(MBABlocksRegistry.cherry_log_bridge_stair.get());
	
	   		 event.accept(MBABlocksRegistry.cherry_rope_bridge_stair.get());
	
	   		 event.accept(MBABlocksRegistry.cherry_rail_bridge.get());
	
	   		 event.accept(MBABlocksRegistry.wisteria_log_bridge_middle.get());
	
	   		 event.accept(MBABlocksRegistry.rope_wisteria_bridge.get());
	
	   		 event.accept(MBABlocksRegistry.wisteria_bridge_pier.get());
	
	   		 event.accept(MBABlocksRegistry.wisteria_log_bridge_stair.get());
	
	   		 event.accept(MBABlocksRegistry.wisteria_rope_bridge_stair.get());
	
	   		 event.accept(MBABlocksRegistry.wisteria_rail_bridge.get());
	
	   		 event.accept(MBABlocksRegistry.willow_log_bridge_middle.get());
	
	   		 event.accept(MBABlocksRegistry.rope_willow_bridge.get());
	
	   		 event.accept(MBABlocksRegistry.willow_bridge_pier.get());
	
	   		 event.accept(MBABlocksRegistry.willow_log_bridge_stair.get());
	
	   		 event.accept(MBABlocksRegistry.willow_rope_bridge_stair.get());
	
	   		 event.accept(MBABlocksRegistry.willow_rail_bridge.get());
		}
	}
	
	private void addTotabAutumnity(BuildCreativeModeTabContentsEvent event)
	{
		if(ModList.get().isLoaded("autumnity"))
		{
	   		 event.accept(MBABlocksRegistry.maple_log_bridge_middle.get());
	
	   		 event.accept(MBABlocksRegistry.rope_maple_bridge.get());
	
	   		 event.accept(MBABlocksRegistry.maple_bridge_pier.get());
	
	   		 event.accept(MBABlocksRegistry.maple_log_bridge_stair.get());
	
	   		 event.accept(MBABlocksRegistry.maple_rope_bridge_stair.get());
	
	   		 event.accept(MBABlocksRegistry.maple_rail_bridge.get());

			 event.accept(MBABlocksRegistry.snail_shell_bricks_bridge.get());

	   		 event.accept(MBABlocksRegistry.snail_shell_bricks_bridge_pier.get());
	
	   		 event.accept(MBABlocksRegistry.snail_shell_bricks_bridge_stair.get());
	
	   		 event.accept(MBABlocksRegistry.snail_shell_tiles_bridge.get());
	
	   		 event.accept(MBABlocksRegistry.snail_shell_tiles_bridge_pier.get());
	
	   		 event.accept(MBABlocksRegistry.snail_shell_tiles_bridge_stair.get());
		}
	}
	 
	private void addTotabAtmospheric(BuildCreativeModeTabContentsEvent event)
	{
		if(ModList.get().isLoaded("atmospheric"))
		{
	   		 event.accept(MBABlocksRegistry.aspen_log_bridge_middle.get());
	
	   		 event.accept(MBABlocksRegistry.rope_aspen_bridge.get());
	
	   		 event.accept(MBABlocksRegistry.aspen_bridge_pier.get());
	
	   		 event.accept(MBABlocksRegistry.aspen_log_bridge_stair.get());
	
	   		 event.accept(MBABlocksRegistry.aspen_rope_bridge_stair.get());
	
	   		 event.accept(MBABlocksRegistry.aspen_rail_bridge.get());
	
	   		 event.accept(MBABlocksRegistry.grimwood_log_bridge_middle.get());
	
	   		 event.accept(MBABlocksRegistry.rope_grimwood_bridge.get());
	
	   		 event.accept(MBABlocksRegistry.grimwood_bridge_pier.get());
	
	   		 event.accept(MBABlocksRegistry.grimwood_log_bridge_stair.get());
	
	   		 event.accept(MBABlocksRegistry.grimwood_rope_bridge_stair.get());
	
	   		 event.accept(MBABlocksRegistry.grimwood_rail_bridge.get());
	
	   		 event.accept(MBABlocksRegistry.kousa_log_bridge_middle.get());
	
	   		 event.accept(MBABlocksRegistry.rope_kousa_bridge.get());
	
	   		 event.accept(MBABlocksRegistry.kousa_bridge_pier.get());
	
	   		 event.accept(MBABlocksRegistry.kousa_log_bridge_stair.get());
	
	   		 event.accept(MBABlocksRegistry.kousa_rope_bridge_stair.get());
	
	   		 event.accept(MBABlocksRegistry.kousa_rail_bridge.get());
	
	   		 event.accept(MBABlocksRegistry.morado_log_bridge_middle.get());
	
	   		 event.accept(MBABlocksRegistry.rope_morado_bridge.get());
	
	   		 event.accept(MBABlocksRegistry.morado_bridge_pier.get());
	
	   		 event.accept(MBABlocksRegistry.morado_log_bridge_stair.get());
	
	   		 event.accept(MBABlocksRegistry.morado_rope_bridge_stair.get());
	
	   		 event.accept(MBABlocksRegistry.morado_rail_bridge.get());
	
	   		 event.accept(MBABlocksRegistry.rosewood_log_bridge_middle.get());
	
	   		 event.accept(MBABlocksRegistry.rope_rosewood_bridge.get());
	
	   		 event.accept(MBABlocksRegistry.rosewood_bridge_pier.get());
	
	   		 event.accept(MBABlocksRegistry.rosewood_log_bridge_stair.get());
	
	   		 event.accept(MBABlocksRegistry.rosewood_rope_bridge_stair.get());
	
	   		 event.accept(MBABlocksRegistry.rosewood_rail_bridge.get());
	
	   		 event.accept(MBABlocksRegistry.yucca_log_bridge_middle.get());
	
	   		 event.accept(MBABlocksRegistry.rope_yucca_bridge.get());
	
	   		 event.accept(MBABlocksRegistry.yucca_bridge_pier.get());
	
	   		 event.accept(MBABlocksRegistry.yucca_log_bridge_stair.get());
	
	   		 event.accept(MBABlocksRegistry.yucca_rope_bridge_stair.get());
	
	   		 event.accept(MBABlocksRegistry.yucca_rail_bridge.get());
	   		 
	   		event.accept(MBABlocksRegistry.red_arid_sandstone_bridge.get());

	   		 event.accept(MBABlocksRegistry.red_arid_sandstone_bridge_pier.get());
	
	   		 event.accept(MBABlocksRegistry.red_arid_sandstone_bridge_stair.get());
	
	   		 event.accept(MBABlocksRegistry.arid_sandstone_bridge.get());
	
	   		 event.accept(MBABlocksRegistry.arid_sandstone_bridge_pier.get());
	
	   		 event.accept(MBABlocksRegistry.arid_sandstone_bridge_stair.get());
		}
	}
	 
	private void addTotabBuzzierBees(BuildCreativeModeTabContentsEvent event)
	{
		if(ModList.get().isLoaded("buzzier_bees"))
        {
	   		 event.accept(MBABlocksRegistry.honeycomb_brick_bridge.get());
	
	   		 event.accept(MBABlocksRegistry.honeycomb_brick_bridge_pier.get());
	
	   		 event.accept(MBABlocksRegistry.honeycomb_brick_bridge_stair.get());
	
	   		 event.accept(MBABlocksRegistry.honeycomb_tile_bridge.get());
	
	   		 event.accept(MBABlocksRegistry.honeycomb_tile_bridge_pier.get());
	
	   		 event.accept(MBABlocksRegistry.honeycomb_tile_bridge_stair.get());
        }
	}
}