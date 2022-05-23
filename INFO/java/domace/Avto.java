public class Avto {
    private float gorivo;
    private double krmilo;
    private boolean motor;
    private double pot;
    private boolean spLevaVrata;
    private boolean spDesnaVrata;
    private boolean zaLevaVrata;
    private boolean zaDesnaVrata;
    private boolean prtljaznik;

    private final double PORABA = 7.4;
    private final double MAXLIT = 55;

    public Avto(float gorivo, double krmilo, double pot) {
        this.gorivo = gorivo;
        this.krmilo = krmilo;
        this.motor = false;
        this.pot = pot;
        this.spLevaVrata = false;
        this.spDesnaVrata = false;
        this.zaLevaVrata = false;
        this.zaDesnaVrata = false;
        this.prtljaznik = false;
    }

    public void napolniRezervoar(float kolicina) {
        float novaKolicina = this.gorivo + kolicina;
        if (novaKolicina <= this.MAXLIT) {
            this.gorivo = novaKolicina;
            System.out.println("Gorivo je bilo natočeno v rezervoar! trenutna količina: " + this.gorivo + "l.");
        } else {
            System.out.println("Taka količina goriva je prevelika za rezervoar vozila.");
        }
    }

    public void prizgiMotor() {
        if (!this.motor) {
            this.motor = true;
            System.out.println("Motor je sedaj prižgan!");
        } else {
            System.out.println("Motor je že prižgan!");
        }
    }

    public void ugasniMotor() {
        if (this.motor) {
            this.motor = false;
            System.out.println("Motor je sedaj ugasnjen!");
        } else {
            System.out.println("Motor je že ugasnjen!");
        }
    }

    public void obrniKrmilo(double novoKrmilo) {
        this.krmilo += novoKrmilo;
        System.out.println("Krmilo je zdaj obrnjeno na " + this.krmilo + " stopinj.");
    }

    public void stanjeRezervoar() {
        System.out.println("v rezervoarju je " + this.gorivo + " litrov goriva");
    }

    public void prevozi(double prevoziPot) {
        float potrebovanoGorivo = (float) (prevoziPot * (this.PORABA / 10000));
        if (!this.motor) {
            System.out.println("Ni mogoče prevoziti poti, ker je motor ugasnjen!");
            return;
        }
        if (this.gorivo >= potrebovanoGorivo) {
            this.pot += prevoziPot;
            this.gorivo -= potrebovanoGorivo;
            System.out.println("Prevoženih je bilo " + prevoziPot + " metrov.");
        } else {
            System.out.println("Ni dovolj goriva, da bi prevozili toliko poti.");
        }
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
        this.spLevaVrata = false;
        this.spDesnaVrata = false;
        this.zaLevaVrata = false;
        this.zaDesnaVrata = false;
        this.prtljaznik = false;
        System.out.println("Vsa vrata so zdaj zaprta.");
    }

    public boolean aliSoVrataZaprta() {
        return !(this.spLevaVrata || this.spDesnaVrata || this.zaLevaVrata || this.zaDesnaVrata || this.prtljaznik);
    }
}
