public class Lingkaran {
    private double jarijari;

    public Lingkaran(double jarijari) {
        this.jarijari = jarijari;
    }

    public double getDiameter() {
        Aritmatika a = new Aritmatika(jarijari, 2);
        return a.getPerkalian();
    }

    public double getLuas() {
        Aritmatika b = new Aritmatika(jarijari, jarijari);
        b.setBil2(b.getPerkalian());
        b.setBil1(Math.PI);
        return b.getPerkalian();
    }

    public double getKeliling() {
        Aritmatika c = new Aritmatika(Math.PI, getDiameter());
        return c.getPerkalian();
    }

    public double getJarijari() {
        return jarijari;
    }

    public void setJarijari(double jarijari) {
        this.jarijari = jarijari;
    }
}
