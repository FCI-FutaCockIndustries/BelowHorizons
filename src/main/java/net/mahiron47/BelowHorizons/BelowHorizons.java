package net.mahiron47.BelowHorizons;

import net.mahiron47.BelowHorizons.Utils.MilkyWay;
import net.mahiron47.BelowHorizons.Utils.WorldTypeRemover;
import net.minecraft.world.WorldType;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.mahiron47.BelowHorizons.Registrator.EventRegistrator;

import org.apache.logging.log4j.Logger;

@Mod(modid = BelowHorizons.MODID, name = BelowHorizons.NAME, version = BelowHorizons.VERSION, dependencies = "required-after:cubicchunks", acceptedMinecraftVersions = "[1.12.2]", useMetadata = true)
public class BelowHorizons {
    public static final String MODID = "belowhorizons";
    public static final String NAME = "BelowHorizons";
    public static final String VERSION = "1.0.0";

    private static Logger logger;
    public static WorldType worldType;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        logger = event.getModLog();
        worldType = MilkyWay.create();

        WorldTypeRemover.removeVanillaWorldTypes();
    }

    @EventHandler
    public void init(FMLInitializationEvent event) {
        logger.info("Created by Mahiron47");
    }
}