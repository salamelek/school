public class Deklica {
    private static String ime = "Zala";

    public void menjajIme(String novoIme) {
        ime = novoIme;
    }

    public static String pridobiIme() {
        return ime;
    }
}
