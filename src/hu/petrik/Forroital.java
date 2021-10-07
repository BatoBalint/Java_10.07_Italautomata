package hu.petrik;

import java.util.Random;

public class Forroital {
    Random r;

    String nev;
    int mennyiseg;
    boolean kellPohar;
    int ar;

    public Forroital(String nev, int mennyiseg, boolean kellPohar, int ar) {
        r = new Random();
        this.nev = nev;
        this.mennyiseg = mennyiseg;
        this.kellPohar = kellPohar;
        this.ar = ar;
    }

    public void arEmeles(int mennyivel) {
        ar += mennyivel;
    }

    public void arEmelesRandom() {
        ar += (r.nextInt(31) + 20);
    }

    public void arEmeles20() {
        ar += 20;
    }

    @Override
    public String toString() {
        return String.format("Nev: %s, mennyiseg: %d, poharral jon: %s, ar: %d", this.nev, this.mennyiseg, this.kellPohar, this.ar);
    }
}
