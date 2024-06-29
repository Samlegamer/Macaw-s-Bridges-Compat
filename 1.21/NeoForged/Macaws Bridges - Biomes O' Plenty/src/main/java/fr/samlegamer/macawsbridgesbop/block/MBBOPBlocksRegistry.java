package fr.samlegamer.macawsbridgesbop.block;

import com.google.common.base.Supplier;
import com.mcwbridges.kikoz.objects.Bridge_Stairs;
import com.mcwbridges.kikoz.objects.Log_Bridge;
import com.mcwbridges.kikoz.objects.Rail_Bridge;
import com.mcwbridges.kikoz.objects.Bridge_Block_Rope;
import com.mcwbridges.kikoz.objects.Bridge_Support;
import com.mcwbridges.kikoz.util.FuelItemBlock;
import fr.samlegamer.macawsbridgesbop.MacawsBridgesBOP;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

public class MBBOPBlocksRegistry
{
	public static final DeferredRegister.Blocks BLOCKS_REGISTRY = DeferredRegister.createBlocks(MacawsBridgesBOP.MODID);
	public static final DeferredRegister.Items ITEMS_REGISTRY = DeferredRegister.createItems(MacawsBridgesBOP.MODID);
	public static final DeferredRegister<CreativeModeTab> Item_Group = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, MacawsBridgesBOP.MODID);
    
    public static final DeferredHolder<CreativeModeTab, CreativeModeTab> MB_CT = Item_Group.register("tab_mbbop", () -> CreativeModeTab.builder().title((Component)Component.literal("Macaw's Bridges - BOP")).icon(()-> new ItemStack(MBBOPBlocksRegistry.redwood_log_bridge_middle.get())).build());
    
	public static final DeferredBlock<Block> dead_log_bridge_middle = createBlock("dead_log_bridge_middle", () -> new Log_Bridge(BlockBehaviour.Properties.of().strength(0.5F, 2.5F).sound(SoundType.WOOD)));
	public static final DeferredBlock<Block> fir_log_bridge_middle = createBlock("fir_log_bridge_middle", () -> new Log_Bridge(BlockBehaviour.Properties.of().strength(0.5F, 2.5F).sound(SoundType.WOOD)));
	public static final DeferredBlock<Block> hellbark_log_bridge_middle = createBlock("hellbark_log_bridge_middle", () -> new Log_Bridge(BlockBehaviour.Properties.of().strength(0.5F, 2.5F).sound(SoundType.WOOD)));
	public static final DeferredBlock<Block> jacaranda_log_bridge_middle = createBlock("jacaranda_log_bridge_middle", () -> new Log_Bridge(BlockBehaviour.Properties.of().strength(0.5F, 2.5F).sound(SoundType.WOOD)));
	public static final DeferredBlock<Block> magic_log_bridge_middle = createBlock("magic_log_bridge_middle", () -> new Log_Bridge(BlockBehaviour.Properties.of().strength(0.5F, 2.5F).sound(SoundType.WOOD)));
	public static final DeferredBlock<Block> mahogany_log_bridge_middle = createBlock("mahogany_log_bridge_middle", () -> new Log_Bridge(BlockBehaviour.Properties.of().strength(0.5F, 2.5F).sound(SoundType.WOOD)));
	public static final DeferredBlock<Block> palm_log_bridge_middle = createBlock("palm_log_bridge_middle", () -> new Log_Bridge(BlockBehaviour.Properties.of().strength(0.5F, 2.5F).sound(SoundType.WOOD)));
	public static final DeferredBlock<Block> redwood_log_bridge_middle = createBlock("redwood_log_bridge_middle", () -> new Log_Bridge(BlockBehaviour.Properties.of().strength(0.5F, 2.5F).sound(SoundType.WOOD)));
	public static final DeferredBlock<Block> umbran_log_bridge_middle = createBlock("umbran_log_bridge_middle", () -> new Log_Bridge(BlockBehaviour.Properties.of().strength(0.5F, 2.5F).sound(SoundType.WOOD)));
	public static final DeferredBlock<Block> willow_log_bridge_middle = createBlock("willow_log_bridge_middle", () -> new Log_Bridge(BlockBehaviour.Properties.of().strength(0.5F, 2.5F).sound(SoundType.WOOD)));
	public static final DeferredBlock<Block> empyreal_log_bridge_middle = createBlock("empyreal_log_bridge_middle", () -> new Log_Bridge(BlockBehaviour.Properties.of().strength(0.5F, 2.5F).sound(SoundType.WOOD)));

	public static final DeferredBlock<Block> dead_rail_bridge = createBlock("dead_rail_bridge", () -> new Rail_Bridge(BlockBehaviour.Properties.of().noOcclusion().strength(0.5F, 2.5F).sound(SoundType.WOOD)));
	public static final DeferredBlock<Block> fir_rail_bridge = createBlock("fir_rail_bridge", () -> new Rail_Bridge(BlockBehaviour.Properties.of().noOcclusion().strength(0.5F, 2.5F).sound(SoundType.WOOD)));
	public static final DeferredBlock<Block> hellbark_rail_bridge = createBlock("hellbark_rail_bridge", () -> new Rail_Bridge(BlockBehaviour.Properties.of().noOcclusion().strength(0.5F, 2.5F).sound(SoundType.WOOD)));
	public static final DeferredBlock<Block> jacaranda_rail_bridge = createBlock("jacaranda_rail_bridge", () -> new Rail_Bridge(BlockBehaviour.Properties.of().noOcclusion().strength(0.5F, 2.5F).sound(SoundType.WOOD)));
	public static final DeferredBlock<Block> magic_rail_bridge = createBlock("magic_rail_bridge", () -> new Rail_Bridge(BlockBehaviour.Properties.of().noOcclusion().strength(0.5F, 2.5F).sound(SoundType.WOOD)));
	public static final DeferredBlock<Block> mahogany_rail_bridge = createBlock("mahogany_rail_bridge", () -> new Rail_Bridge(BlockBehaviour.Properties.of().noOcclusion().strength(0.5F, 2.5F).sound(SoundType.WOOD)));
	public static final DeferredBlock<Block> palm_rail_bridge = createBlock("palm_rail_bridge", () -> new Rail_Bridge(BlockBehaviour.Properties.of().noOcclusion().strength(0.5F, 2.5F).sound(SoundType.WOOD)));
	public static final DeferredBlock<Block> redwood_rail_bridge = createBlock("redwood_rail_bridge", () -> new Rail_Bridge(BlockBehaviour.Properties.of().noOcclusion().strength(0.5F, 2.5F).sound(SoundType.WOOD)));
	public static final DeferredBlock<Block> umbran_rail_bridge = createBlock("umbran_rail_bridge", () -> new Rail_Bridge(BlockBehaviour.Properties.of().noOcclusion().strength(0.5F, 2.5F).sound(SoundType.WOOD)));
	public static final DeferredBlock<Block> willow_rail_bridge = createBlock("willow_rail_bridge", () -> new Rail_Bridge(BlockBehaviour.Properties.of().noOcclusion().strength(0.5F, 2.5F).sound(SoundType.WOOD)));
	public static final DeferredBlock<Block> empyreal_rail_bridge = createBlock("empyreal_rail_bridge", () -> new Rail_Bridge(BlockBehaviour.Properties.of().noOcclusion().strength(0.5F, 2.5F).sound(SoundType.WOOD)));

	public static final DeferredBlock<Block> dead_rope_bridge_stair = createBlock("dead_rope_bridge_stair", () -> new Bridge_Stairs(BlockBehaviour.Properties.of().strength(0.5F, 2.5F).sound(SoundType.WOOD)));
	public static final DeferredBlock<Block> fir_rope_bridge_stair = createBlock("fir_rope_bridge_stair", () -> new Bridge_Stairs(BlockBehaviour.Properties.of().strength(0.5F, 2.5F).sound(SoundType.WOOD)));
	public static final DeferredBlock<Block> hellbark_rope_bridge_stair = createBlock("hellbark_rope_bridge_stair", () -> new Bridge_Stairs(BlockBehaviour.Properties.of().strength(0.5F, 2.5F).sound(SoundType.WOOD)));
	public static final DeferredBlock<Block> jacaranda_rope_bridge_stair = createBlock("jacaranda_rope_bridge_stair", () -> new Bridge_Stairs(BlockBehaviour.Properties.of().strength(0.5F, 2.5F).sound(SoundType.WOOD)));
	public static final DeferredBlock<Block> magic_rope_bridge_stair = createBlock("magic_rope_bridge_stair", () -> new Bridge_Stairs(BlockBehaviour.Properties.of().strength(0.5F, 2.5F).sound(SoundType.WOOD)));
	public static final DeferredBlock<Block> mahogany_rope_bridge_stair = createBlock("mahogany_rope_bridge_stair", () -> new Bridge_Stairs(BlockBehaviour.Properties.of().strength(0.5F, 2.5F).sound(SoundType.WOOD)));
	public static final DeferredBlock<Block> palm_rope_bridge_stair = createBlock("palm_rope_bridge_stair", () -> new Bridge_Stairs(BlockBehaviour.Properties.of().strength(0.5F, 2.5F).sound(SoundType.WOOD)));
	public static final DeferredBlock<Block> redwood_rope_bridge_stair = createBlock("redwood_rope_bridge_stair", () -> new Bridge_Stairs(BlockBehaviour.Properties.of().strength(0.5F, 2.5F).sound(SoundType.WOOD)));
	public static final DeferredBlock<Block> umbran_rope_bridge_stair = createBlock("umbran_rope_bridge_stair", () -> new Bridge_Stairs(BlockBehaviour.Properties.of().strength(0.5F, 2.5F).sound(SoundType.WOOD)));
	public static final DeferredBlock<Block> willow_rope_bridge_stair = createBlock("willow_rope_bridge_stair", () -> new Bridge_Stairs(BlockBehaviour.Properties.of().strength(0.5F, 2.5F).sound(SoundType.WOOD)));
	public static final DeferredBlock<Block> empyreal_rope_bridge_stair = createBlock("empyreal_rope_bridge_stair", () -> new Bridge_Stairs(BlockBehaviour.Properties.of().strength(0.5F, 2.5F).sound(SoundType.WOOD)));

	public static final DeferredBlock<Block> dead_log_bridge_stair = createBlock("dead_log_bridge_stair", () -> new Bridge_Stairs(BlockBehaviour.Properties.of().strength(0.5F, 2.5F).sound(SoundType.WOOD)));
	public static final DeferredBlock<Block> fir_log_bridge_stair = createBlock("fir_log_bridge_stair", () -> new Bridge_Stairs(BlockBehaviour.Properties.of().strength(0.5F, 2.5F).sound(SoundType.WOOD)));
	public static final DeferredBlock<Block> hellbark_log_bridge_stair = createBlock("hellbark_log_bridge_stair", () -> new Bridge_Stairs(BlockBehaviour.Properties.of().strength(0.5F, 2.5F).sound(SoundType.WOOD)));
	public static final DeferredBlock<Block> jacaranda_log_bridge_stair = createBlock("jacaranda_log_bridge_stair", () -> new Bridge_Stairs(BlockBehaviour.Properties.of().strength(0.5F, 2.5F).sound(SoundType.WOOD)));
	public static final DeferredBlock<Block> magic_log_bridge_stair = createBlock("magic_log_bridge_stair", () -> new Bridge_Stairs(BlockBehaviour.Properties.of().strength(0.5F, 2.5F).sound(SoundType.WOOD)));
	public static final DeferredBlock<Block> mahogany_log_bridge_stair = createBlock("mahogany_log_bridge_stair", () -> new Bridge_Stairs(BlockBehaviour.Properties.of().strength(0.5F, 2.5F).sound(SoundType.WOOD)));
	public static final DeferredBlock<Block> palm_log_bridge_stair = createBlock("palm_log_bridge_stair", () -> new Bridge_Stairs(BlockBehaviour.Properties.of().strength(0.5F, 2.5F).sound(SoundType.WOOD)));
	public static final DeferredBlock<Block> redwood_log_bridge_stair = createBlock("redwood_log_bridge_stair", () -> new Bridge_Stairs(BlockBehaviour.Properties.of().strength(0.5F, 2.5F).sound(SoundType.WOOD)));
	public static final DeferredBlock<Block> umbran_log_bridge_stair = createBlock("umbran_log_bridge_stair", () -> new Bridge_Stairs(BlockBehaviour.Properties.of().strength(0.5F, 2.5F).sound(SoundType.WOOD)));
	public static final DeferredBlock<Block> willow_log_bridge_stair = createBlock("willow_log_bridge_stair", () -> new Bridge_Stairs(BlockBehaviour.Properties.of().strength(0.5F, 2.5F).sound(SoundType.WOOD)));
	public static final DeferredBlock<Block> empyreal_log_bridge_stair = createBlock("empyreal_log_bridge_stair", () -> new Bridge_Stairs(BlockBehaviour.Properties.of().strength(0.5F, 2.5F).sound(SoundType.WOOD)));

	public static final DeferredBlock<Block> dead_bridge_pier = createBlock("dead_bridge_pier", () -> new Bridge_Support(BlockBehaviour.Properties.of().strength(0.5F, 2.5F).sound(SoundType.WOOD)));
	public static final DeferredBlock<Block> fir_bridge_pier = createBlock("fir_bridge_pier", () -> new Bridge_Support(BlockBehaviour.Properties.of().strength(0.5F, 2.5F).sound(SoundType.WOOD)));
	public static final DeferredBlock<Block> hellbark_bridge_pier = createBlock("hellbark_bridge_pier", () -> new Bridge_Support(BlockBehaviour.Properties.of().strength(0.5F, 2.5F).sound(SoundType.WOOD)));
	public static final DeferredBlock<Block> jacaranda_bridge_pier = createBlock("jacaranda_bridge_pier", () -> new Bridge_Support(BlockBehaviour.Properties.of().strength(0.5F, 2.5F).sound(SoundType.WOOD)));
	public static final DeferredBlock<Block> magic_bridge_pier = createBlock("magic_bridge_pier", () -> new Bridge_Support(BlockBehaviour.Properties.of().strength(0.5F, 2.5F).sound(SoundType.WOOD)));
	public static final DeferredBlock<Block> mahogany_bridge_pier = createBlock("mahogany_bridge_pier", () -> new Bridge_Support(BlockBehaviour.Properties.of().strength(0.5F, 2.5F).sound(SoundType.WOOD)));
	public static final DeferredBlock<Block> palm_bridge_pier = createBlock("palm_bridge_pier", () -> new Bridge_Support(BlockBehaviour.Properties.of().strength(0.5F, 2.5F).sound(SoundType.WOOD)));
	public static final DeferredBlock<Block> redwood_bridge_pier = createBlock("redwood_bridge_pier", () -> new Bridge_Support(BlockBehaviour.Properties.of().strength(0.5F, 2.5F).sound(SoundType.WOOD)));
	public static final DeferredBlock<Block> umbran_bridge_pier = createBlock("umbran_bridge_pier", () -> new Bridge_Support(BlockBehaviour.Properties.of().strength(0.5F, 2.5F).sound(SoundType.WOOD)));
	public static final DeferredBlock<Block> willow_bridge_pier = createBlock("willow_bridge_pier", () -> new Bridge_Support(BlockBehaviour.Properties.of().strength(0.5F, 2.5F).sound(SoundType.WOOD)));
	public static final DeferredBlock<Block> empyreal_bridge_pier = createBlock("empyreal_bridge_pier", () -> new Bridge_Support(BlockBehaviour.Properties.of().strength(0.5F, 2.5F).sound(SoundType.WOOD)));

	public static final DeferredBlock<Block> rope_dead_bridge = createBlock("rope_dead_bridge", () -> new Bridge_Block_Rope(BlockBehaviour.Properties.of().strength(0.5F, 2.5F).sound(SoundType.WOOD)));
	public static final DeferredBlock<Block> rope_fir_bridge = createBlock("rope_fir_bridge", () -> new Bridge_Block_Rope(BlockBehaviour.Properties.of().strength(0.5F, 2.5F).sound(SoundType.WOOD)));
	public static final DeferredBlock<Block> rope_hellbark_bridge = createBlock("rope_hellbark_bridge", () -> new Bridge_Block_Rope(BlockBehaviour.Properties.of().strength(0.5F, 2.5F).sound(SoundType.WOOD)));
	public static final DeferredBlock<Block> rope_jacaranda_bridge = createBlock("rope_jacaranda_bridge", () -> new Bridge_Block_Rope(BlockBehaviour.Properties.of().strength(0.5F, 2.5F).sound(SoundType.WOOD)));
	public static final DeferredBlock<Block> rope_magic_bridge = createBlock("rope_magic_bridge", () -> new Bridge_Block_Rope(BlockBehaviour.Properties.of().strength(0.5F, 2.5F).sound(SoundType.WOOD)));
	public static final DeferredBlock<Block> rope_mahogany_bridge = createBlock("rope_mahogany_bridge", () -> new Bridge_Block_Rope(BlockBehaviour.Properties.of().strength(0.5F, 2.5F).sound(SoundType.WOOD)));
	public static final DeferredBlock<Block> rope_palm_bridge = createBlock("rope_palm_bridge", () -> new Bridge_Block_Rope(BlockBehaviour.Properties.of().strength(0.5F, 2.5F).sound(SoundType.WOOD)));
	public static final DeferredBlock<Block> rope_redwood_bridge = createBlock("rope_redwood_bridge", () -> new Bridge_Block_Rope(BlockBehaviour.Properties.of().strength(0.5F, 2.5F).sound(SoundType.WOOD)));
	public static final DeferredBlock<Block> rope_umbran_bridge = createBlock("rope_umbran_bridge", () -> new Bridge_Block_Rope(BlockBehaviour.Properties.of().strength(0.5F, 2.5F).sound(SoundType.WOOD)));
	public static final DeferredBlock<Block> rope_willow_bridge = createBlock("rope_willow_bridge", () -> new Bridge_Block_Rope(BlockBehaviour.Properties.of().strength(0.5F, 2.5F).sound(SoundType.WOOD)));
	public static final DeferredBlock<Block> rope_empyreal_bridge = createBlock("rope_empyreal_bridge", () -> new Bridge_Block_Rope(BlockBehaviour.Properties.of().strength(0.5F, 2.5F).sound(SoundType.WOOD)));

    public static DeferredBlock<Block> createBlock(String name, Supplier<? extends Block> supplier)
    {
        DeferredBlock<Block> block = BLOCKS_REGISTRY.register(name, supplier);
        ITEMS_REGISTRY.register(name, () -> new FuelItemBlock(block.get(), new Item.Properties()));
        return block;
    }
}