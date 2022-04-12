package fr.samlegamer.api.datagen.roofs;

import java.io.File;
import fr.samlegamer.utils.APIWriter;

public class MRRecipesGenerator
{
	public static void init(String location)
	{
		File folderData = new File(location + "data/");
		File folderRecipes = new File(location + "data/recipes/");
		File folderLoot_Tables = new File(location + "data/loot_tables/");
		File folderBlocks = new File(location + "data/loot_tables/blocks/");

		if(!folderData.exists() || !folderRecipes.exists() || !folderLoot_Tables.exists() || !folderBlocks.exists())
		{
			folderData.mkdir();
			folderRecipes.mkdir();
			folderLoot_Tables.mkdir();
			folderBlocks.mkdir();
		}
	}
	
	public static class AtticLog
	{
		public static void loot_tables(String location, String ModidCompat, String material)
		{
			File file = new File(location + "/data/loot_tables/blocks/" + material + "_attic_roof" + ".json");
			
			APIWriter.write(location, file, "{\r\n"
							+ "	\"type\": \"minecraft:block\",\r\n"
							+ "	\"pools\":\r\n"
							+ "	[\r\n"
							+ "		{\r\n"
							+ "			\"rolls\": 1,\r\n"
							+ "			\"entries\":\r\n"
							+ "			[\r\n"
							+ "				{\r\n"
							+ "					\"type\": \"minecraft:item\",\r\n"
							+ "					\"name\": \""+ModidCompat+":"+material+"_attic_roof\"\r\n"
							+ "				}\r\n"
							+ "			]\r\n"
							+ "		}\r\n"
							+ "	]\r\n"
							+ "}");
		}
		
		public static void recipe(String location, String modidExtended, String ModidCompat, String material, boolean isStemTexture)
		{
			File file = new File(location + "/data/recipes/" + material + "_attic_roof" + ".json");
			
			APIWriter.write(location, file, "{\r\n"
							+ "    \"type\": \"minecraft:crafting_shaped\",\r\n"
							+ "    \r\n"
							+ "    \"pattern\":\r\n"
							+ "    [\r\n"
							+ "        \" W\",\r\n"
							+ "        \"WG\"\r\n"
							+ "    ],\r\n"
							+ "    \r\n"
							+ "    \"key\":\r\n"
							+ "    {\r\n"
							+ "        \"W\":\r\n"
							+ "        {\r\n"
							+ "            \"item\": \""+modidExtended+":" + material + (isStemTexture ? "_stem" : "_log") + "\"\r\n"
							+ "        },\r\n"
							+ "		\"G\":\r\n"
							+ "        {\r\n"
							+ "            \"item\": \"minecraft:glass\"\r\n"
							+ "        }\r\n"
							+ "    },\r\n"
							+ "\r\n"
							+ "    \r\n"
							+ "    \"result\":\r\n"
							+ "    {\r\n"
							+ "        \"item\": \""+ModidCompat+":"+ material +"_attic_roof\",\r\n"
							+ "        \"count\": 2\r\n"
							+ "    }\r\n"
							+ "}");
		}
	}
	
	public static class AtticPlanks
	{
		public static void loot_tables(String location, String ModidCompat, String material)
		{
			File file = new File(location + "/data/loot_tables/blocks/" + material + "_attic_roof" + ".json");
			
			APIWriter.write(location, file, "{\r\n"
							+ "	\"type\": \"minecraft:block\",\r\n"
							+ "	\"pools\":\r\n"
							+ "	[\r\n"
							+ "		{\r\n"
							+ "			\"rolls\": 1,\r\n"
							+ "			\"entries\":\r\n"
							+ "			[\r\n"
							+ "				{\r\n"
							+ "					\"type\": \"minecraft:item\",\r\n"
							+ "					\"name\": \""+ModidCompat+":"+material+"_planks_attic_roof\"\r\n"
							+ "				}\r\n"
							+ "			]\r\n"
							+ "		}\r\n"
							+ "	]\r\n"
							+ "}");
		}
		
		public static void recipe(String location, String modidExtended, String ModidCompat, String material)
		{
			File file = new File(location + "/data/recipes/" + material + "_attic_roof" + ".json");
			
			APIWriter.write(location, file, "{\r\n"
							+ "    \"type\": \"minecraft:crafting_shaped\",\r\n"
							+ "    \r\n"
							+ "    \"pattern\":\r\n"
							+ "    [\r\n"
							+ "        \" W\",\r\n"
							+ "        \"WG\"\r\n"
							+ "    ],\r\n"
							+ "    \r\n"
							+ "    \"key\":\r\n"
							+ "    {\r\n"
							+ "        \"W\":\r\n"
							+ "        {\r\n"
							+ "            \"item\": \""+modidExtended+":" + material + "_planks" + "\"\r\n"
							+ "        },\r\n"
							+ "		\"G\":\r\n"
							+ "        {\r\n"
							+ "            \"item\": \"minecraft:glass\"\r\n"
							+ "        }\r\n"
							+ "    },\r\n"
							+ "\r\n"
							+ "    \r\n"
							+ "    \"result\":\r\n"
							+ "    {\r\n"
							+ "        \"item\": \""+ModidCompat+":"+ material +"_planks_attic_roof\",\r\n"
							+ "        \"count\": 2\r\n"
							+ "    }\r\n"
							+ "}");
		}
	}

	public static class CubeLog
	{
		public static void loot_tables(String location, String ModidCompat, String material)
		{
			File file = new File(location + "/data/loot_tables/blocks/" + material + "_cube_roof" + ".json");
			
			APIWriter.write(location, file, "{\r\n"
							+ "	\"type\": \"minecraft:block\",\r\n"
							+ "	\"pools\":\r\n"
							+ "	[\r\n"
							+ "		{\r\n"
							+ "			\"rolls\": 1,\r\n"
							+ "			\"entries\":\r\n"
							+ "			[\r\n"
							+ "				{\r\n"
							+ "					\"type\": \"minecraft:item\",\r\n"
							+ "					\"name\": \""+ModidCompat+":"+material+"_cube_roof\"\r\n"
							+ "				}\r\n"
							+ "			]\r\n"
							+ "		}\r\n"
							+ "	]\r\n"
							+ "}");
		}
		
		public static void recipe(String location, String modidExtended, String ModidCompat, String material, boolean isStemTexture)
		{
			File file = new File(location + "/data/recipes/" + material + "_cube_roof" + ".json");
			
			APIWriter.write(location, file, "{\r\n"
							+ "    \"type\": \"minecraft:crafting_shaped\",\r\n"
							+ "    \r\n"
							+ "    \"pattern\":\r\n"
							+ "    [\r\n"
							+ "        \"SW\",\r\n"
							+ "        \"WS\"\r\n"
							+ "    ],\r\n"
							+ "    \r\n"
							+ "    \"key\":\r\n"
							+ "    {\r\n"
							+ "        \"W\":\r\n"
							+ "        {\r\n"
							+ "            \"item\": \""+modidExtended+":"+ material + (isStemTexture ? "_stem" : "_log") +"\"\r\n"
							+ "        },\r\n"
							+ "		\"S\":\r\n"
							+ "        {\r\n"
							+ "            \"item\": \"minecraft:stick\"\r\n"
							+ "        }\r\n"
							+ "    },\r\n"
							+ "    \r\n"
							+ "    \"result\":\r\n"
							+ "    {\r\n"
							+ "        \"item\": \""+ModidCompat+":"+ material +"_cube_roof\",\r\n"
							+ "        \"count\": 2\r\n"
							+ "    }\r\n"
							+ "}");
		}
	}

	public static class CubePlanks
	{
		public static void loot_tables(String location, String ModidCompat, String material)
		{
			File file = new File(location + "/data/loot_tables/blocks/" + material + "_planks_cube_roof" + ".json");
			
			APIWriter.write(location, file, "{\r\n"
							+ "	\"type\": \"minecraft:block\",\r\n"
							+ "	\"pools\":\r\n"
							+ "	[\r\n"
							+ "		{\r\n"
							+ "			\"rolls\": 1,\r\n"
							+ "			\"entries\":\r\n"
							+ "			[\r\n"
							+ "				{\r\n"
							+ "					\"type\": \"minecraft:item\",\r\n"
							+ "					\"name\": \""+ModidCompat+":"+material+"_planks_cube_roof\"\r\n"
							+ "				}\r\n"
							+ "			]\r\n"
							+ "		}\r\n"
							+ "	]\r\n"
							+ "}");
		}
		
		public static void recipe(String location, String modidExtended, String ModidCompat, String material, boolean isStemTexture)
		{
			File file = new File(location + "/data/recipes/" + material + "_planks_cube_roof" + ".json");
			
			APIWriter.write(location, file, "{\r\n"
							+ "    \"type\": \"minecraft:crafting_shaped\",\r\n"
							+ "    \r\n"
							+ "    \"pattern\":\r\n"
							+ "    [\r\n"
							+ "        \"SW\",\r\n"
							+ "        \"WS\"\r\n"
							+ "    ],\r\n"
							+ "    \r\n"
							+ "    \"key\":\r\n"
							+ "    {\r\n"
							+ "        \"W\":\r\n"
							+ "        {\r\n"
							+ "            \"item\": \""+modidExtended+":"+ material + "_planks" +"\"\r\n"
							+ "        },\r\n"
							+ "		\"S\":\r\n"
							+ "        {\r\n"
							+ "            \"item\": \"minecraft:stick\"\r\n"
							+ "        }\r\n"
							+ "    },\r\n"
							+ "    \r\n"
							+ "    \"result\":\r\n"
							+ "    {\r\n"
							+ "        \"item\": \""+ModidCompat+":"+ material +"_planks_cube_roof\",\r\n"
							+ "        \"count\": 2\r\n"
							+ "    }\r\n"
							+ "}");
		}
	}
	
	public static class LowerLog
	{
		public static void loot_tables(String location, String ModidCompat, String material)
		{
			File file = new File(location + "/data/loot_tables/blocks/" + material + "_lower_roof" + ".json");
			
			APIWriter.write(location, file, "{\r\n"
							+ "	\"type\": \"minecraft:block\",\r\n"
							+ "	\"pools\":\r\n"
							+ "	[\r\n"
							+ "		{\r\n"
							+ "			\"rolls\": 1,\r\n"
							+ "			\"entries\":\r\n"
							+ "			[\r\n"
							+ "				{\r\n"
							+ "					\"type\": \"minecraft:item\",\r\n"
							+ "					\"name\": \""+ModidCompat+":"+material+"_lower_roof\"\r\n"
							+ "				}\r\n"
							+ "			]\r\n"
							+ "		}\r\n"
							+ "	]\r\n"
							+ "}");
		}
		
		public static void recipe(String location, String modidExtended, String ModidCompat, String material, boolean isStemTexture)
		{
			File file = new File(location + "/data/recipes/" + material + "_lower_roof" + ".json");
			
			APIWriter.write(location, file, "{\r\n"
							+ "    \"type\": \"minecraft:crafting_shaped\",\r\n"
							+ "    \r\n"
							+ "    \"pattern\":\r\n"
							+ "    [\r\n"
							+ "		\" WW\",\r\n"
							+ "        \"WWS\"\r\n"
							+ "    ],\r\n"
							+ "    \r\n"
							+ "    \"key\":\r\n"
							+ "    {\r\n"
							+ "        \"W\":\r\n"
							+ "        {\r\n"
							+ "            \"item\": \""+modidExtended+":"+ material + (isStemTexture ? "_stem" : "_log") +"\"\r\n"
							+ "        },\r\n"
							+ "		\"S\":\r\n"
							+ "        {\r\n"
							+ "            \"item\": \"minecraft:stick\"\r\n"
							+ "        }\r\n"
							+ "    },\r\n"
							+ "    \r\n"
							+ "    \"result\":\r\n"
							+ "    {\r\n"
							+ "        \"item\": \""+ModidCompat+":"+material+"_lower_roof\",\r\n"
							+ "        \"count\": 4\r\n"
							+ "    }\r\n"
							+ "}");
		}
	}
	
	public static class LowerPlanks
	{
		public static void loot_tables(String location, String ModidCompat, String material)
		{
			File file = new File(location + "/data/loot_tables/blocks/" + material + "_planks_lower_roof" + ".json");
			
			APIWriter.write(location, file, "{\r\n"
							+ "	\"type\": \"minecraft:block\",\r\n"
							+ "	\"pools\":\r\n"
							+ "	[\r\n"
							+ "		{\r\n"
							+ "			\"rolls\": 1,\r\n"
							+ "			\"entries\":\r\n"
							+ "			[\r\n"
							+ "				{\r\n"
							+ "					\"type\": \"minecraft:item\",\r\n"
							+ "					\"name\": \""+ModidCompat+":"+material+"_planks_lower_roof\"\r\n"
							+ "				}\r\n"
							+ "			]\r\n"
							+ "		}\r\n"
							+ "	]\r\n"
							+ "}");
		}
		
		public static void recipe(String location, String modidExtended, String ModidCompat, String material, boolean isStemTexture)
		{
			File file = new File(location + "/data/recipes/" + material + "_planks_lower_roof" + ".json");
			
			APIWriter.write(location, file, "{\r\n"
							+ "    \"type\": \"minecraft:crafting_shaped\",\r\n"
							+ "    \r\n"
							+ "    \"pattern\":\r\n"
							+ "    [\r\n"
							+ "		\" WW\",\r\n"
							+ "        \"WWS\"\r\n"
							+ "    ],\r\n"
							+ "    \r\n"
							+ "    \"key\":\r\n"
							+ "    {\r\n"
							+ "        \"W\":\r\n"
							+ "        {\r\n"
							+ "            \"item\": \""+modidExtended+":"+ material + "_planks" +"\"\r\n"
							+ "        },\r\n"
							+ "		\"S\":\r\n"
							+ "        {\r\n"
							+ "            \"item\": \"minecraft:stick\"\r\n"
							+ "        }\r\n"
							+ "    },\r\n"
							+ "    \r\n"
							+ "    \"result\":\r\n"
							+ "    {\r\n"
							+ "        \"item\": \""+ModidCompat+":"+material+"_planks_lower_roof\",\r\n"
							+ "        \"count\": 4\r\n"
							+ "    }\r\n"
							+ "}");
		}
	}

	public static class RoofLog
	{
		public static void loot_tables(String location, String ModidCompat, String material)
		{
			File file = new File(location + "/data/loot_tables/blocks/" + material + "_roof" + ".json");
			
			APIWriter.write(location, file, "{\r\n"
							+ "	\"type\": \"minecraft:block\",\r\n"
							+ "	\"pools\":\r\n"
							+ "	[\r\n"
							+ "		{\r\n"
							+ "			\"rolls\": 1,\r\n"
							+ "			\"entries\":\r\n"
							+ "			[\r\n"
							+ "				{\r\n"
							+ "					\"type\": \"minecraft:item\",\r\n"
							+ "					\"name\": \""+ModidCompat+":"+material+"_roof\"\r\n"
							+ "				}\r\n"
							+ "			]\r\n"
							+ "		}\r\n"
							+ "	]\r\n"
							+ "}");
		}
		
		public static void recipe(String location, String modidExtended, String ModidCompat, String material, boolean isStemTexture)
		{
			File file = new File(location + "/data/recipes/" + material + "_roof" + ".json");
			
			APIWriter.write(location, file, "{\r\n"
							+ "    \"type\": \"minecraft:crafting_shaped\",\r\n"
							+ "    \r\n"
							+ "    \"pattern\":\r\n"
							+ "    [\r\n"
							+ "        \" W\",\r\n"
							+ "        \"WS\"\r\n"
							+ "    ],\r\n"
							+ "    \r\n"
							+ "    \"key\":\r\n"
							+ "    {\r\n"
							+ "        \"W\":\r\n"
							+ "        {\r\n"
							+ "            \"item\": \""+modidExtended+":"+ material + (isStemTexture ? "_stem" : "_log") +"\"\r\n"
							+ "        },\r\n"
							+ "		\"S\":\r\n"
							+ "        {\r\n"
							+ "            \"item\": \"minecraft:stick\"\r\n"
							+ "        }\r\n"
							+ "    },\r\n"
							+ "    \r\n"
							+ "    \"result\":\r\n"
							+ "    {\r\n"
							+ "        \"item\": \""+ModidCompat+":"+ material +"_roof\",\r\n"
							+ "        \"count\": 2\r\n"
							+ "    }\r\n"
							+ "}");
		}
	}
	
	public static class RoofPlanks
	{
		public static void loot_tables(String location, String ModidCompat, String material)
		{
			File file = new File(location + "/data/loot_tables/blocks/" + material + "_planks_roof" + ".json");
			
			APIWriter.write(location, file, "{\r\n"
							+ "	\"type\": \"minecraft:block\",\r\n"
							+ "	\"pools\":\r\n"
							+ "	[\r\n"
							+ "		{\r\n"
							+ "			\"rolls\": 1,\r\n"
							+ "			\"entries\":\r\n"
							+ "			[\r\n"
							+ "				{\r\n"
							+ "					\"type\": \"minecraft:item\",\r\n"
							+ "					\"name\": \""+ModidCompat+":"+material+"_planks_roof\"\r\n"
							+ "				}\r\n"
							+ "			]\r\n"
							+ "		}\r\n"
							+ "	]\r\n"
							+ "}");
		}
		
		public static void recipe(String location, String modidExtended, String ModidCompat, String material, boolean isStemTexture)
		{
			File file = new File(location + "/data/recipes/" + material + "_planks_roof" + ".json");
			
			APIWriter.write(location, file, "{\r\n"
							+ "    \"type\": \"minecraft:crafting_shaped\",\r\n"
							+ "    \r\n"
							+ "    \"pattern\":\r\n"
							+ "    [\r\n"
							+ "        \" W\",\r\n"
							+ "        \"WS\"\r\n"
							+ "    ],\r\n"
							+ "    \r\n"
							+ "    \"key\":\r\n"
							+ "    {\r\n"
							+ "        \"W\":\r\n"
							+ "        {\r\n"
							+ "            \"item\": \""+modidExtended+":"+ material + "_planks" +"\"\r\n"
							+ "        },\r\n"
							+ "		\"S\":\r\n"
							+ "        {\r\n"
							+ "            \"item\": \"minecraft:stick\"\r\n"
							+ "        }\r\n"
							+ "    },\r\n"
							+ "    \r\n"
							+ "    \"result\":\r\n"
							+ "    {\r\n"
							+ "        \"item\": \""+ModidCompat+":"+ material +"_planks_roof\",\r\n"
							+ "        \"count\": 2\r\n"
							+ "    }\r\n"
							+ "}");
		}
	}

	public static class SteepLog
	{
		public static void loot_tables(String location, String ModidCompat, String material)
		{
			File file = new File(location + "/data/loot_tables/blocks/" + material + "_steep_roof" + ".json");
			
			APIWriter.write(location, file, "{\r\n"
							+ "	\"type\": \"minecraft:block\",\r\n"
							+ "	\"pools\":\r\n"
							+ "	[\r\n"
							+ "		{\r\n"
							+ "			\"rolls\": 1,\r\n"
							+ "			\"entries\":\r\n"
							+ "			[\r\n"
							+ "				{\r\n"
							+ "					\"type\": \"minecraft:item\",\r\n"
							+ "					\"name\": \""+ModidCompat+":"+material+"_steep_roof\"\r\n"
							+ "				}\r\n"
							+ "			]\r\n"
							+ "		}\r\n"
							+ "	]\r\n"
							+ "}");
		}
		
		public static void recipe(String location, String modidExtended, String ModidCompat, String material, boolean isStemTexture)
		{
			File file = new File(location + "/data/recipes/" + material + "_steep_roof" + ".json");
			
			APIWriter.write(location, file, "{\r\n"
							+ "    \"type\": \"minecraft:crafting_shaped\",\r\n"
							+ "    \r\n"
							+ "    \"pattern\":\r\n"
							+ "    [\r\n"
							+ "        \" W\",\r\n"
							+ "		\"WW\",\r\n"
							+ "        \"WS\"\r\n"
							+ "    ],\r\n"
							+ "    \r\n"
							+ "    \"key\":\r\n"
							+ "    {\r\n"
							+ "        \"W\":\r\n"
							+ "        {\r\n"
							+ "            \"item\": \""+modidExtended+":"+ material + (isStemTexture ? "_stem" : "_log") +"\"\r\n"
							+ "        },\r\n"
							+ "		\"S\":\r\n"
							+ "        {\r\n"
							+ "            \"item\": \"minecraft:stick\"\r\n"
							+ "        }\r\n"
							+ "    },\r\n"
							+ "    \r\n"
							+ "    \"result\":\r\n"
							+ "    {\r\n"
							+ "        \"item\": \""+ModidCompat+":"+material+"_steep_roof\",\r\n"
							+ "        \"count\": 4\r\n"
							+ "    }\r\n"
							+ "}");
		}
	}
	
	public static class SteepPlanks
	{
		public static void loot_tables(String location, String ModidCompat, String material)
		{
			File file = new File(location + "/data/loot_tables/blocks/" + material + "_planks_steep_roof" + ".json");
			
			APIWriter.write(location, file, "{\r\n"
							+ "	\"type\": \"minecraft:block\",\r\n"
							+ "	\"pools\":\r\n"
							+ "	[\r\n"
							+ "		{\r\n"
							+ "			\"rolls\": 1,\r\n"
							+ "			\"entries\":\r\n"
							+ "			[\r\n"
							+ "				{\r\n"
							+ "					\"type\": \"minecraft:item\",\r\n"
							+ "					\"name\": \""+ModidCompat+":"+material+"_planks_steep_roof\"\r\n"
							+ "				}\r\n"
							+ "			]\r\n"
							+ "		}\r\n"
							+ "	]\r\n"
							+ "}");
		}
		
		public static void recipe(String location, String modidExtended, String ModidCompat, String material)
		{
			File file = new File(location + "/data/recipes/" + material + "_planks_steep_roof" + ".json");
			
			APIWriter.write(location, file, "{\r\n"
							+ "    \"type\": \"minecraft:crafting_shaped\",\r\n"
							+ "    \r\n"
							+ "    \"pattern\":\r\n"
							+ "    [\r\n"
							+ "        \" W\",\r\n"
							+ "		\"WW\",\r\n"
							+ "        \"WS\"\r\n"
							+ "    ],\r\n"
							+ "    \r\n"
							+ "    \"key\":\r\n"
							+ "    {\r\n"
							+ "        \"W\":\r\n"
							+ "        {\r\n"
							+ "            \"item\": \""+modidExtended+":"+ material + "_planks" +"\"\r\n"
							+ "        },\r\n"
							+ "		\"S\":\r\n"
							+ "        {\r\n"
							+ "            \"item\": \"minecraft:stick\"\r\n"
							+ "        }\r\n"
							+ "    },\r\n"
							+ "    \r\n"
							+ "    \"result\":\r\n"
							+ "    {\r\n"
							+ "        \"item\": \""+ModidCompat+":"+material+"_planks_steep_roof\",\r\n"
							+ "        \"count\": 4\r\n"
							+ "    }\r\n"
							+ "}");
		}
	}

	public static class TopLog
	{
		public static void loot_tables(String location, String ModidCompat, String material)
		{
			File file = new File(location + "/data/loot_tables/blocks/" + material + "_top_roof" + ".json");
			
			APIWriter.write(location, file, "{\r\n"
							+ "	\"type\": \"minecraft:block\",\r\n"
							+ "	\"pools\":\r\n"
							+ "	[\r\n"
							+ "		{\r\n"
							+ "			\"rolls\": 1,\r\n"
							+ "			\"entries\":\r\n"
							+ "			[\r\n"
							+ "				{\r\n"
							+ "					\"type\": \"minecraft:item\",\r\n"
							+ "					\"name\": \""+ModidCompat+":"+material+"_top_roof\"\r\n"
							+ "				}\r\n"
							+ "			]\r\n"
							+ "		}\r\n"
							+ "	]\r\n"
							+ "}");
		}
		
		public static void recipe(String location, String modidExtended, String ModidCompat, String material, boolean isStemTexture)
		{
			File file = new File(location + "/data/recipes/" + material + "_top_roof" + ".json");
			
			APIWriter.write(location, file, "{\r\n"
							+ "    \"type\": \"minecraft:crafting_shaped\",\r\n"
							+ "    \r\n"
							+ "    \"pattern\":\r\n"
							+ "    [\r\n"
							+ "        \"WSW\"\r\n"
							+ "    ],\r\n"
							+ "    \r\n"
							+ "    \"key\":\r\n"
							+ "    {\r\n"
							+ "        \"W\":\r\n"
							+ "        {\r\n"
							+ "            \"item\": \""+modidExtended+":"+ material + (isStemTexture ? "_stem" : "_log") +"\"\r\n"
							+ "        },\r\n"
							+ "		\"S\":\r\n"
							+ "        {\r\n"
							+ "            \"item\": \"minecraft:stick\"\r\n"
							+ "        }\r\n"
							+ "    },\r\n"
							+ "    \r\n"
							+ "    \"result\":\r\n"
							+ "    {\r\n"
							+ "        \"item\": \""+ModidCompat+":"+material+"_top_roof\",\r\n"
							+ "        \"count\": 2\r\n"
							+ "    }\r\n"
							+ "}");
		}
	}
	
	public static class TopPlanks
	{
		public static void loot_tables(String location, String ModidCompat, String material)
		{
			File file = new File(location + "/data/loot_tables/blocks/" + material + "_planks_top_roof" + ".json");
			
			APIWriter.write(location, file, "{\r\n"
							+ "	\"type\": \"minecraft:block\",\r\n"
							+ "	\"pools\":\r\n"
							+ "	[\r\n"
							+ "		{\r\n"
							+ "			\"rolls\": 1,\r\n"
							+ "			\"entries\":\r\n"
							+ "			[\r\n"
							+ "				{\r\n"
							+ "					\"type\": \"minecraft:item\",\r\n"
							+ "					\"name\": \""+ModidCompat+":"+material+"_planks_top_roof\"\r\n"
							+ "				}\r\n"
							+ "			]\r\n"
							+ "		}\r\n"
							+ "	]\r\n"
							+ "}");
		}
		
		public static void recipe(String location, String modidExtended, String ModidCompat, String material)
		{
			File file = new File(location + "/data/recipes/" + material + "_planks_top_roof" + ".json");
			
			APIWriter.write(location, file, "{\r\n"
							+ "    \"type\": \"minecraft:crafting_shaped\",\r\n"
							+ "    \r\n"
							+ "    \"pattern\":\r\n"
							+ "    [\r\n"
							+ "        \"WSW\"\r\n"
							+ "    ],\r\n"
							+ "    \r\n"
							+ "    \"key\":\r\n"
							+ "    {\r\n"
							+ "        \"W\":\r\n"
							+ "        {\r\n"
							+ "            \"item\": \""+modidExtended+":"+ material + "_planks" +"\"\r\n"
							+ "        },\r\n"
							+ "		\"S\":\r\n"
							+ "        {\r\n"
							+ "            \"item\": \"minecraft:stick\"\r\n"
							+ "        }\r\n"
							+ "    },\r\n"
							+ "    \r\n"
							+ "    \"result\":\r\n"
							+ "    {\r\n"
							+ "        \"item\": \""+ModidCompat+":"+material+"_planks_top_roof\",\r\n"
							+ "        \"count\": 2\r\n"
							+ "    }\r\n"
							+ "}");
		}
	}

	public static class UpperLowerLog
	{
		public static void loot_tables(String location, String ModidCompat, String material)
		{
			File file = new File(location + "/data/loot_tables/blocks/" + material + "_upper_lower_roof" + ".json");
			
			APIWriter.write(location, file, "{\r\n"
							+ "	\"type\": \"minecraft:block\",\r\n"
							+ "	\"pools\":\r\n"
							+ "	[\r\n"
							+ "		{\r\n"
							+ "			\"rolls\": 1,\r\n"
							+ "			\"entries\":\r\n"
							+ "			[\r\n"
							+ "				{\r\n"
							+ "					\"type\": \"minecraft:item\",\r\n"
							+ "					\"name\": \""+ModidCompat+":"+material+"_upper_lower_roof\"\r\n"
							+ "				}\r\n"
							+ "			]\r\n"
							+ "		}\r\n"
							+ "	]\r\n"
							+ "}");
		}
		
		public static void recipe(String location, String modidExtended, String ModidCompat, String material, boolean isStemTexture)
		{
			File file = new File(location + "/data/recipes/" + material + "_upper_lower_roof" + ".json");
			
			APIWriter.write(location, file, "{\r\n"
							+ "    \"type\": \"minecraft:crafting_shaped\",\r\n"
							+ "    \r\n"
							+ "    \"pattern\":\r\n"
							+ "    [\r\n"
							+ "		\"  W\",\r\n"
							+ "        \"WWS\"\r\n"
							+ "    ],\r\n"
							+ "    \r\n"
							+ "    \"key\":\r\n"
							+ "    {\r\n"
							+ "        \"W\":\r\n"
							+ "        {\r\n"
							+ "            \"item\": \""+modidExtended+":"+ material + (isStemTexture ? "_stem" : "_log") +"\"\r\n"
							+ "        },\r\n"
							+ "		\"S\":\r\n"
							+ "        {\r\n"
							+ "            \"item\": \"minecraft:stick\"\r\n"
							+ "        }\r\n"
							+ "    },\r\n"
							+ "    \r\n"
							+ "    \"result\":\r\n"
							+ "    {\r\n"
							+ "        \"item\": \""+ModidCompat+":"+material+"_upper_lower_roof\",\r\n"
							+ "        \"count\": 3\r\n"
							+ "    }\r\n"
							+ "}");
		}
	}
	
	public static class UpperLowerPlanks
	{
		public static void loot_tables(String location, String ModidCompat, String material)
		{
			File file = new File(location + "/data/loot_tables/blocks/" + material + "_planks_upper_lower_roof" + ".json");
			
			APIWriter.write(location, file, "{\r\n"
							+ "	\"type\": \"minecraft:block\",\r\n"
							+ "	\"pools\":\r\n"
							+ "	[\r\n"
							+ "		{\r\n"
							+ "			\"rolls\": 1,\r\n"
							+ "			\"entries\":\r\n"
							+ "			[\r\n"
							+ "				{\r\n"
							+ "					\"type\": \"minecraft:item\",\r\n"
							+ "					\"name\": \""+ModidCompat+":"+material+"_planks_upper_lower_roof\"\r\n"
							+ "				}\r\n"
							+ "			]\r\n"
							+ "		}\r\n"
							+ "	]\r\n"
							+ "}");
		}
		
		public static void recipe(String location, String modidExtended, String ModidCompat, String material)
		{
			File file = new File(location + "/data/recipes/" + material + "_planks_upper_lower_roof" + ".json");
			
			APIWriter.write(location, file, "{\r\n"
							+ "    \"type\": \"minecraft:crafting_shaped\",\r\n"
							+ "    \r\n"
							+ "    \"pattern\":\r\n"
							+ "    [\r\n"
							+ "		\"  W\",\r\n"
							+ "        \"WWS\"\r\n"
							+ "    ],\r\n"
							+ "    \r\n"
							+ "    \"key\":\r\n"
							+ "    {\r\n"
							+ "        \"W\":\r\n"
							+ "        {\r\n"
							+ "            \"item\": \""+modidExtended+":"+ material + "_planks" +"\"\r\n"
							+ "        },\r\n"
							+ "		\"S\":\r\n"
							+ "        {\r\n"
							+ "            \"item\": \"minecraft:stick\"\r\n"
							+ "        }\r\n"
							+ "    },\r\n"
							+ "    \r\n"
							+ "    \"result\":\r\n"
							+ "    {\r\n"
							+ "        \"item\": \""+ModidCompat+":"+material+"_planks_upper_lower_roof\",\r\n"
							+ "        \"count\": 3\r\n"
							+ "    }\r\n"
							+ "}");
		}
	}
	
	public static class UpperSteepLog
	{
		public static void loot_tables(String location, String ModidCompat, String material)
		{
			File file = new File(location + "/data/loot_tables/blocks/" + material + "_upper_steep_roof" + ".json");
			
			APIWriter.write(location, file, "{\r\n"
							+ "	\"type\": \"minecraft:block\",\r\n"
							+ "	\"pools\":\r\n"
							+ "	[\r\n"
							+ "		{\r\n"
							+ "			\"rolls\": 1,\r\n"
							+ "			\"entries\":\r\n"
							+ "			[\r\n"
							+ "				{\r\n"
							+ "					\"type\": \"minecraft:item\",\r\n"
							+ "					\"name\": \""+ModidCompat+":"+material+"_upper_steep_roof\"\r\n"
							+ "				}\r\n"
							+ "			]\r\n"
							+ "		}\r\n"
							+ "	]\r\n"
							+ "}");
		}
		
		public static void recipe(String location, String modidExtended, String ModidCompat, String material, boolean isStemTexture)
		{
			File file = new File(location + "/data/recipes/" + material + "_upper_steep_roof" + ".json");
			
			APIWriter.write(location, file, "{\r\n"
							+ "    \"type\": \"minecraft:crafting_shaped\",\r\n"
							+ "    \r\n"
							+ "    \"pattern\":\r\n"
							+ "    [\r\n"
							+ "		\" W\",\r\n"
							+ "		\" W\",\r\n"
							+ "        \"WS\"\r\n"
							+ "    ],\r\n"
							+ "    \r\n"
							+ "    \"key\":\r\n"
							+ "    {\r\n"
							+ "        \"W\":\r\n"
							+ "        {\r\n"
							+ "            \"item\": \""+modidExtended+":"+ material + (isStemTexture ? "_stem" : "_log") +"\"\r\n"
							+ "        },\r\n"
							+ "		\"S\":\r\n"
							+ "        {\r\n"
							+ "            \"item\": \"minecraft:stick\"\r\n"
							+ "        }\r\n"
							+ "    },\r\n"
							+ "    \r\n"
							+ "    \"result\":\r\n"
							+ "    {\r\n"
							+ "        \"item\": \""+ModidCompat+":"+material+"_upper_steep_roof\",\r\n"
							+ "        \"count\": 3\r\n"
							+ "    }\r\n"
							+ "}");
		}
	}
	
	public static class UpperSteepPlanks
	{
		public static void loot_tables(String location, String ModidCompat, String material)
		{
			File file = new File(location + "/data/loot_tables/blocks/" + material + "_planks_upper_steep_roof" + ".json");
			
			APIWriter.write(location, file, "{\r\n"
							+ "	\"type\": \"minecraft:block\",\r\n"
							+ "	\"pools\":\r\n"
							+ "	[\r\n"
							+ "		{\r\n"
							+ "			\"rolls\": 1,\r\n"
							+ "			\"entries\":\r\n"
							+ "			[\r\n"
							+ "				{\r\n"
							+ "					\"type\": \"minecraft:item\",\r\n"
							+ "					\"name\": \""+ModidCompat+":"+material+"_planks_upper_steep_roof\"\r\n"
							+ "				}\r\n"
							+ "			]\r\n"
							+ "		}\r\n"
							+ "	]\r\n"
							+ "}");
		}
		
		public static void recipe(String location, String modidExtended, String ModidCompat, String material, boolean isStemTexture)
		{
			File file = new File(location + "/data/recipes/" + material + "_planks_upper_steep_roof" + ".json");
			
			APIWriter.write(location, file, "{\r\n"
							+ "    \"type\": \"minecraft:crafting_shaped\",\r\n"
							+ "    \r\n"
							+ "    \"pattern\":\r\n"
							+ "    [\r\n"
							+ "		\" W\",\r\n"
							+ "		\" W\",\r\n"
							+ "        \"WS\"\r\n"
							+ "    ],\r\n"
							+ "    \r\n"
							+ "    \"key\":\r\n"
							+ "    {\r\n"
							+ "        \"W\":\r\n"
							+ "        {\r\n"
							+ "            \"item\": \""+modidExtended+":"+ material + "_planks" +"\"\r\n"
							+ "        },\r\n"
							+ "		\"S\":\r\n"
							+ "        {\r\n"
							+ "            \"item\": \"minecraft:stick\"\r\n"
							+ "        }\r\n"
							+ "    },\r\n"
							+ "    \r\n"
							+ "    \"result\":\r\n"
							+ "    {\r\n"
							+ "        \"item\": \""+ModidCompat+":"+material+"_planks_upper_steep_roof\",\r\n"
							+ "        \"count\": 3\r\n"
							+ "    }\r\n"
							+ "}");
		}
	}
}