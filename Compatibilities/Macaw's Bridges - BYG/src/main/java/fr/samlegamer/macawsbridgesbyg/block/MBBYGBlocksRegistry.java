package fr.samlegamer.macawsbridgesbyg.block;

import java.util.ArrayList;
import java.util.function.Supplier;

import com.mcwbridges.kikoz.MacawsBridges;
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
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class MBBYGBlocksRegistry
{
	public static final DeferredRegister<Block> BLOCKS_REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, MacawsBridgesBYG.MODID);
	public static final DeferredRegister<Item> ITEMS_REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, MacawsBridgesBYG.MODID);

    public static final RegistryObject<Block> cryptic_stone_bridge = addStone("cryptic_stone_bridge", () -> new Log_Bridge(BlockBehaviour.Properties.of(Material.STONE).strength(3.0F, 5.0F).sound(SoundType.STONE)));
    public static final RegistryObject<Block> dacite_bricks_bridge = addStone("dacite_bricks_bridge", () -> new Log_Bridge(BlockBehaviour.Properties.of(Material.STONE).strength(3.0F, 5.0F).sound(SoundType.STONE)));
    public static final RegistryObject<Block> polished_travertine_bridge = addStone("polished_travertine_bridge", () -> new Log_Bridge(BlockBehaviour.Properties.of(Material.STONE).strength(3.0F, 5.0F).sound(SoundType.STONE)));
    public static final RegistryObject<Block> purpur_stone_bridge = addStone("purpur_stone_bridge", () -> new Log_Bridge(BlockBehaviour.Properties.of(Material.STONE).strength(3.0F, 5.0F).sound(SoundType.STONE)));
    public static final RegistryObject<Block> red_rock_bricks_bridge = addStone("red_rock_bricks_bridge", () -> new Log_Bridge(BlockBehaviour.Properties.of(Material.STONE).strength(3.0F, 5.0F).sound(SoundType.STONE)));
    public static final RegistryObject<Block> scoria_stone_bricks_bridge = addStone("scoria_stone_bricks_bridge", () -> new Log_Bridge(BlockBehaviour.Properties.of(Material.STONE).strength(3.0F, 5.0F).sound(SoundType.STONE)));
    public static final RegistryObject<Block> soapstone_bricks_bridge = addStone("soapstone_bricks_bridge", () -> new Log_Bridge(BlockBehaviour.Properties.of(Material.STONE).strength(3.0F, 5.0F).sound(SoundType.STONE)));
    
    public static final RegistryObject<Block> cryptic_stone_bridge_pier = addStone("cryptic_stone_bridge_pier", () -> new Support_Pillar(BlockBehaviour.Properties.of(Material.STONE).strength(3.0F, 5.0F).sound(SoundType.STONE)));
    public static final RegistryObject<Block> dacite_bricks_bridge_pier = addStone("dacite_bricks_bridge_pier", () -> new Support_Pillar(BlockBehaviour.Properties.of(Material.STONE).strength(3.0F, 5.0F).sound(SoundType.STONE)));
    public static final RegistryObject<Block> polished_travertine_bridge_pier = addStone("polished_travertine_bridge_pier", () -> new Support_Pillar(BlockBehaviour.Properties.of(Material.STONE).strength(3.0F, 5.0F).sound(SoundType.STONE)));
    public static final RegistryObject<Block> purpur_stone_bridge_pier = addStone("purpur_stone_bridge_pier", () -> new Support_Pillar(BlockBehaviour.Properties.of(Material.STONE).strength(3.0F, 5.0F).sound(SoundType.STONE)));
    public static final RegistryObject<Block> red_rock_bricks_bridge_pier = addStone("red_rock_bricks_bridge_pier", () -> new Support_Pillar(BlockBehaviour.Properties.of(Material.STONE).strength(3.0F, 5.0F).sound(SoundType.STONE)));
    public static final RegistryObject<Block> scoria_stone_bricks_bridge_pier = addStone("scoria_stone_bricks_bridge_pier", () -> new Support_Pillar(BlockBehaviour.Properties.of(Material.STONE).strength(3.0F, 5.0F).sound(SoundType.STONE)));
    public static final RegistryObject<Block> soapstone_bricks_bridge_pier = addStone("soapstone_bricks_bridge_pier", () -> new Support_Pillar(BlockBehaviour.Properties.of(Material.STONE).strength(3.0F, 5.0F).sound(SoundType.STONE)));
    
    public static final RegistryObject<Block> cryptic_stone_bridge_stair = addStone("cryptic_stone_bridge_stair", () -> new Iron_Stair(BlockBehaviour.Properties.of(Material.STONE).strength(3.0F, 5.0F).sound(SoundType.STONE)));
    public static final RegistryObject<Block> dacite_bricks_bridge_stair = addStone("dacite_bricks_bridge_stair", () -> new Iron_Stair(BlockBehaviour.Properties.of(Material.STONE).strength(3.0F, 5.0F).sound(SoundType.STONE)));
    public static final RegistryObject<Block> polished_travertine_bridge_stair = addStone("polished_travertine_bridge_stair", () -> new Iron_Stair(BlockBehaviour.Properties.of(Material.STONE).strength(3.0F, 5.0F).sound(SoundType.STONE)));
    public static final RegistryObject<Block> purpur_stone_bridge_stair = addStone("purpur_stone_bridge_stair", () -> new Iron_Stair(BlockBehaviour.Properties.of(Material.STONE).strength(3.0F, 5.0F).sound(SoundType.STONE)));
    public static final RegistryObject<Block> red_rock_bricks_bridge_stair = addStone("red_rock_bricks_bridge_stair", () -> new Iron_Stair(BlockBehaviour.Properties.of(Material.STONE).strength(3.0F, 5.0F).sound(SoundType.STONE)));
    public static final RegistryObject<Block> scoria_stone_bricks_bridge_stair = addStone("scoria_stone_bricks_bridge_stair", () -> new Iron_Stair(BlockBehaviour.Properties.of(Material.STONE).strength(3.0F, 5.0F).sound(SoundType.STONE)));
    public static final RegistryObject<Block> soapstone_bricks_bridge_stair = addStone("soapstone_bricks_bridge_stair", () -> new Iron_Stair(BlockBehaviour.Properties.of(Material.STONE).strength(3.0F, 5.0F).sound(SoundType.STONE)));
    
	public static RegistryObject<Block> bridgeWoodObjAll, ropeWoodObjAll, PierWoodObjAll, StairWoodObjAll, RailWoodObjAll, RopeStairWoodObjAll;
	
	public static void registry()
	{
		ArrayList<String> MATERIAL = new ArrayList<String>();
		
		MATERIAL.add("aspen");
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

		for(String i : MATERIAL)
		{
			bridgeWoodObjAll = addWood(""+i+"_log_bridge_middle", () -> new Log_Bridge(BlockBehaviour.Properties.of(Material.WOOD).strength(0.5F, 2.5F).sound(SoundType.WOOD)));
			ropeWoodObjAll = addWood("rope_"+i+"_bridge", () -> new Rope_Bridge(BlockBehaviour.Properties.of(Material.WOOD).strength(0.5F, 2.5F).sound(SoundType.WOOD)));
			PierWoodObjAll = addWood(""+i+"_bridge_pier", () -> new Support_Pillar(BlockBehaviour.Properties.of(Material.WOOD).strength(0.5F, 2.5F).sound(SoundType.WOOD)));
			StairWoodObjAll = addWood(""+i+"_log_bridge_stair", () -> new Iron_Stair(BlockBehaviour.Properties.of(Material.WOOD).strength(0.5F, 2.5F).sound(SoundType.WOOD)));
			RailWoodObjAll = addWood(""+i+"_rail_bridge", () -> new Rail_Bridge(BlockBehaviour.Properties.of(Material.WOOD).noOcclusion().strength(0.5F, 2.5F).sound(SoundType.WOOD)));
			RopeStairWoodObjAll = addWood(""+i+"_rope_bridge_stair", () -> new Iron_Stair(BlockBehaviour.Properties.of(Material.WOOD).noOcclusion().strength(0.5F, 2.5F).sound(SoundType.WOOD)));
		}
	}
	
	public static RegistryObject<Block> addWood(String name, Supplier<? extends Block> supplier)
    {
        RegistryObject<Block> block = BLOCKS_REGISTRY.register(name, supplier);
        ITEMS_REGISTRY.register(name, () -> new FuelItemBlock(block.get(), new Item.Properties().tab(MacawsBridges.BridgesItemGroup)));
        return block;
    }
	
	public static RegistryObject<Block> addStone(String name, Supplier<? extends Block> supplier)
    {
        RegistryObject<Block> block = BLOCKS_REGISTRY.register(name, supplier);
        ITEMS_REGISTRY.register(name, () -> new BlockItem(block.get(), new Item.Properties().tab(MacawsBridges.BridgesItemGroup)));
        return block;
    }
}