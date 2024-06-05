package fr.samlegamer.macawsbridgesbop.client;

import fr.samlegamer.macawsbridgesbop.block.MBBOPBlocksRegistry;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.client.render.RenderLayer;

@Environment(EnvType.CLIENT)
public class MBBOPClient implements ClientModInitializer
{
	@Override
	public void onInitializeClient()
	{
		BlockRenderLayerMap.INSTANCE.putBlocks(RenderLayer.getCutout(),
				MBBOPBlocksRegistry.dead_log_bridge_middle, 
				MBBOPBlocksRegistry.rope_dead_bridge, 
				MBBOPBlocksRegistry.dead_bridge_pier, 
				MBBOPBlocksRegistry.dead_log_bridge_stair, 
				MBBOPBlocksRegistry.dead_rope_bridge_stair, 
				MBBOPBlocksRegistry.dead_rail_bridge, 
				MBBOPBlocksRegistry.fir_log_bridge_middle, 
				MBBOPBlocksRegistry.rope_fir_bridge, 
				MBBOPBlocksRegistry.fir_bridge_pier, 
				MBBOPBlocksRegistry.fir_log_bridge_stair, 
				MBBOPBlocksRegistry.fir_rope_bridge_stair, 
				MBBOPBlocksRegistry.fir_rail_bridge, 
				MBBOPBlocksRegistry.hellbark_log_bridge_middle, 
				MBBOPBlocksRegistry.rope_hellbark_bridge, 
				MBBOPBlocksRegistry.hellbark_bridge_pier, 
				MBBOPBlocksRegistry.hellbark_log_bridge_stair, 
				MBBOPBlocksRegistry.hellbark_rope_bridge_stair, 
				MBBOPBlocksRegistry.hellbark_rail_bridge, 
				MBBOPBlocksRegistry.jacaranda_log_bridge_middle, 
				MBBOPBlocksRegistry.rope_jacaranda_bridge, 
				MBBOPBlocksRegistry.jacaranda_bridge_pier, 
				MBBOPBlocksRegistry.jacaranda_log_bridge_stair, 
				MBBOPBlocksRegistry.jacaranda_rope_bridge_stair, 
				MBBOPBlocksRegistry.jacaranda_rail_bridge, 
				MBBOPBlocksRegistry.magic_log_bridge_middle, 
				MBBOPBlocksRegistry.rope_magic_bridge, 
				MBBOPBlocksRegistry.magic_bridge_pier, 
				MBBOPBlocksRegistry.magic_log_bridge_stair, 
				MBBOPBlocksRegistry.magic_rope_bridge_stair, 
				MBBOPBlocksRegistry.magic_rail_bridge, 
				MBBOPBlocksRegistry.mahogany_log_bridge_middle, 
				MBBOPBlocksRegistry.rope_mahogany_bridge, 
				MBBOPBlocksRegistry.mahogany_bridge_pier, 
				MBBOPBlocksRegistry.mahogany_log_bridge_stair, 
				MBBOPBlocksRegistry.mahogany_rope_bridge_stair, 
				MBBOPBlocksRegistry.mahogany_rail_bridge, 
				MBBOPBlocksRegistry.palm_log_bridge_middle, 
				MBBOPBlocksRegistry.rope_palm_bridge, 
				MBBOPBlocksRegistry.palm_bridge_pier, 
				MBBOPBlocksRegistry.palm_log_bridge_stair, 
				MBBOPBlocksRegistry.palm_rope_bridge_stair, 
				MBBOPBlocksRegistry.palm_rail_bridge, 
				MBBOPBlocksRegistry.redwood_log_bridge_middle, 
				MBBOPBlocksRegistry.rope_redwood_bridge, 
				MBBOPBlocksRegistry.redwood_bridge_pier, 
				MBBOPBlocksRegistry.redwood_log_bridge_stair, 
				MBBOPBlocksRegistry.redwood_rope_bridge_stair, 
				MBBOPBlocksRegistry.redwood_rail_bridge, 
				MBBOPBlocksRegistry.umbran_log_bridge_middle, 
				MBBOPBlocksRegistry.rope_umbran_bridge, 
				MBBOPBlocksRegistry.umbran_bridge_pier, 
				MBBOPBlocksRegistry.umbran_log_bridge_stair, 
				MBBOPBlocksRegistry.umbran_rope_bridge_stair, 
				MBBOPBlocksRegistry.umbran_rail_bridge, 
				MBBOPBlocksRegistry.willow_log_bridge_middle, 
				MBBOPBlocksRegistry.rope_willow_bridge, 
				MBBOPBlocksRegistry.willow_bridge_pier, 
				MBBOPBlocksRegistry.willow_log_bridge_stair, 
				MBBOPBlocksRegistry.willow_rope_bridge_stair, 
				MBBOPBlocksRegistry.willow_rail_bridge, 
				MBBOPBlocksRegistry.empyreal_log_bridge_middle, 
				MBBOPBlocksRegistry.rope_empyreal_bridge, 
				MBBOPBlocksRegistry.empyreal_bridge_pier, 
				MBBOPBlocksRegistry.empyreal_log_bridge_stair, 
				MBBOPBlocksRegistry.empyreal_rope_bridge_stair, 
				MBBOPBlocksRegistry.empyreal_rail_bridge);
	}
}