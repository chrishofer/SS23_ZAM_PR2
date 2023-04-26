package at.campus02.animals;

public class Dog {

    /* hat nichts mit Vererbung zu tun - Exkurs static */
    // Statisches Attribut (gibts nur einmal - egal wie viele Hundeobjekte erzeugt werden)
    public static String latinName = "Canis lupus familiaris";

    // statische Methode darf nur auf lokale Var. und statische Attribute zugreifen
    public static void printLatinName(){
        String hansi = "Hansi liebt Hunde";

        System.out.println(hansi);
        System.out.println(latinName);
    }
    /* ENDE: hat nichts mit Vererbung zu tun - Exkurs static */

    // auf private Attribute können abgeleitete Klassen nicht zugreifen
    private String name; // Name des Hundes
    // auf protected schon
    protected int age; // Alter des Hundes

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // default Konstruktor (ohne Parameter)
    public Dog(){
        name = "Neugeboren";
        age = 0;
    }

    public void bark(String wuff){
        System.out.println(name + "bellt: " + wuff);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
