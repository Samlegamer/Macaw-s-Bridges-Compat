package fr.samlegamer.macawsbridgesbop.block;

import com.google.common.base.Supplier;
import com.mcwbridges.kikoz.objects.Bridge_Stairs;
import com.mcwbridges.kikoz.objects.Log_Bridge;
import com.mcwbridges.kikoz.objects.Rail_Bridge;
import com.mcwbridges.kikoz.objects.Bridge_Block_Rope;
import com.mcwbridges.kikoz.objects.Bridge_Support;
import com.mcwbridges.kikoz.util.FuelItemBlock;
import fr.samlegamer.macawsbridgesbop.MacawsBridgesBOP;
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
	public static final DeferredRegister<Item> ITEMS_REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, MacawsBridgesBOP.MODID);
	
	public static final RegistryObject<Block> cherry_log_bridge_middle = createBlock("cherry_log_bridge_middle", () -> new Log_Bridge(BlockBehaviour.Properties.of(Material.WOOD).strength(0.5F, 2.5F).sound(SoundType.WOOD)));
	public static final RegistryObject<Block> dead_log_bridge_middle = createBlock("dead_log_bridge_middle", () -> new Log_Bridge(BlockBehaviour.Properties.of(Material.WOOD).strength(0.5F, 2.5F).sound(SoundType.WOOD)));
	public static final RegistryObject<Block> fir_log_bridge_middle = createBlock("fir_log_bridge_middle", () -> new Log_Bridge(BlockBehaviour.Properties.of(Material.WOOD).strength(0.5F, 2.5F).sound(SoundType.WOOD)));
	public static final RegistryObject<Block> hellbark_log_bridge_middle = createBlock("hellbark_log_bridge_middle", () -> new Log_Bridge(BlockBehaviour.Properties.of(Material.WOOD).strength(0.5F, 2.5F).sound(SoundType.WOOD)));
	public static final RegistryObject<Block> jacaranda_log_bridge_middle = createBlock("jacaranda_log_bridge_middle", () -> new Log_Bridge(BlockBehaviour.Properties.of(Material.WOOD).strength(0.5F, 2.5F).sound(SoundType.WOOD)));
	public static final RegistryObject<Block> magic_log_bridge_middle = createBlock("magic_log_bridge_middle", () -> new Log_Bridge(BlockBehaviour.Properties.of(Material.WOOD).strength(0.5F, 2.5F).sound(SoundType.WOOD)));
	public static final RegistryObject<Block> mahogany_log_bridge_middle = createBlock("mahogany_log_bridge_middle", () -> new Log_Bridge(BlockBehaviour.Properties.of(Material.WOOD).strength(0.5F, 2.5F).sound(SoundType.WOOD)));
	public static final RegistryObject<Block> palm_log_bridge_middle = createBlock("palm_log_bridge_middle", () -> new Log_Bridge(BlockBehaviour.Properties.of(Material.WOOD).strength(0.5F, 2.5F).sound(SoundType.WOOD)));
	public static final RegistryObject<Block> redwood_log_bridge_middle = createBlock("redwood_log_bridge_middle", () -> new Log_Bridge(BlockBehaviour.Properties.of(Material.WOOD).strength(0.5F, 2.5F).sound(SoundType.WOOD)));
	public static final RegistryObject<Block> umbran_log_bridge_middle = createBlock("umbran_log_bridge_middle", () -> new Log_Bridge(BlockBehaviour.Properties.of(Material.WOOD).strength(0.5F, 2.5F).sound(SoundType.WOOD)));
	public static final RegistryObject<Block> willow_log_bridge_middle = createBlock("willow_log_bridge_middle", () -> new Log_Bridge(BlockBehaviour.Properties.of(Material.WOOD).strength(0.5F, 2.5F).sound(SoundType.WOOD)));

	public static final RegistryObject<Block> rope_cherry_bridge = createBlock("rope_cherry_bridge", () -> new Bridge_Block_Rope(BlockBehaviour.Properties.of(Material.WOOD).strength(0.5F, 2.5F).sound(SoundType.WOOD)));
	public static final RegistryObject<Block> rope_dead_bridge = createBlock("rope_dead_bridge", () -> new Bridge_Block_Rope(BlockBehaviour.Properties.of(Material.WOOD).strength(0.5F, 2.5F).sound(SoundType.WOOD)));
	public static final RegistryObject<Block> rope_fir_bridge = createBlock("rope_fir_bridge", () -> new Bridge_Block_Rope(BlockBehaviour.Properties.of(Material.WOOD).strength(0.5F, 2.5F).sound(SoundType.WOOD)));
	public static final RegistryObject<Block> rope_hellbark_bridge = createBlock("rope_hellbark_bridge", () -> new Bridge_Block_Rope(BlockBehaviour.Properties.of(Material.WOOD).strength(0.5F, 2.5F).sound(SoundType.WOOD)));
	public static final RegistryObject<Block> rope_jacaranda_bridge = createBlock("rope_jacaranda_bridge", () -> new Bridge_Block_Rope(BlockBehaviour.Properties.of(Material.WOOD).strength(0.5F, 2.5F).sound(SoundType.WOOD)));
	public static final RegistryObject<Block> rope_magic_bridge = createBlock("rope_magic_bridge", () -> new Bridge_Block_Rope(BlockBehaviour.Properties.of(Material.WOOD).strength(0.5F, 2.5F).sound(SoundType.WOOD)));
	public static final RegistryObject<Block> rope_mahogany_bridge = createBlock("rope_mahogany_bridge", () -> new Bridge_Block_Rope(BlockBehaviour.Properties.of(Material.WOOD).strength(0.5F, 2.5F).sound(SoundType.WOOD)));
	public static final RegistryObject<Block> rope_palm_bridge = createBlock("rope_palm_bridge", () -> new Bridge_Block_Rope(BlockBehaviour.Properties.of(Material.WOOD).strength(0.5F, 2.5F).sound(SoundType.WOOD)));
	public static final RegistryObject<Block> rope_redwood_bridge = createBlock("rope_redwood_bridge", () -> new Bridge_Block_Rope(BlockBehaviour.Properties.of(Material.WOOD).strength(0.5F, 2.5F).sound(SoundType.WOOD)));
	public static final RegistryObject<Block> rope_umbran_bridge = createBlock("rope_umbran_bridge", () -> new Bridge_Block_Rope(BlockBehaviour.Properties.of(Material.WOOD).strength(0.5F, 2.5F).sound(SoundType.WOOD)));
	public static final RegistryObject<Block> rope_willow_bridge = createBlock("rope_willow_bridge", () -> new Bridge_Block_Rope(BlockBehaviour.Properties.of(Material.WOOD).strength(0.5F, 2.5F).sound(SoundType.WOOD)));

	public static final RegistryObject<Block> cherry_bridge_pier = createBlock("cherry_bridge_pier", () -> new Bridge_Support(BlockBehaviour.Properties.of(Material.WOOD).strength(0.5F, 2.5F).sound(SoundType.WOOD)));
	public static final RegistryObject<Block> dead_bridge_pier = createBlock("dead_bridge_pier", () -> new Bridge_Support(BlockBehaviour.Properties.of(Material.WOOD).strength(0.5F, 2.5F).sound(SoundType.WOOD)));
	public static final RegistryObject<Block> fir_bridge_pier = createBlock("fir_bridge_pier", () -> new Bridge_Support(BlockBehaviour.Properties.of(Material.WOOD).strength(0.5F, 2.5F).sound(SoundType.WOOD)));
	public static final RegistryObject<Block> hellbark_bridge_pier = createBlock("hellbark_bridge_pier", () -> new Bridge_Support(BlockBehaviour.Properties.of(Material.WOOD).strength(0.5F, 2.5F).sound(SoundType.WOOD)));
	public static final RegistryObject<Block> jacaranda_bridge_pier = createBlock("jacaranda_bridge_pier", () -> new Bridge_Support(BlockBehaviour.Properties.of(Material.WOOD).strength(0.5F, 2.5F).sound(SoundType.WOOD)));
	public static final RegistryObject<Block> magic_bridge_pier = createBlock("magic_bridge_pier", () -> new Bridge_Support(BlockBehaviour.Properties.of(Material.WOOD).strength(0.5F, 2.5F).sound(SoundType.WOOD)));
	public static final RegistryObject<Block> mahogany_bridge_pier = createBlock("mahogany_bridge_pier", () -> new Bridge_Support(BlockBehaviour.Properties.of(Material.WOOD).strength(0.5F, 2.5F).sound(SoundType.WOOD)));
	public static final RegistryObject<Block> palm_bridge_pier = createBlock("palm_bridge_pier", () -> new Bridge_Support(BlockBehaviour.Properties.of(Material.WOOD).strength(0.5F, 2.5F).sound(SoundType.WOOD)));
	public static final RegistryObject<Block> redwood_bridge_pier = createBlock("redwood_bridge_pier", () -> new Bridge_Support(BlockBehaviour.Properties.of(Material.WOOD).strength(0.5F, 2.5F).sound(SoundType.WOOD)));
	public static final RegistryObject<Block> umbran_bridge_pier = createBlock("umbran_bridge_pier", () -> new Bridge_Support(BlockBehaviour.Properties.of(Material.WOOD).strength(0.5F, 2.5F).sound(SoundType.WOOD)));
	public static final RegistryObject<Block> willow_bridge_pier = createBlock("willow_bridge_pier", () -> new Bridge_Support(BlockBehaviour.Properties.of(Material.WOOD).strength(0.5F, 2.5F).sound(SoundType.WOOD)));

	public static final RegistryObject<Block> cherry_log_bridge_stair = createBlock("cherry_log_bridge_stair", () -> new Bridge_Stairs(BlockBehaviour.Properties.of(Material.WOOD).strength(0.5F, 2.5F).sound(SoundType.WOOD)));
	public static final RegistryObject<Block> dead_log_bridge_stair = createBlock("dead_log_bridge_stair", () -> new Bridge_Stairs(BlockBehaviour.Properties.of(Material.WOOD).strength(0.5F, 2.5F).sound(SoundType.WOOD)));
	public static final RegistryObject<Block> fir_log_bridge_stair = createBlock("fir_log_bridge_stair", () -> new Bridge_Stairs(BlockBehaviour.Properties.of(Material.WOOD).strength(0.5F, 2.5F).sound(SoundType.WOOD)));
	public static final RegistryObject<Block> hellbark_log_bridge_stair = createBlock("hellbark_log_bridge_stair", () -> new Bridge_Stairs(BlockBehaviour.Properties.of(Material.WOOD).strength(0.5F, 2.5F).sound(SoundType.WOOD)));
	public static final RegistryObject<Block> jacaranda_log_bridge_stair = createBlock("jacaranda_log_bridge_stair", () -> new Bridge_Stairs(BlockBehaviour.Properties.of(Material.WOOD).strength(0.5F, 2.5F).sound(SoundType.WOOD)));
	public static final RegistryObject<Block> magic_log_bridge_stair = createBlock("magic_log_bridge_stair", () -> new Bridge_Stairs(BlockBehaviour.Properties.of(Material.WOOD).strength(0.5F, 2.5F).sound(SoundType.WOOD)));
	public static final RegistryObject<Block> mahogany_log_bridge_stair = createBlock("mahogany_log_bridge_stair", () -> new Bridge_Stairs(BlockBehaviour.Properties.of(Material.WOOD).strength(0.5F, 2.5F).sound(SoundType.WOOD)));
	public static final RegistryObject<Block> palm_log_bridge_stair = createBlock("palm_log_bridge_stair", () -> new Bridge_Stairs(BlockBehaviour.Properties.of(Material.WOOD).strength(0.5F, 2.5F).sound(SoundType.WOOD)));
	public static final RegistryObject<Block> redwood_log_bridge_stair = createBlock("redwood_log_bridge_stair", () -> new Bridge_Stairs(BlockBehaviour.Properties.of(Material.WOOD).strength(0.5F, 2.5F).sound(SoundType.WOOD)));
	public static final RegistryObject<Block> umbran_log_bridge_stair = createBlock("umbran_log_bridge_stair", () -> new Bridge_Stairs(BlockBehaviour.Properties.of(Material.WOOD).strength(0.5F, 2.5F).sound(SoundType.WOOD)));
	public static final RegistryObject<Block> willow_log_bridge_stair = createBlock("willow_log_bridge_stair", () -> new Bridge_Stairs(BlockBehaviour.Properties.of(Material.WOOD).strength(0.5F, 2.5F).sound(SoundType.WOOD)));

	public static final RegistryObject<Block> cherry_rope_bridge_stair = createBlock("cherry_rope_bridge_stair", () -> new Bridge_Stairs(BlockBehaviour.Properties.of(Material.WOOD).strength(0.5F, 2.5F).sound(SoundType.WOOD)));
	public static final RegistryObject<Block> dead_rope_bridge_stair = createBlock("dead_rope_bridge_stair", () -> new Bridge_Stairs(BlockBehaviour.Properties.of(Material.WOOD).strength(0.5F, 2.5F).sound(SoundType.WOOD)));
	public static final RegistryObject<Block> fir_rope_bridge_stair = createBlock("fir_rope_bridge_stair", () -> new Bridge_Stairs(BlockBehaviour.Properties.of(Material.WOOD).strength(0.5F, 2.5F).sound(SoundType.WOOD)));
	public static final RegistryObject<Block> hellbark_rope_bridge_stair = createBlock("hellbark_rope_bridge_stair", () -> new Bridge_Stairs(BlockBehaviour.Properties.of(Material.WOOD).strength(0.5F, 2.5F).sound(SoundType.WOOD)));
	public static final RegistryObject<Block> jacaranda_rope_bridge_stair = createBlock("jacaranda_rope_bridge_stair", () -> new Bridge_Stairs(BlockBehaviour.Properties.of(Material.WOOD).strength(0.5F, 2.5F).sound(SoundType.WOOD)));
	public static final RegistryObject<Block> magic_rope_bridge_stair = createBlock("magic_rope_bridge_stair", () -> new Bridge_Stairs(BlockBehaviour.Properties.of(Material.WOOD).strength(0.5F, 2.5F).sound(SoundType.WOOD)));
	public static final RegistryObject<Block> mahogany_rope_bridge_stair = createBlock("mahogany_rope_bridge_stair", () -> new Bridge_Stairs(BlockBehaviour.Properties.of(Material.WOOD).strength(0.5F, 2.5F).sound(SoundType.WOOD)));
	public static final RegistryObject<Block> palm_rope_bridge_stair = createBlock("palm_rope_bridge_stair", () -> new Bridge_Stairs(BlockBehaviour.Properties.of(Material.WOOD).strength(0.5F, 2.5F).sound(SoundType.WOOD)));
	public static final RegistryObject<Block> redwood_rope_bridge_stair = createBlock("redwood_rope_bridge_stair", () -> new Bridge_Stairs(BlockBehaviour.Properties.of(Material.WOOD).strength(0.5F, 2.5F).sound(SoundType.WOOD)));
	public static final RegistryObject<Block> umbran_rope_bridge_stair = createBlock("umbran_rope_bridge_stair", () -> new Bridge_Stairs(BlockBehaviour.Properties.of(Material.WOOD).strength(0.5F, 2.5F).sound(SoundType.WOOD)));
	public static final RegistryObject<Block> willow_rope_bridge_stair = createBlock("willow_rope_bridge_stair", () -> new Bridge_Stairs(BlockBehaviour.Properties.of(Material.WOOD).strength(0.5F, 2.5F).sound(SoundType.WOOD)));

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
        ITEMS_REGISTRY.register(name, () -> new FuelItemBlock(block.get(), new Item.Properties()));
        return block;
    }
}