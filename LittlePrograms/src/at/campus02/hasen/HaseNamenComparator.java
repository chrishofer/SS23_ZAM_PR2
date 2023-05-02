package at.campus02.hasen;

import java.util.Comparator;

public class HaseNamenComparator implements Comparator<Hase> {
    @Override
    public int compare(Hase o1, Hase o2) {
        return o1.name.compareTo(o2.name);

//        wenn wir zwei Kriterien hätten
//        int ret = o1.name.compareTo(o2.name);
//        if(ret == 0){
//            // ist gleich - weiter mit alter vergleichen
//        }
//        else{
//            return ret;
//        }
    }
}
