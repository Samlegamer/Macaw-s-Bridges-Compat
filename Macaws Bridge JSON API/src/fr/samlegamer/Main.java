package fr.samlegamer;

import java.util.ArrayList;

import fr.samlegamer.cave_and_cliff_part_II.bridge.MBTagGenerator;
import fr.samlegamer.cave_and_cliff_part_II.roof.MCRLangGen;
import fr.samlegamer.mods.MacawsBridges;
import fr.samlegamer.mods.RecipesGeneratorMacawsBridges;
import fr.samlegamer.utils.ModsList;

public class Main
{
	public static final String LOCATION = "C://Users/ExampleDude/3D Objects/Jsons Folder/";  //Path
	public static final String CompatModid = "myaddons"; //The modid of compat, No :
	public static final String TextureLocationFormodid = "bop:blocks"; //modid:block for textures location (ex : assets/quark/textures/block = quark:block)
	public static final String ModidExtended = "bop";
	
	public static final String WALL = "";	// !ONLY FOR STONE! this is wall texture in the bridge
	public static final String FLOOR = "";		// !ONLY FOR STONE! this is floor texture in the bridge
	public static final String MATERIAL_NAME = "";
	
	public static final ArrayList<String> MATERIAL = new ArrayList<String>();
	public static final ArrayList<String> MAJ_MAT = new ArrayList<String>();

	public static final String ClassMod = "MyBlocksInit"; // Blocks Class Registries (ex : IafBlockRegistry)
	

	public static void main(String[] args)
	{

		ModsList.byg(MATERIAL, false);
		ModsList.byg(MATERIAL, true);

		MacawsBridges.init(LOCATION);
		RecipesGeneratorMacawsBridges.init(LOCATION);
		
		MBTagGenerator.AxeDataGen(LOCATION, CompatModid, MATERIAL);
	}	
	
	private void langRoof()
	{
		MCRLangGen.initAllEnglish(CompatModid, MATERIAL.get(0), MAJ_MAT.get(0));
		MCRLangGen.initAllEnglish(CompatModid, MATERIAL.get(1), MAJ_MAT.get(1));
		MCRLangGen.initAllEnglish(CompatModid, MATERIAL.get(2), MAJ_MAT.get(2));
		MCRLangGen.initAllEnglish(CompatModid, MATERIAL.get(3), MAJ_MAT.get(3));
		MCRLangGen.initAllEnglish(CompatModid, MATERIAL.get(4), MAJ_MAT.get(4));
		MCRLangGen.initAllEnglish(CompatModid, MATERIAL.get(5), MAJ_MAT.get(5));
		MCRLangGen.initAllEnglish(CompatModid, MATERIAL.get(6), MAJ_MAT.get(6));
		MCRLangGen.initAllEnglish(CompatModid, MATERIAL.get(7), MAJ_MAT.get(7));
		MCRLangGen.initAllEnglish(CompatModid, MATERIAL.get(8), MAJ_MAT.get(8));
		MCRLangGen.initAllEnglish(CompatModid, MATERIAL.get(9), MAJ_MAT.get(9));
		MCRLangGen.initAllEnglish(CompatModid, MATERIAL.get(10), MAJ_MAT.get(10));
		MCRLangGen.initAllEnglish(CompatModid, MATERIAL.get(11), MAJ_MAT.get(11));
		MCRLangGen.initAllEnglish(CompatModid, MATERIAL.get(12), MAJ_MAT.get(12));
		MCRLangGen.initAllEnglish(CompatModid, MATERIAL.get(13), MAJ_MAT.get(13));
		MCRLangGen.initAllEnglish(CompatModid, MATERIAL.get(14), MAJ_MAT.get(14));
		MCRLangGen.initAllEnglish(CompatModid, MATERIAL.get(15), MAJ_MAT.get(15));
		MCRLangGen.initAllEnglish(CompatModid, MATERIAL.get(16), MAJ_MAT.get(16));
		MCRLangGen.initAllEnglish(CompatModid, MATERIAL.get(17), MAJ_MAT.get(17));
		MCRLangGen.initAllEnglish(CompatModid, MATERIAL.get(18), MAJ_MAT.get(18));
		MCRLangGen.initAllEnglish(CompatModid, MATERIAL.get(19), MAJ_MAT.get(19));
		MCRLangGen.initAllEnglish(CompatModid, MATERIAL.get(20), MAJ_MAT.get(20));
		MCRLangGen.initAllEnglish(CompatModid, MATERIAL.get(21), MAJ_MAT.get(21));
		MCRLangGen.initAllEnglish(CompatModid, MATERIAL.get(22), MAJ_MAT.get(22));
		MCRLangGen.initAllEnglish(CompatModid, MATERIAL.get(23), MAJ_MAT.get(23));
		MCRLangGen.initAllEnglish(CompatModid, MATERIAL.get(24), MAJ_MAT.get(24));
		MCRLangGen.initAllEnglish(CompatModid, MATERIAL.get(25), MAJ_MAT.get(25));
		MCRLangGen.initAllEnglish(CompatModid, MATERIAL.get(26), MAJ_MAT.get(26));
		MCRLangGen.initAllEnglish(CompatModid, MATERIAL.get(27), MAJ_MAT.get(27));

	}
}