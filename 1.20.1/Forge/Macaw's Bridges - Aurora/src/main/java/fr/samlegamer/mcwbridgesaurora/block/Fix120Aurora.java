package fr.samlegamer.mcwbridgesaurora.block;

import fr.samlegamer.mcwbridgesaurora.McwBridgesAurora;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.MissingMappingsEvent;

@Mod.EventBusSubscriber(modid = McwBridgesAurora.MODID, bus = Mod.EventBusSubscriber.Bus.FORGE)
public class Fix120Aurora
{
	//@SubscribeEvent
	public static void missingnoBlockBridges(MissingMappingsEvent event)
	{
		//Block
		addMissingBlock(event, McwBridgesAurora.MODID, "red_mushroom_log_bridge_middle", MBABlocksRegistry.mushroom_log_bridge_middle.get());
		addMissingBlock(event, McwBridgesAurora.MODID, "brown_mushroom_log_bridge_middle", MBABlocksRegistry.mushroom_log_bridge_middle.get());

		addMissingBlock(event, McwBridgesAurora.MODID, "rope_red_mushroom_bridge", MBABlocksRegistry.rope_mushroom_bridge.get());
		addMissingBlock(event, McwBridgesAurora.MODID, "rope_brown_mushroom_bridge", MBABlocksRegistry.rope_mushroom_bridge.get());

		addMissingBlock(event, McwBridgesAurora.MODID, "red_mushroom_bridge_pier", MBABlocksRegistry.mushroom_bridge_pier.get());
		addMissingBlock(event, McwBridgesAurora.MODID, "brown_mushroom_bridge_pier", MBABlocksRegistry.mushroom_bridge_pier.get());

		addMissingBlock(event, McwBridgesAurora.MODID, "red_mushroom_log_bridge_stair", MBABlocksRegistry.mushroom_log_bridge_stair.get());
		addMissingBlock(event, McwBridgesAurora.MODID, "brown_mushroom_log_bridge_stair", MBABlocksRegistry.mushroom_log_bridge_stair.get());

		addMissingBlock(event, McwBridgesAurora.MODID, "red_mushroom_rope_bridge_stair", MBABlocksRegistry.mushroom_rope_bridge_stair.get());
		addMissingBlock(event, McwBridgesAurora.MODID, "brown_mushroom_rope_bridge_stair", MBABlocksRegistry.mushroom_rope_bridge_stair.get());

		addMissingBlock(event, McwBridgesAurora.MODID, "red_mushroom_rail_bridge", MBABlocksRegistry.mushroom_rail_bridge.get());
		addMissingBlock(event, McwBridgesAurora.MODID, "brown_mushroom_rail_bridge", MBABlocksRegistry.mushroom_rail_bridge.get());
		
		//Item
		addMissingItem(event, McwBridgesAurora.MODID, "red_mushroom_log_bridge_middle", MBABlocksRegistry.mushroom_log_bridge_middle.get().asItem());
		addMissingItem(event, McwBridgesAurora.MODID, "brown_mushroom_log_bridge_middle", MBABlocksRegistry.mushroom_log_bridge_middle.get().asItem());

		addMissingItem(event, McwBridgesAurora.MODID, "rope_red_mushroom_bridge", MBABlocksRegistry.rope_mushroom_bridge.get().asItem());
		addMissingItem(event, McwBridgesAurora.MODID, "rope_brown_mushroom_bridge", MBABlocksRegistry.rope_mushroom_bridge.get().asItem());

		addMissingItem(event, McwBridgesAurora.MODID, "red_mushroom_bridge_pier", MBABlocksRegistry.mushroom_bridge_pier.get().asItem());
		addMissingItem(event, McwBridgesAurora.MODID, "brown_mushroom_bridge_pier", MBABlocksRegistry.mushroom_bridge_pier.get().asItem());

		addMissingItem(event, McwBridgesAurora.MODID, "red_mushroom_log_bridge_stair", MBABlocksRegistry.mushroom_log_bridge_stair.get().asItem());
		addMissingItem(event, McwBridgesAurora.MODID, "brown_mushroom_log_bridge_stair", MBABlocksRegistry.mushroom_log_bridge_stair.get().asItem());

		addMissingItem(event, McwBridgesAurora.MODID, "red_mushroom_rope_bridge_stair", MBABlocksRegistry.mushroom_rope_bridge_stair.get().asItem());
		addMissingItem(event, McwBridgesAurora.MODID, "brown_mushroom_rope_bridge_stair", MBABlocksRegistry.mushroom_rope_bridge_stair.get().asItem());

		addMissingItem(event, McwBridgesAurora.MODID, "red_mushroom_rail_bridge", MBABlocksRegistry.mushroom_rail_bridge.get().asItem());
		addMissingItem(event, McwBridgesAurora.MODID, "brown_mushroom_rail_bridge", MBABlocksRegistry.mushroom_rail_bridge.get().asItem());
	}
	
	private static void addMissingBlock(MissingMappingsEvent event, String modid, String nameMissing, Block b)
	{
		for(MissingMappingsEvent.Mapping<Block> entry : event.getAllMappings(Registries.BLOCK))
		{
			if(entry.getKey().toString().equals(modid + ":" + nameMissing))
			{
				entry.remap(b);
			}
		}
	}
	
	private static void addMissingItem(MissingMappingsEvent event, String modid, String nameMissing, Item i)
	{
		for(MissingMappingsEvent.Mapping<Item> entry : event.getAllMappings(Registries.ITEM))
		{
			if(entry.getKey().toString().equals(modid + ":" + nameMissing))
			{
				entry.remap(i);
			}
		}
	}
}
