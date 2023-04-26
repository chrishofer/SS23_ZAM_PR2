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











    }
}
