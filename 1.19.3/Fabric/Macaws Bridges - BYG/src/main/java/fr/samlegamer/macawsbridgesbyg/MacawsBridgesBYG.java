package fr.samlegamer.macawsbridgesbyg;

import fr.samlegamer.macawsbridgesbyg.block.MBBYGBlocksRegistry;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class MacawsBridgesBYG implements ModInitializer
{
	public static final ItemGroup TAB = FabricItemGroup.builder(new Identifier("macawsbridgesbyg", "macawsbridgesbyg_tab")).icon(() -> new ItemStack(MBBYGBlocksRegistry.aspen_log_bridge_middle)).build();
	
	@Override
	public void onInitialize()
	{
		MBBYGBlocksRegistry.registry();
		ItemGroupEvents.modifyEntriesEvent(TAB).register(content -> {
			content.add(MBBYGBlocksRegistry.aspen_log_bridge_middle);
			content.add(MBBYGBlocksRegistry.rope_aspen_bridge);
			content.add(MBBYGBlocksRegistry.aspen_bridge_pier);
			content.add(MBBYGBlocksRegistry.aspen_log_bridge_stair);
			content.add(MBBYGBlocksRegistry.aspen_rope_bridge_stair);
			content.add(MBBYGBlocksRegistry.aspen_rail_bridge);
			content.add(MBBYGBlocksRegistry.baobab_log_bridge_middle);
			content.add(MBBYGBlocksRegistry.rope_baobab_bridge);
			content.add(MBBYGBlocksRegistry.baobab_bridge_pier);
			content.add(MBBYGBlocksRegistry.baobab_log_bridge_stair);
			content.add(MBBYGBlocksRegistry.baobab_rope_bridge_stair);
			content.add(MBBYGBlocksRegistry.baobab_rail_bridge);
			content.add(MBBYGBlocksRegistry.blue_enchanted_log_bridge_middle);
			content.add(MBBYGBlocksRegistry.rope_blue_enchanted_bridge);
			content.add(MBBYGBlocksRegistry.blue_enchanted_bridge_pier);
			content.add(MBBYGBlocksRegistry.blue_enchanted_log_bridge_stair);
			content.add(MBBYGBlocksRegistry.blue_enchanted_rope_bridge_stair);
			content.add(MBBYGBlocksRegistry.blue_enchanted_rail_bridge);
			content.add(MBBYGBlocksRegistry.cherry_log_bridge_middle);
			content.add(MBBYGBlocksRegistry.rope_cherry_bridge);
			content.add(MBBYGBlocksRegistry.cherry_bridge_pier);
			content.add(MBBYGBlocksRegistry.cherry_log_bridge_stair);
			content.add(MBBYGBlocksRegistry.cherry_rope_bridge_stair);
			content.add(MBBYGBlocksRegistry.cherry_rail_bridge);
			content.add(MBBYGBlocksRegistry.cika_log_bridge_middle);
			content.add(MBBYGBlocksRegistry.rope_cika_bridge);
			content.add(MBBYGBlocksRegistry.cika_bridge_pier);
			content.add(MBBYGBlocksRegistry.cika_log_bridge_stair);
			content.add(MBBYGBlocksRegistry.cika_rope_bridge_stair);
			content.add(MBBYGBlocksRegistry.cika_rail_bridge);
			content.add(MBBYGBlocksRegistry.cypress_log_bridge_middle);
			content.add(MBBYGBlocksRegistry.rope_cypress_bridge);
			content.add(MBBYGBlocksRegistry.cypress_bridge_pier);
			content.add(MBBYGBlocksRegistry.cypress_log_bridge_stair);
			content.add(MBBYGBlocksRegistry.cypress_rope_bridge_stair);
			content.add(MBBYGBlocksRegistry.cypress_rail_bridge);
			content.add(MBBYGBlocksRegistry.ebony_log_bridge_middle);
			content.add(MBBYGBlocksRegistry.rope_ebony_bridge);
			content.add(MBBYGBlocksRegistry.ebony_bridge_pier);
			content.add(MBBYGBlocksRegistry.ebony_log_bridge_stair);
			content.add(MBBYGBlocksRegistry.ebony_rope_bridge_stair);
			content.add(MBBYGBlocksRegistry.ebony_rail_bridge);
			content.add(MBBYGBlocksRegistry.ether_log_bridge_middle);
			content.add(MBBYGBlocksRegistry.rope_ether_bridge);
			content.add(MBBYGBlocksRegistry.ether_bridge_pier);
			content.add(MBBYGBlocksRegistry.ether_log_bridge_stair);
			content.add(MBBYGBlocksRegistry.ether_rope_bridge_stair);
			content.add(MBBYGBlocksRegistry.ether_rail_bridge);
			content.add(MBBYGBlocksRegistry.fir_log_bridge_middle);
			content.add(MBBYGBlocksRegistry.rope_fir_bridge);
			content.add(MBBYGBlocksRegistry.fir_bridge_pier);
			content.add(MBBYGBlocksRegistry.fir_log_bridge_stair);
			content.add(MBBYGBlocksRegistry.fir_rope_bridge_stair);
			content.add(MBBYGBlocksRegistry.fir_rail_bridge);
			content.add(MBBYGBlocksRegistry.green_enchanted_log_bridge_middle);
			content.add(MBBYGBlocksRegistry.rope_green_enchanted_bridge);
			content.add(MBBYGBlocksRegistry.green_enchanted_bridge_pier);
			content.add(MBBYGBlocksRegistry.green_enchanted_log_bridge_stair);
			content.add(MBBYGBlocksRegistry.green_enchanted_rope_bridge_stair);
			content.add(MBBYGBlocksRegistry.green_enchanted_rail_bridge);
			content.add(MBBYGBlocksRegistry.holly_log_bridge_middle);
			content.add(MBBYGBlocksRegistry.rope_holly_bridge);
			content.add(MBBYGBlocksRegistry.holly_bridge_pier);
			content.add(MBBYGBlocksRegistry.holly_log_bridge_stair);
			content.add(MBBYGBlocksRegistry.holly_rope_bridge_stair);
			content.add(MBBYGBlocksRegistry.holly_rail_bridge);
			content.add(MBBYGBlocksRegistry.jacaranda_log_bridge_middle);
			content.add(MBBYGBlocksRegistry.rope_jacaranda_bridge);
			content.add(MBBYGBlocksRegistry.jacaranda_bridge_pier);
			content.add(MBBYGBlocksRegistry.jacaranda_log_bridge_stair);
			content.add(MBBYGBlocksRegistry.jacaranda_rope_bridge_stair);
			content.add(MBBYGBlocksRegistry.jacaranda_rail_bridge);
			content.add(MBBYGBlocksRegistry.lament_log_bridge_middle);
			content.add(MBBYGBlocksRegistry.rope_lament_bridge);
			content.add(MBBYGBlocksRegistry.lament_bridge_pier);
			content.add(MBBYGBlocksRegistry.lament_log_bridge_stair);
			content.add(MBBYGBlocksRegistry.lament_rope_bridge_stair);
			content.add(MBBYGBlocksRegistry.lament_rail_bridge);
			content.add(MBBYGBlocksRegistry.mahogany_log_bridge_middle);
			content.add(MBBYGBlocksRegistry.rope_mahogany_bridge);
			content.add(MBBYGBlocksRegistry.mahogany_bridge_pier);
			content.add(MBBYGBlocksRegistry.mahogany_log_bridge_stair);
			content.add(MBBYGBlocksRegistry.mahogany_rope_bridge_stair);
			content.add(MBBYGBlocksRegistry.mahogany_rail_bridge);
			content.add(MBBYGBlocksRegistry.white_mangrove_log_bridge_middle);
			content.add(MBBYGBlocksRegistry.rope_white_mangrove_bridge);
			content.add(MBBYGBlocksRegistry.white_mangrove_bridge_pier);
			content.add(MBBYGBlocksRegistry.white_mangrove_log_bridge_stair);
			content.add(MBBYGBlocksRegistry.white_mangrove_rope_bridge_stair);
			content.add(MBBYGBlocksRegistry.white_mangrove_rail_bridge);
			content.add(MBBYGBlocksRegistry.maple_log_bridge_middle);
			content.add(MBBYGBlocksRegistry.rope_maple_bridge);
			content.add(MBBYGBlocksRegistry.maple_bridge_pier);
			content.add(MBBYGBlocksRegistry.maple_log_bridge_stair);
			content.add(MBBYGBlocksRegistry.maple_rope_bridge_stair);
			content.add(MBBYGBlocksRegistry.maple_rail_bridge);
			content.add(MBBYGBlocksRegistry.nightshade_log_bridge_middle);
			content.add(MBBYGBlocksRegistry.rope_nightshade_bridge);
			content.add(MBBYGBlocksRegistry.nightshade_bridge_pier);
			content.add(MBBYGBlocksRegistry.nightshade_log_bridge_stair);
			content.add(MBBYGBlocksRegistry.nightshade_rope_bridge_stair);
			content.add(MBBYGBlocksRegistry.nightshade_rail_bridge);
			content.add(MBBYGBlocksRegistry.palm_log_bridge_middle);
			content.add(MBBYGBlocksRegistry.rope_palm_bridge);
			content.add(MBBYGBlocksRegistry.palm_bridge_pier);
			content.add(MBBYGBlocksRegistry.palm_log_bridge_stair);
			content.add(MBBYGBlocksRegistry.palm_rope_bridge_stair);
			content.add(MBBYGBlocksRegistry.palm_rail_bridge);
			content.add(MBBYGBlocksRegistry.pine_log_bridge_middle);
			content.add(MBBYGBlocksRegistry.rope_pine_bridge);
			content.add(MBBYGBlocksRegistry.pine_bridge_pier);
			content.add(MBBYGBlocksRegistry.pine_log_bridge_stair);
			content.add(MBBYGBlocksRegistry.pine_rope_bridge_stair);
			content.add(MBBYGBlocksRegistry.pine_rail_bridge);
			content.add(MBBYGBlocksRegistry.rainbow_eucalyptus_log_bridge_middle);
			content.add(MBBYGBlocksRegistry.rope_rainbow_eucalyptus_bridge);
			content.add(MBBYGBlocksRegistry.rainbow_eucalyptus_bridge_pier);
			content.add(MBBYGBlocksRegistry.rainbow_eucalyptus_log_bridge_stair);
			content.add(MBBYGBlocksRegistry.rainbow_eucalyptus_rope_bridge_stair);
			content.add(MBBYGBlocksRegistry.rainbow_eucalyptus_rail_bridge);
			content.add(MBBYGBlocksRegistry.redwood_log_bridge_middle);
			content.add(MBBYGBlocksRegistry.rope_redwood_bridge);
			content.add(MBBYGBlocksRegistry.redwood_bridge_pier);
			content.add(MBBYGBlocksRegistry.redwood_log_bridge_stair);
			content.add(MBBYGBlocksRegistry.redwood_rope_bridge_stair);
			content.add(MBBYGBlocksRegistry.redwood_rail_bridge);
			content.add(MBBYGBlocksRegistry.skyris_log_bridge_middle);
			content.add(MBBYGBlocksRegistry.rope_skyris_bridge);
			content.add(MBBYGBlocksRegistry.skyris_bridge_pier);
			content.add(MBBYGBlocksRegistry.skyris_log_bridge_stair);
			content.add(MBBYGBlocksRegistry.skyris_rope_bridge_stair);
			content.add(MBBYGBlocksRegistry.skyris_rail_bridge);
			content.add(MBBYGBlocksRegistry.willow_log_bridge_middle);
			content.add(MBBYGBlocksRegistry.rope_willow_bridge);
			content.add(MBBYGBlocksRegistry.willow_bridge_pier);
			content.add(MBBYGBlocksRegistry.willow_log_bridge_stair);
			content.add(MBBYGBlocksRegistry.willow_rope_bridge_stair);
			content.add(MBBYGBlocksRegistry.willow_rail_bridge);
			content.add(MBBYGBlocksRegistry.witch_hazel_log_bridge_middle);
			content.add(MBBYGBlocksRegistry.rope_witch_hazel_bridge);
			content.add(MBBYGBlocksRegistry.witch_hazel_bridge_pier);
			content.add(MBBYGBlocksRegistry.witch_hazel_log_bridge_stair);
			content.add(MBBYGBlocksRegistry.witch_hazel_rope_bridge_stair);
			content.add(MBBYGBlocksRegistry.witch_hazel_rail_bridge);
			content.add(MBBYGBlocksRegistry.zelkova_log_bridge_middle);
			content.add(MBBYGBlocksRegistry.rope_zelkova_bridge);
			content.add(MBBYGBlocksRegistry.zelkova_bridge_pier);
			content.add(MBBYGBlocksRegistry.zelkova_log_bridge_stair);
			content.add(MBBYGBlocksRegistry.zelkova_rope_bridge_stair);
			content.add(MBBYGBlocksRegistry.zelkova_rail_bridge);
			content.add(MBBYGBlocksRegistry.bulbis_log_bridge_middle);
			content.add(MBBYGBlocksRegistry.rope_bulbis_bridge);
			content.add(MBBYGBlocksRegistry.bulbis_bridge_pier);
			content.add(MBBYGBlocksRegistry.bulbis_log_bridge_stair);
			content.add(MBBYGBlocksRegistry.bulbis_rope_bridge_stair);
			content.add(MBBYGBlocksRegistry.bulbis_rail_bridge);
			content.add(MBBYGBlocksRegistry.imparius_log_bridge_middle);
			content.add(MBBYGBlocksRegistry.rope_imparius_bridge);
			content.add(MBBYGBlocksRegistry.imparius_bridge_pier);
			content.add(MBBYGBlocksRegistry.imparius_log_bridge_stair);
			content.add(MBBYGBlocksRegistry.imparius_rope_bridge_stair);
			content.add(MBBYGBlocksRegistry.imparius_rail_bridge);
			content.add(MBBYGBlocksRegistry.sythian_log_bridge_middle);
			content.add(MBBYGBlocksRegistry.rope_sythian_bridge);
			content.add(MBBYGBlocksRegistry.sythian_bridge_pier);
			content.add(MBBYGBlocksRegistry.sythian_log_bridge_stair);
			content.add(MBBYGBlocksRegistry.sythian_rope_bridge_stair);
			content.add(MBBYGBlocksRegistry.sythian_rail_bridge);
			
			content.add(MBBYGBlocksRegistry.cryptic_stone_bridge);content.add(MBBYGBlocksRegistry.cryptic_stone_bridge_pier);content.add(MBBYGBlocksRegistry.cryptic_stone_bridge_stair);content.add(MBBYGBlocksRegistry.balustrade_cryptic_stone_bridge);content.add(MBBYGBlocksRegistry.dacite_bricks_bridge);content.add(MBBYGBlocksRegistry.dacite_bricks_bridge_pier);content.add(MBBYGBlocksRegistry.dacite_bricks_bridge_stair);content.add(MBBYGBlocksRegistry.balustrade_dacite_bricks_bridge);content.add(MBBYGBlocksRegistry.polished_travertine_bridge);content.add(MBBYGBlocksRegistry.polished_travertine_bridge_pier);content.add(MBBYGBlocksRegistry.polished_travertine_bridge_stair);content.add(MBBYGBlocksRegistry.balustrade_polished_travertine_bridge);content.add(MBBYGBlocksRegistry.purpur_stone_bridge);content.add(MBBYGBlocksRegistry.purpur_stone_bridge_pier);content.add(MBBYGBlocksRegistry.purpur_stone_bridge_stair);content.add(MBBYGBlocksRegistry.balustrade_purpur_stone_bridge);content.add(MBBYGBlocksRegistry.red_rock_bricks_bridge);content.add(MBBYGBlocksRegistry.red_rock_bricks_bridge_pier);content.add(MBBYGBlocksRegistry.red_rock_bricks_bridge_stair);content.add(MBBYGBlocksRegistry.balustrade_red_rock_bricks_bridge);content.add(MBBYGBlocksRegistry.scoria_stone_bricks_bridge);content.add(MBBYGBlocksRegistry.scoria_stone_bricks_bridge_pier);content.add(MBBYGBlocksRegistry.scoria_stone_bricks_bridge_stair);content.add(MBBYGBlocksRegistry.balustrade_scoria_stone_bricks_bridge);content.add(MBBYGBlocksRegistry.soapstone_bricks_bridge);content.add(MBBYGBlocksRegistry.soapstone_bricks_bridge_pier);content.add(MBBYGBlocksRegistry.soapstone_bricks_bridge_stair);content.add(MBBYGBlocksRegistry.balustrade_soapstone_bricks_bridge);

		});
	}
}