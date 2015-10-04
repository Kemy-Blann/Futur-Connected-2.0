package fr.futurConnected.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class BlockMetalOre extends Block{

	public BlockMetalOre(Material material) {
		super(material);
		setCreativeTab(CreativeTabs.tabBlock);
	}
	
}