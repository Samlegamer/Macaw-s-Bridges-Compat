package fr.samlegamer.mcwbridgesaurora.block;

import java.util.Random;
import com.google.common.base.Supplier;
import com.mcwbridges.kikoz.init.BlockInit;
import com.mcwbridges.kikoz.objects.Bridge_Stairs;
import com.mcwbridges.kikoz.objects.Log_Bridge;
import com.mcwbridges.kikoz.objects.Rail_Bridge;
import com.mcwbridges.kikoz.objects.Bridge_Block_Rope;
import com.mcwbridges.kikoz.objects.Bridge_Support;
import com.mcwbridges.kikoz.util.FuelItemBlock;
import fr.samlegamer.mcwbridgesaurora.McwBridgesAurora;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.fml.ModList;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class MBABlocksRegistry
{
	public static final DeferredRegister<Block> BLOCKS_REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, McwBridgesAurora.MODID);
	public static final DeferredRegister<Item> ITEMS_REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, McwBridgesAurora.MODID);	
	public static final DeferredRegister<CreativeModeTab> Item_Group = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, McwBridgesAurora.MODID);
	
	public static final RegistryObject<CreativeModeTab> MBA_CT = Item_Group.register("tab_mbaurora", () -> CreativeModeTab.builder()
            .withTabsBefore(CreativeModeTabs.COMBAT)
			.title((Component)Component.literal("Macaw's Bridges - Aurora"))
			.icon(() -> new ItemStack(randomBlock()))
            .withLabelColor(0x0000FF)
			.noScrollBar().alignedRight().displayItems((parameters, output) -> {
				if(ModList.get().isLoaded("bayou_blues"))
				{
					 output.accept(MBABlocksRegistry.cypress_log_bridge_middle.get());
	
		    		 output.accept(MBABlocksRegistry.rope_cypress_bridge.get());
	
		    		 output.accept(MBABlocksRegistry.cypress_bridge_pier.get());
	
		    		 output.accept(MBABlocksRegistry.cypress_log_bridge_stair.get());
	
		    		 output.accept(MBABlocksRegistry.cypress_rope_bridge_stair.get());
	
		    		 output.accept(MBABlocksRegistry.cypress_rail_bridge.get());
				}
				
				if(ModList.get().isLoaded("enhanced_mushrooms"))
				{
		    		 /*output.accept(MBABlocksRegistry.red_mushroom_log_bridge_middle.get());

		    		 output.accept(MBABlocksRegistry.rope_red_mushroom_bridge.get());

		    		 output.accept(MBABlocksRegistry.red_mushroom_bridge_pier.get());

		    		 output.accept(MBABlocksRegistry.red_mushroom_log_bridge_stair.get());

		    		 output.accept(MBABlocksRegistry.red_mushroom_rope_bridge_stair.get());

		    		 output.accept(MBABlocksRegistry.red_mushroom_rail_bridge.get());*/

		    		 output.accept(MBABlocksRegistry.mushroom_log_bridge_middle.get());

		    		 output.accept(MBABlocksRegistry.rope_mushroom_bridge.get());

		    		 output.accept(MBABlocksRegistry.mushroom_bridge_pier.get());

		    		 output.accept(MBABlocksRegistry.mushroom_log_bridge_stair.get());

		    		 output.accept(MBABlocksRegistry.mushroom_rope_bridge_stair.get());

		    		 output.accept(MBABlocksRegistry.mushroom_rail_bridge.get());
				}
			}).build());
    
	public static final RegistryObject<Block> cypress_log_bridge_middle = createBlock("bayou_blues", "cypress_log_bridge_middle", () -> new Log_Bridge(BlockBehaviour.Properties.of().noOcclusion().strength(0.5F, 2.5F).sound(SoundType.WOOD)));
	public static final RegistryObject<Block> cypress_rail_bridge = createBlock("bayou_blues", "cypress_rail_bridge", () -> new Rail_Bridge(BlockBehaviour.Properties.of().noOcclusion().strength(0.5F, 2.5F).sound(SoundType.WOOD)));
	public static final RegistryObject<Block> cypress_log_bridge_stair = createBlock("bayou_blues", "cypress_log_bridge_stair", () -> new Bridge_Stairs(BlockBehaviour.Properties.of().noOcclusion().strength(0.5F, 2.5F).sound(SoundType.WOOD)));
	public static final RegistryObject<Block> cypress_rope_bridge_stair = createBlock("bayou_blues", "cypress_rope_bridge_stair", () -> new Bridge_Stairs(BlockBehaviour.Properties.of().noOcclusion().strength(0.5F, 2.5F).sound(SoundType.WOOD)));
	public static final RegistryObject<Block> cypress_bridge_pier = createBlock("bayou_blues", "cypress_bridge_pier", () -> new Bridge_Support(BlockBehaviour.Properties.of().noOcclusion().strength(0.5F, 2.5F).sound(SoundType.WOOD)));
	public static final RegistryObject<Block> rope_cypress_bridge = createBlock("bayou_blues", "rope_cypress_bridge", () -> new Bridge_Block_Rope(BlockBehaviour.Properties.of().noOcclusion().strength(0.5F, 2.5F).sound(SoundType.WOOD)));

	public static final RegistryObject<Block> mushroom_log_bridge_middle = createBlock("enhanced_mushrooms", "mushroom_log_bridge_middle", () -> new Log_Bridge(BlockBehaviour.Properties.of().strength(0.5F, 2.5F).sound(SoundType.WOOD)));
	//public static final RegistryObject<Block> red_mushroom_log_bridge_middle = createBlock("enhanced_mushrooms", "red_mushroom_log_bridge_middle", () -> new Log_Bridge(BlockBehaviour.Properties.of().strength(0.5F, 2.5F).sound(SoundType.WOOD)));
	public static final RegistryObject<Block> rope_mushroom_bridge = createBlock("enhanced_mushrooms", "rope_mushroom_bridge", () -> new Bridge_Block_Rope(BlockBehaviour.Properties.of().strength(0.5F, 2.5F).sound(SoundType.WOOD)));
	//public static final RegistryObject<Block> rope_red_mushroom_bridge = createBlock("enhanced_mushrooms", "rope_red_mushroom_bridge", () -> new Bridge_Block_Rope(BlockBehaviour.Properties.of().strength(0.5F, 2.5F).sound(SoundType.WOOD)));
	public static final RegistryObject<Block> mushroom_bridge_pier = createBlock("enhanced_mushrooms", "mushroom_bridge_pier", () -> new Bridge_Support(BlockBehaviour.Properties.of().strength(0.5F, 2.5F).sound(SoundType.WOOD)));
	//public static final RegistryObject<Block> red_mushroom_bridge_pier = createBlock("enhanced_mushrooms", "red_mushroom_bridge_pier", () -> new Bridge_Support(BlockBehaviour.Properties.of().strength(0.5F, 2.5F).sound(SoundType.WOOD)));
	public static final RegistryObject<Block> mushroom_log_bridge_stair = createBlock("enhanced_mushrooms", "mushroom_log_bridge_stair", () -> new Bridge_Stairs(BlockBehaviour.Properties.of().strength(0.5F, 2.5F).sound(SoundType.WOOD)));
	//public static final RegistryObject<Block> red_mushroom_log_bridge_stair = createBlock("enhanced_mushrooms", "red_mushroom_log_bridge_stair", () -> new Bridge_Stairs(BlockBehaviour.Properties.of().strength(0.5F, 2.5F).sound(SoundType.WOOD)));
	public static final RegistryObject<Block> mushroom_rope_bridge_stair = createBlock("enhanced_mushrooms", "mushroom_rope_bridge_stair", () -> new Bridge_Stairs(BlockBehaviour.Properties.of().strength(0.5F, 2.5F).sound(SoundType.WOOD)));
	//public static final RegistryObject<Block> red_mushroom_rope_bridge_stair = createBlock("enhanced_mushrooms", "red_mushroom_rope_bridge_stair", () -> new Bridge_Stairs(BlockBehaviour.Properties.of().strength(0.5F, 2.5F).sound(SoundType.WOOD)));
	public static final RegistryObject<Block> mushroom_rail_bridge = createBlock("enhanced_mushrooms", "mushroom_rail_bridge", () -> new Rail_Bridge(BlockBehaviour.Properties.of().noOcclusion().strength(0.5F, 2.5F).sound(SoundType.WOOD)));
	//public static final RegistryObject<Block> red_mushroom_rail_bridge = createBlock("enhanced_mushrooms", "red_mushroom_rail_bridge", () -> new Rail_Bridge(BlockBehaviour.Properties.of().noOcclusion().strength(0.5F, 2.5F).sound(SoundType.WOOD)));
	
	public static RegistryObject<Block> createBlock(String modid, String name, Supplier<? extends Block> supplier)
    {
        RegistryObject<Block> block = BLOCKS_REGISTRY.register(name, supplier);
        if(ModList.get().isLoaded(modid))
        {
            ITEMS_REGISTRY.register(name, () -> new FuelItemBlock(block.get(), new Item.Properties()));
        }
        return block;
    }
	
	private static ItemLike randomBlock()
	{
		Random rnd = new Random();
		
		if(ModList.get().isLoaded("bayou_blues") && !ModList.get().isLoaded("enhanced_mushrooms"))
		{
			return MBABlocksRegistry.cypress_log_bridge_middle.get();
		}
		else if(!ModList.get().isLoaded("bayou_blues") && ModList.get().isLoaded("enhanced_mushrooms"))
		{
			return MBABlocksRegistry.mushroom_log_bridge_middle.get();
		}
		else if(ModList.get().isLoaded("bayou_blues") && ModList.get().isLoaded("enhanced_mushrooms"))
		{
			int i = rnd.nextInt(0, 1);
			if(i==0)
			{
				return MBABlocksRegistry.cypress_log_bridge_middle.get();
			}
			else
			{
				return MBABlocksRegistry.mushroom_log_bridge_middle.get();
			}
		}
		return BlockInit.OAK_LOG_BRIDGE_MIDDLE.get();
	}
}