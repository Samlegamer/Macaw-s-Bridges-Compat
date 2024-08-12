package fr.samlegamer.macawsbridgesbyg;

import fr.samlegamer.macawsbridgesbyg.block.MBBYGBlocksRegistry;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(value = MacawsBridgesBYG.MODID)
public class MacawsBridgesBYG
{
	public static final String MODID = "macawsbridgesbyg";
	
	public MacawsBridgesBYG()
	{
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::AddTab);
		IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
		MBBYGBlocksRegistry.ITEMS_REGISTRY.register(bus);
		MBBYGBlocksRegistry.BLOCKS_REGISTRY.register(bus);
		MBBYGBlocksRegistry.Item_Group.register(bus);
	}
	    
    private void AddTab(BuildCreativeModeTabContentsEvent event)
    {
    	 if (event.getTab() == MBBYGBlocksRegistry.MB_BYG.get())
    	 {
    		 event.accept(MBBYGBlocksRegistry.aspen_log_bridge_middle.get());

    		 event.accept(MBBYGBlocksRegistry.rope_aspen_bridge.get());

    		 event.accept(MBBYGBlocksRegistry.aspen_bridge_pier.get());

    		 event.accept(MBBYGBlocksRegistry.aspen_log_bridge_stair.get());

    		 event.accept(MBBYGBlocksRegistry.aspen_rope_bridge_stair.get());

    		 event.accept(MBBYGBlocksRegistry.aspen_rail_bridge.get());

    		 event.accept(MBBYGBlocksRegistry.baobab_log_bridge_middle.get());

    		 event.accept(MBBYGBlocksRegistry.rope_baobab_bridge.get());

    		 event.accept(MBBYGBlocksRegistry.baobab_bridge_pier.get());

    		 event.accept(MBBYGBlocksRegistry.baobab_log_bridge_stair.get());

    		 event.accept(MBBYGBlocksRegistry.baobab_rope_bridge_stair.get());

    		 event.accept(MBBYGBlocksRegistry.baobab_rail_bridge.get());

    		 event.accept(MBBYGBlocksRegistry.blue_enchanted_log_bridge_middle.get());

    		 event.accept(MBBYGBlocksRegistry.rope_blue_enchanted_bridge.get());

    		 event.accept(MBBYGBlocksRegistry.blue_enchanted_bridge_pier.get());

    		 event.accept(MBBYGBlocksRegistry.blue_enchanted_log_bridge_stair.get());

    		 event.accept(MBBYGBlocksRegistry.blue_enchanted_rope_bridge_stair.get());

    		 event.accept(MBBYGBlocksRegistry.blue_enchanted_rail_bridge.get());

    		 event.accept(MBBYGBlocksRegistry.cika_log_bridge_middle.get());

    		 event.accept(MBBYGBlocksRegistry.rope_cika_bridge.get());

    		 event.accept(MBBYGBlocksRegistry.cika_bridge_pier.get());

    		 event.accept(MBBYGBlocksRegistry.cika_log_bridge_stair.get());

    		 event.accept(MBBYGBlocksRegistry.cika_rope_bridge_stair.get());

    		 event.accept(MBBYGBlocksRegistry.cika_rail_bridge.get());

    		 event.accept(MBBYGBlocksRegistry.cypress_log_bridge_middle.get());

    		 event.accept(MBBYGBlocksRegistry.rope_cypress_bridge.get());

    		 event.accept(MBBYGBlocksRegistry.cypress_bridge_pier.get());

    		 event.accept(MBBYGBlocksRegistry.cypress_log_bridge_stair.get());

    		 event.accept(MBBYGBlocksRegistry.cypress_rope_bridge_stair.get());

    		 event.accept(MBBYGBlocksRegistry.cypress_rail_bridge.get());

    		 event.accept(MBBYGBlocksRegistry.ebony_log_bridge_middle.get());

    		 event.accept(MBBYGBlocksRegistry.rope_ebony_bridge.get());

    		 event.accept(MBBYGBlocksRegistry.ebony_bridge_pier.get());

    		 event.accept(MBBYGBlocksRegistry.ebony_log_bridge_stair.get());

    		 event.accept(MBBYGBlocksRegistry.ebony_rope_bridge_stair.get());

    		 event.accept(MBBYGBlocksRegistry.ebony_rail_bridge.get());

    		 event.accept(MBBYGBlocksRegistry.fir_log_bridge_middle.get());

    		 event.accept(MBBYGBlocksRegistry.rope_fir_bridge.get());

    		 event.accept(MBBYGBlocksRegistry.fir_bridge_pier.get());

    		 event.accept(MBBYGBlocksRegistry.fir_log_bridge_stair.get());

    		 event.accept(MBBYGBlocksRegistry.fir_rope_bridge_stair.get());

    		 event.accept(MBBYGBlocksRegistry.fir_rail_bridge.get());

    		 event.accept(MBBYGBlocksRegistry.green_enchanted_log_bridge_middle.get());

    		 event.accept(MBBYGBlocksRegistry.rope_green_enchanted_bridge.get());

    		 event.accept(MBBYGBlocksRegistry.green_enchanted_bridge_pier.get());

    		 event.accept(MBBYGBlocksRegistry.green_enchanted_log_bridge_stair.get());

    		 event.accept(MBBYGBlocksRegistry.green_enchanted_rope_bridge_stair.get());

    		 event.accept(MBBYGBlocksRegistry.green_enchanted_rail_bridge.get());

    		 event.accept(MBBYGBlocksRegistry.holly_log_bridge_middle.get());

    		 event.accept(MBBYGBlocksRegistry.rope_holly_bridge.get());

    		 event.accept(MBBYGBlocksRegistry.holly_bridge_pier.get());

    		 event.accept(MBBYGBlocksRegistry.holly_log_bridge_stair.get());

    		 event.accept(MBBYGBlocksRegistry.holly_rope_bridge_stair.get());

    		 event.accept(MBBYGBlocksRegistry.holly_rail_bridge.get());

    		 event.accept(MBBYGBlocksRegistry.ironwood_log_bridge_middle.get());

    		 event.accept(MBBYGBlocksRegistry.rope_ironwood_bridge.get());

    		 event.accept(MBBYGBlocksRegistry.ironwood_bridge_pier.get());

    		 event.accept(MBBYGBlocksRegistry.ironwood_log_bridge_stair.get());

    		 event.accept(MBBYGBlocksRegistry.ironwood_rope_bridge_stair.get());

    		 event.accept(MBBYGBlocksRegistry.ironwood_rail_bridge.get());

    		 event.accept(MBBYGBlocksRegistry.jacaranda_log_bridge_middle.get());

    		 event.accept(MBBYGBlocksRegistry.rope_jacaranda_bridge.get());

    		 event.accept(MBBYGBlocksRegistry.jacaranda_bridge_pier.get());

    		 event.accept(MBBYGBlocksRegistry.jacaranda_log_bridge_stair.get());

    		 event.accept(MBBYGBlocksRegistry.jacaranda_rope_bridge_stair.get());

    		 event.accept(MBBYGBlocksRegistry.jacaranda_rail_bridge.get());

    		 event.accept(MBBYGBlocksRegistry.mahogany_log_bridge_middle.get());

    		 event.accept(MBBYGBlocksRegistry.rope_mahogany_bridge.get());

    		 event.accept(MBBYGBlocksRegistry.mahogany_bridge_pier.get());

    		 event.accept(MBBYGBlocksRegistry.mahogany_log_bridge_stair.get());

    		 event.accept(MBBYGBlocksRegistry.mahogany_rope_bridge_stair.get());

    		 event.accept(MBBYGBlocksRegistry.mahogany_rail_bridge.get());

    		 event.accept(MBBYGBlocksRegistry.maple_log_bridge_middle.get());

    		 event.accept(MBBYGBlocksRegistry.rope_maple_bridge.get());

    		 event.accept(MBBYGBlocksRegistry.maple_bridge_pier.get());

    		 event.accept(MBBYGBlocksRegistry.maple_log_bridge_stair.get());

    		 event.accept(MBBYGBlocksRegistry.maple_rope_bridge_stair.get());

    		 event.accept(MBBYGBlocksRegistry.maple_rail_bridge.get());

    		 event.accept(MBBYGBlocksRegistry.palm_log_bridge_middle.get());

    		 event.accept(MBBYGBlocksRegistry.rope_palm_bridge.get());

    		 event.accept(MBBYGBlocksRegistry.palm_bridge_pier.get());

    		 event.accept(MBBYGBlocksRegistry.palm_log_bridge_stair.get());

    		 event.accept(MBBYGBlocksRegistry.palm_rope_bridge_stair.get());

    		 event.accept(MBBYGBlocksRegistry.palm_rail_bridge.get());

    		 event.accept(MBBYGBlocksRegistry.pine_log_bridge_middle.get());

    		 event.accept(MBBYGBlocksRegistry.rope_pine_bridge.get());

    		 event.accept(MBBYGBlocksRegistry.pine_bridge_pier.get());

    		 event.accept(MBBYGBlocksRegistry.pine_log_bridge_stair.get());

    		 event.accept(MBBYGBlocksRegistry.pine_rope_bridge_stair.get());

    		 event.accept(MBBYGBlocksRegistry.pine_rail_bridge.get());

    		 event.accept(MBBYGBlocksRegistry.rainbow_eucalyptus_log_bridge_middle.get());

    		 event.accept(MBBYGBlocksRegistry.rope_rainbow_eucalyptus_bridge.get());

    		 event.accept(MBBYGBlocksRegistry.rainbow_eucalyptus_bridge_pier.get());

    		 event.accept(MBBYGBlocksRegistry.rainbow_eucalyptus_log_bridge_stair.get());

    		 event.accept(MBBYGBlocksRegistry.rainbow_eucalyptus_rope_bridge_stair.get());

    		 event.accept(MBBYGBlocksRegistry.rainbow_eucalyptus_rail_bridge.get());

    		 event.accept(MBBYGBlocksRegistry.redwood_log_bridge_middle.get());

    		 event.accept(MBBYGBlocksRegistry.rope_redwood_bridge.get());

    		 event.accept(MBBYGBlocksRegistry.redwood_bridge_pier.get());

    		 event.accept(MBBYGBlocksRegistry.redwood_log_bridge_stair.get());

    		 event.accept(MBBYGBlocksRegistry.redwood_rope_bridge_stair.get());

    		 event.accept(MBBYGBlocksRegistry.redwood_rail_bridge.get());

    		 event.accept(MBBYGBlocksRegistry.sakura_log_bridge_middle.get());

    		 event.accept(MBBYGBlocksRegistry.rope_sakura_bridge.get());

    		 event.accept(MBBYGBlocksRegistry.sakura_bridge_pier.get());

    		 event.accept(MBBYGBlocksRegistry.sakura_log_bridge_stair.get());

    		 event.accept(MBBYGBlocksRegistry.sakura_rope_bridge_stair.get());

    		 event.accept(MBBYGBlocksRegistry.sakura_rail_bridge.get());

    		 event.accept(MBBYGBlocksRegistry.skyris_log_bridge_middle.get());

    		 event.accept(MBBYGBlocksRegistry.rope_skyris_bridge.get());

    		 event.accept(MBBYGBlocksRegistry.skyris_bridge_pier.get());

    		 event.accept(MBBYGBlocksRegistry.skyris_log_bridge_stair.get());

    		 event.accept(MBBYGBlocksRegistry.skyris_rope_bridge_stair.get());

    		 event.accept(MBBYGBlocksRegistry.skyris_rail_bridge.get());

    		 event.accept(MBBYGBlocksRegistry.white_mangrove_log_bridge_middle.get());

    		 event.accept(MBBYGBlocksRegistry.rope_white_mangrove_bridge.get());

    		 event.accept(MBBYGBlocksRegistry.white_mangrove_bridge_pier.get());

    		 event.accept(MBBYGBlocksRegistry.white_mangrove_log_bridge_stair.get());

    		 event.accept(MBBYGBlocksRegistry.white_mangrove_rope_bridge_stair.get());

    		 event.accept(MBBYGBlocksRegistry.white_mangrove_rail_bridge.get());

    		 event.accept(MBBYGBlocksRegistry.willow_log_bridge_middle.get());

    		 event.accept(MBBYGBlocksRegistry.rope_willow_bridge.get());

    		 event.accept(MBBYGBlocksRegistry.willow_bridge_pier.get());

    		 event.accept(MBBYGBlocksRegistry.willow_log_bridge_stair.get());

    		 event.accept(MBBYGBlocksRegistry.willow_rope_bridge_stair.get());

    		 event.accept(MBBYGBlocksRegistry.willow_rail_bridge.get());

    		 event.accept(MBBYGBlocksRegistry.witch_hazel_log_bridge_middle.get());

    		 event.accept(MBBYGBlocksRegistry.rope_witch_hazel_bridge.get());

    		 event.accept(MBBYGBlocksRegistry.witch_hazel_bridge_pier.get());

    		 event.accept(MBBYGBlocksRegistry.witch_hazel_log_bridge_stair.get());

    		 event.accept(MBBYGBlocksRegistry.witch_hazel_rope_bridge_stair.get());

    		 event.accept(MBBYGBlocksRegistry.witch_hazel_rail_bridge.get());

    		 event.accept(MBBYGBlocksRegistry.zelkova_log_bridge_middle.get());

    		 event.accept(MBBYGBlocksRegistry.rope_zelkova_bridge.get());

    		 event.accept(MBBYGBlocksRegistry.zelkova_bridge_pier.get());

    		 event.accept(MBBYGBlocksRegistry.zelkova_log_bridge_stair.get());

    		 event.accept(MBBYGBlocksRegistry.zelkova_rope_bridge_stair.get());

    		 event.accept(MBBYGBlocksRegistry.zelkova_rail_bridge.get());

    		 event.accept(MBBYGBlocksRegistry.florus_log_bridge_middle.get());

    		 event.accept(MBBYGBlocksRegistry.rope_florus_bridge.get());

    		 event.accept(MBBYGBlocksRegistry.florus_bridge_pier.get());

    		 event.accept(MBBYGBlocksRegistry.florus_log_bridge_stair.get());

    		 event.accept(MBBYGBlocksRegistry.florus_rope_bridge_stair.get());

    		 event.accept(MBBYGBlocksRegistry.florus_rail_bridge.get());

    		 event.accept(MBBYGBlocksRegistry.dacite_bricks_bridge.get());
    		 event.accept(MBBYGBlocksRegistry.dacite_bricks_bridge_pier.get());
    		 event.accept(MBBYGBlocksRegistry.dacite_bricks_bridge_stair.get());
    		 event.accept(MBBYGBlocksRegistry.balustrade_dacite_bricks_bridge.get());
    		 event.accept(MBBYGBlocksRegistry.red_rock_bricks_bridge.get());
    		 event.accept(MBBYGBlocksRegistry.red_rock_bricks_bridge_pier.get());
    		 event.accept(MBBYGBlocksRegistry.red_rock_bricks_bridge_stair.get());
    		 event.accept(MBBYGBlocksRegistry.balustrade_red_rock_bricks_bridge.get());
    		 event.accept(MBBYGBlocksRegistry.pink_sandstone_bridge.get());
    		 event.accept(MBBYGBlocksRegistry.pink_sandstone_bridge_pier.get());
    		 event.accept(MBBYGBlocksRegistry.pink_sandstone_bridge_stair.get());
    		 event.accept(MBBYGBlocksRegistry.balustrade_pink_sandstone_bridge.get());
    		 event.accept(MBBYGBlocksRegistry.white_sandstone_bridge.get());
    		 event.accept(MBBYGBlocksRegistry.white_sandstone_bridge_pier.get());
    		 event.accept(MBBYGBlocksRegistry.white_sandstone_bridge_stair.get());
    		 event.accept(MBBYGBlocksRegistry.balustrade_white_sandstone_bridge.get());
    		 event.accept(MBBYGBlocksRegistry.blue_sandstone_bridge.get());
    		 event.accept(MBBYGBlocksRegistry.blue_sandstone_bridge_pier.get());
    		 event.accept(MBBYGBlocksRegistry.blue_sandstone_bridge_stair.get());
    		 event.accept(MBBYGBlocksRegistry.balustrade_blue_sandstone_bridge.get());
    		 event.accept(MBBYGBlocksRegistry.purple_sandstone_bridge.get());
    		 event.accept(MBBYGBlocksRegistry.purple_sandstone_bridge_pier.get());
    		 event.accept(MBBYGBlocksRegistry.purple_sandstone_bridge_stair.get());
    		 event.accept(MBBYGBlocksRegistry.balustrade_purple_sandstone_bridge.get());
    		 event.accept(MBBYGBlocksRegistry.black_sandstone_bridge.get());
    		 event.accept(MBBYGBlocksRegistry.black_sandstone_bridge_pier.get());
    		 event.accept(MBBYGBlocksRegistry.black_sandstone_bridge_stair.get());
    		 event.accept(MBBYGBlocksRegistry.balustrade_black_sandstone_bridge.get());
    		 event.accept(MBBYGBlocksRegistry.windswept_sandstone_bridge.get());
    		 event.accept(MBBYGBlocksRegistry.windswept_sandstone_bridge_pier.get());
    		 event.accept(MBBYGBlocksRegistry.windswept_sandstone_bridge_stair.get());
    		 event.accept(MBBYGBlocksRegistry.balustrade_windswept_sandstone_bridge.get());

    		 //Finish
    	 }
    }
}