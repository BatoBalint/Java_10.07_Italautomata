package hu.petrik;

public class Main {

    public static void main(String[] args) {
        Kave k1 = new Kave("Tejeskave", 200, true, 150, 2);
        Kave k2 = new Kave("Rovidkave", 100, true, 130, 0);
        Tea t1 = new Tea("Barackostea", 200, true, 180, 1);
        Tea t2 = new Tea("Citromos", 150, false, 170, 3);
        Cappucino c1 = new Cappucino(250, false, 250, 2, 3);
        Cappucino c2 = new Cappucino(250, true, 270, 3, 2);
    }
}
