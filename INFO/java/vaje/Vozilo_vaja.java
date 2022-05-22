public class Vozilo_vaja {
    private float gorivo;
    private double krmilo;
    private boolean motor;
    private double pot;
    private final double PORABA = 7.4;
    private final double MAXLIT = 55;

    public static class Builder {
        private float gorivo;
        private double krmilo;
        private boolean motor;
        private double pot;


        public Builder() {
            this.gorivo = 0;
            this. krmilo = 0;
            this.motor = false;
            this.pot = 0;
        }

        public Builder setGorivo(float gorivo) {
            this.gorivo = gorivo;
            return this;
        }

        public Builder setKrmilo(double krmilo) {
            this.krmilo = krmilo;
            return this;
        }

        public Builder setMotor(boolean motor) {
            this.motor = motor;
            return this;
        }

        public Builder setPot(double pot) {
            this.pot = pot;
            return this;
        }

        public Vozilo_vaja build() {
            return new Vozilo_vaja(this);
        }
    }

    private Vozilo_vaja(Builder builder) {
        gorivo = builder.gorivo;
        krmilo = builder.krmilo;
        motor = builder.motor;
        pot = builder.pot;
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
        if (!this.motor) {
            this.motor = true;
        } else {
            System.out.println("Motor je že prižgan!");
        }
    }

    public void vgasniMotor() {
        if (this.motor) {
            this.motor = false;
        } else {
            System.out.println("Motor je že vgasnjen");
        }
    }

    public void obrniKrmilo(double novoKrmilo) {
        this.krmilo = novoKrmilo;
    }

    public void stanjeRezervoar() {
        System.out.println("v rezervoarju je " + this.gorivo + " litrov goriva");
    }

    public void prevozi(double prevoziPot) {
        float potrebovanoGorivo = (float) (prevoziPot * (this.PORABA / 100));
        if (this.gorivo >= potrebovanoGorivo) {
            this.pot += prevoziPot;
            this.gorivo -= potrebovanoGorivo;
        } else {
            System.out.println("Ni dovolj goriva, da bi prevozili toliko poti.");
        }
    }
}
