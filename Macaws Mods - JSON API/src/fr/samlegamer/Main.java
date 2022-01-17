package fr.samlegamer;

import java.util.ArrayList;

import fr.samlegamer.code.MacawsBridgesCode;
import fr.samlegamer.mods.MacawsBridges;
import fr.samlegamer.mods.RecipesGeneratorMacawsBridges;

public class Main
{
	public static final String LOCATION = "C://Users/ExampleDude/Documents/MyDirectory/";  //Path
	public static final String CompatModid = "mcwbridgesbayoublues"; //The modid of compat, No :
	public static final String TextureLocationFormodid = "bayou_blues:block"; //modid:block (don't change "block")
	public static final String ModidExtended = "bayou_blues";
	
	public static final String WALL = "";	// !ONLY FOR STONE! this is wall texture in the bridge
	public static final String FLOOR = "";		// !ONLY FOR STONE! this is floor texture in the bridge
	public static final String MATERIAL_NAME = "";
	
	public static final ArrayList<String> MATERIAL = new ArrayList<>();
	public static final ArrayList<String> MAJ_MAT = new ArrayList<>();

	public static final String ClassMod = ""; // BlocksRegistry
	
	public static void main(String[] args)
	{
		MATERIAL.add("cypress");

		RecipesGeneratorMacawsBridges.init(LOCATION);
		MacawsBridges.init(LOCATION);
		MacawsBridgesCode.init(LOCATION);
		
		
		MacawsBridgesCode.RenderType.BridgeLog(LOCATION, MATERIAL, ClassMod);
		MacawsBridgesCode.RenderType.RopeBridge(LOCATION, MATERIAL, ClassMod);
		MacawsBridgesCode.RenderType.BridgeRail(LOCATION, MATERIAL, ClassMod);
		MacawsBridgesCode.RenderType.PierBridgeWood(LOCATION, MATERIAL, ClassMod);
		MacawsBridgesCode.RenderType.BridgeStairsLog(LOCATION, MATERIAL, ClassMod);

		MacawsBridgesCode.BlockRegistry.BridgeLog(LOCATION, MATERIAL);
		MacawsBridgesCode.BlockRegistry.RopeBridge(LOCATION, MATERIAL);
		MacawsBridgesCode.BlockRegistry.BridgeRail(LOCATION, MATERIAL);
		MacawsBridgesCode.BlockRegistry.PierBridgeWood(LOCATION, MATERIAL);
		MacawsBridgesCode.BlockRegistry.BridgeStairsLog(LOCATION, MATERIAL);
		
		for(String i : MATERIAL)
		{
			MacawsBridges.BridgeLog.createBlockstate(LOCATION, CompatModid, i);
			MacawsBridges.BridgeLog.createModelBlock(LOCATION, TextureLocationFormodid, i, false);
			MacawsBridges.BridgeLog.createModelItem(LOCATION, CompatModid, i);

			MacawsBridges.RopeBridge.createBlockstate(LOCATION, CompatModid, i);
			MacawsBridges.RopeBridge.createModelBlock(LOCATION, TextureLocationFormodid, i, false);
			MacawsBridges.RopeBridge.createModelItem(LOCATION, CompatModid, i);

			MacawsBridges.BridgeRailWood.createBlockstate(LOCATION, CompatModid, i);
			MacawsBridges.BridgeRailWood.createModelBlock(LOCATION, TextureLocationFormodid, i, false);
			MacawsBridges.BridgeRailWood.createModelItem(LOCATION, CompatModid, i);

			MacawsBridges.PierWood.createBlockstate(LOCATION, CompatModid, i);
			MacawsBridges.PierWood.createModelBlock(LOCATION, TextureLocationFormodid, i, false);
			MacawsBridges.PierWood.createModelItem(LOCATION, CompatModid, i);

			MacawsBridges.StairWood.createBlockstate(LOCATION, CompatModid, i);
			MacawsBridges.StairWood.createModelBlock(LOCATION, TextureLocationFormodid, i, false);
			MacawsBridges.StairWood.createModelItem(LOCATION, CompatModid, i);

			RecipesGeneratorMacawsBridges.BridgeLog.loot_tablesGen(LOCATION, CompatModid, i);
			RecipesGeneratorMacawsBridges.BridgeLog.recipeGen(LOCATION, ModidExtended, CompatModid, i);
			
			RecipesGeneratorMacawsBridges.RopeBridge.loot_tablesGen(LOCATION, CompatModid, i);
			RecipesGeneratorMacawsBridges.RopeBridge.recipeGen(LOCATION, ModidExtended, CompatModid, i);
			
			RecipesGeneratorMacawsBridges.Rails.loot_tablesGen(LOCATION, CompatModid, i);
			RecipesGeneratorMacawsBridges.Rails.recipeGen(LOCATION, ModidExtended, CompatModid, i);

			RecipesGeneratorMacawsBridges.Pier.loot_tablesGen(LOCATION, CompatModid, i);
			RecipesGeneratorMacawsBridges.Pier.recipeGen(LOCATION, ModidExtended, CompatModid, i, false, false);

			RecipesGeneratorMacawsBridges.Stairs.loot_tablesGen(LOCATION, CompatModid, i, false);
			RecipesGeneratorMacawsBridges.Stairs.recipeGen(LOCATION, CompatModid, i, false);
		}
		
		/*
		MacawsBridges.BridgeStone.createBlockstate(LOCATION, CompatModid, MATERIAL_NAME);
		MacawsBridges.BridgeStone.createModelBlock(LOCATION, TextureLocationFormodid, MATERIAL_NAME, WALL, FLOOR);
		MacawsBridges.BridgeStone.createModelItem(LOCATION, CompatModid, MATERIAL_NAME);

		MacawsBridges.PierStone.createBlockstate(LOCATION, CompatModid, MATERIAL_NAME);
		MacawsBridges.PierStone.createModelBlock(LOCATION, TextureLocationFormodid, MATERIAL_NAME, WALL);
		MacawsBridges.PierStone.createModelItem(LOCATION, CompatModid, MATERIAL_NAME);

		MacawsBridges.StairStone.createBlockstate(LOCATION, CompatModid, MATERIAL_NAME);
		MacawsBridges.StairStone.createModelBlock(LOCATION, TextureLocationFormodid, MATERIAL_NAME, WALL, FLOOR);
		MacawsBridges.StairStone.createModelItem(LOCATION, CompatModid, MATERIAL_NAME);

		RecipesGeneratorMacawsBridges.BridgeStone.loot_tablesGen(LOCATION, CompatModid, MATERIAL_NAME);
		RecipesGeneratorMacawsBridges.BridgeStone.recipeGen(LOCATION, modid, CompatModid, MATERIAL_NAME);

		RecipesGeneratorMacawsBridges.Pier.loot_tablesGen(LOCATION, CompatModid, MATERIAL_NAME);
		RecipesGeneratorMacawsBridges.Pier.recipeGen(LOCATION, modid, CompatModid, MATERIAL_NAME, true, false);

		RecipesGeneratorMacawsBridges.Stairs.loot_tablesGen(LOCATION, CompatModid, MATERIAL_NAME, true);
		RecipesGeneratorMacawsBridges.Stairs.recipeGen(LOCATION, CompatModid, MATERIAL_NAME, true);
		 */
		
		System.out.println("END");
		
		/*
		for(String str : MATERIAL)
		{
			MacawsRoofs.Log_Roof.createBlockstate(LOCATION, CompatModid, str);
			MacawsRoofs.Log_Roof.createModelsBlock(LOCATION, TextureLocationFormodid, str, false);
			MacawsRoofs.Log_Roof.createModelsItem(LOCATION, CompatModid, str);

			MacawsRoofs.Planks_Roof.createBlockstate(LOCATION, CompatModid, str);
			MacawsRoofs.Planks_Roof.createModelsBlock(LOCATION, TextureLocationFormodid, str, false);
			MacawsRoofs.Planks_Roof.createModelsItem(LOCATION, CompatModid, str);
			
			MacawsRoofs.Log_Attic_Roof.createBlockstate(LOCATION, CompatModid, str);
			MacawsRoofs.Log_Attic_Roof.createModelsBlock(LOCATION, TextureLocationFormodid, str, false);
			MacawsRoofs.Log_Attic_Roof.createModelsItem(LOCATION, CompatModid, str);
			
			MacawsRoofs.Planks_Attic_Roof.createBlockstate(LOCATION, CompatModid, str);
			MacawsRoofs.Planks_Attic_Roof.createModelsBlock(LOCATION, TextureLocationFormodid, str, false);
			MacawsRoofs.Planks_Attic_Roof.createModelsItem(LOCATION, CompatModid, str);
			
			MacawsRoofs.Log_Cube_Roof.createBlockstate(LOCATION, CompatModid, str);
			MacawsRoofs.Log_Cube_Roof.createModelsBlock(LOCATION, TextureLocationFormodid, str, false);
			MacawsRoofs.Log_Cube_Roof.createModelsItem(LOCATION, CompatModid, str);
			
			MacawsRoofs.Planks_Cube_Roof.createBlockstate(LOCATION, CompatModid, str);
			MacawsRoofs.Planks_Cube_Roof.createModelsBlock(LOCATION, TextureLocationFormodid, str, false);
			MacawsRoofs.Planks_Cube_Roof.createModelsItem(LOCATION, CompatModid, str);

			MacawsRoofs.Log_Four_Way_Roof.createBlockstate(LOCATION, CompatModid, str);
			MacawsRoofs.Log_Four_Way_Roof.createModelsBlock(LOCATION, TextureLocationFormodid, str, false);
			MacawsRoofs.Log_Four_Way_Roof.createModelsItem(LOCATION, CompatModid, str);
			
			MacawsRoofs.Planks_Four_Way_Roof.createBlockstate(LOCATION, CompatModid, str);
			MacawsRoofs.Planks_Four_Way_Roof.createModelsBlock(LOCATION, TextureLocationFormodid, str, false);
			MacawsRoofs.Planks_Four_Way_Roof.createModelsItem(LOCATION, CompatModid, str);
			
			MacawsRoofs.Log_Lower_Roof.createBlockstate(LOCATION, CompatModid, str);
			MacawsRoofs.Log_Lower_Roof.createModelsBlock(LOCATION, TextureLocationFormodid, str, false);
			MacawsRoofs.Log_Lower_Roof.createModelsItem(LOCATION, CompatModid, str);
			
			MacawsRoofs.Planks_Lower_Roof.createBlockstate(LOCATION, CompatModid, str);
			MacawsRoofs.Planks_Lower_Roof.createModelsBlock(LOCATION, TextureLocationFormodid, str, false);
			MacawsRoofs.Planks_Lower_Roof.createModelsItem(LOCATION, CompatModid, str);
			
			MacawsRoofs.Log_Steep_Roof.createBlockstate(LOCATION, CompatModid, str);
			MacawsRoofs.Log_Steep_Roof.createModelsBlock(LOCATION, TextureLocationFormodid, str, false);
			MacawsRoofs.Log_Steep_Roof.createModelsItem(LOCATION, CompatModid, str);
			
			MacawsRoofs.Planks_Steep_Roof.createBlockstate(LOCATION, CompatModid, str);
			MacawsRoofs.Planks_Steep_Roof.createModelsBlock(LOCATION, TextureLocationFormodid, str, false);
			MacawsRoofs.Planks_Steep_Roof.createModelsItem(LOCATION, CompatModid, str);
			
			MacawsRoofs.Log_Three_Way_Roof.createBlockstate(LOCATION, CompatModid, str);
			MacawsRoofs.Log_Three_Way_Roof.createModelsBlock(LOCATION, TextureLocationFormodid, str, false);
			MacawsRoofs.Log_Three_Way_Roof.createModelsItem(LOCATION, CompatModid, str);
			
			MacawsRoofs.Planks_Three_Way_Roof.createBlockstate(LOCATION, CompatModid, str);
			MacawsRoofs.Planks_Three_Way_Roof.createModelsBlock(LOCATION, TextureLocationFormodid, str, false);
			MacawsRoofs.Planks_Three_Way_Roof.createModelsItem(LOCATION, CompatModid, str);
			
			MacawsRoofs.Log_Top_Roof.createBlockstate(LOCATION, CompatModid, str);
			MacawsRoofs.Log_Top_Roof.createModelsBlock(LOCATION, TextureLocationFormodid, str, false);
			MacawsRoofs.Log_Top_Roof.createModelsItem(LOCATION, CompatModid, str);
			
			MacawsRoofs.Planks_Top_Roof.createBlockstate(LOCATION, CompatModid, str);
			MacawsRoofs.Planks_Top_Roof.createModelsBlock(LOCATION, TextureLocationFormodid, str, false);
			MacawsRoofs.Planks_Top_Roof.createModelsItem(LOCATION, CompatModid, str);

		}
		*/
		/*
		 */
	}
}