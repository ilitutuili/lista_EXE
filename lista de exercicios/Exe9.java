import java.util.ArrayList;
import java.util.Scanner;

public class Exe9 {
    public static int somaLista(ArrayList<Integer> lista, int indice) {
        if (indice == lista.size()) {
            return 0;
        }
        return lista.get(indice) + somaLista(lista, indice + 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> numeros = new ArrayList<>();
        System.out.println("\n Digite os numeros da lista");
        System.out.println("Para finalizar digite uma letra \n");

        while (true) {
            System.out.print("Digite um número: ");
            if (sc.hasNextInt()) {
                numeros.add(sc.nextInt());
            } else {
                break;
            }
        }
        sc.close();
        System.out.println("\n Lista: " + numeros);
        int resultado = somaLista(numeros, 0);
        System.out.println("Soma final: " + resultado);
    }
}

