package fr.samlegamer.macawsbridgesbyg.block;

import net.kikoz.mcwbridges.objects.Bridge_Block_Rope;
import net.kikoz.mcwbridges.objects.Bridge_Stairs;
import net.kikoz.mcwbridges.objects.Bridge_Support;
import net.kikoz.mcwbridges.objects.Log_Bridge;
import net.kikoz.mcwbridges.objects.Rail_Bridge;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

public class MBBYGBlocksRegistry
{
	private static final AbstractBlock.Settings STONE_BRIDGES = AbstractBlock.Settings.of(Material.STONE).strength(3.0F, 5.0F).sounds(BlockSoundGroup.STONE).requiresTool();

	public static final Block cryptic_stone_bridge = new Log_Bridge(STONE_BRIDGES);
    public static final Block cryptic_stone_bridge_pier = new Bridge_Support(STONE_BRIDGES);
    public static final Block cryptic_stone_bridge_stair = new Bridge_Stairs(STONE_BRIDGES);
    public static final Block dacite_bricks_bridge = new Log_Bridge(STONE_BRIDGES);
    public static final Block dacite_bricks_bridge_pier = new Bridge_Support(STONE_BRIDGES);
    public static final Block dacite_bricks_bridge_stair = new Bridge_Stairs(STONE_BRIDGES);
    public static final Block polished_travertine_bridge = new Log_Bridge(STONE_BRIDGES);
    public static final Block polished_travertine_bridge_pier = new Bridge_Support(STONE_BRIDGES);
    public static final Block polished_travertine_bridge_stair = new Bridge_Stairs(STONE_BRIDGES);
    public static final Block purpur_stone_bridge = new Log_Bridge(STONE_BRIDGES);
    public static final Block purpur_stone_bridge_pier = new Bridge_Support(STONE_BRIDGES);
    public static final Block purpur_stone_bridge_stair = new Bridge_Stairs(STONE_BRIDGES);
    public static final Block red_rock_bricks_bridge = new Log_Bridge(STONE_BRIDGES);
    public static final Block red_rock_bricks_bridge_pier = new Bridge_Support(STONE_BRIDGES);
    public static final Block red_rock_bricks_bridge_stair = new Bridge_Stairs(STONE_BRIDGES);
    public static final Block scoria_stone_bricks_bridge = new Log_Bridge(STONE_BRIDGES);
    public static final Block scoria_stone_bricks_bridge_pier = new Bridge_Support(STONE_BRIDGES);
    public static final Block scoria_stone_bricks_bridge_stair = new Bridge_Stairs(STONE_BRIDGES);
    public static final Block soapstone_bricks_bridge = new Log_Bridge(STONE_BRIDGES);
    public static final Block soapstone_bricks_bridge_pier = new Bridge_Support(STONE_BRIDGES);
    public static final Block soapstone_bricks_bridge_stair = new Bridge_Stairs(STONE_BRIDGES);

    public static final Block aspen_log_bridge_middle = new Log_Bridge(AbstractBlock.Settings.of(Material.WOOD).strength(0.5F, 2.5F).sounds(BlockSoundGroup.WOOD));
	public static final Block rope_aspen_bridge = new Bridge_Block_Rope(AbstractBlock.Settings.of(Material.WOOD).strength(0.5F, 2.5F).sounds(BlockSoundGroup.WOOD));
	public static final Block aspen_bridge_pier = new Bridge_Support(AbstractBlock.Settings.of(Material.WOOD).strength(0.5F, 2.5F).sounds(BlockSoundGroup.WOOD));
	public static final Block aspen_log_bridge_stair = new Bridge_Stairs(AbstractBlock.Settings.of(Material.WOOD).strength(0.5F, 2.5F).sounds(BlockSoundGroup.WOOD));
	public static final Block aspen_rope_bridge_stair = new Bridge_Stairs(AbstractBlock.Settings.of(Material.WOOD).nonOpaque().strength(0.5F, 2.5F).sounds(BlockSoundGroup.WOOD));
	public static final Block aspen_rail_bridge = new Rail_Bridge(AbstractBlock.Settings.of(Material.WOOD).nonOpaque().strength(0.5F, 2.5F).sounds(BlockSoundGroup.WOOD));

	public static final Block baobab_log_bridge_middle = new Log_Bridge(AbstractBlock.Settings.of(Material.WOOD).strength(0.5F, 2.5F).sounds(BlockSoundGroup.WOOD));
	public static final Block rope_baobab_bridge = new Bridge_Block_Rope(AbstractBlock.Settings.of(Material.WOOD).strength(0.5F, 2.5F).sounds(BlockSoundGroup.WOOD));
	public static final Block baobab_bridge_pier = new Bridge_Support(AbstractBlock.Settings.of(Material.WOOD).strength(0.5F, 2.5F).sounds(BlockSoundGroup.WOOD));
	public static final Block baobab_log_bridge_stair = new Bridge_Stairs(AbstractBlock.Settings.of(Material.WOOD).strength(0.5F, 2.5F).sounds(BlockSoundGroup.WOOD));
	public static final Block baobab_rope_bridge_stair = new Bridge_Stairs(AbstractBlock.Settings.of(Material.WOOD).nonOpaque().strength(0.5F, 2.5F).sounds(BlockSoundGroup.WOOD));
	public static final Block baobab_rail_bridge = new Rail_Bridge(AbstractBlock.Settings.of(Material.WOOD).nonOpaque().strength(0.5F, 2.5F).sounds(BlockSoundGroup.WOOD));

	public static final Block blue_enchanted_log_bridge_middle = new Log_Bridge(AbstractBlock.Settings.of(Material.WOOD).strength(0.5F, 2.5F).sounds(BlockSoundGroup.WOOD));
	public static final Block rope_blue_enchanted_bridge = new Bridge_Block_Rope(AbstractBlock.Settings.of(Material.WOOD).strength(0.5F, 2.5F).sounds(BlockSoundGroup.WOOD));
	public static final Block blue_enchanted_bridge_pier = new Bridge_Support(AbstractBlock.Settings.of(Material.WOOD).strength(0.5F, 2.5F).sounds(BlockSoundGroup.WOOD));
	public static final Block blue_enchanted_log_bridge_stair = new Bridge_Stairs(AbstractBlock.Settings.of(Material.WOOD).strength(0.5F, 2.5F).sounds(BlockSoundGroup.WOOD));
	public static final Block blue_enchanted_rope_bridge_stair = new Bridge_Stairs(AbstractBlock.Settings.of(Material.WOOD).nonOpaque().strength(0.5F, 2.5F).sounds(BlockSoundGroup.WOOD));
	public static final Block blue_enchanted_rail_bridge = new Rail_Bridge(AbstractBlock.Settings.of(Material.WOOD).nonOpaque().strength(0.5F, 2.5F).sounds(BlockSoundGroup.WOOD));

	public static final Block cherry_log_bridge_middle = new Log_Bridge(AbstractBlock.Settings.of(Material.WOOD).strength(0.5F, 2.5F).sounds(BlockSoundGroup.WOOD));
	public static final Block rope_cherry_bridge = new Bridge_Block_Rope(AbstractBlock.Settings.of(Material.WOOD).strength(0.5F, 2.5F).sounds(BlockSoundGroup.WOOD));
	public static final Block cherry_bridge_pier = new Bridge_Support(AbstractBlock.Settings.of(Material.WOOD).strength(0.5F, 2.5F).sounds(BlockSoundGroup.WOOD));
	public static final Block cherry_log_bridge_stair = new Bridge_Stairs(AbstractBlock.Settings.of(Material.WOOD).strength(0.5F, 2.5F).sounds(BlockSoundGroup.WOOD));
	public static final Block cherry_rope_bridge_stair = new Bridge_Stairs(AbstractBlock.Settings.of(Material.WOOD).nonOpaque().strength(0.5F, 2.5F).sounds(BlockSoundGroup.WOOD));
	public static final Block cherry_rail_bridge = new Rail_Bridge(AbstractBlock.Settings.of(Material.WOOD).nonOpaque().strength(0.5F, 2.5F).sounds(BlockSoundGroup.WOOD));

	public static final Block cika_log_bridge_middle = new Log_Bridge(AbstractBlock.Settings.of(Material.WOOD).strength(0.5F, 2.5F).sounds(BlockSoundGroup.WOOD));
	public static final Block rope_cika_bridge = new Bridge_Block_Rope(AbstractBlock.Settings.of(Material.WOOD).strength(0.5F, 2.5F).sounds(BlockSoundGroup.WOOD));
	public static final Block cika_bridge_pier = new Bridge_Support(AbstractBlock.Settings.of(Material.WOOD).strength(0.5F, 2.5F).sounds(BlockSoundGroup.WOOD));
	public static final Block cika_log_bridge_stair = new Bridge_Stairs(AbstractBlock.Settings.of(Material.WOOD).strength(0.5F, 2.5F).sounds(BlockSoundGroup.WOOD));
	public static final Block cika_rope_bridge_stair = new Bridge_Stairs(AbstractBlock.Settings.of(Material.WOOD).nonOpaque().strength(0.5F, 2.5F).sounds(BlockSoundGroup.WOOD));
	public static final Block cika_rail_bridge = new Rail_Bridge(AbstractBlock.Settings.of(Material.WOOD).nonOpaque().strength(0.5F, 2.5F).sounds(BlockSoundGroup.WOOD));

	public static final Block cypress_log_bridge_middle = new Log_Bridge(AbstractBlock.Settings.of(Material.WOOD).strength(0.5F, 2.5F).sounds(BlockSoundGroup.WOOD));
	public static final Block rope_cypress_bridge = new Bridge_Block_Rope(AbstractBlock.Settings.of(Material.WOOD).strength(0.5F, 2.5F).sounds(BlockSoundGroup.WOOD));
	public static final Block cypress_bridge_pier = new Bridge_Support(AbstractBlock.Settings.of(Material.WOOD).strength(0.5F, 2.5F).sounds(BlockSoundGroup.WOOD));
	public static final Block cypress_log_bridge_stair = new Bridge_Stairs(AbstractBlock.Settings.of(Material.WOOD).strength(0.5F, 2.5F).sounds(BlockSoundGroup.WOOD));
	public static final Block cypress_rope_bridge_stair = new Bridge_Stairs(AbstractBlock.Settings.of(Material.WOOD).nonOpaque().strength(0.5F, 2.5F).sounds(BlockSoundGroup.WOOD));
	public static final Block cypress_rail_bridge = new Rail_Bridge(AbstractBlock.Settings.of(Material.WOOD).nonOpaque().strength(0.5F, 2.5F).sounds(BlockSoundGroup.WOOD));

	public static final Block ebony_log_bridge_middle = new Log_Bridge(AbstractBlock.Settings.of(Material.WOOD).strength(0.5F, 2.5F).sounds(BlockSoundGroup.WOOD));
	public static final Block rope_ebony_bridge = new Bridge_Block_Rope(AbstractBlock.Settings.of(Material.WOOD).strength(0.5F, 2.5F).sounds(BlockSoundGroup.WOOD));
	public static final Block ebony_bridge_pier = new Bridge_Support(AbstractBlock.Settings.of(Material.WOOD).strength(0.5F, 2.5F).sounds(BlockSoundGroup.WOOD));
	public static final Block ebony_log_bridge_stair = new Bridge_Stairs(AbstractBlock.Settings.of(Material.WOOD).strength(0.5F, 2.5F).sounds(BlockSoundGroup.WOOD));
	public static final Block ebony_rope_bridge_stair = new Bridge_Stairs(AbstractBlock.Settings.of(Material.WOOD).nonOpaque().strength(0.5F, 2.5F).sounds(BlockSoundGroup.WOOD));
	public static final Block ebony_rail_bridge = new Rail_Bridge(AbstractBlock.Settings.of(Material.WOOD).nonOpaque().strength(0.5F, 2.5F).sounds(BlockSoundGroup.WOOD));

	public static final Block ether_log_bridge_middle = new Log_Bridge(AbstractBlock.Settings.of(Material.WOOD).strength(0.5F, 2.5F).sounds(BlockSoundGroup.WOOD));
	public static final Block rope_ether_bridge = new Bridge_Block_Rope(AbstractBlock.Settings.of(Material.WOOD).strength(0.5F, 2.5F).sounds(BlockSoundGroup.WOOD));
	public static final Block ether_bridge_pier = new Bridge_Support(AbstractBlock.Settings.of(Material.WOOD).strength(0.5F, 2.5F).sounds(BlockSoundGroup.WOOD));
	public static final Block ether_log_bridge_stair = new Bridge_Stairs(AbstractBlock.Settings.of(Material.WOOD).strength(0.5F, 2.5F).sounds(BlockSoundGroup.WOOD));
	public static final Block ether_rope_bridge_stair = new Bridge_Stairs(AbstractBlock.Settings.of(Material.WOOD).nonOpaque().strength(0.5F, 2.5F).sounds(BlockSoundGroup.WOOD));
	public static final Block ether_rail_bridge = new Rail_Bridge(AbstractBlock.Settings.of(Material.WOOD).nonOpaque().strength(0.5F, 2.5F).sounds(BlockSoundGroup.WOOD));

	public static final Block fir_log_bridge_middle = new Log_Bridge(AbstractBlock.Settings.of(Material.WOOD).strength(0.5F, 2.5F).sounds(BlockSoundGroup.WOOD));
	public static final Block rope_fir_bridge = new Bridge_Block_Rope(AbstractBlock.Settings.of(Material.WOOD).strength(0.5F, 2.5F).sounds(BlockSoundGroup.WOOD));
	public static final Block fir_bridge_pier = new Bridge_Support(AbstractBlock.Settings.of(Material.WOOD).strength(0.5F, 2.5F).sounds(BlockSoundGroup.WOOD));
	public static final Block fir_log_bridge_stair = new Bridge_Stairs(AbstractBlock.Settings.of(Material.WOOD).strength(0.5F, 2.5F).sounds(BlockSoundGroup.WOOD));
	public static final Block fir_rope_bridge_stair = new Bridge_Stairs(AbstractBlock.Settings.of(Material.WOOD).nonOpaque().strength(0.5F, 2.5F).sounds(BlockSoundGroup.WOOD));
	public static final Block fir_rail_bridge = new Rail_Bridge(AbstractBlock.Settings.of(Material.WOOD).nonOpaque().strength(0.5F, 2.5F).sounds(BlockSoundGroup.WOOD));

	public static final Block green_enchanted_log_bridge_middle = new Log_Bridge(AbstractBlock.Settings.of(Material.WOOD).strength(0.5F, 2.5F).sounds(BlockSoundGroup.WOOD));
	public static final Block rope_green_enchanted_bridge = new Bridge_Block_Rope(AbstractBlock.Settings.of(Material.WOOD).strength(0.5F, 2.5F).sounds(BlockSoundGroup.WOOD));
	public static final Block green_enchanted_bridge_pier = new Bridge_Support(AbstractBlock.Settings.of(Material.WOOD).strength(0.5F, 2.5F).sounds(BlockSoundGroup.WOOD));
	public static final Block green_enchanted_log_bridge_stair = new Bridge_Stairs(AbstractBlock.Settings.of(Material.WOOD).strength(0.5F, 2.5F).sounds(BlockSoundGroup.WOOD));
	public static final Block green_enchanted_rope_bridge_stair = new Bridge_Stairs(AbstractBlock.Settings.of(Material.WOOD).nonOpaque().strength(0.5F, 2.5F).sounds(BlockSoundGroup.WOOD));
	public static final Block green_enchanted_rail_bridge = new Rail_Bridge(AbstractBlock.Settings.of(Material.WOOD).nonOpaque().strength(0.5F, 2.5F).sounds(BlockSoundGroup.WOOD));

	public static final Block holly_log_bridge_middle = new Log_Bridge(AbstractBlock.Settings.of(Material.WOOD).strength(0.5F, 2.5F).sounds(BlockSoundGroup.WOOD));
	public static final Block rope_holly_bridge = new Bridge_Block_Rope(AbstractBlock.Settings.of(Material.WOOD).strength(0.5F, 2.5F).sounds(BlockSoundGroup.WOOD));
	public static final Block holly_bridge_pier = new Bridge_Support(AbstractBlock.Settings.of(Material.WOOD).strength(0.5F, 2.5F).sounds(BlockSoundGroup.WOOD));
	public static final Block holly_log_bridge_stair = new Bridge_Stairs(AbstractBlock.Settings.of(Material.WOOD).strength(0.5F, 2.5F).sounds(BlockSoundGroup.WOOD));
	public static final Block holly_rope_bridge_stair = new Bridge_Stairs(AbstractBlock.Settings.of(Material.WOOD).nonOpaque().strength(0.5F, 2.5F).sounds(BlockSoundGroup.WOOD));
	public static final Block holly_rail_bridge = new Rail_Bridge(AbstractBlock.Settings.of(Material.WOOD).nonOpaque().strength(0.5F, 2.5F).sounds(BlockSoundGroup.WOOD));

	public static final Block jacaranda_log_bridge_middle = new Log_Bridge(AbstractBlock.Settings.of(Material.WOOD).strength(0.5F, 2.5F).sounds(BlockSoundGroup.WOOD));
	public static final Block rope_jacaranda_bridge = new Bridge_Block_Rope(AbstractBlock.Settings.of(Material.WOOD).strength(0.5F, 2.5F).sounds(BlockSoundGroup.WOOD));
	public static final Block jacaranda_bridge_pier = new Bridge_Support(AbstractBlock.Settings.of(Material.WOOD).strength(0.5F, 2.5F).sounds(BlockSoundGroup.WOOD));
	public static final Block jacaranda_log_bridge_stair = new Bridge_Stairs(AbstractBlock.Settings.of(Material.WOOD).strength(0.5F, 2.5F).sounds(BlockSoundGroup.WOOD));
	public static final Block jacaranda_rope_bridge_stair = new Bridge_Stairs(AbstractBlock.Settings.of(Material.WOOD).nonOpaque().strength(0.5F, 2.5F).sounds(BlockSoundGroup.WOOD));
	public static final Block jacaranda_rail_bridge = new Rail_Bridge(AbstractBlock.Settings.of(Material.WOOD).nonOpaque().strength(0.5F, 2.5F).sounds(BlockSoundGroup.WOOD));

	public static final Block lament_log_bridge_middle = new Log_Bridge(AbstractBlock.Settings.of(Material.WOOD).strength(0.5F, 2.5F).sounds(BlockSoundGroup.WOOD));
	public static final Block rope_lament_bridge = new Bridge_Block_Rope(AbstractBlock.Settings.of(Material.WOOD).strength(0.5F, 2.5F).sounds(BlockSoundGroup.WOOD));
	public static final Block lament_bridge_pier = new Bridge_Support(AbstractBlock.Settings.of(Material.WOOD).strength(0.5F, 2.5F).sounds(BlockSoundGroup.WOOD));
	public static final Block lament_log_bridge_stair = new Bridge_Stairs(AbstractBlock.Settings.of(Material.WOOD).strength(0.5F, 2.5F).sounds(BlockSoundGroup.WOOD));
	public static final Block lament_rope_bridge_stair = new Bridge_Stairs(AbstractBlock.Settings.of(Material.WOOD).nonOpaque().strength(0.5F, 2.5F).sounds(BlockSoundGroup.WOOD));
	public static final Block lament_rail_bridge = new Rail_Bridge(AbstractBlock.Settings.of(Material.WOOD).nonOpaque().strength(0.5F, 2.5F).sounds(BlockSoundGroup.WOOD));
	
	public static final Block mahogany_log_bridge_middle = new Log_Bridge(AbstractBlock.Settings.of(Material.WOOD).strength(0.5F, 2.5F).sounds(BlockSoundGroup.WOOD));
	public static final Block rope_mahogany_bridge = new Bridge_Block_Rope(AbstractBlock.Settings.of(Material.WOOD).strength(0.5F, 2.5F).sounds(BlockSoundGroup.WOOD));
	public static final Block mahogany_bridge_pier = new Bridge_Support(AbstractBlock.Settings.of(Material.WOOD).strength(0.5F, 2.5F).sounds(BlockSoundGroup.WOOD));
	public static final Block mahogany_log_bridge_stair = new Bridge_Stairs(AbstractBlock.Settings.of(Material.WOOD).strength(0.5F, 2.5F).sounds(BlockSoundGroup.WOOD));
	public static final Block mahogany_rope_bridge_stair = new Bridge_Stairs(AbstractBlock.Settings.of(Material.WOOD).nonOpaque().strength(0.5F, 2.5F).sounds(BlockSoundGroup.WOOD));
	public static final Block mahogany_rail_bridge = new Rail_Bridge(AbstractBlock.Settings.of(Material.WOOD).nonOpaque().strength(0.5F, 2.5F).sounds(BlockSoundGroup.WOOD));

	public static final Block white_mangrove_log_bridge_middle = new Log_Bridge(AbstractBlock.Settings.of(Material.WOOD).strength(0.5F, 2.5F).sounds(BlockSoundGroup.WOOD));
	public static final Block rope_white_mangrove_bridge = new Bridge_Block_Rope(AbstractBlock.Settings.of(Material.WOOD).strength(0.5F, 2.5F).sounds(BlockSoundGroup.WOOD));
	public static final Block white_mangrove_bridge_pier = new Bridge_Support(AbstractBlock.Settings.of(Material.WOOD).strength(0.5F, 2.5F).sounds(BlockSoundGroup.WOOD));
	public static final Block white_mangrove_log_bridge_stair = new Bridge_Stairs(AbstractBlock.Settings.of(Material.WOOD).strength(0.5F, 2.5F).sounds(BlockSoundGroup.WOOD));
	public static final Block white_mangrove_rope_bridge_stair = new Bridge_Stairs(AbstractBlock.Settings.of(Material.WOOD).nonOpaque().strength(0.5F, 2.5F).sounds(BlockSoundGroup.WOOD));
	public static final Block white_mangrove_rail_bridge = new Rail_Bridge(AbstractBlock.Settings.of(Material.WOOD).nonOpaque().strength(0.5F, 2.5F).sounds(BlockSoundGroup.WOOD));

	public static final Block maple_log_bridge_middle = new Log_Bridge(AbstractBlock.Settings.of(Material.WOOD).strength(0.5F, 2.5F).sounds(BlockSoundGroup.WOOD));
	public static final Block rope_maple_bridge = new Bridge_Block_Rope(AbstractBlock.Settings.of(Material.WOOD).strength(0.5F, 2.5F).sounds(BlockSoundGroup.WOOD));
	public static final Block maple_bridge_pier = new Bridge_Support(AbstractBlock.Settings.of(Material.WOOD).strength(0.5F, 2.5F).sounds(BlockSoundGroup.WOOD));
	public static final Block maple_log_bridge_stair = new Bridge_Stairs(AbstractBlock.Settings.of(Material.WOOD).strength(0.5F, 2.5F).sounds(BlockSoundGroup.WOOD));
	public static final Block maple_rope_bridge_stair = new Bridge_Stairs(AbstractBlock.Settings.of(Material.WOOD).nonOpaque().strength(0.5F, 2.5F).sounds(BlockSoundGroup.WOOD));
	public static final Block maple_rail_bridge = new Rail_Bridge(AbstractBlock.Settings.of(Material.WOOD).nonOpaque().strength(0.5F, 2.5F).sounds(BlockSoundGroup.WOOD));

	public static final Block nightshade_log_bridge_middle = new Log_Bridge(AbstractBlock.Settings.of(Material.WOOD).strength(0.5F, 2.5F).sounds(BlockSoundGroup.WOOD));
	public static final Block rope_nightshade_bridge = new Bridge_Block_Rope(AbstractBlock.Settings.of(Material.WOOD).strength(0.5F, 2.5F).sounds(BlockSoundGroup.WOOD));
	public static final Block nightshade_bridge_pier = new Bridge_Support(AbstractBlock.Settings.of(Material.WOOD).strength(0.5F, 2.5F).sounds(BlockSoundGroup.WOOD));
	public static final Block nightshade_log_bridge_stair = new Bridge_Stairs(AbstractBlock.Settings.of(Material.WOOD).strength(0.5F, 2.5F).sounds(BlockSoundGroup.WOOD));
	public static final Block nightshade_rope_bridge_stair = new Bridge_Stairs(AbstractBlock.Settings.of(Material.WOOD).nonOpaque().strength(0.5F, 2.5F).sounds(BlockSoundGroup.WOOD));
	public static final Block nightshade_rail_bridge = new Rail_Bridge(AbstractBlock.Settings.of(Material.WOOD).nonOpaque().strength(0.5F, 2.5F).sounds(BlockSoundGroup.WOOD));

	public static final Block palm_log_bridge_middle = new Log_Bridge(AbstractBlock.Settings.of(Material.WOOD).strength(0.5F, 2.5F).sounds(BlockSoundGroup.WOOD));
	public static final Block rope_palm_bridge = new Bridge_Block_Rope(AbstractBlock.Settings.of(Material.WOOD).strength(0.5F, 2.5F).sounds(BlockSoundGroup.WOOD));
	public static final Block palm_bridge_pier = new Bridge_Support(AbstractBlock.Settings.of(Material.WOOD).strength(0.5F, 2.5F).sounds(BlockSoundGroup.WOOD));
	public static final Block palm_log_bridge_stair = new Bridge_Stairs(AbstractBlock.Settings.of(Material.WOOD).strength(0.5F, 2.5F).sounds(BlockSoundGroup.WOOD));
	public static final Block palm_rope_bridge_stair = new Bridge_Stairs(AbstractBlock.Settings.of(Material.WOOD).nonOpaque().strength(0.5F, 2.5F).sounds(BlockSoundGroup.WOOD));
	public static final Block palm_rail_bridge = new Rail_Bridge(AbstractBlock.Settings.of(Material.WOOD).nonOpaque().strength(0.5F, 2.5F).sounds(BlockSoundGroup.WOOD));

	public static final Block pine_log_bridge_middle = new Log_Bridge(AbstractBlock.Settings.of(Material.WOOD).strength(0.5F, 2.5F).sounds(BlockSoundGroup.WOOD));
	public static final Block rope_pine_bridge = new Bridge_Block_Rope(AbstractBlock.Settings.of(Material.WOOD).strength(0.5F, 2.5F).sounds(BlockSoundGroup.WOOD));
	public static final Block pine_bridge_pier = new Bridge_Support(AbstractBlock.Settings.of(Material.WOOD).strength(0.5F, 2.5F).sounds(BlockSoundGroup.WOOD));
	public static final Block pine_log_bridge_stair = new Bridge_Stairs(AbstractBlock.Settings.of(Material.WOOD).strength(0.5F, 2.5F).sounds(BlockSoundGroup.WOOD));
	public static final Block pine_rope_bridge_stair = new Bridge_Stairs(AbstractBlock.Settings.of(Material.WOOD).nonOpaque().strength(0.5F, 2.5F).sounds(BlockSoundGroup.WOOD));
	public static final Block pine_rail_bridge = new Rail_Bridge(AbstractBlock.Settings.of(Material.WOOD).nonOpaque().strength(0.5F, 2.5F).sounds(BlockSoundGroup.WOOD));

	public static final Block rainbow_eucalyptus_log_bridge_middle = new Log_Bridge(AbstractBlock.Settings.of(Material.WOOD).strength(0.5F, 2.5F).sounds(BlockSoundGroup.WOOD));
	public static final Block rope_rainbow_eucalyptus_bridge = new Bridge_Block_Rope(AbstractBlock.Settings.of(Material.WOOD).strength(0.5F, 2.5F).sounds(BlockSoundGroup.WOOD));
	public static final Block rainbow_eucalyptus_bridge_pier = new Bridge_Support(AbstractBlock.Settings.of(Material.WOOD).strength(0.5F, 2.5F).sounds(BlockSoundGroup.WOOD));
	public static final Block rainbow_eucalyptus_log_bridge_stair = new Bridge_Stairs(AbstractBlock.Settings.of(Material.WOOD).strength(0.5F, 2.5F).sounds(BlockSoundGroup.WOOD));
	public static final Block rainbow_eucalyptus_rope_bridge_stair = new Bridge_Stairs(AbstractBlock.Settings.of(Material.WOOD).nonOpaque().strength(0.5F, 2.5F).sounds(BlockSoundGroup.WOOD));
	public static final Block rainbow_eucalyptus_rail_bridge = new Rail_Bridge(AbstractBlock.Settings.of(Material.WOOD).nonOpaque().strength(0.5F, 2.5F).sounds(BlockSoundGroup.WOOD));

	public static final Block redwood_log_bridge_middle = new Log_Bridge(AbstractBlock.Settings.of(Material.WOOD).strength(0.5F, 2.5F).sounds(BlockSoundGroup.WOOD));
	public static final Block rope_redwood_bridge = new Bridge_Block_Rope(AbstractBlock.Settings.of(Material.WOOD).strength(0.5F, 2.5F).sounds(BlockSoundGroup.WOOD));
	public static final Block redwood_bridge_pier = new Bridge_Support(AbstractBlock.Settings.of(Material.WOOD).strength(0.5F, 2.5F).sounds(BlockSoundGroup.WOOD));
	public static final Block redwood_log_bridge_stair = new Bridge_Stairs(AbstractBlock.Settings.of(Material.WOOD).strength(0.5F, 2.5F).sounds(BlockSoundGroup.WOOD));
	public static final Block redwood_rope_bridge_stair = new Bridge_Stairs(AbstractBlock.Settings.of(Material.WOOD).nonOpaque().strength(0.5F, 2.5F).sounds(BlockSoundGroup.WOOD));
	public static final Block redwood_rail_bridge = new Rail_Bridge(AbstractBlock.Settings.of(Material.WOOD).nonOpaque().strength(0.5F, 2.5F).sounds(BlockSoundGroup.WOOD));

	public static final Block skyris_log_bridge_middle = new Log_Bridge(AbstractBlock.Settings.of(Material.WOOD).strength(0.5F, 2.5F).sounds(BlockSoundGroup.WOOD));
	public static final Block rope_skyris_bridge = new Bridge_Block_Rope(AbstractBlock.Settings.of(Material.WOOD).strength(0.5F, 2.5F).sounds(BlockSoundGroup.WOOD));
	public static final Block skyris_bridge_pier = new Bridge_Support(AbstractBlock.Settings.of(Material.WOOD).strength(0.5F, 2.5F).sounds(BlockSoundGroup.WOOD));
	public static final Block skyris_log_bridge_stair = new Bridge_Stairs(AbstractBlock.Settings.of(Material.WOOD).strength(0.5F, 2.5F).sounds(BlockSoundGroup.WOOD));
	public static final Block skyris_rope_bridge_stair = new Bridge_Stairs(AbstractBlock.Settings.of(Material.WOOD).nonOpaque().strength(0.5F, 2.5F).sounds(BlockSoundGroup.WOOD));
	public static final Block skyris_rail_bridge = new Rail_Bridge(AbstractBlock.Settings.of(Material.WOOD).nonOpaque().strength(0.5F, 2.5F).sounds(BlockSoundGroup.WOOD));

	public static final Block willow_log_bridge_middle = new Log_Bridge(AbstractBlock.Settings.of(Material.WOOD).strength(0.5F, 2.5F).sounds(BlockSoundGroup.WOOD));
	public static final Block rope_willow_bridge = new Bridge_Block_Rope(AbstractBlock.Settings.of(Material.WOOD).strength(0.5F, 2.5F).sounds(BlockSoundGroup.WOOD));
	public static final Block willow_bridge_pier = new Bridge_Support(AbstractBlock.Settings.of(Material.WOOD).strength(0.5F, 2.5F).sounds(BlockSoundGroup.WOOD));
	public static final Block willow_log_bridge_stair = new Bridge_Stairs(AbstractBlock.Settings.of(Material.WOOD).strength(0.5F, 2.5F).sounds(BlockSoundGroup.WOOD));
	public static final Block willow_rope_bridge_stair = new Bridge_Stairs(AbstractBlock.Settings.of(Material.WOOD).nonOpaque().strength(0.5F, 2.5F).sounds(BlockSoundGroup.WOOD));
	public static final Block willow_rail_bridge = new Rail_Bridge(AbstractBlock.Settings.of(Material.WOOD).nonOpaque().strength(0.5F, 2.5F).sounds(BlockSoundGroup.WOOD));

	public static final Block witch_hazel_log_bridge_middle = new Log_Bridge(AbstractBlock.Settings.of(Material.WOOD).strength(0.5F, 2.5F).sounds(BlockSoundGroup.WOOD));
	public static final Block rope_witch_hazel_bridge = new Bridge_Block_Rope(AbstractBlock.Settings.of(Material.WOOD).strength(0.5F, 2.5F).sounds(BlockSoundGroup.WOOD));
	public static final Block witch_hazel_bridge_pier = new Bridge_Support(AbstractBlock.Settings.of(Material.WOOD).strength(0.5F, 2.5F).sounds(BlockSoundGroup.WOOD));
	public static final Block witch_hazel_log_bridge_stair = new Bridge_Stairs(AbstractBlock.Settings.of(Material.WOOD).strength(0.5F, 2.5F).sounds(BlockSoundGroup.WOOD));
	public static final Block witch_hazel_rope_bridge_stair = new Bridge_Stairs(AbstractBlock.Settings.of(Material.WOOD).nonOpaque().strength(0.5F, 2.5F).sounds(BlockSoundGroup.WOOD));
	public static final Block witch_hazel_rail_bridge = new Rail_Bridge(AbstractBlock.Settings.of(Material.WOOD).nonOpaque().strength(0.5F, 2.5F).sounds(BlockSoundGroup.WOOD));

	public static final Block zelkova_log_bridge_middle = new Log_Bridge(AbstractBlock.Settings.of(Material.WOOD).strength(0.5F, 2.5F).sounds(BlockSoundGroup.WOOD));
	public static final Block rope_zelkova_bridge = new Bridge_Block_Rope(AbstractBlock.Settings.of(Material.WOOD).strength(0.5F, 2.5F).sounds(BlockSoundGroup.WOOD));
	public static final Block zelkova_bridge_pier = new Bridge_Support(AbstractBlock.Settings.of(Material.WOOD).strength(0.5F, 2.5F).sounds(BlockSoundGroup.WOOD));
	public static final Block zelkova_log_bridge_stair = new Bridge_Stairs(AbstractBlock.Settings.of(Material.WOOD).strength(0.5F, 2.5F).sounds(BlockSoundGroup.WOOD));
	public static final Block zelkova_rope_bridge_stair = new Bridge_Stairs(AbstractBlock.Settings.of(Material.WOOD).nonOpaque().strength(0.5F, 2.5F).sounds(BlockSoundGroup.WOOD));
	public static final Block zelkova_rail_bridge = new Rail_Bridge(AbstractBlock.Settings.of(Material.WOOD).nonOpaque().strength(0.5F, 2.5F).sounds(BlockSoundGroup.WOOD));

	public static final Block bulbis_log_bridge_middle = new Log_Bridge(AbstractBlock.Settings.of(Material.WOOD).strength(0.5F, 2.5F).sounds(BlockSoundGroup.WOOD));
	public static final Block rope_bulbis_bridge = new Bridge_Block_Rope(AbstractBlock.Settings.of(Material.WOOD).strength(0.5F, 2.5F).sounds(BlockSoundGroup.WOOD));
	public static final Block bulbis_bridge_pier = new Bridge_Support(AbstractBlock.Settings.of(Material.WOOD).strength(0.5F, 2.5F).sounds(BlockSoundGroup.WOOD));
	public static final Block bulbis_log_bridge_stair = new Bridge_Stairs(AbstractBlock.Settings.of(Material.WOOD).strength(0.5F, 2.5F).sounds(BlockSoundGroup.WOOD));
	public static final Block bulbis_rope_bridge_stair = new Bridge_Stairs(AbstractBlock.Settings.of(Material.WOOD).nonOpaque().strength(0.5F, 2.5F).sounds(BlockSoundGroup.WOOD));
	public static final Block bulbis_rail_bridge = new Rail_Bridge(AbstractBlock.Settings.of(Material.WOOD).nonOpaque().strength(0.5F, 2.5F).sounds(BlockSoundGroup.WOOD));

	public static final Block imparius_log_bridge_middle = new Log_Bridge(AbstractBlock.Settings.of(Material.WOOD).strength(0.5F, 2.5F).sounds(BlockSoundGroup.WOOD));
	public static final Block rope_imparius_bridge = new Bridge_Block_Rope(AbstractBlock.Settings.of(Material.WOOD).strength(0.5F, 2.5F).sounds(BlockSoundGroup.WOOD));
	public static final Block imparius_bridge_pier = new Bridge_Support(AbstractBlock.Settings.of(Material.WOOD).strength(0.5F, 2.5F).sounds(BlockSoundGroup.WOOD));
	public static final Block imparius_log_bridge_stair = new Bridge_Stairs(AbstractBlock.Settings.of(Material.WOOD).strength(0.5F, 2.5F).sounds(BlockSoundGroup.WOOD));
	public static final Block imparius_rope_bridge_stair = new Bridge_Stairs(AbstractBlock.Settings.of(Material.WOOD).nonOpaque().strength(0.5F, 2.5F).sounds(BlockSoundGroup.WOOD));
	public static final Block imparius_rail_bridge = new Rail_Bridge(AbstractBlock.Settings.of(Material.WOOD).nonOpaque().strength(0.5F, 2.5F).sounds(BlockSoundGroup.WOOD));

	public static final Block sythian_log_bridge_middle = new Log_Bridge(AbstractBlock.Settings.of(Material.WOOD).strength(0.5F, 2.5F).sounds(BlockSoundGroup.WOOD));
	public static final Block rope_sythian_bridge = new Bridge_Block_Rope(AbstractBlock.Settings.of(Material.WOOD).strength(0.5F, 2.5F).sounds(BlockSoundGroup.WOOD));
	public static final Block sythian_bridge_pier = new Bridge_Support(AbstractBlock.Settings.of(Material.WOOD).strength(0.5F, 2.5F).sounds(BlockSoundGroup.WOOD));
	public static final Block sythian_log_bridge_stair = new Bridge_Stairs(AbstractBlock.Settings.of(Material.WOOD).strength(0.5F, 2.5F).sounds(BlockSoundGroup.WOOD));
	public static final Block sythian_rope_bridge_stair = new Bridge_Stairs(AbstractBlock.Settings.of(Material.WOOD).nonOpaque().strength(0.5F, 2.5F).sounds(BlockSoundGroup.WOOD));
	public static final Block sythian_rail_bridge = new Rail_Bridge(AbstractBlock.Settings.of(Material.WOOD).nonOpaque().strength(0.5F, 2.5F).sounds(BlockSoundGroup.WOOD));

	public static void registry()
	{
		add("aspen_log_bridge_middle", aspen_log_bridge_middle);
		add("rope_aspen_bridge", rope_aspen_bridge);
		add("aspen_bridge_pier", aspen_bridge_pier);
		add("aspen_log_bridge_stair", aspen_log_bridge_stair);
		add("aspen_rope_bridge_stair", aspen_rope_bridge_stair);
		add("aspen_rail_bridge", aspen_rail_bridge);
		add("baobab_log_bridge_middle", baobab_log_bridge_middle);
		add("rope_baobab_bridge", rope_baobab_bridge);
		add("baobab_bridge_pier", baobab_bridge_pier);
		add("baobab_log_bridge_stair", baobab_log_bridge_stair);
		add("baobab_rope_bridge_stair", baobab_rope_bridge_stair);
		add("baobab_rail_bridge", baobab_rail_bridge);
		add("blue_enchanted_log_bridge_middle", blue_enchanted_log_bridge_middle);
		add("rope_blue_enchanted_bridge", rope_blue_enchanted_bridge);
		add("blue_enchanted_bridge_pier", blue_enchanted_bridge_pier);
		add("blue_enchanted_log_bridge_stair", blue_enchanted_log_bridge_stair);
		add("blue_enchanted_rope_bridge_stair", blue_enchanted_rope_bridge_stair);
		add("blue_enchanted_rail_bridge", blue_enchanted_rail_bridge);
		add("cherry_log_bridge_middle", cherry_log_bridge_middle);
		add("rope_cherry_bridge", rope_cherry_bridge);
		add("cherry_bridge_pier", cherry_bridge_pier);
		add("cherry_log_bridge_stair", cherry_log_bridge_stair);
		add("cherry_rope_bridge_stair", cherry_rope_bridge_stair);
		add("cherry_rail_bridge", cherry_rail_bridge);
		add("cika_log_bridge_middle", cika_log_bridge_middle);
		add("rope_cika_bridge", rope_cika_bridge);
		add("cika_bridge_pier", cika_bridge_pier);
		add("cika_log_bridge_stair", cika_log_bridge_stair);
		add("cika_rope_bridge_stair", cika_rope_bridge_stair);
		add("cika_rail_bridge", cika_rail_bridge);
		add("cypress_log_bridge_middle", cypress_log_bridge_middle);
		add("rope_cypress_bridge", rope_cypress_bridge);
		add("cypress_bridge_pier", cypress_bridge_pier);
		add("cypress_log_bridge_stair", cypress_log_bridge_stair);
		add("cypress_rope_bridge_stair", cypress_rope_bridge_stair);
		add("cypress_rail_bridge", cypress_rail_bridge);
		add("ebony_log_bridge_middle", ebony_log_bridge_middle);
		add("rope_ebony_bridge", rope_ebony_bridge);
		add("ebony_bridge_pier", ebony_bridge_pier);
		add("ebony_log_bridge_stair", ebony_log_bridge_stair);
		add("ebony_rope_bridge_stair", ebony_rope_bridge_stair);
		add("ebony_rail_bridge", ebony_rail_bridge);
		add("ether_log_bridge_middle", ether_log_bridge_middle);
		add("rope_ether_bridge", rope_ether_bridge);
		add("ether_bridge_pier", ether_bridge_pier);
		add("ether_log_bridge_stair", ether_log_bridge_stair);
		add("ether_rope_bridge_stair", ether_rope_bridge_stair);
		add("ether_rail_bridge", ether_rail_bridge);
		add("fir_log_bridge_middle", fir_log_bridge_middle);
		add("rope_fir_bridge", rope_fir_bridge);
		add("fir_bridge_pier", fir_bridge_pier);
		add("fir_log_bridge_stair", fir_log_bridge_stair);
		add("fir_rope_bridge_stair", fir_rope_bridge_stair);
		add("fir_rail_bridge", fir_rail_bridge);
		add("green_enchanted_log_bridge_middle", green_enchanted_log_bridge_middle);
		add("rope_green_enchanted_bridge", rope_green_enchanted_bridge);
		add("green_enchanted_bridge_pier", green_enchanted_bridge_pier);
		add("green_enchanted_log_bridge_stair", green_enchanted_log_bridge_stair);
		add("green_enchanted_rope_bridge_stair", green_enchanted_rope_bridge_stair);
		add("green_enchanted_rail_bridge", green_enchanted_rail_bridge);
		add("holly_log_bridge_middle", holly_log_bridge_middle);
		add("rope_holly_bridge", rope_holly_bridge);
		add("holly_bridge_pier", holly_bridge_pier);
		add("holly_log_bridge_stair", holly_log_bridge_stair);
		add("holly_rope_bridge_stair", holly_rope_bridge_stair);
		add("holly_rail_bridge", holly_rail_bridge);
		add("jacaranda_log_bridge_middle", jacaranda_log_bridge_middle);
		add("rope_jacaranda_bridge", rope_jacaranda_bridge);
		add("jacaranda_bridge_pier", jacaranda_bridge_pier);
		add("jacaranda_log_bridge_stair", jacaranda_log_bridge_stair);
		add("jacaranda_rope_bridge_stair", jacaranda_rope_bridge_stair);
		add("jacaranda_rail_bridge", jacaranda_rail_bridge);
		add("lament_log_bridge_middle", lament_log_bridge_middle);
		add("rope_lament_bridge", rope_lament_bridge);
		add("lament_bridge_pier", lament_bridge_pier);
		add("lament_log_bridge_stair", lament_log_bridge_stair);
		add("lament_rope_bridge_stair", lament_rope_bridge_stair);
		add("lament_rail_bridge", lament_rail_bridge);
		add("mahogany_log_bridge_middle", mahogany_log_bridge_middle);
		add("rope_mahogany_bridge", rope_mahogany_bridge);
		add("mahogany_bridge_pier", mahogany_bridge_pier);
		add("mahogany_log_bridge_stair", mahogany_log_bridge_stair);
		add("mahogany_rope_bridge_stair", mahogany_rope_bridge_stair);
		add("mahogany_rail_bridge", mahogany_rail_bridge);
		add("white_mangrove_log_bridge_middle", white_mangrove_log_bridge_middle);
		add("rope_white_mangrove_bridge", rope_white_mangrove_bridge);
		add("white_mangrove_bridge_pier", white_mangrove_bridge_pier);
		add("white_mangrove_log_bridge_stair", white_mangrove_log_bridge_stair);
		add("white_mangrove_rope_bridge_stair", white_mangrove_rope_bridge_stair);
		add("white_mangrove_rail_bridge", white_mangrove_rail_bridge);
		add("maple_log_bridge_middle", maple_log_bridge_middle);
		add("rope_maple_bridge", rope_maple_bridge);
		add("maple_bridge_pier", maple_bridge_pier);
		add("maple_log_bridge_stair", maple_log_bridge_stair);
		add("maple_rope_bridge_stair", maple_rope_bridge_stair);
		add("maple_rail_bridge", maple_rail_bridge);
		add("nightshade_log_bridge_middle", nightshade_log_bridge_middle);
		add("rope_nightshade_bridge", rope_nightshade_bridge);
		add("nightshade_bridge_pier", nightshade_bridge_pier);
		add("nightshade_log_bridge_stair", nightshade_log_bridge_stair);
		add("nightshade_rope_bridge_stair", nightshade_rope_bridge_stair);
		add("nightshade_rail_bridge", nightshade_rail_bridge);
		add("palm_log_bridge_middle", palm_log_bridge_middle);
		add("rope_palm_bridge", rope_palm_bridge);
		add("palm_bridge_pier", palm_bridge_pier);
		add("palm_log_bridge_stair", palm_log_bridge_stair);
		add("palm_rope_bridge_stair", palm_rope_bridge_stair);
		add("palm_rail_bridge", palm_rail_bridge);
		add("pine_log_bridge_middle", pine_log_bridge_middle);
		add("rope_pine_bridge", rope_pine_bridge);
		add("pine_bridge_pier", pine_bridge_pier);
		add("pine_log_bridge_stair", pine_log_bridge_stair);
		add("pine_rope_bridge_stair", pine_rope_bridge_stair);
		add("pine_rail_bridge", pine_rail_bridge);
		add("rainbow_eucalyptus_log_bridge_middle", rainbow_eucalyptus_log_bridge_middle);
		add("rope_rainbow_eucalyptus_bridge", rope_rainbow_eucalyptus_bridge);
		add("rainbow_eucalyptus_bridge_pier", rainbow_eucalyptus_bridge_pier);
		add("rainbow_eucalyptus_log_bridge_stair", rainbow_eucalyptus_log_bridge_stair);
		add("rainbow_eucalyptus_rope_bridge_stair", rainbow_eucalyptus_rope_bridge_stair);
		add("rainbow_eucalyptus_rail_bridge", rainbow_eucalyptus_rail_bridge);
		add("redwood_log_bridge_middle", redwood_log_bridge_middle);
		add("rope_redwood_bridge", rope_redwood_bridge);
		add("redwood_bridge_pier", redwood_bridge_pier);
		add("redwood_log_bridge_stair", redwood_log_bridge_stair);
		add("redwood_rope_bridge_stair", redwood_rope_bridge_stair);
		add("redwood_rail_bridge", redwood_rail_bridge);
		add("skyris_log_bridge_middle", skyris_log_bridge_middle);
		add("rope_skyris_bridge", rope_skyris_bridge);
		add("skyris_bridge_pier", skyris_bridge_pier);
		add("skyris_log_bridge_stair", skyris_log_bridge_stair);
		add("skyris_rope_bridge_stair", skyris_rope_bridge_stair);
		add("skyris_rail_bridge", skyris_rail_bridge);
		add("willow_log_bridge_middle", willow_log_bridge_middle);
		add("rope_willow_bridge", rope_willow_bridge);
		add("willow_bridge_pier", willow_bridge_pier);
		add("willow_log_bridge_stair", willow_log_bridge_stair);
		add("willow_rope_bridge_stair", willow_rope_bridge_stair);
		add("willow_rail_bridge", willow_rail_bridge);
		add("witch_hazel_log_bridge_middle", witch_hazel_log_bridge_middle);
		add("rope_witch_hazel_bridge", rope_witch_hazel_bridge);
		add("witch_hazel_bridge_pier", witch_hazel_bridge_pier);
		add("witch_hazel_log_bridge_stair", witch_hazel_log_bridge_stair);
		add("witch_hazel_rope_bridge_stair", witch_hazel_rope_bridge_stair);
		add("witch_hazel_rail_bridge", witch_hazel_rail_bridge);
		add("zelkova_log_bridge_middle", zelkova_log_bridge_middle);
		add("rope_zelkova_bridge", rope_zelkova_bridge);
		add("zelkova_bridge_pier", zelkova_bridge_pier);
		add("zelkova_log_bridge_stair", zelkova_log_bridge_stair);
		add("zelkova_rope_bridge_stair", zelkova_rope_bridge_stair);
		add("zelkova_rail_bridge", zelkova_rail_bridge);
		add("bulbis_log_bridge_middle", bulbis_log_bridge_middle);
		add("rope_bulbis_bridge", rope_bulbis_bridge);
		add("bulbis_bridge_pier", bulbis_bridge_pier);
		add("bulbis_log_bridge_stair", bulbis_log_bridge_stair);
		add("bulbis_rope_bridge_stair", bulbis_rope_bridge_stair);
		add("bulbis_rail_bridge", bulbis_rail_bridge);
		add("imparius_log_bridge_middle", imparius_log_bridge_middle);
		add("rope_imparius_bridge", rope_imparius_bridge);
		add("imparius_bridge_pier", imparius_bridge_pier);
		add("imparius_log_bridge_stair", imparius_log_bridge_stair);
		add("imparius_rope_bridge_stair", imparius_rope_bridge_stair);
		add("imparius_rail_bridge", imparius_rail_bridge);
		add("sythian_log_bridge_middle", sythian_log_bridge_middle);
		add("rope_sythian_bridge", rope_sythian_bridge);
		add("sythian_bridge_pier", sythian_bridge_pier);
		add("sythian_log_bridge_stair", sythian_log_bridge_stair);
		add("sythian_rope_bridge_stair", sythian_rope_bridge_stair);
		add("sythian_rail_bridge", sythian_rail_bridge);
		add("cryptic_stone_bridge", cryptic_stone_bridge);
		add("cryptic_stone_bridge_pier", cryptic_stone_bridge_pier);
		add("cryptic_stone_bridge_stair", cryptic_stone_bridge_stair);
		add("dacite_bricks_bridge", dacite_bricks_bridge);
		add("dacite_bricks_bridge_pier", dacite_bricks_bridge_pier);
		add("dacite_bricks_bridge_stair", dacite_bricks_bridge_stair);
		add("polished_travertine_bridge", polished_travertine_bridge);
		add("polished_travertine_bridge_pier", polished_travertine_bridge_pier);
		add("polished_travertine_bridge_stair", polished_travertine_bridge_stair);
		add("purpur_stone_bridge", purpur_stone_bridge);
		add("purpur_stone_bridge_pier", purpur_stone_bridge_pier);
		add("purpur_stone_bridge_stair", purpur_stone_bridge_stair);
		add("red_rock_bricks_bridge", red_rock_bricks_bridge);
		add("red_rock_bricks_bridge_pier", red_rock_bricks_bridge_pier);
		add("red_rock_bricks_bridge_stair", red_rock_bricks_bridge_stair);
		add("scoria_stone_bricks_bridge", scoria_stone_bricks_bridge);
		add("scoria_stone_bricks_bridge_pier", scoria_stone_bricks_bridge_pier);
		add("scoria_stone_bricks_bridge_stair", scoria_stone_bricks_bridge_stair);
		add("soapstone_bricks_bridge", soapstone_bricks_bridge);
		add("soapstone_bricks_bridge_pier", soapstone_bricks_bridge_pier);
		add("soapstone_bricks_bridge_stair", soapstone_bricks_bridge_stair);
	}
	
	private static void add(String name, Block b)
    {
    	Registry.register(Registries.BLOCK, new Identifier("macawsbridgesbyg", name), b);
    	blockItem(b, name);
	}
    
    private static void blockItem(Block b, String n)
    {
    	Registry.register(Registries.ITEM, new Identifier("macawsbridgesbyg", n), new BlockItem(b, new Item.Settings()));
    }
}