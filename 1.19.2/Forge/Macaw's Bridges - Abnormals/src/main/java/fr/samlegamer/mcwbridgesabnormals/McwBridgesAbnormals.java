package fr.samlegamer.mcwbridgesabnormals;

import fr.samlegamer.mcwbridgesabnormals.block.MBABlocksRegistry;
import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(value = McwBridgesAbnormals.MODID)
@Mod.EventBusSubscriber(modid = McwBridgesAbnormals.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class McwBridgesAbnormals
{
	public static final String MODID = "mcwbridgesabnormals";
	public static final Tab CMT = new Tab("bridgesabnormals_tab");
	
	public McwBridgesAbnormals()
	{
		FMLJavaModLoadingContext.get().getModEventBus().addListener(this::ClientSetup);
		IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
		MBABlocksRegistry.BLOCKS_REGISTRY.register(bus);
		MBABlocksRegistry.ITEMS_REGISTRY.register(bus);
	}
	
	private void ClientSetup(FMLClientSetupEvent event)
	{
		ItemBlockRenderTypes.setRenderLayer(MBABlocksRegistry.HONEYCOMB_BRICK_BRIDGE_MIDDLE.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MBABlocksRegistry.HONEYCOMB_TILE_BRIDGE_MIDDLE.get(), RenderType.cutout());
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
	
	static class Tab extends CreativeModeTab
	{
		public Tab(String label) { super(label); }
		
		@Override
		public ItemStack makeIcon()
		{
			return new ItemStack(MBABlocksRegistry.LOGO.get());
		}
	}
}