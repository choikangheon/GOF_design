package factory_method;

public class BlueCarFactory implements CarFactory{

    @Override
    public Car createCar() {
        return new BlueCar();
    }
}
