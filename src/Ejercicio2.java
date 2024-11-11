import java.util.Scanner;

public class Ejercicio2 {
    private String pais;
    private String ccc;

    public Ejercicio2() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce el país: ");
        pais = sc.nextLine();
        System.out.print("Introduce el código de cuenta cliente: ");
        ccc = sc.nextLine();

        CodigoBanco codigoBanco = new CodigoBanco(pais, ccc);

        System.out.println("El IBAN calculado es: " + codigoBanco.calcularIBAN());
    }
}
