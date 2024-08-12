package fr.samlegamer.macawsbridgesbyg;

import fr.samlegamer.macawsbridgesbyg.block.MBBYGBlocksRegistry;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.RenderTypeLookup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(value = MacawsBridgesBYG.MODID)
@Mod.EventBusSubscriber(modid = MacawsBridgesBYG.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class MacawsBridgesBYG
{
	public static final String MODID = "macawsbridgesbyg";
	public static final Tab CMT = new Tab("bridgesbyg_tab");

	public MacawsBridgesBYG()
	{
		FMLJavaModLoadingContext.get().getModEventBus().addListener(this::ClientSetup);
		IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
		MBBYGBlocksRegistry.ITEMS_REGISTRY.register(bus);
		MBBYGBlocksRegistry.BLOCKS_REGISTRY.register(bus);
	}
	
	private void ClientSetup(FMLClientSetupEvent event)
	{
		RenderTypeLookup.setRenderLayer(MBBYGBlocksRegistry.aspen_log_bridge_middle.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBBYGBlocksRegistry.aspen_rope_bridge_stair.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBBYGBlocksRegistry.rope_aspen_bridge.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBBYGBlocksRegistry.aspen_bridge_pier.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBBYGBlocksRegistry.aspen_log_bridge_stair.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBBYGBlocksRegistry.aspen_rail_bridge.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBBYGBlocksRegistry.baobab_log_bridge_middle.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBBYGBlocksRegistry.baobab_rope_bridge_stair.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBBYGBlocksRegistry.rope_baobab_bridge.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBBYGBlocksRegistry.baobab_bridge_pier.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBBYGBlocksRegistry.baobab_log_bridge_stair.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBBYGBlocksRegistry.baobab_rail_bridge.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBBYGBlocksRegistry.blue_enchanted_log_bridge_middle.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBBYGBlocksRegistry.blue_enchanted_rope_bridge_stair.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBBYGBlocksRegistry.rope_blue_enchanted_bridge.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBBYGBlocksRegistry.blue_enchanted_bridge_pier.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBBYGBlocksRegistry.blue_enchanted_log_bridge_stair.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBBYGBlocksRegistry.blue_enchanted_rail_bridge.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBBYGBlocksRegistry.cherry_log_bridge_middle.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBBYGBlocksRegistry.cherry_rope_bridge_stair.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBBYGBlocksRegistry.rope_cherry_bridge.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBBYGBlocksRegistry.cherry_bridge_pier.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBBYGBlocksRegistry.cherry_log_bridge_stair.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBBYGBlocksRegistry.cherry_rail_bridge.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBBYGBlocksRegistry.cika_log_bridge_middle.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBBYGBlocksRegistry.cika_rope_bridge_stair.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBBYGBlocksRegistry.rope_cika_bridge.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBBYGBlocksRegistry.cika_bridge_pier.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBBYGBlocksRegistry.cika_log_bridge_stair.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBBYGBlocksRegistry.cika_rail_bridge.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBBYGBlocksRegistry.cypress_log_bridge_middle.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBBYGBlocksRegistry.cypress_rope_bridge_stair.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBBYGBlocksRegistry.rope_cypress_bridge.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBBYGBlocksRegistry.cypress_bridge_pier.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBBYGBlocksRegistry.cypress_log_bridge_stair.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBBYGBlocksRegistry.cypress_rail_bridge.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBBYGBlocksRegistry.ebony_log_bridge_middle.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBBYGBlocksRegistry.ebony_rope_bridge_stair.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBBYGBlocksRegistry.rope_ebony_bridge.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBBYGBlocksRegistry.ebony_bridge_pier.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBBYGBlocksRegistry.ebony_log_bridge_stair.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBBYGBlocksRegistry.ebony_rail_bridge.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBBYGBlocksRegistry.ether_log_bridge_middle.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBBYGBlocksRegistry.ether_rope_bridge_stair.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBBYGBlocksRegistry.rope_ether_bridge.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBBYGBlocksRegistry.ether_bridge_pier.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBBYGBlocksRegistry.ether_log_bridge_stair.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBBYGBlocksRegistry.ether_rail_bridge.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBBYGBlocksRegistry.fir_log_bridge_middle.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBBYGBlocksRegistry.fir_rope_bridge_stair.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBBYGBlocksRegistry.rope_fir_bridge.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBBYGBlocksRegistry.fir_bridge_pier.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBBYGBlocksRegistry.fir_log_bridge_stair.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBBYGBlocksRegistry.fir_rail_bridge.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBBYGBlocksRegistry.green_enchanted_log_bridge_middle.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBBYGBlocksRegistry.green_enchanted_rope_bridge_stair.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBBYGBlocksRegistry.rope_green_enchanted_bridge.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBBYGBlocksRegistry.green_enchanted_bridge_pier.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBBYGBlocksRegistry.green_enchanted_log_bridge_stair.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBBYGBlocksRegistry.green_enchanted_rail_bridge.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBBYGBlocksRegistry.holly_log_bridge_middle.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBBYGBlocksRegistry.holly_rope_bridge_stair.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBBYGBlocksRegistry.rope_holly_bridge.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBBYGBlocksRegistry.holly_bridge_pier.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBBYGBlocksRegistry.holly_log_bridge_stair.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBBYGBlocksRegistry.holly_rail_bridge.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBBYGBlocksRegistry.jacaranda_log_bridge_middle.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBBYGBlocksRegistry.jacaranda_rope_bridge_stair.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBBYGBlocksRegistry.rope_jacaranda_bridge.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBBYGBlocksRegistry.jacaranda_bridge_pier.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBBYGBlocksRegistry.jacaranda_log_bridge_stair.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBBYGBlocksRegistry.jacaranda_rail_bridge.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBBYGBlocksRegistry.lament_log_bridge_middle.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBBYGBlocksRegistry.lament_rope_bridge_stair.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBBYGBlocksRegistry.rope_lament_bridge.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBBYGBlocksRegistry.lament_bridge_pier.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBBYGBlocksRegistry.lament_log_bridge_stair.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBBYGBlocksRegistry.lament_rail_bridge.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBBYGBlocksRegistry.mahogany_log_bridge_middle.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBBYGBlocksRegistry.mahogany_rope_bridge_stair.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBBYGBlocksRegistry.rope_mahogany_bridge.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBBYGBlocksRegistry.mahogany_bridge_pier.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBBYGBlocksRegistry.mahogany_log_bridge_stair.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBBYGBlocksRegistry.mahogany_rail_bridge.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBBYGBlocksRegistry.mangrove_log_bridge_middle.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBBYGBlocksRegistry.mangrove_rope_bridge_stair.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBBYGBlocksRegistry.rope_mangrove_bridge.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBBYGBlocksRegistry.mangrove_bridge_pier.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBBYGBlocksRegistry.mangrove_log_bridge_stair.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBBYGBlocksRegistry.mangrove_rail_bridge.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBBYGBlocksRegistry.maple_log_bridge_middle.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBBYGBlocksRegistry.maple_rope_bridge_stair.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBBYGBlocksRegistry.rope_maple_bridge.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBBYGBlocksRegistry.maple_bridge_pier.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBBYGBlocksRegistry.maple_log_bridge_stair.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBBYGBlocksRegistry.maple_rail_bridge.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBBYGBlocksRegistry.nightshade_log_bridge_middle.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBBYGBlocksRegistry.nightshade_rope_bridge_stair.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBBYGBlocksRegistry.rope_nightshade_bridge.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBBYGBlocksRegistry.nightshade_bridge_pier.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBBYGBlocksRegistry.nightshade_log_bridge_stair.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBBYGBlocksRegistry.nightshade_rail_bridge.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBBYGBlocksRegistry.palm_log_bridge_middle.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBBYGBlocksRegistry.palm_rope_bridge_stair.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBBYGBlocksRegistry.rope_palm_bridge.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBBYGBlocksRegistry.palm_bridge_pier.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBBYGBlocksRegistry.palm_log_bridge_stair.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBBYGBlocksRegistry.palm_rail_bridge.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBBYGBlocksRegistry.pine_log_bridge_middle.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBBYGBlocksRegistry.pine_rope_bridge_stair.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBBYGBlocksRegistry.rope_pine_bridge.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBBYGBlocksRegistry.pine_bridge_pier.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBBYGBlocksRegistry.pine_log_bridge_stair.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBBYGBlocksRegistry.pine_rail_bridge.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBBYGBlocksRegistry.rainbow_eucalyptus_log_bridge_middle.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBBYGBlocksRegistry.rainbow_eucalyptus_rope_bridge_stair.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBBYGBlocksRegistry.rope_rainbow_eucalyptus_bridge.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBBYGBlocksRegistry.rainbow_eucalyptus_bridge_pier.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBBYGBlocksRegistry.rainbow_eucalyptus_log_bridge_stair.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBBYGBlocksRegistry.rainbow_eucalyptus_rail_bridge.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBBYGBlocksRegistry.redwood_log_bridge_middle.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBBYGBlocksRegistry.redwood_rope_bridge_stair.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBBYGBlocksRegistry.rope_redwood_bridge.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBBYGBlocksRegistry.redwood_bridge_pier.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBBYGBlocksRegistry.redwood_log_bridge_stair.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBBYGBlocksRegistry.redwood_rail_bridge.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBBYGBlocksRegistry.skyris_log_bridge_middle.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBBYGBlocksRegistry.skyris_rope_bridge_stair.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBBYGBlocksRegistry.rope_skyris_bridge.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBBYGBlocksRegistry.skyris_bridge_pier.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBBYGBlocksRegistry.skyris_log_bridge_stair.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBBYGBlocksRegistry.skyris_rail_bridge.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBBYGBlocksRegistry.willow_log_bridge_middle.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBBYGBlocksRegistry.willow_rope_bridge_stair.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBBYGBlocksRegistry.rope_willow_bridge.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBBYGBlocksRegistry.willow_bridge_pier.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBBYGBlocksRegistry.willow_log_bridge_stair.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBBYGBlocksRegistry.willow_rail_bridge.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBBYGBlocksRegistry.witch_hazel_log_bridge_middle.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBBYGBlocksRegistry.witch_hazel_rope_bridge_stair.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBBYGBlocksRegistry.rope_witch_hazel_bridge.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBBYGBlocksRegistry.witch_hazel_bridge_pier.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBBYGBlocksRegistry.witch_hazel_log_bridge_stair.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBBYGBlocksRegistry.witch_hazel_rail_bridge.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBBYGBlocksRegistry.zelkova_log_bridge_middle.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBBYGBlocksRegistry.zelkova_rope_bridge_stair.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBBYGBlocksRegistry.rope_zelkova_bridge.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBBYGBlocksRegistry.zelkova_bridge_pier.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBBYGBlocksRegistry.zelkova_log_bridge_stair.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBBYGBlocksRegistry.zelkova_rail_bridge.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBBYGBlocksRegistry.bulbis_log_bridge_middle.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBBYGBlocksRegistry.bulbis_rope_bridge_stair.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBBYGBlocksRegistry.rope_bulbis_bridge.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBBYGBlocksRegistry.bulbis_bridge_pier.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBBYGBlocksRegistry.bulbis_log_bridge_stair.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBBYGBlocksRegistry.bulbis_rail_bridge.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBBYGBlocksRegistry.imparius_log_bridge_middle.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBBYGBlocksRegistry.imparius_rope_bridge_stair.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBBYGBlocksRegistry.rope_imparius_bridge.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBBYGBlocksRegistry.imparius_bridge_pier.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBBYGBlocksRegistry.imparius_log_bridge_stair.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBBYGBlocksRegistry.imparius_rail_bridge.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBBYGBlocksRegistry.sythian_log_bridge_middle.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBBYGBlocksRegistry.sythian_rope_bridge_stair.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBBYGBlocksRegistry.rope_sythian_bridge.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBBYGBlocksRegistry.sythian_bridge_pier.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBBYGBlocksRegistry.sythian_log_bridge_stair.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBBYGBlocksRegistry.sythian_rail_bridge.get(), RenderType.cutout());

		RenderTypeLookup.setRenderLayer(MBBYGBlocksRegistry.cryptic_stone_bridge.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBBYGBlocksRegistry.cryptic_stone_bridge_pier.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBBYGBlocksRegistry.cryptic_stone_bridge_stair.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBBYGBlocksRegistry.balustrade_cryptic_stone_bridge.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBBYGBlocksRegistry.dacite_bricks_bridge.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBBYGBlocksRegistry.dacite_bricks_bridge_pier.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBBYGBlocksRegistry.dacite_bricks_bridge_stair.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBBYGBlocksRegistry.balustrade_dacite_bricks_bridge.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBBYGBlocksRegistry.polished_travertine_bridge.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBBYGBlocksRegistry.polished_travertine_bridge_pier.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBBYGBlocksRegistry.polished_travertine_bridge_stair.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBBYGBlocksRegistry.balustrade_polished_travertine_bridge.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBBYGBlocksRegistry.purpur_stone_bridge.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBBYGBlocksRegistry.purpur_stone_bridge_pier.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBBYGBlocksRegistry.purpur_stone_bridge_stair.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBBYGBlocksRegistry.balustrade_purpur_stone_bridge.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBBYGBlocksRegistry.red_rock_bricks_bridge.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBBYGBlocksRegistry.red_rock_bricks_bridge_pier.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBBYGBlocksRegistry.red_rock_bricks_bridge_stair.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBBYGBlocksRegistry.balustrade_red_rock_bricks_bridge.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBBYGBlocksRegistry.scoria_stone_bricks_bridge.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBBYGBlocksRegistry.scoria_stone_bricks_bridge_pier.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBBYGBlocksRegistry.scoria_stone_bricks_bridge_stair.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBBYGBlocksRegistry.balustrade_scoria_stone_bricks_bridge.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBBYGBlocksRegistry.soapstone_bricks_bridge.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBBYGBlocksRegistry.soapstone_bricks_bridge_pier.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBBYGBlocksRegistry.soapstone_bricks_bridge_stair.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBBYGBlocksRegistry.balustrade_soapstone_bricks_bridge.get(), RenderType.cutout());
	}

	static class Tab extends ItemGroup
	{
		public Tab(String label) { super(label); }
		
		@Override
		public ItemStack makeIcon()
		{
			return new ItemStack(MBBYGBlocksRegistry.aspen_log_bridge_middle.get());
		}
	}
}