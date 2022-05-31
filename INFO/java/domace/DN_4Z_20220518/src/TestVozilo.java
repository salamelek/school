public class TestVozilo {
    public static void main(String[] args) {
        Vozilo vozilo1 = new Vozilo(0);

        vozilo1.prizgiMotor();
        vozilo1.prevozi(1);
        vozilo1.obrniKrmilo(30);
        vozilo1.obrniKrmilo(0);
        vozilo1.prevozi(12);
        vozilo1.vgasniMotor();
        vozilo1.stanjeRezervoar();
    }
}
