package fr.samlegamer.mcwbridgesquark.block;

import java.util.ArrayList;

import com.google.common.base.Supplier;
import com.mcwbridges.kikoz.MacawsBridges;
import com.mcwbridges.kikoz.objects.Iron_Stair;
import com.mcwbridges.kikoz.objects.Log_Bridge;
import com.mcwbridges.kikoz.objects.Support_Pillar;
import fr.samlegamer.mcwbridgesquark.McwQuark;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class MBQBlocksRegistry
{
	public static final DeferredRegister<Block> BLOCKS_REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, McwQuark.MODID);    
	public static final DeferredRegister<Item> ITEMS_REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, McwQuark.MODID);
	
	//public static final RegistryObject<Block> LogBridgesAll;
	
    public static RegistryObject<Block> BridgesAll, PierBridgesAll, StairBridgesAll;
    
    public static void registry()
    {
    	ArrayList<String> MATERIAL = new ArrayList<String>();
    	
		MATERIAL.add("andesite");
		MATERIAL.add("calcite");
		MATERIAL.add("diorite");
		MATERIAL.add("dripstone");
		MATERIAL.add("jasper");
		MATERIAL.add("limestone");
		MATERIAL.add("myalite");
		MATERIAL.add("netherrack");
		MATERIAL.add("permafrost");
		MATERIAL.add("red_sandstone");
		MATERIAL.add("shale");
		MATERIAL.add("soul_sandstone");
		MATERIAL.add("tuff");

		for(String i : MATERIAL)
		{
			BridgesAll = createBlock(""+i+"_bricks_bridge", () -> new Log_Bridge(BlockBehaviour.Properties.of(Material.STONE).strength(3.0F, 5.0F).sound(SoundType.STONE)));
			PierBridgesAll = createBlock(""+i+"_bricks_bridge_pier", () -> new Support_Pillar(BlockBehaviour.Properties.of(Material.STONE).strength(3.0F, 5.0F).sound(SoundType.STONE)));
			StairBridgesAll = createBlock(""+i+"_bricks_bridge_stair", () -> new Iron_Stair(BlockBehaviour.Properties.of(Material.STONE).strength(3.0F, 5.0F).sound(SoundType.STONE)));
		}
    }
    
    public static RegistryObject<Block> createBlock(String name, Supplier<? extends Block> supplier)
    {
        RegistryObject<Block> block = BLOCKS_REGISTRY.register(name, supplier);
        ITEMS_REGISTRY.register(name, () -> new BlockItem(block.get(), new Item.Properties().tab(MacawsBridges.BridgesItemGroup)));
        return block;
    }
}