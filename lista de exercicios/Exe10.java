public class Exe10 {
    public static int potencia(int a, int b) {
        if (b == 0) {
            return 1;
        }
        return a * potencia(a, b - 1);
    }

    public static void main(String[] args) {
        int a = 2, b = 5;
        int resultado = potencia(a, b);
        System.out.println(a + "^" + b + " = " + resultado);
    }
}
