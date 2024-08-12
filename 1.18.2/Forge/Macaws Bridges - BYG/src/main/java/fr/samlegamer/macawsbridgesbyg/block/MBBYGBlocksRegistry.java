package fr.samlegamer.macawsbridgesbyg.block;

import fr.samlegamer.macawsbridgesbyg.MacawsBridgesBYG;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.ForgeRegistries;
import java.util.ArrayList;
import java.util.List;
import com.mcwbridges.kikoz.objects.Bridge_Stairs;
import com.mcwbridges.kikoz.objects.Log_Bridge;
import com.mcwbridges.kikoz.objects.Rail_Bridge;
import com.mcwbridges.kikoz.objects.Bridge_Block;
import com.mcwbridges.kikoz.objects.Bridge_Block_Rope;
import com.mcwbridges.kikoz.objects.Bridge_Support;
import com.mcwbridges.kikoz.util.BlockItemWithInfo;
import com.mcwbridges.kikoz.util.FuelBlockItemWithInfo;
import com.mcwbridges.kikoz.util.FuelItemBlock;

@Mod.EventBusSubscriber(modid = MacawsBridgesBYG.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class MBBYGBlocksRegistry
{
	private static final BlockBehaviour.Properties WOOD = BlockBehaviour.Properties.of(Material.WOOD).strength(0.5F, 2.5F).sound(SoundType.WOOD);
	private static final BlockBehaviour.Properties RAILS = BlockBehaviour.Properties.of(Material.WOOD).strength(0.5F, 2.5F).noOcclusion().sound(SoundType.WOOD);
	private static final BlockBehaviour.Properties STONE = BlockBehaviour.Properties.of(Material.STONE).strength(3.0F, 5.0F).sound(SoundType.STONE);

	public static Block aspen_log_bridge_middle, rope_aspen_bridge, aspen_bridge_pier, aspen_log_bridge_stair, aspen_rope_bridge_stair, aspen_rail_bridge;
	public static Block bridgeWoodObjAll, ropeWoodObjAll, PierWoodObjAll, StairWoodObjAll, RopeStairWoodObjAll, RailWoodObjAll;
	public static Block bridgesStoneAll, StairsStone, PierStone, BalustradeStone;
	
	@SubscribeEvent
	public static void registry(final RegistryEvent.Register<Block> event)
	{
		aspen_log_bridge_middle = registerBlock("aspen_log_bridge_middle", new Log_Bridge(WOOD));
		rope_aspen_bridge = registerBlock("rope_aspen_bridge", new Bridge_Block_Rope(WOOD));
		aspen_bridge_pier = registerBlock("aspen_bridge_pier", new Bridge_Support(WOOD));
		aspen_log_bridge_stair = registerBlock("aspen_log_bridge_stair", new Bridge_Stairs(WOOD));
		aspen_rope_bridge_stair = registerBlock("aspen_rope_bridge_stair", new Bridge_Stairs(WOOD));
		aspen_rail_bridge = registerBlock("aspen_rail_bridge", new Rail_Bridge(RAILS));

		List<String> MATERIAL = new ArrayList<>();
	    MATERIAL.add("baobab");
	    MATERIAL.add("blue_enchanted");
	    MATERIAL.add("cherry");
	    MATERIAL.add("cika");
	    MATERIAL.add("cypress");
	    MATERIAL.add("ebony");
	    MATERIAL.add("ether");
	    MATERIAL.add("fir");
	    MATERIAL.add("green_enchanted");
	    MATERIAL.add("holly");
	    MATERIAL.add("jacaranda");
	    MATERIAL.add("lament");
	    MATERIAL.add("mahogany");
	    MATERIAL.add("mangrove");
	    MATERIAL.add("maple");
	    MATERIAL.add("nightshade");
	    MATERIAL.add("palm");
	    MATERIAL.add("pine");
	    MATERIAL.add("rainbow_eucalyptus");
	    MATERIAL.add("redwood");
	    MATERIAL.add("skyris");
	    MATERIAL.add("willow");
	    MATERIAL.add("witch_hazel");
	    MATERIAL.add("zelkova");
	    MATERIAL.add("bulbis");
	    MATERIAL.add("imparius");
	    MATERIAL.add("sythian");
	    
	    for (String i : MATERIAL) {
	      bridgeWoodObjAll = registerBlock("" + i + "_log_bridge_middle", new Log_Bridge(WOOD));
	      ropeWoodObjAll = registerBlock("rope_" + i + "_bridge", new Bridge_Block_Rope(WOOD));
	      PierWoodObjAll = registerBlock("" + i + "_bridge_pier", new Bridge_Support(WOOD));
	      StairWoodObjAll = registerBlock("" + i + "_log_bridge_stair", new Bridge_Stairs(WOOD));
	      RopeStairWoodObjAll = registerBlock("" + i + "_rope_bridge_stair", new Bridge_Stairs(WOOD));
	      RailWoodObjAll = registerBlock("" + i + "_rail_bridge", new Rail_Bridge(RAILS));
	    }
	    
		List<String> MATERIAL_ROCK = new ArrayList<>();
		MATERIAL_ROCK.add("cryptic_stone");
		MATERIAL_ROCK.add("dacite_bricks");
		MATERIAL_ROCK.add("polished_travertine");
		MATERIAL_ROCK.add("purpur_stone");
		MATERIAL_ROCK.add("red_rock_bricks");
		MATERIAL_ROCK.add("scoria_stone_bricks");
		MATERIAL_ROCK.add("soapstone_bricks");
	    for (String i : MATERIAL_ROCK) {
	    	bridgesStoneAll = registerBlockStone(i+"_bridge", new Bridge_Block(STONE));
	    	StairsStone = registerBlockStone(i+"_bridge_pier", new Bridge_Support(STONE));
	    	PierStone = registerBlockStone(i+"_bridge_stair", new Bridge_Stairs(STONE));
	    	BalustradeStone = registerBlockStone("balustrade_"+i+"_bridge", new Bridge_Block(STONE));
	    }
	}
	
	public static Block registerBlock(String name, Block block)
    {
		BlockItem itemBlock;
        if(name.contains("log_bridge_middle") || name.startsWith("rope_")) {
    		itemBlock = new FuelBlockItemWithInfo(block, new Item.Properties().tab(MacawsBridgesBYG.CMT));
        }
        else {
    		itemBlock = new FuelItemBlock(block, new Item.Properties().tab(MacawsBridgesBYG.CMT));
        }
        block.setRegistryName(name);
        itemBlock.setRegistryName(name);
        ForgeRegistries.BLOCKS.register(block);
        ForgeRegistries.ITEMS.register(itemBlock);
        return block;
    }
	
	public static Block registerBlockStone(String name, Block block)
    {
		BlockItem itemBlock;
        if(name.endsWith("_bridge")) {
        	itemBlock = new BlockItemWithInfo(block, new Item.Properties().tab(MacawsBridgesBYG.CMT));
        }
        else {
        	itemBlock = new BlockItem(block, new Item.Properties().tab(MacawsBridgesBYG.CMT));
        }
        block.setRegistryName(name);
        itemBlock.setRegistryName(name);
        ForgeRegistries.BLOCKS.register(block);
        ForgeRegistries.ITEMS.register(itemBlock);
        return block;
    }
}