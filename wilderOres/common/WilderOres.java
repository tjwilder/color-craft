package wilderOres.common;

import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

@Mod(modid = "Khalory_WilderOres", name = "Wilder Ores", version = "0.1")
@NetworkMod(clientSideRequired = true, serverSideRequired = false)
public class WilderOres
{
	@SidedProxy(clientSide = "wilderOres.common.ClientProxyWilderOres", serverSide = "wilderOres.common.CommonProxyWilderOres")
	public static CommonProxyWilderOres proxy;
	public static final WilderOresWorldGenerator worldGen = new WilderOresWorldGenerator();
	
	public static final Block coloredOre = new BlockColoredOre(250, 0).setBlockName("coloredOre").setCreativeTab(CreativeTabs.tabBlock);
	public static final String[] coloredOreNames = {"ColoredOre1", "Colored Ore 2"};
	
	@Init
	public void load(FMLInitializationEvent event) 
	{
		proxy.registerRenderThings();
		GameRegistry.registerBlock(coloredOre, "BlockColoredOre.class");
		GameRegistry.registerWorldGenerator(worldGen);

		for (int i = 0; i < coloredOreNames.length; i++) {
			ItemStack multiBlockStack = new ItemStack(coloredOre, 1, i);
			LanguageRegistry.addName(multiBlockStack, coloredOreNames[i]);
		}		
	}
}
