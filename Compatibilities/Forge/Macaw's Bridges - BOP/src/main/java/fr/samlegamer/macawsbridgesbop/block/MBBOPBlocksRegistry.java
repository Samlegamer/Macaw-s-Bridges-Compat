package fr.samlegamer.macawsbridgesbop.block;

import java.util.ArrayList;

import com.google.common.base.Supplier;
import com.mcwbridges.kikoz.MacawsBridges;
import com.mcwbridges.kikoz.objects.Iron_Stair;
import com.mcwbridges.kikoz.objects.Log_Bridge;
import com.mcwbridges.kikoz.objects.Rail_Bridge;
import com.mcwbridges.kikoz.objects.Rope_Bridge;
import com.mcwbridges.kikoz.objects.Support_Pillar;
import com.mcwbridges.kikoz.util.FuelItemBlock;
import fr.samlegamer.macawsbridgesbop.MacawsBridgesBOP;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.fmllegacy.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class MBBOPBlocksRegistry
{
	public static final DeferredRegister<Block> BLOCKS_REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, MacawsBridgesBOP.MODID);    
	public static final DeferredRegister<Item> ITEMS_REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, MacawsBridgesBOP.MODID);
	
    public static RegistryObject<Block> LogBridgesAll, RopeBridgesAll, PierBridgesAll, StairBridgesAll, RopeStairBridgesAll, RailBridgesAll;
    
    public static void registry()
    {
    	ArrayList<String> MATERIAL = new ArrayList<String>();
    	
		MATERIAL.add("cherry");
		MATERIAL.add("dead");
		MATERIAL.add("fir");
		MATERIAL.add("hellbark");
		MATERIAL.add("jacaranda");
		MATERIAL.add("magic");
		MATERIAL.add("mahogany");
		MATERIAL.add("palm");
		MATERIAL.add("redwood");
		MATERIAL.add("umbran");
		MATERIAL.add("willow");

		for(String i : MATERIAL)
		{
			LogBridgesAll = createBlock(""+i+"_log_bridge_middle", () -> new Log_Bridge(BlockBehaviour.Properties.of(Material.WOOD).strength(0.5F, 2.5F).sound(SoundType.WOOD)));
			RopeBridgesAll = createBlock("rope_"+i+"_bridge", () -> new Rope_Bridge(BlockBehaviour.Properties.of(Material.WOOD).strength(0.5F, 2.5F).sound(SoundType.WOOD)));
			PierBridgesAll = createBlock(""+i+"_bridge_pier", () -> new Support_Pillar(BlockBehaviour.Properties.of(Material.WOOD).strength(0.5F, 2.5F).sound(SoundType.WOOD)));
			StairBridgesAll = createBlock(""+i+"_log_bridge_stair", () -> new Iron_Stair(BlockBehaviour.Properties.of(Material.WOOD).strength(0.5F, 2.5F).sound(SoundType.WOOD)));
			RopeStairBridgesAll = createBlock(""+i+"_rope_bridge_stair", () -> new Iron_Stair(BlockBehaviour.Properties.of(Material.WOOD).noOcclusion().strength(0.5F, 2.5F).sound(SoundType.WOOD)));
			RailBridgesAll = createBlock(""+i+"_rail_bridge", () -> new Rail_Bridge(BlockBehaviour.Properties.of(Material.WOOD).noOcclusion().strength(0.5F, 2.5F).sound(SoundType.WOOD)));
		}
    }
    
    public static RegistryObject<Block> createBlock(String name, Supplier<? extends Block> supplier)
    {
        RegistryObject<Block> block = BLOCKS_REGISTRY.register(name, supplier);
        ITEMS_REGISTRY.register(name, () -> new FuelItemBlock(block.get(), new Item.Properties().tab(MacawsBridges.BridgesItemGroup)));
        return block;
    }
}