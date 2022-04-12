package fr.samlegamer.api.lang;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

import fr.samlegamer.Main;

public class MRLangGenerator
{
	public static void initAllEnglish(String Modid, List<String> mat, List<String> matLang)
	{		
		File file = new File(Main.LOCATION + mat + " En_Us_Wood_Roofs.json");
		
		if(!file.exists())
		{
			try
			{
				FileWriter writer = new FileWriter(file);
				BufferedWriter buffer = new BufferedWriter(writer);
				
				int nbm = 0;
				buffer.write("{");
				buffer.newLine();

				for(String i : mat)
				{
					buffer.write("\"block."+Modid+"."+mat.get(nbm)+"_roof\":\""+matLang.get(nbm)+" Roof\",");
					buffer.newLine();
					buffer.write("\"block."+Modid+"."+mat.get(nbm)+"_attic_roof\":\""+matLang.get(nbm)+" Attic Roof\",");
					buffer.newLine();
					buffer.write("\"block."+Modid+".rope_"+mat.get(nbm)+"_cube_roof\":\"Rope "+matLang.get(nbm)+" Cube Roof\",");
					buffer.newLine();
					buffer.write("\"block."+Modid+"."+mat.get(nbm)+"_top_roof\":\""+matLang.get(nbm)+" Top Roof\",");
					buffer.newLine();
					buffer.write("\"block."+Modid+"."+mat.get(nbm)+"_lower_roof\":\""+matLang.get(nbm)+" Lower Roof\",");
					buffer.newLine();
					buffer.write("\"block."+Modid+"."+mat.get(nbm)+"_steep_roof\":\""+matLang.get(nbm)+" Steep Roof\",");
					buffer.newLine();
					buffer.write("\"block."+Modid+"."+mat.get(nbm)+"_upper_lower_roof\":\""+matLang.get(nbm)+" Upper Lower Roof\",");
					buffer.newLine();
					buffer.write("\"block."+Modid+"."+mat.get(nbm)+"_upper_steep_roof\":\""+matLang.get(nbm)+" Upper Steep Roof\",");
					buffer.newLine();
					buffer.write("\"block."+Modid+"."+mat.get(nbm)+"_planks_roof\":\""+matLang.get(nbm)+" Planks Roof\",");
					buffer.newLine();
					buffer.write("\"block."+Modid+"."+mat.get(nbm)+"_planks_attic_roof\":\""+matLang.get(nbm)+" Planks Attic Roof\",");
					buffer.newLine();
					buffer.write("\"block."+Modid+".rope_"+mat.get(nbm)+"_planks_cube_roof\":\"Rope "+matLang.get(nbm)+" Planks Cube Roof\",");
					buffer.newLine();
					buffer.write("\"block."+Modid+"."+mat.get(nbm)+"_planks_top_roof\":\""+matLang.get(nbm)+" Planks Top Roof\",");
					buffer.newLine();
					buffer.write("\"block."+Modid+"."+mat.get(nbm)+"_planks_lower_roof\":\""+matLang.get(nbm)+" Planks Lower Roof\",");
					buffer.newLine();
					buffer.write("\"block."+Modid+"."+mat.get(nbm)+"_planks_steep_roof\":\""+matLang.get(nbm)+" Planks Steep Roof\",");
					buffer.newLine();
					buffer.write("\"block."+Modid+"."+mat.get(nbm)+"_planks_upper_lower_roof\":\""+matLang.get(nbm)+" Planks Upper Lower Roof\",");
					buffer.newLine();
					buffer.write("\"block."+Modid+"."+mat.get(nbm)+"_planks_upper_steep_roof\":\""+matLang.get(nbm)+" Planks Upper Steep Roof\",");
					buffer.newLine();
					nbm++;
				}
				
				buffer.write("//Finish");
				buffer.newLine();
				buffer.write("}");
				buffer.close();
				writer.close();
				file.createNewFile();
				System.out.println("Le fichier " + file + " Vient d'être générer à l'emplacement : " + Main.LOCATION);
			}
			catch (IOException e)
			{
				e.printStackTrace();
			}
		}
	}
}