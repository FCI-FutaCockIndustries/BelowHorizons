package net.mahiron47.BelowHorizons.Utils;

import net.minecraft.world.WorldType;
import java.lang.reflect.Field;

public class WorldTypeRemover {
	public static void removeVanillaWorldTypes() {
		try {
			Field worldTypesField = WorldType.class.getDeclaredField("worldTypes");
			worldTypesField.setAccessible(true);
			WorldType[] types = (WorldType[]) worldTypesField.get(null);
			for (int i = 0; i < types.length; i++) {
				if (types[i] != null && !types[i].getName().equals("MilkyWay")) {
					types[i] = null; // "Удаляем" тип
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}