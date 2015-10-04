package fr.futurConnected.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class BlockFuelOre extends Block{

	public BlockFuelOre(Material metal) {
		super(metal);
		setCreativeTab(CreativeTabs.tabBlock);
	}
}