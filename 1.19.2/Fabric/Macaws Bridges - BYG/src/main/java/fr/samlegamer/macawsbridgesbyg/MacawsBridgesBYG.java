package fr.samlegamer.macawsbridgesbyg;

import fr.samlegamer.macawsbridgesbyg.block.MBBYGBlocksRegistry;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class MacawsBridgesBYG implements ModInitializer
{
	public static final ItemGroup TAB = FabricItemGroupBuilder.build(new Identifier("macawsbridgesbyg", "macawsbridgesbyg_tab"), () -> new ItemStack(MBBYGBlocksRegistry.aspen_log_bridge_middle));
	
	@Override
	public void onInitialize()
	{
		MBBYGBlocksRegistry.registry();
	}
}