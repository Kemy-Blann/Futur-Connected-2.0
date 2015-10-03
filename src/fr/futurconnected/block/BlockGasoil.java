package fr.futurconnected.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class BlockGasoil extends Block{

	public BlockGasoil(){
		super(Material.rock);
		this.setCreativeTab(CreativeTabs.tabBlock);
		this.setBlockName("Gasoil Ore");
		this.setBlockTextureName("bloc_gazoile");
		this.setStepSound(soundTypePiston);
		this.setHardness(3f);
	}
	
}
