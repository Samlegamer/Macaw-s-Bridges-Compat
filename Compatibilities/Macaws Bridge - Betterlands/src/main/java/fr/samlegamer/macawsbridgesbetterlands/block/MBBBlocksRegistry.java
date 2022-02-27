package fr.samlegamer.macawsbridgesbetterlands.block;

import java.util.ArrayList;

import com.google.common.base.Supplier;
import com.mcwbridges.kikoz.objects.Iron_Stair;
import com.mcwbridges.kikoz.objects.Log_Bridge;
import com.mcwbridges.kikoz.objects.Rail_Bridge;
import com.mcwbridges.kikoz.objects.Rope_Bridge;
import com.mcwbridges.kikoz.objects.Support_Pillar;

import fr.samlegamer.macawsbridgesbetterlands.MacawsBridgesBetterlands;
import fr.samlegamer.macawsbridgesbetterlands.item.MBBItemsRegistry;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class MBBBlocksRegistry
{
	public static final DeferredRegister<Block> BLOCKS_REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, MacawsBridgesBetterlands.MODID);
	
	public static final RegistryObject<Block> juniper_log_bridge_middle = createBlock("juniper_log_bridge_middle", () -> new Log_Bridge(AbstractBlock.Properties.of(Material.WOOD).strength(0.5F, 2.5F).sound(SoundType.WOOD)));
	public static final RegistryObject<Block> rope_juniper_bridge = createBlock("rope_juniper_bridge", () -> new Rope_Bridge(AbstractBlock.Properties.of(Material.WOOD).strength(0.5F, 2.5F).sound(SoundType.WOOD)));
	public static final RegistryObject<Block> juniper_bridge_pier = createBlock("juniper_bridge_pier", () -> new Support_Pillar(AbstractBlock.Properties.of(Material.WOOD).noOcclusion().strength(0.5F, 2.5F).sound(SoundType.WOOD)));
	public static final RegistryObject<Block> juniper_log_bridge_stair = createBlock("juniper_log_bridge_stair", () -> new Iron_Stair(AbstractBlock.Properties.of(Material.WOOD).strength(0.6F).sound(SoundType.WOOD)));
	public static final RegistryObject<Block> juniper_rope_bridge_stair = createBlock("juniper_rope_bridge_stair", () -> new Iron_Stair(AbstractBlock.Properties.of(Material.WOOD).strength(0.6F).sound(SoundType.WOOD)));
	public static final RegistryObject<Block> juniper_rail_bridge = createBlock("juniper_rail_bridge", () -> new Rail_Bridge(AbstractBlock.Properties.of(Material.WOOD).noOcclusion().strength(0.6F).sound(SoundType.WOOD)));
	
	public static RegistryObject<Block> BridgeStoneAll, PierStoneAll, StairStoneAll;
	
	public static void registry()
	{
		ArrayList<String> STONES = new ArrayList<>();

		STONES.add("black_terracotta");
		STONES.add("blue_terracotta");
		STONES.add("brown_terracotta");
		STONES.add("claystone");
		STONES.add("cyan_terracotta");
		STONES.add("gray_terracotta");
		STONES.add("green_terracotta");
		STONES.add("light_blue_terracotta");
		STONES.add("light_gray_terracotta");
		STONES.add("lime_terracotta");
		STONES.add("magenta_terracotta");
		STONES.add("orange_terracotta");
		STONES.add("red_terracotta");
		STONES.add("terracotta");
		STONES.add("white_terracotta");
		STONES.add("yellow_terracotta");

		for(String i : STONES)
		{
			BridgeStoneAll = createBlock(""+i+"_bricks_bridge", () -> new Log_Bridge(AbstractBlock.Properties.of(Material.STONE).harvestTool(ToolType.PICKAXE).strength(3.0F, 5.0F).sound(SoundType.STONE)));
			PierStoneAll = createBlock(""+i+"_bricks_bridge_pier", () -> new Support_Pillar(AbstractBlock.Properties.of(Material.STONE).harvestTool(ToolType.PICKAXE).strength(3.0F, 5.0F).sound(SoundType.STONE)));
			StairStoneAll = createBlock(""+i+"_bricks_bridge_stair", () -> new Iron_Stair(AbstractBlock.Properties.of(Material.STONE).harvestTool(ToolType.PICKAXE).strength(3.0F, 5.0F).sound(SoundType.STONE)));
		}
	}
	
	public static RegistryObject<Block> createBlock(String name, Supplier<? extends Block> supplier)
    {
        RegistryObject<Block> block = BLOCKS_REGISTRY.register(name, supplier);
        MBBItemsRegistry.ITEMS_REGISTRY.register(name, () -> new BlockItem(block.get(), new Item.Properties().tab(MacawsBridgesBetterlands.CMT)));
        return block;
    }
}