package at.campus02.orchester;

public class Gitarre extends Instrument{
    public Gitarre(int l) {
        super( l);
    }

    public Gitarre(int lautstaerke, double value, String nickName) {
        super(lautstaerke, value, nickName);
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
