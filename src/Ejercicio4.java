import java.util.Scanner;

public class Ejercicio4 {
    private String num;
    private Numero numero;

    public Ejercicio4() {
        System.out.print("Introduce numero en formato decimal, binario, octal o hexadecimal: ");
        Scanner sc = new Scanner(System.in);
        num = sc.nextLine();

        numero = new Numero(num);

        if (numero.getControl()) {
            System.out.println("Decimal: " + numero.getDecimal());
            System.out.println("Binario: " + numero.getBinario());
            System.out.println("Octal: " + numero.getOctal());
            System.out.println("Hexadecimal: " + numero.getHexadecimal());
        }
    }
}
