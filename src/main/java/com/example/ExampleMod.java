package com.example;

import com.example.event.FishEventListen;
import net.fabricmc.api.ModInitializer;

import net.xiaoyu233.fml.ModResourceManager;
import net.xiaoyu233.fml.reload.event.MITEEvents;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ExampleMod implements ModInitializer {
    public static final String MOD_ID = "modid";

    // This logger is used to write text to the console and the log file.
    // It is considered best practice to use your mod id as the logger's name.
    // That way, it's clear which mod wrote info, warnings, and errors.
    public static final Logger LOGGER = LogManager.getLogger(MOD_ID);

    @Override
    public void onInitialize() {
        // This code runs as soon as Minecraft is in a mod-load-ready state.
        // However, some things (like resources) may still be uninitialized.
        // Proceed with mild caution.

        LOGGER.info("Hello MITE Dev world!");

        // Add resource pack domain, default "minecraft"
        ModResourceManager.addResourcePackDomain(MOD_ID);

        //Register an event listening object
        MITEEvents.MITE_EVENT_BUS.register(new FishEventListen());
    }
}
