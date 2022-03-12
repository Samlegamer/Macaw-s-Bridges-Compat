package fr.samlegamer.utils;

import java.util.ArrayList;

public class ModsList
{
	public static void byg(ArrayList<String> MATERIAL, boolean isStem)
	{
		if(!isStem)
		{
			MATERIAL.add("aspen");
			MATERIAL.add("baobab");
			MATERIAL.add("blue_enchanted");
			MATERIAL.add("cherry");
			MATERIAL.add("cika");
			MATERIAL.add("cypress");
			MATERIAL.add("ebony");
			MATERIAL.add("ether");
			MATERIAL.add("fir");
			MATERIAL.add("green_enchanted");
			MATERIAL.add("holly");
			MATERIAL.add("jacaranda");
			MATERIAL.add("lament");
			MATERIAL.add("mahogany");
			MATERIAL.add("mangrove");
			MATERIAL.add("maple");
			MATERIAL.add("nightshade");
			MATERIAL.add("palm");
			MATERIAL.add("pine");
			MATERIAL.add("rainbow_eucalyptus");
			MATERIAL.add("redwood");
			MATERIAL.add("skyris");
			MATERIAL.add("willow");
			MATERIAL.add("witch_hazel");
			MATERIAL.add("zelkova");
		}
		
		if(isStem)
		{
			MATERIAL.add("bulbis");
			MATERIAL.add("imparius");
			MATERIAL.add("sythian");
		}
	}
	
	public static void bop(ArrayList<String> MATERIAL)
	{
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
	}
	
	public static void shroomed(ArrayList<String> MATERIAL)
	{
		MATERIAL.add("blue_hard_mushroom");
		MATERIAL.add("hard_mushroom");
		MATERIAL.add("orange_hard_mushroom");
		MATERIAL.add("purple_hard_mushroom");
	}
}