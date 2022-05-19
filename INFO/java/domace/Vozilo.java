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
}
