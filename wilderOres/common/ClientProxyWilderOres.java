package wilderOres.common;

import net.minecraftforge.client.MinecraftForgeClient;


public class ClientProxyWilderOres extends CommonProxyWilderOres
{
 @Override
    public void registerRenderThings()
    {
	 	MinecraftForgeClient.preloadTexture("/wilderOres/blocks.png");
    }
}
