package Pewarisan;

public class Persegi extends Aritmatika {
    private double sisi;

    public Persegi(double sisi) {
        this.sisi = sisi;
    }

    public double getLuas() {
        return getPerkalian();
    }
}
