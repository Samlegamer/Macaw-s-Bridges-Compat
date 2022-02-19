package fr.samlegamer.macawsbridgesautumnity.block;

import com.google.common.base.Supplier;
import com.mcwbridges.kikoz.objects.Iron_Stair;
import com.mcwbridges.kikoz.objects.Log_Bridge;
import com.mcwbridges.kikoz.objects.Rail_Bridge;
import com.mcwbridges.kikoz.objects.Rope_Bridge;
import com.mcwbridges.kikoz.objects.Support_Pillar;

import fr.samlegamer.macawsbridgesautumnity.MacawsBridgesAutumnity;
import fr.samlegamer.macawsbridgesautumnity.item.MBAItemsRegistry;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class MBABlocksRegistry
{
	public static final DeferredRegister<Block> BLOCKS_REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, MacawsBridgesAutumnity.MODID);
	
	//Wood
	public static final RegistryObject<Block> maple_log_bridge_middle = createBlock("maple_log_bridge_middle", () -> new Log_Bridge(AbstractBlock.Properties.of(Material.WOOD).strength(0.5F, 2.5F).sound(SoundType.WOOD)));
	public static final RegistryObject<Block> maple_bridge_pier = createBlock("maple_bridge_pier", () -> new Support_Pillar(AbstractBlock.Properties.of(Material.WOOD).strength(0.5F, 2.5F).sound(SoundType.WOOD)));
	public static final RegistryObject<Block> maple_log_bridge_stair = createBlock("maple_log_bridge_stair", () -> new Iron_Stair(AbstractBlock.Properties.of(Material.WOOD).strength(0.5F, 2.5F).sound(SoundType.WOOD)));
	public static final RegistryObject<Block> maple_rail_bridge = createBlock("maple_rail_bridge", () -> new Rail_Bridge(AbstractBlock.Properties.of(Material.WOOD).noOcclusion().strength(0.5F, 2.5F).sound(SoundType.WOOD)));
	public static final RegistryObject<Block> rope_maple_bridge = createBlock("rope_maple_bridge", () -> new Rope_Bridge(AbstractBlock.Properties.of(Material.WOOD).strength(0.5F, 2.5F).sound(SoundType.WOOD)));
	
	//Stone
	public static final RegistryObject<Block> snail_shell_bricks_bridge = createBlock("snail_shell_bricks_bridge", () -> new Log_Bridge(AbstractBlock.Properties.of(Material.WOOD).strength(0.5F, 2.5F).sound(SoundType.WOOD)));
	public static final RegistryObject<Block> snail_shell_bricks_bridge_pier = createBlock("snail_shell_bricks_bridge_pier", () -> new Support_Pillar(AbstractBlock.Properties.of(Material.WOOD).strength(0.5F, 2.5F).sound(SoundType.WOOD)));
	public static final RegistryObject<Block> snail_shell_bricks_bridge_stair = createBlock("snail_shell_bricks_bridge_stair", () -> new Iron_Stair(AbstractBlock.Properties.of(Material.WOOD).strength(0.5F, 2.5F).sound(SoundType.WOOD)));

	public static final RegistryObject<Block> snail_shell_tiles_bridge = createBlock("snail_shell_tiles_bridge", () -> new Log_Bridge(AbstractBlock.Properties.of(Material.WOOD).strength(0.5F, 2.5F).sound(SoundType.WOOD)));
	public static final RegistryObject<Block> snail_shell_tiles_bridge_pier = createBlock("snail_shell_tiles_bridge_pier", () -> new Support_Pillar(AbstractBlock.Properties.of(Material.WOOD).strength(0.5F, 2.5F).sound(SoundType.WOOD)));
	public static final RegistryObject<Block> snail_shell_tiles_bridge_stair = createBlock("snail_shell_tiles_bridge_stair", () -> new Iron_Stair(AbstractBlock.Properties.of(Material.WOOD).strength(0.5F, 2.5F).sound(SoundType.WOOD)));
	
	public static RegistryObject<Block> createBlock(String name, Supplier<? extends Block> supplier)
    {
        RegistryObject<Block> block = BLOCKS_REGISTRY.register(name, supplier);
        MBAItemsRegistry.ITEMS_REGISTRY.register(name, () -> new BlockItem(block.get(), new Item.Properties().tab(MacawsBridgesAutumnity.CMT)));
        return block;
    }
}