package fr.samlegamer.macawsbridgesbyg;

import fr.samlegamer.macawsbridgesbyg.block.MBBYGBlocksRegistry;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(value = MacawsBridgesBYG.MODID)
public class MacawsBridgesBYG
{
	public static final String MODID = "macawsbridgesbyg"; 
	public static final Tab CMT = new Tab("bridgesbyg_tab");
	
	public MacawsBridgesBYG()
	{
		IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
		MBBYGBlocksRegistry.ITEMS_REGISTRY.register(bus);
		MBBYGBlocksRegistry.BLOCKS_REGISTRY.register(bus);
	}
	
	private static class Tab extends CreativeModeTab
	{
		public Tab(String label) { super(label); }
				
		@Override
		public ItemStack makeIcon()
		{
			return new ItemStack(MBBYGBlocksRegistry.aspen_log_bridge_middle.get());
		}
	}
}