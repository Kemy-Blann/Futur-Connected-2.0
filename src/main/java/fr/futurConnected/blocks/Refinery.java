package fr.futurConnected.blocks;

import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.util.IIcon;
import fr.futurConnected.FuturConnected;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class Refinery extends Block{
	
	//Textures des faces
	private IIcon side, top;
	private int maxStackSize;
	
	public Refinery(Material m){
		super(m);
		setCreativeTab(CreativeTabs.tabBlock);
		setHardness(5F);
		setResistance(5F);
		setStepSound(soundTypePiston);
		this.maxStackSize = 64;
		this.setHarvestLevel("pickaxe", 3);
	}
	
	//Methodes
	public void registerBlockIcons(IIconRegister i){
		this.blockIcon = i.registerIcon("fc:refinery_face");
		this.side = i.registerIcon("fc:refinery_side");
		this.top = i.registerIcon("fc:refinery_top");
	}
	
	public IIcon getIcon(int side, int metadata){
		if(side == 0 || side == 1){
			return this.top;
		} else if(side == 3){
			return this.blockIcon;
		}
		return this.side;
	}
}
