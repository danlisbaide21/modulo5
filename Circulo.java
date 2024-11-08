
public class Circulo extends Formas {
    private double radio;

    public Circulo(String color, double radio) {
        super(color);
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void calcularRadio () {
       
    }

    @Override
    public void dibujar() {
        System.out.println("Dibujo de un circuolo de color " + getColor() + " con un radio de " + radio + "cm");
    }
}










