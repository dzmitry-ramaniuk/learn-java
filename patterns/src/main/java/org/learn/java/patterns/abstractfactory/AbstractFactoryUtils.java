package org.learn.java.patterns.abstractfactory;

public class AbstractFactoryUtils {

    public static void createWinApplication() {
        WinFactory factory = new WinFactory();
        Application application = new Application(factory);
        application.createUI();
        application.paint();
    }

    public static void createMacApplication() {
        MacFactory factory = new MacFactory();
        Application application = new Application(factory);
        application.createUI();
        application.paint();
    }
}
