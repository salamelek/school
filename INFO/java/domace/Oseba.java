public class Oseba {
    protected String ime;
    protected String priimek;
    protected int starost;
    protected float visina;
    protected int ureSpanja;
    protected String budilka;
    protected String zacetekSpanja;

    public Oseba(String ime, String priimek, int starost, float visina) {
        this.ime = ime;
        this.priimek = priimek;
        this.starost = starost;
        this.visina = visina;
    }

    protected void jesti(float grami) {
        System.out.println("Sedaj jem " + grami + " gramov hrane.");
        System.out.println("Njam njam");
    }

    protected void piti(float litri) {
        System.out.println("Sedaj pijem " + litri + " litrov pijače.");
        System.out.println("Glu glu");
    }

    protected void govoriti(String besede) {
        System.out.println(besede);
    }

    protected void spati(int ure, String zacetek) {
        this.ureSpanja += ure;
        this.zacetekSpanja = zacetek;
        System.out.println("ZZZZZ");
    }

    protected void vstati(String ura) {
        this.budilka = ura;
        System.out.println("Dobro jutro!");
    }
}
