package fr.samlegamer.mcwbridgessajevius;

import fr.samlegamer.mcwbridgessajevius.block.MBSBlocksRegistry;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = McwBridgesSajevius.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class SajeviusFixCompat
{
	private static final String SHROOMED = "mcwbridgesshroomed";
	private static final String BETTERLANDS = "macawsbridgesbetterlands";

	@SubscribeEvent
	public static void missingnoBlockBridges(RegistryEvent.MissingMappings<Block> event)
	{		
		addMissingBlock(event, SHROOMED, "blue_hard_mushroom_log_bridge_middle", MBSBlocksRegistry.blue_hard_mushroom_log_bridge_middle.get());
		addMissingBlock(event, SHROOMED, "hard_mushroom_log_bridge_middle", MBSBlocksRegistry.hard_mushroom_log_bridge_middle.get());
		addMissingBlock(event, SHROOMED, "orange_hard_mushroom_log_bridge_middle", MBSBlocksRegistry.orange_hard_mushroom_log_bridge_middle.get());
		addMissingBlock(event, SHROOMED, "purple_hard_mushroom_log_bridge_middle", MBSBlocksRegistry.purple_hard_mushroom_log_bridge_middle.get());
		addMissingBlock(event, SHROOMED, "blue_hard_mushroom_rail_bridge", MBSBlocksRegistry.blue_hard_mushroom_rail_bridge.get());
		addMissingBlock(event, SHROOMED, "hard_mushroom_rail_bridge", MBSBlocksRegistry.hard_mushroom_rail_bridge.get());
		addMissingBlock(event, SHROOMED, "orange_hard_mushroom_rail_bridge", MBSBlocksRegistry.orange_hard_mushroom_rail_bridge.get());
		addMissingBlock(event, SHROOMED, "purple_hard_mushroom_rail_bridge", MBSBlocksRegistry.purple_hard_mushroom_rail_bridge.get());
		addMissingBlock(event, SHROOMED, "blue_hard_mushroom_log_bridge_stair", MBSBlocksRegistry.blue_hard_mushroom_log_bridge_stair.get());
		addMissingBlock(event, SHROOMED, "hard_mushroom_log_bridge_stair", MBSBlocksRegistry.hard_mushroom_log_bridge_stair.get());
		addMissingBlock(event, SHROOMED, "orange_hard_mushroom_log_bridge_stair", MBSBlocksRegistry.orange_hard_mushroom_log_bridge_stair.get());
		addMissingBlock(event, SHROOMED, "purple_hard_mushroom_log_bridge_stair", MBSBlocksRegistry.purple_hard_mushroom_log_bridge_stair.get());
		addMissingBlock(event, SHROOMED, "blue_hard_mushroom_bridge_pier", MBSBlocksRegistry.blue_hard_mushroom_bridge_pier.get());
		addMissingBlock(event, SHROOMED, "hard_mushroom_bridge_pier", MBSBlocksRegistry.hard_mushroom_bridge_pier.get());
		addMissingBlock(event, SHROOMED, "orange_hard_mushroom_bridge_pier", MBSBlocksRegistry.orange_hard_mushroom_bridge_pier.get());
		addMissingBlock(event, SHROOMED, "purple_hard_mushroom_bridge_pier", MBSBlocksRegistry.purple_hard_mushroom_bridge_pier.get());
		addMissingBlock(event, SHROOMED, "rope_blue_hard_mushroom_bridge", MBSBlocksRegistry.rope_blue_hard_mushroom_bridge.get());
		addMissingBlock(event, SHROOMED, "rope_hard_mushroom_bridge", MBSBlocksRegistry.rope_hard_mushroom_bridge.get());
		addMissingBlock(event, SHROOMED, "rope_orange_hard_mushroom_bridge", MBSBlocksRegistry.rope_orange_hard_mushroom_bridge.get());
		addMissingBlock(event, SHROOMED, "rope_purple_hard_mushroom_bridge", MBSBlocksRegistry.rope_purple_hard_mushroom_bridge.get());
		
		addMissingBlock(event, BETTERLANDS, "juniper_log_bridge_middle", MBSBlocksRegistry.juniper_log_bridge_middle.get());
		addMissingBlock(event, BETTERLANDS, "rope_juniper_bridge", MBSBlocksRegistry.rope_juniper_bridge.get());
		addMissingBlock(event, BETTERLANDS, "juniper_bridge_pier", MBSBlocksRegistry.juniper_bridge_pier.get());
		addMissingBlock(event, BETTERLANDS, "juniper_log_bridge_stair", MBSBlocksRegistry.juniper_log_bridge_stair.get());
		addMissingBlock(event, BETTERLANDS, "juniper_rope_bridge_stair", MBSBlocksRegistry.juniper_rope_bridge_stair.get());
		addMissingBlock(event, BETTERLANDS, "juniper_rail_bridge", MBSBlocksRegistry.juniper_rail_bridge.get());

		
	}
	
	@SubscribeEvent
	public static void missingnoItemBridges(RegistryEvent.MissingMappings<Item> event)
	{		
		addMissingItem(event, SHROOMED, "blue_hard_mushroom_log_bridge_middle", MBSBlocksRegistry.blue_hard_mushroom_log_bridge_middle.get().asItem());
		addMissingItem(event, SHROOMED, "hard_mushroom_log_bridge_middle", MBSBlocksRegistry.hard_mushroom_log_bridge_middle.get().asItem());
		addMissingItem(event, SHROOMED, "orange_hard_mushroom_log_bridge_middle", MBSBlocksRegistry.orange_hard_mushroom_log_bridge_middle.get().asItem());
		addMissingItem(event, SHROOMED, "purple_hard_mushroom_log_bridge_middle", MBSBlocksRegistry.purple_hard_mushroom_log_bridge_middle.get().asItem());
		addMissingItem(event, SHROOMED, "blue_hard_mushroom_rail_bridge", MBSBlocksRegistry.blue_hard_mushroom_rail_bridge.get().asItem());
		addMissingItem(event, SHROOMED, "hard_mushroom_rail_bridge", MBSBlocksRegistry.hard_mushroom_rail_bridge.get().asItem());
		addMissingItem(event, SHROOMED, "orange_hard_mushroom_rail_bridge", MBSBlocksRegistry.orange_hard_mushroom_rail_bridge.get().asItem());
		addMissingItem(event, SHROOMED, "purple_hard_mushroom_rail_bridge", MBSBlocksRegistry.purple_hard_mushroom_rail_bridge.get().asItem());
		addMissingItem(event, SHROOMED, "blue_hard_mushroom_log_bridge_stair", MBSBlocksRegistry.blue_hard_mushroom_log_bridge_stair.get().asItem());
		addMissingItem(event, SHROOMED, "hard_mushroom_log_bridge_stair", MBSBlocksRegistry.hard_mushroom_log_bridge_stair.get().asItem());
		addMissingItem(event, SHROOMED, "orange_hard_mushroom_log_bridge_stair", MBSBlocksRegistry.orange_hard_mushroom_log_bridge_stair.get().asItem());
		addMissingItem(event, SHROOMED, "purple_hard_mushroom_log_bridge_stair", MBSBlocksRegistry.purple_hard_mushroom_log_bridge_stair.get().asItem());
		addMissingItem(event, SHROOMED, "blue_hard_mushroom_bridge_pier", MBSBlocksRegistry.blue_hard_mushroom_bridge_pier.get().asItem());
		addMissingItem(event, SHROOMED, "hard_mushroom_bridge_pier", MBSBlocksRegistry.hard_mushroom_bridge_pier.get().asItem());
		addMissingItem(event, SHROOMED, "orange_hard_mushroom_bridge_pier", MBSBlocksRegistry.orange_hard_mushroom_bridge_pier.get().asItem());
		addMissingItem(event, SHROOMED, "purple_hard_mushroom_bridge_pier", MBSBlocksRegistry.purple_hard_mushroom_bridge_pier.get().asItem());
		addMissingItem(event, SHROOMED, "rope_blue_hard_mushroom_bridge", MBSBlocksRegistry.rope_blue_hard_mushroom_bridge.get().asItem());
		addMissingItem(event, SHROOMED, "rope_hard_mushroom_bridge", MBSBlocksRegistry.rope_hard_mushroom_bridge.get().asItem());
		addMissingItem(event, SHROOMED, "rope_orange_hard_mushroom_bridge", MBSBlocksRegistry.rope_orange_hard_mushroom_bridge.get().asItem());
		addMissingItem(event, SHROOMED, "rope_purple_hard_mushroom_bridge", MBSBlocksRegistry.rope_purple_hard_mushroom_bridge.get().asItem());
		
		addMissingItem(event, BETTERLANDS, "juniper_log_bridge_middle", MBSBlocksRegistry.juniper_log_bridge_middle.get().asItem());
		addMissingItem(event, BETTERLANDS, "rope_juniper_bridge", MBSBlocksRegistry.rope_juniper_bridge.get().asItem());
		addMissingItem(event, BETTERLANDS, "juniper_bridge_pier", MBSBlocksRegistry.juniper_bridge_pier.get().asItem());
		addMissingItem(event, BETTERLANDS, "juniper_log_bridge_stair", MBSBlocksRegistry.juniper_log_bridge_stair.get().asItem());
		addMissingItem(event, BETTERLANDS, "juniper_rope_bridge_stair", MBSBlocksRegistry.juniper_rope_bridge_stair.get().asItem());
		addMissingItem(event, BETTERLANDS, "juniper_rail_bridge", MBSBlocksRegistry.juniper_rail_bridge.get().asItem());

	}
	
	private static void addMissingBlock(RegistryEvent.MissingMappings<Block> event, String modid, String nameMissing, Block b)
	{
		for(RegistryEvent.MissingMappings.Mapping<Block> entry : event.getAllMappings())
		{
			if(entry.key.toString().equals(modid + ":" + nameMissing))
			{
				entry.remap(b);
			}
		}
	}
	
	private static void addMissingItem(RegistryEvent.MissingMappings<Item> event, String modid, String nameMissing, Item i)
	{
		for(RegistryEvent.MissingMappings.Mapping<Item> entry : event.getAllMappings())
		{
			if(entry.key.toString().equals(modid + ":" + nameMissing))
			{
				entry.remap(i);
			}
		}
	}
}