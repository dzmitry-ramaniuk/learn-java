package org.learn.java.patterns.builder;

public interface Builder {
    void reset();

    void setSeats(int number);

    void setEngine(String engine);

    void setTripComputer(String tripComputer);

    void setGPS(String gps);
}
