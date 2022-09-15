package me.brody.designpatterns.singleton;

public class App {
    public static void main(String[] args) {

        Setting instance = Setting.getInstance();
        Setting instance1 = Setting.getInstance();

        System.out.println(instance==instance1);
    }

}
