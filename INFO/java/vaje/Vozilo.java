public class Vozilo {
    private int stKoles;
    private String tablica;
    private int masa;
    private boolean jePokvarjen;
    public boolean imaRazbitoSipo;

    public Vozilo() {
        this.stKoles = 4;
        this.tablica = "sldkjfsldfkmn";
        this.masa = 5;
        this.jePokvarjen = false;
        this.imaRazbitoSipo = false;
    }

    public Vozilo(int stKoles, boolean jePokvarjen) {
        this.stKoles = stKoles;
        this.tablica = "sldkjfsldfkmn";
        this.masa = 5;
        this.jePokvarjen = jePokvarjen;
        this.imaRazbitoSipo = false;
    }

    public Vozilo(int stKoles, String tablica, int masa, boolean jePokvarjen, boolean imaRazbitoSipo) {
        this.stKoles = stKoles;
        this.tablica = tablica;
        this.masa = masa;
        this.jePokvarjen = jePokvarjen;
        this.imaRazbitoSipo = imaRazbitoSipo;
    }

    public int pridobiStKoles() {
        return this.stKoles;
    }

    public String pridobiiTablico() {
        return this.tablica;
    }
}
