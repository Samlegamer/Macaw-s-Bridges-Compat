package fr.samlegamer.macawsbridgesplus.utils;

import fr.samlegamer.macawsbridgesplus.block.MBPBlocksRegistry;
import net.minecraft.world.item.HoneycombItem;
import net.minecraft.world.level.block.Block;

public class Vanilla
{
	public static void init()
	{
		waxAdd(MBPBlocksRegistry.copper_bridges.get(), MBPBlocksRegistry.waxed_copper_bridges.get());
		waxAdd(MBPBlocksRegistry.exposed_copper_bridges.get(), MBPBlocksRegistry.waxed_exposed_copper_bridges.get());
		waxAdd(MBPBlocksRegistry.weathered_copper_bridges.get(), MBPBlocksRegistry.waxed_weathered_copper_bridges.get());
		waxAdd(MBPBlocksRegistry.oxidized_copper_bridges.get(), MBPBlocksRegistry.waxed_oxidized_copper_bridges.get());

		waxAdd(MBPBlocksRegistry.cut_copper_bridges.get(), MBPBlocksRegistry.waxed_cut_copper_bridges.get());
		waxAdd(MBPBlocksRegistry.cut_exposed_copper_bridges.get(), MBPBlocksRegistry.waxed_cut_exposed_copper_bridges.get());
		waxAdd(MBPBlocksRegistry.cut_weathered_copper_bridges.get(), MBPBlocksRegistry.waxed_cut_weathered_copper_bridges.get());
		waxAdd(MBPBlocksRegistry.cut_oxidized_copper_bridges.get(), MBPBlocksRegistry.waxed_cut_oxidized_copper_bridges.get());
	}
	
	private static void waxAdd(Block b1, Block b2)
	{
		HoneycombItem.WAXABLES.get().forcePut(b1, b2);
	}
} 