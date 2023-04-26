package at.campus02.orchester;

public class Instrument {
    private int lautstaerke;


    public Instrument(int l){
        lautstaerke = l;
    }
    public int play(){
        System.out.println("Instrument macht Geräusche");

        return lautstaerke;
    }

    public int getLautstaerke() {
        return lautstaerke;
    }

    public void setLautstaerke(int lautstaerke) {
        this.lautstaerke = lautstaerke;
    }

}
