package fr.samlegamer.mcwbridgesabnormals;

import fr.samlegamer.mcwbridgesabnormals.block.MBABlocksRegistry;
import net.minecraft.core.Registry;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.MissingMappingsEvent;
import net.minecraftforge.registries.MissingMappingsEvent.Mapping;

@Mod.EventBusSubscriber(modid = McwBridgesAbnormals.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class AbnormalsFixCompat
{
	private static final String BEES = "macawsbridgesbuzzierbees";
	private static final String ATMO = "macawsbridgesatmospheric";
	private static final String MAPLE = "macawsbridgesautumnity";
	private static final String PINKY_LEAVES = "macawsbridgesenvironmental";

	@SubscribeEvent
	public static void missingnoBlockBridges(MissingMappingsEvent event)
	{		
		addMissingBlock(event, PINKY_LEAVES, "cherry_log_bridge_middle", MBABlocksRegistry.cherry_log_bridge_middle.get());
		addMissingBlock(event, PINKY_LEAVES, "wisteria_log_bridge_middle", MBABlocksRegistry.wisteria_log_bridge_middle.get());
		addMissingBlock(event, PINKY_LEAVES, "willow_log_bridge_middle", MBABlocksRegistry.willow_log_bridge_middle.get());
		addMissingBlock(event, PINKY_LEAVES, "cherry_rail_bridge", MBABlocksRegistry.cherry_rail_bridge.get());
		addMissingBlock(event, PINKY_LEAVES, "wisteria_rail_bridge", MBABlocksRegistry.wisteria_rail_bridge.get());
		addMissingBlock(event, PINKY_LEAVES, "willow_rail_bridge", MBABlocksRegistry.willow_rail_bridge.get());
		addMissingBlock(event, PINKY_LEAVES, "cherry_log_bridge_stair", MBABlocksRegistry.cherry_log_bridge_stair.get());
		addMissingBlock(event, PINKY_LEAVES, "wisteria_log_bridge_stair", MBABlocksRegistry.wisteria_log_bridge_stair.get());
		addMissingBlock(event, PINKY_LEAVES, "willow_log_bridge_stair", MBABlocksRegistry.willow_log_bridge_stair.get());
		addMissingBlock(event, PINKY_LEAVES, "cherry_rope_bridge_stair", MBABlocksRegistry.cherry_rope_bridge_stair.get());
		addMissingBlock(event, PINKY_LEAVES, "wisteria_rope_bridge_stair", MBABlocksRegistry.wisteria_rope_bridge_stair.get());
		addMissingBlock(event, PINKY_LEAVES, "willow_rope_bridge_stair", MBABlocksRegistry.willow_rope_bridge_stair.get());
		addMissingBlock(event, PINKY_LEAVES, "cherry_bridge_pier", MBABlocksRegistry.cherry_bridge_pier.get());
		addMissingBlock(event, PINKY_LEAVES, "wisteria_bridge_pier", MBABlocksRegistry.wisteria_bridge_pier.get());
		addMissingBlock(event, PINKY_LEAVES, "willow_bridge_pier", MBABlocksRegistry.willow_bridge_pier.get());
		addMissingBlock(event, PINKY_LEAVES, "rope_cherry_bridge", MBABlocksRegistry.rope_cherry_bridge.get());
		addMissingBlock(event, PINKY_LEAVES, "rope_wisteria_bridge", MBABlocksRegistry.rope_wisteria_bridge.get());
		addMissingBlock(event, PINKY_LEAVES, "rope_willow_bridge", MBABlocksRegistry.rope_willow_bridge.get());
		addMissingBlock(event, BEES, "honeycomb_brick_bridge", MBABlocksRegistry.HONEYCOMB_BRICK_BRIDGE_MIDDLE.get());
		addMissingBlock(event, BEES, "honeycomb_tile_bridge", MBABlocksRegistry.HONEYCOMB_TILE_BRIDGE_MIDDLE.get());
		addMissingBlock(event, BEES, "honeycomb_brick_bridge_stair", MBABlocksRegistry.honeycomb_brick_bridge_stair.get());
		addMissingBlock(event, BEES, "honeycomb_tile_bridge_stair", MBABlocksRegistry.honeycomb_tile_bridge_stair.get());
		addMissingBlock(event, BEES, "honeycomb_brick_bridge_pier", MBABlocksRegistry.honeycomb_brick_bridge_pier.get());
		addMissingBlock(event, BEES, "honeycomb_tile_bridge_pier", MBABlocksRegistry.honeycomb_tile_bridge_pier.get());
		addMissingBlock(event, ATMO, "red_arid_sandstone_bridge", MBABlocksRegistry.red_arid_sandstone_bridge.get());
		addMissingBlock(event, ATMO, "arid_sandstone_bridge", MBABlocksRegistry.arid_sandstone_bridge.get());
		addMissingBlock(event, ATMO, "red_arid_sandstone_bridge_stair", MBABlocksRegistry.red_arid_sandstone_bridge_stair.get());
		addMissingBlock(event, ATMO, "arid_sandstone_bridge_pier", MBABlocksRegistry.arid_sandstone_bridge_pier.get());
		addMissingBlock(event, ATMO, "red_arid_sandstone_bridge_pier", MBABlocksRegistry.red_arid_sandstone_bridge_pier.get());
		addMissingBlock(event, ATMO, "arid_sandstone_bridge_stair", MBABlocksRegistry.arid_sandstone_bridge_stair.get());
		addMissingBlock(event, MAPLE, "maple_log_bridge_middle", MBABlocksRegistry.maple_log_bridge_middle.get());
		addMissingBlock(event, MAPLE, "rope_maple_bridge", MBABlocksRegistry.rope_maple_bridge.get());
		addMissingBlock(event, MAPLE, "maple_bridge_pier", MBABlocksRegistry.maple_bridge_pier.get());
		addMissingBlock(event, MAPLE, "maple_log_bridge_stair", MBABlocksRegistry.maple_log_bridge_stair.get());
		addMissingBlock(event, MAPLE, "maple_rope_bridge_stair", MBABlocksRegistry.maple_rope_bridge_stair.get());
		addMissingBlock(event, MAPLE, "maple_rail_bridge", MBABlocksRegistry.maple_rail_bridge.get());
		addMissingBlock(event, MAPLE, "snail_shell_bricks_bridge", MBABlocksRegistry.snail_shell_bricks_bridge.get());
		addMissingBlock(event, MAPLE, "snail_shell_bricks_bridge_pier", MBABlocksRegistry.snail_shell_bricks_bridge_pier.get());
		addMissingBlock(event, MAPLE, "snail_shell_bricks_bridge_stair", MBABlocksRegistry.snail_shell_bricks_bridge_stair.get());
		addMissingBlock(event, MAPLE, "snail_shell_tiles_bridge", MBABlocksRegistry.snail_shell_tiles_bridge.get());
		addMissingBlock(event, MAPLE, "snail_shell_tiles_bridge_pier", MBABlocksRegistry.snail_shell_tiles_bridge_pier.get());
		addMissingBlock(event, MAPLE, "snail_shell_tiles_bridge_stair", MBABlocksRegistry.snail_shell_tiles_bridge_stair.get());
		addMissingBlock(event, ATMO, "aspen_log_bridge_middle", MBABlocksRegistry.aspen_log_bridge_middle.get());
		addMissingBlock(event, ATMO, "grimwood_log_bridge_middle", MBABlocksRegistry.grimwood_log_bridge_middle.get());
		addMissingBlock(event, ATMO, "kousa_log_bridge_middle", MBABlocksRegistry.kousa_log_bridge_middle.get());
		addMissingBlock(event, ATMO, "morado_log_bridge_middle", MBABlocksRegistry.morado_log_bridge_middle.get());
		addMissingBlock(event, ATMO, "rosewood_log_bridge_middle", MBABlocksRegistry.rosewood_log_bridge_middle.get());
		addMissingBlock(event, ATMO, "yucca_log_bridge_middle", MBABlocksRegistry.yucca_log_bridge_middle.get());
		addMissingBlock(event, ATMO, "rope_aspen_bridge", MBABlocksRegistry.rope_aspen_bridge.get());
		addMissingBlock(event, ATMO, "rope_grimwood_bridge", MBABlocksRegistry.rope_grimwood_bridge.get());
		addMissingBlock(event, ATMO, "rope_kousa_bridge", MBABlocksRegistry.rope_kousa_bridge.get());
		addMissingBlock(event, ATMO, "rope_morado_bridge", MBABlocksRegistry.rope_morado_bridge.get());
		addMissingBlock(event, ATMO, "rope_rosewood_bridge", MBABlocksRegistry.rope_rosewood_bridge.get());
		addMissingBlock(event, ATMO, "rope_yucca_bridge", MBABlocksRegistry.rope_yucca_bridge.get());
		addMissingBlock(event, ATMO, "aspen_bridge_pier", MBABlocksRegistry.aspen_bridge_pier.get());
		addMissingBlock(event, ATMO, "grimwood_bridge_pier", MBABlocksRegistry.grimwood_bridge_pier.get());
		addMissingBlock(event, ATMO, "kousa_bridge_pier", MBABlocksRegistry.kousa_bridge_pier.get());
		addMissingBlock(event, ATMO, "morado_bridge_pier", MBABlocksRegistry.morado_bridge_pier.get());
		addMissingBlock(event, ATMO, "rosewood_bridge_pier", MBABlocksRegistry.rosewood_bridge_pier.get());
		addMissingBlock(event, ATMO, "yucca_bridge_pier", MBABlocksRegistry.yucca_bridge_pier.get());
		addMissingBlock(event, ATMO, "aspen_log_bridge_stair", MBABlocksRegistry.aspen_log_bridge_stair.get());
		addMissingBlock(event, ATMO, "grimwood_log_bridge_stair", MBABlocksRegistry.grimwood_log_bridge_stair.get());
		addMissingBlock(event, ATMO, "kousa_log_bridge_stair", MBABlocksRegistry.kousa_log_bridge_stair.get());
		addMissingBlock(event, ATMO, "morado_log_bridge_stair", MBABlocksRegistry.morado_log_bridge_stair.get());
		addMissingBlock(event, ATMO, "rosewood_log_bridge_stair", MBABlocksRegistry.rosewood_log_bridge_stair.get());
		addMissingBlock(event, ATMO, "yucca_log_bridge_stair", MBABlocksRegistry.yucca_log_bridge_stair.get());
		addMissingBlock(event, ATMO, "aspen_rope_bridge_stair", MBABlocksRegistry.aspen_rope_bridge_stair.get());
		addMissingBlock(event, ATMO, "grimwood_rope_bridge_stair", MBABlocksRegistry.grimwood_rope_bridge_stair.get());
		addMissingBlock(event, ATMO, "kousa_rope_bridge_stair", MBABlocksRegistry.kousa_rope_bridge_stair.get());
		addMissingBlock(event, ATMO, "morado_rope_bridge_stair", MBABlocksRegistry.morado_rope_bridge_stair.get());
		addMissingBlock(event, ATMO, "rosewood_rope_bridge_stair", MBABlocksRegistry.rosewood_rope_bridge_stair.get());
		addMissingBlock(event, ATMO, "yucca_rope_bridge_stair", MBABlocksRegistry.yucca_rope_bridge_stair.get());
		addMissingBlock(event, ATMO, "aspen_rail_bridge", MBABlocksRegistry.aspen_rail_bridge.get());
		addMissingBlock(event, ATMO, "grimwood_rail_bridge", MBABlocksRegistry.grimwood_rail_bridge.get());
		addMissingBlock(event, ATMO, "kousa_rail_bridge", MBABlocksRegistry.kousa_rail_bridge.get());
		addMissingBlock(event, ATMO, "morado_rail_bridge", MBABlocksRegistry.morado_rail_bridge.get());
		addMissingBlock(event, ATMO, "rosewood_rail_bridge", MBABlocksRegistry.rosewood_rail_bridge.get());
		addMissingBlock(event, ATMO, "yucca_rail_bridge", MBABlocksRegistry.yucca_rail_bridge.get());
	}
	
	@SubscribeEvent
	public static void missingnoItemBridges(MissingMappingsEvent event)
	{		
		addMissingItem(event, PINKY_LEAVES, "cherry_log_bridge_middle", MBABlocksRegistry.cherry_log_bridge_middle.get().asItem());
		addMissingItem(event, PINKY_LEAVES, "wisteria_log_bridge_middle", MBABlocksRegistry.wisteria_log_bridge_middle.get().asItem());
		addMissingItem(event, PINKY_LEAVES, "willow_log_bridge_middle", MBABlocksRegistry.willow_log_bridge_middle.get().asItem());
		addMissingItem(event, PINKY_LEAVES, "cherry_rail_bridge", MBABlocksRegistry.cherry_rail_bridge.get().asItem());
		addMissingItem(event, PINKY_LEAVES, "wisteria_rail_bridge", MBABlocksRegistry.wisteria_rail_bridge.get().asItem());
		addMissingItem(event, PINKY_LEAVES, "willow_rail_bridge", MBABlocksRegistry.willow_rail_bridge.get().asItem());
		addMissingItem(event, PINKY_LEAVES, "cherry_log_bridge_stair", MBABlocksRegistry.cherry_log_bridge_stair.get().asItem());
		addMissingItem(event, PINKY_LEAVES, "wisteria_log_bridge_stair", MBABlocksRegistry.wisteria_log_bridge_stair.get().asItem());
		addMissingItem(event, PINKY_LEAVES, "willow_log_bridge_stair", MBABlocksRegistry.willow_log_bridge_stair.get().asItem());
		addMissingItem(event, PINKY_LEAVES, "cherry_rope_bridge_stair", MBABlocksRegistry.cherry_rope_bridge_stair.get().asItem());
		addMissingItem(event, PINKY_LEAVES, "wisteria_rope_bridge_stair", MBABlocksRegistry.wisteria_rope_bridge_stair.get().asItem());
		addMissingItem(event, PINKY_LEAVES, "willow_rope_bridge_stair", MBABlocksRegistry.willow_rope_bridge_stair.get().asItem());
		addMissingItem(event, PINKY_LEAVES, "cherry_bridge_pier", MBABlocksRegistry.cherry_bridge_pier.get().asItem());
		addMissingItem(event, PINKY_LEAVES, "wisteria_bridge_pier", MBABlocksRegistry.wisteria_bridge_pier.get().asItem());
		addMissingItem(event, PINKY_LEAVES, "willow_bridge_pier", MBABlocksRegistry.willow_bridge_pier.get().asItem());
		addMissingItem(event, PINKY_LEAVES, "rope_cherry_bridge", MBABlocksRegistry.rope_cherry_bridge.get().asItem());
		addMissingItem(event, PINKY_LEAVES, "rope_wisteria_bridge", MBABlocksRegistry.rope_wisteria_bridge.get().asItem());
		addMissingItem(event, PINKY_LEAVES, "rope_willow_bridge", MBABlocksRegistry.rope_willow_bridge.get().asItem());
		addMissingItem(event, BEES, "honeycomb_brick_bridge", MBABlocksRegistry.HONEYCOMB_BRICK_BRIDGE_MIDDLE.get().asItem());
		addMissingItem(event, BEES, "honeycomb_tile_bridge", MBABlocksRegistry.HONEYCOMB_TILE_BRIDGE_MIDDLE.get().asItem());
		addMissingItem(event, BEES, "honeycomb_brick_bridge_stair", MBABlocksRegistry.honeycomb_brick_bridge_stair.get().asItem());
		addMissingItem(event, BEES, "honeycomb_tile_bridge_stair", MBABlocksRegistry.honeycomb_tile_bridge_stair.get().asItem());
		addMissingItem(event, BEES, "honeycomb_brick_bridge_pier", MBABlocksRegistry.honeycomb_brick_bridge_pier.get().asItem());
		addMissingItem(event, BEES, "honeycomb_tile_bridge_pier", MBABlocksRegistry.honeycomb_tile_bridge_pier.get().asItem());
		addMissingItem(event, ATMO, "red_arid_sandstone_bridge", MBABlocksRegistry.red_arid_sandstone_bridge.get().asItem());
		addMissingItem(event, ATMO, "arid_sandstone_bridge", MBABlocksRegistry.arid_sandstone_bridge.get().asItem());
		addMissingItem(event, ATMO, "red_arid_sandstone_bridge_stair", MBABlocksRegistry.red_arid_sandstone_bridge_stair.get().asItem());
		addMissingItem(event, ATMO, "arid_sandstone_bridge_pier", MBABlocksRegistry.arid_sandstone_bridge_pier.get().asItem());
		addMissingItem(event, ATMO, "red_arid_sandstone_bridge_pier", MBABlocksRegistry.red_arid_sandstone_bridge_pier.get().asItem());
		addMissingItem(event, ATMO, "arid_sandstone_bridge_stair", MBABlocksRegistry.arid_sandstone_bridge_stair.get().asItem());
		addMissingItem(event, MAPLE, "maple_log_bridge_middle", MBABlocksRegistry.maple_log_bridge_middle.get().asItem());
		addMissingItem(event, MAPLE, "rope_maple_bridge", MBABlocksRegistry.rope_maple_bridge.get().asItem());
		addMissingItem(event, MAPLE, "maple_bridge_pier", MBABlocksRegistry.maple_bridge_pier.get().asItem());
		addMissingItem(event, MAPLE, "maple_log_bridge_stair", MBABlocksRegistry.maple_log_bridge_stair.get().asItem());
		addMissingItem(event, MAPLE, "maple_rope_bridge_stair", MBABlocksRegistry.maple_rope_bridge_stair.get().asItem());
		addMissingItem(event, MAPLE, "maple_rail_bridge", MBABlocksRegistry.maple_rail_bridge.get().asItem());
		addMissingItem(event, MAPLE, "snail_shell_bricks_bridge", MBABlocksRegistry.snail_shell_bricks_bridge.get().asItem());
		addMissingItem(event, MAPLE, "snail_shell_bricks_bridge_pier", MBABlocksRegistry.snail_shell_bricks_bridge_pier.get().asItem());
		addMissingItem(event, MAPLE, "snail_shell_bricks_bridge_stair", MBABlocksRegistry.snail_shell_bricks_bridge_stair.get().asItem());
		addMissingItem(event, MAPLE, "snail_shell_tiles_bridge", MBABlocksRegistry.snail_shell_tiles_bridge.get().asItem());
		addMissingItem(event, MAPLE, "snail_shell_tiles_bridge_pier", MBABlocksRegistry.snail_shell_tiles_bridge_pier.get().asItem());
		addMissingItem(event, MAPLE, "snail_shell_tiles_bridge_stair", MBABlocksRegistry.snail_shell_tiles_bridge_stair.get().asItem());
		addMissingItem(event, ATMO, "aspen_log_bridge_middle", MBABlocksRegistry.aspen_log_bridge_middle.get().asItem());
		addMissingItem(event, ATMO, "grimwood_log_bridge_middle", MBABlocksRegistry.grimwood_log_bridge_middle.get().asItem());
		addMissingItem(event, ATMO, "kousa_log_bridge_middle", MBABlocksRegistry.kousa_log_bridge_middle.get().asItem());
		addMissingItem(event, ATMO, "morado_log_bridge_middle", MBABlocksRegistry.morado_log_bridge_middle.get().asItem());
		addMissingItem(event, ATMO, "rosewood_log_bridge_middle", MBABlocksRegistry.rosewood_log_bridge_middle.get().asItem());
		addMissingItem(event, ATMO, "yucca_log_bridge_middle", MBABlocksRegistry.yucca_log_bridge_middle.get().asItem());
		addMissingItem(event, ATMO, "rope_aspen_bridge", MBABlocksRegistry.rope_aspen_bridge.get().asItem());
		addMissingItem(event, ATMO, "rope_grimwood_bridge", MBABlocksRegistry.rope_grimwood_bridge.get().asItem());
		addMissingItem(event, ATMO, "rope_kousa_bridge", MBABlocksRegistry.rope_kousa_bridge.get().asItem());
		addMissingItem(event, ATMO, "rope_morado_bridge", MBABlocksRegistry.rope_morado_bridge.get().asItem());
		addMissingItem(event, ATMO, "rope_rosewood_bridge", MBABlocksRegistry.rope_rosewood_bridge.get().asItem());
		addMissingItem(event, ATMO, "rope_yucca_bridge", MBABlocksRegistry.rope_yucca_bridge.get().asItem());
		addMissingItem(event, ATMO, "aspen_bridge_pier", MBABlocksRegistry.aspen_bridge_pier.get().asItem());
		addMissingItem(event, ATMO, "grimwood_bridge_pier", MBABlocksRegistry.grimwood_bridge_pier.get().asItem());
		addMissingItem(event, ATMO, "kousa_bridge_pier", MBABlocksRegistry.kousa_bridge_pier.get().asItem());
		addMissingItem(event, ATMO, "morado_bridge_pier", MBABlocksRegistry.morado_bridge_pier.get().asItem());
		addMissingItem(event, ATMO, "rosewood_bridge_pier", MBABlocksRegistry.rosewood_bridge_pier.get().asItem());
		addMissingItem(event, ATMO, "yucca_bridge_pier", MBABlocksRegistry.yucca_bridge_pier.get().asItem());
		addMissingItem(event, ATMO, "aspen_log_bridge_stair", MBABlocksRegistry.aspen_log_bridge_stair.get().asItem());
		addMissingItem(event, ATMO, "grimwood_log_bridge_stair", MBABlocksRegistry.grimwood_log_bridge_stair.get().asItem());
		addMissingItem(event, ATMO, "kousa_log_bridge_stair", MBABlocksRegistry.kousa_log_bridge_stair.get().asItem());
		addMissingItem(event, ATMO, "morado_log_bridge_stair", MBABlocksRegistry.morado_log_bridge_stair.get().asItem());
		addMissingItem(event, ATMO, "rosewood_log_bridge_stair", MBABlocksRegistry.rosewood_log_bridge_stair.get().asItem());
		addMissingItem(event, ATMO, "yucca_log_bridge_stair", MBABlocksRegistry.yucca_log_bridge_stair.get().asItem());
		addMissingItem(event, ATMO, "aspen_rope_bridge_stair", MBABlocksRegistry.aspen_rope_bridge_stair.get().asItem());
		addMissingItem(event, ATMO, "grimwood_rope_bridge_stair", MBABlocksRegistry.grimwood_rope_bridge_stair.get().asItem());
		addMissingItem(event, ATMO, "kousa_rope_bridge_stair", MBABlocksRegistry.kousa_rope_bridge_stair.get().asItem());
		addMissingItem(event, ATMO, "morado_rope_bridge_stair", MBABlocksRegistry.morado_rope_bridge_stair.get().asItem());
		addMissingItem(event, ATMO, "rosewood_rope_bridge_stair", MBABlocksRegistry.rosewood_rope_bridge_stair.get().asItem());
		addMissingItem(event, ATMO, "yucca_rope_bridge_stair", MBABlocksRegistry.yucca_rope_bridge_stair.get().asItem());
		addMissingItem(event, ATMO, "aspen_rail_bridge", MBABlocksRegistry.aspen_rail_bridge.get().asItem());
		addMissingItem(event, ATMO, "grimwood_rail_bridge", MBABlocksRegistry.grimwood_rail_bridge.get().asItem());
		addMissingItem(event, ATMO, "kousa_rail_bridge", MBABlocksRegistry.kousa_rail_bridge.get().asItem());
		addMissingItem(event, ATMO, "morado_rail_bridge", MBABlocksRegistry.morado_rail_bridge.get().asItem());
		addMissingItem(event, ATMO, "rosewood_rail_bridge", MBABlocksRegistry.rosewood_rail_bridge.get().asItem());
		addMissingItem(event, ATMO, "yucca_rail_bridge", MBABlocksRegistry.yucca_rail_bridge.get().asItem());
	}
	
	private static void addMissingBlock(MissingMappingsEvent event, String modid, String nameMissing, Block b)
	{
		for(Mapping<Block> entry : event.getAllMappings(Registry.BLOCK_REGISTRY))
		{
			if(entry.getKey().toString().equals(modid + ":" + nameMissing))
			{
				entry.remap(b);
			}
		}
	}
	
	private static void addMissingItem(MissingMappingsEvent event, String modid, String nameMissing, Item i)
	{
		for(Mapping<Item> entry : event.getAllMappings(Registry.ITEM_REGISTRY))
		{
			if(entry.getKey().toString().equals(modid + ":" + nameMissing))
			{
				entry.remap(i);
			}
		}
	}
}