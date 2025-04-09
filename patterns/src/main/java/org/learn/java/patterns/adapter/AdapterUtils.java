package org.learn.java.patterns.adapter;

public class AdapterUtils {

    void configure() {
        RoundHole hole = new RoundHole(5);
        RoundPeg rpeg = new RoundPeg(5);

        System.out.println(hole.fits(rpeg));

//        SquarePeg smallSqPeg = new SquarePeg(5);
//        SquarePeg largeSqPeg = new SquarePeg(10);
//        hole.fits(smallSqPeg);

        SquarePegAdapter smallSqPegAdapter = new SquarePegAdapter(new SquarePeg(5));
        SquarePegAdapter largeSqPegAdapter = new SquarePegAdapter(new SquarePeg(10));
        hole.fits(smallSqPegAdapter);
        hole.fits(largeSqPegAdapter);
    }
}
