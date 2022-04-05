public class Kaart {
    private int vaartus; // arv kahest üheteistkümneni
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
    public String toString() { // pole mõtet väärtust eraldi väljastada, inimesed teavad seda üldiselt isegi
        return getNimi();
    }
}
