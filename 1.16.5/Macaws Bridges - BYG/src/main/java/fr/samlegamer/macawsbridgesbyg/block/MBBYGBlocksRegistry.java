package fr.samlegamer.macawsbridgesbyg.block;

import fr.samlegamer.macawsbridgesbyg.MacawsBridgesBYG;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import com.google.common.base.Supplier;
import com.mcwbridges.kikoz.objects.Bridge_Stairs;
import com.mcwbridges.kikoz.objects.Log_Bridge;
import com.mcwbridges.kikoz.objects.Rail_Bridge;
import com.mcwbridges.kikoz.objects.Bridge_Block_Rope;
import com.mcwbridges.kikoz.objects.Bridge_Support;
import com.mcwbridges.kikoz.util.FuelItemBlock;

public class MBBYGBlocksRegistry
{
	public static final DeferredRegister<Block> BLOCKS_REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, MacawsBridgesBYG.MODID);    
	public static final DeferredRegister<Item> ITEMS_REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, MacawsBridgesBYG.MODID);

	public static final RegistryObject<Block> aspen_log_bridge_middle = createBlock("aspen_log_bridge_middle", () -> new Log_Bridge(AbstractBlock.Properties.of(Material.WOOD).strength(0.5F, 2.5F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> baobab_log_bridge_middle = createBlock("baobab_log_bridge_middle", () -> new Log_Bridge(AbstractBlock.Properties.of(Material.WOOD).strength(0.5F, 2.5F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> blue_enchanted_log_bridge_middle = createBlock("blue_enchanted_log_bridge_middle", () -> new Log_Bridge(AbstractBlock.Properties.of(Material.WOOD).strength(0.5F, 2.5F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> cherry_log_bridge_middle = createBlock("cherry_log_bridge_middle", () -> new Log_Bridge(AbstractBlock.Properties.of(Material.WOOD).strength(0.5F, 2.5F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> cika_log_bridge_middle = createBlock("cika_log_bridge_middle", () -> new Log_Bridge(AbstractBlock.Properties.of(Material.WOOD).strength(0.5F, 2.5F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> cypress_log_bridge_middle = createBlock("cypress_log_bridge_middle", () -> new Log_Bridge(AbstractBlock.Properties.of(Material.WOOD).strength(0.5F, 2.5F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> ebony_log_bridge_middle = createBlock("ebony_log_bridge_middle", () -> new Log_Bridge(AbstractBlock.Properties.of(Material.WOOD).strength(0.5F, 2.5F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> ether_log_bridge_middle = createBlock("ether_log_bridge_middle", () -> new Log_Bridge(AbstractBlock.Properties.of(Material.WOOD).strength(0.5F, 2.5F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> fir_log_bridge_middle = createBlock("fir_log_bridge_middle", () -> new Log_Bridge(AbstractBlock.Properties.of(Material.WOOD).strength(0.5F, 2.5F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> green_enchanted_log_bridge_middle = createBlock("green_enchanted_log_bridge_middle", () -> new Log_Bridge(AbstractBlock.Properties.of(Material.WOOD).strength(0.5F, 2.5F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> holly_log_bridge_middle = createBlock("holly_log_bridge_middle", () -> new Log_Bridge(AbstractBlock.Properties.of(Material.WOOD).strength(0.5F, 2.5F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> jacaranda_log_bridge_middle = createBlock("jacaranda_log_bridge_middle", () -> new Log_Bridge(AbstractBlock.Properties.of(Material.WOOD).strength(0.5F, 2.5F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> lament_log_bridge_middle = createBlock("lament_log_bridge_middle", () -> new Log_Bridge(AbstractBlock.Properties.of(Material.WOOD).strength(0.5F, 2.5F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> mahogany_log_bridge_middle = createBlock("mahogany_log_bridge_middle", () -> new Log_Bridge(AbstractBlock.Properties.of(Material.WOOD).strength(0.5F, 2.5F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> mangrove_log_bridge_middle = createBlock("mangrove_log_bridge_middle", () -> new Log_Bridge(AbstractBlock.Properties.of(Material.WOOD).strength(0.5F, 2.5F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> maple_log_bridge_middle = createBlock("maple_log_bridge_middle", () -> new Log_Bridge(AbstractBlock.Properties.of(Material.WOOD).strength(0.5F, 2.5F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> nightshade_log_bridge_middle = createBlock("nightshade_log_bridge_middle", () -> new Log_Bridge(AbstractBlock.Properties.of(Material.WOOD).strength(0.5F, 2.5F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> palm_log_bridge_middle = createBlock("palm_log_bridge_middle", () -> new Log_Bridge(AbstractBlock.Properties.of(Material.WOOD).strength(0.5F, 2.5F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> pine_log_bridge_middle = createBlock("pine_log_bridge_middle", () -> new Log_Bridge(AbstractBlock.Properties.of(Material.WOOD).strength(0.5F, 2.5F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> rainbow_eucalyptus_log_bridge_middle = createBlock("rainbow_eucalyptus_log_bridge_middle", () -> new Log_Bridge(AbstractBlock.Properties.of(Material.WOOD).strength(0.5F, 2.5F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> redwood_log_bridge_middle = createBlock("redwood_log_bridge_middle", () -> new Log_Bridge(AbstractBlock.Properties.of(Material.WOOD).strength(0.5F, 2.5F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> skyris_log_bridge_middle = createBlock("skyris_log_bridge_middle", () -> new Log_Bridge(AbstractBlock.Properties.of(Material.WOOD).strength(0.5F, 2.5F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> willow_log_bridge_middle = createBlock("willow_log_bridge_middle", () -> new Log_Bridge(AbstractBlock.Properties.of(Material.WOOD).strength(0.5F, 2.5F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> witch_hazel_log_bridge_middle = createBlock("witch_hazel_log_bridge_middle", () -> new Log_Bridge(AbstractBlock.Properties.of(Material.WOOD).strength(0.5F, 2.5F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> zelkova_log_bridge_middle = createBlock("zelkova_log_bridge_middle", () -> new Log_Bridge(AbstractBlock.Properties.of(Material.WOOD).strength(0.5F, 2.5F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> bulbis_log_bridge_middle = createBlock("bulbis_log_bridge_middle", () -> new Log_Bridge(AbstractBlock.Properties.of(Material.WOOD).strength(0.5F, 2.5F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> imparius_log_bridge_middle = createBlock("imparius_log_bridge_middle", () -> new Log_Bridge(AbstractBlock.Properties.of(Material.WOOD).strength(0.5F, 2.5F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> sythian_log_bridge_middle = createBlock("sythian_log_bridge_middle", () -> new Log_Bridge(AbstractBlock.Properties.of(Material.WOOD).strength(0.5F, 2.5F).sound(SoundType.WOOD)));

    public static final RegistryObject<Block> rope_aspen_bridge = createBlock("rope_aspen_bridge", () -> new Bridge_Block_Rope(AbstractBlock.Properties.of(Material.WOOD).strength(0.5F, 2.5F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> rope_baobab_bridge = createBlock("rope_baobab_bridge", () -> new Bridge_Block_Rope(AbstractBlock.Properties.of(Material.WOOD).strength(0.5F, 2.5F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> rope_blue_enchanted_bridge = createBlock("rope_blue_enchanted_bridge", () -> new Bridge_Block_Rope(AbstractBlock.Properties.of(Material.WOOD).strength(0.5F, 2.5F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> rope_cherry_bridge = createBlock("rope_cherry_bridge", () -> new Bridge_Block_Rope(AbstractBlock.Properties.of(Material.WOOD).strength(0.5F, 2.5F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> rope_cika_bridge = createBlock("rope_cika_bridge", () -> new Bridge_Block_Rope(AbstractBlock.Properties.of(Material.WOOD).strength(0.5F, 2.5F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> rope_cypress_bridge = createBlock("rope_cypress_bridge", () -> new Bridge_Block_Rope(AbstractBlock.Properties.of(Material.WOOD).strength(0.5F, 2.5F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> rope_ebony_bridge = createBlock("rope_ebony_bridge", () -> new Bridge_Block_Rope(AbstractBlock.Properties.of(Material.WOOD).strength(0.5F, 2.5F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> rope_ether_bridge = createBlock("rope_ether_bridge", () -> new Bridge_Block_Rope(AbstractBlock.Properties.of(Material.WOOD).strength(0.5F, 2.5F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> rope_fir_bridge = createBlock("rope_fir_bridge", () -> new Bridge_Block_Rope(AbstractBlock.Properties.of(Material.WOOD).strength(0.5F, 2.5F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> rope_green_enchanted_bridge = createBlock("rope_green_enchanted_bridge", () -> new Bridge_Block_Rope(AbstractBlock.Properties.of(Material.WOOD).strength(0.5F, 2.5F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> rope_holly_bridge = createBlock("rope_holly_bridge", () -> new Bridge_Block_Rope(AbstractBlock.Properties.of(Material.WOOD).strength(0.5F, 2.5F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> rope_jacaranda_bridge = createBlock("rope_jacaranda_bridge", () -> new Bridge_Block_Rope(AbstractBlock.Properties.of(Material.WOOD).strength(0.5F, 2.5F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> rope_lament_bridge = createBlock("rope_lament_bridge", () -> new Bridge_Block_Rope(AbstractBlock.Properties.of(Material.WOOD).strength(0.5F, 2.5F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> rope_mahogany_bridge = createBlock("rope_mahogany_bridge", () -> new Bridge_Block_Rope(AbstractBlock.Properties.of(Material.WOOD).strength(0.5F, 2.5F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> rope_mangrove_bridge = createBlock("rope_mangrove_bridge", () -> new Bridge_Block_Rope(AbstractBlock.Properties.of(Material.WOOD).strength(0.5F, 2.5F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> rope_maple_bridge = createBlock("rope_maple_bridge", () -> new Bridge_Block_Rope(AbstractBlock.Properties.of(Material.WOOD).strength(0.5F, 2.5F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> rope_nightshade_bridge = createBlock("rope_nightshade_bridge", () -> new Bridge_Block_Rope(AbstractBlock.Properties.of(Material.WOOD).strength(0.5F, 2.5F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> rope_palm_bridge = createBlock("rope_palm_bridge", () -> new Bridge_Block_Rope(AbstractBlock.Properties.of(Material.WOOD).strength(0.5F, 2.5F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> rope_pine_bridge = createBlock("rope_pine_bridge", () -> new Bridge_Block_Rope(AbstractBlock.Properties.of(Material.WOOD).strength(0.5F, 2.5F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> rope_rainbow_eucalyptus_bridge = createBlock("rope_rainbow_eucalyptus_bridge", () -> new Bridge_Block_Rope(AbstractBlock.Properties.of(Material.WOOD).strength(0.5F, 2.5F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> rope_redwood_bridge = createBlock("rope_redwood_bridge", () -> new Bridge_Block_Rope(AbstractBlock.Properties.of(Material.WOOD).strength(0.5F, 2.5F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> rope_skyris_bridge = createBlock("rope_skyris_bridge", () -> new Bridge_Block_Rope(AbstractBlock.Properties.of(Material.WOOD).strength(0.5F, 2.5F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> rope_willow_bridge = createBlock("rope_willow_bridge", () -> new Bridge_Block_Rope(AbstractBlock.Properties.of(Material.WOOD).strength(0.5F, 2.5F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> rope_witch_hazel_bridge = createBlock("rope_witch_hazel_bridge", () -> new Bridge_Block_Rope(AbstractBlock.Properties.of(Material.WOOD).strength(0.5F, 2.5F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> rope_zelkova_bridge = createBlock("rope_zelkova_bridge", () -> new Bridge_Block_Rope(AbstractBlock.Properties.of(Material.WOOD).strength(0.5F, 2.5F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> rope_bulbis_bridge = createBlock("rope_bulbis_bridge", () -> new Bridge_Block_Rope(AbstractBlock.Properties.of(Material.WOOD).strength(0.5F, 2.5F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> rope_imparius_bridge = createBlock("rope_imparius_bridge", () -> new Bridge_Block_Rope(AbstractBlock.Properties.of(Material.WOOD).strength(0.5F, 2.5F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> rope_sythian_bridge = createBlock("rope_sythian_bridge", () -> new Bridge_Block_Rope(AbstractBlock.Properties.of(Material.WOOD).strength(0.5F, 2.5F).sound(SoundType.WOOD)));

    public static final RegistryObject<Block> aspen_bridge_pier = createBlock("aspen_bridge_pier", () -> new Bridge_Support(AbstractBlock.Properties.of(Material.WOOD).strength(0.5F, 2.5F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> baobab_bridge_pier = createBlock("baobab_bridge_pier", () -> new Bridge_Support(AbstractBlock.Properties.of(Material.WOOD).strength(0.5F, 2.5F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> blue_enchanted_bridge_pier = createBlock("blue_enchanted_bridge_pier", () -> new Bridge_Support(AbstractBlock.Properties.of(Material.WOOD).strength(0.5F, 2.5F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> cherry_bridge_pier = createBlock("cherry_bridge_pier", () -> new Bridge_Support(AbstractBlock.Properties.of(Material.WOOD).strength(0.5F, 2.5F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> cika_bridge_pier = createBlock("cika_bridge_pier", () -> new Bridge_Support(AbstractBlock.Properties.of(Material.WOOD).strength(0.5F, 2.5F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> cypress_bridge_pier = createBlock("cypress_bridge_pier", () -> new Bridge_Support(AbstractBlock.Properties.of(Material.WOOD).strength(0.5F, 2.5F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> ebony_bridge_pier = createBlock("ebony_bridge_pier", () -> new Bridge_Support(AbstractBlock.Properties.of(Material.WOOD).strength(0.5F, 2.5F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> ether_bridge_pier = createBlock("ether_bridge_pier", () -> new Bridge_Support(AbstractBlock.Properties.of(Material.WOOD).strength(0.5F, 2.5F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> fir_bridge_pier = createBlock("fir_bridge_pier", () -> new Bridge_Support(AbstractBlock.Properties.of(Material.WOOD).strength(0.5F, 2.5F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> green_enchanted_bridge_pier = createBlock("green_enchanted_bridge_pier", () -> new Bridge_Support(AbstractBlock.Properties.of(Material.WOOD).strength(0.5F, 2.5F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> holly_bridge_pier = createBlock("holly_bridge_pier", () -> new Bridge_Support(AbstractBlock.Properties.of(Material.WOOD).strength(0.5F, 2.5F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> jacaranda_bridge_pier = createBlock("jacaranda_bridge_pier", () -> new Bridge_Support(AbstractBlock.Properties.of(Material.WOOD).strength(0.5F, 2.5F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> lament_bridge_pier = createBlock("lament_bridge_pier", () -> new Bridge_Support(AbstractBlock.Properties.of(Material.WOOD).strength(0.5F, 2.5F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> mahogany_bridge_pier = createBlock("mahogany_bridge_pier", () -> new Bridge_Support(AbstractBlock.Properties.of(Material.WOOD).strength(0.5F, 2.5F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> mangrove_bridge_pier = createBlock("mangrove_bridge_pier", () -> new Bridge_Support(AbstractBlock.Properties.of(Material.WOOD).strength(0.5F, 2.5F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> maple_bridge_pier = createBlock("maple_bridge_pier", () -> new Bridge_Support(AbstractBlock.Properties.of(Material.WOOD).strength(0.5F, 2.5F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> nightshade_bridge_pier = createBlock("nightshade_bridge_pier", () -> new Bridge_Support(AbstractBlock.Properties.of(Material.WOOD).strength(0.5F, 2.5F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> palm_bridge_pier = createBlock("palm_bridge_pier", () -> new Bridge_Support(AbstractBlock.Properties.of(Material.WOOD).strength(0.5F, 2.5F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> pine_bridge_pier = createBlock("pine_bridge_pier", () -> new Bridge_Support(AbstractBlock.Properties.of(Material.WOOD).strength(0.5F, 2.5F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> rainbow_eucalyptus_bridge_pier = createBlock("rainbow_eucalyptus_bridge_pier", () -> new Bridge_Support(AbstractBlock.Properties.of(Material.WOOD).strength(0.5F, 2.5F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> redwood_bridge_pier = createBlock("redwood_bridge_pier", () -> new Bridge_Support(AbstractBlock.Properties.of(Material.WOOD).strength(0.5F, 2.5F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> skyris_bridge_pier = createBlock("skyris_bridge_pier", () -> new Bridge_Support(AbstractBlock.Properties.of(Material.WOOD).strength(0.5F, 2.5F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> willow_bridge_pier = createBlock("willow_bridge_pier", () -> new Bridge_Support(AbstractBlock.Properties.of(Material.WOOD).strength(0.5F, 2.5F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> witch_hazel_bridge_pier = createBlock("witch_hazel_bridge_pier", () -> new Bridge_Support(AbstractBlock.Properties.of(Material.WOOD).strength(0.5F, 2.5F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> zelkova_bridge_pier = createBlock("zelkova_bridge_pier", () -> new Bridge_Support(AbstractBlock.Properties.of(Material.WOOD).strength(0.5F, 2.5F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> bulbis_bridge_pier = createBlock("bulbis_bridge_pier", () -> new Bridge_Support(AbstractBlock.Properties.of(Material.WOOD).strength(0.5F, 2.5F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> imparius_bridge_pier = createBlock("imparius_bridge_pier", () -> new Bridge_Support(AbstractBlock.Properties.of(Material.WOOD).strength(0.5F, 2.5F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> sythian_bridge_pier = createBlock("sythian_bridge_pier", () -> new Bridge_Support(AbstractBlock.Properties.of(Material.WOOD).strength(0.5F, 2.5F).sound(SoundType.WOOD)));

    public static final RegistryObject<Block> aspen_log_bridge_stair = createBlock("aspen_log_bridge_stair", () -> new Bridge_Stairs(AbstractBlock.Properties.of(Material.WOOD).strength(0.5F, 2.5F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> baobab_log_bridge_stair = createBlock("baobab_log_bridge_stair", () -> new Bridge_Stairs(AbstractBlock.Properties.of(Material.WOOD).strength(0.5F, 2.5F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> blue_enchanted_log_bridge_stair = createBlock("blue_enchanted_log_bridge_stair", () -> new Bridge_Stairs(AbstractBlock.Properties.of(Material.WOOD).strength(0.5F, 2.5F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> cherry_log_bridge_stair = createBlock("cherry_log_bridge_stair", () -> new Bridge_Stairs(AbstractBlock.Properties.of(Material.WOOD).strength(0.5F, 2.5F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> cika_log_bridge_stair = createBlock("cika_log_bridge_stair", () -> new Bridge_Stairs(AbstractBlock.Properties.of(Material.WOOD).strength(0.5F, 2.5F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> cypress_log_bridge_stair = createBlock("cypress_log_bridge_stair", () -> new Bridge_Stairs(AbstractBlock.Properties.of(Material.WOOD).strength(0.5F, 2.5F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> ebony_log_bridge_stair = createBlock("ebony_log_bridge_stair", () -> new Bridge_Stairs(AbstractBlock.Properties.of(Material.WOOD).strength(0.5F, 2.5F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> ether_log_bridge_stair = createBlock("ether_log_bridge_stair", () -> new Bridge_Stairs(AbstractBlock.Properties.of(Material.WOOD).strength(0.5F, 2.5F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> fir_log_bridge_stair = createBlock("fir_log_bridge_stair", () -> new Bridge_Stairs(AbstractBlock.Properties.of(Material.WOOD).strength(0.5F, 2.5F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> green_enchanted_log_bridge_stair = createBlock("green_enchanted_log_bridge_stair", () -> new Bridge_Stairs(AbstractBlock.Properties.of(Material.WOOD).strength(0.5F, 2.5F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> holly_log_bridge_stair = createBlock("holly_log_bridge_stair", () -> new Bridge_Stairs(AbstractBlock.Properties.of(Material.WOOD).strength(0.5F, 2.5F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> jacaranda_log_bridge_stair = createBlock("jacaranda_log_bridge_stair", () -> new Bridge_Stairs(AbstractBlock.Properties.of(Material.WOOD).strength(0.5F, 2.5F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> lament_log_bridge_stair = createBlock("lament_log_bridge_stair", () -> new Bridge_Stairs(AbstractBlock.Properties.of(Material.WOOD).strength(0.5F, 2.5F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> mahogany_log_bridge_stair = createBlock("mahogany_log_bridge_stair", () -> new Bridge_Stairs(AbstractBlock.Properties.of(Material.WOOD).strength(0.5F, 2.5F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> mangrove_log_bridge_stair = createBlock("mangrove_log_bridge_stair", () -> new Bridge_Stairs(AbstractBlock.Properties.of(Material.WOOD).strength(0.5F, 2.5F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> maple_log_bridge_stair = createBlock("maple_log_bridge_stair", () -> new Bridge_Stairs(AbstractBlock.Properties.of(Material.WOOD).strength(0.5F, 2.5F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> nightshade_log_bridge_stair = createBlock("nightshade_log_bridge_stair", () -> new Bridge_Stairs(AbstractBlock.Properties.of(Material.WOOD).strength(0.5F, 2.5F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> palm_log_bridge_stair = createBlock("palm_log_bridge_stair", () -> new Bridge_Stairs(AbstractBlock.Properties.of(Material.WOOD).strength(0.5F, 2.5F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> pine_log_bridge_stair = createBlock("pine_log_bridge_stair", () -> new Bridge_Stairs(AbstractBlock.Properties.of(Material.WOOD).strength(0.5F, 2.5F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> rainbow_eucalyptus_log_bridge_stair = createBlock("rainbow_eucalyptus_log_bridge_stair", () -> new Bridge_Stairs(AbstractBlock.Properties.of(Material.WOOD).strength(0.5F, 2.5F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> redwood_log_bridge_stair = createBlock("redwood_log_bridge_stair", () -> new Bridge_Stairs(AbstractBlock.Properties.of(Material.WOOD).strength(0.5F, 2.5F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> skyris_log_bridge_stair = createBlock("skyris_log_bridge_stair", () -> new Bridge_Stairs(AbstractBlock.Properties.of(Material.WOOD).strength(0.5F, 2.5F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> willow_log_bridge_stair = createBlock("willow_log_bridge_stair", () -> new Bridge_Stairs(AbstractBlock.Properties.of(Material.WOOD).strength(0.5F, 2.5F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> witch_hazel_log_bridge_stair = createBlock("witch_hazel_log_bridge_stair", () -> new Bridge_Stairs(AbstractBlock.Properties.of(Material.WOOD).strength(0.5F, 2.5F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> zelkova_log_bridge_stair = createBlock("zelkova_log_bridge_stair", () -> new Bridge_Stairs(AbstractBlock.Properties.of(Material.WOOD).strength(0.5F, 2.5F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> bulbis_log_bridge_stair = createBlock("bulbis_log_bridge_stair", () -> new Bridge_Stairs(AbstractBlock.Properties.of(Material.WOOD).strength(0.5F, 2.5F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> imparius_log_bridge_stair = createBlock("imparius_log_bridge_stair", () -> new Bridge_Stairs(AbstractBlock.Properties.of(Material.WOOD).strength(0.5F, 2.5F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> sythian_log_bridge_stair = createBlock("sythian_log_bridge_stair", () -> new Bridge_Stairs(AbstractBlock.Properties.of(Material.WOOD).strength(0.5F, 2.5F).sound(SoundType.WOOD)));

    public static final RegistryObject<Block> aspen_rope_bridge_stair = createBlock("aspen_rope_bridge_stair", () -> new Bridge_Stairs(AbstractBlock.Properties.of(Material.WOOD).strength(0.5F, 2.5F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> baobab_rope_bridge_stair = createBlock("baobab_rope_bridge_stair", () -> new Bridge_Stairs(AbstractBlock.Properties.of(Material.WOOD).strength(0.5F, 2.5F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> blue_enchanted_rope_bridge_stair = createBlock("blue_enchanted_rope_bridge_stair", () -> new Bridge_Stairs(AbstractBlock.Properties.of(Material.WOOD).strength(0.5F, 2.5F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> cherry_rope_bridge_stair = createBlock("cherry_rope_bridge_stair", () -> new Bridge_Stairs(AbstractBlock.Properties.of(Material.WOOD).strength(0.5F, 2.5F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> cika_rope_bridge_stair = createBlock("cika_rope_bridge_stair", () -> new Bridge_Stairs(AbstractBlock.Properties.of(Material.WOOD).strength(0.5F, 2.5F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> cypress_rope_bridge_stair = createBlock("cypress_rope_bridge_stair", () -> new Bridge_Stairs(AbstractBlock.Properties.of(Material.WOOD).strength(0.5F, 2.5F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> ebony_rope_bridge_stair = createBlock("ebony_rope_bridge_stair", () -> new Bridge_Stairs(AbstractBlock.Properties.of(Material.WOOD).strength(0.5F, 2.5F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> ether_rope_bridge_stair = createBlock("ether_rope_bridge_stair", () -> new Bridge_Stairs(AbstractBlock.Properties.of(Material.WOOD).strength(0.5F, 2.5F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> fir_rope_bridge_stair = createBlock("fir_rope_bridge_stair", () -> new Bridge_Stairs(AbstractBlock.Properties.of(Material.WOOD).strength(0.5F, 2.5F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> green_enchanted_rope_bridge_stair = createBlock("green_enchanted_rope_bridge_stair", () -> new Bridge_Stairs(AbstractBlock.Properties.of(Material.WOOD).strength(0.5F, 2.5F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> holly_rope_bridge_stair = createBlock("holly_rope_bridge_stair", () -> new Bridge_Stairs(AbstractBlock.Properties.of(Material.WOOD).strength(0.5F, 2.5F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> jacaranda_rope_bridge_stair = createBlock("jacaranda_rope_bridge_stair", () -> new Bridge_Stairs(AbstractBlock.Properties.of(Material.WOOD).strength(0.5F, 2.5F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> lament_rope_bridge_stair = createBlock("lament_rope_bridge_stair", () -> new Bridge_Stairs(AbstractBlock.Properties.of(Material.WOOD).strength(0.5F, 2.5F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> mahogany_rope_bridge_stair = createBlock("mahogany_rope_bridge_stair", () -> new Bridge_Stairs(AbstractBlock.Properties.of(Material.WOOD).strength(0.5F, 2.5F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> mangrove_rope_bridge_stair = createBlock("mangrove_rope_bridge_stair", () -> new Bridge_Stairs(AbstractBlock.Properties.of(Material.WOOD).strength(0.5F, 2.5F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> maple_rope_bridge_stair = createBlock("maple_rope_bridge_stair", () -> new Bridge_Stairs(AbstractBlock.Properties.of(Material.WOOD).strength(0.5F, 2.5F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> nightshade_rope_bridge_stair = createBlock("nightshade_rope_bridge_stair", () -> new Bridge_Stairs(AbstractBlock.Properties.of(Material.WOOD).strength(0.5F, 2.5F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> palm_rope_bridge_stair = createBlock("palm_rope_bridge_stair", () -> new Bridge_Stairs(AbstractBlock.Properties.of(Material.WOOD).strength(0.5F, 2.5F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> pine_rope_bridge_stair = createBlock("pine_rope_bridge_stair", () -> new Bridge_Stairs(AbstractBlock.Properties.of(Material.WOOD).strength(0.5F, 2.5F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> rainbow_eucalyptus_rope_bridge_stair = createBlock("rainbow_eucalyptus_rope_bridge_stair", () -> new Bridge_Stairs(AbstractBlock.Properties.of(Material.WOOD).strength(0.5F, 2.5F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> redwood_rope_bridge_stair = createBlock("redwood_rope_bridge_stair", () -> new Bridge_Stairs(AbstractBlock.Properties.of(Material.WOOD).strength(0.5F, 2.5F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> skyris_rope_bridge_stair = createBlock("skyris_rope_bridge_stair", () -> new Bridge_Stairs(AbstractBlock.Properties.of(Material.WOOD).strength(0.5F, 2.5F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> willow_rope_bridge_stair = createBlock("willow_rope_bridge_stair", () -> new Bridge_Stairs(AbstractBlock.Properties.of(Material.WOOD).strength(0.5F, 2.5F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> witch_hazel_rope_bridge_stair = createBlock("witch_hazel_rope_bridge_stair", () -> new Bridge_Stairs(AbstractBlock.Properties.of(Material.WOOD).strength(0.5F, 2.5F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> zelkova_rope_bridge_stair = createBlock("zelkova_rope_bridge_stair", () -> new Bridge_Stairs(AbstractBlock.Properties.of(Material.WOOD).strength(0.5F, 2.5F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> bulbis_rope_bridge_stair = createBlock("bulbis_rope_bridge_stair", () -> new Bridge_Stairs(AbstractBlock.Properties.of(Material.WOOD).strength(0.5F, 2.5F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> imparius_rope_bridge_stair = createBlock("imparius_rope_bridge_stair", () -> new Bridge_Stairs(AbstractBlock.Properties.of(Material.WOOD).strength(0.5F, 2.5F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> sythian_rope_bridge_stair = createBlock("sythian_rope_bridge_stair", () -> new Bridge_Stairs(AbstractBlock.Properties.of(Material.WOOD).strength(0.5F, 2.5F).sound(SoundType.WOOD)));

    public static final RegistryObject<Block> aspen_rail_bridge = createBlock("aspen_rail_bridge", () -> new Rail_Bridge(AbstractBlock.Properties.of(Material.WOOD).noOcclusion().strength(0.5F, 2.5F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> baobab_rail_bridge = createBlock("baobab_rail_bridge", () -> new Rail_Bridge(AbstractBlock.Properties.of(Material.WOOD).noOcclusion().strength(0.5F, 2.5F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> blue_enchanted_rail_bridge = createBlock("blue_enchanted_rail_bridge", () -> new Rail_Bridge(AbstractBlock.Properties.of(Material.WOOD).noOcclusion().strength(0.5F, 2.5F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> cherry_rail_bridge = createBlock("cherry_rail_bridge", () -> new Rail_Bridge(AbstractBlock.Properties.of(Material.WOOD).noOcclusion().strength(0.5F, 2.5F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> cika_rail_bridge = createBlock("cika_rail_bridge", () -> new Rail_Bridge(AbstractBlock.Properties.of(Material.WOOD).noOcclusion().strength(0.5F, 2.5F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> cypress_rail_bridge = createBlock("cypress_rail_bridge", () -> new Rail_Bridge(AbstractBlock.Properties.of(Material.WOOD).noOcclusion().strength(0.5F, 2.5F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> ebony_rail_bridge = createBlock("ebony_rail_bridge", () -> new Rail_Bridge(AbstractBlock.Properties.of(Material.WOOD).noOcclusion().strength(0.5F, 2.5F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> ether_rail_bridge = createBlock("ether_rail_bridge", () -> new Rail_Bridge(AbstractBlock.Properties.of(Material.WOOD).noOcclusion().strength(0.5F, 2.5F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> fir_rail_bridge = createBlock("fir_rail_bridge", () -> new Rail_Bridge(AbstractBlock.Properties.of(Material.WOOD).noOcclusion().strength(0.5F, 2.5F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> green_enchanted_rail_bridge = createBlock("green_enchanted_rail_bridge", () -> new Rail_Bridge(AbstractBlock.Properties.of(Material.WOOD).noOcclusion().strength(0.5F, 2.5F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> holly_rail_bridge = createBlock("holly_rail_bridge", () -> new Rail_Bridge(AbstractBlock.Properties.of(Material.WOOD).noOcclusion().strength(0.5F, 2.5F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> jacaranda_rail_bridge = createBlock("jacaranda_rail_bridge", () -> new Rail_Bridge(AbstractBlock.Properties.of(Material.WOOD).noOcclusion().strength(0.5F, 2.5F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> lament_rail_bridge = createBlock("lament_rail_bridge", () -> new Rail_Bridge(AbstractBlock.Properties.of(Material.WOOD).noOcclusion().strength(0.5F, 2.5F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> mahogany_rail_bridge = createBlock("mahogany_rail_bridge", () -> new Rail_Bridge(AbstractBlock.Properties.of(Material.WOOD).noOcclusion().strength(0.5F, 2.5F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> mangrove_rail_bridge = createBlock("mangrove_rail_bridge", () -> new Rail_Bridge(AbstractBlock.Properties.of(Material.WOOD).noOcclusion().strength(0.5F, 2.5F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> maple_rail_bridge = createBlock("maple_rail_bridge", () -> new Rail_Bridge(AbstractBlock.Properties.of(Material.WOOD).noOcclusion().strength(0.5F, 2.5F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> nightshade_rail_bridge = createBlock("nightshade_rail_bridge", () -> new Rail_Bridge(AbstractBlock.Properties.of(Material.WOOD).noOcclusion().strength(0.5F, 2.5F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> palm_rail_bridge = createBlock("palm_rail_bridge", () -> new Rail_Bridge(AbstractBlock.Properties.of(Material.WOOD).noOcclusion().strength(0.5F, 2.5F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> pine_rail_bridge = createBlock("pine_rail_bridge", () -> new Rail_Bridge(AbstractBlock.Properties.of(Material.WOOD).noOcclusion().strength(0.5F, 2.5F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> rainbow_eucalyptus_rail_bridge = createBlock("rainbow_eucalyptus_rail_bridge", () -> new Rail_Bridge(AbstractBlock.Properties.of(Material.WOOD).noOcclusion().strength(0.5F, 2.5F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> redwood_rail_bridge = createBlock("redwood_rail_bridge", () -> new Rail_Bridge(AbstractBlock.Properties.of(Material.WOOD).noOcclusion().strength(0.5F, 2.5F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> skyris_rail_bridge = createBlock("skyris_rail_bridge", () -> new Rail_Bridge(AbstractBlock.Properties.of(Material.WOOD).noOcclusion().strength(0.5F, 2.5F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> willow_rail_bridge = createBlock("willow_rail_bridge", () -> new Rail_Bridge(AbstractBlock.Properties.of(Material.WOOD).noOcclusion().strength(0.5F, 2.5F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> witch_hazel_rail_bridge = createBlock("witch_hazel_rail_bridge", () -> new Rail_Bridge(AbstractBlock.Properties.of(Material.WOOD).noOcclusion().strength(0.5F, 2.5F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> zelkova_rail_bridge = createBlock("zelkova_rail_bridge", () -> new Rail_Bridge(AbstractBlock.Properties.of(Material.WOOD).noOcclusion().strength(0.5F, 2.5F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> bulbis_rail_bridge = createBlock("bulbis_rail_bridge", () -> new Rail_Bridge(AbstractBlock.Properties.of(Material.WOOD).noOcclusion().strength(0.5F, 2.5F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> imparius_rail_bridge = createBlock("imparius_rail_bridge", () -> new Rail_Bridge(AbstractBlock.Properties.of(Material.WOOD).noOcclusion().strength(0.5F, 2.5F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> sythian_rail_bridge = createBlock("sythian_rail_bridge", () -> new Rail_Bridge(AbstractBlock.Properties.of(Material.WOOD).noOcclusion().strength(0.5F, 2.5F).sound(SoundType.WOOD)));

    public static final RegistryObject<Block> cryptic_stone_bridge = createBlockStone("cryptic_stone_bridge", () -> new Log_Bridge(AbstractBlock.Properties.of(Material.STONE).noOcclusion().strength(3.0F, 5.0F).sound(SoundType.STONE)));
    public static final RegistryObject<Block> dacite_bricks_bridge = createBlockStone("dacite_bricks_bridge", () -> new Log_Bridge(AbstractBlock.Properties.of(Material.STONE).strength(3.0F, 5.0F).sound(SoundType.STONE)));
    public static final RegistryObject<Block> polished_travertine_bridge = createBlockStone("polished_travertine_bridge", () -> new Log_Bridge(AbstractBlock.Properties.of(Material.STONE).strength(3.0F, 5.0F).sound(SoundType.STONE)));
    public static final RegistryObject<Block> purpur_stone_bridge = createBlockStone("purpur_stone_bridge", () -> new Log_Bridge(AbstractBlock.Properties.of(Material.STONE).strength(3.0F, 5.0F).sound(SoundType.STONE)));
    public static final RegistryObject<Block> red_rock_bricks_bridge = createBlockStone("red_rock_bricks_bridge", () -> new Log_Bridge(AbstractBlock.Properties.of(Material.STONE).strength(3.0F, 5.0F).sound(SoundType.STONE)));
    public static final RegistryObject<Block> scoria_stone_bricks_bridge = createBlockStone("scoria_stone_bricks_bridge", () -> new Log_Bridge(AbstractBlock.Properties.of(Material.STONE).strength(3.0F, 5.0F).sound(SoundType.STONE)));
    public static final RegistryObject<Block> soapstone_bricks_bridge = createBlockStone("soapstone_bricks_bridge", () -> new Log_Bridge(AbstractBlock.Properties.of(Material.STONE).strength(3.0F, 5.0F).sound(SoundType.STONE)));

    public static final RegistryObject<Block> cryptic_stone_bridge_pier = createBlockStone("cryptic_stone_bridge_pier", () -> new Bridge_Support(AbstractBlock.Properties.of(Material.STONE).strength(3.0F, 5.0F).sound(SoundType.STONE)));
    public static final RegistryObject<Block> dacite_bricks_bridge_pier = createBlockStone("dacite_bricks_bridge_pier", () -> new Bridge_Support(AbstractBlock.Properties.of(Material.STONE).strength(3.0F, 5.0F).sound(SoundType.STONE)));
    public static final RegistryObject<Block> polished_travertine_bridge_pier = createBlockStone("polished_travertine_bridge_pier", () -> new Bridge_Support(AbstractBlock.Properties.of(Material.STONE).strength(3.0F, 5.0F).sound(SoundType.STONE)));
    public static final RegistryObject<Block> purpur_stone_bridge_pier = createBlockStone("purpur_stone_bridge_pier", () -> new Bridge_Support(AbstractBlock.Properties.of(Material.STONE).strength(3.0F, 5.0F).sound(SoundType.STONE)));
    public static final RegistryObject<Block> red_rock_bricks_bridge_pier = createBlockStone("red_rock_bricks_bridge_pier", () -> new Bridge_Support(AbstractBlock.Properties.of(Material.STONE).strength(3.0F, 5.0F).sound(SoundType.STONE)));
    public static final RegistryObject<Block> scoria_stone_bricks_bridge_pier = createBlockStone("scoria_stone_bricks_bridge_pier", () -> new Bridge_Support(AbstractBlock.Properties.of(Material.STONE).strength(3.0F, 5.0F).sound(SoundType.STONE)));
    public static final RegistryObject<Block> soapstone_bricks_bridge_pier = createBlockStone("soapstone_bricks_bridge_pier", () -> new Bridge_Support(AbstractBlock.Properties.of(Material.STONE).strength(3.0F, 5.0F).sound(SoundType.STONE)));

    public static final RegistryObject<Block> cryptic_stone_bridge_stair = createBlockStone("cryptic_stone_bridge_stair", () -> new Bridge_Stairs(AbstractBlock.Properties.of(Material.STONE).strength(3.0F, 5.0F).sound(SoundType.STONE)));
    public static final RegistryObject<Block> dacite_bricks_bridge_stair = createBlockStone("dacite_bricks_bridge_stair", () -> new Bridge_Stairs(AbstractBlock.Properties.of(Material.STONE).strength(3.0F, 5.0F).sound(SoundType.STONE)));
    public static final RegistryObject<Block> polished_travertine_bridge_stair = createBlockStone("polished_travertine_bridge_stair", () -> new Bridge_Stairs(AbstractBlock.Properties.of(Material.STONE).strength(3.0F, 5.0F).sound(SoundType.STONE)));
    public static final RegistryObject<Block> purpur_stone_bridge_stair = createBlockStone("purpur_stone_bridge_stair", () -> new Bridge_Stairs(AbstractBlock.Properties.of(Material.STONE).strength(3.0F, 5.0F).sound(SoundType.STONE)));
    public static final RegistryObject<Block> red_rock_bricks_bridge_stair = createBlockStone("red_rock_bricks_bridge_stair", () -> new Bridge_Stairs(AbstractBlock.Properties.of(Material.STONE).strength(3.0F, 5.0F).sound(SoundType.STONE)));
    public static final RegistryObject<Block> scoria_stone_bricks_bridge_stair = createBlockStone("scoria_stone_bricks_bridge_stair", () -> new Bridge_Stairs(AbstractBlock.Properties.of(Material.STONE).strength(3.0F, 5.0F).sound(SoundType.STONE)));
    public static final RegistryObject<Block> soapstone_bricks_bridge_stair = createBlockStone("soapstone_bricks_bridge_stair", () -> new Bridge_Stairs(AbstractBlock.Properties.of(Material.STONE).strength(3.0F, 5.0F).sound(SoundType.STONE)));

    public static RegistryObject<Block> createBlock(String name, Supplier<? extends Block> supplier)
    {
        RegistryObject<Block> block = BLOCKS_REGISTRY.register(name, supplier);
        ITEMS_REGISTRY.register(name, () -> new FuelItemBlock(block.get(), new Item.Properties().tab(MacawsBridgesBYG.CMT)));
        return block;
    }
    
    public static RegistryObject<Block> createBlockStone(String name, Supplier<? extends Block> supplier)
    {
        RegistryObject<Block> block = BLOCKS_REGISTRY.register(name, supplier);
        ITEMS_REGISTRY.register(name, () -> new BlockItem(block.get(), new Item.Properties().tab(MacawsBridgesBYG.CMT)));
        return block;
    }

}