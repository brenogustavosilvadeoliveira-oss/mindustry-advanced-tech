package advtech.content;

import mindustry.type.*;
import mindustry.world.*;
import mindustry.world.blocks.production.*;
import mindustry.world.blocks.storage.*;
import mindustry.world.blocks.defense.*;
import mindustry.world.blocks.power.*;
import mindustry.world.blocks.distribution.*;
import mindustry.world.blocks.logic.*;
import mindustry.graphics.*;
import arc.graphics.*;

public class AdvTechBlocks {
    public static Block

    // MINÉRIOS FUTURISTAS
    luminiteOre, crystaliteOre, xenoithOre, quantumOre, voidOre, nexusiteOre,
    etherealOre, plasmoniteOre, stellarOre, cosmicOre, arcaneOre, infinityOre,
    
    // PROCESSAMENTO
    luminiteProcesser, crystaliteRefinery, quantumFurnace, voidExtractor,
    nexusiteReactor, etherealChamber, synthesisLab,
    
    // ENERGIA
    advancedSolarPanel, fusionReactor, antiMatterReactor, energyCondenser,
    powerBattery, powerVault, superBattery,
    
    // ARMAS/DEFESA
    laserTurret, plasmaCannon, pulseTurret, missileHeavy,
    railgunTower, sonicBlaster, disintegratorRay, forcefieldWall,
    energyShield, regeneratorBlock,
    
    // LOGÍSTICA
    speedTransport, smartDistributor, vaultPremium, vacuumTube,
    highCapacityBelt, floatingContainer, logisticHub,
    
    // OUTROS
    commandCenter, amplifier, teleporterGate, forcefieldGenerator;

    public static void load() {
        // MINÉRIOS
        luminiteOre = new OreBlock("luminite-ore"){{
            oreDefault = true;
            oreScale = 24f;
            oreThreshold = 0.842f;
            itemDrop = AdvTechItems.luminite;
        }};

        crystaliteOre = new OreBlock("crystalite-ore"){{
            oreDefault = true;
            oreScale = 20f;
            oreThreshold = 0.87f;
            itemDrop = AdvTechItems.crystalite;
        }};

        xenoithOre = new OreBlock("xenoith-ore"){{
            oreDefault = true;
            oreScale = 18f;
            oreThreshold = 0.88f;
            itemDrop = AdvTechItems.xenoith;
        }};

        quantumOre = new OreBlock("quantum-ore"){{
            oreDefault = true;
            oreScale = 16f;
            oreThreshold = 0.91f;
            itemDrop = AdvTechItems.quantum;
        }};

        voidOre = new OreBlock("void-ore"){{
            oreDefault = true;
            oreScale = 14f;
            oreThreshold = 0.93f;
            itemDrop = AdvTechItems.voidMetal;
        }};

        nexusiteOre = new OreBlock("nexusite-ore"){{
            oreDefault = true;
            oreScale = 12f;
            oreThreshold = 0.95f;
            itemDrop = AdvTechItems.nexusite;
        }};

        // MINÉRIOS RARÍSSIMOS
        etherealOre = new OreBlock("ethereal-ore"){{
            oreDefault = true;
            oreScale = 10f;
            oreThreshold = 0.96f;
            itemDrop = AdvTechItems.ethereal;
        }};

        plasmoniteOre = new OreBlock("plasmonite-ore"){{
            oreDefault = true;
            oreScale = 8f;
            oreThreshold = 0.97f;
            itemDrop = AdvTechItems.plasmonite;
        }};

        stellarOre = new OreBlock("stellar-ore"){{
            oreDefault = true;
            oreScale = 6f;
            oreThreshold = 0.98f;
            itemDrop = AdvTechItems.stellar;
        }};

        cosmicOre = new OreBlock("cosmic-ore"){{
            oreDefault = true;
            oreScale = 4f;
            oreThreshold = 0.99f;
            itemDrop = AdvTechItems.cosmic;
        }};

        arcaneOre = new OreBlock("arcane-ore"){{
            oreDefault = true;
            oreScale = 3f;
            oreThreshold = 0.995f;
            itemDrop = AdvTechItems.arcane;
        }};

        infinityOre = new OreBlock("infinity-ore"){{
            oreDefault = true;
            oreScale = 2f;
            oreThreshold = 0.998f;
            itemDrop = AdvTechItems.infinity;
        }};

        // COMANDO E LOGÍSTICA
        commandCenter = new Block("command-center"){{
            size = 3;
            health = 500;
            buildVisibility = BuildVisibility.shown;
        }};

        vaultPremium = new StorageBlock("vault-premium"){{
            size = 3;
            health = 400;
            itemCapacity = 15000;
            buildVisibility = BuildVisibility.shown;
        }};

        // ENERGIA
        fusionReactor = new PowerGenerator("fusion-reactor"){{
            size = 4;
            health = 600;
            powerProduction = 15f;
            buildVisibility = BuildVisibility.shown;
        }};

        antiMatterReactor = new PowerGenerator("antimatter-reactor"){{
            size = 5;
            health = 800;
            powerProduction = 30f;
            buildVisibility = BuildVisibility.shown;
        }};
    }
}
