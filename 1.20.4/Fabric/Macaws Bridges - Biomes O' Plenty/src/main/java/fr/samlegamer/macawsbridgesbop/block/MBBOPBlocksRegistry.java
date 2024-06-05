package fr.samlegamer.macawsbridgesbop.block;

import fr.samlegamer.macawsbridgesbop.MacawsBridgesBOP;
import net.kikoz.mcwbridges.objects.Bridge_Block_Rope;
import net.kikoz.mcwbridges.objects.Bridge_Support;
import net.kikoz.mcwbridges.objects.Bridge_Stairs;
import net.kikoz.mcwbridges.objects.Log_Bridge;
import net.kikoz.mcwbridges.objects.Rail_Bridge;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

public class MBBOPBlocksRegistry
{
	public static final Block dead_log_bridge_middle = new Log_Bridge(AbstractBlock.Settings.create().strength(0.5F, 2.5F).sounds(BlockSoundGroup.WOOD));

	public static final Block rope_dead_bridge = new Bridge_Block_Rope(AbstractBlock.Settings.create().strength(0.5F, 2.5F).sounds(BlockSoundGroup.WOOD));

	public static final Block dead_bridge_pier = new Bridge_Support(AbstractBlock.Settings.create().strength(0.5F, 2.5F).sounds(BlockSoundGroup.WOOD));

	public static final Block dead_log_bridge_stair = new Bridge_Stairs(AbstractBlock.Settings.create().strength(0.5F, 2.5F).sounds(BlockSoundGroup.WOOD));

	public static final Block dead_rope_bridge_stair = new Bridge_Stairs(AbstractBlock.Settings.create().nonOpaque().strength(0.5F, 2.5F).sounds(BlockSoundGroup.WOOD));

	public static final Block dead_rail_bridge = new Rail_Bridge(AbstractBlock.Settings.create().nonOpaque().strength(0.5F, 2.5F).sounds(BlockSoundGroup.WOOD));

	public static final Block fir_log_bridge_middle = new Log_Bridge(AbstractBlock.Settings.create().strength(0.5F, 2.5F).sounds(BlockSoundGroup.WOOD));

	public static final Block rope_fir_bridge = new Bridge_Block_Rope(AbstractBlock.Settings.create().strength(0.5F, 2.5F).sounds(BlockSoundGroup.WOOD));

	public static final Block fir_bridge_pier = new Bridge_Support(AbstractBlock.Settings.create().strength(0.5F, 2.5F).sounds(BlockSoundGroup.WOOD));

	public static final Block fir_log_bridge_stair = new Bridge_Stairs(AbstractBlock.Settings.create().strength(0.5F, 2.5F).sounds(BlockSoundGroup.WOOD));

	public static final Block fir_rope_bridge_stair = new Bridge_Stairs(AbstractBlock.Settings.create().nonOpaque().strength(0.5F, 2.5F).sounds(BlockSoundGroup.WOOD));

	public static final Block fir_rail_bridge = new Rail_Bridge(AbstractBlock.Settings.create().nonOpaque().strength(0.5F, 2.5F).sounds(BlockSoundGroup.WOOD));

	public static final Block hellbark_log_bridge_middle = new Log_Bridge(AbstractBlock.Settings.create().strength(0.5F, 2.5F).sounds(BlockSoundGroup.WOOD));

	public static final Block rope_hellbark_bridge = new Bridge_Block_Rope(AbstractBlock.Settings.create().strength(0.5F, 2.5F).sounds(BlockSoundGroup.WOOD));

	public static final Block hellbark_bridge_pier = new Bridge_Support(AbstractBlock.Settings.create().strength(0.5F, 2.5F).sounds(BlockSoundGroup.WOOD));

	public static final Block hellbark_log_bridge_stair = new Bridge_Stairs(AbstractBlock.Settings.create().strength(0.5F, 2.5F).sounds(BlockSoundGroup.WOOD));

	public static final Block hellbark_rope_bridge_stair = new Bridge_Stairs(AbstractBlock.Settings.create().nonOpaque().strength(0.5F, 2.5F).sounds(BlockSoundGroup.WOOD));

	public static final Block hellbark_rail_bridge = new Rail_Bridge(AbstractBlock.Settings.create().nonOpaque().strength(0.5F, 2.5F).sounds(BlockSoundGroup.WOOD));

	public static final Block jacaranda_log_bridge_middle = new Log_Bridge(AbstractBlock.Settings.create().strength(0.5F, 2.5F).sounds(BlockSoundGroup.WOOD));

	public static final Block rope_jacaranda_bridge = new Bridge_Block_Rope(AbstractBlock.Settings.create().strength(0.5F, 2.5F).sounds(BlockSoundGroup.WOOD));

	public static final Block jacaranda_bridge_pier = new Bridge_Support(AbstractBlock.Settings.create().strength(0.5F, 2.5F).sounds(BlockSoundGroup.WOOD));

	public static final Block jacaranda_log_bridge_stair = new Bridge_Stairs(AbstractBlock.Settings.create().strength(0.5F, 2.5F).sounds(BlockSoundGroup.WOOD));

	public static final Block jacaranda_rope_bridge_stair = new Bridge_Stairs(AbstractBlock.Settings.create().nonOpaque().strength(0.5F, 2.5F).sounds(BlockSoundGroup.WOOD));

	public static final Block jacaranda_rail_bridge = new Rail_Bridge(AbstractBlock.Settings.create().nonOpaque().strength(0.5F, 2.5F).sounds(BlockSoundGroup.WOOD));

	public static final Block magic_log_bridge_middle = new Log_Bridge(AbstractBlock.Settings.create().strength(0.5F, 2.5F).sounds(BlockSoundGroup.WOOD));

	public static final Block rope_magic_bridge = new Bridge_Block_Rope(AbstractBlock.Settings.create().strength(0.5F, 2.5F).sounds(BlockSoundGroup.WOOD));

	public static final Block magic_bridge_pier = new Bridge_Support(AbstractBlock.Settings.create().strength(0.5F, 2.5F).sounds(BlockSoundGroup.WOOD));

	public static final Block magic_log_bridge_stair = new Bridge_Stairs(AbstractBlock.Settings.create().strength(0.5F, 2.5F).sounds(BlockSoundGroup.WOOD));

	public static final Block magic_rope_bridge_stair = new Bridge_Stairs(AbstractBlock.Settings.create().nonOpaque().strength(0.5F, 2.5F).sounds(BlockSoundGroup.WOOD));

	public static final Block magic_rail_bridge = new Rail_Bridge(AbstractBlock.Settings.create().nonOpaque().strength(0.5F, 2.5F).sounds(BlockSoundGroup.WOOD));

	public static final Block mahogany_log_bridge_middle = new Log_Bridge(AbstractBlock.Settings.create().strength(0.5F, 2.5F).sounds(BlockSoundGroup.WOOD));

	public static final Block rope_mahogany_bridge = new Bridge_Block_Rope(AbstractBlock.Settings.create().strength(0.5F, 2.5F).sounds(BlockSoundGroup.WOOD));

	public static final Block mahogany_bridge_pier = new Bridge_Support(AbstractBlock.Settings.create().strength(0.5F, 2.5F).sounds(BlockSoundGroup.WOOD));

	public static final Block mahogany_log_bridge_stair = new Bridge_Stairs(AbstractBlock.Settings.create().strength(0.5F, 2.5F).sounds(BlockSoundGroup.WOOD));

	public static final Block mahogany_rope_bridge_stair = new Bridge_Stairs(AbstractBlock.Settings.create().nonOpaque().strength(0.5F, 2.5F).sounds(BlockSoundGroup.WOOD));

	public static final Block mahogany_rail_bridge = new Rail_Bridge(AbstractBlock.Settings.create().nonOpaque().strength(0.5F, 2.5F).sounds(BlockSoundGroup.WOOD));

	public static final Block palm_log_bridge_middle = new Log_Bridge(AbstractBlock.Settings.create().strength(0.5F, 2.5F).sounds(BlockSoundGroup.WOOD));

	public static final Block rope_palm_bridge = new Bridge_Block_Rope(AbstractBlock.Settings.create().strength(0.5F, 2.5F).sounds(BlockSoundGroup.WOOD));

	public static final Block palm_bridge_pier = new Bridge_Support(AbstractBlock.Settings.create().strength(0.5F, 2.5F).sounds(BlockSoundGroup.WOOD));

	public static final Block palm_log_bridge_stair = new Bridge_Stairs(AbstractBlock.Settings.create().strength(0.5F, 2.5F).sounds(BlockSoundGroup.WOOD));

	public static final Block palm_rope_bridge_stair = new Bridge_Stairs(AbstractBlock.Settings.create().nonOpaque().strength(0.5F, 2.5F).sounds(BlockSoundGroup.WOOD));

	public static final Block palm_rail_bridge = new Rail_Bridge(AbstractBlock.Settings.create().nonOpaque().strength(0.5F, 2.5F).sounds(BlockSoundGroup.WOOD));

	public static final Block redwood_log_bridge_middle = new Log_Bridge(AbstractBlock.Settings.create().strength(0.5F, 2.5F).sounds(BlockSoundGroup.WOOD));

	public static final Block rope_redwood_bridge = new Bridge_Block_Rope(AbstractBlock.Settings.create().strength(0.5F, 2.5F).sounds(BlockSoundGroup.WOOD));

	public static final Block redwood_bridge_pier = new Bridge_Support(AbstractBlock.Settings.create().strength(0.5F, 2.5F).sounds(BlockSoundGroup.WOOD));

	public static final Block redwood_log_bridge_stair = new Bridge_Stairs(AbstractBlock.Settings.create().strength(0.5F, 2.5F).sounds(BlockSoundGroup.WOOD));

	public static final Block redwood_rope_bridge_stair = new Bridge_Stairs(AbstractBlock.Settings.create().nonOpaque().strength(0.5F, 2.5F).sounds(BlockSoundGroup.WOOD));

	public static final Block redwood_rail_bridge = new Rail_Bridge(AbstractBlock.Settings.create().nonOpaque().strength(0.5F, 2.5F).sounds(BlockSoundGroup.WOOD));

	public static final Block umbran_log_bridge_middle = new Log_Bridge(AbstractBlock.Settings.create().strength(0.5F, 2.5F).sounds(BlockSoundGroup.WOOD));

	public static final Block rope_umbran_bridge = new Bridge_Block_Rope(AbstractBlock.Settings.create().strength(0.5F, 2.5F).sounds(BlockSoundGroup.WOOD));

	public static final Block umbran_bridge_pier = new Bridge_Support(AbstractBlock.Settings.create().strength(0.5F, 2.5F).sounds(BlockSoundGroup.WOOD));

	public static final Block umbran_log_bridge_stair = new Bridge_Stairs(AbstractBlock.Settings.create().strength(0.5F, 2.5F).sounds(BlockSoundGroup.WOOD));

	public static final Block umbran_rope_bridge_stair = new Bridge_Stairs(AbstractBlock.Settings.create().nonOpaque().strength(0.5F, 2.5F).sounds(BlockSoundGroup.WOOD));

	public static final Block umbran_rail_bridge = new Rail_Bridge(AbstractBlock.Settings.create().nonOpaque().strength(0.5F, 2.5F).sounds(BlockSoundGroup.WOOD));

	public static final Block willow_log_bridge_middle = new Log_Bridge(AbstractBlock.Settings.create().strength(0.5F, 2.5F).sounds(BlockSoundGroup.WOOD));

	public static final Block rope_willow_bridge = new Bridge_Block_Rope(AbstractBlock.Settings.create().strength(0.5F, 2.5F).sounds(BlockSoundGroup.WOOD));

	public static final Block willow_bridge_pier = new Bridge_Support(AbstractBlock.Settings.create().strength(0.5F, 2.5F).sounds(BlockSoundGroup.WOOD));

	public static final Block willow_log_bridge_stair = new Bridge_Stairs(AbstractBlock.Settings.create().strength(0.5F, 2.5F).sounds(BlockSoundGroup.WOOD));

	public static final Block willow_rope_bridge_stair = new Bridge_Stairs(AbstractBlock.Settings.create().nonOpaque().strength(0.5F, 2.5F).sounds(BlockSoundGroup.WOOD));

	public static final Block willow_rail_bridge = new Rail_Bridge(AbstractBlock.Settings.create().nonOpaque().strength(0.5F, 2.5F).sounds(BlockSoundGroup.WOOD));
	
	public static final Block empyreal_log_bridge_middle = new Log_Bridge(AbstractBlock.Settings.create().strength(0.5F, 2.5F).sounds(BlockSoundGroup.WOOD));

	public static final Block rope_empyreal_bridge = new Bridge_Block_Rope(AbstractBlock.Settings.create().strength(0.5F, 2.5F).sounds(BlockSoundGroup.WOOD));

	public static final Block empyreal_bridge_pier = new Bridge_Support(AbstractBlock.Settings.create().strength(0.5F, 2.5F).sounds(BlockSoundGroup.WOOD));

	public static final Block empyreal_log_bridge_stair = new Bridge_Stairs(AbstractBlock.Settings.create().strength(0.5F, 2.5F).sounds(BlockSoundGroup.WOOD));

	public static final Block empyreal_rope_bridge_stair = new Bridge_Stairs(AbstractBlock.Settings.create().nonOpaque().strength(0.5F, 2.5F).sounds(BlockSoundGroup.WOOD));

	public static final Block empyreal_rail_bridge = new Rail_Bridge(AbstractBlock.Settings.create().nonOpaque().strength(0.5F, 2.5F).sounds(BlockSoundGroup.WOOD));
	
	public static void registry()
	{
		add("dead_log_bridge_middle", dead_log_bridge_middle);
		add("rope_dead_bridge", rope_dead_bridge);
		add("dead_bridge_pier", dead_bridge_pier);
		add("dead_log_bridge_stair", dead_log_bridge_stair);
		add("dead_rope_bridge_stair", dead_rope_bridge_stair);
		add("dead_rail_bridge", dead_rail_bridge);
		add("fir_log_bridge_middle", fir_log_bridge_middle);
		add("rope_fir_bridge", rope_fir_bridge);
		add("fir_bridge_pier", fir_bridge_pier);
		add("fir_log_bridge_stair", fir_log_bridge_stair);
		add("fir_rope_bridge_stair", fir_rope_bridge_stair);
		add("fir_rail_bridge", fir_rail_bridge);
		add("hellbark_log_bridge_middle", hellbark_log_bridge_middle);
		add("rope_hellbark_bridge", rope_hellbark_bridge);
		add("hellbark_bridge_pier", hellbark_bridge_pier);
		add("hellbark_log_bridge_stair", hellbark_log_bridge_stair);
		add("hellbark_rope_bridge_stair", hellbark_rope_bridge_stair);
		add("hellbark_rail_bridge", hellbark_rail_bridge);
		add("jacaranda_log_bridge_middle", jacaranda_log_bridge_middle);
		add("rope_jacaranda_bridge", rope_jacaranda_bridge);
		add("jacaranda_bridge_pier", jacaranda_bridge_pier);
		add("jacaranda_log_bridge_stair", jacaranda_log_bridge_stair);
		add("jacaranda_rope_bridge_stair", jacaranda_rope_bridge_stair);
		add("jacaranda_rail_bridge", jacaranda_rail_bridge);
		add("magic_log_bridge_middle", magic_log_bridge_middle);
		add("rope_magic_bridge", rope_magic_bridge);
		add("magic_bridge_pier", magic_bridge_pier);
		add("magic_log_bridge_stair", magic_log_bridge_stair);
		add("magic_rope_bridge_stair", magic_rope_bridge_stair);
		add("magic_rail_bridge", magic_rail_bridge);
		add("mahogany_log_bridge_middle", mahogany_log_bridge_middle);
		add("rope_mahogany_bridge", rope_mahogany_bridge);
		add("mahogany_bridge_pier", mahogany_bridge_pier);
		add("mahogany_log_bridge_stair", mahogany_log_bridge_stair);
		add("mahogany_rope_bridge_stair", mahogany_rope_bridge_stair);
		add("mahogany_rail_bridge", mahogany_rail_bridge);
		add("palm_log_bridge_middle", palm_log_bridge_middle);
		add("rope_palm_bridge", rope_palm_bridge);
		add("palm_bridge_pier", palm_bridge_pier);
		add("palm_log_bridge_stair", palm_log_bridge_stair);
		add("palm_rope_bridge_stair", palm_rope_bridge_stair);
		add("palm_rail_bridge", palm_rail_bridge);
		add("redwood_log_bridge_middle", redwood_log_bridge_middle);
		add("rope_redwood_bridge", rope_redwood_bridge);
		add("redwood_bridge_pier", redwood_bridge_pier);
		add("redwood_log_bridge_stair", redwood_log_bridge_stair);
		add("redwood_rope_bridge_stair", redwood_rope_bridge_stair);
		add("redwood_rail_bridge", redwood_rail_bridge);
		add("umbran_log_bridge_middle", umbran_log_bridge_middle);
		add("rope_umbran_bridge", rope_umbran_bridge);
		add("umbran_bridge_pier", umbran_bridge_pier);
		add("umbran_log_bridge_stair", umbran_log_bridge_stair);
		add("umbran_rope_bridge_stair", umbran_rope_bridge_stair);
		add("umbran_rail_bridge", umbran_rail_bridge);
		add("willow_log_bridge_middle", willow_log_bridge_middle);
		add("rope_willow_bridge", rope_willow_bridge);
		add("willow_bridge_pier", willow_bridge_pier);
		add("willow_log_bridge_stair", willow_log_bridge_stair);
		add("willow_rope_bridge_stair", willow_rope_bridge_stair);
		add("willow_rail_bridge", willow_rail_bridge);
		add("empyreal_log_bridge_middle", empyreal_log_bridge_middle);
		add("rope_empyreal_bridge", rope_empyreal_bridge);
		add("empyreal_bridge_pier", empyreal_bridge_pier);
		add("empyreal_log_bridge_stair", empyreal_log_bridge_stair);
		add("empyreal_rope_bridge_stair", empyreal_rope_bridge_stair);
		add("empyreal_rail_bridge", empyreal_rail_bridge);
	}
	
	private static void add(String name, Block b)
    {
    	Registry.register(Registries.BLOCK, new Identifier(MacawsBridgesBOP.MODID, name), b);
    	blockItem(b, name);
	}
    
    private static void blockItem(Block b, String n)
    {
        Registry.register(Registries.ITEM, new Identifier(MacawsBridgesBOP.MODID, n), new BlockItem(b, new Item.Settings()));
    }

}