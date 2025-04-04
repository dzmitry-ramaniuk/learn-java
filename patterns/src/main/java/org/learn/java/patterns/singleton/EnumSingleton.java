package org.learn.java.patterns.singleton;

import java.time.LocalDateTime;

public enum EnumSingleton {
    INSTANCE;

    private LocalDateTime createdAt;

    EnumSingleton() {
        createdAt = LocalDateTime.now();
    }

    public String getInfo() {
        return String.format("%s %s", this.getClass(), createdAt.toString());
    }
}
