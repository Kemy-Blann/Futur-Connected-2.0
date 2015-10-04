package fr.futurConnected.blocks;

import fr.futurConnected.FuturConnected;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class BlockMetalOre extends Block{

	private int maxStackSize;

	public BlockMetalOre(Material material) {
		super(material);
		setCreativeTab(CreativeTabs.tabBlock);
		setHardness(5F);
		setResistance(5F);
		setStepSound(soundTypePiston);
		this.maxStackSize = 64;
	}
	
}