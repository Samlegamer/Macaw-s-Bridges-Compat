package fr.samlegamer.api.lang;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

import fr.samlegamer.Main;

public class MFLangGenerator
{
	public static void initAllEnglish(String Modid, List<String> mat, List<String> matLang)
	{		
		File file = new File(Main.LOCATION + " En_Us_Wood_Roofs.json");
		
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
					buffer.write("\"block."+Modid+"."+mat.get(nbm)+"_picket_fence\":\""+matLang.get(nbm)+" Picket Fence\",");
					buffer.newLine();
					buffer.write("\"block."+Modid+"."+mat.get(nbm)+"_stockade_fence\":\""+matLang.get(nbm)+" Stockade Fence\",");
					buffer.newLine();
					buffer.write("\"block."+Modid+"."+mat.get(nbm)+"_horse_fence\":\""+matLang.get(nbm)+" Horse Fence\",");
					buffer.newLine();
					buffer.write("\"block."+Modid+"."+mat.get(nbm)+"_wired_fence\":\""+matLang.get(nbm)+" Wired Fence\",");
					buffer.newLine();
					buffer.write("\"block."+Modid+"."+mat.get(nbm)+"_highley_gate\":\""+matLang.get(nbm)+" Highley Gate\",");
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