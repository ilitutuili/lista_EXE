import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;
import java.util.Stack;

public class Exe7 {
    public static void main(String[] args) {
        Queue<Integer> fila = new LinkedList<>();
        Stack<Integer> pilha = new Stack<>();
        Random rand = new Random();
        for (int i = 0; i < 20; i++) {
            fila.add(rand.nextInt(100));
        }

        System.out.println("Fila original: " + fila);
        while (!fila.isEmpty()) {
            pilha.push(fila.remove());
        }
        while (!pilha.isEmpty()) {
            fila.add(pilha.pop());
        }
        System.out.println("Fila invertida: " + fila);
    }
}
