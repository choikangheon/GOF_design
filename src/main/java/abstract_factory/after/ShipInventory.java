package abstract_factory.after;

import abstract_factory.before.WhiteShipFactory;
import factory_method.after.Ship;
import factory_method.after.ShipFactory;


public class ShipInventory {
    public static void main(String[] args) {
        ShipFactory shipFactory = new WhiteShipFactory(new WhitePartsProFactory());
        Ship ship = shipFactory.createShip();
        System.out.println("ship = " + ship.getAnchor().getClass());
        System.out.println("ship = " + ship.getWheel().getClass());
    }
}
