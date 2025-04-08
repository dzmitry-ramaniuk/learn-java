package org.learn.java.patterns.builder;

public class Director {

    public void constructSportsCar(Builder builder) {
        builder.reset();
        builder.setSeats(2);
        builder.setEngine("V8");
        builder.setTripComputer("Basic");
        builder.setGPS("Basic");
    }


}
