package fr.samlegamer.macawsbridgesbyg;

import java.util.ArrayList;
import java.util.List;

import fr.samlegamer.macawsbridgesbyg.block.MBBYGBlocksRegistry;
import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(value = MacawsBridgesBYG.MODID)
public class MacawsBridgesBYG
{
	public static final String MODID = "macawsbridgesbyg";
	public static final Tab CMT = new Tab("bridgesbyg_tab");
	
	public MacawsBridgesBYG()
	{
		FMLJavaModLoadingContext.get().getModEventBus().addListener(this::ClientSetup);
	}
	
	private void ClientSetup(final FMLClientSetupEvent event)
	{
		ItemBlockRenderTypes.setRenderLayer(MBBYGBlocksRegistry.aspen_rope_bridge_stair, RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MBBYGBlocksRegistry.rope_aspen_bridge, RenderType.cutout());

		List<String> MATERIAL = new ArrayList<>();
	    MATERIAL.add("baobab");
	    MATERIAL.add("blue_enchanted");
	    MATERIAL.add("cherry");
	    MATERIAL.add("cika");
	    MATERIAL.add("cypress");
	    MATERIAL.add("ebony");
	    MATERIAL.add("ether");
	    MATERIAL.add("fir");
	    MATERIAL.add("green_enchanted");
	    MATERIAL.add("holly");
	    MATERIAL.add("jacaranda");
	    MATERIAL.add("lament");
	    MATERIAL.add("mahogany");
	    MATERIAL.add("mangrove");
	    MATERIAL.add("maple");
	    MATERIAL.add("nightshade");
	    MATERIAL.add("palm");
	    MATERIAL.add("pine");
	    MATERIAL.add("rainbow_eucalyptus");
	    MATERIAL.add("redwood");
	    MATERIAL.add("skyris");
	    MATERIAL.add("willow");
	    MATERIAL.add("witch_hazel");
	    MATERIAL.add("zelkova");
	    MATERIAL.add("bulbis");
	    MATERIAL.add("imparius");
	    MATERIAL.add("sythian");

	    for (String i : MATERIAL)
	    {
	    	final Block Rope = Registry.BLOCK.get(new ResourceLocation(MODID, "rope_" + i + "_bridge"));
	    	final Block RopeStairs = Registry.BLOCK.get(new ResourceLocation(MODID, i + "_rope_bridge_stair"));
			ItemBlockRenderTypes.setRenderLayer(Rope, RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(RopeStairs, RenderType.cutout());
	    }
	}

	static class Tab extends CreativeModeTab
	{
		public Tab(String label) { super(label); }
		
		@Override
		public ItemStack makeIcon()
		{
			return new ItemStack(MBBYGBlocksRegistry.aspen_log_bridge_middle);
		}
	}
}