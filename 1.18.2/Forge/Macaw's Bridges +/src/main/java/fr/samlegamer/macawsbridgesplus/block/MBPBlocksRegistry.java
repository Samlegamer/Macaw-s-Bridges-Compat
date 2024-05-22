package fr.samlegamer.macawsbridgesplus.block;

import com.google.common.base.Supplier;
import com.mcwbridges.kikoz.MacawsBridges;
import com.mcwbridges.kikoz.objects.Log_Bridge;

import fr.samlegamer.macawsbridgesplus.MacawsBridgesPlus;
import fr.samlegamer.macawsbridgesplus.block.interfaces.WeatheringCopperBridges;
import fr.samlegamer.macawsbridgesplus.item.MBPItemsRegistry;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class MBPBlocksRegistry
{
	public static final DeferredRegister<Block> BLOCKS_REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, MacawsBridgesPlus.MODID);

	//COPPER
	
	//Normal
	public static final RegistryObject<Block> copper_bridges = createBlock("copper_bridge", () -> new CopperBridge(WeatheringCopperBridges.WeatherState.UNAFFECTED, BlockBehaviour.Properties.of(Material.METAL).strength(0.5F, 2.5F).sound(SoundType.COPPER)));
	public static final RegistryObject<Block> exposed_copper_bridges = createBlock("exposed_copper_bridge", () -> new CopperBridge(WeatheringCopperBridges.WeatherState.EXPOSED, BlockBehaviour.Properties.of(Material.METAL).strength(0.5F, 2.5F).sound(SoundType.COPPER)));
	public static final RegistryObject<Block> weathered_copper_bridges = createBlock("weathered_copper_bridge", () -> new CopperBridge(WeatheringCopperBridges.WeatherState.WEATHERED, BlockBehaviour.Properties.of(Material.METAL).strength(0.5F, 2.5F).sound(SoundType.COPPER)));
	public static final RegistryObject<Block> oxidized_copper_bridges = createBlock("oxidized_copper_bridge", () -> new CopperBridge(WeatheringCopperBridges.WeatherState.OXIDIZED, BlockBehaviour.Properties.of(Material.METAL).strength(0.5F, 2.5F).sound(SoundType.COPPER)));

	//Cut
	public static final RegistryObject<Block> cut_copper_bridges = createBlock("cut_copper_bridge", () -> new CopperBridge(WeatheringCopperBridges.WeatherState.UNAFFECTED, BlockBehaviour.Properties.copy(copper_bridges.get())));
	public static final RegistryObject<Block> cut_exposed_copper_bridges = createBlock("cut_exposed_copper_bridge", () -> new CopperBridge(WeatheringCopperBridges.WeatherState.EXPOSED, BlockBehaviour.Properties.copy(exposed_copper_bridges.get())));
	public static final RegistryObject<Block> cut_weathered_copper_bridges = createBlock("cut_weathered_copper_bridge", () -> new CopperBridge(WeatheringCopperBridges.WeatherState.WEATHERED, BlockBehaviour.Properties.copy(weathered_copper_bridges.get())));
	public static final RegistryObject<Block> cut_oxidized_copper_bridges = createBlock("cut_oxidized_copper_bridge", () -> new CopperBridge(WeatheringCopperBridges.WeatherState.OXIDIZED, BlockBehaviour.Properties.copy(oxidized_copper_bridges.get())));
	
	//Waxed
	public static final RegistryObject<Block> waxed_copper_bridges = createBlock("waxed_copper_bridge", () -> new Log_Bridge(BlockBehaviour.Properties.copy(copper_bridges.get())));
	public static final RegistryObject<Block> waxed_exposed_copper_bridges = createBlock("waxed_exposed_copper_bridge", () -> new Log_Bridge(BlockBehaviour.Properties.copy(exposed_copper_bridges.get())));
	public static final RegistryObject<Block> waxed_weathered_copper_bridges = createBlock("waxed_weathered_copper_bridge", () -> new Log_Bridge(BlockBehaviour.Properties.copy(weathered_copper_bridges.get())));
	public static final RegistryObject<Block> waxed_oxidized_copper_bridges = createBlock("waxed_oxidized_copper_bridge", () -> new Log_Bridge(BlockBehaviour.Properties.copy(oxidized_copper_bridges.get())));

	//Waxed Cut
	public static final RegistryObject<Block> waxed_cut_copper_bridges = createBlock("waxed_cut_copper_bridge", () -> new Log_Bridge(BlockBehaviour.Properties.copy(copper_bridges.get())));
	public static final RegistryObject<Block> waxed_cut_exposed_copper_bridges = createBlock("waxed_cut_exposed_copper_bridge", () -> new Log_Bridge(BlockBehaviour.Properties.copy(exposed_copper_bridges.get())));
	public static final RegistryObject<Block> waxed_cut_weathered_copper_bridges = createBlock("waxed_cut_weathered_copper_bridge", () -> new Log_Bridge(BlockBehaviour.Properties.copy(weathered_copper_bridges.get())));
	public static final RegistryObject<Block> waxed_cut_oxidized_copper_bridges = createBlock("waxed_cut_oxidized_copper_bridge", () -> new Log_Bridge(BlockBehaviour.Properties.copy(oxidized_copper_bridges.get())));

	public static RegistryObject<Block> createBlock(String name, Supplier<? extends Block> supplier)
    {
        RegistryObject<Block> block = BLOCKS_REGISTRY.register(name, supplier);
        MBPItemsRegistry.ITEMS_REGISTRY.register(name, () -> new BlockItem(block.get(), new Item.Properties().tab(MacawsBridges.BridgesItemGroup)));
        return block;
    }
}