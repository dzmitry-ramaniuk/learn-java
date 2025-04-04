package org.learn.java.patterns.singleton;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SingletonUtils {

    private SingletonUtils() {
    }

    public static void executeForSynchronisedSingleton(int repeatCount, int threadCount) {
        try (ExecutorService executorService = Executors.newFixedThreadPool(threadCount)) {
            for (int i = 0; i < repeatCount; i++) {
                executorService.execute(() ->
                        System.out.println("Output: " + SynchronisedSingleton.getInstance().getInfo()));
            }

            executorService.shutdown();
        }
    }

    public static void executeForEnumSingleton(int repeatCount) {
        try (ExecutorService executorService = Executors.newVirtualThreadPerTaskExecutor()) {

            for (int i = 0; i < repeatCount; i++) {
                executorService.execute(() ->
                        System.out.println("Output: " + EnumSingleton.INSTANCE.getInfo()));
            }

            executorService.shutdown();
        }
    }

    public static void executeForNaiveSingleton(int repeatCount, int threadCount) {
        try (ExecutorService executorService = Executors.newFixedThreadPool(threadCount)) {

            for (int i = 0; i < repeatCount; i++) {
                executorService.execute(() ->
                        System.out.println("Output: " + NaiveSingleton.getInstance().getInfo()));
            }

            executorService.shutdown();
        }
    }
}
