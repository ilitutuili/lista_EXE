// ...existing code...
import java.util.*;

public class FilaPilhaNumeros {
    public static void main(String[] args) {
        Queue<Integer> F = new LinkedList<>();
        Stack<Integer> P = new Stack<>();
        Random random = new Random();
        Scanner sc = new Scanner(System.in);

        System.out.print("Modo: (m)anual ou (r)aleatório? ");
        String modo = sc.next();

        final int TOTAL_NUMEROS;
        if (modo.equalsIgnoreCase("m")) {
            System.out.print("Quantos números você quer inserir? ");
            TOTAL_NUMEROS = readInt(sc);
            System.out.println("Insira os números:");
            for (int i = 0; i < TOTAL_NUMEROS; i++) {
                System.out.print("Número " + (i + 1) + ": ");
                int numero = readInt(sc);
                if (!F.contains(numero)) {
                    F.add(numero);
                } else {
                    P.push(numero);
                }
            }
        } else {
            System.out.print("Quantos números gerar aleatoriamente? ");
            TOTAL_NUMEROS = readInt(sc);
            for (int i = 0; i < TOTAL_NUMEROS; i++) {
                int numero = random.nextInt(1000); // 0..999
                if (!F.contains(numero)) {
                    F.add(numero);
                } else {
                    P.push(numero);
                }
            }
        }

        System.out.println("=== RESULTADO FINAL ===");
        System.out.println("\nFila F (números distintos):");
        System.out.println(F);

        System.out.println("\nPilha P (números repetidos):");
        System.out.println(P);

        sc.close();
    }

    private static int readInt(Scanner sc) {
        while (!sc.hasNextInt()) {
            sc.next();
            System.out.print("Entrada inválida. Digite um número: ");
        }
        return sc.nextInt();
    }
}
// ...existing code...