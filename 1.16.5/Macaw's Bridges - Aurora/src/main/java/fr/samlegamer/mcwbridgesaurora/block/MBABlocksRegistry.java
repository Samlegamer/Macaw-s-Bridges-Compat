package fr.samlegamer.mcwbridgesaurora.block;

import com.google.common.base.Supplier;
import com.mcwbridges.kikoz.MacawsBridges;
import com.mcwbridges.kikoz.objects.Bridge_Stairs;
import com.mcwbridges.kikoz.objects.Log_Bridge;
import com.mcwbridges.kikoz.objects.Rail_Bridge;
import com.mcwbridges.kikoz.objects.Bridge_Block_Rope;
import com.mcwbridges.kikoz.objects.Bridge_Support;

import fr.samlegamer.mcwbridgesaurora.McwBridgesAurora;
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
	public static final DeferredRegister<Block> BLOCKS_REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, McwBridgesAurora.MODID);
	public static final DeferredRegister<Item> ITEMS_REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, McwBridgesAurora.MODID);	
	
	public static final RegistryObject<Block> cypress_log_bridge_middle = createBlock("bayou_blues", "cypress_log_bridge_middle", () -> new Log_Bridge(AbstractBlock.Properties.of(Material.WOOD).noOcclusion().strength(0.5F, 2.5F).harvestTool(ToolType.AXE).sound(SoundType.WOOD)));
	public static final RegistryObject<Block> cypress_rail_bridge = createBlock("bayou_blues", "cypress_rail_bridge", () -> new Rail_Bridge(AbstractBlock.Properties.of(Material.WOOD).noOcclusion().strength(0.5F, 2.5F).harvestTool(ToolType.AXE).sound(SoundType.WOOD)));
	public static final RegistryObject<Block> cypress_log_bridge_stair = createBlock("bayou_blues", "cypress_log_bridge_stair", () -> new Bridge_Stairs(AbstractBlock.Properties.of(Material.WOOD).noOcclusion().strength(0.5F, 2.5F).harvestTool(ToolType.AXE).sound(SoundType.WOOD)));
	public static final RegistryObject<Block> cypress_rope_bridge_stair = createBlock("bayou_blues", "cypress_rope_bridge_stair", () -> new Bridge_Stairs(AbstractBlock.Properties.of(Material.WOOD).noOcclusion().strength(0.5F, 2.5F).harvestTool(ToolType.AXE).sound(SoundType.WOOD)));
	public static final RegistryObject<Block> cypress_bridge_pier = createBlock("bayou_blues", "cypress_bridge_pier", () -> new Bridge_Support(AbstractBlock.Properties.of(Material.WOOD).noOcclusion().strength(0.5F, 2.5F).harvestTool(ToolType.AXE).sound(SoundType.WOOD)));
	public static final RegistryObject<Block> rope_cypress_bridge = createBlock("bayou_blues", "rope_cypress_bridge", () -> new Bridge_Block_Rope(AbstractBlock.Properties.of(Material.WOOD).noOcclusion().strength(0.5F, 2.5F).harvestTool(ToolType.AXE).sound(SoundType.WOOD)));

	public static final RegistryObject<Block> brown_mushroom_log_bridge_middle = createBlock("enhanced_mushrooms", "brown_mushroom_log_bridge_middle", () -> new Log_Bridge(AbstractBlock.Properties.of(Material.WOOD).strength(0.5F, 2.5F).harvestTool(ToolType.AXE).sound(SoundType.WOOD)));
	public static final RegistryObject<Block> red_mushroom_log_bridge_middle = createBlock("enhanced_mushrooms", "red_mushroom_log_bridge_middle", () -> new Log_Bridge(AbstractBlock.Properties.of(Material.WOOD).strength(0.5F, 2.5F).harvestTool(ToolType.AXE).sound(SoundType.WOOD)));
	public static final RegistryObject<Block> rope_brown_mushroom_bridge = createBlock("enhanced_mushrooms", "rope_brown_mushroom_bridge", () -> new Bridge_Block_Rope(AbstractBlock.Properties.of(Material.WOOD).strength(0.5F, 2.5F).harvestTool(ToolType.AXE).sound(SoundType.WOOD)));
	public static final RegistryObject<Block> rope_red_mushroom_bridge = createBlock("enhanced_mushrooms", "rope_red_mushroom_bridge", () -> new Bridge_Block_Rope(AbstractBlock.Properties.of(Material.WOOD).strength(0.5F, 2.5F).harvestTool(ToolType.AXE).sound(SoundType.WOOD)));
	public static final RegistryObject<Block> brown_mushroom_bridge_pier = createBlock("enhanced_mushrooms", "brown_mushroom_bridge_pier", () -> new Bridge_Support(AbstractBlock.Properties.of(Material.WOOD).strength(0.5F, 2.5F).harvestTool(ToolType.AXE).sound(SoundType.WOOD)));
	public static final RegistryObject<Block> red_mushroom_bridge_pier = createBlock("enhanced_mushrooms", "red_mushroom_bridge_pier", () -> new Bridge_Support(AbstractBlock.Properties.of(Material.WOOD).strength(0.5F, 2.5F).harvestTool(ToolType.AXE).sound(SoundType.WOOD)));
	public static final RegistryObject<Block> brown_mushroom_log_bridge_stair = createBlock("enhanced_mushrooms", "brown_mushroom_log_bridge_stair", () -> new Bridge_Stairs(AbstractBlock.Properties.of(Material.WOOD).strength(0.5F, 2.5F).harvestTool(ToolType.AXE).sound(SoundType.WOOD)));
	public static final RegistryObject<Block> red_mushroom_log_bridge_stair = createBlock("enhanced_mushrooms", "red_mushroom_log_bridge_stair", () -> new Bridge_Stairs(AbstractBlock.Properties.of(Material.WOOD).strength(0.5F, 2.5F).harvestTool(ToolType.AXE).sound(SoundType.WOOD)));
	public static final RegistryObject<Block> brown_mushroom_rope_bridge_stair = createBlock("enhanced_mushrooms", "brown_mushroom_rope_bridge_stair", () -> new Bridge_Stairs(AbstractBlock.Properties.of(Material.WOOD).strength(0.5F, 2.5F).harvestTool(ToolType.AXE).sound(SoundType.WOOD)));
	public static final RegistryObject<Block> red_mushroom_rope_bridge_stair = createBlock("enhanced_mushrooms", "red_mushroom_rope_bridge_stair", () -> new Bridge_Stairs(AbstractBlock.Properties.of(Material.WOOD).strength(0.5F, 2.5F).harvestTool(ToolType.AXE).sound(SoundType.WOOD)));
	public static final RegistryObject<Block> brown_mushroom_rail_bridge = createBlock("enhanced_mushrooms", "brown_mushroom_rail_bridge", () -> new Rail_Bridge(AbstractBlock.Properties.of(Material.WOOD).noOcclusion().strength(0.5F, 2.5F).harvestTool(ToolType.AXE).sound(SoundType.WOOD)));
	public static final RegistryObject<Block> red_mushroom_rail_bridge = createBlock("enhanced_mushrooms", "red_mushroom_rail_bridge", () -> new Rail_Bridge(AbstractBlock.Properties.of(Material.WOOD).noOcclusion().strength(0.5F, 2.5F).harvestTool(ToolType.AXE).sound(SoundType.WOOD)));
	
	public static RegistryObject<Block> createBlock(String modid, String name, Supplier<? extends Block> supplier)
    {
        RegistryObject<Block> block = BLOCKS_REGISTRY.register(name, supplier);
        if(ModList.get().isLoaded(modid))
        {
            ITEMS_REGISTRY.register(name, () -> new BlockItem(block.get(), new Item.Properties().tab(MacawsBridges.BridgeItemGroup)));
        }
        return block;
    }
}