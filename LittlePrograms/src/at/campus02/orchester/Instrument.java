package at.campus02.orchester;

public class Instrument implements Comparable<Instrument> {
    private int lautstaerke;
    private double value; // Wert des Instruments
    private String nickName;

    public double getValue() {
        return value;
    }

    public String getNickName() {
        return nickName;
    }

    public Instrument(int lautstaerke, double value, String nickName) {
        this.lautstaerke = lautstaerke;
        this.value = value;
        this.nickName = nickName;
    }

    public Instrument(int l){
        lautstaerke = l;
        nickName = "Instrument";
        value = 0;
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

    // moechten nach lautstaerke aufsteigend sortieren
    @Override
    public int compareTo(Instrument o) {
        if(lautstaerke < o.lautstaerke){
            return -1;
        }
        if(lautstaerke > o.lautstaerke){
            return 1;
        }
        return 0;
    }
}
