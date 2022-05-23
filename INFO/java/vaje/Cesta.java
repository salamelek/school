public class Cesta {
    public static void main(String[] args) {
        Vozilo_vaja vozilo1 = new Vozilo_vaja.Builder().build();

        vozilo1.prizgiMotor();
        vozilo1.prevozi(1);
        vozilo1.obrniKrmilo(30);
        vozilo1.obrniKrmilo(0);
        vozilo1.prevozi(12);
        vozilo1.ugasniMotor();
        vozilo1.stanjeRezervoar();
        vozilo1.prevozi(88);
        vozilo1.stanjeRezervoar();
    }
}
