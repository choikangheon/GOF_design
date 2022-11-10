package factory_method.after;

public class Client {

    public static void main(String[] args) {
        Client client = new Client();
        Ship whiteship = new WhiteShipFactory().orderShip("Whiteship", "brody@gmail.com");
        System.out.println("witeship = " + whiteship);
        Ship blackShip = new BlackShipFactory().orderShip("blackship", "brody@gmail.com");

    }
}
