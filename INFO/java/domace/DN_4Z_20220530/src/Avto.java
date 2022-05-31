public class Avto extends Vozilo{
    private boolean spLevaVrata;
    private boolean spDesnaVrata;
    private boolean zaLevaVrata;
    private boolean zaDesnaVrata;
    private boolean prtljaznik;

    protected Avto(float gorivo, double krmilo, boolean motor, double pot, double poraba, double maxLit) {
        super(gorivo, krmilo, motor, pot, poraba, maxLit);
    }

    public void odpriSpLevaVrata() {
        if (!this.spLevaVrata) {
            this.spLevaVrata = true;
            System.out.println("Sprednja leva vrata so sedaj odprta.");
        } else {
            System.out.println("Sprednja leva vrata so že odprta.");
        }
    }

    public void odpriSpDesnaVrata() {
        if (!this.spDesnaVrata) {
            this.spDesnaVrata = true;
            System.out.println("Sprednja desna vrata so sedaj odprta.");
        } else {
            System.out.println("Sprednja desna vrata so že odprta.");
        }
    }

    public void odpriZaLevaVrata() {
        if (!this.zaLevaVrata) {
            this.zaLevaVrata = true;
            System.out.println("Zadnja leva vrata so sedaj odprta.");
        } else {
            System.out.println("Zadnja leva vrata so že odprta.");
        }
    }

    public void odprZaDesnaVrata() {
        if (!this.zaDesnaVrata) {
            this.zaDesnaVrata = true;
            System.out.println("Zadnja desna vrata so sedaj odprta.");
        } else {
            System.out.println("Zadnja desna vrata so že odprta.");
        }
    }

    public void odpriPrtljaznik() {
        if (!this.prtljaznik) {
            this.prtljaznik = true;
            System.out.println("Prtljažnik je sedaj odprt.");
        } else {
            System.out.println("Prtljažnik je že zaprt.");
        }
    }

    public void zapriSpLevaVrata() {
        if (this.spLevaVrata) {
            this.spLevaVrata = false;
            System.out.println("Sprednja leva vrata so sedaj zaprta.");
        } else {
            System.out.println("Sprednja leva vrata so že zaprta.");
        }
    }

    public void zapriSpDesnaVrata() {
        if (this.spDesnaVrata) {
            this.spDesnaVrata = false;
            System.out.println("Sprednja desna vrata so sedaj zaprta.");
        } else {
            System.out.println("Sprednja desna vrata so že zaprta.");
        }
    }

    public void zapriZaLevaVrata() {
        if (this.zaLevaVrata) {
            this.zaLevaVrata = false;
            System.out.println("Zadnja leva vrata so sedaj zaprta.");
        } else {
            System.out.println("Zadnja leva vrata so že zaprta.");
        }
    }

    public void zapriZaDesnaVrata() {
        if (this.zaDesnaVrata) {
            this.zaDesnaVrata = false;
            System.out.println("Zadnja desna vrata so sedaj zaprta.");
        } else {
            System.out.println("Zadnja desna vrata so že zaprta.");
        }
    }

    public void zapriPrtljaznik() {
        if (this.prtljaznik) {
            this.prtljaznik = false;
            System.out.println("Prtljažnik je sedaj zaprt.");
        } else {
            System.out.println("Prtljažnik je že zaprt.");
        }
    }

    public void zapriVsaVrata() {
        zapriSpLevaVrata();
        zapriSpDesnaVrata();
        zapriZaLevaVrata();
        zapriZaDesnaVrata();
        zapriPrtljaznik();
    }

    public boolean aliSoVrataZaprta() {
        return !(this.spLevaVrata || this.spDesnaVrata || this.zaLevaVrata || this.zaDesnaVrata || this.prtljaznik);
    }
}
