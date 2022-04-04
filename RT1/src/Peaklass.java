import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class Peaklass {
    public static void main(String[] args) {
        Kaardipakk p2 = new Kaardipakk();
        p2.sega();
        List<Mängija> mangijad = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Mangijate arv: ");
        int mangijateArv = parseInt(scanner.next());
        for (int i = 0; i < mangijateArv; i++) {
            System.out.print("Mangija " + (i + 1) + " nimi:");
            String nimi = scanner.next();
            mangijad.add(new Mängija(nimi, p2));
            //System.out.println(i);
            //System.out.println(nimi);
        }
        System.out.println(mangijad);
        for (Mängija mängija : mangijad) {
            // Input peab olema hit voi stand (vaikesed tahed)!!
            System.out.println(mängija.nimi + " summa " + mängija.summa);
            while (mängija.summa < 22)
            {
                System.out.println("Sinu otsus");
                String otsus = scanner.next();
                System.out.println(mängija.summa);
                if (otsus.equals("hit")) {
                    mängija.lisaKaart(p2);
                }
                if (otsus.equals("stand")) {
                    break;
                }
                }
            }
        Collections.sort(mangijad);
        System.out.println(mangijad);
        System.out.println("Voitja" + mangijad.get(0));

        }
    }