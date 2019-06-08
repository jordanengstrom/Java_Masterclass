package com.jengstrom;

public class Planet extends HeavenlyBody {
    public Planet(String name, double orbitalPeriod) {
        super(name, orbitalPeriod, BodyTypes.PLANET);
    }

    @Override
    public boolean addSatellite(HeavenlyBody hb) {
        if(hb.getKey().getBodyType() == BodyTypes.MOON) {
            return super.addSatellite(hb);
        } else {
            return false;
        }
    }
}
