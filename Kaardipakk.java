import java.util.*;

public class Kaardipakk {
    private List<Kaart> pakk = new ArrayList<>();

    Kaardipakk() {
        for (int i = 0; i < 4; i++) { // lisan igast mastist (kokku 4) iga kaardi pakki
            pakk.add(new Kaart(2, "2"));
            pakk.add(new Kaart(3, "3"));
            pakk.add(new Kaart(4, "4"));
            pakk.add(new Kaart(5, "5"));
            pakk.add(new Kaart(6, "6"));
            pakk.add(new Kaart(7, "7"));
            pakk.add(new Kaart(8, "8"));
            pakk.add(new Kaart(9, "9"));
            pakk.add(new Kaart(10, "10"));
            pakk.add(new Kaart(10, "J"));
            pakk.add(new Kaart(10, "Q"));
            pakk.add(new Kaart(10, "K"));
            pakk.add(new Kaart(11, "A")); // lihtsustus: A väärtus saab selles mängus olla vaid 11
        }
    }

    public List<Kaart> getPakk() {
        return pakk;
    }

    public void sega() {
        Collections.shuffle(pakk);
    }

    public Kaart hit() {
        // kuna meie diiler on miinimumpalgal ja võib pakki lohakalt segada, valime igaks juhuks kaardi suvaliselt indeksilt
        int indeks = (int)(Math.random() * (52));
        return pakk.remove(indeks);

    }
}
