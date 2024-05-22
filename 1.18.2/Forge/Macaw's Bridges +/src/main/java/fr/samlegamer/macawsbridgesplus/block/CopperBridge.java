package fr.samlegamer.macawsbridgesplus.block;

import java.util.Optional;
import java.util.Random;

import com.mcwbridges.kikoz.objects.Log_Bridge;

import fr.samlegamer.macawsbridgesplus.block.interfaces.WeatheringCopperBridges;
import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.AxeItem;
import net.minecraft.world.item.HoneycombItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.ShovelItem;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraftforge.common.ToolAction;
import net.minecraftforge.common.ToolActions;

public class CopperBridge extends Log_Bridge implements WeatheringCopperBridges
{
	private final WeatheringCopperBridges.WeatherState weatherState;

	public CopperBridge(WeatheringCopperBridges.WeatherState copper, Properties properties)
	{
		super(properties);
	    this.weatherState = copper;
	}
	
	   public void randomTick(BlockState p_154929_, ServerLevel p_154930_, BlockPos p_154931_, Random p_154932_) {
		      this.onRandomTick(p_154929_, p_154930_, p_154931_, p_154932_);
		   }

		   public boolean isRandomlyTicking(BlockState p_154935_) {
		      return WeatheringCopperBridges.getNext(p_154935_.getBlock()).isPresent();
		   }

		   public WeatheringCopperBridges.WeatherState getAge() {
		      return this.weatherState;
		   }
		   
		   @Override
		   public BlockState getToolModifiedState(BlockState state, Level world, BlockPos pos, Player player, ItemStack stack, ToolAction toolAction)
		   {
		        if (!stack.canPerformAction(toolAction)) return null;
		        if (ToolActions.AXE_STRIP.equals(toolAction)) return AxeItem.getAxeStrippingState(state);
		        else if(ToolActions.AXE_SCRAPE.equals(toolAction)) return WeatheringCopperBridges.getPrevious(state).orElse(null);
		        else if(ToolActions.AXE_WAX_OFF.equals(toolAction)) return Optional.ofNullable(HoneycombItem.WAX_OFF_BY_BLOCK.get().get(state.getBlock())).map((p_150694_) -> {
		            return p_150694_.withPropertiesOf(state);
		        }).orElse(null);
		        //else if(ToolActions.HOE_TILL.equals(toolAction)) return HoeItem.getHoeTillingState(state); //TODO HoeItem bork
		        else if (ToolActions.SHOVEL_FLATTEN.equals(toolAction)) return ShovelItem.getShovelPathingState(state);
		        return null;
		}
}