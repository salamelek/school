public class Vozilo {
    protected float gorivo;
    protected double krmilo;
    protected boolean motor;
    protected double pot;
    protected double poraba;
    protected double maxLit;

    protected Vozilo(float gorivo, double krmilo, boolean motor, double pot, double poraba, double maxLit) {
        this.gorivo = gorivo;
        this.krmilo = krmilo;
        this.motor = motor;
        this.pot = pot;
        this.poraba = poraba;
        this.maxLit = maxLit;
    }

    protected void prizgiMotor(){
        if (!this.motor) {
            this.motor = true;
            System.out.println("Motor je sedaj prižgan!");
        } else {
            System.out.println("Motor je že prižgan!");
        }
    }

    protected void ugasniMotor() {
        if (this.motor) {
            this.motor = false;
            System.out.println("Motor je sedaj ugasnjen!");
        } else {
            System.out.println("Motor je že ugasnjen!");
        }
    }

    protected void obrniKrmilo(double novoKrmilo) {
        this.krmilo += novoKrmilo;
        System.out.println("Krmilo je zdaj obrnjeno na " + this.krmilo + " stopinj.");
    }

    protected void napolniRezervoar(float kolicina) {
        float novaKolicina = this.gorivo + kolicina;
        if (novaKolicina <= this.maxLit) {
            this.gorivo = novaKolicina;
            System.out.println("Gorivo je bilo natočeno v rezervoar! trenutna količina: " + this.gorivo + "l.");
        } else {
            System.out.println("Taka količina goriva je prevelika za rezervoar vozila.");
        }
    }

    protected void stanjeRezervoar() {
        System.out.println("v rezervoarju je " + this.gorivo + " litrov goriva");
    }

    protected void prevozi(double prevoziPot) {
        float potrebovanoGorivo = (float) (prevoziPot * (this.poraba / 10000));
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
}
