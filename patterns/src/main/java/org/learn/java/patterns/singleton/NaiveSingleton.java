package org.learn.java.patterns.singleton;

import java.time.LocalDateTime;

public class NaiveSingleton {

    private static NaiveSingleton instance;
    private static LocalDateTime createdAt;

    private NaiveSingleton() {
    }

    public static NaiveSingleton getInstance() {
        if (instance == null) {
            createdAt = LocalDateTime.now();
            instance = new NaiveSingleton();
        }

        return instance;
    }

    public String getInfo() {
        return String.format("%s %s", instance.getClass(), createdAt.toString());
    }
}
