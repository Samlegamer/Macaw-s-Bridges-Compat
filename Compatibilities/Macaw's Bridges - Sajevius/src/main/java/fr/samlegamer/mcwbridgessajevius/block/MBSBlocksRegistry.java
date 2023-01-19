package fr.samlegamer.mcwbridgessajevius.block;

import java.util.ArrayList;

import com.google.common.base.Supplier;
import com.mcwbridges.kikoz.objects.Iron_Stair;
import com.mcwbridges.kikoz.objects.Log_Bridge;
import com.mcwbridges.kikoz.objects.Rail_Bridge;
import com.mcwbridges.kikoz.objects.Rope_Bridge;
import com.mcwbridges.kikoz.objects.Support_Pillar;

import fr.samlegamer.mcwbridgessajevius.McwBridgesSajevius;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.fml.ModList;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class MBSBlocksRegistry
{
	public static final DeferredRegister<Block> BLOCK = DeferredRegister.create(ForgeRegistries.BLOCKS, McwBridgesSajevius.MODID);
	public static final DeferredRegister<Item> ITEM = DeferredRegister.create(ForgeRegistries.ITEMS, McwBridgesSajevius.MODID);

	// Shroomed
	public static final RegistryObject<Block> blue_hard_mushroom_log_bridge_middle = add("shroomed", "blue_hard_mushroom_log_bridge_middle", () -> new Log_Bridge(AbstractBlock.Properties.of(Material.WOOD).strength(0.5F, 2.5F).sound(SoundType.WOOD).harvestTool(ToolType.AXE)));
	public static final RegistryObject<Block> hard_mushroom_log_bridge_middle = add("shroomed", "hard_mushroom_log_bridge_middle", () -> new Log_Bridge(AbstractBlock.Properties.of(Material.WOOD).strength(0.5F, 2.5F).sound(SoundType.WOOD).harvestTool(ToolType.AXE)));
	public static final RegistryObject<Block> orange_hard_mushroom_log_bridge_middle = add("shroomed", "orange_hard_mushroom_log_bridge_middle", () -> new Log_Bridge(AbstractBlock.Properties.of(Material.WOOD).strength(0.5F, 2.5F).sound(SoundType.WOOD).harvestTool(ToolType.AXE)));
	public static final RegistryObject<Block> purple_hard_mushroom_log_bridge_middle = add("shroomed", "purple_hard_mushroom_log_bridge_middle", () -> new Log_Bridge(AbstractBlock.Properties.of(Material.WOOD).strength(0.5F, 2.5F).sound(SoundType.WOOD).harvestTool(ToolType.AXE)));	
	
	public static final RegistryObject<Block> rope_blue_hard_mushroom_bridge = add("shroomed", "rope_blue_hard_mushroom_bridge", () -> new Rope_Bridge(AbstractBlock.Properties.of(Material.WOOD).strength(0.5F, 2.5F).sound(SoundType.WOOD).harvestTool(ToolType.AXE)));
	public static final RegistryObject<Block> rope_hard_mushroom_bridge = add("shroomed", "rope_hard_mushroom_bridge", () -> new Rope_Bridge(AbstractBlock.Properties.of(Material.WOOD).strength(0.5F, 2.5F).sound(SoundType.WOOD).harvestTool(ToolType.AXE)));
	public static final RegistryObject<Block> rope_orange_hard_mushroom_bridge = add("shroomed", "rope_orange_hard_mushroom_bridge", () -> new Rope_Bridge(AbstractBlock.Properties.of(Material.WOOD).strength(0.5F, 2.5F).sound(SoundType.WOOD).harvestTool(ToolType.AXE)));
	public static final RegistryObject<Block> rope_purple_hard_mushroom_bridge = add("shroomed", "rope_purple_hard_mushroom_bridge", () -> new Rope_Bridge(AbstractBlock.Properties.of(Material.WOOD).strength(0.5F, 2.5F).sound(SoundType.WOOD).harvestTool(ToolType.AXE)));

	public static final RegistryObject<Block> blue_hard_mushroom_bridge_pier = add("shroomed", "blue_hard_mushroom_bridge_pier", () -> new Support_Pillar(AbstractBlock.Properties.of(Material.WOOD).strength(0.5F, 2.5F).sound(SoundType.WOOD).harvestTool(ToolType.AXE)));
	public static final RegistryObject<Block> hard_mushroom_bridge_pier = add("shroomed", "hard_mushroom_bridge_pier", () -> new Support_Pillar(AbstractBlock.Properties.of(Material.WOOD).strength(0.5F, 2.5F).sound(SoundType.WOOD).harvestTool(ToolType.AXE)));
	public static final RegistryObject<Block> orange_hard_mushroom_bridge_pier = add("shroomed", "orange_hard_mushroom_bridge_pier", () -> new Support_Pillar(AbstractBlock.Properties.of(Material.WOOD).strength(0.5F, 2.5F).sound(SoundType.WOOD).harvestTool(ToolType.AXE)));
	public static final RegistryObject<Block> purple_hard_mushroom_bridge_pier = add("shroomed", "purple_hard_mushroom_bridge_pier", () -> new Support_Pillar(AbstractBlock.Properties.of(Material.WOOD).strength(0.5F, 2.5F).sound(SoundType.WOOD).harvestTool(ToolType.AXE)));

	public static final RegistryObject<Block> blue_hard_mushroom_log_bridge_stair = add("shroomed", "blue_hard_mushroom_log_bridge_stair", () -> new Iron_Stair(AbstractBlock.Properties.of(Material.WOOD).strength(0.5F, 2.5F).sound(SoundType.WOOD).harvestTool(ToolType.AXE)));
	public static final RegistryObject<Block> hard_mushroom_log_bridge_stair = add("shroomed", "hard_mushroom_log_bridge_stair", () -> new Iron_Stair(AbstractBlock.Properties.of(Material.WOOD).strength(0.5F, 2.5F).sound(SoundType.WOOD).harvestTool(ToolType.AXE)));
	public static final RegistryObject<Block> orange_hard_mushroom_log_bridge_stair = add("shroomed", "orange_hard_mushroom_log_bridge_stair", () -> new Iron_Stair(AbstractBlock.Properties.of(Material.WOOD).strength(0.5F, 2.5F).sound(SoundType.WOOD).harvestTool(ToolType.AXE)));
	public static final RegistryObject<Block> purple_hard_mushroom_log_bridge_stair = add("shroomed", "purple_hard_mushroom_log_bridge_stair", () -> new Iron_Stair(AbstractBlock.Properties.of(Material.WOOD).strength(0.5F, 2.5F).sound(SoundType.WOOD).harvestTool(ToolType.AXE)));

	public static final RegistryObject<Block> blue_hard_mushroom_rope_bridge_stair = add("shroomed", "blue_hard_mushroom_rope_bridge_stair", () -> new Iron_Stair(AbstractBlock.Properties.of(Material.WOOD).strength(0.5F, 2.5F).sound(SoundType.WOOD).harvestTool(ToolType.AXE)));
	public static final RegistryObject<Block> hard_mushroom_rope_bridge_stair = add("shroomed", "hard_mushroom_rope_bridge_stair", () -> new Iron_Stair(AbstractBlock.Properties.of(Material.WOOD).strength(0.5F, 2.5F).sound(SoundType.WOOD).harvestTool(ToolType.AXE)));
	public static final RegistryObject<Block> orange_hard_mushroom_rope_bridge_stair = add("shroomed", "orange_hard_mushroom_rope_bridge_stair", () -> new Iron_Stair(AbstractBlock.Properties.of(Material.WOOD).strength(0.5F, 2.5F).sound(SoundType.WOOD).harvestTool(ToolType.AXE)));
	public static final RegistryObject<Block> purple_hard_mushroom_rope_bridge_stair = add("shroomed", "purple_hard_mushroom_rope_bridge_stair", () -> new Iron_Stair(AbstractBlock.Properties.of(Material.WOOD).strength(0.5F, 2.5F).sound(SoundType.WOOD).harvestTool(ToolType.AXE)));

	public static final RegistryObject<Block> blue_hard_mushroom_rail_bridge = add("shroomed", "blue_hard_mushroom_rail_bridge", () -> new Rail_Bridge(AbstractBlock.Properties.of(Material.WOOD).noOcclusion().strength(0.5F, 2.5F).sound(SoundType.WOOD).harvestTool(ToolType.AXE)));
	public static final RegistryObject<Block> hard_mushroom_rail_bridge = add("shroomed", "hard_mushroom_rail_bridge", () -> new Rail_Bridge(AbstractBlock.Properties.of(Material.WOOD).noOcclusion().strength(0.5F, 2.5F).sound(SoundType.WOOD).harvestTool(ToolType.AXE)));
	public static final RegistryObject<Block> orange_hard_mushroom_rail_bridge = add("shroomed", "orange_hard_mushroom_rail_bridge", () -> new Rail_Bridge(AbstractBlock.Properties.of(Material.WOOD).noOcclusion().strength(0.5F, 2.5F).sound(SoundType.WOOD).harvestTool(ToolType.AXE)));
	public static final RegistryObject<Block> purple_hard_mushroom_rail_bridge = add("shroomed", "purple_hard_mushroom_rail_bridge", () -> new Rail_Bridge(AbstractBlock.Properties.of(Material.WOOD).noOcclusion().strength(0.5F, 2.5F).sound(SoundType.WOOD).harvestTool(ToolType.AXE)));
	
	// Betterlands
	public static final RegistryObject<Block> juniper_log_bridge_middle = add("betterlands", "juniper_log_bridge_middle", () -> new Log_Bridge(AbstractBlock.Properties.of(Material.WOOD).strength(0.5F, 2.5F).sound(SoundType.WOOD).harvestTool(ToolType.AXE)));
	public static final RegistryObject<Block> rope_juniper_bridge = add("betterlands", "rope_juniper_bridge", () -> new Rope_Bridge(AbstractBlock.Properties.of(Material.WOOD).strength(0.5F, 2.5F).sound(SoundType.WOOD).harvestTool(ToolType.AXE)));
	public static final RegistryObject<Block> juniper_bridge_pier = add("betterlands", "juniper_bridge_pier", () -> new Support_Pillar(AbstractBlock.Properties.of(Material.WOOD).noOcclusion().strength(0.5F, 2.5F).sound(SoundType.WOOD).harvestTool(ToolType.AXE)));
	public static final RegistryObject<Block> juniper_log_bridge_stair = add("betterlands", "juniper_log_bridge_stair", () -> new Iron_Stair(AbstractBlock.Properties.of(Material.WOOD).strength(0.6F).sound(SoundType.WOOD).harvestTool(ToolType.AXE)));
	public static final RegistryObject<Block> juniper_rope_bridge_stair = add("betterlands", "juniper_rope_bridge_stair", () -> new Iron_Stair(AbstractBlock.Properties.of(Material.WOOD).strength(0.6F).sound(SoundType.WOOD).harvestTool(ToolType.AXE)));
	public static final RegistryObject<Block> juniper_rail_bridge = add("betterlands", "juniper_rail_bridge", () -> new Rail_Bridge(AbstractBlock.Properties.of(Material.WOOD).noOcclusion().strength(0.6F).sound(SoundType.WOOD).harvestTool(ToolType.AXE)));
	
	public static RegistryObject<Block> BridgeStoneAll, PierStoneAll, StairStoneAll;
	
	public static void registryBetterLandStones()
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
			BridgeStoneAll = add("betterlands", ""+i+"_bricks_bridge", () -> new Log_Bridge(AbstractBlock.Properties.of(Material.STONE).harvestTool(ToolType.PICKAXE).strength(3.0F, 5.0F).sound(SoundType.STONE)));
			PierStoneAll = add("betterlands", ""+i+"_bricks_bridge_pier", () -> new Support_Pillar(AbstractBlock.Properties.of(Material.STONE).harvestTool(ToolType.PICKAXE).strength(3.0F, 5.0F).sound(SoundType.STONE)));
			StairStoneAll = add("betterlands", ""+i+"_bricks_bridge_stair", () -> new Iron_Stair(AbstractBlock.Properties.of(Material.STONE).harvestTool(ToolType.PICKAXE).strength(3.0F, 5.0F).sound(SoundType.STONE)));
		}
	}
	
	public static RegistryObject<Block> add(String modid, String name, Supplier<? extends Block> supplier)
    {
        RegistryObject<Block> block = BLOCK.register(name, supplier);
        if(ModList.get().isLoaded(modid))
        {
            ITEM.register(name, () -> new BlockItem(block.get(), new Item.Properties().tab(McwBridgesSajevius.CMT)));
        }
        return block;
	}
}