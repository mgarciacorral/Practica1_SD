public class Numero {
    private int decimal;
    private String binario;
    private String octal;
    private String hexadecimal;
    private boolean control;

    public Numero(String num) {
        control = comprobarFormato(num);
    }

    public boolean comprobarFormato(String num) {
        boolean control = true;
        if (num.matches("[0-9]+")) {
            decimal = Integer.parseInt(num);
            binario = Integer.toBinaryString(decimal);
            octal = Integer.toOctalString(decimal);
            hexadecimal = Integer.toHexString(decimal);
        } else if (num.matches("[01]+")) {
            binario = num;
            decimal = Integer.parseInt(num, 2);
            octal = Integer.toOctalString(decimal);
            hexadecimal = Integer.toHexString(decimal);
        } else if (num.matches("[0-7]+")) {
            octal = num;
            decimal = Integer.parseInt(num, 8);
            binario = Integer.toBinaryString(decimal);
            hexadecimal = Integer.toHexString(decimal);
        } else if (num.matches("[0-9A-F]+")) {
            hexadecimal = num;
            decimal = Integer.parseInt(num, 16);
            binario = Integer.toBinaryString(decimal);
            octal = Integer.toOctalString(decimal);
        } else {
            System.out.println("Formato incorrecto");
            return false;
        }
        return control;
    }

    public int getDecimal() {
        return decimal;
    }

    public String getBinario() {
        return binario;
    }

    public String getOctal() {
        return octal;
    }

    public String getHexadecimal() {
        return hexadecimal;
    }

    public boolean getControl() {
        return control;
    }
}
