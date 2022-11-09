package me.brody.designpatterns.abstract_factory;

public class WhiteShipFactory extends DefaultshipFactory{
    private ShipPartsFactory shipPartsFactory;

    public WhiteShipFactory(ShipPartsFactory shipPartsFactory) {
        this.shipPartsFactory = shipPartsFactory;
    }


}
