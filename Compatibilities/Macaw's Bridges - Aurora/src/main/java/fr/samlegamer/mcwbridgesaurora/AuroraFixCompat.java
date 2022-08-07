package fr.samlegamer.mcwbridgesaurora;

import fr.samlegamer.mcwbridgesaurora.block.MBABlocksRegistry;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = McwBridgesAurora.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class AuroraFixCompat
{
	private static final String MARIO = "macawsbridgesenhancedmushrooms";
	private static final String BAYOU = "mcwbridgesbayoublues";

	@SubscribeEvent
	public static void missingnoBlockBridges(RegistryEvent.MissingMappings<Block> event)
	{
		addMissingBlock(event, MARIO, "brown_mushroom_log_bridge_middle", MBABlocksRegistry.brown_mushroom_log_bridge_middle.get());
		addMissingBlock(event, MARIO, "red_mushroom_log_bridge_middle", MBABlocksRegistry.red_mushroom_log_bridge_middle.get());
		addMissingBlock(event, MARIO, "rope_brown_mushroom_bridge", MBABlocksRegistry.rope_brown_mushroom_bridge.get());
		addMissingBlock(event, MARIO, "rope_red_mushroom_bridge", MBABlocksRegistry.rope_red_mushroom_bridge.get());
		addMissingBlock(event, MARIO, "brown_mushroom_bridge_pier", MBABlocksRegistry.brown_mushroom_bridge_pier.get());
		addMissingBlock(event, MARIO, "red_mushroom_bridge_pier", MBABlocksRegistry.red_mushroom_bridge_pier.get());
		addMissingBlock(event, MARIO, "brown_mushroom_log_bridge_stair", MBABlocksRegistry.brown_mushroom_log_bridge_stair.get());
		addMissingBlock(event, MARIO, "red_mushroom_log_bridge_stair", MBABlocksRegistry.red_mushroom_log_bridge_stair.get());
		addMissingBlock(event, MARIO, "brown_mushroom_rail_bridge", MBABlocksRegistry.brown_mushroom_rail_bridge.get());
		addMissingBlock(event, MARIO, "red_mushroom_rail_bridge", MBABlocksRegistry.red_mushroom_rail_bridge.get());
		addMissingBlock(event, BAYOU, "cypress_log_bridge_middle", MBABlocksRegistry.cypress_log_bridge_middle.get());
		addMissingBlock(event, BAYOU, "cypress_rail_bridge", MBABlocksRegistry.cypress_rail_bridge.get());
		addMissingBlock(event, BAYOU, "cypress_log_bridge_stair", MBABlocksRegistry.cypress_log_bridge_stair.get());
		addMissingBlock(event, BAYOU, "cypress_bridge_pier", MBABlocksRegistry.cypress_bridge_pier.get());
		addMissingBlock(event, BAYOU, "rope_cypress_bridge", MBABlocksRegistry.rope_cypress_bridge.get());		
	}
	
	@SubscribeEvent
	public static void missingnoItemBridges(RegistryEvent.MissingMappings<Item> event)
	{
		addMissingItem(event, MARIO, "brown_mushroom_log_bridge_middle", MBABlocksRegistry.brown_mushroom_log_bridge_middle.get().asItem());
		addMissingItem(event, MARIO, "red_mushroom_log_bridge_middle", MBABlocksRegistry.red_mushroom_log_bridge_middle.get().asItem());
		addMissingItem(event, MARIO, "rope_brown_mushroom_bridge", MBABlocksRegistry.rope_brown_mushroom_bridge.get().asItem());
		addMissingItem(event, MARIO, "rope_red_mushroom_bridge", MBABlocksRegistry.rope_red_mushroom_bridge.get().asItem());
		addMissingItem(event, MARIO, "brown_mushroom_bridge_pier", MBABlocksRegistry.brown_mushroom_bridge_pier.get().asItem());
		addMissingItem(event, MARIO, "red_mushroom_bridge_pier", MBABlocksRegistry.red_mushroom_bridge_pier.get().asItem());
		addMissingItem(event, MARIO, "brown_mushroom_log_bridge_stair", MBABlocksRegistry.brown_mushroom_log_bridge_stair.get().asItem());
		addMissingItem(event, MARIO, "red_mushroom_log_bridge_stair", MBABlocksRegistry.red_mushroom_log_bridge_stair.get().asItem());
		addMissingItem(event, MARIO, "brown_mushroom_rail_bridge", MBABlocksRegistry.brown_mushroom_rail_bridge.get().asItem());
		addMissingItem(event, MARIO, "red_mushroom_rail_bridge", MBABlocksRegistry.red_mushroom_rail_bridge.get().asItem());
		addMissingItem(event, BAYOU, "cypress_log_bridge_middle", MBABlocksRegistry.cypress_log_bridge_middle.get().asItem());
		addMissingItem(event, BAYOU, "cypress_rail_bridge", MBABlocksRegistry.cypress_rail_bridge.get().asItem());
		addMissingItem(event, BAYOU, "cypress_log_bridge_stair", MBABlocksRegistry.cypress_log_bridge_stair.get().asItem());
		addMissingItem(event, BAYOU, "cypress_bridge_pier", MBABlocksRegistry.cypress_bridge_pier.get().asItem());
		addMissingItem(event, BAYOU, "rope_cypress_bridge", MBABlocksRegistry.rope_cypress_bridge.get().asItem());		
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