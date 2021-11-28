package fr.samlegamer.macawsbridgesenhancedmushrooms.block;

import com.google.common.base.Supplier;
import com.mcwbridges.kikoz.MacawsBridges;
import com.mcwbridges.kikoz.objects.Iron_Stair;
import com.mcwbridges.kikoz.objects.Log_Bridge;
import com.mcwbridges.kikoz.objects.Rail_Bridge;
import com.mcwbridges.kikoz.objects.Rope_Bridge;
import com.mcwbridges.kikoz.objects.Support_Pillar;

import fr.samlegamer.macawsbridgesenhancedmushrooms.MacawsBridgesEnhancedMushrooms;
import fr.samlegamer.macawsbridgesenhancedmushrooms.item.MBEMItemRegistry;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class MBEMBlockRegistry
{
	public static final DeferredRegister<Block> BLOCKS_REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, MacawsBridgesEnhancedMushrooms.MODID);
	
	//Bridges
	public static final RegistryObject<Block> brown_mushroom_log_bridge_middle = createBlock("brown_mushroom_log_bridge_middle", () -> new Log_Bridge(AbstractBlock.Properties.of(Material.WOOD).strength(0.5F, 2.5F).sound(SoundType.WOOD)));
	//public static final RegistryObject<Block> glowshroom_log_bridge_middle = createBlock("glowshroom_log_bridge_middle", () -> new Log_Bridge(AbstractBlock.Properties.of(Material.WOOD).strength(0.5F, 2.5F).sound(SoundType.WOOD)));
	public static final RegistryObject<Block> red_mushroom_log_bridge_middle = createBlock("red_mushroom_log_bridge_middle", () -> new Log_Bridge(AbstractBlock.Properties.of(Material.WOOD).strength(0.5F, 2.5F).sound(SoundType.WOOD)));

	//Ropes
	public static final RegistryObject<Block> rope_brown_mushroom_bridge = createBlock("rope_brown_mushroom_bridge", () -> new Rope_Bridge(AbstractBlock.Properties.of(Material.WOOD).strength(0.5F, 2.5F).sound(SoundType.WOOD)));
	//public static final RegistryObject<Block> rope_glowshroom_bridge = createBlock("rope_glowshroom_bridge", () -> new Rope_Bridge(AbstractBlock.Properties.of(Material.WOOD).strength(0.5F, 2.5F).sound(SoundType.WOOD)));
	public static final RegistryObject<Block> rope_red_mushroom_bridge = createBlock("rope_red_mushroom_bridge", () -> new Rope_Bridge(AbstractBlock.Properties.of(Material.WOOD).strength(0.5F, 2.5F).sound(SoundType.WOOD)));

	//Piers
	public static final RegistryObject<Block> brown_mushroom_bridge_pier = createBlock("brown_mushroom_bridge_pier", () -> new Support_Pillar(AbstractBlock.Properties.of(Material.WOOD).strength(0.5F, 2.5F).sound(SoundType.WOOD)));
	//public static final RegistryObject<Block> glowshroom_bridge_pier = createBlock("glowshroom_bridge_pier", () -> new Support_Pillar(AbstractBlock.Properties.of(Material.WOOD).strength(0.5F, 2.5F).sound(SoundType.WOOD)));
	public static final RegistryObject<Block> red_mushroom_bridge_pier = createBlock("red_mushroom_bridge_pier", () -> new Support_Pillar(AbstractBlock.Properties.of(Material.WOOD).strength(0.5F, 2.5F).sound(SoundType.WOOD)));

	//Stairs
	public static final RegistryObject<Block> brown_mushroom_log_bridge_stair = createBlock("brown_mushroom_log_bridge_stair", () -> new Iron_Stair(AbstractBlock.Properties.of(Material.WOOD).strength(0.5F, 2.5F).sound(SoundType.WOOD)));
	//public static final RegistryObject<Block> glowshroom_log_bridge_stair = createBlock("glowshroom_log_bridge_stair", () -> new Iron_Stair(AbstractBlock.Properties.of(Material.WOOD).strength(0.5F, 2.5F).sound(SoundType.WOOD)));
	public static final RegistryObject<Block> red_mushroom_log_bridge_stair = createBlock("red_mushroom_log_bridge_stair", () -> new Iron_Stair(AbstractBlock.Properties.of(Material.WOOD).strength(0.5F, 2.5F).sound(SoundType.WOOD)));

	//Rails
	public static final RegistryObject<Block> brown_mushroom_rail_bridge = createBlock("brown_mushroom_rail_bridge", () -> new Rail_Bridge(AbstractBlock.Properties.of(Material.WOOD).noOcclusion().strength(0.5F, 2.5F).sound(SoundType.WOOD)));
	//public static final RegistryObject<Block> glowshroom_rail_bridge = createBlock("glowshroom_rail_bridge", () -> new Rail_Bridge(AbstractBlock.Properties.of(Material.WOOD).noOcclusion().strength(0.5F, 2.5F).sound(SoundType.WOOD)));
	public static final RegistryObject<Block> red_mushroom_rail_bridge = createBlock("red_mushroom_rail_bridge", () -> new Rail_Bridge(AbstractBlock.Properties.of(Material.WOOD).noOcclusion().strength(0.5F, 2.5F).sound(SoundType.WOOD)));
	
	public static RegistryObject<Block> createBlock(String name, Supplier<? extends Block> supplier)
    {
        RegistryObject<Block> block = BLOCKS_REGISTRY.register(name, supplier);
        MBEMItemRegistry.ITEMS_REGISTRY.register(name, () -> new BlockItem(block.get(), new Item.Properties().tab(MacawsBridges.BridgesItemGroup)));
        return block;
    }
}