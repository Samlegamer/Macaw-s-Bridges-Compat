package fr.samlegamer.fabric;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class MBCodeGenFabric
{
	public static void init(String location, String Modid, List<String> mat, String classBlock)
	{
		File file = new File(location + "CodeGenFabric [Macaw's Bridges]" + ".json");
	
		if(!file.exists())
		{
			try
			{
				FileWriter writer = new FileWriter(file);
				BufferedWriter buffer = new BufferedWriter(writer);
				
				buffer.newLine();

				for(String i : mat)
				{
					buffer.write("public static final Block "+i+"_log_bridge_middle = new Log_Bridge(AbstractBlock.Settings.of(Material.WOOD).strength(0.5F, 2.5F).sounds(BlockSoundGroup.WOOD));\r\n");
					buffer.newLine();
					buffer.write("public static final Block rope_"+i+"_bridge = new Rope_Bridge(AbstractBlock.Settings.of(Material.WOOD).strength(0.5F, 2.5F).sounds(BlockSoundGroup.WOOD));\r\n");
					buffer.newLine();
					buffer.write("public static final Block "+i+"_bridge_pier = new Support_Pillar(AbstractBlock.Settings.of(Material.WOOD).strength(0.5F, 2.5F).sounds(BlockSoundGroup.WOOD));\r\n");
					buffer.newLine();
					buffer.write("public static final Block "+i+"_log_bridge_stair = new Iron_Stair(AbstractBlock.Settings.of(Material.WOOD).strength(0.5F, 2.5F).sounds(BlockSoundGroup.WOOD));\r\n");
					buffer.newLine();
					buffer.write("public static final Block "+i+"_rope_bridge_stair = new Iron_Stair(AbstractBlock.Settings.of(Material.WOOD).nonOpaque().strength(0.5F, 2.5F).sounds(BlockSoundGroup.WOOD));\r\n");
					buffer.newLine();
					buffer.write("public static final Block "+i+"_rail_bridge = new Rail_Bridge(AbstractBlock.Settings.of(Material.WOOD).nonOpaque().strength(0.5F, 2.5F).sounds(BlockSoundGroup.WOOD));\r\n");
					buffer.newLine();
				}
				
				buffer.newLine();

				for(String i : mat)
				{
					buffer.write("add(\""+i+"_log_bridge_middle\", "+i+"_log_bridge_middle);");
					buffer.newLine();
					buffer.write("add(\"rope_"+i+"_bridge\", rope_"+i+"_bridge);");
					buffer.newLine();
					buffer.write("add(\""+i+"_bridge_pier\", "+i+"_bridge_pier);");
					buffer.newLine();
					buffer.write("add(\""+i+"_log_bridge_stair\", "+i+"_log_bridge_stair);");
					buffer.newLine();
					buffer.write("add(\""+i+"_rope_bridge_stair\", "+i+"_rope_bridge_stair);");
					buffer.newLine();
					buffer.write("add(\""+i+"_rail_bridge\", "+i+"_rail_bridge);");
					buffer.newLine();
				}
				
				buffer.newLine();
				buffer.newLine();
				buffer.newLine();
				buffer.write("//FOR CLIENT");
				buffer.newLine();
				buffer.write("BlockRenderLayerMap.INSTANCE.putBlocks(RenderLayer.getCutout(),");
				buffer.newLine();

				for(String i : mat)
				{
					buffer.write(""+classBlock+"."+i+"_log_bridge_middle, ");
					buffer.newLine();
					buffer.write(""+classBlock+".rope_"+i+"_bridge, ");
					buffer.newLine();
					buffer.write(""+classBlock+"."+i+"_bridge_pier, ");
					buffer.newLine();
					buffer.write(""+classBlock+"."+i+"_log_bridge_stair, ");
					buffer.newLine();
					buffer.write(""+classBlock+"."+i+"_rope_bridge_stair, ");
					buffer.newLine();
					buffer.write(""+classBlock+"."+i+"_rail_bridge, ");
					buffer.newLine();
				}
				
				buffer.close();
				writer.close();
				file.createNewFile();
				System.out.println("Le fichier " + file + " Vient d'être générer à l'emplacement : " + location);
			}
			catch (IOException e)
			{
				e.printStackTrace();
			}
		}
	}
}