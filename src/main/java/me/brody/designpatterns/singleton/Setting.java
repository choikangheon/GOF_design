package me.brody.designpatterns.singleton;

import java.io.Serializable;

public class Setting implements Serializable {

    private Setting() {
    }

    private static class SettingsHolder{
        private static final Setting INSTANCE = new Setting();
    }
    public static Setting getInstance() {
     return SettingsHolder.INSTANCE;
    }
}
