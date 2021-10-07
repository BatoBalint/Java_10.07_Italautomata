package hu.petrik;

public class Tea extends Forroital {
    int citrom;

    public Tea(String nev, int mennyiseg, boolean kellPohar, int ar, int citrom) {
        super(nev, mennyiseg, kellPohar, ar);
        this.citrom = citrom;
    }
}
