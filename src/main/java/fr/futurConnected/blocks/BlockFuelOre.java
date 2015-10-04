package fr.futurConnected.blocks;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import fr.futurConnected.items.*;

public class BlockFuelOre extends Block{

	private int maxStackSize;
	public BlockFuelOre(Material metal) {
		super(metal);
		setCreativeTab(CreativeTabs.tabBlock);
		setHardness(3F);
		setResistance(5F);
		setStepSound(soundTypePiston);
		this.maxStackSize = 64;
	}
	@Override
	public Item getItemDropped(int id, Random rand, int fortune){
		return Items.coal;
	}
	@Override
	public int quantityDropped(Random rand){
		return 1 + rand.nextInt(5);
	}
}