package hu.petrik;

public class Kave extends Forroital {
    int plusTej;

    public Kave(String nev, int mennyiseg, boolean kellPohar, int ar, int plusTej) {
        super(nev, mennyiseg, kellPohar, ar);
        this.plusTej = plusTej;
    }

    @Override
    public String toString() {
        return String.format("%s, plusz tej: %d", super.toString(), this.plusTej);
    }
}
