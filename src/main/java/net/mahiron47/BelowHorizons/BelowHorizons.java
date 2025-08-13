package net.mahiron47.belowhorizons;

import net.mahiron47.belowhorizons.utils.MilkyWay;
import net.minecraft.world.WorldType;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.Logger;

@Mod(modid = BelowHorizons.MODID, name = BelowHorizons.NAME, version = BelowHorizons.VERSION, dependencies = "required-after:cubicchunks", useMetadata = true)
public class BelowHorizons {
    public static final String MODID = "belowhorizons";
    public static final String NAME = "Below Horizons";
    public static final String VERSION = "1.0.0";

    private static Logger logger;
    public static WorldType worldType;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        logger = event.getModLog();
        logger.info("BelowHorizons: Mixins are enabled!");
        worldType = MilkyWay.create();
    }

    @EventHandler
    public void init(FMLInitializationEvent event) {
        logger.info("Created by Mahiron47");
    }
}