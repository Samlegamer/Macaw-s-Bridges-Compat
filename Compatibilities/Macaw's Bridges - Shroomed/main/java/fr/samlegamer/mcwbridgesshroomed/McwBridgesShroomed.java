package fr.samlegamer.mcwbridgesshroomed;

import fr.samlegamer.mcwbridgesshroomed.block.MBSBlocksRegistry;
import fr.samlegamer.mcwbridgesshroomed.item.MBSItemsRegistry;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.RenderTypeLookup;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(value = McwBridgesShroomed.MODID)
@Mod.EventBusSubscriber(modid = McwBridgesShroomed.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class McwBridgesShroomed
{
	public static final String MODID = "mcwbridgesshroomed";
	
	public McwBridgesShroomed()
	{
		FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
		FMLJavaModLoadingContext.get().getModEventBus().addListener(this::ClientSetup);
				
		IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
		MBSItemsRegistry.ITEMS_REGISTRY.register(bus);
		MBSBlocksRegistry.BLOCKS_REGISTRY.register(bus);
	}
	
	private void setup(FMLCommonSetupEvent event)
	{
		
	}
	
	private void ClientSetup(FMLClientSetupEvent event)
	{
		RenderTypeLookup.setRenderLayer(MBSBlocksRegistry.blue_hard_mushroom_log_bridge_middle.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBSBlocksRegistry.hard_mushroom_log_bridge_middle.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBSBlocksRegistry.orange_hard_mushroom_log_bridge_middle.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBSBlocksRegistry.purple_hard_mushroom_log_bridge_middle.get(), RenderType.cutout());

		RenderTypeLookup.setRenderLayer(MBSBlocksRegistry.blue_hard_mushroom_rail_bridge.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBSBlocksRegistry.hard_mushroom_rail_bridge.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBSBlocksRegistry.orange_hard_mushroom_rail_bridge.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBSBlocksRegistry.purple_hard_mushroom_rail_bridge.get(), RenderType.cutout());

		RenderTypeLookup.setRenderLayer(MBSBlocksRegistry.blue_hard_mushroom_log_bridge_stair.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBSBlocksRegistry.hard_mushroom_log_bridge_stair.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBSBlocksRegistry.orange_hard_mushroom_log_bridge_stair.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBSBlocksRegistry.purple_hard_mushroom_log_bridge_stair.get(), RenderType.cutout());

		RenderTypeLookup.setRenderLayer(MBSBlocksRegistry.blue_hard_mushroom_bridge_pier.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBSBlocksRegistry.hard_mushroom_bridge_pier.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBSBlocksRegistry.orange_hard_mushroom_bridge_pier.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBSBlocksRegistry.purple_hard_mushroom_bridge_pier.get(), RenderType.cutout());

		RenderTypeLookup.setRenderLayer(MBSBlocksRegistry.rope_blue_hard_mushroom_bridge.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBSBlocksRegistry.rope_hard_mushroom_bridge.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBSBlocksRegistry.rope_orange_hard_mushroom_bridge.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBSBlocksRegistry.rope_purple_hard_mushroom_bridge.get(), RenderType.cutout());
	}
}
