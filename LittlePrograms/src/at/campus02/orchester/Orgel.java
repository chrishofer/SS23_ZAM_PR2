package at.campus02.orchester;

public class Orgel extends Instrument {

    public Orgel(int lautstaerke, double value, String nickName) {
        super(lautstaerke, value, nickName);
    }

    public Orgel(int l) {
        super( l);
    }

    @Override
    public int play() {
        System.out.println("Die Orgel pfeift durch die leeren Hallen");
        return getLautstaerke();
    }
}
