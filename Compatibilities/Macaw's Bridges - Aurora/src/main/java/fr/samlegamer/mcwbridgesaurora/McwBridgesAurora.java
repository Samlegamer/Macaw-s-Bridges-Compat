package fr.samlegamer.mcwbridgesaurora;

import fr.samlegamer.mcwbridgesaurora.block.MBABlocksRegistry;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.RenderTypeLookup;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(value = McwBridgesAurora.MODID)
@Mod.EventBusSubscriber(modid = McwBridgesAurora.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class McwBridgesAurora
{
	public static final String MODID = "mcwbridgesaurora";
	
	public McwBridgesAurora()
	{
		FMLJavaModLoadingContext.get().getModEventBus().addListener(this::ClientSetup);
		IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
		MBABlocksRegistry.BLOCKS_REGISTRY.register(bus);
		MBABlocksRegistry.ITEMS_REGISTRY.register(bus);
		MinecraftForge.EVENT_BUS.register(AuroraFixCompat.class);
	}
	
	private void ClientSetup(FMLClientSetupEvent event)
	{
		RenderTypeLookup.setRenderLayer(MBABlocksRegistry.cypress_log_bridge_middle.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBABlocksRegistry.cypress_bridge_pier.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBABlocksRegistry.cypress_rail_bridge.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBABlocksRegistry.rope_cypress_bridge.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBABlocksRegistry.cypress_log_bridge_stair.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBABlocksRegistry.brown_mushroom_log_bridge_middle.get(), RenderType.cutout());
	 	RenderTypeLookup.setRenderLayer(MBABlocksRegistry.red_mushroom_log_bridge_middle.get(), RenderType.cutout());
	 	RenderTypeLookup.setRenderLayer(MBABlocksRegistry.rope_brown_mushroom_bridge.get(), RenderType.cutout());
	 	RenderTypeLookup.setRenderLayer(MBABlocksRegistry.rope_red_mushroom_bridge.get(), RenderType.cutout());
	 	RenderTypeLookup.setRenderLayer(MBABlocksRegistry.brown_mushroom_bridge_pier.get(), RenderType.cutout());
	 	RenderTypeLookup.setRenderLayer(MBABlocksRegistry.red_mushroom_bridge_pier.get(), RenderType.cutout());
	 	RenderTypeLookup.setRenderLayer(MBABlocksRegistry.brown_mushroom_log_bridge_stair.get(), RenderType.cutout());
	 	RenderTypeLookup.setRenderLayer(MBABlocksRegistry.red_mushroom_log_bridge_stair.get(), RenderType.cutout());
	 	RenderTypeLookup.setRenderLayer(MBABlocksRegistry.brown_mushroom_rail_bridge.get(), RenderType.cutout());
	 	RenderTypeLookup.setRenderLayer(MBABlocksRegistry.red_mushroom_rail_bridge.get(), RenderType.cutout());
	}
}