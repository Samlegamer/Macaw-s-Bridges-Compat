package fr.samlegamer.macawsbridgesbyg;

import fr.samlegamer.macawsbridgesbyg.block.MBBYGBlocksRegistry;
import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.event.CreativeModeTabEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(value = MacawsBridgesBYG.MODID)
@Mod.EventBusSubscriber(modid = MacawsBridgesBYG.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class MacawsBridgesBYG
{
	public static final String MODID = "macawsbridgesbyg";
	private static CreativeModeTab MB_BYG;
	
	public MacawsBridgesBYG()
	{
		FMLJavaModLoadingContext.get().getModEventBus().addListener(this::CreateTab);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::AddTab);
		FMLJavaModLoadingContext.get().getModEventBus().addListener(this::ClientSetup);
		IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
		MBBYGBlocksRegistry.ITEMS_REGISTRY.register(bus);
		MBBYGBlocksRegistry.BLOCKS_REGISTRY.register(bus);
	}
	
	private void ClientSetup(FMLClientSetupEvent event)
	{     	
		ItemBlockRenderTypes.setRenderLayer(MBBYGBlocksRegistry.aspen_log_bridge_middle.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MBBYGBlocksRegistry.baobab_log_bridge_middle.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MBBYGBlocksRegistry.blue_enchanted_log_bridge_middle.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MBBYGBlocksRegistry.cherry_log_bridge_middle.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MBBYGBlocksRegistry.cika_log_bridge_middle.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MBBYGBlocksRegistry.cypress_log_bridge_middle.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MBBYGBlocksRegistry.ebony_log_bridge_middle.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MBBYGBlocksRegistry.ether_log_bridge_middle.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MBBYGBlocksRegistry.fir_log_bridge_middle.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MBBYGBlocksRegistry.green_enchanted_log_bridge_middle.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MBBYGBlocksRegistry.holly_log_bridge_middle.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MBBYGBlocksRegistry.jacaranda_log_bridge_middle.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MBBYGBlocksRegistry.lament_log_bridge_middle.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MBBYGBlocksRegistry.mahogany_log_bridge_middle.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MBBYGBlocksRegistry.white_mangrove_log_bridge_middle.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MBBYGBlocksRegistry.maple_log_bridge_middle.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MBBYGBlocksRegistry.nightshade_log_bridge_middle.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MBBYGBlocksRegistry.palm_log_bridge_middle.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MBBYGBlocksRegistry.pine_log_bridge_middle.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MBBYGBlocksRegistry.rainbow_eucalyptus_log_bridge_middle.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MBBYGBlocksRegistry.redwood_log_bridge_middle.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MBBYGBlocksRegistry.skyris_log_bridge_middle.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MBBYGBlocksRegistry.willow_log_bridge_middle.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MBBYGBlocksRegistry.witch_hazel_log_bridge_middle.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MBBYGBlocksRegistry.zelkova_log_bridge_middle.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MBBYGBlocksRegistry.bulbis_log_bridge_middle.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MBBYGBlocksRegistry.imparius_log_bridge_middle.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MBBYGBlocksRegistry.sythian_log_bridge_middle.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MBBYGBlocksRegistry.aspen_bridge_pier.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MBBYGBlocksRegistry.baobab_bridge_pier.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MBBYGBlocksRegistry.blue_enchanted_bridge_pier.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MBBYGBlocksRegistry.cherry_bridge_pier.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MBBYGBlocksRegistry.cika_bridge_pier.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MBBYGBlocksRegistry.cypress_bridge_pier.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MBBYGBlocksRegistry.ebony_bridge_pier.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MBBYGBlocksRegistry.ether_bridge_pier.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MBBYGBlocksRegistry.fir_bridge_pier.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MBBYGBlocksRegistry.green_enchanted_bridge_pier.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MBBYGBlocksRegistry.holly_bridge_pier.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MBBYGBlocksRegistry.jacaranda_bridge_pier.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MBBYGBlocksRegistry.lament_bridge_pier.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MBBYGBlocksRegistry.mahogany_bridge_pier.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MBBYGBlocksRegistry.white_mangrove_bridge_pier.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MBBYGBlocksRegistry.maple_bridge_pier.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MBBYGBlocksRegistry.nightshade_bridge_pier.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MBBYGBlocksRegistry.palm_bridge_pier.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MBBYGBlocksRegistry.pine_bridge_pier.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MBBYGBlocksRegistry.rainbow_eucalyptus_bridge_pier.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MBBYGBlocksRegistry.redwood_bridge_pier.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MBBYGBlocksRegistry.skyris_bridge_pier.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MBBYGBlocksRegistry.willow_bridge_pier.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MBBYGBlocksRegistry.witch_hazel_bridge_pier.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MBBYGBlocksRegistry.zelkova_bridge_pier.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MBBYGBlocksRegistry.bulbis_bridge_pier.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MBBYGBlocksRegistry.imparius_bridge_pier.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MBBYGBlocksRegistry.sythian_bridge_pier.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MBBYGBlocksRegistry.aspen_rail_bridge.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MBBYGBlocksRegistry.baobab_rail_bridge.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MBBYGBlocksRegistry.blue_enchanted_rail_bridge.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MBBYGBlocksRegistry.cherry_rail_bridge.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MBBYGBlocksRegistry.cika_rail_bridge.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MBBYGBlocksRegistry.cypress_rail_bridge.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MBBYGBlocksRegistry.ebony_rail_bridge.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MBBYGBlocksRegistry.ether_rail_bridge.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MBBYGBlocksRegistry.fir_rail_bridge.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MBBYGBlocksRegistry.green_enchanted_rail_bridge.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MBBYGBlocksRegistry.holly_rail_bridge.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MBBYGBlocksRegistry.jacaranda_rail_bridge.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MBBYGBlocksRegistry.lament_rail_bridge.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MBBYGBlocksRegistry.mahogany_rail_bridge.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MBBYGBlocksRegistry.white_mangrove_rail_bridge.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MBBYGBlocksRegistry.maple_rail_bridge.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MBBYGBlocksRegistry.nightshade_rail_bridge.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MBBYGBlocksRegistry.palm_rail_bridge.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MBBYGBlocksRegistry.pine_rail_bridge.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MBBYGBlocksRegistry.rainbow_eucalyptus_rail_bridge.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MBBYGBlocksRegistry.redwood_rail_bridge.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MBBYGBlocksRegistry.skyris_rail_bridge.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MBBYGBlocksRegistry.willow_rail_bridge.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MBBYGBlocksRegistry.witch_hazel_rail_bridge.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MBBYGBlocksRegistry.zelkova_rail_bridge.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MBBYGBlocksRegistry.bulbis_rail_bridge.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MBBYGBlocksRegistry.imparius_rail_bridge.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MBBYGBlocksRegistry.sythian_rail_bridge.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MBBYGBlocksRegistry.rope_aspen_bridge.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MBBYGBlocksRegistry.rope_baobab_bridge.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MBBYGBlocksRegistry.rope_blue_enchanted_bridge.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MBBYGBlocksRegistry.rope_cherry_bridge.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MBBYGBlocksRegistry.rope_cika_bridge.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MBBYGBlocksRegistry.rope_cypress_bridge.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MBBYGBlocksRegistry.rope_ebony_bridge.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MBBYGBlocksRegistry.rope_ether_bridge.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MBBYGBlocksRegistry.rope_fir_bridge.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MBBYGBlocksRegistry.rope_green_enchanted_bridge.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MBBYGBlocksRegistry.rope_holly_bridge.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MBBYGBlocksRegistry.rope_jacaranda_bridge.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MBBYGBlocksRegistry.rope_lament_bridge.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MBBYGBlocksRegistry.rope_mahogany_bridge.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MBBYGBlocksRegistry.rope_white_mangrove_bridge.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MBBYGBlocksRegistry.rope_maple_bridge.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MBBYGBlocksRegistry.rope_nightshade_bridge.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MBBYGBlocksRegistry.rope_palm_bridge.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MBBYGBlocksRegistry.rope_pine_bridge.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MBBYGBlocksRegistry.rope_rainbow_eucalyptus_bridge.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MBBYGBlocksRegistry.rope_redwood_bridge.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MBBYGBlocksRegistry.rope_skyris_bridge.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MBBYGBlocksRegistry.rope_willow_bridge.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MBBYGBlocksRegistry.rope_witch_hazel_bridge.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MBBYGBlocksRegistry.rope_zelkova_bridge.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MBBYGBlocksRegistry.rope_bulbis_bridge.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MBBYGBlocksRegistry.rope_imparius_bridge.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MBBYGBlocksRegistry.rope_sythian_bridge.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MBBYGBlocksRegistry.aspen_rope_bridge_stair.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MBBYGBlocksRegistry.baobab_rope_bridge_stair.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MBBYGBlocksRegistry.blue_enchanted_rope_bridge_stair.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MBBYGBlocksRegistry.cherry_rope_bridge_stair.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MBBYGBlocksRegistry.cika_rope_bridge_stair.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MBBYGBlocksRegistry.cypress_rope_bridge_stair.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MBBYGBlocksRegistry.ebony_rope_bridge_stair.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MBBYGBlocksRegistry.ether_rope_bridge_stair.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MBBYGBlocksRegistry.fir_rope_bridge_stair.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MBBYGBlocksRegistry.green_enchanted_rope_bridge_stair.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MBBYGBlocksRegistry.holly_rope_bridge_stair.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MBBYGBlocksRegistry.jacaranda_rope_bridge_stair.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MBBYGBlocksRegistry.lament_rope_bridge_stair.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MBBYGBlocksRegistry.mahogany_rope_bridge_stair.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MBBYGBlocksRegistry.white_mangrove_rope_bridge_stair.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MBBYGBlocksRegistry.maple_rope_bridge_stair.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MBBYGBlocksRegistry.nightshade_rope_bridge_stair.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MBBYGBlocksRegistry.palm_rope_bridge_stair.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MBBYGBlocksRegistry.pine_rope_bridge_stair.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MBBYGBlocksRegistry.rainbow_eucalyptus_rope_bridge_stair.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MBBYGBlocksRegistry.redwood_rope_bridge_stair.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MBBYGBlocksRegistry.skyris_rope_bridge_stair.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MBBYGBlocksRegistry.willow_rope_bridge_stair.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MBBYGBlocksRegistry.witch_hazel_rope_bridge_stair.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MBBYGBlocksRegistry.zelkova_rope_bridge_stair.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MBBYGBlocksRegistry.bulbis_rope_bridge_stair.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MBBYGBlocksRegistry.imparius_rope_bridge_stair.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MBBYGBlocksRegistry.sythian_rope_bridge_stair.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MBBYGBlocksRegistry.aspen_log_bridge_stair.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MBBYGBlocksRegistry.baobab_log_bridge_stair.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MBBYGBlocksRegistry.blue_enchanted_log_bridge_stair.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MBBYGBlocksRegistry.cherry_log_bridge_stair.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MBBYGBlocksRegistry.cika_log_bridge_stair.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MBBYGBlocksRegistry.cypress_log_bridge_stair.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MBBYGBlocksRegistry.ebony_log_bridge_stair.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MBBYGBlocksRegistry.ether_log_bridge_stair.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MBBYGBlocksRegistry.fir_log_bridge_stair.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MBBYGBlocksRegistry.green_enchanted_log_bridge_stair.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MBBYGBlocksRegistry.holly_log_bridge_stair.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MBBYGBlocksRegistry.jacaranda_log_bridge_stair.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MBBYGBlocksRegistry.lament_log_bridge_stair.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MBBYGBlocksRegistry.mahogany_log_bridge_stair.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MBBYGBlocksRegistry.white_mangrove_log_bridge_stair.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MBBYGBlocksRegistry.maple_log_bridge_stair.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MBBYGBlocksRegistry.nightshade_log_bridge_stair.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MBBYGBlocksRegistry.palm_log_bridge_stair.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MBBYGBlocksRegistry.pine_log_bridge_stair.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MBBYGBlocksRegistry.rainbow_eucalyptus_log_bridge_stair.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MBBYGBlocksRegistry.redwood_log_bridge_stair.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MBBYGBlocksRegistry.skyris_log_bridge_stair.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MBBYGBlocksRegistry.willow_log_bridge_stair.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MBBYGBlocksRegistry.witch_hazel_log_bridge_stair.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MBBYGBlocksRegistry.zelkova_log_bridge_stair.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MBBYGBlocksRegistry.bulbis_log_bridge_stair.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MBBYGBlocksRegistry.imparius_log_bridge_stair.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MBBYGBlocksRegistry.sythian_log_bridge_stair.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MBBYGBlocksRegistry.dacite_bricks_bridge.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MBBYGBlocksRegistry.polished_travertine_bridge.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MBBYGBlocksRegistry.purpur_stone_bridge.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MBBYGBlocksRegistry.red_rock_bricks_bridge.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MBBYGBlocksRegistry.scoria_stone_bricks_bridge.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MBBYGBlocksRegistry.soapstone_bricks_bridge.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MBBYGBlocksRegistry.cryptic_stone_bridge_pier.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MBBYGBlocksRegistry.dacite_bricks_bridge_pier.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MBBYGBlocksRegistry.polished_travertine_bridge_pier.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MBBYGBlocksRegistry.purpur_stone_bridge_pier.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MBBYGBlocksRegistry.red_rock_bricks_bridge_pier.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MBBYGBlocksRegistry.scoria_stone_bricks_bridge_pier.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MBBYGBlocksRegistry.soapstone_bricks_bridge_pier.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MBBYGBlocksRegistry.cryptic_stone_bridge_stair.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MBBYGBlocksRegistry.dacite_bricks_bridge_stair.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MBBYGBlocksRegistry.polished_travertine_bridge_stair.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MBBYGBlocksRegistry.purpur_stone_bridge_stair.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MBBYGBlocksRegistry.red_rock_bricks_bridge_stair.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MBBYGBlocksRegistry.scoria_stone_bricks_bridge_stair.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MBBYGBlocksRegistry.soapstone_bricks_bridge_stair.get(), RenderType.cutout());
	}
	
	private void CreateTab(CreativeModeTabEvent.Register event)
    {
		MB_BYG = event.registerCreativeModeTab(new ResourceLocation("macawsbridgesbyg", "tab_mbbyg"), builder -> builder
        .icon(() -> new ItemStack(MBBYGBlocksRegistry.aspen_log_bridge_middle.get()))
        .title(Component.literal("Macaw's Bridges - BYG")));
    }
    
    private void AddTab(CreativeModeTabEvent.BuildContents event)
    {
    	 if (event.getTab() == MB_BYG)
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

    		 event.accept(MBBYGBlocksRegistry.cherry_log_bridge_middle.get());

    		 event.accept(MBBYGBlocksRegistry.rope_cherry_bridge.get());

    		 event.accept(MBBYGBlocksRegistry.cherry_bridge_pier.get());

    		 event.accept(MBBYGBlocksRegistry.cherry_log_bridge_stair.get());

    		 event.accept(MBBYGBlocksRegistry.cherry_rope_bridge_stair.get());

    		 event.accept(MBBYGBlocksRegistry.cherry_rail_bridge.get());

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

    		 event.accept(MBBYGBlocksRegistry.ether_log_bridge_middle.get());

    		 event.accept(MBBYGBlocksRegistry.rope_ether_bridge.get());

    		 event.accept(MBBYGBlocksRegistry.ether_bridge_pier.get());

    		 event.accept(MBBYGBlocksRegistry.ether_log_bridge_stair.get());

    		 event.accept(MBBYGBlocksRegistry.ether_rope_bridge_stair.get());

    		 event.accept(MBBYGBlocksRegistry.ether_rail_bridge.get());

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

    		 event.accept(MBBYGBlocksRegistry.jacaranda_log_bridge_middle.get());

    		 event.accept(MBBYGBlocksRegistry.rope_jacaranda_bridge.get());

    		 event.accept(MBBYGBlocksRegistry.jacaranda_bridge_pier.get());

    		 event.accept(MBBYGBlocksRegistry.jacaranda_log_bridge_stair.get());

    		 event.accept(MBBYGBlocksRegistry.jacaranda_rope_bridge_stair.get());

    		 event.accept(MBBYGBlocksRegistry.jacaranda_rail_bridge.get());

    		 event.accept(MBBYGBlocksRegistry.lament_log_bridge_middle.get());

    		 event.accept(MBBYGBlocksRegistry.rope_lament_bridge.get());

    		 event.accept(MBBYGBlocksRegistry.lament_bridge_pier.get());

    		 event.accept(MBBYGBlocksRegistry.lament_log_bridge_stair.get());

    		 event.accept(MBBYGBlocksRegistry.lament_rope_bridge_stair.get());

    		 event.accept(MBBYGBlocksRegistry.lament_rail_bridge.get());

    		 event.accept(MBBYGBlocksRegistry.mahogany_log_bridge_middle.get());

    		 event.accept(MBBYGBlocksRegistry.rope_mahogany_bridge.get());

    		 event.accept(MBBYGBlocksRegistry.mahogany_bridge_pier.get());

    		 event.accept(MBBYGBlocksRegistry.mahogany_log_bridge_stair.get());

    		 event.accept(MBBYGBlocksRegistry.mahogany_rope_bridge_stair.get());

    		 event.accept(MBBYGBlocksRegistry.mahogany_rail_bridge.get());

    		 event.accept(MBBYGBlocksRegistry.white_mangrove_log_bridge_middle.get());

    		 event.accept(MBBYGBlocksRegistry.rope_white_mangrove_bridge.get());

    		 event.accept(MBBYGBlocksRegistry.white_mangrove_bridge_pier.get());

    		 event.accept(MBBYGBlocksRegistry.white_mangrove_log_bridge_stair.get());

    		 event.accept(MBBYGBlocksRegistry.white_mangrove_rope_bridge_stair.get());

    		 event.accept(MBBYGBlocksRegistry.white_mangrove_rail_bridge.get());

    		 event.accept(MBBYGBlocksRegistry.maple_log_bridge_middle.get());

    		 event.accept(MBBYGBlocksRegistry.rope_maple_bridge.get());

    		 event.accept(MBBYGBlocksRegistry.maple_bridge_pier.get());

    		 event.accept(MBBYGBlocksRegistry.maple_log_bridge_stair.get());

    		 event.accept(MBBYGBlocksRegistry.maple_rope_bridge_stair.get());

    		 event.accept(MBBYGBlocksRegistry.maple_rail_bridge.get());

    		 event.accept(MBBYGBlocksRegistry.nightshade_log_bridge_middle.get());

    		 event.accept(MBBYGBlocksRegistry.rope_nightshade_bridge.get());

    		 event.accept(MBBYGBlocksRegistry.nightshade_bridge_pier.get());

    		 event.accept(MBBYGBlocksRegistry.nightshade_log_bridge_stair.get());

    		 event.accept(MBBYGBlocksRegistry.nightshade_rope_bridge_stair.get());

    		 event.accept(MBBYGBlocksRegistry.nightshade_rail_bridge.get());

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

    		 event.accept(MBBYGBlocksRegistry.skyris_log_bridge_middle.get());

    		 event.accept(MBBYGBlocksRegistry.rope_skyris_bridge.get());

    		 event.accept(MBBYGBlocksRegistry.skyris_bridge_pier.get());

    		 event.accept(MBBYGBlocksRegistry.skyris_log_bridge_stair.get());

    		 event.accept(MBBYGBlocksRegistry.skyris_rope_bridge_stair.get());

    		 event.accept(MBBYGBlocksRegistry.skyris_rail_bridge.get());

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

    		 event.accept(MBBYGBlocksRegistry.bulbis_log_bridge_middle.get());

    		 event.accept(MBBYGBlocksRegistry.rope_bulbis_bridge.get());

    		 event.accept(MBBYGBlocksRegistry.bulbis_bridge_pier.get());

    		 event.accept(MBBYGBlocksRegistry.bulbis_log_bridge_stair.get());

    		 event.accept(MBBYGBlocksRegistry.bulbis_rope_bridge_stair.get());

    		 event.accept(MBBYGBlocksRegistry.bulbis_rail_bridge.get());

    		 event.accept(MBBYGBlocksRegistry.imparius_log_bridge_middle.get());

    		 event.accept(MBBYGBlocksRegistry.rope_imparius_bridge.get());

    		 event.accept(MBBYGBlocksRegistry.imparius_bridge_pier.get());

    		 event.accept(MBBYGBlocksRegistry.imparius_log_bridge_stair.get());

    		 event.accept(MBBYGBlocksRegistry.imparius_rope_bridge_stair.get());

    		 event.accept(MBBYGBlocksRegistry.imparius_rail_bridge.get());

    		 event.accept(MBBYGBlocksRegistry.sythian_log_bridge_middle.get());

    		 event.accept(MBBYGBlocksRegistry.rope_sythian_bridge.get());

    		 event.accept(MBBYGBlocksRegistry.sythian_bridge_pier.get());

    		 event.accept(MBBYGBlocksRegistry.sythian_log_bridge_stair.get());

    		 event.accept(MBBYGBlocksRegistry.sythian_rope_bridge_stair.get());

    		 event.accept(MBBYGBlocksRegistry.sythian_rail_bridge.get());
    		 //Finish
    		 
    		 event.accept(MBBYGBlocksRegistry.cryptic_stone_bridge.get());

    		 event.accept(MBBYGBlocksRegistry.cryptic_stone_bridge_pier.get());

    		 event.accept(MBBYGBlocksRegistry.cryptic_stone_bridge_stair.get());

    		 event.accept(MBBYGBlocksRegistry.dacite_bricks_bridge.get());

    		 event.accept(MBBYGBlocksRegistry.dacite_bricks_bridge_pier.get());

    		 event.accept(MBBYGBlocksRegistry.dacite_bricks_bridge_stair.get());

    		 event.accept(MBBYGBlocksRegistry.polished_travertine_bridge.get());

    		 event.accept(MBBYGBlocksRegistry.polished_travertine_bridge_pier.get());

    		 event.accept(MBBYGBlocksRegistry.polished_travertine_bridge_stair.get());

    		 event.accept(MBBYGBlocksRegistry.purpur_stone_bridge.get());

    		 event.accept(MBBYGBlocksRegistry.purpur_stone_bridge_pier.get());

    		 event.accept(MBBYGBlocksRegistry.purpur_stone_bridge_stair.get());

    		 event.accept(MBBYGBlocksRegistry.red_rock_bricks_bridge.get());

    		 event.accept(MBBYGBlocksRegistry.red_rock_bricks_bridge_pier.get());

    		 event.accept(MBBYGBlocksRegistry.red_rock_bricks_bridge_stair.get());

    		 event.accept(MBBYGBlocksRegistry.scoria_stone_bricks_bridge.get());

    		 event.accept(MBBYGBlocksRegistry.scoria_stone_bricks_bridge_pier.get());

    		 event.accept(MBBYGBlocksRegistry.scoria_stone_bricks_bridge_stair.get());

    		 event.accept(MBBYGBlocksRegistry.soapstone_bricks_bridge.get());

    		 event.accept(MBBYGBlocksRegistry.soapstone_bricks_bridge_pier.get());

    		 event.accept(MBBYGBlocksRegistry.soapstone_bricks_bridge_stair.get());
    		 //Finish
    	 }
    }
}