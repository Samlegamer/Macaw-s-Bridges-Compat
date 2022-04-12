package fr.samlegamer.api.lang;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class MBLangGenerator
{
	public static void WoodBridges(String LOCATION, String Modid, List<String> mat, List<String> matLang)
	{		
		File file = new File(LOCATION + "En_Us_Wood_Bridges.json");
		
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
					buffer.write("\"block."+Modid+"."+mat.get(nbm)+"_log_bridge_middle\":\""+matLang.get(nbm)+" Bridge\",");
					buffer.newLine();
					buffer.write("\"block."+Modid+"."+mat.get(nbm)+"_bridge_pier\":\""+matLang.get(nbm)+" Bridge Support\",");
					buffer.newLine();
					buffer.write("\"block."+Modid+".rope_"+mat.get(nbm)+"_bridge\":\"Rope "+matLang.get(nbm)+" Bridge\",");
					buffer.newLine();
					buffer.write("\"block."+Modid+"."+mat.get(nbm)+"_log_bridge_stair\":\""+matLang.get(nbm)+" Bridge Stair\",");
					buffer.newLine();
					buffer.write("\"block."+Modid+"."+mat.get(nbm)+"_rail_bridge\":\""+matLang.get(nbm)+" Rail Bridge\",");
					buffer.newLine();
					nbm++;
				}
				
				buffer.write("//Finish");
				buffer.newLine();
				buffer.write("}");
				buffer.close();
				writer.close();
				file.createNewFile();
				System.out.println("Le fichier " + file + " Vient d'être générer à l'emplacement : " + LOCATION);
			}
			catch (IOException e)
			{
				e.printStackTrace();
			}
		}
	}

	public static void StoneBridges(String LOCATION, String Modid, List<String> Mat, List<String> MatLang, int MatNumber)
	{	//PAS FINI !	
		File file = new File(LOCATION + "En_Us_Stone_Bridges.json");
		
		if(!file.exists())
		{
			try
			{
				FileWriter writer = new FileWriter(file);
				BufferedWriter buffer = new BufferedWriter(writer);
				
				for(int i = 0; i == MatNumber; i++)
				{
					buffer.write("\"block."+Modid+"."+Mat.get(i)+"_bridge\":\""+MatLang.get(i)+" Bridge\",");
					buffer.newLine();
				}
				
				for(int i = 0; i == MatNumber; i++)
				{
					buffer.write("\"block."+Modid+"."+Mat.get(i)+"_bridge_pier\": \""+MatLang.get(i)+" Bridge Support\",");
					buffer.newLine();
				}
				
				for(int i = 0; i == MatNumber; i++)
				{
					buffer.write("\"block."+Modid+"."+Mat.get(i)+"_bridge_stair\": \""+MatLang.get(i)+" Bridge Stair\",");
					buffer.newLine();
				}
				
				buffer.close();
				writer.close();
				file.createNewFile();
				System.out.println("Le fichier " + file + " Vient d'être générer à l'emplacement : " + LOCATION);
			}
			catch (IOException e)
			{
				e.printStackTrace();
			}
			
		}
	}
}