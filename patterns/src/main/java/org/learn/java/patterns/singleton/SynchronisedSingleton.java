package org.learn.java.patterns.singleton;

import java.time.LocalDateTime;

public class SynchronisedSingleton {

    private static SynchronisedSingleton instance;
    private static LocalDateTime createdAt;

    private SynchronisedSingleton(){
    }

    public static SynchronisedSingleton getInstance() {
        if (instance != null) {
            return instance;
        }

        synchronized (SynchronisedSingleton.class) {
            if (instance == null) {
                createdAt = LocalDateTime.now();
                instance = new SynchronisedSingleton();
            }

            return instance;
        }
    }


    public String getInfo() {
        return "Created at: " + createdAt;
    }

}
