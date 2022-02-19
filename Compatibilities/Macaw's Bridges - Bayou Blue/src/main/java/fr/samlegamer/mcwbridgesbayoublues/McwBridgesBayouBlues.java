package fr.samlegamer.mcwbridgesbayoublues;

import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.RenderTypeLookup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(value = McwBridgesBayouBlues.MODID)
@Mod.EventBusSubscriber(modid = McwBridgesBayouBlues.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class McwBridgesBayouBlues
{
	public static final String MODID = "mcwbridgesbayoublues";
	public static final Tab CMT = new Tab("mbbayoublues_tab");

	public McwBridgesBayouBlues()
	{
		FMLJavaModLoadingContext.get().getModEventBus().addListener(this::common);
		FMLJavaModLoadingContext.get().getModEventBus().addListener(this::client);
		
		IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
		MBBBItems.ITEMS_REGISTRY.register(bus);
		MBBBBlocks.BLOCKS_REGISTRY.register(bus);
	}
	
	private void client(FMLClientSetupEvent e)
	{
		RenderTypeLookup.setRenderLayer(MBBBBlocks.cypress_log_bridge_middle.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBBBBlocks.cypress_bridge_pier.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBBBBlocks.cypress_rail_bridge.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBBBBlocks.rope_cypress_bridge.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBBBBlocks.cypress_log_bridge_stair.get(), RenderType.cutout());
	}
	
	private void common(FMLCommonSetupEvent e){}
	
	static class Tab extends ItemGroup
	{
		public Tab(String label) { super(label); }
		
		@Override
		public ItemStack makeIcon() { return new ItemStack(MBBBBlocks.cypress_log_bridge_middle.get()); }
	}

}