package fr.samlegamer.cave_and_cliff_part_II.roof.init;

import java.util.ArrayList;

import fr.samlegamer.cave_and_cliff_part_II.roof.MCRRecipesGen;
import fr.samlegamer.cave_and_cliff_part_II.roof.MRTagGenerator;
import fr.samlegamer.cave_and_cliff_part_II.roof.MacawsRoofNewJsonApi;

public class InitAllRoofs
{
	public static void init(String LOCATION, String CompatModid, String TextureLocationFormodid, String ModidExtended, ArrayList<String> MATERIAL, boolean isStem)
	{
		MRTagGenerator.AxeDataGen(LOCATION, CompatModid, MATERIAL);
		MCRRecipesGen.init(LOCATION);
		MacawsRoofNewJsonApi.init(LOCATION);

		for(String i : MATERIAL)
		{
			MacawsRoofNewJsonApi.Log_Attic_Roof.createBlockstate(LOCATION, CompatModid, i);
			MacawsRoofNewJsonApi.Log_Attic_Roof.createModelsBlock(LOCATION, TextureLocationFormodid, i, isStem);
			MacawsRoofNewJsonApi.Log_Attic_Roof.createModelsItem(LOCATION, CompatModid, i);
			
			MacawsRoofNewJsonApi.Planks_Attic_Roof.createBlockstate(LOCATION, CompatModid, i);
			MacawsRoofNewJsonApi.Planks_Attic_Roof.createModelsBlock(LOCATION, TextureLocationFormodid, i, isStem);
			MacawsRoofNewJsonApi.Planks_Attic_Roof.createModelsItem(LOCATION, CompatModid, i);

			MacawsRoofNewJsonApi.Log_Cube_Roof.createBlockstate(LOCATION, CompatModid, i);
			MacawsRoofNewJsonApi.Log_Cube_Roof.createModelsBlock(LOCATION, TextureLocationFormodid, i, isStem);
			MacawsRoofNewJsonApi.Log_Cube_Roof.createModelsItem(LOCATION, CompatModid, i);

			MacawsRoofNewJsonApi.Planks_Cube_Roof.createBlockstate(LOCATION, CompatModid, i);
			MacawsRoofNewJsonApi.Planks_Cube_Roof.createModelsBlock(LOCATION, TextureLocationFormodid, i, isStem);
			MacawsRoofNewJsonApi.Planks_Cube_Roof.createModelsItem(LOCATION, CompatModid, i);

			MacawsRoofNewJsonApi.Log_Lower_Roof.createBlockstate(LOCATION, CompatModid, i);
			MacawsRoofNewJsonApi.Log_Lower_Roof.createModelsBlock(LOCATION, TextureLocationFormodid, i, isStem);
			MacawsRoofNewJsonApi.Log_Lower_Roof.createModelsItem(LOCATION, CompatModid, i);

			MacawsRoofNewJsonApi.Planks_Lower_Roof.createBlockstate(LOCATION, CompatModid, i);
			MacawsRoofNewJsonApi.Planks_Lower_Roof.createModelsBlock(LOCATION, TextureLocationFormodid, i, isStem);
			MacawsRoofNewJsonApi.Planks_Lower_Roof.createModelsItem(LOCATION, CompatModid, i);

			MacawsRoofNewJsonApi.Log_Roof.createBlockstate(LOCATION, CompatModid, i);
			MacawsRoofNewJsonApi.Log_Roof.createModelsBlock(LOCATION, TextureLocationFormodid, i, isStem);
			MacawsRoofNewJsonApi.Log_Roof.createModelsItem(LOCATION, CompatModid, i);

			MacawsRoofNewJsonApi.Planks_Roof.createBlockstate(LOCATION, CompatModid, i);
			MacawsRoofNewJsonApi.Planks_Roof.createModelsBlock(LOCATION, TextureLocationFormodid, i, isStem);
			MacawsRoofNewJsonApi.Planks_Roof.createModelsItem(LOCATION, CompatModid, i);

			MacawsRoofNewJsonApi.Log_Steep_Roof.createBlockstate(LOCATION, CompatModid, i);
			MacawsRoofNewJsonApi.Log_Steep_Roof.createModelsBlock(LOCATION, TextureLocationFormodid, i, isStem);
			MacawsRoofNewJsonApi.Log_Steep_Roof.createModelsItem(LOCATION, CompatModid, i);

			MacawsRoofNewJsonApi.Log_Top_Roof.createBlockstate(LOCATION, CompatModid, i);
			MacawsRoofNewJsonApi.Log_Top_Roof.createModelsBlock(LOCATION, TextureLocationFormodid, i, isStem);
			MacawsRoofNewJsonApi.Log_Top_Roof.createModelsItem(LOCATION, CompatModid, i);

			MacawsRoofNewJsonApi.Planks_Steep_Roof.createBlockstate(LOCATION, CompatModid, i);
			MacawsRoofNewJsonApi.Planks_Steep_Roof.createModelsBlock(LOCATION, TextureLocationFormodid, i, isStem);
			MacawsRoofNewJsonApi.Planks_Steep_Roof.createModelsItem(LOCATION, CompatModid, i);

			MacawsRoofNewJsonApi.Planks_Top_Roof.createBlockstate(LOCATION, CompatModid, i);
			MacawsRoofNewJsonApi.Planks_Top_Roof.createModelsBlock(LOCATION, TextureLocationFormodid, i, isStem);
			MacawsRoofNewJsonApi.Planks_Top_Roof.createModelsItem(LOCATION, CompatModid, i);

			MacawsRoofNewJsonApi.UpperLog_Lower_Roof.createBlockstate(LOCATION, CompatModid, i);
			//MacawsRoofNewJsonApi.UpperLog_Lower_Roof.createModelsBlock(LOCATION, TextureLocationFormodid, i, isStem);
			MacawsRoofNewJsonApi.UpperLog_Lower_Roof.createModelsItem(LOCATION, CompatModid, i);

			MacawsRoofNewJsonApi.UpperLog_Steep_Roof.createBlockstate(LOCATION, CompatModid, i);
			MacawsRoofNewJsonApi.UpperLog_Steep_Roof.createModelsBlock(LOCATION, TextureLocationFormodid, i, isStem);
			MacawsRoofNewJsonApi.UpperLog_Steep_Roof.createModelsItem(LOCATION, CompatModid, i);

			MacawsRoofNewJsonApi.UpperPlanks_Lower_Roof.createBlockstate(LOCATION, CompatModid, i);
			//MacawsRoofNewJsonApi.UpperPlanks_Lower_Roof.createModelsBlock(LOCATION, TextureLocationFormodid, i, isStem);
			MacawsRoofNewJsonApi.UpperPlanks_Lower_Roof.createModelsItem(LOCATION, CompatModid, i);

			MacawsRoofNewJsonApi.UpperPlanks_Steep_Roof.createBlockstate(LOCATION, CompatModid, i);
			MacawsRoofNewJsonApi.UpperPlanks_Steep_Roof.createModelsBlock(LOCATION, TextureLocationFormodid, i, isStem);
			MacawsRoofNewJsonApi.UpperPlanks_Steep_Roof.createModelsItem(LOCATION, CompatModid, i);

			
			MCRRecipesGen.AtticLog.loot_tables(LOCATION, CompatModid, i);
			MCRRecipesGen.AtticLog.recipe(LOCATION, ModidExtended, CompatModid, i, isStem);
			
			MCRRecipesGen.AtticPlanks.loot_tables(LOCATION, CompatModid, i);
			MCRRecipesGen.AtticPlanks.recipe(LOCATION, ModidExtended, CompatModid, i);

			MCRRecipesGen.CubeLog.loot_tables(LOCATION, CompatModid, i);
			MCRRecipesGen.CubeLog.recipe(LOCATION, ModidExtended, CompatModid, i, isStem);

			MCRRecipesGen.CubePlanks.loot_tables(LOCATION, CompatModid, i);
			MCRRecipesGen.CubePlanks.recipe(LOCATION, ModidExtended, CompatModid, i, isStem);

			MCRRecipesGen.LowerLog.loot_tables(LOCATION, CompatModid, i);
			MCRRecipesGen.LowerLog.recipe(LOCATION, ModidExtended, CompatModid, i, isStem);

			MCRRecipesGen.LowerPlanks.loot_tables(LOCATION, CompatModid, i);
			MCRRecipesGen.LowerPlanks.recipe(LOCATION, ModidExtended, CompatModid, i, isStem);

			MCRRecipesGen.RoofLog.loot_tables(LOCATION, CompatModid, i);
			MCRRecipesGen.RoofLog.recipe(LOCATION, ModidExtended, CompatModid, i, isStem);

			MCRRecipesGen.RoofPlanks.loot_tables(LOCATION, CompatModid, i);
			MCRRecipesGen.RoofPlanks.recipe(LOCATION, ModidExtended, CompatModid, i, isStem);

			MCRRecipesGen.SteepLog.loot_tables(LOCATION, CompatModid, i);
			MCRRecipesGen.SteepLog.recipe(LOCATION, ModidExtended, CompatModid, i, isStem);

			MCRRecipesGen.SteepPlanks.loot_tables(LOCATION, CompatModid, i);
			MCRRecipesGen.SteepPlanks.recipe(LOCATION, ModidExtended, CompatModid, i);

			MCRRecipesGen.TopLog.loot_tables(LOCATION, CompatModid, i);
			MCRRecipesGen.TopLog.recipe(LOCATION, ModidExtended, CompatModid, i, isStem);

			MCRRecipesGen.TopPlanks.loot_tables(LOCATION, CompatModid, i);
			MCRRecipesGen.TopPlanks.recipe(LOCATION, ModidExtended, CompatModid, i);

			MCRRecipesGen.UpperLowerLog.loot_tables(LOCATION, CompatModid, i);
			MCRRecipesGen.UpperLowerLog.recipe(LOCATION, ModidExtended, CompatModid, i, isStem);

			MCRRecipesGen.UpperLowerPlanks.loot_tables(LOCATION, CompatModid, i);
			MCRRecipesGen.UpperLowerPlanks.recipe(LOCATION, ModidExtended, CompatModid, i);

			MCRRecipesGen.UpperSteepPlanks.loot_tables(LOCATION, CompatModid, i);
			MCRRecipesGen.UpperSteepPlanks.recipe(LOCATION, ModidExtended, CompatModid, i, isStem);

			MCRRecipesGen.UpperSteepLog.loot_tables(LOCATION, CompatModid, i);
			MCRRecipesGen.UpperSteepLog.recipe(LOCATION, ModidExtended, CompatModid, i, isStem);
		}
	}
}
