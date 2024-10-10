package fr.samlegamer.macawsbridgesbop;

import java.util.List;
import java.util.Arrays;
import fr.samlegamer.addonslib.Registration;
import fr.samlegamer.addonslib.bridges.Bridges;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;

@Mod(value = MacawsBridgeBOP.MODID)
public class MacawsBridgeBOP
{
	public static final String MODID = "macawsbridgesbop";
	public static final ItemGroup MBBOP_TAB = new ItemGroup(MODID + ".tab") {
	    @Override
	    public ItemStack makeIcon() {
	        return new ItemStack(LOGO.get());
	    }
	};
	private static final DeferredRegister<Block> blockReg = Registration.blocks(MODID);
	private static final DeferredRegister<Item> itemReg = Registration.items(MODID);

	protected static final RegistryObject<Item> LOGO = itemReg.register("logo", ()-> new Item(new Item.Properties()));
	
	public MacawsBridgeBOP()
	{
		Bridges.getBridgeBlocks().clear();
		List<String> MAT_WOOD = Arrays.asList("cherry", "dead", "fir", "hellbark", "jacaranda", "magic", "mahogany", "palm", "redwood", "umbran", "willow");
		Registration.init(blockReg, itemReg);
		Bridges.setRegistrationWood(MAT_WOOD, blockReg, itemReg, MBBOP_TAB);
		FMLJavaModLoadingContext.get().getModEventBus().addListener(Bridges::setupClient);
		
	}
}