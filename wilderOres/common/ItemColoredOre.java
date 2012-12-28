package wilderOres.common;

import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;

public class ItemColoredOre extends ItemBlock
{

	private final static String[] subNames = {"1", "2"};

	public ItemColoredOre(int id) {
		super(id);
		setHasSubtypes(true);
		setItemName("blockColoredOre");
	}

	@Override
	public int getMetadata (int damageValue) {
		return damageValue;
	}

	@Override
	public String getItemNameIS(ItemStack itemstack) {
		return getItemName() + "." + subNames[itemstack.getItemDamage()];
	}
}
