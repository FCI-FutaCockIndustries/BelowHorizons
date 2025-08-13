package net.mahiron47.belowhorizons.utils;

import io.github.opencubicchunks.cubicchunks.api.util.IntRange;
import io.github.opencubicchunks.cubicchunks.api.world.ICubicWorldType;
import io.github.opencubicchunks.cubicchunks.api.worldgen.ICubeGenerator;
import net.minecraft.world.World;
import net.minecraft.world.WorldServer;
import net.minecraft.world.WorldType;
import net.minecraft.world.biome.BiomeProvider;
import net.minecraft.world.biome.BiomeProviderSingle;
import net.mahiron47.belowhorizons.generator.MilkyWayGenerator;
import net.minecraft.init.Biomes;

public class MilkyWay extends WorldType implements ICubicWorldType {
	private MilkyWay() {
		super("MilkyWay");
	}

	public static MilkyWay create() {
		return new MilkyWay();
	}

	@Override
	public ICubeGenerator createCubeGenerator(World world) {
		return new MilkyWayGenerator(world);
	}

	@Override
	public BiomeProvider getBiomeProvider(World world) {
		// Можете использовать одиночный биом или создать свой BiomeProvider
		return new BiomeProviderSingle(Biomes.PLAINS);
	}

	@Override
	public IntRange calculateGenerationHeightRange(WorldServer world) {
		// Определите диапазон высот для генерации
		return new IntRange(-6378160, Integer.MAX_VALUE); // Бесконечная высота
	}

	@Override
	public boolean hasCubicGeneratorForWorld(World world) {
		return true;
	}
}
