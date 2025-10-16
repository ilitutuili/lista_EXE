import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;
import java.util.Stack;

public class Exe4 {
    public static void main(String[] args) {
        Queue<Integer> F1 = new LinkedList<>();
        Queue<Integer> F2 = new LinkedList<>();
        Random rand = new Random();
        for (int i = 0; i < 100; i++) {
            F1.add(rand.nextInt(1000000));
        }

        System.out.println("Fila original (F1): " + F1 + "\n");
        F2 = inverterFila(F1);
        System.out.println("Fila invertida (F2): " + F2);
    }

    public static Queue<Integer> inverterFila(Queue<Integer> F1) {
        Stack<Integer> pilha = new Stack<>();
        Queue<Integer> F2 = new LinkedList<>();

        while (!F1.isEmpty()) {
            pilha.push(F1.remove());
        }

        while (!pilha.isEmpty()) {
            F2.add(pilha.pop());
        }
        return F2;
    }
}

