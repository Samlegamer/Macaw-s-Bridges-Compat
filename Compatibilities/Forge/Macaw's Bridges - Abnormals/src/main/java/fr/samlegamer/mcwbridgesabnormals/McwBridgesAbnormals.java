package fr.samlegamer.mcwbridgesabnormals;

import fr.samlegamer.mcwbridgesabnormals.block.MBABlocksRegistry;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.RenderTypeLookup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
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
		MinecraftForge.EVENT_BUS.register(AbnormalsFixCompat.class);
	}
	
	private void ClientSetup(FMLClientSetupEvent event)
	{
		RenderTypeLookup.setRenderLayer(MBABlocksRegistry.honeycomb_brick_bridge.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBABlocksRegistry.honeycomb_tile_bridge.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBABlocksRegistry.honeycomb_brick_bridge_stair.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBABlocksRegistry.honeycomb_tile_bridge_stair.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBABlocksRegistry.honeycomb_tile_bridge_pier.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBABlocksRegistry.honeycomb_brick_bridge_pier.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBABlocksRegistry.red_arid_sandstone_bridge.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBABlocksRegistry.arid_sandstone_bridge.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBABlocksRegistry.red_arid_sandstone_bridge_stair.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBABlocksRegistry.arid_sandstone_bridge_pier.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBABlocksRegistry.red_arid_sandstone_bridge_pier.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBABlocksRegistry.arid_sandstone_bridge_stair.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBABlocksRegistry.maple_log_bridge_middle.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBABlocksRegistry.maple_bridge_pier.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBABlocksRegistry.maple_log_bridge_stair.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBABlocksRegistry.maple_rail_bridge.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBABlocksRegistry.rope_maple_bridge.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBABlocksRegistry.maple_rope_bridge_stair.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBABlocksRegistry.snail_shell_bricks_bridge.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBABlocksRegistry.snail_shell_bricks_bridge_pier.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBABlocksRegistry.snail_shell_bricks_bridge_stair.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBABlocksRegistry.snail_shell_tiles_bridge.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBABlocksRegistry.snail_shell_tiles_bridge_pier.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBABlocksRegistry.snail_shell_tiles_bridge_stair.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBABlocksRegistry.cherry_log_bridge_middle.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBABlocksRegistry.wisteria_log_bridge_middle.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBABlocksRegistry.willow_log_bridge_middle.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBABlocksRegistry.cherry_bridge_pier.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBABlocksRegistry.wisteria_bridge_pier.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBABlocksRegistry.willow_bridge_pier.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBABlocksRegistry.cherry_rail_bridge.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBABlocksRegistry.wisteria_rail_bridge.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBABlocksRegistry.willow_rail_bridge.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBABlocksRegistry.rope_cherry_bridge.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBABlocksRegistry.rope_wisteria_bridge.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBABlocksRegistry.rope_willow_bridge.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBABlocksRegistry.cherry_log_bridge_stair.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBABlocksRegistry.wisteria_log_bridge_stair.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBABlocksRegistry.willow_log_bridge_stair.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBABlocksRegistry.driftwood_log_bridge_middle.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBABlocksRegistry.river_log_bridge_middle.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBABlocksRegistry.driftwood_bridge_pier.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBABlocksRegistry.river_bridge_pier.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBABlocksRegistry.driftwood_rail_bridge.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBABlocksRegistry.river_rail_bridge.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBABlocksRegistry.rope_driftwood_bridge.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBABlocksRegistry.rope_river_bridge.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBABlocksRegistry.driftwood_log_bridge_stair.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBABlocksRegistry.river_log_bridge_stair.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBABlocksRegistry.poise_log_bridge_middle.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBABlocksRegistry.rope_poise_bridge.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBABlocksRegistry.poise_log_bridge_stair.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBABlocksRegistry.poise_rail_bridge.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBABlocksRegistry.poise_rope_bridge_stair.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBABlocksRegistry.aspen_log_bridge_middle.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBABlocksRegistry.grimwood_log_bridge_middle.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBABlocksRegistry.kousa_log_bridge_middle.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBABlocksRegistry.morado_log_bridge_middle.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBABlocksRegistry.rosewood_log_bridge_middle.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBABlocksRegistry.yucca_log_bridge_middle.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBABlocksRegistry.rope_aspen_bridge.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBABlocksRegistry.rope_grimwood_bridge.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBABlocksRegistry.rope_kousa_bridge.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBABlocksRegistry.rope_morado_bridge.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBABlocksRegistry.rope_rosewood_bridge.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBABlocksRegistry.rope_yucca_bridge.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBABlocksRegistry.aspen_bridge_pier.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBABlocksRegistry.grimwood_bridge_pier.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBABlocksRegistry.kousa_bridge_pier.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBABlocksRegistry.morado_bridge_pier.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBABlocksRegistry.rosewood_bridge_pier.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBABlocksRegistry.yucca_bridge_pier.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBABlocksRegistry.aspen_log_bridge_stair.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBABlocksRegistry.grimwood_log_bridge_stair.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBABlocksRegistry.kousa_log_bridge_stair.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBABlocksRegistry.morado_log_bridge_stair.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBABlocksRegistry.rosewood_log_bridge_stair.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBABlocksRegistry.yucca_log_bridge_stair.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBABlocksRegistry.aspen_rope_bridge_stair.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBABlocksRegistry.grimwood_rope_bridge_stair.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBABlocksRegistry.kousa_rope_bridge_stair.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBABlocksRegistry.morado_rope_bridge_stair.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBABlocksRegistry.rosewood_rope_bridge_stair.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBABlocksRegistry.yucca_rope_bridge_stair.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBABlocksRegistry.aspen_rail_bridge.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBABlocksRegistry.grimwood_rail_bridge.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBABlocksRegistry.kousa_rail_bridge.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBABlocksRegistry.morado_rail_bridge.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBABlocksRegistry.rosewood_rail_bridge.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBABlocksRegistry.yucca_rail_bridge.get(), RenderType.cutout());
	}
	
	static class Tab extends ItemGroup
	{
		public Tab(String label) { super(label); }
		
		@Override
		public ItemStack makeIcon()
		{
			return new ItemStack(MBABlocksRegistry.LOGO.get());
		}
	}
}