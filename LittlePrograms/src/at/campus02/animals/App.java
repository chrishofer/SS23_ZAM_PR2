package at.campus02.animals;

public class App {
    public static void main(String[] args) {

        // Statische Attribute können ohne Objekt(Instanz) verwendet werden
        System.out.println(Dog.latinName);
        // rufe statische Methode auf (hier auch ohne Objekt möglich)
        Dog.printLatinName();

        Beagle snoopy = new Beagle("Snoopy", 30, "Lasagne");
        snoopy.eatsLovedFood();
        snoopy.bark("auuuu");

        Dog d = new Dog("Baxter", 7);
        d.bark("wuff wuff");

        // upcasting und downcasting

        Beagle freddie = new Beagle("Freddie", 5, "Gulasch");
        // upcasting
        Dog doggo = freddie;

        // ueber doggo referenz sehe ich nur Dog Methoden/Attribute
        // obwohl jetzt zufaelligerweise sogar ein Beagle (der mehr kann)
        // drauf ist

        // bellt wie ein beagle da eine Beagle Instanz auf der Dog Referenz ist
        doggo.bark("wuff");

        // downcasting (Achtung Gefaehrlich - Danger Zone ;) )
        Dog doggo2 = new Beagle("Hubert", 4, "Spaghetti");

        // wir möchten sein lieblingsessen wissen -> downcasten
        Beagle b1 = (Beagle)doggo2;
        b1.eatsLovedFood();


        System.out.println("-----------");


        // upcasten: Objekt einer Kindklasse wird auf Referenz der Basisklasse gespeichert
        Dog d1 = new Beagle("Timmy", 10, "Spaghetti");

        d1.bark("wuff wuff"); // es wird die überschriebene methode in Beagle aufgerufen

        KommissarRex kr = new KommissarRex(5);
        kr.bark("wuff"); // kr Instanz ruft Implementation in Basisklasse auf

        // referenzen vs. objekte
        // siehe: https://pythontutor.com/visualize.html#code=public%20class%20YourClassNameHere%20%7B%0A%20%20%20%20public%20static%20void%20main%28String%5B%5D%20args%29%20%7B%0A%20%20%20%20%20%20%0A%20%20%20%20%20%20Integer%20i1%20%3D%2012%3B%20//%20steht%20eigentlich%20fuer%20new%20Int%2812%29%0A%20%20%20%20%20%20Integer%20i2%20%3D%2024%3B%0A%20%20%20%20%20%20Integer%20i3%20%3D%2036%3B%20%0A%20%20%20%20%20%20%0A%20%20%20%20%20%20%0A%20%20%20%20%20%20Integer%20i4%20%3D%20i1%3B%0A%20%20%20%20%20%20Integer%20i5%20%3D%20i1%3B%0A%20%20%20%20%20%20Integer%20i6%20%3D%20i2%3B%0A%20%20%20%20%20%20//%20Frage%20ist%3A%20Wie%20viele%20Referenzen%20gibt%20es%3F%20Wie%20viele%20wirkliche%20Objekte%20dahinter%3F%0A%20%20%20%20%0A%20%20%20%20%20%20//%20Richtig%20ist%3A%206%20Referzvariable%20und%203%20Objekte%0A%20%20%20%20%20%20%0A%20%20%20%20%20%20%0A%20%20%20%20%20%20%0A%20%20%20%20%20%20%0A%20%20%20%20%20%20System.out.println%28%22fertig%22%29%3B%0A%0A%20%20%20%20%7D%0A%7D&cumulative=false&curInstr=7&heapPrimitives=true&mode=display&origin=opt-frontend.js&py=java&rawInputLstJSON=%5B%5D&textReferences=false

        //upcasten
        Dog d2 = kr;
        // bellt wie ein Dog
        // bellt gleich unabhängig davon ob ich über d2 oder kr aufrufe
        // (dahinter ist ja das gleiche Objekt)
        d2.bark("wuff wuff");

        // downcasten: Referenz einer Basisklasse auf Kindklasse casten
        Beagle beagle1 = (Beagle)d1;
        beagle1.eatsLovedFood();

        // Funktioniert nicht da eine Kommissar Rex Instanz nicht
        // zu Beagle gecastet werden kann
        //Beagle beagle2 = (Beagle)d2;
        //beagle2.eatsLovedFood();

        // instanceof Operator: Überprüfen ob Instanz der Klasse entspricht (oder eine Subklasse der Klasse ist)
        // (analog bei interfaces möglich)

        if(d1 instanceof Dog){
            System.out.println("yaayy ist ein Hund");
        }

        if(d1 instanceof Beagle){
            System.out.println("yaayy ist ein Beagle");
            // hier können wir uns sicher sein, dass auf d1 eine Beagle Instanz ist
            Beagle b2 = (Beagle) d1; // hier kann es nicht mehr krachen
        }

        // nicht so schön - überprüfen ob Instanz genau einer konkreten
        // Klasse entspricht (nicht durch abgeleitete Instanz ersetzbar)
        if(d1.getClass().equals(Beagle.class)){
            System.out.println("Yaay auf d1 ist wirklich ein Beagle und kein anderer Hund");
        }
        if(d1.getClass().equals(Dog.class)){
            System.out.println("Hier sollten wir nicht reinkommen - sonst passt was nicht!");
        }else{
            System.out.println("Beagle ist kein Hund - sondern ein Beagle");
        }



    }
}
