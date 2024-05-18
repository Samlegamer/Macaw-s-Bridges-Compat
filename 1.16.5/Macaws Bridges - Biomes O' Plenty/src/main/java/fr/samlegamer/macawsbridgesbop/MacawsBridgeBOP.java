package fr.samlegamer.macawsbridgesbop;

import fr.samlegamer.macawsbridgesbop.blocks.MBBOPBlocksRegistry;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.RenderTypeLookup;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(value = MacawsBridgeBOP.MODID)
@Mod.EventBusSubscriber(modid = MacawsBridgeBOP.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class MacawsBridgeBOP
{
	public static final String MODID = "macawsbridgesbop";
		
	public MacawsBridgeBOP()
	{
		FMLJavaModLoadingContext.get().getModEventBus().addListener(this::ClientSetup);
		IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
		MBBOPBlocksRegistry.BLOCKS_REGISTRY.register(bus);
		MBBOPBlocksRegistry.ITEMS_REGISTRY.register(bus);
	}
	
	
	private void ClientSetup(FMLClientSetupEvent event)
	{
		RenderTypeLookup.setRenderLayer(MBBOPBlocksRegistry.cherry_log_bridge_middle.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBBOPBlocksRegistry.dead_log_bridge_middle.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBBOPBlocksRegistry.fir_log_bridge_middle.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBBOPBlocksRegistry.hellbark_log_bridge_middle.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBBOPBlocksRegistry.jacaranda_log_bridge_middle.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBBOPBlocksRegistry.magic_log_bridge_middle.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBBOPBlocksRegistry.mahogany_log_bridge_middle.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBBOPBlocksRegistry.palm_log_bridge_middle.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBBOPBlocksRegistry.redwood_log_bridge_middle.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBBOPBlocksRegistry.umbran_log_bridge_middle.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBBOPBlocksRegistry.willow_log_bridge_middle.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBBOPBlocksRegistry.cherry_bridge_pier.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBBOPBlocksRegistry.dead_bridge_pier.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBBOPBlocksRegistry.fir_bridge_pier.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBBOPBlocksRegistry.hellbark_bridge_pier.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBBOPBlocksRegistry.jacaranda_bridge_pier.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBBOPBlocksRegistry.magic_bridge_pier.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBBOPBlocksRegistry.mahogany_bridge_pier.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBBOPBlocksRegistry.palm_bridge_pier.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBBOPBlocksRegistry.redwood_bridge_pier.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBBOPBlocksRegistry.umbran_bridge_pier.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBBOPBlocksRegistry.willow_bridge_pier.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBBOPBlocksRegistry.cherry_rail_bridge.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBBOPBlocksRegistry.dead_rail_bridge.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBBOPBlocksRegistry.fir_rail_bridge.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBBOPBlocksRegistry.hellbark_rail_bridge.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBBOPBlocksRegistry.jacaranda_rail_bridge.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBBOPBlocksRegistry.magic_rail_bridge.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBBOPBlocksRegistry.mahogany_rail_bridge.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBBOPBlocksRegistry.palm_rail_bridge.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBBOPBlocksRegistry.redwood_rail_bridge.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBBOPBlocksRegistry.umbran_rail_bridge.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBBOPBlocksRegistry.willow_rail_bridge.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBBOPBlocksRegistry.rope_cherry_bridge.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBBOPBlocksRegistry.rope_dead_bridge.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBBOPBlocksRegistry.rope_fir_bridge.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBBOPBlocksRegistry.rope_hellbark_bridge.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBBOPBlocksRegistry.rope_jacaranda_bridge.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBBOPBlocksRegistry.rope_magic_bridge.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBBOPBlocksRegistry.rope_mahogany_bridge.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBBOPBlocksRegistry.rope_palm_bridge.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBBOPBlocksRegistry.rope_redwood_bridge.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBBOPBlocksRegistry.rope_umbran_bridge.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBBOPBlocksRegistry.rope_willow_bridge.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBBOPBlocksRegistry.cherry_log_bridge_stair.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBBOPBlocksRegistry.dead_log_bridge_stair.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBBOPBlocksRegistry.fir_log_bridge_stair.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBBOPBlocksRegistry.hellbark_log_bridge_stair.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBBOPBlocksRegistry.jacaranda_log_bridge_stair.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBBOPBlocksRegistry.magic_log_bridge_stair.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBBOPBlocksRegistry.mahogany_log_bridge_stair.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBBOPBlocksRegistry.palm_log_bridge_stair.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBBOPBlocksRegistry.redwood_log_bridge_stair.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBBOPBlocksRegistry.umbran_log_bridge_stair.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBBOPBlocksRegistry.willow_log_bridge_stair.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBBOPBlocksRegistry.cherry_rope_bridge_stair.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBBOPBlocksRegistry.dead_rope_bridge_stair.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBBOPBlocksRegistry.fir_rope_bridge_stair.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBBOPBlocksRegistry.hellbark_rope_bridge_stair.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBBOPBlocksRegistry.jacaranda_rope_bridge_stair.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBBOPBlocksRegistry.magic_rope_bridge_stair.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBBOPBlocksRegistry.mahogany_rope_bridge_stair.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBBOPBlocksRegistry.palm_rope_bridge_stair.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBBOPBlocksRegistry.redwood_rope_bridge_stair.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBBOPBlocksRegistry.umbran_rope_bridge_stair.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBBOPBlocksRegistry.willow_rope_bridge_stair.get(), RenderType.cutout());

	}	
}