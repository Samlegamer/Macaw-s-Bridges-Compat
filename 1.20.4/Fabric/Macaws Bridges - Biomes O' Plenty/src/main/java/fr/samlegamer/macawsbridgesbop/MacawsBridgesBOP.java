package fr.samlegamer.macawsbridgesbop;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.kikoz.mcwbridges.MacawsBridges;
import fr.samlegamer.macawsbridgesbop.block.MBBOPBlocksRegistry;

public class MacawsBridgesBOP implements ModInitializer
{
	public static final String MODID = "macawsbridgesbop";
	
	@Override
	public void onInitialize()
	{
		MBBOPBlocksRegistry.registry();
		ItemGroupEvents.modifyEntriesEvent(MacawsBridges.BRIDGEGROUP).register(content -> {
			content.add(MBBOPBlocksRegistry.dead_log_bridge_middle);
			content.add(MBBOPBlocksRegistry.rope_dead_bridge);
			content.add(MBBOPBlocksRegistry.dead_bridge_pier);
			content.add(MBBOPBlocksRegistry.dead_log_bridge_stair);
			content.add(MBBOPBlocksRegistry.dead_rope_bridge_stair);
			content.add(MBBOPBlocksRegistry.dead_rail_bridge);
			content.add(MBBOPBlocksRegistry.fir_log_bridge_middle);
			content.add(MBBOPBlocksRegistry.rope_fir_bridge);
			content.add(MBBOPBlocksRegistry.fir_bridge_pier);
			content.add(MBBOPBlocksRegistry.fir_log_bridge_stair);
			content.add(MBBOPBlocksRegistry.fir_rope_bridge_stair);
			content.add(MBBOPBlocksRegistry.fir_rail_bridge);
			content.add(MBBOPBlocksRegistry.hellbark_log_bridge_middle);
			content.add(MBBOPBlocksRegistry.rope_hellbark_bridge);
			content.add(MBBOPBlocksRegistry.hellbark_bridge_pier);
			content.add(MBBOPBlocksRegistry.hellbark_log_bridge_stair);
			content.add(MBBOPBlocksRegistry.hellbark_rope_bridge_stair);
			content.add(MBBOPBlocksRegistry.hellbark_rail_bridge);
			content.add(MBBOPBlocksRegistry.jacaranda_log_bridge_middle);
			content.add(MBBOPBlocksRegistry.rope_jacaranda_bridge);
			content.add(MBBOPBlocksRegistry.jacaranda_bridge_pier);
			content.add(MBBOPBlocksRegistry.jacaranda_log_bridge_stair);
			content.add(MBBOPBlocksRegistry.jacaranda_rope_bridge_stair);
			content.add(MBBOPBlocksRegistry.jacaranda_rail_bridge);
			content.add(MBBOPBlocksRegistry.magic_log_bridge_middle);
			content.add(MBBOPBlocksRegistry.rope_magic_bridge);
			content.add(MBBOPBlocksRegistry.magic_bridge_pier);
			content.add(MBBOPBlocksRegistry.magic_log_bridge_stair);
			content.add(MBBOPBlocksRegistry.magic_rope_bridge_stair);
			content.add(MBBOPBlocksRegistry.magic_rail_bridge);
			content.add(MBBOPBlocksRegistry.mahogany_log_bridge_middle);
			content.add(MBBOPBlocksRegistry.rope_mahogany_bridge);
			content.add(MBBOPBlocksRegistry.mahogany_bridge_pier);
			content.add(MBBOPBlocksRegistry.mahogany_log_bridge_stair);
			content.add(MBBOPBlocksRegistry.mahogany_rope_bridge_stair);
			content.add(MBBOPBlocksRegistry.mahogany_rail_bridge);
			content.add(MBBOPBlocksRegistry.palm_log_bridge_middle);
			content.add(MBBOPBlocksRegistry.rope_palm_bridge);
			content.add(MBBOPBlocksRegistry.palm_bridge_pier);
			content.add(MBBOPBlocksRegistry.palm_log_bridge_stair);
			content.add(MBBOPBlocksRegistry.palm_rope_bridge_stair);
			content.add(MBBOPBlocksRegistry.palm_rail_bridge);
			content.add(MBBOPBlocksRegistry.redwood_log_bridge_middle);
			content.add(MBBOPBlocksRegistry.rope_redwood_bridge);
			content.add(MBBOPBlocksRegistry.redwood_bridge_pier);
			content.add(MBBOPBlocksRegistry.redwood_log_bridge_stair);
			content.add(MBBOPBlocksRegistry.redwood_rope_bridge_stair);
			content.add(MBBOPBlocksRegistry.redwood_rail_bridge);
			content.add(MBBOPBlocksRegistry.umbran_log_bridge_middle);
			content.add(MBBOPBlocksRegistry.rope_umbran_bridge);
			content.add(MBBOPBlocksRegistry.umbran_bridge_pier);
			content.add(MBBOPBlocksRegistry.umbran_log_bridge_stair);
			content.add(MBBOPBlocksRegistry.umbran_rope_bridge_stair);
			content.add(MBBOPBlocksRegistry.umbran_rail_bridge);
			content.add(MBBOPBlocksRegistry.willow_log_bridge_middle);
			content.add(MBBOPBlocksRegistry.rope_willow_bridge);
			content.add(MBBOPBlocksRegistry.willow_bridge_pier);
			content.add(MBBOPBlocksRegistry.willow_log_bridge_stair);
			content.add(MBBOPBlocksRegistry.willow_rope_bridge_stair);
			content.add(MBBOPBlocksRegistry.willow_rail_bridge);
			content.add(MBBOPBlocksRegistry.empyreal_log_bridge_middle);
			content.add(MBBOPBlocksRegistry.rope_empyreal_bridge);
			content.add(MBBOPBlocksRegistry.empyreal_bridge_pier);
			content.add(MBBOPBlocksRegistry.empyreal_log_bridge_stair);
			content.add(MBBOPBlocksRegistry.empyreal_rope_bridge_stair);
			content.add(MBBOPBlocksRegistry.empyreal_rail_bridge);
		});
	}
}