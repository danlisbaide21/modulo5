
public class Cuadrado extends Formas {
    private double area;

    public Cuadrado(String color, double area) {
        super(color);
        this.area = area;
    }

    public double getArea() {
        return area;
    }

    public void calcularArea() {
    }

    @Override
    public void dibujar() {
        System.out.println("Dibujo de un Cuadrado de color " + getColor() + " con un area de " + area);
    }
}
