package hu.petrik;

import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static ArrayList<Forroital> forroitalok;



    public static void main(String[] args) {
        forroitalok = new ArrayList<>();

        Kave k1 = new Kave("Tejeskave", 200, true, 150, 2);
        Kave k2 = new Kave("Rovidkave", 100, true, 130, 0);
        Tea t1 = new Tea("Barackostea", 200, true, 180, 1);
        Tea t2 = new Tea("Citromos", 150, false, 170, 3);
        Cappucino c1 = new Cappucino(250, false, 250, 2, 3);
        Cappucino c2 = new Cappucino(250, true, 270, 3, 2);

        forroitalok.add(k1);
        forroitalok.add(k2);
        forroitalok.add(t1);
        forroitalok.add(t2);
        forroitalok.add(c1);
        forroitalok.add(c2);

        Kiir();
        RandomAremeles();
        System.out.println("\n");
        Kiir();
    }

    static void RandomAremeles() {
        Random r = new Random();
        for (int i = 0; i < forroitalok.size(); i++) {
            int method = r.nextInt(3);
            switch (method) {
                case 0:
                    forroitalok.get(i).arEmeles();
                    break;
                case 1:
                    forroitalok.get(i).arEmeles20();
                    break;
                case 2:
                    forroitalok.get(i).arEmeles(r.nextInt(11)+10);
                    break;
            }
        }
    }

    static void Kiir() {
        for (Forroital f : forroitalok) {
            System.out.println(f.toString());
        }
    }
}
