package at.campus02.orchesterabstract;


import java.util.ArrayList;

public class Orchester {
    private ArrayList<Instrument> or;

    public Orchester(){
        or = new ArrayList<>();
    }

    public void addInstrument(Instrument i){
        or.add(i);
    }
    public int playAll(){
        int summe = 0;
        for(Instrument i : or){
            summe += i.play(); // i.lautstaerke geht hier auch weil im gleichen package
            // alternative Loesung
            //i.play()
            //summe += i.getLautstaerke()

        }

        return summe;
    }
}
