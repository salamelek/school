public class Vozilo {
    private float gorivo;
    private double krmilo;
    private boolean motor;
    private double pot;
    private final double PORABA = 7.4;
    private final double MAXLIT = 55;

    public Vozilo(double krmilo) {
        this.gorivo = 0;
        this.krmilo = krmilo;
        this.motor = false;
        this.pot = 0;
    }

    public void napolniRezervoar(float kolicina) {
        float novaKolicina = this.gorivo + kolicina;
        if (novaKolicina <= this.MAXLIT) {
            this.gorivo = novaKolicina;
        } else {
            System.out.println("Taka količina goriva je prevelika za rezervoar vozila.");
        }
    }

    public void prizgiMotor() {
        this.motor = true;
    }

    public void vgasniMotor() {
        this.motor = false;
    }

    public void obrniKrmilo(double novoKrmilo) {
        this.krmilo = novoKrmilo;
    }

    public void stanjeRezervoar() {
        System.out.println("v rezervoarju je " + this.gorivo + " litrov goriva");
    }

    public void prevozi(double prevoziPot) {
        this.pot += prevoziPot;
    }
}
