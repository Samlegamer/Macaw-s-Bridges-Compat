package fr.samlegamer.macawsbridgesbyg;

import fr.samlegamer.macawsbridgesbyg.block.MBBYGBlocksRegistry;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.RenderTypeLookup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
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
		RenderTypeLookup.setRenderLayer(MBBYGBlocksRegistry.bridgeWoodObjAll, RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBBYGBlocksRegistry.ropeWoodObjAll, RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBBYGBlocksRegistry.PierWoodObjAll, RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBBYGBlocksRegistry.StairWoodObjAll, RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBBYGBlocksRegistry.RailWoodObjAll, RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBBYGBlocksRegistry.RopeStairWoodObjAll, RenderType.cutout());
     	RenderTypeLookup.setRenderLayer(MBBYGBlocksRegistry.StoneBridges, RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBBYGBlocksRegistry.StoneBridgesPier, RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBBYGBlocksRegistry.StoneBridgesStairs, RenderType.cutout());
	}

	static class Tab extends ItemGroup
	{
		public Tab(String label) { super(label); }
				
		@Override
		public ItemStack makeIcon()
		{
			return new ItemStack(MBBYGBlocksRegistry.bridgeWoodObjAll);
		}
	}
}