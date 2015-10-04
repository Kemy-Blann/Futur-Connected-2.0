package fr.futurConnected;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import fr.futurConnected.blocks.BlockFuelOre;
import fr.futurConnected.blocks.BlockMetalOre;
import fr.futurConnected.generation.FuelOreGeneration;
import fr.futurConnected.generation.MetalOreGeneration;

@Mod(modid = "fc", name = "Futur Connected", version = "1.0")
public class FuturConnected {
	
	//Déclaration des Blocks
	public static Block blockMetalOre;
	public static Block blockFuelOre;
	
	//Déclaration des Items
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event){
		//Initialisation des Blocks
		blockMetalOre = new BlockMetalOre(Material.rock).setBlockName("blockMetalOre").setBlockTextureName("fc:blockMetalOre").setLightLevel(0.2F);
		blockFuelOre = new BlockFuelOre(Material.rock).setBlockName("blockFuelOre").setBlockTextureName("fc:blockFuelOre");
		
		//Initialisation des Items
		
		
		//Enregistrement des Blocks
		GameRegistry.registerBlock(blockMetalOre, "Metal Ore");
		GameRegistry.registerBlock(blockFuelOre, "Fuel Ore");
		
		//Enregistrement des Items
		
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