package at.campus02.orchester;

public class Floete extends Instrument {
    public Floete(int l) {
        super(l);
    }

    @Override
    public int play() {

        System.out.println("Flöte quietscht fast immer richtig");
        return getLautstaerke();
    }
    public int playAsInstrument(){
        //return play(); // hier wird die überschrieben methode direkt darüber aufgerufen
        return super.play(); // rufe implementation der basisklasse auf
    }
}
