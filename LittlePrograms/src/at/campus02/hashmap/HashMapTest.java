package at.campus02.hashmap;

import at.campus02.hasen.Hase;

import java.util.HashMap;
import java.util.Map;

public class HashMapTest {
    public static void main(String[] args) {

        // wir moechten alle hasen mit einer steuernummer speichern um
        // sie schnell zu finden um korrekt versteuern zu koennen
        HashMap<String, Hase> steuerHasen = new HashMap<>();

        Hase h1 = new Hase("Hansi");
        Hase h2 = new Hase("Susi");

        // etwas in hashmap geben
        steuerHasen.put("123H", h1);
        steuerHasen.put("234H", h2);

        // Wert auslesen durch Angabe des Schlüssels
        System.out.println(steuerHasen.get("123H"));
        // wenn schlüssel nicht vorhanden ist kommt null retour
        System.out.println(steuerHasen.get("bloedsinn"));

        // Fragen ob ein Schlüssel in Hashmap ist
        System.out.println(steuerHasen.containsKey("123H"));

        // ACHTUNG: nur notfalls machen (ist langsam)
        System.out.println(steuerHasen.containsValue(h1));

        // was passiert jetzt? Hase h2 statt Hase h1 über "123H" abrufbar
        // steuerHasen.put("123H", h2);

        // über Hashmap iterieren
        for(Map.Entry<String, Hase> hase : steuerHasen.entrySet()){
            System.out.println(hase.getKey());
            Hase h = hase.getValue();
            h.hoppeln();
        }

        // andere Variante - iterieren über alle Schlüsselelemente
        for(String key : steuerHasen.keySet()){
            System.out.println(key);
            Hase h = steuerHasen.get(key);
            h.hoppeln();
        }


        // die ist super :)
        //steuerHasen.getOrDefault()




        // wenn wir eine Int INt HashMap wollen
        HashMap<Integer, Integer> intHashMap = new HashMap<Integer, Integer>();
    }
}
