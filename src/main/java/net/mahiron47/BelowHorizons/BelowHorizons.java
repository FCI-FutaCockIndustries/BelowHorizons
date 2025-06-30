package net.mahiron47.BelowHorizons;

import net.mahiron47.BelowHorizons.Registrator.EventRegistratorWorldGeneration;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

import org.apache.logging.log4j.Logger;

@Mod(modid = BelowHorizons.MODID, name = BelowHorizons.NAME, version = BelowHorizons.VERSION, /*dependencies = "required-after:cubicchunks",*/ acceptedMinecraftVersions = "[1.12.2]", useMetadata = true)
public class BelowHorizons {
    public static final String MODID = "belowhorizons";
    public static final String NAME = "BelowHorizons";
    public static final String VERSION = "1.0.0";

    private static Logger logger;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        logger = event.getModLog();
    }

    @EventHandler
    public void init(FMLInitializationEvent event) {
        // just indicator for me
        logger.info("Created by Mahiron47");
        // Register world generation events
        MinecraftForge.TERRAIN_GEN_BUS.register(new EventRegistratorWorldGeneration()); // Replace vanilla world generation in class EventRegistratorWorldGeneration
    }

    
}