package at.campus02.sortieren;

import java.util.*;


public class Main {
    public static void main(String[] args) {
        Frucht f1 = new Frucht("Mango", 350,true);
        Frucht f2 = new Frucht("Banane", 120,false);
        Frucht f3 = new Frucht("Ananas", 700,true);
        Frucht f4 = new Frucht("Oapfel", 200,true);

        Frucht [] fruechteArray = {f1, f2, f3, f4};

        // wirklich noch nicht sortiert
        System.out.println(Arrays.toString(fruechteArray));
        System.out.println("------");
        // jetzt wird sortiert
        Arrays.sort(fruechteArray);
        System.out.println(Arrays.toString(fruechteArray));


        List<Frucht> fruchtListe = new ArrayList<>();

        fruchtListe.add(f1);
        fruchtListe.add(f2);
        fruchtListe.add(f3);
        fruchtListe.add(f4);

        System.out.println("------");
        System.out.println("------");
        System.out.println(fruchtListe);
        // statt Arrays.sort
        Collections.sort(fruchtListe);
        System.out.println(fruchtListe);


    }
}
