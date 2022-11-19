package abstract_factory.before;


import abstract_factory.after.ShipPartsFactory;
import factory_method.after.Ship;
import factory_method.after.ShipFactory;
import factory_method.after.WhiteShip;

public class WhiteShipFactory implements ShipFactory {

    private ShipPartsFactory shipPartsFactory;

    public WhiteShipFactory(ShipPartsFactory shipPartsFactory) {
        this.shipPartsFactory = shipPartsFactory;
    }

    @Override
    public Ship createShip() {
        Ship ship = new WhiteShip();
        ship.setAnchor(shipPartsFactory.createAnchor());
        ship.setWheel(shipPartsFactory.createWheel());
        return ship;
    }
}
