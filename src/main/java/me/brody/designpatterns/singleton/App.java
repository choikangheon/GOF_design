package me.brody.designpatterns.singleton;

import java.io.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class App {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException, IOException, ClassNotFoundException {

        Setting setting = Setting.getInstance();
        Setting setting1 = null;

        try (ObjectOutput out = new ObjectOutputStream(new FileOutputStream("setting.obj"))) {
            out.writeObject(setting);
        }

        try (ObjectInput in = new ObjectInputStream(new FileInputStream("setting.obj"))) {
            setting1 = (Setting) in.readObject();
        }

        System.out.println(setting == setting1);
    }

}
