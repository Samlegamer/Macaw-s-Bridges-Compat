package fr.samlegamer;

import java.util.ArrayList;

import fr.samlegamer.mods.MacawsBridges;
import fr.samlegamer.mods.RecipesGeneratorMacawsBridges;

public class Main
{
	public static final String LOCATION = "C://Users/ExampleUser/Documents/ExampleFolder/";  //Path
	public static final String MODID = "macawsbridgesbop"; //The modid of compat, No :
	public static final String TextureLocationFormodid = "biomesoplenty:block"; //modid:block (don't change "block")
	
	public static final String WALL = "";	// !ONLY FOR STONE! this is wall texture in the bridge
	public static final String FLOOR = "";		// !ONLY FOR STONE! this is floor texture in the bridge
	
	public static final String MATERIAL_NAME = "";
	public static final String modidExtended = "biomesoplenty";
	
	public static final ArrayList<String> MATERIAL = new ArrayList<>();

	public static void main(String[] args)
	{
		int wood = 40;
		MATERIAL.add("cherry");
		MATERIAL.add("dead");
		MATERIAL.add("fir");
		MATERIAL.add("hellbark");
		MATERIAL.add("jacaranda");
		MATERIAL.add("magic");
		MATERIAL.add("mahogany");
		MATERIAL.add("palm");
		MATERIAL.add("redwood");
		MATERIAL.add("umbran");
		MATERIAL.add("willow");

		MacawsBridges.init(LOCATION);
		RecipesGeneratorMacawsBridges.init(LOCATION);
		
		for(int i = 0; i < wood; i++)
		{
			MacawsBridges.BridgeRailWood.createBlockstateBridgeLog(LOCATION, MODID, MATERIAL.get(i));
			MacawsBridges.BridgeRailWood.createModelBlockBridgeLog(LOCATION, TextureLocationFormodid, MATERIAL.get(i), false);
			MacawsBridges.BridgeRailWood.createModelItemBridgeLog(LOCATION, MODID, MATERIAL.get(i));
			
			MacawsBridges.StairWood.createBlockstateBridgeStair(LOCATION, MODID, MATERIAL.get(i));
			MacawsBridges.StairWood.createModelBlockBridgeStair(LOCATION, TextureLocationFormodid, MATERIAL.get(i), false);
			MacawsBridges.StairWood.createModelItemBridgeStair(LOCATION, MODID, MATERIAL.get(i));
			
			MacawsBridges.PierWood.createBlockstatePierWood(LOCATION, MODID, MATERIAL.get(i));
			MacawsBridges.PierWood.createModelBlockPierWood(LOCATION, TextureLocationFormodid, MATERIAL.get(i), false);
			MacawsBridges.PierWood.createModelItemPierWood(LOCATION, MODID, MATERIAL.get(i));

			RecipesGeneratorMacawsBridges.bridgeRailLootTablesGenerator(LOCATION, MODID, MATERIAL.get(i));
			RecipesGeneratorMacawsBridges.bridgeRailRecipeGenerator(LOCATION, modidExtended, MODID, MATERIAL.get(i));
			
			RecipesGeneratorMacawsBridges.bridgePierLootTablesGenerator(LOCATION, MODID, MATERIAL.get(i));
			RecipesGeneratorMacawsBridges.bridgePierRecipeGenerator(LOCATION, modidExtended, MODID, MATERIAL.get(i), false, false);

			RecipesGeneratorMacawsBridges.bridgeStairsLootTablesGenerator(LOCATION, MODID, MATERIAL.get(i), false);
			RecipesGeneratorMacawsBridges.bridgeStairsRecipeGenerator(LOCATION, MODID, MATERIAL.get(i), false);

		}
		
		//MacawsBridges.BridgeRailWood.createModelItemBridgeLog(LOCATION, MODID, MATERIAL_NAME);
		
		/*
		MacawsBridges.RopeBridge.createBlockstateRopeBridge(LOCATION, MODID, MATERIAL_NAME);
		MacawsBridges.RopeBridge.createModelBlockRopeBridge(LOCATION, TextureLocationFormodid, MATERIAL_NAME, false);
		MacawsBridges.RopeBridge.createModelItemRopeBridge(LOCATION, MODID, MATERIAL_NAME);
		MacawsBridges.BridgeRailWood.createBlockstateBridgeLog(LOCATION, MODID, MATERIAL_NAME);
		MacawsBridges.BridgeRailWood.createModelBlockBridgeLog(LOCATION, TextureLocationFormodid, MATERIAL_NAME, false);
		MacawsBridges.BridgeRailWood.createModelItemBridgeLog(LOCATION, MODID, MATERIAL_NAME);
		MacawsBridges.StairWood.createBlockstateBridgeStair(LOCATION, MODID, MATERIAL_NAME);
		MacawsBridges.StairWood.createModelBlockBridgeStair(LOCATION, TextureLocationFormodid, MATERIAL_NAME, false);
		MacawsBridges.StairWood.createModelItemBridgeStair(LOCATION, MODID, MATERIAL_NAME);
		//MacawsBridges.StairStone.createBlockstateBridgeStairStone(LOCATION, MODID, MATERIAL_NAME);
		//MacawsBridges.StairStone.createModelBlockBridgeStairStone(LOCATION, TextureLocationFormodid, MATERIAL_NAME, WALL, FLOOR);
		//MacawsBridges.StairStone.createModelItemBridgeStone(LOCATION, MODID, MATERIAL_NAME);
		MacawsBridges.PierWood.createBlockstatePierWood(LOCATION, MODID, MATERIAL_NAME);
		MacawsBridges.PierWood.createModelBlockPierWood(LOCATION, TextureLocationFormodid, MATERIAL_NAME, false);
		MacawsBridges.PierWood.createModelItemPierWood(LOCATION, MODID, MATERIAL_NAME);
		*/
	}
	
	/* BYG
	WOODS.add("aspen");
	WOODS.add("baobab");
	WOODS.add("blue_enchanted");
	WOODS.add("cherry");
	WOODS.add("cika");
	WOODS.add("cypress");
	WOODS.add("ebony");
	WOODS.add("ether");
	WOODS.add("fir");
	WOODS.add("green_enchanted");
	WOODS.add("holly");
	WOODS.add("jacaranda");
	WOODS.add("lament");
	WOODS.add("mahogany");
	WOODS.add("mangrove");
	WOODS.add("maple");
	WOODS.add("nightshade");
	WOODS.add("palm");
	WOODS.add("pine");
	WOODS.add("rainbow_eucalyptus");
	WOODS.add("redwood");
	WOODS.add("skyris");
	WOODS.add("willow");
	WOODS.add("witch_hazel");
	WOODS.add("zelkova");
	*/
}
