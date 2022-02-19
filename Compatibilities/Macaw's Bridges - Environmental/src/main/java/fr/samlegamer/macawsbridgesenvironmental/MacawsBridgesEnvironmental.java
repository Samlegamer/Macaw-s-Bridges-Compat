package fr.samlegamer.macawsbridgesenvironmental;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import fr.samlegamer.macawsbridgesenvironmental.blocks.MBEBlocksRegistry;
import fr.samlegamer.macawsbridgesenvironmental.items.MBEItemsRegistry;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.RenderTypeLookup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(value = MacawsBridgesEnvironmental.MODID)
@Mod.EventBusSubscriber(modid = MacawsBridgesEnvironmental.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class MacawsBridgesEnvironmental
{
	public static final String MODID = "macawsbridgesenvironmental";
	private static final Logger LOGGER = LogManager.getLogger();
	public static final Tab CMT = new Tab("mbe_tab");

	public MacawsBridgesEnvironmental()
	{
		FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
		FMLJavaModLoadingContext.get().getModEventBus().addListener(this::ClientSetup);
				
		LOGGER.info("Macaw's Bridges - Environmental : Loading...");
		IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
		MBEItemsRegistry.ITEMS_REGISTRY.register(bus);
		MBEBlocksRegistry.BLOCKS_REGISTRY.register(bus);
		LOGGER.info("Macaw's Bridges - Environmental : Is Charged");
	}
	
	private void setup(FMLCommonSetupEvent event)
	{
		
	}
	
	private void ClientSetup(FMLClientSetupEvent event)
	{
		RenderTypeLookup.setRenderLayer(MBEBlocksRegistry.cherry_log_bridge_middle.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBEBlocksRegistry.wisteria_log_bridge_middle.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBEBlocksRegistry.willow_log_bridge_middle.get(), RenderType.cutout());

		RenderTypeLookup.setRenderLayer(MBEBlocksRegistry.cherry_bridge_pier.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBEBlocksRegistry.wisteria_bridge_pier.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBEBlocksRegistry.willow_bridge_pier.get(), RenderType.cutout());

		RenderTypeLookup.setRenderLayer(MBEBlocksRegistry.cherry_rail_bridge.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBEBlocksRegistry.wisteria_rail_bridge.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBEBlocksRegistry.willow_rail_bridge.get(), RenderType.cutout());

		RenderTypeLookup.setRenderLayer(MBEBlocksRegistry.rope_cherry_bridge.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBEBlocksRegistry.rope_wisteria_bridge.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBEBlocksRegistry.rope_willow_bridge.get(), RenderType.cutout());

		RenderTypeLookup.setRenderLayer(MBEBlocksRegistry.cherry_log_bridge_stair.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBEBlocksRegistry.wisteria_log_bridge_stair.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBEBlocksRegistry.willow_log_bridge_stair.get(), RenderType.cutout());
	}
	
	static class Tab extends ItemGroup
	{
		public Tab(String label) { super(label); }
		
		@Override
		public ItemStack makeIcon() { return new ItemStack(MBEBlocksRegistry.cherry_log_bridge_middle.get()); }
	}
}