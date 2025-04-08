package org.learn.java.patterns.builder;

public class CarBuilder implements Builder {
    private Car car;

    @Override
    public void reset() {
        this.car = new Car();
    }

    @Override
    public void setSeats(int number) {
        this.car.setSeats(number);
    }

    @Override
    public void setEngine(String engine) {
        this.car.setEngine(engine);
    }

    @Override
    public void setTripComputer(String tripComputer) {
        this.car.setTripComputer(tripComputer);
    }

    @Override
    public void setGPS(String gps) {
        this.car.setGps(gps);
    }

    public Car build() {
        return this.car;
    }
}
