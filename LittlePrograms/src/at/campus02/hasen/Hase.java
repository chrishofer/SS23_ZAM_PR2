package at.campus02.hasen;

public class Hase implements GoesToParty  {
    protected String name;

    public Hase(String n){
        name = n;
    }
    public void schlafen(){
        System.out.println(name + " schläft gemütlich");
    }
    public void hoppeln(){
        System.out.println(name + " hoppelt durch den Wald");
    }
    public void fressen(){
        System.out.println(name + " isst genüsslich eine Karotte");
    }

    @Override
    public void party(String drink, String cake) {
        System.out.println(name + " geht zur Party und isst " + cake + " und trinkt " + drink);
    }
}
