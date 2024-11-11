import java.util.Scanner;

public class Menu {
    public Menu(){
        int i;
        do{
            System.out.println("1. Ejercicio 1");
            System.out.println("2. Ejercicio 2");
            System.out.println("3. Ejercicio 3");
            System.out.println("4. Ejercicio 4");

            System.out.println("0. Salir");

            System.out.print("Introduce una opción: ");
            Scanner sc = new Scanner(System.in);
            i = sc.nextInt();

            switch(i){
                case 1:
                    new Ejercicio1();
                    pulsaIntroParaContinuar();
                    break;
                case 2:
                    new Ejercicio2();
                    pulsaIntroParaContinuar();
                    break;
                case 3:
                    new Ejercicio3();
                    pulsaIntroParaContinuar();
                    break;
                case 4:
                    new Ejercicio4();
                    pulsaIntroParaContinuar();
                    break;
                case 0:
                    System.out.println("Adiós");
                    break;
                default:
                    System.out.println("Opción no válida");
            }
        }while (i != 0);
    }

    public void pulsaIntroParaContinuar() {
        System.out.println("Pulsa Intro para continuar...");
        try {
            System.in.read();
        } catch (Exception e) {
        }
    }
}
