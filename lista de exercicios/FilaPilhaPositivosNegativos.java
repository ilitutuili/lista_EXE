// ...existing code...
import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;
import java.util.Scanner;
import java.util.Stack;

public class FilaPilhaPositivosNegativos {
    public static void main(String[] args) {
        Queue<Integer> fila = new LinkedList<>();
        Stack<Integer> pilha = new Stack<>();
        Random random = new Random();
        Scanner sc = new Scanner(System.in);

        System.out.print("Modo: (m)anual ou (r)aleatório? ");
        String modo = sc.next();

        if (modo.equalsIgnoreCase("m")) {
            System.out.print("Quantos números você quer inserir? ");
            int total = readInt(sc);
            System.out.println("Insira os números (pos. ou neg.):");
            for (int i = 0; i < total; i++) {
                System.out.print("Número " + (i + 1) + ": ");
                int num = readInt(sc);
                fila.add(num);
            }
        } else {
            System.out.print("Quantos pares (positivo + negativo) gerar? ");
            int pares = readInt(sc);
            for (int i = 0; i < pares; i++) {
                fila.add(random.nextInt(1000) + 1);    // positivo (1..1000)
                fila.add(-(random.nextInt(1000) + 1)); // negativo (-1..-1000)
            }
        }

        System.out.println("Tamanho inicial da fila: " + fila.size());
        System.out.println("\n--- Iniciando processamento ---\n");

        // Processamento da fila
        while (!fila.isEmpty()) {
            int numero = fila.peek(); // olha o primeiro número da fila

            if (numero > 0) {
                // Se for positivo → empilha
                pilha.push(fila.poll());
            } else {
                // Se for negativo → remove e desempilha (se possível)
                fila.poll(); // remove o negativo da fila
                if (!pilha.isEmpty()) {
                    int topo = pilha.pop();
                    System.out.println("Desempilhado (por causa de " + numero + "): " + topo);
                } else {
                    System.out.println("Pilha vazia — nada a desempilhar (número " + numero + ")");
                }
            }
        }

        System.out.println("\n--- Fim do processamento ---");
        System.out.println("Pilha final: " + pilha);
        System.out.println("Fila final vazia? " + fila.isEmpty());

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
