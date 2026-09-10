package advtech;

import arc.*;
import arc.util.*;
import mindustry.mod.*;
import mindustry.ui.dialogs.*;
import advtech.content.*;

public class AdvTech extends Mod {

    public AdvTech() {
        Log.info("Carregando Advanced Tech Mod...");
    }

    @Override
    public void loadContent() {
        AdvTechItems.load();
        AdvTechBlocks.load();
        Log.info("Advanced Tech Mod carregado com sucesso!");
    }

    @Override
    public void init() {
        Events.on(ClientLoadEvent.class, e -> {
            // Adicionar diálogo de boas-vindas se necessário
            Time.runTask(10f, () -> {
                Log.info("Advanced Tech Mod - Pronto para usar!");
            });
        });
    }
}
