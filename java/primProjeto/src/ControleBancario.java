import java.util.Scanner;

public class ControleBancario {
    public static void main(String[] args) {
        String nome = "Francisco Wellingto";
        String tipoConta = "Corrente";
        double saldo = 1599.99;
        int opcao = 0;
        Scanner leitura = new Scanner(System.in);

        System.out.println("******************************");
        System.out.println("\nNome do Cliente: " + nome);
        System.out.println("Tipo de Conta: " + tipoConta);
        System.out.println("Saldo Atual: " + saldo);
        System.out.println("\n******************************");

        String menu = """
                ** Digite sua opção: **
                1 - Colsultar Saldo
                2 - Tranferir Valor
                3 - Receber valor
                4 - Sair
                """;
        while (opcao !=4) {
            System.out.println(menu);
            opcao = leitura.nextInt();

            if (opcao == 1) {
                System.out.println("O Saldo atualizado é: " + saldo);
            }  else if (opcao == 2) {
                System.out.println("Qual valor deseja tranferir?");
                double valor = leitura.nextDouble();
                if (valor > saldo) {
                    System.out.println("Valor insuficiente para a transferencia!");
                }  else {
                    saldo -= valor;
                    System.out.println("Saldo atualizado com sucesso! Novo saldo: " + saldo);
                }
            } else if (opcao == 3) {
                System.out.println("Digite valor recebido: ");
                double valor = leitura.nextDouble();
                saldo += valor;
                System.out.println("Saldo atualizado com sucesso! Valor: " + saldo);
            } else if (opcao != 4) {
                System.out.println("Opção invalida!");
            }
        }


    }
}
