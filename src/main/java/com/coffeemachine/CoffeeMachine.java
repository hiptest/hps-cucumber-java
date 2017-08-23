package com.coffeemachine;

import java.util.HashMap;
import java.util.Map;

public class CoffeeMachine {

    private boolean started = false;
    public boolean coffeeServed = false;

    private boolean settingsDisplayed = false;
    private int tankContent;
    private int beansContent;
    private int groundsContent;
    private int countdownToDescale;
    private String lang;
    private String waterHardness = "2";
    private String grinder = "medium";

    public CoffeeMachine() {
        descale();
        fillTank();
        fillBeans();
        emptyGrounds();
    }

    public void start(String lang) {
        started = true;
        this.lang = lang;
    }

    public void stop() {
        started = false;
    }

    public void showSettings() {
        settingsDisplayed = true;
    }

    public void hideSettings() {
        settingsDisplayed = false;
    }

    public Map<String,String> getSettings() {
        Map<String,String> settings = new HashMap<String, String>();
        settings.put("water hardness", waterHardness);
        settings.put("grinder", grinder);

        return settings;
    }

    public String message() {
        if(!started) return "";

        if (settingsDisplayed) return i18n("settings");
        if (tankContent <= 10) return i18n("tank");
        if (beansContent < 3) return i18n("beans");
        if (groundsContent >= 30) return i18n("grounds");
        if (isDescalingNeeded()) return i18n("descale");
        return i18n("ready");
    }

    public void takeCoffee() {
        if (tankContent == 0 || beansContent == 0) {
            coffeeServed = false;
        } else {
            coffeeServed = true;
            tankContent -= 1;
            beansContent -= 1;
            groundsContent += 1;
            countdownToDescale -= 1;
        }
    }

    public void fillTank() {
        tankContent = 60;
    }

    public void fillBeans() {
        beansContent = 40;
    }

    public void emptyGrounds() {
        groundsContent = 0;
    }

    public void descale() {
        countdownToDescale = 500;
    }

    public boolean isDescalingNeeded() {
        return countdownToDescale <= 0;
    }

    private String i18n(String key) {
        Map<String,String> map = new HashMap<String, String>();
        if (lang.equals("fr")) {
            map.put("tank", "Remplir reservoir");
            map.put("beans", "Ajouter grains");
            map.put("grounds", "Vider marc");
            map.put("ready", "Pret");
            map.put("settings", "Configurer:\n - 1: durete de l'eau\n - 2: mouture");
            map.put("descale", "Detartage requis");
        } else {
            map.put("tank", "Fill tank");
            map.put("beans", "Fill beans");
            map.put("grounds", "Empty grounds");
            map.put("ready", "Ready");
            map.put("settings", "Settings:\n - 1: water hardness\n - 2: grinder");
            map.put("descale", "Descaling is needed");
        }
        return map.get(key);
    }
}
