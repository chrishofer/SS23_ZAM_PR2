package at.campus02.orchesterabstract;

public abstract class Instrument {
    private int lautstaerke;


    public Instrument(int l){
        lautstaerke = l;
    }
    public abstract int play();

    public int getLautstaerke() {
        return lautstaerke;
    }

    public void setLautstaerke(int lautstaerke) {
        this.lautstaerke = lautstaerke;
    }

}
