package at.campus02.animals;

public class IntTest {
    public static void main(String[] args) {
        int a1 = 12; // primitiver typ

        Integer a2 = new Integer(13); // komplexer referenz typ
        Integer a3 = 14; // es passiert eigentlich automatisch das in der zeile darüber

        System.out.println(a1);
        System.out.println(a2);

        // exkurs exkurs: parseInt
        String test = "55";
        System.out.println(test + 5);
        int testAlsZahl = Integer.parseInt(test);
        System.out.println(testAlsZahl + 5);


    }
}
