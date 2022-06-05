package fr.samlegamer.macawsbridgesbyg;

import fr.samlegamer.macawsbridgesbyg.block.MBBYGBlocksRegistry;
import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(value = MacawsBridgesBYG.MODID)
@Mod.EventBusSubscriber(modid = MacawsBridgesBYG.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class MacawsBridgesBYG
{
	public static final String MODID = "macawsbridgesbyg";
	public static final Tab CMT = new Tab("bridgesbyg_tab");
	
	public MacawsBridgesBYG()
	{
		FMLJavaModLoadingContext.get().getModEventBus().addListener(this::ClientSetup);
		MinecraftForge.EVENT_BUS.register(MBBYGBlocksRegistry.class);	
	}
	
	private void ClientSetup(FMLClientSetupEvent event)
	{     	
     	ItemBlockRenderTypes.setRenderLayer(MBBYGBlocksRegistry.bridgeWoodObjAll, RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MBBYGBlocksRegistry.ropeWoodObjAll, RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MBBYGBlocksRegistry.PierWoodObjAll, RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MBBYGBlocksRegistry.StairWoodObjAll, RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MBBYGBlocksRegistry.RailWoodObjAll, RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MBBYGBlocksRegistry.RopeStairWoodObjAll, RenderType.cutout());
     	ItemBlockRenderTypes.setRenderLayer(MBBYGBlocksRegistry.StoneBridges, RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MBBYGBlocksRegistry.StoneBridgesPier, RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MBBYGBlocksRegistry.StoneBridgesStairs, RenderType.cutout());
	}
	
	static class Tab extends CreativeModeTab
	{
		public Tab(String label) { super(label); }
				
		@Override
		public ItemStack makeIcon()
		{
			return new ItemStack(MBBYGBlocksRegistry.bridgeWoodObjAll);
		}
	}
}