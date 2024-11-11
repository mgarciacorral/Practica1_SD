public class Triangulo
{
    private int lado1;
    private int lado2;
    private int lado3;

    public Triangulo(int a, int b, int c)
    {
        lado1 = a;
        lado2 = b;
        lado3 = c;
    }

    public boolean esTriangulo()
    {
        return lado1 + lado2 > lado3 && lado1 + lado3 > lado2 && lado2 + lado3 > lado1;
    }

    public String tipoTriangulo() {
        if (lado1 == lado2 && lado2 == lado3) {
            return "equilátero";
        } else if (lado1 == lado2 || lado2 == lado3 || lado1 == lado3) {
            return "isósceles";
        } else {
            return "escaleno";
        }
    }

    public double getPerimetro() {
        return lado1 + lado2 + lado3;
    }

    public double getArea() {
        double s = getPerimetro() / 2;
        return Math.sqrt(s * (s - lado1) * (s - lado2) * (s - lado3));
    }
}
