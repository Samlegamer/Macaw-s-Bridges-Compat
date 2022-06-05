package fr.samlegamer.macawsbridgesbyg.block;

import java.util.ArrayList;
import com.mcwbridges.kikoz.objects.Log_Bridge;
import com.mcwbridges.kikoz.objects.Rope_Bridge;
import com.mcwbridges.kikoz.objects.Iron_Stair;
import com.mcwbridges.kikoz.objects.Rail_Bridge;
import com.mcwbridges.kikoz.objects.Support_Pillar;
import com.mcwbridges.kikoz.util.FuelItemBlock;
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

@Mod.EventBusSubscriber(modid = MacawsBridgesBYG.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class MBBYGBlocksRegistry
{
	public static Block bridgeWoodObjAll, ropeWoodObjAll, PierWoodObjAll, StairWoodObjAll, RailWoodObjAll, RopeStairWoodObjAll;
    public static Block StoneBridges, StoneBridgesPier, StoneBridgesStairs;

	@SubscribeEvent
	public static void registry(final RegistryEvent.Register<Block> event)
	{
		ArrayList<String> WOOD = new ArrayList<String>();
		ArrayList<String> ROCK = new ArrayList<String>();
		
		WOOD.add("aspen");
		WOOD.add("baobab");
		WOOD.add("blue_enchanted");
		WOOD.add("cherry");
		WOOD.add("cika");
		WOOD.add("cypress");
		WOOD.add("ebony");
		WOOD.add("ether");
		WOOD.add("fir");
		WOOD.add("green_enchanted");
		WOOD.add("holly");
		WOOD.add("jacaranda");
		WOOD.add("lament");
		WOOD.add("mahogany");
		WOOD.add("mangrove");
		WOOD.add("maple");
		WOOD.add("nightshade");
		WOOD.add("palm");
		WOOD.add("pine");
		WOOD.add("rainbow_eucalyptus");
		WOOD.add("redwood");
		WOOD.add("skyris");
		WOOD.add("willow");
		WOOD.add("witch_hazel");
		WOOD.add("zelkova");
		WOOD.add("bulbis");
		WOOD.add("imparius");
		WOOD.add("sythian");
		ROCK.add("cryptic_stone");
		ROCK.add("dacite_bricks");
		ROCK.add("polished_travertine");
		ROCK.add("purpur_stone");
		ROCK.add("red_rock_bricks");
		ROCK.add("scoria_stone_bricks");
		ROCK.add("soapstone_bricks");

		for(String i : WOOD)
		{
			bridgeWoodObjAll = registerBlockFuel(new Log_Bridge(BlockBehaviour.Properties.of(Material.WOOD).strength(0.5F, 2.5F).sound(SoundType.WOOD)), ""+i+"_log_bridge_middle");
			ropeWoodObjAll = registerBlockFuel(new Rope_Bridge(BlockBehaviour.Properties.of(Material.WOOD).strength(0.5F, 2.5F).sound(SoundType.WOOD)), "rope_"+i+"_bridge");
			PierWoodObjAll = registerBlockFuel(new Support_Pillar(BlockBehaviour.Properties.of(Material.WOOD).strength(0.5F, 2.5F).sound(SoundType.WOOD)), ""+i+"_bridge_pier");
			StairWoodObjAll = registerBlockFuel(new Iron_Stair(BlockBehaviour.Properties.of(Material.WOOD).strength(0.5F, 2.5F).sound(SoundType.WOOD)), ""+i+"_log_bridge_stair");
			RailWoodObjAll = registerBlockFuel(new Rail_Bridge(BlockBehaviour.Properties.of(Material.WOOD).noOcclusion().strength(0.5F, 2.5F).sound(SoundType.WOOD)), ""+i+"_rail_bridge");
			RopeStairWoodObjAll = registerBlockFuel(new Iron_Stair(BlockBehaviour.Properties.of(Material.WOOD).strength(0.5F, 2.5F).sound(SoundType.WOOD)), ""+i+"_rope_bridge_stair");
		}
		
		for(String i : ROCK)
		{
			StoneBridges = registerBlock(new Log_Bridge(BlockBehaviour.Properties.of(Material.STONE).strength(3.0F, 5.0F).sound(SoundType.STONE)), ""+i+"_bridge");
			StoneBridgesPier = registerBlock(new Support_Pillar(BlockBehaviour.Properties.of(Material.STONE).strength(3.0F, 5.0F).sound(SoundType.STONE)), ""+i+"_bridge_pier");
			StoneBridgesStairs = registerBlock(new Iron_Stair(BlockBehaviour.Properties.of(Material.STONE).strength(3.0F, 5.0F).sound(SoundType.STONE)), ""+i+"_bridge_stair");
		}
	}
	
	public static Block registerBlock(Block block, String name)
    {
        BlockItem itemBlock = new BlockItem(block, new Item.Properties().tab(MacawsBridgesBYG.CMT));
        block.setRegistryName(name);
        itemBlock.setRegistryName(name);
        ForgeRegistries.BLOCKS.register(block);
        ForgeRegistries.ITEMS.register(itemBlock);
        return block;
    }
	
	public static Block registerBlockFuel(Block block, String name)
    {
        FuelItemBlock itemBlock = new FuelItemBlock(block, new Item.Properties().tab(MacawsBridgesBYG.CMT));
        block.setRegistryName(name);
        itemBlock.setRegistryName(name);
        ForgeRegistries.BLOCKS.register(block);
        ForgeRegistries.ITEMS.register(itemBlock);
        return block;
    }
}