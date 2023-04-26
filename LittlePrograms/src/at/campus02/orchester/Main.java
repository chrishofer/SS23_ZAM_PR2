package at.campus02.orchester;

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
    }
}
