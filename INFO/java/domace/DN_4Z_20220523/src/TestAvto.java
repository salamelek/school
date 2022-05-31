public class TestAvto {
    public static void main(String[] args) {
        Avto vozilo1 = new Avto(10, 0, 0);

        if (!vozilo1.aliSoVrataZaprta()) {
            System.out.println("Niso zaprta vsa vrata avta!");
            vozilo1.zapriVsaVrata();
        }

        vozilo1.prizgiMotor();
        vozilo1.prevozi(1000);
        vozilo1.obrniKrmilo(30);
        vozilo1.obrniKrmilo(-30);
        vozilo1.prevozi(12000);
        vozilo1.ugasniMotor();
        vozilo1.stanjeRezervoar();
        vozilo1.odpriSpLevaVrata();
        vozilo1.zapriSpLevaVrata();
    }
}
