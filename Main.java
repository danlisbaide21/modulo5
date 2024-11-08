
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Elejir una ocpion \n 1: Circulo\n 2: Linea\n 3: Triangulo\n 4: Cuadrado: ");
        String tipo = scanner.nextLine();

        System.out.println("Ingrese el color de la linea: ");
        String color = scanner.nextLine();
        Formas forma = null;

        switch (tipo.toLowerCase()) {
            case "1":
                System.out.println("Ingresar Radio del Circulo: ");
                double radio = scanner.nextDouble();
                forma = new Circulo(color, radio);
                break;
            case "2":
                System.out.println("Ingresar largo de la Linea: ");
                double largo = scanner.nextDouble();
                forma = new Linea(color, largo);
                break;
            case "3":
                System.out.println("Ingresar angulo del Triangulo : ");
                double angulo = scanner.nextDouble();
                forma = new Triangulo(color, angulo);
                break;
            case "4":
                System.out.println("Ingresar area del Cuadrado: ");
                double area = scanner.nextDouble();
                forma = new Cuadrado(color, area);
                break;
            default:
                System.out.println("NO SE ENCONTRARON DETALLES");
                break;
        }

        if (forma != null) {
            forma.dibujar();
        }

        scanner.close();
    }
}
