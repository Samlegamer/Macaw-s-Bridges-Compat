package fr.samlegamer.mcwbridgesshroomed.block;

import com.google.common.base.Supplier;
import com.mcwbridges.kikoz.MacawsBridges;
import com.mcwbridges.kikoz.objects.Iron_Stair;
import com.mcwbridges.kikoz.objects.Log_Bridge;
import com.mcwbridges.kikoz.objects.Rail_Bridge;
import com.mcwbridges.kikoz.objects.Rope_Bridge;
import com.mcwbridges.kikoz.objects.Support_Pillar;

import fr.samlegamer.mcwbridgesshroomed.McwBridgesShroomed;
import fr.samlegamer.mcwbridgesshroomed.item.MBSItemsRegistry;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class MBSBlocksRegistry
{
	public static final DeferredRegister<Block> BLOCKS_REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, McwBridgesShroomed.MODID);

	public static final RegistryObject<Block> blue_hard_mushroom_log_bridge_middle = createBlock("blue_hard_mushroom_log_bridge_middle", () -> new Log_Bridge(AbstractBlock.Properties.of(Material.WOOD).strength(0.5F, 2.5F).sound(SoundType.WOOD)));
	public static final RegistryObject<Block> hard_mushroom_log_bridge_middle = createBlock("hard_mushroom_log_bridge_middle", () -> new Log_Bridge(AbstractBlock.Properties.of(Material.WOOD).strength(0.5F, 2.5F).sound(SoundType.WOOD)));
	public static final RegistryObject<Block> orange_hard_mushroom_log_bridge_middle = createBlock("orange_hard_mushroom_log_bridge_middle", () -> new Log_Bridge(AbstractBlock.Properties.of(Material.WOOD).strength(0.5F, 2.5F).sound(SoundType.WOOD)));
	public static final RegistryObject<Block> purple_hard_mushroom_log_bridge_middle = createBlock("purple_hard_mushroom_log_bridge_middle", () -> new Log_Bridge(AbstractBlock.Properties.of(Material.WOOD).strength(0.5F, 2.5F).sound(SoundType.WOOD)));	
	
	public static final RegistryObject<Block> blue_hard_mushroom_rail_bridge = createBlock("blue_hard_mushroom_rail_bridge", () -> new Rail_Bridge(AbstractBlock.Properties.of(Material.WOOD).noOcclusion().strength(0.5F, 2.5F).sound(SoundType.WOOD)));
	public static final RegistryObject<Block> hard_mushroom_rail_bridge = createBlock("hard_mushroom_rail_bridge", () -> new Rail_Bridge(AbstractBlock.Properties.of(Material.WOOD).noOcclusion().strength(0.5F, 2.5F).sound(SoundType.WOOD)));
	public static final RegistryObject<Block> orange_hard_mushroom_rail_bridge = createBlock("orange_hard_mushroom_rail_bridge", () -> new Rail_Bridge(AbstractBlock.Properties.of(Material.WOOD).noOcclusion().strength(0.5F, 2.5F).sound(SoundType.WOOD)));
	public static final RegistryObject<Block> purple_hard_mushroom_rail_bridge = createBlock("purple_hard_mushroom_rail_bridge", () -> new Rail_Bridge(AbstractBlock.Properties.of(Material.WOOD).noOcclusion().strength(0.5F, 2.5F).sound(SoundType.WOOD)));

	public static final RegistryObject<Block> blue_hard_mushroom_log_bridge_stair = createBlock("blue_hard_mushroom_log_bridge_stair", () -> new Iron_Stair(AbstractBlock.Properties.of(Material.WOOD).strength(0.5F, 2.5F).sound(SoundType.WOOD)));
	public static final RegistryObject<Block> hard_mushroom_log_bridge_stair = createBlock("hard_mushroom_log_bridge_stair", () -> new Iron_Stair(AbstractBlock.Properties.of(Material.WOOD).strength(0.5F, 2.5F).sound(SoundType.WOOD)));
	public static final RegistryObject<Block> orange_hard_mushroom_log_bridge_stair = createBlock("orange_hard_mushroom_log_bridge_stair", () -> new Iron_Stair(AbstractBlock.Properties.of(Material.WOOD).strength(0.5F, 2.5F).sound(SoundType.WOOD)));
	public static final RegistryObject<Block> purple_hard_mushroom_log_bridge_stair = createBlock("purple_hard_mushroom_log_bridge_stair", () -> new Iron_Stair(AbstractBlock.Properties.of(Material.WOOD).strength(0.5F, 2.5F).sound(SoundType.WOOD)));

	public static final RegistryObject<Block> blue_hard_mushroom_bridge_pier = createBlock("blue_hard_mushroom_bridge_pier", () -> new Support_Pillar(AbstractBlock.Properties.of(Material.WOOD).strength(0.5F, 2.5F).sound(SoundType.WOOD)));
	public static final RegistryObject<Block> hard_mushroom_bridge_pier = createBlock("hard_mushroom_bridge_pier", () -> new Support_Pillar(AbstractBlock.Properties.of(Material.WOOD).strength(0.5F, 2.5F).sound(SoundType.WOOD)));
	public static final RegistryObject<Block> orange_hard_mushroom_bridge_pier = createBlock("orange_hard_mushroom_bridge_pier", () -> new Support_Pillar(AbstractBlock.Properties.of(Material.WOOD).strength(0.5F, 2.5F).sound(SoundType.WOOD)));
	public static final RegistryObject<Block> purple_hard_mushroom_bridge_pier = createBlock("purple_hard_mushroom_bridge_pier", () -> new Support_Pillar(AbstractBlock.Properties.of(Material.WOOD).strength(0.5F, 2.5F).sound(SoundType.WOOD)));
	
	public static final RegistryObject<Block> rope_blue_hard_mushroom_bridge = createBlock("rope_blue_hard_mushroom_bridge", () -> new Rope_Bridge(AbstractBlock.Properties.of(Material.WOOD).strength(0.5F, 2.5F).sound(SoundType.WOOD)));
	public static final RegistryObject<Block> rope_hard_mushroom_bridge = createBlock("rope_hard_mushroom_bridge", () -> new Rope_Bridge(AbstractBlock.Properties.of(Material.WOOD).strength(0.5F, 2.5F).sound(SoundType.WOOD)));
	public static final RegistryObject<Block> rope_orange_hard_mushroom_bridge = createBlock("rope_orange_hard_mushroom_bridge", () -> new Rope_Bridge(AbstractBlock.Properties.of(Material.WOOD).strength(0.5F, 2.5F).sound(SoundType.WOOD)));
	public static final RegistryObject<Block> rope_purple_hard_mushroom_bridge = createBlock("rope_purple_hard_mushroom_bridge", () -> new Rope_Bridge(AbstractBlock.Properties.of(Material.WOOD).strength(0.5F, 2.5F).sound(SoundType.WOOD)));
	
	public static RegistryObject<Block> createBlock(String name, Supplier<? extends Block> supplier)
    {
        RegistryObject<Block> block = BLOCKS_REGISTRY.register(name, supplier);
        MBSItemsRegistry.ITEMS_REGISTRY.register(name, () -> new BlockItem(block.get(), new Item.Properties().tab(MacawsBridges.BridgesItemGroup)));
        return block;
    }
}
