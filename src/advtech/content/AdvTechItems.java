package advtech.content;

import mindustry.type.*;
import arc.graphics.*;

public class AdvTechItems {
    public static Item
    luminite, crystalite, xenoith, quantum, voidMetal, nexusite,
    ethereal, plasmonite, stellar, cosmic, arcane, infinity;

    public static void load() {
        // MINÉRIOS BÁSICOS
        luminite = new Item("luminite"){{
            color = Color.valueOf("9eab7e");
            hardness = 2;
            radioactivity = 0.1f;
        }};

        crystalite = new Item("crystalite"){{
            color = Color.valueOf("7c7dd4");
            hardness = 3;
            radioactivity = 0.2f;
        }};

        xenoith = new Item("xenoith"){{
            color = Color.valueOf("a366ff");
            hardness = 4;
            radioactivity = 0.3f;
        }};

        // MINÉRIOS INTERMEDIÁRIOS
        quantum = new Item("quantum"){{
            color = Color.valueOf("00ff00");
            hardness = 5;
            radioactivity = 0.5f;
        }};

        voidMetal = new Item("void-metal"){{
            color = Color.valueOf("1a1a2e");
            hardness = 6;
            radioactivity = 0.7f;
        }};

        nexusite = new Item("nexusite"){{
            color = Color.valueOf("ff6b9d");
            hardness = 7;
            radioactivity = 1f;
        }};

        // MINÉRIOS RARÍSSIMOS
        ethereal = new Item("ethereal"){{
            color = Color.valueOf("00ffff");
            hardness = 8;
            radioactivity = 1.5f;
        }};

        plasmonite = new Item("plasmonite"){{
            color = Color.valueOf("ffaa00");
            hardness = 9;
            radioactivity = 2f;
        }};

        stellar = new Item("stellar"){{
            color = Color.valueOf("ffd700");
            hardness = 10;
            radioactivity = 2.5f;
        }};

        // MINÉRIOS LENDÁRIOS
        cosmic = new Item("cosmic"){{
            color = Color.valueOf("ff00ff");
            hardness = 11;
            radioactivity = 3f;
        }};

        arcane = new Item("arcane"){{
            color = Color.valueOf("00d4ff");
            hardness = 12;
            radioactivity = 4f;
        }};

        infinity = new Item("infinity"){{
            color = Color.valueOf("ffffff");
            hardness = 15;
            radioactivity = 5f;
        }};
    }
}
