package org.learn.java.patterns.builder;

public class CarManualBuilder implements Builder {
    private Manual manual;

    @Override
    public void reset() {
        this.manual = new Manual();
    }

    @Override
    public void setSeats(int number) {
        this.manual.setSeats(number);
    }

    @Override
    public void setEngine(String engine) {
        this.manual.setEngine(engine);
    }

    @Override
    public void setTripComputer(String tripComputer) {
        this.manual.setTripComputer(tripComputer);
    }

    @Override
    public void setGPS(String gps) {
        this.manual.setGps(gps);
    }

    public Manual build() {
        return this.manual;
    }
}
