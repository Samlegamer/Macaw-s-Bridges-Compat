package fr.samlegamer.macawsbridgesbetterlands;

import com.sajevius.betterlands.BetterlandsMod;
import com.mcwbridges.kikoz.MacawsBridges;
import fr.samlegamer.macawsbridgesbetterlands.block.MBBBlocksRegistry;
import fr.samlegamer.macawsbridgesbetterlands.item.MBBItemsRegistry;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.RenderTypeLookup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(value = MacawsBridgesBetterlands.MODID)
@Mod.EventBusSubscriber(modid = MacawsBridgesBetterlands.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class MacawsBridgesBetterlands
{
	public static final String MODID = "macawsbridgesbetterlands";
	public static final Tab CMT = new Tab("mbbetterlands_tab");

	public MacawsBridgesBetterlands()
	{
		FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
		FMLJavaModLoadingContext.get().getModEventBus().addListener(this::ClientSetup);
				
		IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
		MBBItemsRegistry.ITEMS_REGISTRY.register(bus);
		MBBBlocksRegistry.BLOCKS_REGISTRY.register(bus);
		MBBBlocksRegistry.registry();
	}
	
	private void setup(FMLCommonSetupEvent event){}
	
	private void ClientSetup(FMLClientSetupEvent event)
	{
		RenderTypeLookup.setRenderLayer(MBBBlocksRegistry.juniper_log_bridge_middle.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBBBlocksRegistry.rope_juniper_bridge.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBBBlocksRegistry.juniper_bridge_pier.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBBBlocksRegistry.juniper_log_bridge_stair.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBBBlocksRegistry.juniper_rope_bridge_stair.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBBBlocksRegistry.juniper_rail_bridge.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBBBlocksRegistry.BridgeStoneAll.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBBBlocksRegistry.PierStoneAll.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBBBlocksRegistry.StairStoneAll.get(), RenderType.cutout());
	}
	
	static class Tab extends ItemGroup
	{
		public Tab(String label) { super(label); }
		
		@Override
		public ItemStack makeIcon() { return new ItemStack(MBBBlocksRegistry.juniper_log_bridge_middle.get()); }
	}

	private void depedency(BetterlandsMod better, MacawsBridges mcwb) {}
}