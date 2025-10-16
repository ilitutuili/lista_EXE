import java.util.Scanner;
import java.util.Stack;

public class PilhaTexto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Character> pilha = new Stack<>();

        System.out.println("Digite uma sequência de caracteres:");
        String texto = sc.nextLine();

        // Empilha cada caractere
        for (int i = 0; i < texto.length(); i++) {
            pilha.push(texto.charAt(i));
        }

        // a) Imprimir o texto na ordem inversa
        System.out.print("Texto invertido: ");
        String invertido = "";
        while (!pilha.isEmpty()) {
            invertido += pilha.pop();
        }
        System.out.println(invertido);

        // b) Verificar se é palíndromo (ignorando espaços e pontos)
        String textoLimpo = texto.replaceAll("[ .]", "").toLowerCase();
        String invertidoLimpo = new StringBuilder(textoLimpo).reverse().toString();

        if (textoLimpo.equals(invertidoLimpo)) {
            System.out.println("O texto é um palíndromo!");
        } else {
            System.out.println("O texto NÃO é um palíndromo!");
        }

        sc.close();
    }
}

