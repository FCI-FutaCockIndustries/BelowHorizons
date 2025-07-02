package net.mahiron47.BelowHorizons.Registrator;

import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.WorldType;
import net.minecraftforge.event.world.WorldEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class EventRegistrator {

	@SubscribeEvent
	public void onWorldSpawn(WorldEvent.CreateSpawnPosition event) {
		World world = event.getWorld();

		// Установить фиксированную точку спауна
		if (event.getSettings().getTerrainType() == WorldType.FLAT
				|| event.getSettings().getTerrainType() == WorldType.DEFAULT ||
				event.getSettings().getTerrainType() == WorldType.LARGE_BIOMES
				|| event.getSettings().getTerrainType() == WorldType.AMPLIFIED) {
			BlockPos spawnPoint = new BlockPos(0, 85, 0); // координаты спауна
			world.setSpawnPoint(spawnPoint);
		}
	}
}
