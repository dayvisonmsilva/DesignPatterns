package decorator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Bem vindo a cantina da UFERSA!!");
        System.out.println("Quantos lanches vai querer?");
        Scanner scanner = new Scanner(System.in);
        int quantidade = scanner.nextInt();
        scanner.nextLine();
        double total = 0.0;
        ILanche pedidos[] = new ILanche[quantidade];

        for (int i = 0; i < quantidade; i++) {
            pedidos[i] = new Lanche(); // Cria um lanche simples inicialmente
            System.out.print("No " + (i + 1) + "º lanche, deseja que seja gourmet? (1-sim) (2-nao)\t");
            int gourmet = scanner.nextInt();
            scanner.nextLine();
            if (gourmet == 1) {
                pedidos[i] = new LancheGourmetDecorator(pedidos[i]); // Aplica o decorador ao lanche atual
            }

            System.out.print("No " + (i + 1) + "º lanche, deseja que seja vegano? (1-sim) (2-nao)\t");
            int vegano = scanner.nextInt();
            scanner.nextLine();
            if (vegano == 1) {
                pedidos[i] = new LancheVeganoDecorator(pedidos[i]); // Aplica o decorador ao lanche atual
            }

            total += pedidos[i].getPreco(); // Soma o preço do lanche atual
            System.out.println();
        }

        System.out.println("----------------- Lista de pedidos -----------------");

        for (int i = 0; i < quantidade; i++) {
            System.out.printf("Pedido %d: %s - R$ %.2f%n", (i + 1), pedidos[i].getDescricao(), pedidos[i].getPreco());
        }
        System.out.println("Total a pagar: R$ " + String.format("%.2f", total));

        scanner.close();
    }
}
