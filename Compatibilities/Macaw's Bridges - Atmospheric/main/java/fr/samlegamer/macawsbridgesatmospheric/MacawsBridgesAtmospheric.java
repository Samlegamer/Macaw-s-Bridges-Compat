package fr.samlegamer.macawsbridgesatmospheric;

import fr.samlegamer.macawsbridgesatmospheric.block.MBABlocksRegistry;
import fr.samlegamer.macawsbridgesatmospheric.item.MBAItemsRegistry;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.RenderTypeLookup;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(value = MacawsBridgesAtmospheric.MODID)
@Mod.EventBusSubscriber(modid = MacawsBridgesAtmospheric.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class MacawsBridgesAtmospheric
{
	public static final String MODID = "macawsbridgesatmospheric";
	
	public MacawsBridgesAtmospheric()
	{
		FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
		FMLJavaModLoadingContext.get().getModEventBus().addListener(this::ClientSetup);
				
		IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
		MBAItemsRegistry.ITEMS_REGISTRY.register(bus);
		MBABlocksRegistry.BLOCKS_REGISTRY.register(bus);
	}
	
	private void setup(FMLCommonSetupEvent event)
	{
		
	}
	
	private void ClientSetup(FMLClientSetupEvent event)
	{
		RenderTypeLookup.setRenderLayer(MBABlocksRegistry.aspen_log_bridge_middle.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBABlocksRegistry.grimwood_log_bridge_middle.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBABlocksRegistry.kousa_log_bridge_middle.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBABlocksRegistry.morado_log_bridge_middle.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBABlocksRegistry.rosewood_log_bridge_middle.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBABlocksRegistry.yucca_log_bridge_middle.get(), RenderType.cutout());

		RenderTypeLookup.setRenderLayer(MBABlocksRegistry.aspen_bridge_pier.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBABlocksRegistry.grimwood_bridge_pier.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBABlocksRegistry.kousa_bridge_pier.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBABlocksRegistry.morado_bridge_pier.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBABlocksRegistry.rosewood_bridge_pier.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBABlocksRegistry.yucca_bridge_pier.get(), RenderType.cutout());

		RenderTypeLookup.setRenderLayer(MBABlocksRegistry.aspen_rail_bridge.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBABlocksRegistry.grimwood_rail_bridge.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBABlocksRegistry.kousa_rail_bridge.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBABlocksRegistry.morado_rail_bridge.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBABlocksRegistry.rosewood_rail_bridge.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBABlocksRegistry.yucca_rail_bridge.get(), RenderType.cutout());
		
		RenderTypeLookup.setRenderLayer(MBABlocksRegistry.rope_aspen_bridge.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBABlocksRegistry.rope_grimwood_bridge.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBABlocksRegistry.rope_kousa_bridge.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBABlocksRegistry.rope_morado_bridge.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBABlocksRegistry.rope_rosewood_bridge.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBABlocksRegistry.rope_yucca_bridge.get(), RenderType.cutout());

		RenderTypeLookup.setRenderLayer(MBABlocksRegistry.aspen_log_bridge_stair.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBABlocksRegistry.grimwood_log_bridge_stair.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBABlocksRegistry.kousa_log_bridge_stair.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBABlocksRegistry.morado_log_bridge_stair.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBABlocksRegistry.rosewood_log_bridge_stair.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBABlocksRegistry.yucca_log_bridge_stair.get(), RenderType.cutout());
		
		RenderTypeLookup.setRenderLayer(MBABlocksRegistry.red_arid_sandstone_bridge.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBABlocksRegistry.arid_sandstone_bridge.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBABlocksRegistry.red_arid_sandstone_bridge_stair.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBABlocksRegistry.arid_sandstone_bridge_pier.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBABlocksRegistry.red_arid_sandstone_bridge_pier.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBABlocksRegistry.arid_sandstone_bridge_stair.get(), RenderType.cutout());
	}
}