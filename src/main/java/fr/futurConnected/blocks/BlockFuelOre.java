package fr.futurConnected.blocks;

import java.util.Random;

import net.minecraft.block.BlockOre;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.util.MathHelper;
import net.minecraft.world.IBlockAccess;
import fr.futurConnected.FuturConnected;

public class BlockFuelOre extends BlockOre{

	private int maxStackSize;
	private Random rand = new Random();
	
	public BlockFuelOre(Material metal) {
		super();
		setCreativeTab(CreativeTabs.tabBlock);
		setHardness(3F);
		setResistance(5F);
		setStepSound(soundTypePiston);
		this.maxStackSize = 64;
		this.setHarvestLevel("pickaxe", 2);
	}
	@Override
	public Item getItemDropped(int id, Random rand, int fortune){
		return FuturConnected.Fuel;
	}
	@Override
	public int quantityDropped(Random rand){
		return 1 + rand.nextInt(5);
	}
	@Override
	public int getExpDrop(IBlockAccess world, int pos, int fortune) {
		return MathHelper.getRandomIntegerInRange(rand,10,40);
	}
	
	
}