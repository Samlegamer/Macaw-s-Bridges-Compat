package fr.samlegamer.macawsbridgesbuzzierbees.block;

import com.google.common.base.Supplier;
import com.mcwbridges.kikoz.MacawsBridges;
import com.mcwbridges.kikoz.objects.Iron_Stair;
import com.mcwbridges.kikoz.objects.Log_Bridge;
import com.mcwbridges.kikoz.objects.Support_Pillar;

import fr.samlegamer.macawsbridgesbuzzierbees.MacawsBridgesBuzzierBees;
import fr.samlegamer.macawsbridgesbuzzierbees.item.MBBBItemsRegistry;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class MBBBBlocksRegistry
{
	public static final DeferredRegister<Block> BLOCKS_REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, MacawsBridgesBuzzierBees.MODID);

	//Bridge
	public static final RegistryObject<Block> HONEYCOMB_BRICK_BRIDGE_MIDDLE = createBlock("honeycomb_brick_bridge", () -> new Log_Bridge(AbstractBlock.Properties.of(Material.CLAY).strength(0.6F).sound(SoundType.CORAL_BLOCK)));
	public static final RegistryObject<Block> HONEYCOMB_TILE_BRIDGE_MIDDLE = createBlock("honeycomb_tile_bridge", () -> new Log_Bridge(AbstractBlock.Properties.of(Material.CLAY).strength(0.6F).sound(SoundType.CORAL_BLOCK)));
	
	//Stairs
	public static final RegistryObject<Block> honeycomb_brick_bridge_stair = createBlock("honeycomb_brick_bridge_stair", () -> new Iron_Stair(AbstractBlock.Properties.of(Material.CLAY).strength(0.6F).sound(SoundType.CORAL_BLOCK)));
	public static final RegistryObject<Block> honeycomb_tile_bridge_stair = createBlock("honeycomb_tile_bridge_stair", () -> new Iron_Stair(AbstractBlock.Properties.of(Material.CLAY).strength(0.6F).sound(SoundType.CORAL_BLOCK)));
	
	//Pier
	public static final RegistryObject<Block> honeycomb_brick_bridge_pier = createBlock("honeycomb_brick_bridge_pier", () -> new Support_Pillar(AbstractBlock.Properties.of(Material.CLAY).noOcclusion().strength(0.6F).sound(SoundType.CORAL_BLOCK)));
	public static final RegistryObject<Block> honeycomb_tile_bridge_pier = createBlock("honeycomb_tile_bridge_pier", () -> new Support_Pillar(AbstractBlock.Properties.of(Material.CLAY).noOcclusion().strength(0.6F).sound(SoundType.CORAL_BLOCK)));

	public static RegistryObject<Block> createBlock(String name, Supplier<? extends Block> supplier)
    {
        RegistryObject<Block> block = BLOCKS_REGISTRY.register(name, supplier);
        MBBBItemsRegistry.ITEMS_REGISTRY.register(name, () -> new BlockItem(block.get(), new Item.Properties().tab(MacawsBridges.BridgesItemGroup)));
        return block;
    }
}