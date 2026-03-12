package POO_aula.Encapsulamento;

import java.util.Scanner;

class Conta{
    
    private String titular;
    private double saldo;

    public void setTitular(String titular){
        this.titular = titular;
    }

    public String getTitular(){
        return titular;
    }

    public void setSaldo(double saldo){
        this.saldo = saldo;
    }

    public double getSaldo(){
        return saldo;
    }

    public void depositar(double valor){
        if(valor > 0){
            saldo += valor;
            System.out.println("Depósito de R$ " + valor + " Realizado com sucesso!");
        }else{
            System.out.println("Escreva um valor válido!");
        }
    }

    public void sacar(double valor){
        if(valor > 0){
            if(valor <= saldo){
                saldo -= valor;
                System.out.println("Saque de R$ " + valor + " Realizado com sucesso!");
            }else{
                System.out.println("Saldo insufficiente! Você tem R$ " + saldo + " na sua conta");
            }
        }else{
            System.out.println("Valor de saque inválido!");
        }
    }

}

public class exer1 {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        Conta c1 = new Conta();

        System.out.println("Escreva seu nome: ");
        String nome = scanner.nextLine();
        c1.setTitular(nome);

        System.out.println("Escreva seu saldo: ");
        double saldo = scanner.nextDouble();
        c1.setSaldo(saldo);

        int opcao;

        do{
            
            System.out.println("=== Conta bancária ===");
            System.out.println("1. Depósito");
            System.out.println("2. Saque");
            System.out.println("3. Ver dados do titular");
            System.out.println("0. Sair...");

            System.out.println("Escreva a opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("\033[H\033[2J");
                    System.out.flush();
                    System.out.println("Digite o valor de depósito: ");
                    double deposito = scanner.nextDouble();
                    c1.depositar(deposito);
                    break;

                case 2:
                    System.out.print("\033[H\033[2J");
                    System.out.flush();
                    System.out.println("Digite o valor de saque: ");
                    double saque = scanner.nextDouble();
                    c1.sacar(saque);
                    break;
                case 3:
                    System.out.print("\033[H\033[2J");
                    System.out.flush();
                    System.out.println("Seu nome é: " + c1.getTitular());
                    System.out.println("Seu saldo é de: " + c1.getSaldo());
                    break;

                case 0:
                    System.out.println("Saindo...");
                    break;
            
                default:
                    System.out.println("Insira uma opção válida!");
                    break;
            }

        }while(opcao != 0);

        scanner.close();
    }
}
