package fr.samlegamer.macawsbridgesbop.block;

import com.google.common.base.Supplier;
import com.mcwbridges.kikoz.MacawsBridges;
import com.mcwbridges.kikoz.objects.Iron_Stair;
import com.mcwbridges.kikoz.objects.Log_Bridge;
import com.mcwbridges.kikoz.objects.Rail_Bridge;
import com.mcwbridges.kikoz.objects.Rope_Bridge;
import com.mcwbridges.kikoz.objects.Support_Pillar;

import fr.samlegamer.macawsbridgesbop.MacawsBridgesBOP;
import fr.samlegamer.macawsbridgesbop.item.MBBOPItemsRegistry;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class MBBOPBlocksRegistry
{
	public static final DeferredRegister<Block> BLOCKS_REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, MacawsBridgesBOP.MODID);

    public static final RegistryObject<Block> CHERRY_LOG_BRIDGE_MIDDLE = createBlock("cherry_log_bridge_middle", () -> new Log_Bridge(BlockBehaviour.Properties.of(Material.WOOD).strength(0.5F, 2.5F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> DEAD_LOG_BRIDGE_MIDDLE = createBlock("dead_log_bridge_middle", () -> new Log_Bridge(BlockBehaviour.Properties.of(Material.WOOD).strength(0.5F, 2.5F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> FIR_LOG_BRIDGE_MIDDLE = createBlock("fir_log_bridge_middle", () -> new Log_Bridge(BlockBehaviour.Properties.of(Material.WOOD).strength(0.5F, 2.5F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> HELLBARK_LOG_BRIDGE_MIDDLE = createBlock("hellbark_log_bridge_middle", () -> new Log_Bridge(BlockBehaviour.Properties.of(Material.WOOD).strength(0.5F, 2.5F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> JACARANDA_LOG_BRIDGE_MIDDLE = createBlock("jacaranda_log_bridge_middle", () -> new Log_Bridge(BlockBehaviour.Properties.of(Material.WOOD).strength(0.5F, 2.5F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> MAGIC_LOG_BRIDGE_MIDDLE = createBlock("magic_log_bridge_middle", () -> new Log_Bridge(BlockBehaviour.Properties.of(Material.WOOD).strength(0.5F, 2.5F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> MAHOGANY_LOG_BRIDGE_MIDDLE = createBlock("mahogany_log_bridge_middle", () -> new Log_Bridge(BlockBehaviour.Properties.of(Material.WOOD).strength(0.5F, 2.5F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> PALM_LOG_BRIDGE_MIDDLE = createBlock("palm_log_bridge_middle", () -> new Log_Bridge(BlockBehaviour.Properties.of(Material.WOOD).strength(0.5F, 2.5F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> REDWOOD_LOG_BRIDGE_MIDDLE = createBlock("redwood_log_bridge_middle", () -> new Log_Bridge(BlockBehaviour.Properties.of(Material.WOOD).strength(0.5F, 2.5F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> UMBRAN_LOG_BRIDGE_MIDDLE = createBlock("umbran_log_bridge_middle", () -> new Log_Bridge(BlockBehaviour.Properties.of(Material.WOOD).strength(0.5F, 2.5F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> WILLOW_LOG_BRIDGE_MIDDLE = createBlock("willow_log_bridge_middle", () -> new Log_Bridge(BlockBehaviour.Properties.of(Material.WOOD).strength(0.5F, 2.5F).sound(SoundType.WOOD)));
    
    public static final RegistryObject<Block> ORANGE_SANDSTONE_BRIDGE_MIDDLE = createBlock("orange_sandstone_bridge_middle", () -> new Log_Bridge(BlockBehaviour.Properties.of(Material.STONE).strength(3.0F, 5.0F).sound(SoundType.STONE)));
    public static final RegistryObject<Block> WHITE_SANDSTONE_BRIDGE_MIDDLE = createBlock("white_sandstone_bridge_middle", () -> new Log_Bridge(BlockBehaviour.Properties.of(Material.STONE).strength(3.0F, 5.0F).sound(SoundType.STONE)));
    public static final RegistryObject<Block> BLACK_SANDSTONE_BRIDGE_MIDDLE = createBlock("black_sandstone_bridge_middle", () -> new Log_Bridge(BlockBehaviour.Properties.of(Material.STONE).strength(3.0F, 5.0F).sound(SoundType.STONE)));
    public static final RegistryObject<Block> MUD_BRICK_BRIDGE_MIDDLE = createBlock("mud_brick_bridge_middle", () -> new Log_Bridge(BlockBehaviour.Properties.of(Material.STONE).strength(3.0F, 5.0F).sound(SoundType.STONE)));

    public static final RegistryObject<Block> CHERRY_LOG_ROPE_BRIDGE_MIDDLE = createBlock("rope_cherry_bridge", () -> new Rope_Bridge(BlockBehaviour.Properties.of(Material.WOOD).strength(0.5F, 2.5F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> DEAD_LOG_ROPE_BRIDGE_MIDDLE = createBlock("rope_dead_bridge", () -> new Rope_Bridge(BlockBehaviour.Properties.of(Material.WOOD).strength(0.5F, 2.5F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> FIR_LOG_ROPE_BRIDGE_MIDDLE = createBlock("rope_fir_bridge", () -> new Rope_Bridge(BlockBehaviour.Properties.of(Material.WOOD).strength(0.5F, 2.5F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> HELLBARK_ROPE_LOG_BRIDGE_MIDDLE = createBlock("rope_hellbark_bridge", () -> new Rope_Bridge(BlockBehaviour.Properties.of(Material.WOOD).strength(0.5F, 2.5F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> JACARANDA_ROPE_LOG_BRIDGE_MIDDLE = createBlock("rope_jacaranda_bridge", () -> new Rope_Bridge(BlockBehaviour.Properties.of(Material.WOOD).strength(0.5F, 2.5F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> MAGIC_LOG_ROPE_BRIDGE_MIDDLE = createBlock("rope_magic_bridge", () -> new Rope_Bridge(BlockBehaviour.Properties.of(Material.WOOD).strength(0.5F, 2.5F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> MAHOGANY_LOG_ROPE_BRIDGE_MIDDLE = createBlock("rope_mahogany_bridge", () -> new Rope_Bridge(BlockBehaviour.Properties.of(Material.WOOD).strength(0.5F, 2.5F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> PALM_LOG_ROPE_BRIDGE_MIDDLE = createBlock("rope_palm_bridge", () -> new Rope_Bridge(BlockBehaviour.Properties.of(Material.WOOD).strength(0.5F, 2.5F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> REDWOOD_ROPE_LOG_BRIDGE_MIDDLE = createBlock("rope_redwood_bridge", () -> new Rope_Bridge(BlockBehaviour.Properties.of(Material.WOOD).strength(0.5F, 2.5F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> UMBRAN_ROPE_LOG_BRIDGE_MIDDLE = createBlock("rope_umbran_bridge", () -> new Rope_Bridge(BlockBehaviour.Properties.of(Material.WOOD).strength(0.5F, 2.5F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> WILLOW_ROPE_LOG_BRIDGE_MIDDLE = createBlock("rope_willow_bridge", () -> new Rope_Bridge(BlockBehaviour.Properties.of(Material.WOOD).strength(0.5F, 2.5F).sound(SoundType.WOOD)));
    
    //Pier Wood
    public static final RegistryObject<Block> cherry_bridge_pier = createBlock("cherry_bridge_pier", () -> new Support_Pillar(BlockBehaviour.Properties.of(Material.WOOD).strength(0.5F, 2.5F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> dead_bridge_pier = createBlock("dead_bridge_pier", () -> new Support_Pillar(BlockBehaviour.Properties.of(Material.WOOD).strength(0.5F, 2.5F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> fir_bridge_pier = createBlock("fir_bridge_pier", () -> new Support_Pillar(BlockBehaviour.Properties.of(Material.WOOD).strength(0.5F, 2.5F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> hellbark_bridge_pier = createBlock("hellbark_bridge_pier", () -> new Support_Pillar(BlockBehaviour.Properties.of(Material.WOOD).strength(0.5F, 2.5F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> jacaranda_bridge_pier = createBlock("jacaranda_bridge_pier", () -> new Support_Pillar(BlockBehaviour.Properties.of(Material.WOOD).strength(0.5F, 2.5F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> magic_bridge_pier = createBlock("magic_bridge_pier", () -> new Support_Pillar(BlockBehaviour.Properties.of(Material.WOOD).strength(0.5F, 2.5F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> mahogany_bridge_pier = createBlock("mahogany_bridge_pier", () -> new Support_Pillar(BlockBehaviour.Properties.of(Material.WOOD).strength(0.5F, 2.5F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> palm_bridge_pier = createBlock("palm_bridge_pier", () -> new Support_Pillar(BlockBehaviour.Properties.of(Material.WOOD).strength(0.5F, 2.5F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> redwood_bridge_pier = createBlock("redwood_bridge_pier", () -> new Support_Pillar(BlockBehaviour.Properties.of(Material.WOOD).strength(0.5F, 2.5F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> umbran_bridge_pier = createBlock("umbran_bridge_pier", () -> new Support_Pillar(BlockBehaviour.Properties.of(Material.WOOD).strength(0.5F, 2.5F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> willow_bridge_pier = createBlock("willow_bridge_pier", () -> new Support_Pillar(BlockBehaviour.Properties.of(Material.WOOD).strength(0.5F, 2.5F).sound(SoundType.WOOD)));
    
    //Stairs Wood
    public static final RegistryObject<Block> cherry_log_bridge_stair = createBlock("cherry_log_bridge_stair", () -> new Iron_Stair(BlockBehaviour.Properties.of(Material.WOOD).strength(0.5F, 2.5F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> dead_log_bridge_stair = createBlock("dead_log_bridge_stair", () -> new Iron_Stair(BlockBehaviour.Properties.of(Material.WOOD).strength(0.5F, 2.5F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> fir_log_bridge_stair = createBlock("fir_log_bridge_stair", () -> new Iron_Stair(BlockBehaviour.Properties.of(Material.WOOD).strength(0.5F, 2.5F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> hellbark_log_bridge_stair = createBlock("hellbark_log_bridge_stair", () -> new Iron_Stair(BlockBehaviour.Properties.of(Material.WOOD).strength(0.5F, 2.5F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> jacaranda_log_bridge_stair = createBlock("jacaranda_log_bridge_stair", () -> new Iron_Stair(BlockBehaviour.Properties.of(Material.WOOD).strength(0.5F, 2.5F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> magic_log_bridge_stair = createBlock("magic_log_bridge_stair", () -> new Iron_Stair(BlockBehaviour.Properties.of(Material.WOOD).strength(0.5F, 2.5F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> mahogany_log_bridge_stair = createBlock("mahogany_log_bridge_stair", () -> new Iron_Stair(BlockBehaviour.Properties.of(Material.WOOD).strength(0.5F, 2.5F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> palm_log_bridge_stair = createBlock("palm_log_bridge_stair", () -> new Iron_Stair(BlockBehaviour.Properties.of(Material.WOOD).strength(0.5F, 2.5F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> redwood_log_bridge_stair = createBlock("redwood_log_bridge_stair", () -> new Iron_Stair(BlockBehaviour.Properties.of(Material.WOOD).strength(0.5F, 2.5F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> umbran_log_bridge_stair = createBlock("umbran_log_bridge_stair", () -> new Iron_Stair(BlockBehaviour.Properties.of(Material.WOOD).strength(0.5F, 2.5F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> willow_log_bridge_stair = createBlock("willow_log_bridge_stair", () -> new Iron_Stair(BlockBehaviour.Properties.of(Material.WOOD).strength(0.5F, 2.5F).sound(SoundType.WOOD)));
    
    //Rail
    public static final RegistryObject<Block> cherry_rail_bridge = createBlock("cherry_rail_bridge", () -> new Rail_Bridge(BlockBehaviour.Properties.of(Material.WOOD).noOcclusion().strength(0.5F, 2.5F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> dead_rail_bridge = createBlock("dead_rail_bridge", () -> new Rail_Bridge(BlockBehaviour.Properties.of(Material.WOOD).noOcclusion().strength(0.5F, 2.5F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> fir_rail_bridge = createBlock("fir_rail_bridge", () -> new Rail_Bridge(BlockBehaviour.Properties.of(Material.WOOD).noOcclusion().strength(0.5F, 2.5F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> hellbark_rail_bridge = createBlock("hellbark_rail_bridge", () -> new Rail_Bridge(BlockBehaviour.Properties.of(Material.WOOD).noOcclusion().strength(0.5F, 2.5F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> jacaranda_rail_bridge = createBlock("jacaranda_rail_bridge", () -> new Rail_Bridge(BlockBehaviour.Properties.of(Material.WOOD).noOcclusion().strength(0.5F, 2.5F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> magic_rail_bridge = createBlock("magic_rail_bridge", () -> new Rail_Bridge(BlockBehaviour.Properties.of(Material.WOOD).noOcclusion().strength(0.5F, 2.5F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> mahogany_rail_bridge = createBlock("mahogany_rail_bridge", () -> new Rail_Bridge(BlockBehaviour.Properties.of(Material.WOOD).noOcclusion().strength(0.5F, 2.5F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> palm_rail_bridge = createBlock("palm_rail_bridge", () -> new Rail_Bridge(BlockBehaviour.Properties.of(Material.WOOD).noOcclusion().strength(0.5F, 2.5F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> redwood_rail_bridge = createBlock("redwood_rail_bridge", () -> new Rail_Bridge(BlockBehaviour.Properties.of(Material.WOOD).noOcclusion().strength(0.5F, 2.5F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> umbran_rail_bridge = createBlock("umbran_rail_bridge", () -> new Rail_Bridge(BlockBehaviour.Properties.of(Material.WOOD).noOcclusion().strength(0.5F, 2.5F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> willow_rail_bridge = createBlock("willow_rail_bridge", () -> new Rail_Bridge(BlockBehaviour.Properties.of(Material.WOOD).noOcclusion().strength(0.5F, 2.5F).sound(SoundType.WOOD)));
    
    public static RegistryObject<Block> createBlock(String name, Supplier<? extends Block> supplier)
    {
        RegistryObject<Block> block = BLOCKS_REGISTRY.register(name, supplier);
        MBBOPItemsRegistry.ITEMS_REGISTRY.register(name, () -> new BlockItem(block.get(), new Item.Properties().tab(MacawsBridges.BridgesItemGroup)));
        return block;
    }
}