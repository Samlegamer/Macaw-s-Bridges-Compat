package fr.samlegamer.mcwbridgesabnormals.block;

import java.util.ArrayList;
import com.google.common.base.Supplier;
import com.mcwbridges.kikoz.objects.Iron_Stair;
import com.mcwbridges.kikoz.objects.Log_Bridge;
import com.mcwbridges.kikoz.objects.Rail_Bridge;
import com.mcwbridges.kikoz.objects.Rope_Bridge;
import com.mcwbridges.kikoz.objects.Support_Pillar;
import fr.samlegamer.mcwbridgesabnormals.McwBridgesAbnormals;
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

public class MBABlocksRegistry
{
	public static final DeferredRegister<Block> BLOCKS_REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, McwBridgesAbnormals.MODID);
	public static final DeferredRegister<Item> ITEMS_REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, McwBridgesAbnormals.MODID);	

	public static final RegistryObject<Block> HONEYCOMB_BRICK_BRIDGE_MIDDLE = createBlock("buzzier_bees", "honeycomb_brick_bridge", () -> new Log_Bridge(AbstractBlock.Properties.of(Material.CLAY).strength(0.6F).sound(SoundType.CORAL_BLOCK).harvestTool(ToolType.PICKAXE)));
	public static final RegistryObject<Block> HONEYCOMB_TILE_BRIDGE_MIDDLE = createBlock("buzzier_bees", "honeycomb_tile_bridge", () -> new Log_Bridge(AbstractBlock.Properties.of(Material.CLAY).strength(0.6F).sound(SoundType.CORAL_BLOCK).harvestTool(ToolType.PICKAXE)));
	public static final RegistryObject<Block> honeycomb_brick_bridge_stair = createBlock("buzzier_bees", "honeycomb_brick_bridge_stair", () -> new Iron_Stair(AbstractBlock.Properties.of(Material.CLAY).strength(0.6F).sound(SoundType.CORAL_BLOCK).harvestTool(ToolType.PICKAXE)));
	public static final RegistryObject<Block> honeycomb_tile_bridge_stair = createBlock("buzzier_bees", "honeycomb_tile_bridge_stair", () -> new Iron_Stair(AbstractBlock.Properties.of(Material.CLAY).strength(0.6F).sound(SoundType.CORAL_BLOCK).harvestTool(ToolType.PICKAXE)));
	public static final RegistryObject<Block> honeycomb_brick_bridge_pier = createBlock("buzzier_bees", "honeycomb_brick_bridge_pier", () -> new Support_Pillar(AbstractBlock.Properties.of(Material.CLAY).noOcclusion().strength(0.6F).sound(SoundType.CORAL_BLOCK).harvestTool(ToolType.PICKAXE)));
	public static final RegistryObject<Block> honeycomb_tile_bridge_pier = createBlock("buzzier_bees", "honeycomb_tile_bridge_pier", () -> new Support_Pillar(AbstractBlock.Properties.of(Material.CLAY).noOcclusion().strength(0.6F).sound(SoundType.CORAL_BLOCK).harvestTool(ToolType.PICKAXE)));

	public static final RegistryObject<Block> red_arid_sandstone_bridge = createBlock("atmospheric", "red_arid_sandstone_bridge", () -> new Log_Bridge(AbstractBlock.Properties.of(Material.STONE).strength(3.0F, 5.0F).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE)));
	public static final RegistryObject<Block> arid_sandstone_bridge = createBlock("atmospheric", "arid_sandstone_bridge", () -> new Log_Bridge(AbstractBlock.Properties.of(Material.STONE).strength(3.0F, 5.0F).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE)));
	public static final RegistryObject<Block> red_arid_sandstone_bridge_stair = createBlock("atmospheric", "red_arid_sandstone_bridge_stair", () -> new Iron_Stair(AbstractBlock.Properties.of(Material.STONE).strength(3.0F, 5.0F).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE)));
	public static final RegistryObject<Block> arid_sandstone_bridge_pier = createBlock("atmospheric", "arid_sandstone_bridge_pier", () -> new Support_Pillar(AbstractBlock.Properties.of(Material.STONE).strength(3.0F, 5.0F).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE)));
	public static final RegistryObject<Block> red_arid_sandstone_bridge_pier = createBlock("atmospheric", "red_arid_sandstone_bridge_pier", () -> new Support_Pillar(AbstractBlock.Properties.of(Material.STONE).strength(3.0F, 5.0F).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE)));
	public static final RegistryObject<Block> arid_sandstone_bridge_stair = createBlock("atmospheric", "arid_sandstone_bridge_stair", () -> new Iron_Stair(AbstractBlock.Properties.of(Material.STONE).strength(3.0F, 5.0F).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE)));
	
	public static final RegistryObject<Block> maple_log_bridge_middle = createBlock("autumnity", "maple_log_bridge_middle", () -> new Log_Bridge(AbstractBlock.Properties.of(Material.WOOD).strength(0.5F, 2.5F).sound(SoundType.WOOD).harvestTool(ToolType.AXE)));
	public static final RegistryObject<Block> rope_maple_bridge = createBlock("autumnity", "rope_maple_bridge", () -> new Rope_Bridge(AbstractBlock.Properties.of(Material.WOOD).strength(0.5F, 2.5F).sound(SoundType.WOOD).harvestTool(ToolType.AXE)));
	public static final RegistryObject<Block> maple_bridge_pier = createBlock("autumnity", "maple_bridge_pier", () -> new Support_Pillar(AbstractBlock.Properties.of(Material.WOOD).strength(0.5F, 2.5F).sound(SoundType.WOOD).harvestTool(ToolType.AXE)));
	public static final RegistryObject<Block> maple_log_bridge_stair = createBlock("autumnity", "maple_log_bridge_stair", () -> new Iron_Stair(AbstractBlock.Properties.of(Material.WOOD).strength(0.5F, 2.5F).sound(SoundType.WOOD).harvestTool(ToolType.AXE)));
	public static final RegistryObject<Block> maple_rope_bridge_stair = createBlock("autumnity", "maple_rope_bridge_stair", () -> new Iron_Stair(AbstractBlock.Properties.of(Material.WOOD).strength(0.5F, 2.5F).sound(SoundType.WOOD).harvestTool(ToolType.AXE)));
	public static final RegistryObject<Block> maple_rail_bridge = createBlock("autumnity", "maple_rail_bridge", () -> new Rail_Bridge(AbstractBlock.Properties.of(Material.WOOD).noOcclusion().strength(0.5F, 2.5F).sound(SoundType.WOOD).harvestTool(ToolType.AXE)));
	public static final RegistryObject<Block> snail_shell_bricks_bridge = createBlock("autumnity", "snail_shell_bricks_bridge", () -> new Log_Bridge(AbstractBlock.Properties.of(Material.STONE).strength(0.5F, 2.5F).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE)));
	public static final RegistryObject<Block> snail_shell_bricks_bridge_pier = createBlock("autumnity", "snail_shell_bricks_bridge_pier", () -> new Support_Pillar(AbstractBlock.Properties.of(Material.STONE).strength(0.5F, 2.5F).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE)));
	public static final RegistryObject<Block> snail_shell_bricks_bridge_stair = createBlock("autumnity", "snail_shell_bricks_bridge_stair", () -> new Iron_Stair(AbstractBlock.Properties.of(Material.STONE).strength(0.5F, 2.5F).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE)));
	public static final RegistryObject<Block> snail_shell_tiles_bridge = createBlock("autumnity", "snail_shell_tiles_bridge", () -> new Log_Bridge(AbstractBlock.Properties.of(Material.STONE).strength(0.5F, 2.5F).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE)));
	public static final RegistryObject<Block> snail_shell_tiles_bridge_pier = createBlock("autumnity", "snail_shell_tiles_bridge_pier", () -> new Support_Pillar(AbstractBlock.Properties.of(Material.STONE).strength(0.5F, 2.5F).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE)));
	public static final RegistryObject<Block> snail_shell_tiles_bridge_stair = createBlock("autumnity", "snail_shell_tiles_bridge_stair", () -> new Iron_Stair(AbstractBlock.Properties.of(Material.STONE).strength(0.5F, 2.5F).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE)));
	
	public static final RegistryObject<Block> cherry_log_bridge_middle = createBlock("environmental", "cherry_log_bridge_middle", () -> new Log_Bridge(AbstractBlock.Properties.of(Material.WOOD).strength(0.5F, 2.5F).sound(SoundType.WOOD).harvestTool(ToolType.AXE)));
	public static final RegistryObject<Block> wisteria_log_bridge_middle = createBlock("environmental", "wisteria_log_bridge_middle", () -> new Log_Bridge(AbstractBlock.Properties.of(Material.WOOD).strength(0.5F, 2.5F).sound(SoundType.WOOD).harvestTool(ToolType.AXE)));
	public static final RegistryObject<Block> willow_log_bridge_middle = createBlock("environmental", "willow_log_bridge_middle", () -> new Log_Bridge(AbstractBlock.Properties.of(Material.WOOD).strength(0.5F, 2.5F).sound(SoundType.WOOD).harvestTool(ToolType.AXE)));
	public static final RegistryObject<Block> cherry_rail_bridge = createBlock("environmental", "cherry_rail_bridge", () -> new Rail_Bridge(AbstractBlock.Properties.of(Material.WOOD).noOcclusion().strength(0.5F, 2.5F).sound(SoundType.WOOD).harvestTool(ToolType.AXE)));
	public static final RegistryObject<Block> wisteria_rail_bridge = createBlock("environmental", "wisteria_rail_bridge", () -> new Rail_Bridge(AbstractBlock.Properties.of(Material.WOOD).noOcclusion().strength(0.5F, 2.5F).sound(SoundType.WOOD).harvestTool(ToolType.AXE)));
	public static final RegistryObject<Block> willow_rail_bridge = createBlock("environmental", "willow_rail_bridge", () -> new Rail_Bridge(AbstractBlock.Properties.of(Material.WOOD).noOcclusion().strength(0.5F, 2.5F).sound(SoundType.WOOD).harvestTool(ToolType.AXE)));
	public static final RegistryObject<Block> cherry_log_bridge_stair = createBlock("environmental", "cherry_log_bridge_stair", () -> new Iron_Stair(AbstractBlock.Properties.of(Material.WOOD).strength(0.5F, 2.5F).sound(SoundType.WOOD).harvestTool(ToolType.AXE)));
	public static final RegistryObject<Block> wisteria_log_bridge_stair = createBlock("environmental", "wisteria_log_bridge_stair", () -> new Iron_Stair(AbstractBlock.Properties.of(Material.WOOD).strength(0.5F, 2.5F).sound(SoundType.WOOD).harvestTool(ToolType.AXE)));
	public static final RegistryObject<Block> willow_log_bridge_stair = createBlock("environmental", "willow_log_bridge_stair", () -> new Iron_Stair(AbstractBlock.Properties.of(Material.WOOD).strength(0.5F, 2.5F).sound(SoundType.WOOD).harvestTool(ToolType.AXE)));
	public static final RegistryObject<Block> cherry_rope_bridge_stair = createBlock("environmental", "cherry_rope_bridge_stair", () -> new Iron_Stair(AbstractBlock.Properties.of(Material.WOOD).strength(0.5F, 2.5F).sound(SoundType.WOOD).harvestTool(ToolType.AXE)));
	public static final RegistryObject<Block> wisteria_rope_bridge_stair = createBlock("environmental", "wisteria_rope_bridge_stair", () -> new Iron_Stair(AbstractBlock.Properties.of(Material.WOOD).strength(0.5F, 2.5F).sound(SoundType.WOOD).harvestTool(ToolType.AXE)));
	public static final RegistryObject<Block> willow_rope_bridge_stair = createBlock("environmental", "willow_rope_bridge_stair", () -> new Iron_Stair(AbstractBlock.Properties.of(Material.WOOD).strength(0.5F, 2.5F).sound(SoundType.WOOD).harvestTool(ToolType.AXE)));
	public static final RegistryObject<Block> cherry_bridge_pier = createBlock("environmental", "cherry_bridge_pier", () -> new Support_Pillar(AbstractBlock.Properties.of(Material.WOOD).strength(0.5F, 2.5F).sound(SoundType.WOOD).harvestTool(ToolType.AXE)));
	public static final RegistryObject<Block> wisteria_bridge_pier = createBlock("environmental", "wisteria_bridge_pier", () -> new Support_Pillar(AbstractBlock.Properties.of(Material.WOOD).strength(0.5F, 2.5F).sound(SoundType.WOOD).harvestTool(ToolType.AXE)));
	public static final RegistryObject<Block> willow_bridge_pier = createBlock("environmental", "willow_bridge_pier", () -> new Support_Pillar(AbstractBlock.Properties.of(Material.WOOD).strength(0.5F, 2.5F).sound(SoundType.WOOD).harvestTool(ToolType.AXE)));
	public static final RegistryObject<Block> rope_cherry_bridge = createBlock("environmental", "rope_cherry_bridge", () -> new Rope_Bridge(AbstractBlock.Properties.of(Material.WOOD).strength(0.5F, 2.5F).sound(SoundType.WOOD).harvestTool(ToolType.AXE)));
	public static final RegistryObject<Block> rope_wisteria_bridge = createBlock("environmental", "rope_wisteria_bridge", () -> new Rope_Bridge(AbstractBlock.Properties.of(Material.WOOD).strength(0.5F, 2.5F).sound(SoundType.WOOD).harvestTool(ToolType.AXE)));
	public static final RegistryObject<Block> rope_willow_bridge = createBlock("environmental", "rope_willow_bridge", () -> new Rope_Bridge(AbstractBlock.Properties.of(Material.WOOD).strength(0.5F, 2.5F).sound(SoundType.WOOD).harvestTool(ToolType.AXE)));
	
	public static final RegistryObject<Block> driftwood_log_bridge_middle = createBlock("upgrade_aquatic", "driftwood_log_bridge_middle", () -> new Log_Bridge(AbstractBlock.Properties.of(Material.WOOD).strength(0.5F, 2.5F).sound(SoundType.WOOD).harvestTool(ToolType.AXE)));
	public static final RegistryObject<Block> river_log_bridge_middle = createBlock("upgrade_aquatic", "river_log_bridge_middle", () -> new Log_Bridge(AbstractBlock.Properties.of(Material.WOOD).strength(0.5F, 2.5F).sound(SoundType.WOOD).harvestTool(ToolType.AXE)));
	public static final RegistryObject<Block> driftwood_rail_bridge = createBlock("upgrade_aquatic", "driftwood_rail_bridge", () -> new Rail_Bridge(AbstractBlock.Properties.of(Material.WOOD).noOcclusion().strength(0.5F, 2.5F).sound(SoundType.WOOD).harvestTool(ToolType.AXE)));
	public static final RegistryObject<Block> river_rail_bridge = createBlock("upgrade_aquatic", "river_rail_bridge", () -> new Rail_Bridge(AbstractBlock.Properties.of(Material.WOOD).noOcclusion().strength(0.5F, 2.5F).sound(SoundType.WOOD).harvestTool(ToolType.AXE)));
	public static final RegistryObject<Block> driftwood_log_bridge_stair = createBlock("upgrade_aquatic", "driftwood_log_bridge_stair", () -> new Iron_Stair(AbstractBlock.Properties.of(Material.WOOD).strength(0.5F, 2.5F).sound(SoundType.WOOD).harvestTool(ToolType.AXE)));
	public static final RegistryObject<Block> river_log_bridge_stair = createBlock("upgrade_aquatic", "river_log_bridge_stair", () -> new Iron_Stair(AbstractBlock.Properties.of(Material.WOOD).strength(0.5F, 2.5F).sound(SoundType.WOOD).harvestTool(ToolType.AXE)));
	public static final RegistryObject<Block> driftwood_rope_bridge_stair = createBlock("upgrade_aquatic", "driftwood_rope_bridge_stair", () -> new Iron_Stair(AbstractBlock.Properties.of(Material.WOOD).strength(0.5F, 2.5F).sound(SoundType.WOOD).harvestTool(ToolType.AXE)));
	public static final RegistryObject<Block> river_rope_bridge_stair = createBlock("upgrade_aquatic", "river_rope_bridge_stair", () -> new Iron_Stair(AbstractBlock.Properties.of(Material.WOOD).strength(0.5F, 2.5F).sound(SoundType.WOOD).harvestTool(ToolType.AXE)));
	public static final RegistryObject<Block> driftwood_bridge_pier = createBlock("upgrade_aquatic", "driftwood_bridge_pier", () -> new Support_Pillar(AbstractBlock.Properties.of(Material.WOOD).strength(0.5F, 2.5F).sound(SoundType.WOOD).harvestTool(ToolType.AXE)));
	public static final RegistryObject<Block> river_bridge_pier = createBlock("upgrade_aquatic", "river_bridge_pier", () -> new Support_Pillar(AbstractBlock.Properties.of(Material.WOOD).strength(0.5F, 2.5F).sound(SoundType.WOOD).harvestTool(ToolType.AXE)));
	public static final RegistryObject<Block> rope_driftwood_bridge = createBlock("upgrade_aquatic", "rope_driftwood_bridge", () -> new Rope_Bridge(AbstractBlock.Properties.of(Material.WOOD).strength(0.5F, 2.5F).sound(SoundType.WOOD).harvestTool(ToolType.AXE)));
	public static final RegistryObject<Block> rope_river_bridge = createBlock("upgrade_aquatic", "rope_river_bridge", () -> new Rope_Bridge(AbstractBlock.Properties.of(Material.WOOD).strength(0.5F, 2.5F).sound(SoundType.WOOD).harvestTool(ToolType.AXE)));
	
	public static final RegistryObject<Block> poise_log_bridge_middle = createBlock("endergetic", "poise_log_bridge_middle", () -> new Log_Bridge(AbstractBlock.Properties.of(Material.WOOD).strength(0.5F, 2.5F).sound(SoundType.WOOD).harvestTool(ToolType.AXE)));
	public static final RegistryObject<Block> rope_poise_bridge = createBlock("endergetic", "rope_poise_bridge", () -> new Rope_Bridge(AbstractBlock.Properties.of(Material.WOOD).strength(0.5F, 2.5F).sound(SoundType.WOOD).harvestTool(ToolType.AXE)));
	public static final RegistryObject<Block> poise_bridge_pier = createBlock("endergetic", "poise_bridge_pier", () -> new Support_Pillar(AbstractBlock.Properties.of(Material.WOOD).strength(0.5F, 2.5F).sound(SoundType.WOOD).harvestTool(ToolType.AXE)));
	public static final RegistryObject<Block> poise_log_bridge_stair = createBlock("endergetic", "poise_log_bridge_stair", () -> new Iron_Stair(AbstractBlock.Properties.of(Material.WOOD).strength(0.5F, 2.5F).sound(SoundType.WOOD).harvestTool(ToolType.AXE)));
	public static final RegistryObject<Block> poise_rope_bridge_stair = createBlock("endergetic", "poise_rope_bridge_stair", () -> new Iron_Stair(AbstractBlock.Properties.of(Material.WOOD).strength(0.5F, 2.5F).sound(SoundType.WOOD).harvestTool(ToolType.AXE)));
	public static final RegistryObject<Block> poise_rail_bridge = createBlock("endergetic", "poise_rail_bridge", () -> new Rail_Bridge(AbstractBlock.Properties.of(Material.WOOD).noOcclusion().strength(0.5F, 2.5F).sound(SoundType.WOOD).harvestTool(ToolType.AXE)));
	
	public static RegistryObject<Block> WoodBridgesAll, RailWoodAll, StairsWoodAll, RopeStairsWoodAll, RopeWoodAll, PierWoodAll;
	
	public static void registryAtmospheric()
	{
		ArrayList<String> MATERIAL = new ArrayList<String>();
		
		MATERIAL.add("aspen");
		MATERIAL.add("grimwood");
		MATERIAL.add("kousa");
		MATERIAL.add("morado");
		MATERIAL.add("rosewood");
		MATERIAL.add("yucca");

		for(String i : MATERIAL)
		{
			WoodBridgesAll = createBlock("atmospheric", ""+i+"_log_bridge_middle", () -> new Log_Bridge(AbstractBlock.Properties.of(Material.WOOD).strength(0.5F, 2.5F).sound(SoundType.WOOD).harvestTool(ToolType.AXE)));
			RopeWoodAll = createBlock("atmospheric", "rope_"+i+"_bridge", () -> new Rope_Bridge(AbstractBlock.Properties.of(Material.WOOD).strength(0.5F, 2.5F).sound(SoundType.WOOD).harvestTool(ToolType.AXE)));
			StairsWoodAll = createBlock("atmospheric", ""+i+"_log_bridge_stair", () -> new Iron_Stair(AbstractBlock.Properties.of(Material.WOOD).strength(0.5F, 2.5F).sound(SoundType.WOOD).harvestTool(ToolType.AXE)));
			RopeStairsWoodAll = createBlock("atmospheric", ""+i+"_rope_bridge_stair", () -> new Iron_Stair(AbstractBlock.Properties.of(Material.WOOD).strength(0.5F, 2.5F).sound(SoundType.WOOD).harvestTool(ToolType.AXE)));
			PierWoodAll = createBlock("atmospheric", ""+i+"_bridge_pier", () -> new Support_Pillar(AbstractBlock.Properties.of(Material.WOOD).strength(0.5F, 2.5F).sound(SoundType.WOOD).harvestTool(ToolType.AXE)));
			RailWoodAll = createBlock("atmospheric", ""+i+"_rail_bridge", () -> new Rail_Bridge(AbstractBlock.Properties.of(Material.WOOD).noOcclusion().strength(0.5F, 2.5F).sound(SoundType.WOOD).harvestTool(ToolType.AXE)));
		}
	}
	
	public static RegistryObject<Block> createBlock(String modid, String name, Supplier<? extends Block> supplier)
    {
        RegistryObject<Block> block = BLOCKS_REGISTRY.register(name, supplier);
        if(ModList.get().isLoaded(modid))
        {
            ITEMS_REGISTRY.register(name, () -> new BlockItem(block.get(), new Item.Properties().tab(McwBridgesAbnormals.CMT)));
        }
        return block;
    }
}