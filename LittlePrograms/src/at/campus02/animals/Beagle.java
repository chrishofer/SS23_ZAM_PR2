package at.campus02.animals;

public class Beagle extends Dog {
    public String lovedFood;

    // wenn wir einen Default Konstruktor Dog() in Basisklasse haben
    // dann wird dieser automatisch zu Beginn dieses Konstruktors aufgerufen
    // falls es diesen nicht gibt oder wir einen anderen verwenden
    // möchten rufen wir mit super(...) explizit den Konstruktor
    // der Basisklasse auf (den wir möchten)
    // Benennung: name2 und age2 absichtlich anders zur Illustration
    public Beagle(String name2, int age2, String lovedFood) {
        super(name2, age2);

        this.lovedFood = lovedFood;
    }

    // neue methoden
    public void eatsLovedFood(){
        System.out.println(getName() + "(" + age + ") isst " + lovedFood);
    }

    // methoden überschreiben (method overriding)
    @Override
    public void bark(String wuff){
        System.out.println(getName() + " bellt und jammert:" + wuff);
    }
}
