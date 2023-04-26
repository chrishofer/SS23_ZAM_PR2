package at.campus02.orchesterabstract;


public class Orgel extends Instrument {
    public Orgel(int l) {
        super( l);
    }

    @Override
    public int play() {
        System.out.println("Die Orgel pfeift durch die leeren Hallen");
        return getLautstaerke();
    }
}
