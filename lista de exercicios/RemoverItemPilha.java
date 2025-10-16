import java.util.Scanner;
import java.util.Stack;

public class RemoverItemPilha {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> pilhaOriginal = new Stack<>();
        Stack<Integer> pilhaAux = new Stack<>();

        // Entrada de dados
        System.out.println("Digite elementos inteiros para empilhar (digite -1 para parar):");
        int num;
        while (true) {
            num = sc.nextInt();
            if (num == -1) break;
            pilhaOriginal.push(num);
        }

        System.out.print("Digite o valor (chave) a ser removido: ");
        int chave = sc.nextInt();

        // Remove o item com chave C
        boolean encontrado = false;
        while (!pilhaOriginal.isEmpty()) {
            int topo = pilhaOriginal.pop();
            if (topo == chave && !encontrado) {
                encontrado = true; // encontrou o item, não empilha de volta
            } else {
                pilhaAux.push(topo);
            }
        }

        // Retorna os elementos à pilha original (para manter a ordem)
        while (!pilhaAux.isEmpty()) {
            pilhaOriginal.push(pilhaAux.pop());
        }

        // Resultado
        if (encontrado) {
            System.out.println("Item removido com sucesso!");
        } else {
            System.out.println("Item não encontrado na pilha.");
        }

        System.out.println("Pilha final: " + pilhaOriginal);
        sc.close();
    }
}
