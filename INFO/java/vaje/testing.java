public class testing {
    public static void main(String[] args) {
        Deklica Zala = new Deklica("Zala", "Flospergher", 17, true);
        System.out.println(Zala.getIme());

        EnostavnaDeklica Zala2 = new EnostavnaDeklica();
        System.out.println(Zala2.getIme());

        // haha zali smo ukradli svincnik
        Zala.imaSvincnik = false;

        System.out.println(Zala.imaSvincnik);

        Deklica BasicDeklica = new Deklica();
        System.out.println(BasicDeklica.getPriimek());

        Zala.setIme("NovoIme", "nicePassword123");
        System.out.println(Zala.getIme());
    }
}
