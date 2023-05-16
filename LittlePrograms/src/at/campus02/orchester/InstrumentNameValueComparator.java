package at.campus02.orchester;

import java.util.Comparator;

public class InstrumentNameValueComparator implements Comparator<Instrument> {
    // Sortierkriterien: Nickname, danach Wert
    @Override
    public int compare(Instrument o1, Instrument o2) {
        int erg = o1.getNickName().compareTo(o2.getNickName());
        if(erg != 0){
            // Namen sind unterschiedlich
            return erg;
        }
        // Nicknamen sind wohl gleich
        // könnten mit if selber vergleiche (so wie im comparable) ODER
        return Double.compare(o1.getValue(), o2.getValue());
    }
}
