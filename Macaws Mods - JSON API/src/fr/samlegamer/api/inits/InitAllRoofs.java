package fr.samlegamer.api.inits;

import java.util.ArrayList;

import fr.samlegamer.api.clientgen.roofs.MacawsRoofs;
import fr.samlegamer.api.datagen.roofs.MRRecipesGenerator;
import fr.samlegamer.api.datagen.roofs.MRTagGenerator;

public class InitAllRoofs
{
	public static void init(String LOCATION, String CompatModid, String TextureLocationFormodid, String ModidExtended, ArrayList<String> MATERIAL, boolean isStem)
	{
		MRTagGenerator.AxeDataGen(LOCATION, CompatModid, MATERIAL);
		MRRecipesGenerator.init(LOCATION);
		MacawsRoofs.init(LOCATION);

		for(String i : MATERIAL)
		{
			MacawsRoofs.Log_Attic_Roof.createBlockstate(LOCATION, CompatModid, i);
			MacawsRoofs.Log_Attic_Roof.createModelsBlock(LOCATION, TextureLocationFormodid, i, isStem);
			MacawsRoofs.Log_Attic_Roof.createModelsItem(LOCATION, CompatModid, i);
			
			MacawsRoofs.Planks_Attic_Roof.createBlockstate(LOCATION, CompatModid, i);
			MacawsRoofs.Planks_Attic_Roof.createModelsBlock(LOCATION, TextureLocationFormodid, i, isStem);
			MacawsRoofs.Planks_Attic_Roof.createModelsItem(LOCATION, CompatModid, i);

			MacawsRoofs.Log_Cube_Roof.createBlockstate(LOCATION, CompatModid, i);
			MacawsRoofs.Log_Cube_Roof.createModelsBlock(LOCATION, TextureLocationFormodid, i, isStem);
			MacawsRoofs.Log_Cube_Roof.createModelsItem(LOCATION, CompatModid, i);

			MacawsRoofs.Planks_Cube_Roof.createBlockstate(LOCATION, CompatModid, i);
			MacawsRoofs.Planks_Cube_Roof.createModelsBlock(LOCATION, TextureLocationFormodid, i, isStem);
			MacawsRoofs.Planks_Cube_Roof.createModelsItem(LOCATION, CompatModid, i);

			MacawsRoofs.Log_Lower_Roof.createBlockstate(LOCATION, CompatModid, i);
			MacawsRoofs.Log_Lower_Roof.createModelsBlock(LOCATION, TextureLocationFormodid, i, isStem);
			MacawsRoofs.Log_Lower_Roof.createModelsItem(LOCATION, CompatModid, i);

			MacawsRoofs.Planks_Lower_Roof.createBlockstate(LOCATION, CompatModid, i);
			MacawsRoofs.Planks_Lower_Roof.createModelsBlock(LOCATION, TextureLocationFormodid, i, isStem);
			MacawsRoofs.Planks_Lower_Roof.createModelsItem(LOCATION, CompatModid, i);

			MacawsRoofs.Log_Roof.createBlockstate(LOCATION, CompatModid, i);
			MacawsRoofs.Log_Roof.createModelsBlock(LOCATION, TextureLocationFormodid, i, isStem);
			MacawsRoofs.Log_Roof.createModelsItem(LOCATION, CompatModid, i);

			MacawsRoofs.Planks_Roof.createBlockstate(LOCATION, CompatModid, i);
			MacawsRoofs.Planks_Roof.createModelsBlock(LOCATION, TextureLocationFormodid, i, isStem);
			MacawsRoofs.Planks_Roof.createModelsItem(LOCATION, CompatModid, i);

			MacawsRoofs.Log_Steep_Roof.createBlockstate(LOCATION, CompatModid, i);
			MacawsRoofs.Log_Steep_Roof.createModelsBlock(LOCATION, TextureLocationFormodid, i, isStem);
			MacawsRoofs.Log_Steep_Roof.createModelsItem(LOCATION, CompatModid, i);

			MacawsRoofs.Log_Top_Roof.createBlockstate(LOCATION, CompatModid, i);
			MacawsRoofs.Log_Top_Roof.createModelsBlock(LOCATION, TextureLocationFormodid, i, isStem);
			MacawsRoofs.Log_Top_Roof.createModelsItem(LOCATION, CompatModid, i);

			MacawsRoofs.Planks_Steep_Roof.createBlockstate(LOCATION, CompatModid, i);
			MacawsRoofs.Planks_Steep_Roof.createModelsBlock(LOCATION, TextureLocationFormodid, i, isStem);
			MacawsRoofs.Planks_Steep_Roof.createModelsItem(LOCATION, CompatModid, i);

			MacawsRoofs.Planks_Top_Roof.createBlockstate(LOCATION, CompatModid, i);
			MacawsRoofs.Planks_Top_Roof.createModelsBlock(LOCATION, TextureLocationFormodid, i, isStem);
			MacawsRoofs.Planks_Top_Roof.createModelsItem(LOCATION, CompatModid, i);

			MacawsRoofs.UpperLog_Lower_Roof.createBlockstate(LOCATION, CompatModid, i);
			//MacawsRoofNewJsonApi.UpperLog_Lower_Roof.createModelsBlock(LOCATION, TextureLocationFormodid, i, isStem);
			MacawsRoofs.UpperLog_Lower_Roof.createModelsItem(LOCATION, CompatModid, i);

			MacawsRoofs.UpperLog_Steep_Roof.createBlockstate(LOCATION, CompatModid, i);
			MacawsRoofs.UpperLog_Steep_Roof.createModelsBlock(LOCATION, TextureLocationFormodid, i, isStem);
			MacawsRoofs.UpperLog_Steep_Roof.createModelsItem(LOCATION, CompatModid, i);

			MacawsRoofs.UpperPlanks_Lower_Roof.createBlockstate(LOCATION, CompatModid, i);
			//MacawsRoofNewJsonApi.UpperPlanks_Lower_Roof.createModelsBlock(LOCATION, TextureLocationFormodid, i, isStem);
			MacawsRoofs.UpperPlanks_Lower_Roof.createModelsItem(LOCATION, CompatModid, i);

			MacawsRoofs.UpperPlanks_Steep_Roof.createBlockstate(LOCATION, CompatModid, i);
			MacawsRoofs.UpperPlanks_Steep_Roof.createModelsBlock(LOCATION, TextureLocationFormodid, i, isStem);
			MacawsRoofs.UpperPlanks_Steep_Roof.createModelsItem(LOCATION, CompatModid, i);

			
			MRRecipesGenerator.AtticLog.loot_tables(LOCATION, CompatModid, i);
			MRRecipesGenerator.AtticLog.recipe(LOCATION, ModidExtended, CompatModid, i, isStem);
			
			MRRecipesGenerator.AtticPlanks.loot_tables(LOCATION, CompatModid, i);
			MRRecipesGenerator.AtticPlanks.recipe(LOCATION, ModidExtended, CompatModid, i);

			MRRecipesGenerator.CubeLog.loot_tables(LOCATION, CompatModid, i);
			MRRecipesGenerator.CubeLog.recipe(LOCATION, ModidExtended, CompatModid, i, isStem);

			MRRecipesGenerator.CubePlanks.loot_tables(LOCATION, CompatModid, i);
			MRRecipesGenerator.CubePlanks.recipe(LOCATION, ModidExtended, CompatModid, i, isStem);

			MRRecipesGenerator.LowerLog.loot_tables(LOCATION, CompatModid, i);
			MRRecipesGenerator.LowerLog.recipe(LOCATION, ModidExtended, CompatModid, i, isStem);

			MRRecipesGenerator.LowerPlanks.loot_tables(LOCATION, CompatModid, i);
			MRRecipesGenerator.LowerPlanks.recipe(LOCATION, ModidExtended, CompatModid, i, isStem);

			MRRecipesGenerator.RoofLog.loot_tables(LOCATION, CompatModid, i);
			MRRecipesGenerator.RoofLog.recipe(LOCATION, ModidExtended, CompatModid, i, isStem);

			MRRecipesGenerator.RoofPlanks.loot_tables(LOCATION, CompatModid, i);
			MRRecipesGenerator.RoofPlanks.recipe(LOCATION, ModidExtended, CompatModid, i, isStem);

			MRRecipesGenerator.SteepLog.loot_tables(LOCATION, CompatModid, i);
			MRRecipesGenerator.SteepLog.recipe(LOCATION, ModidExtended, CompatModid, i, isStem);

			MRRecipesGenerator.SteepPlanks.loot_tables(LOCATION, CompatModid, i);
			MRRecipesGenerator.SteepPlanks.recipe(LOCATION, ModidExtended, CompatModid, i);

			MRRecipesGenerator.TopLog.loot_tables(LOCATION, CompatModid, i);
			MRRecipesGenerator.TopLog.recipe(LOCATION, ModidExtended, CompatModid, i, isStem);

			MRRecipesGenerator.TopPlanks.loot_tables(LOCATION, CompatModid, i);
			MRRecipesGenerator.TopPlanks.recipe(LOCATION, ModidExtended, CompatModid, i);

			MRRecipesGenerator.UpperLowerLog.loot_tables(LOCATION, CompatModid, i);
			MRRecipesGenerator.UpperLowerLog.recipe(LOCATION, ModidExtended, CompatModid, i, isStem);

			MRRecipesGenerator.UpperLowerPlanks.loot_tables(LOCATION, CompatModid, i);
			MRRecipesGenerator.UpperLowerPlanks.recipe(LOCATION, ModidExtended, CompatModid, i);

			MRRecipesGenerator.UpperSteepPlanks.loot_tables(LOCATION, CompatModid, i);
			MRRecipesGenerator.UpperSteepPlanks.recipe(LOCATION, ModidExtended, CompatModid, i, isStem);

			MRRecipesGenerator.UpperSteepLog.loot_tables(LOCATION, CompatModid, i);
			MRRecipesGenerator.UpperSteepLog.recipe(LOCATION, ModidExtended, CompatModid, i, isStem);
		}
	}
}
