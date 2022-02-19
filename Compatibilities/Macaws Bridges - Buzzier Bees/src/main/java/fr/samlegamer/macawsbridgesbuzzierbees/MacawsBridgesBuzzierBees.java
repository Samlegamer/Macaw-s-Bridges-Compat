package fr.samlegamer.macawsbridgesbuzzierbees;

import fr.samlegamer.macawsbridgesbuzzierbees.block.MBBBBlocksRegistry;
import fr.samlegamer.macawsbridgesbuzzierbees.item.MBBBItemsRegistry;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.RenderTypeLookup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(value = MacawsBridgesBuzzierBees.MODID)
@Mod.EventBusSubscriber(modid = MacawsBridgesBuzzierBees.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class MacawsBridgesBuzzierBees
{
	public static final String MODID = "macawsbridgesbuzzierbees";
	public static final Tab CMT = new Tab("mbbb_tab");
	
	public MacawsBridgesBuzzierBees()
	{
		FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
		FMLJavaModLoadingContext.get().getModEventBus().addListener(this::ClientSetup);
				
		IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
		MBBBItemsRegistry.ITEMS_REGISTRY.register(bus);
		MBBBBlocksRegistry.BLOCKS_REGISTRY.register(bus);
	}
	
	private void setup(FMLCommonSetupEvent event)
	{
		
	}
	
	private void ClientSetup(FMLClientSetupEvent event)
	{
		RenderTypeLookup.setRenderLayer(MBBBBlocksRegistry.HONEYCOMB_BRICK_BRIDGE_MIDDLE.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBBBBlocksRegistry.HONEYCOMB_TILE_BRIDGE_MIDDLE.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBBBBlocksRegistry.honeycomb_brick_bridge_stair.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBBBBlocksRegistry.honeycomb_tile_bridge_stair.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBBBBlocksRegistry.honeycomb_tile_bridge_pier.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBBBBlocksRegistry.honeycomb_brick_bridge_pier.get(), RenderType.cutout());
	}
	
	static class Tab extends ItemGroup
	{
		public Tab(String label) { super(label); }
		
		@Override
		public ItemStack makeIcon() { return new ItemStack(MBBBBlocksRegistry.HONEYCOMB_BRICK_BRIDGE_MIDDLE.get()); }
	}
}