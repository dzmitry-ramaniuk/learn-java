package org.learn.java.patterns.factorymethod;

public class FactoryMethodUtils {

    private FactoryMethodUtils() {
    }

    public static void createWindowDialog(String type) {
        Dialog dialog;

        if (type.equals("windows")) {
            dialog = new WindowsDialog();
        } else if (type.equals("html")) {
            dialog = new HTMLDialog();
        } else {
            throw new IllegalArgumentException("Unknown dialog type");
        }

        dialog.render();
    }
}
