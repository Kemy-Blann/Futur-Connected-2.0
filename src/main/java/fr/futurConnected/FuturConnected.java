package fr.futurConnected;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import fr.futurConnected.blocks.*;
import fr.futurConnected.generation.*;
import fr.futurConnected.items.*;

@Mod(modid = "fc", name = "Futur Connected", version = "1.0")
public class FuturConnected {
	
	public static final String MODID = "Futur Connected";
	

	//Déclaration des Blocks
	public static Block blockMetalOre;
	public static Block blockFuelOre;
	public static Block blockRefinery;
	
	//Déclaration des Items
	public static Item Fuel;
	public static Item Metal;
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event){
		//Initialisation des Blocks
		blockMetalOre = new BlockMetalOre(Material.rock).setBlockName("blockMetalOre").setBlockTextureName("fc:blockMetalOre");
		blockFuelOre = new BlockFuelOre(Material.rock).setBlockName("blockFuelOre").setBlockTextureName("fc:blockFuelOre");
		blockRefinery = new Refinery(Material.rock).setBlockName("blockRefinery");
		
		//Initialisation des Items
		Fuel = new Fuel().setUnlocalizedName("Fuel").setTextureName("fc:Fuel");
		Metal = new Metal().setUnlocalizedName("Metal").setTextureName("fc:Métal");
		
		//Enregistrement des Blocks
		GameRegistry.registerBlock(blockMetalOre, "Metal Ore");
		GameRegistry.registerBlock(blockFuelOre, "Fuel Ore");
		GameRegistry.registerBlock(blockRefinery, "Refinery");
		
		
		//Enregistrement des Items
		GameRegistry.registerItem(Fuel, "Fuel");
		GameRegistry.registerItem(Metal, "Metal");
		//Enregistrement des World Generator
		GameRegistry.registerWorldGenerator(new MetalOreGeneration(), 0);
		GameRegistry.registerWorldGenerator(new FuelOreGeneration(), 0);
	}
	
	@EventHandler
	public void init(FMLInitializationEvent event){
		
	}
	
	@EventHandler
	public void postInit(FMLPreInitializationEvent event){
		
	}
}