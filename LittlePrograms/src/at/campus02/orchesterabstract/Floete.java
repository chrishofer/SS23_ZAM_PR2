package at.campus02.orchesterabstract;

public class Floete extends Instrument {
    public Floete(int l) {
        super(l);
    }

    @Override
    public int play() {

        System.out.println("Flöte quietscht fast immer richtig");
        return getLautstaerke();
    }

}
