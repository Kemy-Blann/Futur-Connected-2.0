package fr.futurconnected.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class BlockMetal extends Block{

	public BlockMetal(){
		super(Material.rock);
		this.setCreativeTab(CreativeTabs.tabBlock);
	}
	
}
