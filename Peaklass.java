import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class Peaklass {
    public static void main(String[] args) {

        Kaardipakk p2 = new Kaardipakk();
        p2.sega();


        int hand = 1;
        while (true) {

            if (hand % 5 == 0) { // iga viies hand segatakse kaardipakk läbi
                p2 = new Kaardipakk();
                p2.sega();
                System.out.println("Segasin paki läbi, kaardilugejad on tagasi alguses hehe");
            }

            List<Mängija> mangijad = new ArrayList<>();
            Scanner scanner = new Scanner(System.in);
            System.out.print("Mängijate arv: ");
            int mangijateArv = parseInt(scanner.next());

            for (int i = 0; i < mangijateArv; i++) {
                System.out.print("Mängija " + (i + 1) + " nimi: ");
                String nimi = scanner.next();
                mangijad.add(new Mängija(nimi, p2));
                //System.out.println(i);
                //System.out.println(nimi);
            }

            for (Mängija mangija : mangijad) {
                System.out.println(mangija);
            }

            for (Mängija mängija : mangijad) { // tsükkel, kus mängijad saavad kaarte juurde küsida
                // Input peab olema hit voi stand (vaikesed tahed)!!
                System.out.println(mängija.nimi + " summa " + mängija.summa);
                while (mängija.summa < 22) {
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
            System.out.println("Võitis " + mangijad.get(0).nimi); // viigi korral väljastab mängija, kes järjekorras eespool oli

            hand++;

            System.out.println("Uue handi mängimiseks sisestage 'uus', mängu lõpetamiseks sisestage 'finish'");

            for (Mängija mangija : mangijad) {
                mangijad.remove(0);
            }

            if (scanner.next().equals("finish")) {
                scanner.close();
                break;
            }

        }

    }
}