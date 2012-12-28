package wilderOres.common;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class BlockColoredOre extends Block
{

	public BlockColoredOre(int id, int texture)
	{
		super(id, texture, Material.rock);
	}
	
	public String getTextureFile()
	{
		return ("/wilderOres/block.png");
	}
	
	@Override
	public int getBlockTextureFromSideAndMetadata (int side, int metadata) {
		return metadata;
	}
	
	@Override
	public int damageDropped(int metadata)
	{
		return metadata;
	}

}
