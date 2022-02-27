package fr.samlegamer.macawsbridgesbyg.block;

import java.util.ArrayList;
import java.util.function.Supplier;

import com.mcwbridges.kikoz.MacawsBridges;
import com.mcwbridges.kikoz.objects.Log_Bridge;
import com.mcwbridges.kikoz.objects.Rope_Bridge;
import com.mcwbridges.kikoz.objects.Iron_Stair;
import com.mcwbridges.kikoz.objects.Rail_Bridge;
import com.mcwbridges.kikoz.objects.Support_Pillar;

import fr.samlegamer.macawsbridgesbyg.MacawsBridgesBYG;
import fr.samlegamer.macawsbridgesbyg.item.MBBYGItemsRegistry;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class MBBYGBlocksRegistry
{
	public static final DeferredRegister<Block> BLOCKS_REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, MacawsBridgesBYG.MODID);

    //Bridge Stone
    public static final RegistryObject<Block> cryptic_stone_bridge = createBlock("cryptic_stone_bridge", () -> new Log_Bridge(AbstractBlock.Properties.of(Material.STONE).strength(3.0F, 5.0F).sound(SoundType.STONE)));
    public static final RegistryObject<Block> dacite_bricks_bridge = createBlock("dacite_bricks_bridge", () -> new Log_Bridge(AbstractBlock.Properties.of(Material.STONE).strength(3.0F, 5.0F).sound(SoundType.STONE)));
    public static final RegistryObject<Block> polished_travertine_bridge = createBlock("polished_travertine_bridge", () -> new Log_Bridge(AbstractBlock.Properties.of(Material.STONE).strength(3.0F, 5.0F).sound(SoundType.STONE)));
    public static final RegistryObject<Block> purpur_stone_bridge = createBlock("purpur_stone_bridge", () -> new Log_Bridge(AbstractBlock.Properties.of(Material.STONE).strength(3.0F, 5.0F).sound(SoundType.STONE)));
    public static final RegistryObject<Block> red_rock_bricks_bridge = createBlock("red_rock_bricks_bridge", () -> new Log_Bridge(AbstractBlock.Properties.of(Material.STONE).strength(3.0F, 5.0F).sound(SoundType.STONE)));
    public static final RegistryObject<Block> scoria_stone_bricks_bridge = createBlock("scoria_stone_bricks_bridge", () -> new Log_Bridge(AbstractBlock.Properties.of(Material.STONE).strength(3.0F, 5.0F).sound(SoundType.STONE)));
    public static final RegistryObject<Block> soapstone_bricks_bridge = createBlock("soapstone_bricks_bridge", () -> new Log_Bridge(AbstractBlock.Properties.of(Material.STONE).strength(3.0F, 5.0F).sound(SoundType.STONE)));
    
    //Bridge Pier Stone
    public static final RegistryObject<Block> cryptic_stone_bridge_pier = createBlock("cryptic_stone_bridge_pier", () -> new Support_Pillar(AbstractBlock.Properties.of(Material.STONE).strength(3.0F, 5.0F).sound(SoundType.STONE)));
    public static final RegistryObject<Block> dacite_bricks_bridge_pier = createBlock("dacite_bricks_bridge_pier", () -> new Support_Pillar(AbstractBlock.Properties.of(Material.STONE).strength(3.0F, 5.0F).sound(SoundType.STONE)));
    public static final RegistryObject<Block> polished_travertine_bridge_pier = createBlock("polished_travertine_bridge_pier", () -> new Support_Pillar(AbstractBlock.Properties.of(Material.STONE).strength(3.0F, 5.0F).sound(SoundType.STONE)));
    public static final RegistryObject<Block> purpur_stone_bridge_pier = createBlock("purpur_stone_bridge_pier", () -> new Support_Pillar(AbstractBlock.Properties.of(Material.STONE).strength(3.0F, 5.0F).sound(SoundType.STONE)));
    public static final RegistryObject<Block> red_rock_bricks_bridge_pier = createBlock("red_rock_bricks_bridge_pier", () -> new Support_Pillar(AbstractBlock.Properties.of(Material.STONE).strength(3.0F, 5.0F).sound(SoundType.STONE)));
    public static final RegistryObject<Block> scoria_stone_bricks_bridge_pier = createBlock("scoria_stone_bricks_bridge_pier", () -> new Support_Pillar(AbstractBlock.Properties.of(Material.STONE).strength(3.0F, 5.0F).sound(SoundType.STONE)));
    public static final RegistryObject<Block> soapstone_bricks_bridge_pier = createBlock("soapstone_bricks_bridge_pier", () -> new Support_Pillar(AbstractBlock.Properties.of(Material.STONE).strength(3.0F, 5.0F).sound(SoundType.STONE)));
    
    //Bridge Stair Stone
    public static final RegistryObject<Block> cryptic_stone_bridge_stair = createBlock("cryptic_stone_bridge_stair", () -> new Iron_Stair(AbstractBlock.Properties.of(Material.STONE).strength(3.0F, 5.0F).sound(SoundType.STONE)));
    public static final RegistryObject<Block> dacite_bricks_bridge_stair = createBlock("dacite_bricks_bridge_stair", () -> new Iron_Stair(AbstractBlock.Properties.of(Material.STONE).strength(3.0F, 5.0F).sound(SoundType.STONE)));
    public static final RegistryObject<Block> polished_travertine_bridge_stair = createBlock("polished_travertine_bridge_stair", () -> new Iron_Stair(AbstractBlock.Properties.of(Material.STONE).strength(3.0F, 5.0F).sound(SoundType.STONE)));
    public static final RegistryObject<Block> purpur_stone_bridge_stair = createBlock("purpur_stone_bridge_stair", () -> new Iron_Stair(AbstractBlock.Properties.of(Material.STONE).strength(3.0F, 5.0F).sound(SoundType.STONE)));
    public static final RegistryObject<Block> red_rock_bricks_bridge_stair = createBlock("red_rock_bricks_bridge_stair", () -> new Iron_Stair(AbstractBlock.Properties.of(Material.STONE).strength(3.0F, 5.0F).sound(SoundType.STONE)));
    public static final RegistryObject<Block> scoria_stone_bricks_bridge_stair = createBlock("scoria_stone_bricks_bridge_stair", () -> new Iron_Stair(AbstractBlock.Properties.of(Material.STONE).strength(3.0F, 5.0F).sound(SoundType.STONE)));
    public static final RegistryObject<Block> soapstone_bricks_bridge_stair = createBlock("soapstone_bricks_bridge_stair", () -> new Iron_Stair(AbstractBlock.Properties.of(Material.STONE).strength(3.0F, 5.0F).sound(SoundType.STONE)));
    
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
			bridgeWoodObjAll = createBlock(""+i+"_log_bridge_middle", () -> new Log_Bridge(AbstractBlock.Properties.of(Material.WOOD).strength(0.5F, 2.5F).sound(SoundType.WOOD)));
			ropeWoodObjAll = createBlock("rope_"+i+"_bridge", () -> new Rope_Bridge(AbstractBlock.Properties.of(Material.WOOD).strength(0.5F, 2.5F).sound(SoundType.WOOD)));
			PierWoodObjAll = createBlock(""+i+"_bridge_pier", () -> new Support_Pillar(AbstractBlock.Properties.of(Material.WOOD).strength(0.5F, 2.5F).sound(SoundType.WOOD)));
			StairWoodObjAll = createBlock(""+i+"_log_bridge_stair", () -> new Iron_Stair(AbstractBlock.Properties.of(Material.WOOD).strength(0.5F, 2.5F).sound(SoundType.WOOD)));
			RailWoodObjAll = createBlock(""+i+"_rail_bridge", () -> new Rail_Bridge(AbstractBlock.Properties.of(Material.WOOD).noOcclusion().strength(0.5F, 2.5F).sound(SoundType.WOOD)));
			RopeStairWoodObjAll = createBlock(""+i+"_rope_bridge_stair", () -> new Iron_Stair(AbstractBlock.Properties.of(Material.WOOD).strength(0.5F, 2.5F).sound(SoundType.WOOD)));
		}
	}
	
	public static RegistryObject<Block> createBlock(String name, Supplier<? extends Block> supplier)
    {
        RegistryObject<Block> block = BLOCKS_REGISTRY.register(name, supplier);
        MBBYGItemsRegistry.ITEMS_REGISTRY.register(name, () -> new BlockItem(block.get(), new Item.Properties().tab(MacawsBridges.BridgesItemGroup)));
        return block;
    }

}