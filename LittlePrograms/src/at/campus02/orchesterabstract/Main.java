package at.campus02.orchesterabstract;

import at.campus02.orchester.Floete;
import at.campus02.orchester.Gitarre;
import at.campus02.orchester.Orchester;
import at.campus02.orchester.Orgel;

public class Main {
    public static void main(String[] args) {
        at.campus02.orchester.Gitarre g = new Gitarre( 10);
        at.campus02.orchester.Floete f = new Floete( 8);
        Orgel o = new Orgel( 14);

        Orchester or = new Orchester();
        or.addInstrument(g);
        or.addInstrument(f);
        or.addInstrument(o);
        System.out.println(or.playAll());


    }
}
