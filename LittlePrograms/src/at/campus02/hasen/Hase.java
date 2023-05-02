package at.campus02.hasen;

public class Hase implements GoesToParty, Comparable<Hase>  {
    protected String name;
    protected int alter;
    protected int nrCarrots;

    public Hase(String n, int a, int c){
        this.name = n;
        this.alter = a;
        this.nrCarrots = c;
    }
    public Hase(String n){
        name = n;
        alter = 0;
        nrCarrots = 0;
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

    @Override
    public int compareTo(Hase o) {
        if(this.alter < o.alter){
            return -1;
        }
        if(this.alter > o.alter){
            return 1;
        }
        // alter muss wohl gleich sein - schauen auf zweites kriterium
        if(this.nrCarrots < o.nrCarrots){
            return -1;
        }
        if(this.nrCarrots > o.nrCarrots){
            return 1;
        }

        // Zum Zahlenvergleich verwenden
        //Integer.compare(2, 4)
        // wenn wir nur nach Alter sortierne würden
        // return Integer.compare(this.alter, o.alter)
        // oder bei STrings
        // String s = "Hansi";
        // return s.compareTo("hansi");

        return 0;
    }

    @Override
    public String toString() {
        return "Hase{" +
                "name='" + name + '\'' +
                ", alter=" + alter +
                '}';
    }
}
