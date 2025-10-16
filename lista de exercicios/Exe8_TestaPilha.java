import java.util.Random;
import java.util.Stack;

public class Exe8_TestaPilha {
    public static void main(String[] args) {
        Stack<Integer> P = new Stack<>(); 
        Stack<Integer> N = new Stack<>();
        Random rand = new Random();

        for (int i = 0; i < 1000; i++) {
            int num = rand.nextInt(201) - 100; 

            if (num > 0) {
                P.push(num);
            } else if (num < 0) {
                N.push(num);
            } else { 
                if (!P.isEmpty() && !N.isEmpty()) {
                    System.out.println("Zero sorteado, retirados:");
                    System.out.println("Positivo: " + P.pop());
                    System.out.println("Negativo: " + N.pop());
                } else {
                    System.out.println("pilha vazia");
                }
            }
        }
    }
}

