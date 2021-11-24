package fr.samlegamer.macawsbridgesautumnity;

import fr.samlegamer.macawsbridgesautumnity.block.MBABlocksRegistry;
import fr.samlegamer.macawsbridgesautumnity.item.MBAItemsRegistry;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.RenderTypeLookup;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(value = MacawsBridgesAutumnity.MODID)
@Mod.EventBusSubscriber(modid = MacawsBridgesAutumnity.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class MacawsBridgesAutumnity
{
	public static final String MODID = "macawsbridgesautumnity";
	
	public MacawsBridgesAutumnity()
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
		RenderTypeLookup.setRenderLayer(MBABlocksRegistry.maple_log_bridge_middle.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBABlocksRegistry.maple_bridge_pier.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBABlocksRegistry.maple_log_bridge_stair.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBABlocksRegistry.maple_rail_bridge.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBABlocksRegistry.rope_maple_bridge.get(), RenderType.cutout());
		
		RenderTypeLookup.setRenderLayer(MBABlocksRegistry.snail_shell_bricks_bridge.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBABlocksRegistry.snail_shell_bricks_bridge_pier.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBABlocksRegistry.snail_shell_bricks_bridge_stair.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBABlocksRegistry.snail_shell_tiles_bridge.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBABlocksRegistry.snail_shell_tiles_bridge_pier.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBABlocksRegistry.snail_shell_tiles_bridge_stair.get(), RenderType.cutout());
	}
}