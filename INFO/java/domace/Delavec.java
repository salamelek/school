public class Delavec extends Oseba{
    private int ureDela;

    public Delavec(String ime, String priimek, int starost, float visina) {
        super(ime, priimek, starost, visina);
    }

    public void delati(int ure) {
        this.ureDela = ure;
        System.out.println("Sedaj delam");
    }
}
