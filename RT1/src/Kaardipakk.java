import java.util.*;

public class Kaardipakk {
    private List<Kaart> pakk = new ArrayList<>();
    private int i;

    Kaardipakk() {
        for (int i = 0; i < 4; i++) {
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
            pakk.add(new Kaart(11, "A"));

            this.i = 0;
        }
    }

    public List<Kaart> getPakk() {
        return pakk;
    }

    public void sega() {
        this.i = 0;
        Collections.shuffle(pakk);
    }

    public Kaart hit() {
        //return pakk.get(i++);
        return pakk.remove(0); // Siin kasutasin remove selleks et pakkis oleva kaartide arvu vaheneks kui teeme hit


    }
}
