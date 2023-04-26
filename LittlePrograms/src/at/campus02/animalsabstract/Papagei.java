package at.campus02.animalsabstract;

public class Papagei extends Animal {

    public Papagei(String name, int anzahlBeine, String augenfarbe) {
        super(name, anzahlBeine, augenfarbe);
    }

    @Override
    public void move(int meters) {
        System.out.println("Papagei " + name + " fliegt " + meters + " weit");
    }

    @Override
    public void makeNoise(String withComment) {
        System.out.println("Papagei spricht:" + withComment );
    }
}
