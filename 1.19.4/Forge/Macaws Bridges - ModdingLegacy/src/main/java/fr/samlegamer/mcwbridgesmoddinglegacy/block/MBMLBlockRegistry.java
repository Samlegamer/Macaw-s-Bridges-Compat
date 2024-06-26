package fr.samlegamer.mcwbridgesmoddinglegacy.block;

import com.google.common.base.Supplier;
import com.mcwbridges.kikoz.objects.Bridge_Stairs;
import com.mcwbridges.kikoz.objects.Log_Bridge;
import com.mcwbridges.kikoz.objects.Rail_Bridge;
import com.mcwbridges.kikoz.objects.Bridge_Block_Rope;
import com.mcwbridges.kikoz.objects.Bridge_Support;
import fr.samlegamer.mcwbridgesmoddinglegacy.McwBridgesModdingLegacy;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.fml.ModList;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class MBMLBlockRegistry
{
	public static final DeferredRegister<Block> BLOCKS_REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, McwBridgesModdingLegacy.MODID);
	public static final DeferredRegister<Item> ITEMS_REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, McwBridgesModdingLegacy.MODID);	

	public static final RegistryObject<Block> bsky_bluebright_log_bridge_middle = createBlock("blue_skies", "bsky_bluebright_log_bridge_middle", () -> new Log_Bridge(BlockBehaviour.Properties.of(Material.WOOD).strength(0.5F, 2.5F).sound(SoundType.WOOD)));
	public static final RegistryObject<Block> bsky_cherry_log_bridge_middle = createBlock("blue_skies", "bsky_cherry_log_bridge_middle", () -> new Log_Bridge(BlockBehaviour.Properties.of(Material.WOOD).strength(0.5F, 2.5F).sound(SoundType.WOOD)));
	public static final RegistryObject<Block> bsky_crystallized_log_bridge_middle = createBlock("blue_skies", "bsky_crystallized_log_bridge_middle", () -> new Log_Bridge(BlockBehaviour.Properties.of(Material.GLASS).strength(0.5F, 2.5F).sound(SoundType.GLASS)));
	public static final RegistryObject<Block> bsky_dusk_log_bridge_middle = createBlock("blue_skies", "bsky_dusk_log_bridge_middle", () -> new Log_Bridge(BlockBehaviour.Properties.of(Material.WOOD).strength(0.5F, 2.5F).sound(SoundType.WOOD)));
	public static final RegistryObject<Block> bsky_frostbright_log_bridge_middle = createBlock("blue_skies", "bsky_frostbright_log_bridge_middle", () -> new Log_Bridge(BlockBehaviour.Properties.of(Material.WOOD).strength(0.5F, 2.5F).sound(SoundType.WOOD)));
	public static final RegistryObject<Block> bsky_lunar_log_bridge_middle = createBlock("blue_skies", "bsky_lunar_log_bridge_middle", () -> new Log_Bridge(BlockBehaviour.Properties.of(Material.WOOD).strength(0.5F, 2.5F).sound(SoundType.WOOD)));
	public static final RegistryObject<Block> bsky_maple_log_bridge_middle = createBlock("blue_skies", "bsky_maple_log_bridge_middle", () -> new Log_Bridge(BlockBehaviour.Properties.of(Material.WOOD).strength(0.5F, 2.5F).sound(SoundType.WOOD)));
	public static final RegistryObject<Block> bsky_starlit_log_bridge_middle = createBlock("blue_skies", "bsky_starlit_log_bridge_middle", () -> new Log_Bridge(BlockBehaviour.Properties.of(Material.WOOD).strength(0.5F, 2.5F).sound(SoundType.WOOD)));
	
	public static final RegistryObject<Block> rope_bsky_bluebright_bridge = createBlock("blue_skies", "rope_bsky_bluebright_bridge", () -> new Bridge_Block_Rope(BlockBehaviour.Properties.of(Material.WOOD).strength(0.5F, 2.5F).sound(SoundType.WOOD)));
	public static final RegistryObject<Block> rope_bsky_cherry_bridge = createBlock("blue_skies", "rope_bsky_cherry_bridge", () -> new Bridge_Block_Rope(BlockBehaviour.Properties.of(Material.WOOD).strength(0.5F, 2.5F).sound(SoundType.WOOD)));
	public static final RegistryObject<Block> rope_bsky_crystallized_bridge = createBlock("blue_skies", "rope_bsky_crystallized_bridge", () -> new Bridge_Block_Rope(BlockBehaviour.Properties.of(Material.GLASS).strength(0.5F, 2.5F).sound(SoundType.GLASS)));
	public static final RegistryObject<Block> rope_bsky_dusk_bridge = createBlock("blue_skies", "rope_bsky_dusk_bridge", () -> new Bridge_Block_Rope(BlockBehaviour.Properties.of(Material.WOOD).strength(0.5F, 2.5F).sound(SoundType.WOOD)));
	public static final RegistryObject<Block> rope_bsky_frostbright_bridge = createBlock("blue_skies", "rope_bsky_frostbright_bridge", () -> new Bridge_Block_Rope(BlockBehaviour.Properties.of(Material.WOOD).strength(0.5F, 2.5F).sound(SoundType.WOOD)));
	public static final RegistryObject<Block> rope_bsky_lunar_bridge = createBlock("blue_skies", "rope_bsky_lunar_bridge", () -> new Bridge_Block_Rope(BlockBehaviour.Properties.of(Material.WOOD).strength(0.5F, 2.5F).sound(SoundType.WOOD)));
	public static final RegistryObject<Block> rope_bsky_maple_bridge = createBlock("blue_skies", "rope_bsky_maple_bridge", () -> new Bridge_Block_Rope(BlockBehaviour.Properties.of(Material.WOOD).strength(0.5F, 2.5F).sound(SoundType.WOOD)));
	public static final RegistryObject<Block> rope_bsky_starlit_bridge = createBlock("blue_skies", "rope_bsky_starlit_bridge", () -> new Bridge_Block_Rope(BlockBehaviour.Properties.of(Material.WOOD).strength(0.5F, 2.5F).sound(SoundType.WOOD)));

	public static final RegistryObject<Block> bsky_bluebright_bridge_pier = createBlock("blue_skies", "bsky_bluebright_bridge_pier", () -> new Bridge_Support(BlockBehaviour.Properties.of(Material.WOOD).strength(0.5F, 2.5F).sound(SoundType.WOOD)));
	public static final RegistryObject<Block> bsky_cherry_bridge_pier = createBlock("blue_skies", "bsky_cherry_bridge_pier", () -> new Bridge_Support(BlockBehaviour.Properties.of(Material.WOOD).strength(0.5F, 2.5F).sound(SoundType.WOOD)));
	public static final RegistryObject<Block> bsky_crystallized_bridge_pier = createBlock("blue_skies", "bsky_crystallized_bridge_pier", () -> new Bridge_Support(BlockBehaviour.Properties.of(Material.GLASS).strength(0.5F, 2.5F).sound(SoundType.GLASS)));
	public static final RegistryObject<Block> bsky_dusk_bridge_pier = createBlock("blue_skies", "bsky_dusk_bridge_pier", () -> new Bridge_Support(BlockBehaviour.Properties.of(Material.WOOD).strength(0.5F, 2.5F).sound(SoundType.WOOD)));
	public static final RegistryObject<Block> bsky_frostbright_bridge_pier = createBlock("blue_skies", "bsky_frostbright_bridge_pier", () -> new Bridge_Support(BlockBehaviour.Properties.of(Material.WOOD).strength(0.5F, 2.5F).sound(SoundType.WOOD)));
	public static final RegistryObject<Block> bsky_lunar_bridge_pier = createBlock("blue_skies", "bsky_lunar_bridge_pier", () -> new Bridge_Support(BlockBehaviour.Properties.of(Material.WOOD).strength(0.5F, 2.5F).sound(SoundType.WOOD)));
	public static final RegistryObject<Block> bsky_maple_bridge_pier = createBlock("blue_skies", "bsky_maple_bridge_pier", () -> new Bridge_Support(BlockBehaviour.Properties.of(Material.WOOD).strength(0.5F, 2.5F).sound(SoundType.WOOD)));
	public static final RegistryObject<Block> bsky_starlit_bridge_pier = createBlock("blue_skies", "bsky_starlit_bridge_pier", () -> new Bridge_Support(BlockBehaviour.Properties.of(Material.WOOD).strength(0.5F, 2.5F).sound(SoundType.WOOD)));

	public static final RegistryObject<Block> bsky_bluebright_log_bridge_stair = createBlock("blue_skies", "bsky_bluebright_log_bridge_stair", () -> new Bridge_Stairs(BlockBehaviour.Properties.of(Material.WOOD).strength(0.5F, 2.5F).sound(SoundType.WOOD)));
	public static final RegistryObject<Block> bsky_cherry_log_bridge_stair = createBlock("blue_skies", "bsky_cherry_log_bridge_stair", () -> new Bridge_Stairs(BlockBehaviour.Properties.of(Material.WOOD).strength(0.5F, 2.5F).sound(SoundType.WOOD)));
	public static final RegistryObject<Block> bsky_crystallized_log_bridge_stair = createBlock("blue_skies", "bsky_crystallized_log_bridge_stair", () -> new Bridge_Stairs(BlockBehaviour.Properties.of(Material.GLASS).strength(0.5F, 2.5F).sound(SoundType.GLASS)));
	public static final RegistryObject<Block> bsky_dusk_log_bridge_stair = createBlock("blue_skies", "bsky_dusk_log_bridge_stair", () -> new Bridge_Stairs(BlockBehaviour.Properties.of(Material.WOOD).strength(0.5F, 2.5F).sound(SoundType.WOOD)));
	public static final RegistryObject<Block> bsky_frostbright_log_bridge_stair = createBlock("blue_skies", "bsky_frostbright_log_bridge_stair", () -> new Bridge_Stairs(BlockBehaviour.Properties.of(Material.WOOD).strength(0.5F, 2.5F).sound(SoundType.WOOD)));
	public static final RegistryObject<Block> bsky_lunar_log_bridge_stair = createBlock("blue_skies", "bsky_lunar_log_bridge_stair", () -> new Bridge_Stairs(BlockBehaviour.Properties.of(Material.WOOD).strength(0.5F, 2.5F).sound(SoundType.WOOD)));
	public static final RegistryObject<Block> bsky_maple_log_bridge_stair = createBlock("blue_skies", "bsky_maple_log_bridge_stair", () -> new Bridge_Stairs(BlockBehaviour.Properties.of(Material.WOOD).strength(0.5F, 2.5F).sound(SoundType.WOOD)));
	public static final RegistryObject<Block> bsky_starlit_log_bridge_stair = createBlock("blue_skies", "bsky_starlit_log_bridge_stair", () -> new Bridge_Stairs(BlockBehaviour.Properties.of(Material.WOOD).strength(0.5F, 2.5F).sound(SoundType.WOOD)));

	public static final RegistryObject<Block> bsky_bluebright_rope_bridge_stair = createBlock("blue_skies", "bsky_bluebright_rope_bridge_stair", () -> new Bridge_Stairs(BlockBehaviour.Properties.of(Material.WOOD).strength(0.5F, 2.5F).sound(SoundType.WOOD)));
	public static final RegistryObject<Block> bsky_cherry_rope_bridge_stair = createBlock("blue_skies", "bsky_cherry_rope_bridge_stair", () -> new Bridge_Stairs(BlockBehaviour.Properties.of(Material.WOOD).strength(0.5F, 2.5F).sound(SoundType.WOOD)));
	public static final RegistryObject<Block> bsky_crystallized_rope_bridge_stair = createBlock("blue_skies", "bsky_crystallized_rope_bridge_stair", () -> new Bridge_Stairs(BlockBehaviour.Properties.of(Material.GLASS).strength(0.5F, 2.5F).sound(SoundType.GLASS)));
	public static final RegistryObject<Block> bsky_dusk_rope_bridge_stair = createBlock("blue_skies", "bsky_dusk_rope_bridge_stair", () -> new Bridge_Stairs(BlockBehaviour.Properties.of(Material.WOOD).strength(0.5F, 2.5F).sound(SoundType.WOOD)));
	public static final RegistryObject<Block> bsky_frostbright_rope_bridge_stair = createBlock("blue_skies", "bsky_frostbright_rope_bridge_stair", () -> new Bridge_Stairs(BlockBehaviour.Properties.of(Material.WOOD).strength(0.5F, 2.5F).sound(SoundType.WOOD)));
	public static final RegistryObject<Block> bsky_lunar_rope_bridge_stair = createBlock("blue_skies", "bsky_lunar_rope_bridge_stair", () -> new Bridge_Stairs(BlockBehaviour.Properties.of(Material.WOOD).strength(0.5F, 2.5F).sound(SoundType.WOOD)));
	public static final RegistryObject<Block> bsky_maple_rope_bridge_stair = createBlock("blue_skies", "bsky_maple_rope_bridge_stair", () -> new Bridge_Stairs(BlockBehaviour.Properties.of(Material.WOOD).strength(0.5F, 2.5F).sound(SoundType.WOOD)));
	public static final RegistryObject<Block> bsky_starlit_rope_bridge_stair = createBlock("blue_skies", "bsky_starlit_rope_bridge_stair", () -> new Bridge_Stairs(BlockBehaviour.Properties.of(Material.WOOD).strength(0.5F, 2.5F).sound(SoundType.WOOD)));
	
	public static final RegistryObject<Block> bsky_bluebright_rail_bridge = createBlock("blue_skies", "bsky_bluebright_rail_bridge", () -> new Rail_Bridge(BlockBehaviour.Properties.of(Material.WOOD).noOcclusion().strength(0.5F, 2.5F).sound(SoundType.WOOD)));
	public static final RegistryObject<Block> bsky_cherry_rail_bridge = createBlock("blue_skies", "bsky_cherry_rail_bridge", () -> new Rail_Bridge(BlockBehaviour.Properties.of(Material.WOOD).noOcclusion().strength(0.5F, 2.5F).sound(SoundType.WOOD)));
	public static final RegistryObject<Block> bsky_crystallized_rail_bridge = createBlock("blue_skies", "bsky_crystallized_rail_bridge", () -> new Rail_Bridge(BlockBehaviour.Properties.of(Material.GLASS).noOcclusion().strength(0.5F, 2.5F).sound(SoundType.GLASS)));
	public static final RegistryObject<Block> bsky_dusk_rail_bridge = createBlock("blue_skies", "bsky_dusk_rail_bridge", () -> new Rail_Bridge(BlockBehaviour.Properties.of(Material.WOOD).noOcclusion().strength(0.5F, 2.5F).sound(SoundType.WOOD)));
	public static final RegistryObject<Block> bsky_frostbright_rail_bridge = createBlock("blue_skies", "bsky_frostbright_rail_bridge", () -> new Rail_Bridge(BlockBehaviour.Properties.of(Material.WOOD).noOcclusion().strength(0.5F, 2.5F).sound(SoundType.WOOD)));
	public static final RegistryObject<Block> bsky_lunar_rail_bridge = createBlock("blue_skies", "bsky_lunar_rail_bridge", () -> new Rail_Bridge(BlockBehaviour.Properties.of(Material.WOOD).noOcclusion().strength(0.5F, 2.5F).sound(SoundType.WOOD)));
	public static final RegistryObject<Block> bsky_maple_rail_bridge = createBlock("blue_skies", "bsky_maple_rail_bridge", () -> new Rail_Bridge(BlockBehaviour.Properties.of(Material.WOOD).noOcclusion().strength(0.5F, 2.5F).sound(SoundType.WOOD)));
	public static final RegistryObject<Block> bsky_starlit_rail_bridge = createBlock("blue_skies", "bsky_starlit_rail_bridge", () -> new Rail_Bridge(BlockBehaviour.Properties.of(Material.WOOD).noOcclusion().strength(0.5F, 2.5F).sound(SoundType.WOOD)));

	public static final RegistryObject<Block> pwood_magic_log_bridge_middle = createBlock("premium_wood", "pwood_magic_log_bridge_middle", () -> new Log_Bridge(BlockBehaviour.Properties.of(Material.WOOD).strength(0.5F, 2.5F).sound(SoundType.WOOD)));
	public static final RegistryObject<Block> pwood_maple_log_bridge_middle = createBlock("premium_wood", "pwood_maple_log_bridge_middle", () -> new Log_Bridge(BlockBehaviour.Properties.of(Material.WOOD).strength(0.5F, 2.5F).sound(SoundType.WOOD)));
	public static final RegistryObject<Block> pwood_purple_heart_log_bridge_middle = createBlock("premium_wood", "pwood_purple_heart_log_bridge_middle", () -> new Log_Bridge(BlockBehaviour.Properties.of(Material.WOOD).strength(0.5F, 2.5F).sound(SoundType.WOOD)));
	public static final RegistryObject<Block> pwood_silverbell_log_bridge_middle = createBlock("premium_wood", "pwood_silverbell_log_bridge_middle", () -> new Log_Bridge(BlockBehaviour.Properties.of(Material.WOOD).strength(0.5F, 2.5F).sound(SoundType.WOOD)));
	public static final RegistryObject<Block> pwood_tiger_log_bridge_middle = createBlock("premium_wood", "pwood_tiger_log_bridge_middle", () -> new Log_Bridge(BlockBehaviour.Properties.of(Material.WOOD).strength(0.5F, 2.5F).sound(SoundType.WOOD)));
	public static final RegistryObject<Block> pwood_willow_log_bridge_middle = createBlock("premium_wood", "pwood_willow_log_bridge_middle", () -> new Log_Bridge(BlockBehaviour.Properties.of(Material.WOOD).strength(0.5F, 2.5F).sound(SoundType.WOOD)));

	public static final RegistryObject<Block> rope_pwood_magic_bridge = createBlock("premium_wood", "rope_pwood_magic_bridge", () -> new Bridge_Block_Rope(BlockBehaviour.Properties.of(Material.WOOD).strength(0.5F, 2.5F).sound(SoundType.WOOD)));
	public static final RegistryObject<Block> rope_pwood_maple_bridge = createBlock("premium_wood", "rope_pwood_maple_bridge", () -> new Bridge_Block_Rope(BlockBehaviour.Properties.of(Material.WOOD).strength(0.5F, 2.5F).sound(SoundType.WOOD)));
	public static final RegistryObject<Block> rope_pwood_purple_heart_bridge = createBlock("premium_wood", "rope_pwood_purple_heart_bridge", () -> new Bridge_Block_Rope(BlockBehaviour.Properties.of(Material.WOOD).strength(0.5F, 2.5F).sound(SoundType.WOOD)));
	public static final RegistryObject<Block> rope_pwood_silverbell_bridge = createBlock("premium_wood", "rope_pwood_silverbell_bridge", () -> new Bridge_Block_Rope(BlockBehaviour.Properties.of(Material.WOOD).strength(0.5F, 2.5F).sound(SoundType.WOOD)));
	public static final RegistryObject<Block> rope_pwood_tiger_bridge = createBlock("premium_wood", "rope_pwood_tiger_bridge", () -> new Bridge_Block_Rope(BlockBehaviour.Properties.of(Material.WOOD).strength(0.5F, 2.5F).sound(SoundType.WOOD)));
	public static final RegistryObject<Block> rope_pwood_willow_bridge = createBlock("premium_wood", "rope_pwood_willow_bridge", () -> new Bridge_Block_Rope(BlockBehaviour.Properties.of(Material.WOOD).strength(0.5F, 2.5F).sound(SoundType.WOOD)));

	public static final RegistryObject<Block> pwood_magic_bridge_pier = createBlock("premium_wood", "pwood_magic_bridge_pier", () -> new Bridge_Support(BlockBehaviour.Properties.of(Material.WOOD).strength(0.5F, 2.5F).sound(SoundType.WOOD)));
	public static final RegistryObject<Block> pwood_maple_bridge_pier = createBlock("premium_wood", "pwood_maple_bridge_pier", () -> new Bridge_Support(BlockBehaviour.Properties.of(Material.WOOD).strength(0.5F, 2.5F).sound(SoundType.WOOD)));
	public static final RegistryObject<Block> pwood_purple_heart_bridge_pier = createBlock("premium_wood", "pwood_purple_heart_bridge_pier", () -> new Bridge_Support(BlockBehaviour.Properties.of(Material.WOOD).strength(0.5F, 2.5F).sound(SoundType.WOOD)));
	public static final RegistryObject<Block> pwood_silverbell_bridge_pier = createBlock("premium_wood", "pwood_silverbell_bridge_pier", () -> new Bridge_Support(BlockBehaviour.Properties.of(Material.WOOD).strength(0.5F, 2.5F).sound(SoundType.WOOD)));
	public static final RegistryObject<Block> pwood_tiger_bridge_pier = createBlock("premium_wood", "pwood_tiger_bridge_pier", () -> new Bridge_Support(BlockBehaviour.Properties.of(Material.WOOD).strength(0.5F, 2.5F).sound(SoundType.WOOD)));
	public static final RegistryObject<Block> pwood_willow_bridge_pier = createBlock("premium_wood", "pwood_willow_bridge_pier", () -> new Bridge_Support(BlockBehaviour.Properties.of(Material.WOOD).strength(0.5F, 2.5F).sound(SoundType.WOOD)));

	public static final RegistryObject<Block> pwood_magic_log_bridge_stair = createBlock("premium_wood", "pwood_magic_log_bridge_stair", () -> new Bridge_Stairs(BlockBehaviour.Properties.of(Material.WOOD).strength(0.5F, 2.5F).sound(SoundType.WOOD)));
	public static final RegistryObject<Block> pwood_maple_log_bridge_stair = createBlock("premium_wood", "pwood_maple_log_bridge_stair", () -> new Bridge_Stairs(BlockBehaviour.Properties.of(Material.WOOD).strength(0.5F, 2.5F).sound(SoundType.WOOD)));
	public static final RegistryObject<Block> pwood_purple_heart_log_bridge_stair = createBlock("premium_wood", "pwood_purple_heart_log_bridge_stair", () -> new Bridge_Stairs(BlockBehaviour.Properties.of(Material.WOOD).strength(0.5F, 2.5F).sound(SoundType.WOOD)));
	public static final RegistryObject<Block> pwood_silverbell_log_bridge_stair = createBlock("premium_wood", "pwood_silverbell_log_bridge_stair", () -> new Bridge_Stairs(BlockBehaviour.Properties.of(Material.WOOD).strength(0.5F, 2.5F).sound(SoundType.WOOD)));
	public static final RegistryObject<Block> pwood_tiger_log_bridge_stair = createBlock("premium_wood", "pwood_tiger_log_bridge_stair", () -> new Bridge_Stairs(BlockBehaviour.Properties.of(Material.WOOD).strength(0.5F, 2.5F).sound(SoundType.WOOD)));
	public static final RegistryObject<Block> pwood_willow_log_bridge_stair = createBlock("premium_wood", "pwood_willow_log_bridge_stair", () -> new Bridge_Stairs(BlockBehaviour.Properties.of(Material.WOOD).strength(0.5F, 2.5F).sound(SoundType.WOOD)));

	public static final RegistryObject<Block> pwood_magic_rope_bridge_stair = createBlock("premium_wood", "pwood_magic_rope_bridge_stair", () -> new Bridge_Stairs(BlockBehaviour.Properties.of(Material.WOOD).strength(0.5F, 2.5F).sound(SoundType.WOOD)));
	public static final RegistryObject<Block> pwood_maple_rope_bridge_stair = createBlock("premium_wood", "pwood_maple_rope_bridge_stair", () -> new Bridge_Stairs(BlockBehaviour.Properties.of(Material.WOOD).strength(0.5F, 2.5F).sound(SoundType.WOOD)));
	public static final RegistryObject<Block> pwood_purple_heart_rope_bridge_stair = createBlock("premium_wood", "pwood_purple_heart_rope_bridge_stair", () -> new Bridge_Stairs(BlockBehaviour.Properties.of(Material.WOOD).strength(0.5F, 2.5F).sound(SoundType.WOOD)));
	public static final RegistryObject<Block> pwood_silverbell_rope_bridge_stair = createBlock("premium_wood", "pwood_silverbell_rope_bridge_stair", () -> new Bridge_Stairs(BlockBehaviour.Properties.of(Material.WOOD).strength(0.5F, 2.5F).sound(SoundType.WOOD)));
	public static final RegistryObject<Block> pwood_tiger_rope_bridge_stair = createBlock("premium_wood", "pwood_tiger_rope_bridge_stair", () -> new Bridge_Stairs(BlockBehaviour.Properties.of(Material.WOOD).strength(0.5F, 2.5F).sound(SoundType.WOOD)));
	public static final RegistryObject<Block> pwood_willow_rope_bridge_stair = createBlock("premium_wood", "pwood_willow_rope_bridge_stair", () -> new Bridge_Stairs(BlockBehaviour.Properties.of(Material.WOOD).strength(0.5F, 2.5F).sound(SoundType.WOOD)));

	public static final RegistryObject<Block> pwood_magic_rail_bridge = createBlock("premium_wood", "pwood_magic_rail_bridge", () -> new Rail_Bridge(BlockBehaviour.Properties.of(Material.WOOD).noOcclusion().strength(0.5F, 2.5F).sound(SoundType.WOOD)));
	public static final RegistryObject<Block> pwood_maple_rail_bridge = createBlock("premium_wood", "pwood_maple_rail_bridge", () -> new Rail_Bridge(BlockBehaviour.Properties.of(Material.WOOD).noOcclusion().strength(0.5F, 2.5F).sound(SoundType.WOOD)));
	public static final RegistryObject<Block> pwood_purple_heart_rail_bridge = createBlock("premium_wood", "pwood_purple_heart_rail_bridge", () -> new Rail_Bridge(BlockBehaviour.Properties.of(Material.WOOD).noOcclusion().strength(0.5F, 2.5F).sound(SoundType.WOOD)));
	public static final RegistryObject<Block> pwood_silverbell_rail_bridge = createBlock("premium_wood", "pwood_silverbell_rail_bridge", () -> new Rail_Bridge(BlockBehaviour.Properties.of(Material.WOOD).noOcclusion().strength(0.5F, 2.5F).sound(SoundType.WOOD)));
	public static final RegistryObject<Block> pwood_tiger_rail_bridge = createBlock("premium_wood", "pwood_tiger_rail_bridge", () -> new Rail_Bridge(BlockBehaviour.Properties.of(Material.WOOD).noOcclusion().strength(0.5F, 2.5F).sound(SoundType.WOOD)));
	public static final RegistryObject<Block> pwood_willow_rail_bridge = createBlock("premium_wood", "pwood_willow_rail_bridge", () -> new Rail_Bridge(BlockBehaviour.Properties.of(Material.WOOD).noOcclusion().strength(0.5F, 2.5F).sound(SoundType.WOOD)));
	
	public static RegistryObject<Block> createBlock(String modid, String name, Supplier<? extends Block> supplier)
    {
        RegistryObject<Block> block = BLOCKS_REGISTRY.register(name, supplier);
        if(ModList.get().isLoaded(modid))
        {
            ITEMS_REGISTRY.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
        }
        return block;
    }
}