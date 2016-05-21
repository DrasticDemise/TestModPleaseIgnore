package com.names.spawncontrol.core;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

/**
 * Created by Bailey on 5/20/2016.
 */
@Mod(modid = SpawnController.MODID, name = SpawnController.MODNAME, useMetadata = true, version = SpawnController.VERSION)
public class SpawnController {
    public static final String MODID = "spawnController";
    public static final String MODNAME = "Spawn Controller";
    public static final String VERSION = "1.0.8";
    //public static final String URL = "https://raw.githubusercontent.com/DrasticDemise/Terrain-Crystals/master/1.9%20Update%20Handler";

    @SidedProxy
    public static CommonProxy proxy;

    @Mod.Instance
    public static SpawnController instance;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event){
        //logger = event.getModLog();
        proxy.preInit(event);
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent e){
        proxy.init(e);
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent e){
        proxy.postInit(e);
    }

    public static class CommonProxy {
        public void preInit(FMLPreInitializationEvent e){
           // Configuration config = new Configuration(e.getSuggestedConfigurationFile());
           // ConfigurationFile.configFile(config);
            //Initialization of Blocks and Items
            //InitItems.init();
        }
        public void init(FMLInitializationEvent e){
            //InitItems.recipes();
           // TerrainCrystalAbstract.initReplaceableBlocks();
           // TerrainCrystalAbstract.initInvalidSpaces();
        }
        public void postInit(FMLPostInitializationEvent e){

        }
    }

    public static class ClientProxy extends CommonProxy{
        @Override
        public void preInit(FMLPreInitializationEvent e){
            super.preInit(e);
            //Initialization of models
          //  InitItems.initModels();
          //  new VersionChecker().init();
        }

    }
    public static class ServerProxy extends CommonProxy{

    }
}
