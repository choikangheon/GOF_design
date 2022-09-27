package factory_method;

public class BlackCarFactory implements CarFactory{

    @Override
    public Car createCar() {
        return new BlackCar();
    }
}
