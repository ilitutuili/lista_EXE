import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Aviao {
    private String nome;
    private int identificador;

    public Aviao(String nome, int identificador) {
        this.nome = nome;
        this.identificador = identificador;
    }

    public String getNome() {
        return nome;
    }

    public int getIdentificador() {
        return identificador;
    }

    @Override
    public String toString() {
        return "Avião [ID: " + identificador + ", Nome: " + nome + "]";
    }
}

public class ControlePistaDecolagem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Queue<Aviao> fila = new LinkedList<>();
        int opcao;

        do {
            System.out.println("\n===== CONTROLE DE DECOLAGEM =====");
            System.out.println("1 - Listar número de aviões aguardando");
            System.out.println("2 - Autorizar decolagem do primeiro avião");
            System.out.println("3 - Adicionar avião à fila de espera");
            System.out.println("4 - Listar todos os aviões na fila");
            System.out.println("5 - Mostrar o primeiro avião da fila");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = sc.nextInt();
            sc.nextLine(); // limpar buffer

            switch (opcao) {
                case 1:
                    System.out.println("Número de aviões aguardando: " + fila.size());
                    break;

                case 2:
                    if (fila.isEmpty()) {
                        System.out.println("Nenhum avião na fila para decolar!");
                    } else {
                        Aviao decolando = fila.poll();
                        System.out.println("Avião autorizado a decolar: " + decolando);
                    }
                    break;

                case 3:
                    System.out.print("Nome do avião: ");
                    String nome = sc.nextLine();
                    System.out.print("Identificador (número): ");
                    int id = sc.nextInt();
                    fila.add(new Aviao(nome, id));
                    System.out.println("Avião adicionado à fila com sucesso!");
                    break;

                case 4:
                    if (fila.isEmpty()) {
                        System.out.println("Nenhum avião na fila de espera.");
                    } else {
                        System.out.println("Aviões na fila de espera:");
                        for (Aviao a : fila) {
                            System.out.println(a);
                        }
                    }
                    break;

                case 5:
                    if (fila.isEmpty()) {
                        System.out.println("Nenhum avião na fila.");
                    } else {
                        System.out.println("Primeiro avião da fila: " + fila.peek());
                    }
                    break;

                case 0:
                    System.out.println("Encerrando o programa...");
                    break;

                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (opcao != 0);

        sc.close();
    }
}
