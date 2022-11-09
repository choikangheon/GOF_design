package me.brody.designpatterns.abstract_factory;

public interface ShipPartsFactory {
    Anchor createAnchor();
    Wheel createWheel();
}
