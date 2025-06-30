package net.mahiron47.BelowHorizons.Generator;

import net.minecraft.init.Blocks;
import net.minecraft.world.World;
import net.minecraft.world.chunk.ChunkPrimer;
import net.minecraft.world.gen.MapGenBase;

public class VanilaUltraHardcoreGenerator extends MapGenBase {
    @Override
    protected void recursiveGenerate(World world, int chunkX, int chunkZ, int originalX, int originalZ,
            ChunkPrimer primer) {
        super.recursiveGenerate(world, chunkX, chunkZ, originalX, originalZ, primer);

        for (int x = 0; x < 16; x++) {
            for (int z = 0; z < 16; z++) {
                for (int y = 0; y < world.getHeight(); y++) {
                    if (primer.getBlockState(x, y, z) != Blocks.AIR) {
                        primer.setBlockState(x, y, z, Blocks.AIR.getDefaultState());
                    }
                }
            }
        }
    }
}