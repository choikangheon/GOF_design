package me.brody.designpatterns.singleton;

public class Setting {

    private Setting() {
    }

    private static class SettingsHolder{
        private static final Setting INSTANCE = new Setting();
    }
    public static Setting getInstance() {
     return SettingsHolder.INSTANCE;
    }
}
