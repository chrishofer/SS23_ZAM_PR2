package at.campus02.hasen;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Osterhase oster = new Osterhase("Bugs");
        Weihnachtshase weihnachshase = new Weihnachtshase("Snowi");

        oster.hoppeln();
        weihnachshase.hoppeln();

        // up- und downcasting

        //upcasting Osterhase zu Hase -> spezialisierter typ zu generellem typ
        Hase hase1 = oster;
        hase1.hoppeln(); // osterhase implementation wird verwendet
        // es werden uns nur die methoden der Hase Klasse angeboten (nicht Osterhase)


        // wenn wirklich ein Osterhase dahinter ist-> downcasten
        Osterhase oster2 = (Osterhase) hase1; //downcasten funktioniert
        oster2.versteckeOstereier();

        // aber nicht immer - ein Weihnachtshase kann nicht zu einem Osterhasen konvertiert werden
        // weil Attribute und Methoden des Osterhasen fehlen könnten
        //oster2 = (Osterhase)weihnachshase;
        Hasenstall hs = new Hasenstall();
        hs.addHase(oster);
        hs.addHase(weihnachshase);

        hs.hoppelAll();

        // eine kleine Party
        System.out.println("Party beginnt");
        ArrayList<GoesToParty> partyPeople = new ArrayList<>();
        partyPeople.add(oster);
        partyPeople.add(weihnachshase);
        partyPeople.add(new Hase("Bernhard"));
        partyPeople.add(new Igel());

        for(GoesToParty p : partyPeople){
            p.party("Karottenwasser", "Karottenkuchen");
        }




    }
}
