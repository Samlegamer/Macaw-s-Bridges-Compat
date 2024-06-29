package fr.samlegamer.macawsbridgesplus.block;

import java.util.Optional;
import java.util.Random;
import com.mcwbridges.kikoz.objects.Log_Bridge;
import fr.samlegamer.macawsbridgesplus.block.interfaces.WeatheringCopperBridges;
import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.block.state.BlockState;

public class CopperBridge extends Log_Bridge implements WeatheringCopperBridges
{
	private final WeatheringCopperBridges.WeatherState weatherState;

	public CopperBridge(WeatheringCopperBridges.WeatherState copper, Properties properties)
	{
		super(properties);
	    this.weatherState = copper;
	}
	
	   public void randomTick(BlockState p_154929_, ServerLevel p_154930_, BlockPos p_154931_, Random p_154932_) {
		      this.randomTick(p_154929_, p_154930_, p_154931_, p_154932_);
		   }

		   public boolean isRandomlyTicking(BlockState p_154935_) {
		      return WeatheringCopperBridges.getNext(p_154935_.getBlock()).isPresent();
		   }

		   public WeatheringCopperBridges.WeatherState getAge() {
		      return this.weatherState;
		   }
		   
		   @Override
		public Optional<BlockState> getNextState(BlockState p_311503_, ServerLevel p_311331_, BlockPos p_309459_,
				RandomSource p_312041_) {
			// TODO Auto-generated method stub
			return WeatheringCopperBridges.super.getNextState(p_311503_, p_311331_, p_309459_, p_312041_);
		}
}