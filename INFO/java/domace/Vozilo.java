public class Vozilo {
    private float gorivo;
    private double krmilo;
    private boolean motor;
    private double pot;
    private final double PORABA = 7.4;
    private final double MAXLIT = 55;

    public Vozilo() {
        this.gorivo = 0;
        this. krmilo = 0;
        this.motor = false;
        this.pot = 0;
    }

    public Vozilo(float gorivo, double krmilo, boolean motor, double pot) {
        this.gorivo = gorivo;
        this. krmilo = krmilo;
        this.motor = motor;
        this.pot = pot;
    }

}
