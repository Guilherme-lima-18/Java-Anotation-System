package Anotações;
import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        GerenciadorTarefas ger = new GerenciadorTarefas();

        int id = 1;

        System.out.println("Digite a tarefa:");
        String desc = scanner.nextLine();

        Tarefa t = new Tarefa(id++, desc);

        ger.adicionar(t);

        ger.listar();

        scanner.close();

    }

}
