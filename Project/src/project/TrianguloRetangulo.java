package project;

public class TrianguloRetangulo {
    
    private float h;
    private float c1;
    private float c2;

    public float getc1() {
        return c1;
    }

    public float getc2() {
        return c2;
    }

    public float geth() {
        return h;
    }

    public void setc1(float c) {
        c1 = c;
    }

    public void setc2(float cc) {
        c2 = cc;
    }

    public float CalculaHipotenusa() {
        h = (float) Math.sqrt(Math.pow(c1, 2) + Math.pow(c2, 2));
        return h;
    }

    public float CalculaArea() {
        float area = (c1 * c2) / 2;
        return area;
    }
}