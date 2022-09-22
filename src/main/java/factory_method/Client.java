package factory_method;

public class Client {
    public static void main(String[] args) {
        Car car = new BlueCarFactory().orderCar("blue","hello");
    }
}
