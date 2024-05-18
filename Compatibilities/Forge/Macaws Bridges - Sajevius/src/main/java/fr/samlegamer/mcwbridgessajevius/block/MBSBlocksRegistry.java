package fr.samlegamer.mcwbridgessajevius.block;

import com.google.common.base.Supplier;
import com.mcwbridges.kikoz.objects.Bridge_Stairs;
import com.mcwbridges.kikoz.objects.Log_Bridge;
import com.mcwbridges.kikoz.objects.Rail_Bridge;
import com.mcwbridges.kikoz.objects.Bridge_Block_Rope;
import com.mcwbridges.kikoz.objects.Bridge_Support;

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
	
	public static final RegistryObject<Block> rope_blue_hard_mushroom_bridge = add("shroomed", "rope_blue_hard_mushroom_bridge", () -> new Bridge_Block_Rope(AbstractBlock.Properties.of(Material.WOOD).strength(0.5F, 2.5F).sound(SoundType.WOOD).harvestTool(ToolType.AXE)));
	public static final RegistryObject<Block> rope_hard_mushroom_bridge = add("shroomed", "rope_hard_mushroom_bridge", () -> new Bridge_Block_Rope(AbstractBlock.Properties.of(Material.WOOD).strength(0.5F, 2.5F).sound(SoundType.WOOD).harvestTool(ToolType.AXE)));
	public static final RegistryObject<Block> rope_orange_hard_mushroom_bridge = add("shroomed", "rope_orange_hard_mushroom_bridge", () -> new Bridge_Block_Rope(AbstractBlock.Properties.of(Material.WOOD).strength(0.5F, 2.5F).sound(SoundType.WOOD).harvestTool(ToolType.AXE)));
	public static final RegistryObject<Block> rope_purple_hard_mushroom_bridge = add("shroomed", "rope_purple_hard_mushroom_bridge", () -> new Bridge_Block_Rope(AbstractBlock.Properties.of(Material.WOOD).strength(0.5F, 2.5F).sound(SoundType.WOOD).harvestTool(ToolType.AXE)));

	public static final RegistryObject<Block> blue_hard_mushroom_bridge_pier = add("shroomed", "blue_hard_mushroom_bridge_pier", () -> new Bridge_Support(AbstractBlock.Properties.of(Material.WOOD).strength(0.5F, 2.5F).sound(SoundType.WOOD).harvestTool(ToolType.AXE)));
	public static final RegistryObject<Block> hard_mushroom_bridge_pier = add("shroomed", "hard_mushroom_bridge_pier", () -> new Bridge_Support(AbstractBlock.Properties.of(Material.WOOD).strength(0.5F, 2.5F).sound(SoundType.WOOD).harvestTool(ToolType.AXE)));
	public static final RegistryObject<Block> orange_hard_mushroom_bridge_pier = add("shroomed", "orange_hard_mushroom_bridge_pier", () -> new Bridge_Support(AbstractBlock.Properties.of(Material.WOOD).strength(0.5F, 2.5F).sound(SoundType.WOOD).harvestTool(ToolType.AXE)));
	public static final RegistryObject<Block> purple_hard_mushroom_bridge_pier = add("shroomed", "purple_hard_mushroom_bridge_pier", () -> new Bridge_Support(AbstractBlock.Properties.of(Material.WOOD).strength(0.5F, 2.5F).sound(SoundType.WOOD).harvestTool(ToolType.AXE)));

	public static final RegistryObject<Block> blue_hard_mushroom_log_bridge_stair = add("shroomed", "blue_hard_mushroom_log_bridge_stair", () -> new Bridge_Stairs(AbstractBlock.Properties.of(Material.WOOD).strength(0.5F, 2.5F).sound(SoundType.WOOD).harvestTool(ToolType.AXE)));
	public static final RegistryObject<Block> hard_mushroom_log_bridge_stair = add("shroomed", "hard_mushroom_log_bridge_stair", () -> new Bridge_Stairs(AbstractBlock.Properties.of(Material.WOOD).strength(0.5F, 2.5F).sound(SoundType.WOOD).harvestTool(ToolType.AXE)));
	public static final RegistryObject<Block> orange_hard_mushroom_log_bridge_stair = add("shroomed", "orange_hard_mushroom_log_bridge_stair", () -> new Bridge_Stairs(AbstractBlock.Properties.of(Material.WOOD).strength(0.5F, 2.5F).sound(SoundType.WOOD).harvestTool(ToolType.AXE)));
	public static final RegistryObject<Block> purple_hard_mushroom_log_bridge_stair = add("shroomed", "purple_hard_mushroom_log_bridge_stair", () -> new Bridge_Stairs(AbstractBlock.Properties.of(Material.WOOD).strength(0.5F, 2.5F).sound(SoundType.WOOD).harvestTool(ToolType.AXE)));

	public static final RegistryObject<Block> blue_hard_mushroom_rope_bridge_stair = add("shroomed", "blue_hard_mushroom_rope_bridge_stair", () -> new Bridge_Stairs(AbstractBlock.Properties.of(Material.WOOD).strength(0.5F, 2.5F).sound(SoundType.WOOD).harvestTool(ToolType.AXE)));
	public static final RegistryObject<Block> hard_mushroom_rope_bridge_stair = add("shroomed", "hard_mushroom_rope_bridge_stair", () -> new Bridge_Stairs(AbstractBlock.Properties.of(Material.WOOD).strength(0.5F, 2.5F).sound(SoundType.WOOD).harvestTool(ToolType.AXE)));
	public static final RegistryObject<Block> orange_hard_mushroom_rope_bridge_stair = add("shroomed", "orange_hard_mushroom_rope_bridge_stair", () -> new Bridge_Stairs(AbstractBlock.Properties.of(Material.WOOD).strength(0.5F, 2.5F).sound(SoundType.WOOD).harvestTool(ToolType.AXE)));
	public static final RegistryObject<Block> purple_hard_mushroom_rope_bridge_stair = add("shroomed", "purple_hard_mushroom_rope_bridge_stair", () -> new Bridge_Stairs(AbstractBlock.Properties.of(Material.WOOD).strength(0.5F, 2.5F).sound(SoundType.WOOD).harvestTool(ToolType.AXE)));

	public static final RegistryObject<Block> blue_hard_mushroom_rail_bridge = add("shroomed", "blue_hard_mushroom_rail_bridge", () -> new Rail_Bridge(AbstractBlock.Properties.of(Material.WOOD).noOcclusion().strength(0.5F, 2.5F).sound(SoundType.WOOD).harvestTool(ToolType.AXE)));
	public static final RegistryObject<Block> hard_mushroom_rail_bridge = add("shroomed", "hard_mushroom_rail_bridge", () -> new Rail_Bridge(AbstractBlock.Properties.of(Material.WOOD).noOcclusion().strength(0.5F, 2.5F).sound(SoundType.WOOD).harvestTool(ToolType.AXE)));
	public static final RegistryObject<Block> orange_hard_mushroom_rail_bridge = add("shroomed", "orange_hard_mushroom_rail_bridge", () -> new Rail_Bridge(AbstractBlock.Properties.of(Material.WOOD).noOcclusion().strength(0.5F, 2.5F).sound(SoundType.WOOD).harvestTool(ToolType.AXE)));
	public static final RegistryObject<Block> purple_hard_mushroom_rail_bridge = add("shroomed", "purple_hard_mushroom_rail_bridge", () -> new Rail_Bridge(AbstractBlock.Properties.of(Material.WOOD).noOcclusion().strength(0.5F, 2.5F).sound(SoundType.WOOD).harvestTool(ToolType.AXE)));
	
	// Betterlands
	public static final RegistryObject<Block> juniper_log_bridge_middle = add("betterlands", "juniper_log_bridge_middle", () -> new Log_Bridge(AbstractBlock.Properties.of(Material.WOOD).strength(0.5F, 2.5F).sound(SoundType.WOOD).harvestTool(ToolType.AXE)));
	public static final RegistryObject<Block> rope_juniper_bridge = add("betterlands", "rope_juniper_bridge", () -> new Bridge_Block_Rope(AbstractBlock.Properties.of(Material.WOOD).strength(0.5F, 2.5F).sound(SoundType.WOOD).harvestTool(ToolType.AXE)));
	public static final RegistryObject<Block> juniper_bridge_pier = add("betterlands", "juniper_bridge_pier", () -> new Bridge_Support(AbstractBlock.Properties.of(Material.WOOD).noOcclusion().strength(0.5F, 2.5F).sound(SoundType.WOOD).harvestTool(ToolType.AXE)));
	public static final RegistryObject<Block> juniper_log_bridge_stair = add("betterlands", "juniper_log_bridge_stair", () -> new Bridge_Stairs(AbstractBlock.Properties.of(Material.WOOD).strength(0.6F).sound(SoundType.WOOD).harvestTool(ToolType.AXE)));
	public static final RegistryObject<Block> juniper_rope_bridge_stair = add("betterlands", "juniper_rope_bridge_stair", () -> new Bridge_Stairs(AbstractBlock.Properties.of(Material.WOOD).strength(0.6F).sound(SoundType.WOOD).harvestTool(ToolType.AXE)));
	public static final RegistryObject<Block> juniper_rail_bridge = add("betterlands", "juniper_rail_bridge", () -> new Rail_Bridge(AbstractBlock.Properties.of(Material.WOOD).noOcclusion().strength(0.6F).sound(SoundType.WOOD).harvestTool(ToolType.AXE)));
	
	public static final RegistryObject<Block> black_terracotta_bricks_bridge = add("betterlands", "black_terracotta_bricks_bridge", () -> new Log_Bridge(AbstractBlock.Properties.of(Material.STONE).harvestTool(ToolType.PICKAXE).strength(3.0F, 5.0F).sound(SoundType.STONE)));
	public static final RegistryObject<Block> blue_terracotta_bricks_bridge = add("betterlands", "blue_terracotta_bricks_bridge", () -> new Log_Bridge(AbstractBlock.Properties.of(Material.STONE).harvestTool(ToolType.PICKAXE).strength(3.0F, 5.0F).sound(SoundType.STONE)));
	public static final RegistryObject<Block> brown_terracotta_bricks_bridge = add("betterlands", "brown_terracotta_bricks_bridge", () -> new Log_Bridge(AbstractBlock.Properties.of(Material.STONE).harvestTool(ToolType.PICKAXE).strength(3.0F, 5.0F).sound(SoundType.STONE)));
	public static final RegistryObject<Block> claystone_bricks_bridge = add("betterlands", "claystone_bricks_bridge", () -> new Log_Bridge(AbstractBlock.Properties.of(Material.STONE).harvestTool(ToolType.PICKAXE).strength(3.0F, 5.0F).sound(SoundType.STONE)));
	public static final RegistryObject<Block> cyan_terracotta_bricks_bridge = add("betterlands", "cyan_terracotta_bricks_bridge", () -> new Log_Bridge(AbstractBlock.Properties.of(Material.STONE).harvestTool(ToolType.PICKAXE).strength(3.0F, 5.0F).sound(SoundType.STONE)));
	public static final RegistryObject<Block> gray_terracotta_bricks_bridge = add("betterlands", "gray_terracotta_bricks_bridge", () -> new Log_Bridge(AbstractBlock.Properties.of(Material.STONE).harvestTool(ToolType.PICKAXE).strength(3.0F, 5.0F).sound(SoundType.STONE)));
	public static final RegistryObject<Block> green_terracotta_bricks_bridge = add("betterlands", "green_terracotta_bricks_bridge", () -> new Log_Bridge(AbstractBlock.Properties.of(Material.STONE).harvestTool(ToolType.PICKAXE).strength(3.0F, 5.0F).sound(SoundType.STONE)));
	public static final RegistryObject<Block> light_blue_terracotta_bricks_bridge = add("betterlands", "light_blue_terracotta_bricks_bridge", () -> new Log_Bridge(AbstractBlock.Properties.of(Material.STONE).harvestTool(ToolType.PICKAXE).strength(3.0F, 5.0F).sound(SoundType.STONE)));
	public static final RegistryObject<Block> light_gray_terracotta_bricks_bridge = add("betterlands", "light_gray_terracotta_bricks_bridge", () -> new Log_Bridge(AbstractBlock.Properties.of(Material.STONE).harvestTool(ToolType.PICKAXE).strength(3.0F, 5.0F).sound(SoundType.STONE)));
	public static final RegistryObject<Block> lime_terracotta_bricks_bridge = add("betterlands", "lime_terracotta_bricks_bridge", () -> new Log_Bridge(AbstractBlock.Properties.of(Material.STONE).harvestTool(ToolType.PICKAXE).strength(3.0F, 5.0F).sound(SoundType.STONE)));
	public static final RegistryObject<Block> magenta_terracotta_bricks_bridge = add("betterlands", "magenta_terracotta_bricks_bridge", () -> new Log_Bridge(AbstractBlock.Properties.of(Material.STONE).harvestTool(ToolType.PICKAXE).strength(3.0F, 5.0F).sound(SoundType.STONE)));
	public static final RegistryObject<Block> orange_terracotta_bricks_bridge = add("betterlands", "orange_terracotta_bricks_bridge", () -> new Log_Bridge(AbstractBlock.Properties.of(Material.STONE).harvestTool(ToolType.PICKAXE).strength(3.0F, 5.0F).sound(SoundType.STONE)));
	public static final RegistryObject<Block> red_terracotta_bricks_bridge = add("betterlands", "red_terracotta_bricks_bridge", () -> new Log_Bridge(AbstractBlock.Properties.of(Material.STONE).harvestTool(ToolType.PICKAXE).strength(3.0F, 5.0F).sound(SoundType.STONE)));
	public static final RegistryObject<Block> terracotta_bricks_bridge = add("betterlands", "terracotta_bricks_bridge", () -> new Log_Bridge(AbstractBlock.Properties.of(Material.STONE).harvestTool(ToolType.PICKAXE).strength(3.0F, 5.0F).sound(SoundType.STONE)));
	public static final RegistryObject<Block> white_terracotta_bricks_bridge = add("betterlands", "white_terracotta_bricks_bridge", () -> new Log_Bridge(AbstractBlock.Properties.of(Material.STONE).harvestTool(ToolType.PICKAXE).strength(3.0F, 5.0F).sound(SoundType.STONE)));
	public static final RegistryObject<Block> yellow_terracotta_bricks_bridge = add("betterlands", "yellow_terracotta_bricks_bridge", () -> new Log_Bridge(AbstractBlock.Properties.of(Material.STONE).harvestTool(ToolType.PICKAXE).strength(3.0F, 5.0F).sound(SoundType.STONE)));

	public static final RegistryObject<Block> black_terracotta_bricks_bridge_pier = add("betterlands", "black_terracotta_bricks_bridge_pier", () -> new Bridge_Support(AbstractBlock.Properties.of(Material.STONE).harvestTool(ToolType.PICKAXE).strength(3.0F, 5.0F).sound(SoundType.STONE)));
	public static final RegistryObject<Block> blue_terracotta_bricks_bridge_pier = add("betterlands", "blue_terracotta_bricks_bridge_pier", () -> new Bridge_Support(AbstractBlock.Properties.of(Material.STONE).harvestTool(ToolType.PICKAXE).strength(3.0F, 5.0F).sound(SoundType.STONE)));
	public static final RegistryObject<Block> brown_terracotta_bricks_bridge_pier = add("betterlands", "brown_terracotta_bricks_bridge_pier", () -> new Bridge_Support(AbstractBlock.Properties.of(Material.STONE).harvestTool(ToolType.PICKAXE).strength(3.0F, 5.0F).sound(SoundType.STONE)));
	public static final RegistryObject<Block> claystone_bricks_bridge_pier = add("betterlands", "claystone_bricks_bridge_pier", () -> new Bridge_Support(AbstractBlock.Properties.of(Material.STONE).harvestTool(ToolType.PICKAXE).strength(3.0F, 5.0F).sound(SoundType.STONE)));
	public static final RegistryObject<Block> cyan_terracotta_bricks_bridge_pier = add("betterlands", "cyan_terracotta_bricks_bridge_pier", () -> new Bridge_Support(AbstractBlock.Properties.of(Material.STONE).harvestTool(ToolType.PICKAXE).strength(3.0F, 5.0F).sound(SoundType.STONE)));
	public static final RegistryObject<Block> gray_terracotta_bricks_bridge_pier = add("betterlands", "gray_terracotta_bricks_bridge_pier", () -> new Bridge_Support(AbstractBlock.Properties.of(Material.STONE).harvestTool(ToolType.PICKAXE).strength(3.0F, 5.0F).sound(SoundType.STONE)));
	public static final RegistryObject<Block> green_terracotta_bricks_bridge_pier = add("betterlands", "green_terracotta_bricks_bridge_pier", () -> new Bridge_Support(AbstractBlock.Properties.of(Material.STONE).harvestTool(ToolType.PICKAXE).strength(3.0F, 5.0F).sound(SoundType.STONE)));
	public static final RegistryObject<Block> light_blue_terracotta_bricks_bridge_pier = add("betterlands", "light_blue_terracotta_bricks_bridge_pier", () -> new Bridge_Support(AbstractBlock.Properties.of(Material.STONE).harvestTool(ToolType.PICKAXE).strength(3.0F, 5.0F).sound(SoundType.STONE)));
	public static final RegistryObject<Block> light_gray_terracotta_bricks_bridge_pier = add("betterlands", "light_gray_terracotta_bricks_bridge_pier", () -> new Bridge_Support(AbstractBlock.Properties.of(Material.STONE).harvestTool(ToolType.PICKAXE).strength(3.0F, 5.0F).sound(SoundType.STONE)));
	public static final RegistryObject<Block> lime_terracotta_bricks_bridge_pier = add("betterlands", "lime_terracotta_bricks_bridge_pier", () -> new Bridge_Support(AbstractBlock.Properties.of(Material.STONE).harvestTool(ToolType.PICKAXE).strength(3.0F, 5.0F).sound(SoundType.STONE)));
	public static final RegistryObject<Block> magenta_terracotta_bricks_bridge_pier = add("betterlands", "magenta_terracotta_bricks_bridge_pier", () -> new Bridge_Support(AbstractBlock.Properties.of(Material.STONE).harvestTool(ToolType.PICKAXE).strength(3.0F, 5.0F).sound(SoundType.STONE)));
	public static final RegistryObject<Block> orange_terracotta_bricks_bridge_pier = add("betterlands", "orange_terracotta_bricks_bridge_pier", () -> new Bridge_Support(AbstractBlock.Properties.of(Material.STONE).harvestTool(ToolType.PICKAXE).strength(3.0F, 5.0F).sound(SoundType.STONE)));
	public static final RegistryObject<Block> red_terracotta_bricks_bridge_pier = add("betterlands", "red_terracotta_bricks_bridge_pier", () -> new Bridge_Support(AbstractBlock.Properties.of(Material.STONE).harvestTool(ToolType.PICKAXE).strength(3.0F, 5.0F).sound(SoundType.STONE)));
	public static final RegistryObject<Block> terracotta_bricks_bridge_pier = add("betterlands", "terracotta_bricks_bridge_pier", () -> new Bridge_Support(AbstractBlock.Properties.of(Material.STONE).harvestTool(ToolType.PICKAXE).strength(3.0F, 5.0F).sound(SoundType.STONE)));
	public static final RegistryObject<Block> white_terracotta_bricks_bridge_pier = add("betterlands", "white_terracotta_bricks_bridge_pier", () -> new Bridge_Support(AbstractBlock.Properties.of(Material.STONE).harvestTool(ToolType.PICKAXE).strength(3.0F, 5.0F).sound(SoundType.STONE)));
	public static final RegistryObject<Block> yellow_terracotta_bricks_bridge_pier = add("betterlands", "yellow_terracotta_bricks_bridge_pier", () -> new Bridge_Support(AbstractBlock.Properties.of(Material.STONE).harvestTool(ToolType.PICKAXE).strength(3.0F, 5.0F).sound(SoundType.STONE)));
	
	public static final RegistryObject<Block> black_terracotta_bricks_bridge_stair = add("betterlands", "black_terracotta_bricks_bridge_stair", () -> new Bridge_Stairs(AbstractBlock.Properties.of(Material.STONE).harvestTool(ToolType.PICKAXE).strength(3.0F, 5.0F).sound(SoundType.STONE)));
	public static final RegistryObject<Block> blue_terracotta_bricks_bridge_stair = add("betterlands", "blue_terracotta_bricks_bridge_stair", () -> new Bridge_Stairs(AbstractBlock.Properties.of(Material.STONE).harvestTool(ToolType.PICKAXE).strength(3.0F, 5.0F).sound(SoundType.STONE)));
	public static final RegistryObject<Block> brown_terracotta_bricks_bridge_stair = add("betterlands", "brown_terracotta_bricks_bridge_stair", () -> new Bridge_Stairs(AbstractBlock.Properties.of(Material.STONE).harvestTool(ToolType.PICKAXE).strength(3.0F, 5.0F).sound(SoundType.STONE)));
	public static final RegistryObject<Block> claystone_bricks_bridge_stair = add("betterlands", "claystone_bricks_bridge_stair", () -> new Bridge_Stairs(AbstractBlock.Properties.of(Material.STONE).harvestTool(ToolType.PICKAXE).strength(3.0F, 5.0F).sound(SoundType.STONE)));
	public static final RegistryObject<Block> cyan_terracotta_bricks_bridge_stair = add("betterlands", "cyan_terracotta_bricks_bridge_stair", () -> new Bridge_Stairs(AbstractBlock.Properties.of(Material.STONE).harvestTool(ToolType.PICKAXE).strength(3.0F, 5.0F).sound(SoundType.STONE)));
	public static final RegistryObject<Block> gray_terracotta_bricks_bridge_stair = add("betterlands", "gray_terracotta_bricks_bridge_stair", () -> new Bridge_Stairs(AbstractBlock.Properties.of(Material.STONE).harvestTool(ToolType.PICKAXE).strength(3.0F, 5.0F).sound(SoundType.STONE)));
	public static final RegistryObject<Block> green_terracotta_bricks_bridge_stair = add("betterlands", "green_terracotta_bricks_bridge_stair", () -> new Bridge_Stairs(AbstractBlock.Properties.of(Material.STONE).harvestTool(ToolType.PICKAXE).strength(3.0F, 5.0F).sound(SoundType.STONE)));
	public static final RegistryObject<Block> light_blue_terracotta_bricks_bridge_stair = add("betterlands", "light_blue_terracotta_bricks_bridge_stair", () -> new Bridge_Stairs(AbstractBlock.Properties.of(Material.STONE).harvestTool(ToolType.PICKAXE).strength(3.0F, 5.0F).sound(SoundType.STONE)));
	public static final RegistryObject<Block> light_gray_terracotta_bricks_bridge_stair = add("betterlands", "light_gray_terracotta_bricks_bridge_stair", () -> new Bridge_Stairs(AbstractBlock.Properties.of(Material.STONE).harvestTool(ToolType.PICKAXE).strength(3.0F, 5.0F).sound(SoundType.STONE)));
	public static final RegistryObject<Block> lime_terracotta_bricks_bridge_stair = add("betterlands", "lime_terracotta_bricks_bridge_stair", () -> new Bridge_Stairs(AbstractBlock.Properties.of(Material.STONE).harvestTool(ToolType.PICKAXE).strength(3.0F, 5.0F).sound(SoundType.STONE)));
	public static final RegistryObject<Block> magenta_terracotta_bricks_bridge_stair = add("betterlands", "magenta_terracotta_bricks_bridge_stair", () -> new Bridge_Stairs(AbstractBlock.Properties.of(Material.STONE).harvestTool(ToolType.PICKAXE).strength(3.0F, 5.0F).sound(SoundType.STONE)));
	public static final RegistryObject<Block> orange_terracotta_bricks_bridge_stair = add("betterlands", "orange_terracotta_bricks_bridge_stair", () -> new Bridge_Stairs(AbstractBlock.Properties.of(Material.STONE).harvestTool(ToolType.PICKAXE).strength(3.0F, 5.0F).sound(SoundType.STONE)));
	public static final RegistryObject<Block> red_terracotta_bricks_bridge_stair = add("betterlands", "red_terracotta_bricks_bridge_stair", () -> new Bridge_Stairs(AbstractBlock.Properties.of(Material.STONE).harvestTool(ToolType.PICKAXE).strength(3.0F, 5.0F).sound(SoundType.STONE)));
	public static final RegistryObject<Block> terracotta_bricks_bridge_stair = add("betterlands", "terracotta_bricks_bridge_stair", () -> new Bridge_Stairs(AbstractBlock.Properties.of(Material.STONE).harvestTool(ToolType.PICKAXE).strength(3.0F, 5.0F).sound(SoundType.STONE)));
	public static final RegistryObject<Block> white_terracotta_bricks_bridge_stair = add("betterlands", "white_terracotta_bricks_bridge_stair", () -> new Bridge_Stairs(AbstractBlock.Properties.of(Material.STONE).harvestTool(ToolType.PICKAXE).strength(3.0F, 5.0F).sound(SoundType.STONE)));
	public static final RegistryObject<Block> yellow_terracotta_bricks_bridge_stair = add("betterlands", "yellow_terracotta_bricks_bridge_stair", () -> new Bridge_Stairs(AbstractBlock.Properties.of(Material.STONE).harvestTool(ToolType.PICKAXE).strength(3.0F, 5.0F).sound(SoundType.STONE)));
	
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
