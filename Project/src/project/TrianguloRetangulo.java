package project;

public class TrianguloRetangulo {

    private double c1;
    private double c2;
    private double h;

    public TrianguloRetangulo(double c1, double c2) {
        this.c1 = c1;
        this.c2 = c2;
    }

    public double calcularHipotenusa() {
        h = Math.sqrt(Math.pow(c1, 2) + Math.pow(c2, 2));
        return h;
    }

    public double calcularArea() {
        return (c1 * c2) / 2;
    }
}