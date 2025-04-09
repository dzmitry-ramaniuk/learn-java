package org.learn.java.patterns.bridge;

public class BridgeUtils {

    void configure() {
        Tv tv = new Tv();
        Remote remote = new Remote(tv);
        remote.togglePower();

        Radio radio = new Radio();
        AdvancedRemote advancedRemote = new AdvancedRemote(radio);
        advancedRemote.mute();
    }
}
