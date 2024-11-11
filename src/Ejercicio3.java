import java.util.Scanner;
import java.util.ArrayList;

public class Ejercicio3
{
    private int num;

    public Ejercicio3() {
        System.out.print("Introduce un número: ");
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();

        ArrayList<Integer> factores = factorizarEnPrimos(num);
        System.out.print("Los factores primos de " + num + " son: ");
        for (int i = 0; i < factores.size(); i++) {
            System.out.print(factores.get(i) + " ");
        }
    }

    public ArrayList<Integer> factorizarEnPrimos(int num) {
        ArrayList<Integer> factores = new ArrayList<Integer>();
        int i = 2;
        while (num > 1) {
            if (num % i == 0) {
                factores.add(i);
                num /= i;
            } else {
                i++;
            }
        }
        return factores;
    }
}
