package singleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class App {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {

        Setting setting = Setting.INSTANCE;

        Constructor<Setting> declaredConstructor = Setting.class.getDeclaredConstructor();
        declaredConstructor.setAccessible(true);
        Setting setting1 = declaredConstructor.newInstance();

        System.out.println(setting==setting1);
    }

}
