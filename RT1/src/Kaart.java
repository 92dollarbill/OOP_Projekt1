public class Kaart {
    private int vaartus;
    private String nimi;

    Kaart(int vaartus, String nimi) {
        this.vaartus = vaartus;
        this.nimi = nimi;
    }

    public int getVaartus() {
        return vaartus;
    }

    public String getNimi() {
        return nimi;
    }

    @Override
    public String toString() {
        return getNimi() + ", " + getVaartus();
    }
}
