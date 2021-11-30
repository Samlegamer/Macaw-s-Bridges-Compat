package fr.samlegamer.macawsbridgesbetterlands.block;

import com.google.common.base.Supplier;
import com.mcwbridges.kikoz.MacawsBridges;
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
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class MBBBlocksRegistry
{
	public static final DeferredRegister<Block> BLOCKS_REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, MacawsBridgesBetterlands.MODID);
	
	//Bridges
	public static final RegistryObject<Block> black_terracotta_bricks_bridge = createBlock("black_terracotta_bricks_bridge", () -> new Log_Bridge(AbstractBlock.Properties.of(Material.STONE).strength(0.6F).sound(SoundType.STONE)));
	public static final RegistryObject<Block> blue_terracotta_bricks_bridge = createBlock("blue_terracotta_bricks_bridge", () -> new Log_Bridge(AbstractBlock.Properties.of(Material.STONE).strength(0.6F).sound(SoundType.STONE)));
	public static final RegistryObject<Block> brown_terracotta_bricks_bridge = createBlock("brown_terracotta_bricks_bridge", () -> new Log_Bridge(AbstractBlock.Properties.of(Material.STONE).strength(0.6F).sound(SoundType.STONE)));
	public static final RegistryObject<Block> claystone_bricks_bridge = createBlock("claystone_bricks_bridge", () -> new Log_Bridge(AbstractBlock.Properties.of(Material.STONE).strength(0.6F).sound(SoundType.STONE)));
	public static final RegistryObject<Block> cyan_terracotta_bricks_bridge = createBlock("cyan_terracotta_bricks_bridge", () -> new Log_Bridge(AbstractBlock.Properties.of(Material.STONE).strength(0.6F).sound(SoundType.STONE)));
	public static final RegistryObject<Block> gray_terracotta_bricks_bridge = createBlock("gray_terracotta_bricks_bridge", () -> new Log_Bridge(AbstractBlock.Properties.of(Material.STONE).strength(0.6F).sound(SoundType.STONE)));
	public static final RegistryObject<Block> green_terracotta_bricks_bridge = createBlock("green_terracotta_bricks_bridge", () -> new Log_Bridge(AbstractBlock.Properties.of(Material.STONE).strength(0.6F).sound(SoundType.STONE)));
	public static final RegistryObject<Block> light_blue_terracotta_bricks_bridge = createBlock("light_blue_terracotta_bricks_bridge", () -> new Log_Bridge(AbstractBlock.Properties.of(Material.STONE).strength(0.6F).sound(SoundType.STONE)));
	public static final RegistryObject<Block> light_gray_terracotta_bricks_bridge = createBlock("light_gray_terracotta_bricks_bridge", () -> new Log_Bridge(AbstractBlock.Properties.of(Material.STONE).strength(0.6F).sound(SoundType.STONE)));
	public static final RegistryObject<Block> lime_terracotta_bricks_bridge = createBlock("lime_terracotta_bricks_bridge", () -> new Log_Bridge(AbstractBlock.Properties.of(Material.STONE).strength(0.6F).sound(SoundType.STONE)));
	public static final RegistryObject<Block> magenta_terracotta_bricks_bridge = createBlock("magenta_terracotta_bricks_bridge", () -> new Log_Bridge(AbstractBlock.Properties.of(Material.STONE).strength(0.6F).sound(SoundType.STONE)));
	public static final RegistryObject<Block> orange_terracotta_bricks_bridge = createBlock("orange_terracotta_bricks_bridge", () -> new Log_Bridge(AbstractBlock.Properties.of(Material.STONE).strength(0.6F).sound(SoundType.STONE)));
	public static final RegistryObject<Block> red_terracotta_bricks_bridge = createBlock("red_terracotta_bricks_bridge", () -> new Log_Bridge(AbstractBlock.Properties.of(Material.STONE).strength(0.6F).sound(SoundType.STONE)));
	public static final RegistryObject<Block> terracotta_bricks_bridge = createBlock("terracotta_bricks_bridge", () -> new Log_Bridge(AbstractBlock.Properties.of(Material.STONE).strength(0.6F).sound(SoundType.STONE)));
	public static final RegistryObject<Block> white_terracotta_bricks_bridge = createBlock("white_terracotta_bricks_bridge", () -> new Log_Bridge(AbstractBlock.Properties.of(Material.STONE).strength(0.6F).sound(SoundType.STONE)));
	public static final RegistryObject<Block> yellow_terracotta_bricks_bridge = createBlock("yellow_terracotta_bricks_bridge", () -> new Log_Bridge(AbstractBlock.Properties.of(Material.STONE).strength(0.6F).sound(SoundType.STONE)));
	public static final RegistryObject<Block> juniper_log_bridge_middle = createBlock("juniper_log_bridge_middle", () -> new Log_Bridge(AbstractBlock.Properties.of(Material.WOOD).strength(0.5F, 2.5F).sound(SoundType.WOOD)));

	//Ropes
	public static final RegistryObject<Block> rope_juniper_bridge = createBlock("rope_juniper_bridge", () -> new Rope_Bridge(AbstractBlock.Properties.of(Material.WOOD).strength(0.5F, 2.5F).sound(SoundType.WOOD)));
	
	//Piers
	public static final RegistryObject<Block> black_terracotta_bricks_bridge_pier = createBlock("black_terracotta_bricks_bridge_pier", () -> new Support_Pillar(AbstractBlock.Properties.of(Material.STONE).noOcclusion().strength(0.6F).sound(SoundType.STONE)));
	public static final RegistryObject<Block> blue_terracotta_bricks_bridge_pier = createBlock("blue_terracotta_bricks_bridge_pier", () -> new Support_Pillar(AbstractBlock.Properties.of(Material.STONE).noOcclusion().strength(0.6F).sound(SoundType.STONE)));
	public static final RegistryObject<Block> brown_terracotta_bricks_bridge_pier = createBlock("brown_terracotta_bricks_bridge_pier", () -> new Support_Pillar(AbstractBlock.Properties.of(Material.STONE).noOcclusion().strength(0.6F).sound(SoundType.STONE)));
	public static final RegistryObject<Block> claystone_bricks_bridge_pier = createBlock("claystone_bricks_bridge_pier", () -> new Support_Pillar(AbstractBlock.Properties.of(Material.STONE).noOcclusion().strength(0.6F).sound(SoundType.STONE)));
	public static final RegistryObject<Block> cyan_terracotta_bricks_bridge_pier = createBlock("cyan_terracotta_bricks_bridge_pier", () -> new Support_Pillar(AbstractBlock.Properties.of(Material.STONE).noOcclusion().strength(0.6F).sound(SoundType.STONE)));
	public static final RegistryObject<Block> gray_terracotta_bricks_bridge_pier = createBlock("gray_terracotta_bricks_bridge_pier", () -> new Support_Pillar(AbstractBlock.Properties.of(Material.STONE).noOcclusion().strength(0.6F).sound(SoundType.STONE)));
	public static final RegistryObject<Block> green_terracotta_bricks_bridge_pier = createBlock("green_terracotta_bricks_bridge_pier", () -> new Support_Pillar(AbstractBlock.Properties.of(Material.STONE).noOcclusion().strength(0.6F).sound(SoundType.STONE)));
	public static final RegistryObject<Block> light_blue_terracotta_bricks_bridge_pier = createBlock("light_blue_terracotta_bricks_bridge_pier", () -> new Support_Pillar(AbstractBlock.Properties.of(Material.STONE).noOcclusion().strength(0.6F).sound(SoundType.STONE)));
	public static final RegistryObject<Block> light_gray_terracotta_bricks_bridge_pier = createBlock("light_gray_terracotta_bricks_bridge_pier", () -> new Support_Pillar(AbstractBlock.Properties.of(Material.STONE).noOcclusion().strength(0.6F).sound(SoundType.STONE)));
	public static final RegistryObject<Block> lime_terracotta_bricks_bridge_pier = createBlock("lime_terracotta_bricks_bridge_pier", () -> new Support_Pillar(AbstractBlock.Properties.of(Material.STONE).noOcclusion().strength(0.6F).sound(SoundType.STONE)));
	public static final RegistryObject<Block> magenta_terracotta_bricks_bridge_pier = createBlock("magenta_terracotta_bricks_bridge_pier", () -> new Support_Pillar(AbstractBlock.Properties.of(Material.STONE).noOcclusion().strength(0.6F).sound(SoundType.STONE)));
	public static final RegistryObject<Block> orange_terracotta_bricks_bridge_pier = createBlock("orange_terracotta_bricks_bridge_pier", () -> new Support_Pillar(AbstractBlock.Properties.of(Material.STONE).noOcclusion().strength(0.6F).sound(SoundType.STONE)));
	public static final RegistryObject<Block> red_terracotta_bricks_bridge_pier = createBlock("red_terracotta_bricks_bridge_pier", () -> new Support_Pillar(AbstractBlock.Properties.of(Material.STONE).noOcclusion().strength(0.6F).sound(SoundType.STONE)));
	public static final RegistryObject<Block> terracotta_bricks_bridge_pier = createBlock("terracotta_bricks_bridge_pier", () -> new Support_Pillar(AbstractBlock.Properties.of(Material.STONE).noOcclusion().strength(0.6F).sound(SoundType.STONE)));
	public static final RegistryObject<Block> white_terracotta_bricks_bridge_pier = createBlock("white_terracotta_bricks_bridge_pier", () -> new Support_Pillar(AbstractBlock.Properties.of(Material.STONE).noOcclusion().strength(0.6F).sound(SoundType.STONE)));
	public static final RegistryObject<Block> yellow_terracotta_bricks_bridge_pier = createBlock("yellow_terracotta_bricks_bridge_pier", () -> new Support_Pillar(AbstractBlock.Properties.of(Material.STONE).noOcclusion().strength(0.6F).sound(SoundType.STONE)));
	public static final RegistryObject<Block> juniper_bridge_pier = createBlock("juniper_bridge_pier", () -> new Support_Pillar(AbstractBlock.Properties.of(Material.WOOD).noOcclusion().strength(0.5F, 2.5F).sound(SoundType.WOOD)));

	//Stairs
	public static final RegistryObject<Block> black_terracotta_bricks_bridge_stair = createBlock("black_terracotta_bricks_bridge_stair", () -> new Iron_Stair(AbstractBlock.Properties.of(Material.STONE).strength(0.6F).sound(SoundType.STONE)));
	public static final RegistryObject<Block> blue_terracotta_bricks_bridge_stair = createBlock("blue_terracotta_bricks_bridge_stair", () -> new Iron_Stair(AbstractBlock.Properties.of(Material.STONE).strength(0.6F).sound(SoundType.STONE)));
	public static final RegistryObject<Block> brown_terracotta_bricks_bridge_stair = createBlock("brown_terracotta_bricks_bridge_stair", () -> new Iron_Stair(AbstractBlock.Properties.of(Material.STONE).strength(0.6F).sound(SoundType.STONE)));
	public static final RegistryObject<Block> claystone_bricks_bridge_stair = createBlock("claystone_bricks_bridge_stair", () -> new Iron_Stair(AbstractBlock.Properties.of(Material.STONE).strength(0.6F).sound(SoundType.STONE)));
	public static final RegistryObject<Block> cyan_terracotta_bricks_bridge_stair = createBlock("cyan_terracotta_bricks_bridge_stair", () -> new Iron_Stair(AbstractBlock.Properties.of(Material.STONE).strength(0.6F).sound(SoundType.STONE)));
	public static final RegistryObject<Block> gray_terracotta_bricks_bridge_stair = createBlock("gray_terracotta_bricks_bridge_stair", () -> new Iron_Stair(AbstractBlock.Properties.of(Material.STONE).strength(0.6F).sound(SoundType.STONE)));
	public static final RegistryObject<Block> green_terracotta_bricks_bridge_stair = createBlock("green_terracotta_bricks_bridge_stair", () -> new Iron_Stair(AbstractBlock.Properties.of(Material.STONE).strength(0.6F).sound(SoundType.STONE)));
	public static final RegistryObject<Block> light_blue_terracotta_bricks_bridge_stair = createBlock("light_blue_terracotta_bricks_bridge_stair", () -> new Iron_Stair(AbstractBlock.Properties.of(Material.STONE).strength(0.6F).sound(SoundType.STONE)));
	public static final RegistryObject<Block> light_gray_terracotta_bricks_bridge_stair = createBlock("light_gray_terracotta_bricks_bridge_stair", () -> new Iron_Stair(AbstractBlock.Properties.of(Material.STONE).strength(0.6F).sound(SoundType.STONE)));
	public static final RegistryObject<Block> lime_terracotta_bricks_bridge_stair = createBlock("lime_terracotta_bricks_bridge_stair", () -> new Iron_Stair(AbstractBlock.Properties.of(Material.STONE).strength(0.6F).sound(SoundType.STONE)));
	public static final RegistryObject<Block> magenta_terracotta_bricks_bridge_stair = createBlock("magenta_terracotta_bricks_bridge_stair", () -> new Iron_Stair(AbstractBlock.Properties.of(Material.STONE).strength(0.6F).sound(SoundType.STONE)));
	public static final RegistryObject<Block> orange_terracotta_bricks_bridge_stair = createBlock("orange_terracotta_bricks_bridge_stair", () -> new Iron_Stair(AbstractBlock.Properties.of(Material.STONE).strength(0.6F).sound(SoundType.STONE)));
	public static final RegistryObject<Block> red_terracotta_bricks_bridge_stair = createBlock("red_terracotta_bricks_bridge_stair", () -> new Iron_Stair(AbstractBlock.Properties.of(Material.STONE).strength(0.6F).sound(SoundType.STONE)));
	public static final RegistryObject<Block> terracotta_bricks_bridge_stair = createBlock("terracotta_bricks_bridge_stair", () -> new Iron_Stair(AbstractBlock.Properties.of(Material.STONE).strength(0.6F).sound(SoundType.STONE)));
	public static final RegistryObject<Block> white_terracotta_bricks_bridge_stair = createBlock("white_terracotta_bricks_bridge_stair", () -> new Iron_Stair(AbstractBlock.Properties.of(Material.STONE).strength(0.6F).sound(SoundType.STONE)));
	public static final RegistryObject<Block> yellow_terracotta_bricks_bridge_stair = createBlock("yellow_terracotta_bricks_bridge_stair", () -> new Iron_Stair(AbstractBlock.Properties.of(Material.STONE).strength(0.6F).sound(SoundType.STONE)));
	public static final RegistryObject<Block> juniper_log_bridge_stair = createBlock("juniper_log_bridge_stair", () -> new Iron_Stair(AbstractBlock.Properties.of(Material.WOOD).strength(0.6F).sound(SoundType.WOOD)));

	//Rails
	public static final RegistryObject<Block> juniper_rail_bridge = createBlock("juniper_rail_bridge", () -> new Rail_Bridge(AbstractBlock.Properties.of(Material.WOOD).noOcclusion().strength(0.6F).sound(SoundType.WOOD)));
	
	
	public static RegistryObject<Block> createBlock(String name, Supplier<? extends Block> supplier)
    {
        RegistryObject<Block> block = BLOCKS_REGISTRY.register(name, supplier);
        MBBItemsRegistry.ITEMS_REGISTRY.register(name, () -> new BlockItem(block.get(), new Item.Properties().tab(MacawsBridges.BridgesItemGroup)));
        return block;
    }
}