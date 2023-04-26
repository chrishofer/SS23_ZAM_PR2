package at.campus02.orchesterabstract;

public class Gitarre extends Instrument {
    public Gitarre(int l) {
        super( l);
    }

    @Override
    public int play() {
        System.out.println("Gitarre lässt ihre Saiten klingen");
        return getLautstaerke();
    }

    public void stimmen(){
        // TODO: hier soll Gitarre gestimmt werden
    }
}
