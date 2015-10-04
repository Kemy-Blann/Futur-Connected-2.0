package fr.futurConnected.items;

import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class Fuel extends Item{
	public Fuel()
	{
		this.setCreativeTab(CreativeTabs.tabMaterials);
		this.setTextureName("fc:Fuel");
		this.maxStackSize = 64;
	}
}
