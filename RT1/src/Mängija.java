import java.util.ArrayList;
import java.util.List;

public class Mängija implements Comparable<Mängija> {
    public String nimi;
    public int summa = 0;
    public boolean bust = false;
    public List<Kaart> handKaardid = new ArrayList<>();

    public Mängija(String nimi, Kaardipakk p) {
        this.nimi = nimi;
        this.handKaardid.add(p.hit());
        this.handKaardid.add(p.hit());
        this.summeruuma();
    }

    public void summeruuma() {
        this.summa = 0; // Selleks et iaga kord see algaks nullist
        for (Kaart k : handKaardid) {
            this.summa = this.summa + k.getVaartus();
        }
        System.out.println("Mangija summa " + summa);
    }

    public void lisaKaart(Kaardipakk p) {
        Kaart k = p.hit();
        this.handKaardid.add(k);
        this.summeruuma();
        this.bustVoiMitte();
    }

    void  bustVoiMitte() {
        if (this.summa > 21) {
            this.bust = true;
            System.out.println("Bust, kaotad!");
        }
    }


    @Override
    public String toString() {
        return "Nimi " + nimi +
                " Hand{" +
                "summa=" + summa +
                ", bust=" + bust +
                ", handKaardid=" + handKaardid +
                '}';
    }

    @Override
    public int compareTo(Mängija h) {
        if (this.bust == true & h.bust == true) {
            return 0;
        }
        if (this.bust == true & h.bust == false) {
            return 1;
        }
        if (this.bust == false & h.bust == true) {
            return -1;
        } else {
            return h.summa - this.summa;
        }

    }
}
