package org.learn.java.patterns.builder;

public class BuilderUtils {

    public void prepareSportcar() {
        CarBuilder carBuilder = new CarBuilder();
        CarManualBuilder carManualBuilder = new CarManualBuilder();

        Director director = new Director();

        director.constructSportsCar(carBuilder);
        carBuilder.build();
        director.constructSportsCar(carManualBuilder);
        carManualBuilder.build();
    }
}
