package at.campus02.animals;

// nur ein beispiel um zu zeigen wie Konstruktoren unterschiedlich sind
// ACHTUNG: immer überlegen ob es wirklich sinn macht für so ein spezielle
// Situation wirklich eine abgeleitete Klasse zu erstellen oder vielleicht
// doch nur eine Instanz von einem zb. Schäfer Hund
public class KommissarRex extends Dog {
    public KommissarRex(int age) {
        super("Rex", age);
    }
}
