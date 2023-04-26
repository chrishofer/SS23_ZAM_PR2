package at.campus02.animalsabstract;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        //Animal a = new Animal(); // keine Instanz erzeugen möglich da abstrakt

        Giraffe georg = new Giraffe("Georg", 4, "braun", 43);
        Papagei pauli = new Papagei("Pauli", 2, "blau");

        georg.praesentiertFlecken();

        // upcasten auch auf abstrakten basisklassentyp
        Animal g1 = georg;

        ArrayList<Animal> zoo = new ArrayList<>();

        zoo.add(g1);
        zoo.add(pauli);

        for (Animal a:zoo) {
            a.move(100);
        }

    }
}
