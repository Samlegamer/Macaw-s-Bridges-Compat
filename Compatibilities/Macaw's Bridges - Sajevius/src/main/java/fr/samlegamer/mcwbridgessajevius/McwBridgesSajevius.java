package fr.samlegamer.mcwbridgessajevius;

import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.RenderTypeLookup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import fr.samlegamer.mcwbridgessajevius.block.MBSBlocksRegistry;

@Mod(McwBridgesSajevius.MODID)
@Mod.EventBusSubscriber(modid = McwBridgesSajevius.MODID, bus = Bus.MOD)
public class McwBridgesSajevius
{
	public static final String MODID = "mcwbridgessajevius";
	public static final Tab CMT = new Tab("mbsajevius_tab");
	private static final Logger LOGGER = LogManager.getLogger();

    public McwBridgesSajevius()
    {
    	LOGGER.info("Macaw's Bridges - Sajevius - LOADING ...");
		FMLJavaModLoadingContext.get().getModEventBus().addListener(this::ClientSetup);
    	IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
    	MBSBlocksRegistry.BLOCK.register(bus);
    	MBSBlocksRegistry.registryBetterLandStones();
    	MBSBlocksRegistry.ITEM.register(bus);
    	MinecraftForge.EVENT_BUS.register(SajeviusFixCompat.class);
    	LOGGER.info("Macaw's Bridges - Sajevius - FINISH REGISTRIES");
    }
    
    private void ClientSetup(FMLClientSetupEvent event)
    {
    	RenderTypeLookup.setRenderLayer(MBSBlocksRegistry.juniper_log_bridge_middle.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBSBlocksRegistry.rope_juniper_bridge.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBSBlocksRegistry.juniper_bridge_pier.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBSBlocksRegistry.juniper_log_bridge_stair.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBSBlocksRegistry.juniper_rope_bridge_stair.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBSBlocksRegistry.juniper_rail_bridge.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBSBlocksRegistry.BridgeStoneAll.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBSBlocksRegistry.PierStoneAll.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBSBlocksRegistry.StairStoneAll.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBSBlocksRegistry.blue_hard_mushroom_log_bridge_middle.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBSBlocksRegistry.hard_mushroom_log_bridge_middle.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBSBlocksRegistry.orange_hard_mushroom_log_bridge_middle.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBSBlocksRegistry.purple_hard_mushroom_log_bridge_middle.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBSBlocksRegistry.blue_hard_mushroom_rail_bridge.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBSBlocksRegistry.hard_mushroom_rail_bridge.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBSBlocksRegistry.orange_hard_mushroom_rail_bridge.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBSBlocksRegistry.purple_hard_mushroom_rail_bridge.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBSBlocksRegistry.blue_hard_mushroom_log_bridge_stair.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBSBlocksRegistry.hard_mushroom_log_bridge_stair.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBSBlocksRegistry.orange_hard_mushroom_log_bridge_stair.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBSBlocksRegistry.purple_hard_mushroom_log_bridge_stair.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBSBlocksRegistry.blue_hard_mushroom_rope_bridge_stair.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBSBlocksRegistry.hard_mushroom_rope_bridge_stair.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBSBlocksRegistry.orange_hard_mushroom_rope_bridge_stair.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBSBlocksRegistry.purple_hard_mushroom_rope_bridge_stair.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBSBlocksRegistry.blue_hard_mushroom_bridge_pier.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBSBlocksRegistry.hard_mushroom_bridge_pier.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBSBlocksRegistry.orange_hard_mushroom_bridge_pier.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBSBlocksRegistry.purple_hard_mushroom_bridge_pier.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBSBlocksRegistry.rope_blue_hard_mushroom_bridge.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBSBlocksRegistry.rope_hard_mushroom_bridge.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBSBlocksRegistry.rope_orange_hard_mushroom_bridge.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(MBSBlocksRegistry.rope_purple_hard_mushroom_bridge.get(), RenderType.cutout());
    }
    
    static class Tab extends ItemGroup
	{
		public Tab(String label) { super(label); }
		
		@Override
		public ItemStack makeIcon() { return new ItemStack(MBSBlocksRegistry.juniper_log_bridge_middle.get()); }
	}
}