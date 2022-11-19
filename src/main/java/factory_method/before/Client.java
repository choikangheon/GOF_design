package factory_method.before;

public class Client {

    public static void main(String[] args) {
        Client client = new Client();

        Ship whiteship = ShipFactory.orderShip("Whiteship", "hello@mail.com");
        Ship blackship = ShipFactory.orderShip("Blackship","hello@mail.com");
    }
}
