import java.util.Scanner;

public class Ejercicio1
{
    private int a, b, c;

    public Ejercicio1() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce el lado 1: ");
        a = sc.nextInt();
        System.out.print("Introduce el lado 2: ");
        b = sc.nextInt();
        System.out.print("Introduce el lado 3: ");
        c = sc.nextInt();

        Triangulo t = new Triangulo(a, b, c);
        if (t.esTriangulo()) {
            System.out.println("El triángulo es " + t.tipoTriangulo());
            System.out.println("El perímetro del triángulo es " + t.getPerimetro());
            System.out.println("El área del triángulo es " + t.getArea());
        } else {
            System.out.println("Los lados no forman un triángulo");
        }
    }
}
