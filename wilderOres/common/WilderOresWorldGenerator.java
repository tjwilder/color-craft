package wilderOres.common;

import java.util.Random;

import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;
import cpw.mods.fml.common.IWorldGenerator;

public class WilderOresWorldGenerator implements IWorldGenerator
{

	public WilderOresWorldGenerator()
	{
		// TODO Auto-generated constructor stub
	}

	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world,
			IChunkProvider chunkGenerator, IChunkProvider chunkProvider)
	{
		if (world.provider.isSurfaceWorld())
		{
			generateSurface(random, world, chunkX * 16, chunkZ * 16);
		}
		
	}
	
	private void generateSurface(Random random, World world, int xOffset, int zOffset)
	{
		for (int i = 0; i < 2; i++)
		{
			for (int k = 0; k < 5; k++) // times to generate each ore
			{
				int x = random.nextInt(16) + xOffset;
				int y = random.nextInt(50) + 10;
				int z = random.nextInt(16) + zOffset;
				(new WorldGenMinable(wilderOres.common.WilderOres.coloredOre.blockID, 5)).generate(world, random, x, y, z);
			}
		}
	}

}
