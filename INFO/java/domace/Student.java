public class Student extends Oseba{
    private int ureStudija;

    public Student(String ime, String priimek, int starost, float visina) {
        super(ime, priimek, starost, visina);
    }

    public void studirati(int ure) {
        this.ureStudija = ure;
        System.out.println("Sedaj študiram");
    }
}
