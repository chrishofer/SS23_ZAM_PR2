package at.campus02.orchester;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Gitarre g = new Gitarre( 10);
        Floete f = new Floete( 8);
        Orgel o = new Orgel( 14);

        Orchester or = new Orchester();
        or.addInstrument(g);
        or.addInstrument(f);
        or.addInstrument(o);
        System.out.println(or.playAll());

        f.playAsInstrument();

        // Sortieren
        // für arrays: Arrays.sort
        // für collection
        List<Instrument> instrumente = new ArrayList<>();
        instrumente.add(g);
        instrumente.add(f);
        instrumente.add(o);

        System.out.println(instrumente);
        System.out.println("---");
        Collections.sort(instrumente);
        System.out.println(instrumente);


        // sortieren mit comparator
        List<Instrument> instrumente2 = new ArrayList<>();
        instrumente2.add(new Floete(10,  100, "Hansi"));
        instrumente2.add(new Floete(10,  80, "Hansi"));
        instrumente2.add(new Gitarre(10,  1000, "A Moll"));
        instrumente2.add(new Orgel(10,  10, "Orgi"));

        System.out.println(instrumente2);
        System.out.println("---");
        // ACHTUNG ANDERS: COMPARATOR ANGEBEN
        Collections.sort(instrumente2, new InstrumentNameValueComparator());
        System.out.println(instrumente2);

    }
}
