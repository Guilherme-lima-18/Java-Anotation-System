package Exercicios.exercicio2;

import java.util.ArrayList;
import java.util.Scanner;

class Cliente{
    private String nome;
    private String cpf;

    public Cliente(String nome, String cpf){
        this.nome = nome;
        this.cpf = cpf;
    }

    public String getNome(){
        return nome;
    }

    public String getCpf(){
        return cpf;
    }
}

class Conta{

    protected int numConta;
    protected double saldo;
    protected Cliente cliente;

    public Conta(int numConta, Cliente cliente){
        this.numConta = numConta;
        this.cliente = cliente;
        this.saldo = 0;
    }

    public void depositar(double valor){
        saldo += valor;
    }

    public void sacar(double valor){
        if(valor <= saldo){
            saldo -= valor;
        }else{
            System.out.println("Saldo insuficiente!");
        }
    }

    public void mostrarConta(){
        System.out.println("Conta: " + numConta);
        System.out.println("Cliente: " + cliente.getNome());
        System.out.println("Saldo: " + saldo);
    }
}

    class ContaCorrente extends Conta{

        public ContaCorrente(int numConta, Cliente cliente){
        super(numConta, cliente);
    }

}

    class ContaPou extends Conta{

        public ContaPou(int numConta, Cliente cliente){
        super(numConta, cliente);
    }

}

class Banco{

    private ArrayList<Conta> contas = new ArrayList<>();

    public void AddConta(Conta conta){
        contas.add(conta);
    }

    public void ListaConta(){
        for(Conta c : contas){
            c.mostrarConta();
            System.out.println();
        }
    }
}

public class exer2 {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        Banco banco = new Banco();

        int opcao;

        do{

            System.out.println("\n===== Banco =====");
            System.out.println("1 Criar Conta Corrente");
            System.out.println("2 Criar Conta Poupança");
            System.out.println("3 Listar Contas");
            System.out.println("4 Sair");

            System.out.println("Escolha sua opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    
                    System.out.println("Nome: ");
                    String nome = scanner.nextLine();

                    System.out.println("CPF: ");
                    String cpf = scanner.nextLine();

                    Cliente cliente = new Cliente(nome, cpf);

                    ContaCorrente cc = new ContaCorrente(1, cliente);
                    
                    banco.AddConta(cc);

                    break;

                case 2:

                    System.out.println("Nmoe: ");
                    String nome2 = scanner.nextLine();

                    System.out.println("CPF: ");
                    String cpf2 = scanner.nextLine();

                    Cliente cliente2 = new Cliente(nome2, cpf2);

                    ContaPou cp = new ContaPou(2, cliente2);

                    banco.AddConta(cp);

                    break;

                case 3: 

                    banco.ListaConta();
                    break;

                case 4:
                    System.out.println("Saindo...");
                    break;

                default:
                    System.out.println("Opção inválida!");
                    break;
            }

        }while(opcao != 4);

        scanner.close();
    }
}
