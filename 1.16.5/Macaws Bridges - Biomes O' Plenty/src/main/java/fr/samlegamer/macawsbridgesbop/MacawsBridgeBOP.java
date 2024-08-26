package fr.samlegamer.macawsbridgesbop;

import java.util.List;
import fr.samlegamer.addonslib.Registration;
import fr.samlegamer.addonslib.bridges.Bridges;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
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
	        return new ItemStack(Bridges.getBridgeBlocks().get(0).get());
	    }
	};
	
	public MacawsBridgeBOP()
	{
		List<String> MAT_WOOD = List.of("cherry", "dead", "fir", "hellbark", "jacaranda", "magic", "mahogany", "palm", "redwood", "umbran", "willow");
		DeferredRegister<Block> blockReg = Registration.blocks(MODID);
		DeferredRegister<Item> itemReg = Registration.items(MODID);
		Registration.init(blockReg, itemReg);
		Bridges.setRegistrationWood(MAT_WOOD, blockReg, itemReg, MBBOP_TAB);
		FMLJavaModLoadingContext.get().getModEventBus().addListener(Bridges::setupClient);
	}
}