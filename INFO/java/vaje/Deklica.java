public class Deklica {
    private String ime;
    private String priimek;
    private int starost;
    private boolean jeVesela;
    public boolean imaSvincnik;
    private final String password = "nicePassword123";

    public Deklica() {
        this.ime = "NeoriginalnoIme";
        this.priimek = "FantastičenPriimek";
        this.starost = 0;
        this.jeVesela = true;
        this.imaSvincnik = false;
    }

    public Deklica(String ime, String priimek, int starost, boolean jeVesela, boolean imaSvincnik) {
        this.ime = ime;
        this.priimek = priimek;
        this.starost = starost;
        this.jeVesela = jeVesela;
        this.imaSvincnik = imaSvincnik;
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime, String password) {
        if (password.equals(this.password)) {
            String staroIme = this.ime;
            this.ime = ime;
            System.out.println("Ime \"" + staroIme + "\" je bilo spremenjeno v \"" + this.ime + "\".");
        } else {
            System.out.println("Password zgrešena, menjava imena ni uspela!");
        }
    }

    public String getPriimek() {
        return priimek;
    }

    public void setPriimek(String priimek) {
        this.priimek = priimek;
    }

    public int getStarost() {
        return starost;
    }

    public void setStarost(int starost) {
        this.starost = starost;
    }

    public boolean isJeVesela() {
        return jeVesela;
    }

    public void setJeVesela(boolean jeVesela) {
        this.jeVesela = jeVesela;
    }
}
