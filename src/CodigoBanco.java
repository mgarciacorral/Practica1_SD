import java.math.BigInteger;

public class CodigoBanco {
    private String pais;
    private String ccc;

    public CodigoBanco(String pais, String ccc) {
        this.pais = pais.toUpperCase();
        this.ccc = ccc;
    }

    private String convertirLetrasANumeros(String codigo) {
        StringBuilder numeros = new StringBuilder();
        for (char ch : codigo.toCharArray()) {
            if (Character.isLetter(ch)) {
                int valor = ch - 'A' + 10; // A = 10, B = 11, ..., Z = 35
                numeros.append(valor);
            } else {
                numeros.append(ch);
            }
        }
        return numeros.toString();
    }

    public String calcularIBAN() {
        String trasladado = ccc + convertirLetrasANumeros(pais) + "00";

        BigInteger numero = new BigInteger(trasladado);
        int modulo = numero.mod(BigInteger.valueOf(97)).intValue();

        int digitoControl = 98 - modulo;
        String digitoControlStr = String.format("%02d", digitoControl);

        return pais + digitoControlStr + ccc;
    }
}
