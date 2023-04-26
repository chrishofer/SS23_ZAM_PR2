package at.campus02.hasen;

import java.util.ArrayList;
import java.util.Iterator;

public class Hasenstall {
    private ArrayList<Hase> all;

    public Hasenstall(){

        all = new ArrayList<>();
    }
    public void addHase(Hase h){
        all.add(h);
    }
    public void hoppelAll(){
        for(Hase h : all){
            h.hoppeln();
        }
        //for(int i = 0; i < all.size(); ++i) - auch schön
        // als Iterator
//        Iterator<Hase> hasenIterator = all.iterator();
//        while(hasenIterator.hasNext()){
//            Hase h = hasenIterator.next();
//            h.hoppeln();
//        }
    }
}
