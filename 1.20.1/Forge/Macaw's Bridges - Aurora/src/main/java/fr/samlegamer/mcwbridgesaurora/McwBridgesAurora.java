package fr.samlegamer.mcwbridgesaurora;

import fr.samlegamer.mcwbridgesaurora.block.Fix120Aurora;
import fr.samlegamer.mcwbridgesaurora.block.MBABlocksRegistry;
import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
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
		MBABlocksRegistry.Item_Group.register(bus);
		MBABlocksRegistry.BLOCKS_REGISTRY.register(bus);
		MinecraftForge.EVENT_BUS.register(Fix120Aurora.class);
		MBABlocksRegistry.ITEMS_REGISTRY.register(bus);
	}
	
	private void ClientSetup(FMLClientSetupEvent event)
	{
		ItemBlockRenderTypes.setRenderLayer(MBABlocksRegistry.cypress_log_bridge_middle.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MBABlocksRegistry.cypress_bridge_pier.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MBABlocksRegistry.cypress_rail_bridge.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MBABlocksRegistry.rope_cypress_bridge.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MBABlocksRegistry.cypress_log_bridge_stair.get(), RenderType.cutout());
	 	ItemBlockRenderTypes.setRenderLayer(MBABlocksRegistry.cypress_rope_bridge_stair.get(), RenderType.cutout());

		ItemBlockRenderTypes.setRenderLayer(MBABlocksRegistry.mushroom_log_bridge_middle.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MBABlocksRegistry.mushroom_bridge_pier.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MBABlocksRegistry.mushroom_rail_bridge.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MBABlocksRegistry.rope_mushroom_bridge.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MBABlocksRegistry.mushroom_log_bridge_stair.get(), RenderType.cutout());
	 	ItemBlockRenderTypes.setRenderLayer(MBABlocksRegistry.mushroom_rope_bridge_stair.get(), RenderType.cutout());
		/*ItemBlockRenderTypes.setRenderLayer(MBABlocksRegistry.brown_mushroom_log_bridge_middle.get(), RenderType.cutout());
	 	ItemBlockRenderTypes.setRenderLayer(MBABlocksRegistry.red_mushroom_log_bridge_middle.get(), RenderType.cutout());
	 	ItemBlockRenderTypes.setRenderLayer(MBABlocksRegistry.rope_brown_mushroom_bridge.get(), RenderType.cutout());
	 	ItemBlockRenderTypes.setRenderLayer(MBABlocksRegistry.rope_red_mushroom_bridge.get(), RenderType.cutout());
	 	ItemBlockRenderTypes.setRenderLayer(MBABlocksRegistry.brown_mushroom_bridge_pier.get(), RenderType.cutout());
	 	ItemBlockRenderTypes.setRenderLayer(MBABlocksRegistry.red_mushroom_bridge_pier.get(), RenderType.cutout());
	 	ItemBlockRenderTypes.setRenderLayer(MBABlocksRegistry.brown_mushroom_log_bridge_stair.get(), RenderType.cutout());
	 	ItemBlockRenderTypes.setRenderLayer(MBABlocksRegistry.red_mushroom_log_bridge_stair.get(), RenderType.cutout());
	 	ItemBlockRenderTypes.setRenderLayer(MBABlocksRegistry.brown_mushroom_rail_bridge.get(), RenderType.cutout());
	 	ItemBlockRenderTypes.setRenderLayer(MBABlocksRegistry.red_mushroom_rail_bridge.get(), RenderType.cutout());
	 	ItemBlockRenderTypes.setRenderLayer(MBABlocksRegistry.brown_mushroom_rope_bridge_stair.get(), RenderType.cutout());
	 	ItemBlockRenderTypes.setRenderLayer(MBABlocksRegistry.red_mushroom_rope_bridge_stair.get(), RenderType.cutout());*/
	}
}