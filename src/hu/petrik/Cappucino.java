package hu.petrik;

public class Cappucino extends Kave {
    int tejszinhab;

    public Cappucino(int mennyiseg, boolean kellPohar, int ar,int plusTej, int tejszinhab) {
        super("Cappucino", mennyiseg, kellPohar, ar, plusTej);
        this.tejszinhab = tejszinhab;
    }

    @Override
    public String toString() {
        return String.format("%s, tejszinhab: ", super.toString(), this.tejszinhab);
    }
}
