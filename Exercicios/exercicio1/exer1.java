package Exercicios.exercicio1;

import java.util.ArrayList;
import java.util.Scanner;

class Funcionario{
    String nome;
    double salario;

    void mostrarInfo(){
        System.out.println("Nome do funcionário: " + nome);
        System.out.println("Salário do funcionário: " + salario);
    }
}

class Desenvolvedor extends Funcionario{
    String linguagem;

    @Override
    void mostrarInfo(){
        System.out.println("\n==== Tipo Desenvolvedor ====");
        System.out.println("Nome do funcionário: " + nome);
        System.out.println("Salário do funcionário: " + salario);
        System.out.println("Linguagem: " + linguagem);
    }
}

class Gerente extends Funcionario{
    String departamento;

    @Override
    void mostrarInfo(){
        System.out.println("\n==== Tipo Gerente ====");
        System.out.println("Nome do funcionário: " + nome);
        System.out.println("Salário do funcionário: " + salario);
        System.out.println("Departamento: " + departamento);
    }
}

public class exer1 {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        ArrayList<Funcionario> funcionarios = new ArrayList<>();

        int opcao;

        do{

            System.out.println("\n===== Gerenciamento de funcionarios =====");
            System.out.println("1. Cadastrar Desenvolvedor");
            System.out.println("2. Cadastrar Gerente");
            System.out.println("3. Listar Funcionários");
            System.out.println("4. Sair...");

            System.out.println("Escolha a opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch(opcao){
                case 1:

                    System.out.print("\033[H\033[2J");
                    System.out.flush();

                    Desenvolvedor d = new Desenvolvedor();

                    System.out.println("Nome: ");
                    d.nome = scanner.nextLine();

                    System.out.println("Escreva o salário: ");
                    d.salario = scanner.nextDouble();
                    scanner.nextLine();

                    System.out.println("Escreva a linguagem: ");
                    d.linguagem =  scanner.nextLine();

                    funcionarios.add(d);

                    break;

                case 2:

                    System.out.print("\033[H\033[2J");
                    System.out.flush();

                    Gerente g = new Gerente();

                    System.out.println("Nome: ");
                    g.nome = scanner.nextLine();

                    System.out.println("Escreva o salário: ");
                    g.salario = scanner.nextDouble();
                    scanner.nextLine();

                    System.out.println("Escreva o departamento: ");
                    g.departamento =  scanner.nextLine();
    
                    funcionarios.add(g);

                    break;
                
                case 3:

                    System.out.print("\033[H\033[2J");
                    System.out.flush();
                    
                    if (funcionarios.isEmpty()) {
                        System.out.println("Nenhum funcionário cadastrado.");
                    } else {

                        System.out.println("\n===== Lista de Funcionários =====");

                        for (Funcionario f : funcionarios) {
                            f.mostrarInfo();
                            System.out.println("---------------------");
                        }
                    }

                    break;
                
                case 4:
                    System.out.println("Saindo...");
                    break;

                default:
                    System.out.println("Opção invalida! ");
                    break;
            }

        }while(opcao != 4);

        scanner.close();

    }
}
