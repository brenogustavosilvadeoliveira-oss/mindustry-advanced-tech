package advtech.content;

import mindustry.type.*;
import mindustry.content.*;
import arc.graphics.*;

public class AdvTechUnits {
    public static UnitType
    constructDrone, combatDrone, advancedDrone,
    sentinelBot, titanBot, nexusUnit,
    transporterBot, defenseBot, commandUnit;

    public static void load() {
        constructDrone = new UnitType("construct-drone"){{
            speed = 3f;
            flying = true;
            health = 80;
            armor = 1f;
            mineSpeed = 8f;
            mineTier = 3;
        }};

        combatDrone = new UnitType("combat-drone"){{
            speed = 4.5f;
            flying = true;
            health = 150;
            armor = 2f;
            weapons.add(new Weapon(){{
                name = "plasma-gun";
                x = 0;
                y = 0;
                shootY = 3;
                reload = 30;
                shots = 2;
                inaccuracy = 8f;
            }});
        }};

        advancedDrone = new UnitType("advanced-drone"){{
            speed = 5.5f;
            flying = true;
            health = 250;
            armor = 4f;
            weapons.add(new Weapon(){{
                name = "laser-cannon";
                x = 0;
                y = 0;
                shootY = 5;
                reload = 25;
                shots = 3;
                inaccuracy = 4f;
            }});
        }};

        sentinelBot = new UnitType("sentinel-bot"){{
            speed = 2.5f;
            health = 400;
            armor = 6f;
            mechLeg = true;
            weapons.add(new Weapon(){{
                name = "heavy-cannon";
                x = 4;
                y = 0;
                shootY = 6;
                reload = 45;
                shots = 2;
            }});
        }};

        titanBot = new UnitType("titan-bot"){{
            speed = 2f;
            health = 800;
            armor = 10f;
            mechLeg = true;
            weapons.add(new Weapon(){{
                name = "mega-laser";
                x = 5;
                y = 0;
                shootY = 8;
                reload = 60;
                shots = 4;
            }});
        }};

        nexusUnit = new UnitType("nexus-unit"){{
            speed = 6f;
            flying = true;
            health = 500;
            armor = 8f;
            weapons.add(new Weapon(){{
                name = "plasma-cannon";
                x = 0;
                y = 0;
                shootY = 7;
                reload = 35;
                shots = 3;
                inaccuracy = 5f;
            }});
        }};

        transporterBot = new UnitType("transporter-bot"){{
            speed = 3.5f;
            health = 200;
            armor = 3f;
            carryCapacity = 500f;
        }};

        defenseBot = new UnitType("defense-bot"){{
            speed = 2f;
            health = 600;
            armor = 8f;
            mechLeg = true;
            weapons.add(new Weapon(){{
                name = "defense-laser";
                x = 3;
                y = 0;
                shootY = 5;
                reload = 20;
                shots = 3;
            }});
        }};

        commandUnit = new UnitType("command-unit"){{
            speed = 5f;
            flying = true;
            health = 1000;
            armor = 12f;
            weapons.add(new Weapon(){{
                name = "command-laser";
                x = 0;
                y = 0;
                shootY = 8;
                reload = 30;
                shots = 5;
            }});
        }};
    }
}
