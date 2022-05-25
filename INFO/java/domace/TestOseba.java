public class TestOseba {
    public static void main(String[] args) {
        Oseba ben = new Oseba("Ben", "Dover", 49, 174.2f);
        Delavec paolo = new Delavec("Paolo", "Rossi", 63, 162.8f);
        Student jaz = new Student("Samuel", "Sluga", 18, 187.5f);

        ben.vstati("07:05:00");
        ben.jesti(40);
        ben.piti(0.43f);
        ben.govoriti("Dober dan!");
        ben.spati(7, "21:43:38");

        paolo.vstati("05:45:00");
        paolo.jesti(60);
        paolo.piti(0.54f);
        paolo.govoriti("Pozdravljeni vsi!");
        paolo.delati(9);
        paolo.jesti(64);
        paolo.piti(0.86f);
        paolo.spati(8, "21:03:43");

        jaz.vstati("07:30");
        jaz.jesti(68);
        jaz.piti(0.44f);
        jaz.govoriti("Dober dan, grem studirat!");
        jaz.studirati(10);
        jaz.jesti(57);
        jaz.piti(0.57f);
        jaz.spati(9, "22:32:38");
    }
}
