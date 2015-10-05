package fr.futurConnected.blocks;

import java.util.Random;

import fr.futurConnected.FuturConnected;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class BlockMetalOre extends Block{

	private int maxStackSize;

	public BlockMetalOre(Material material) {
		super(material);
		setCreativeTab(CreativeTabs.tabBlock);
		setHardness(5F);
		setResistance(5F);
		setStepSound(soundTypePiston);
		this.maxStackSize = 64;
		this.setHarvestLevel("pickaxe", 3);
	}

	@Override
	public Item getItemDropped(int id, Random rand, int fortune){
	return FuturConnected.Metal;
	}
	@Override
	public int quantityDropped(Random rand){
	return 1 + rand.nextInt(2);
	}
}
