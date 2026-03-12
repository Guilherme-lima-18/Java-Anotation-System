package Banco;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Banco banco = new Banco();

        int opcao;
        int numeroConta = 1;

        do {

            System.out.println("\n===== Banco =====");
            System.out.println("1 Criar Conta Corrente");
            System.out.println("2 Criar Conta Poupança");
            System.out.println("3 Depositar");
            System.out.println("4 Sacar");
            System.out.println("5 Listar Contas");
            System.out.println("6 Sair");

            System.out.print("Escolha sua opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {

                case 1:

                    System.out.println("Nome: ");
                    String nome = scanner.nextLine();

                    System.out.println("CPF: ");
                    String cpf = scanner.nextLine();

                    if(!nome.isEmpty() && !cpf.isEmpty()){
                        Cliente cliente = new Cliente(nome, cpf);

                        ContaCorrente cc = new ContaCorrente(numeroConta++, cliente);

                        banco.AddConta(cc);

                        System.out.println("Conta Corrente criada!");
                        break;
                    }else{
                        System.out.println("Escreva seu nome e seu cpf!");
                        break;
                    }

                case 2:

                    System.out.println("Nome: ");
                    String nome2 = scanner.nextLine();

                    System.out.println("CPF: ");
                    String cpf2 = scanner.nextLine();

                    if(!nome2.isEmpty() && !cpf2.isEmpty()){
                        Cliente cliente2 = new Cliente(nome2, cpf2);

                        ContaPou cp = new ContaPou(numeroConta++, cliente2);

                        banco.AddConta(cp);

                        System.out.println("Conta Corrente criada!");
                        break;
                    }else{
                        System.out.println("Escreva seu nome e seu cpf!");
                        break;
                    }

                case 3:

                    System.out.println("Número da conta: ");
                    int contaDeposito = scanner.nextInt();

                    Conta contaD = banco.buscarConta(contaDeposito);

                    if (contaD != null) {

                        System.out.println("Valor para depósito: ");
                        double valor = scanner.nextDouble();

                        contaD.depositar(valor);

                        System.out.println("Depósito realizado!");
                    } else {
                        System.out.println("Conta não encontrada.");
                    }

                    break;

                case 4:

                    System.out.println("Número da conta: ");
                    int contaSaque = scanner.nextInt();

                    Conta contaS = banco.buscarConta(contaSaque);

                    if (contaS != null) {

                        System.out.println("Valor para saque: ");
                        double valor = scanner.nextDouble();

                        contaS.sacar(valor);

                    } else {
                        System.out.println("Conta não encontrada.");
                    }

                    break;

                case 5:

                    banco.ListaConta();
                    break;

                case 6:
                    System.out.println("Saindo...");
                    break;

                default:
                    System.out.println("Opção inválida!");

            }

        } while (opcao != 6);

        scanner.close();
    }
}