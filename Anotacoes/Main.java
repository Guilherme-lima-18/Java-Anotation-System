package Anotacoes;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        GerenciarTarefa ger = new GerenciarTarefa();

        int opcao;
        int id = 1;

        do {

            System.out.println("\n==== Lista de tarefas ====");
            System.out.println("1. Adicionar tarefa");
            System.out.println("2. Concluir tarefa");
            System.out.println("3. Listar tarefas");
            System.out.println("4. Buscar tarefa");
            System.out.println("5. Remover tarefa");
            System.out.println("0. Sair");
            System.out.print("Escolha a opção: ");

            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {

                case 1:
                    System.out.print("\033[H\033[2J"); 
                    System.out.flush();
                
                    System.out.print("Escreva a tarefa: ");
                    String desc = scanner.nextLine();

                    Tarefa novaTarefa = new Tarefa(id++, desc);
                    ger.addTarefa(novaTarefa);
                    ger.listar();
                    break;
                    
                case 2:
                    System.out.print("\033[H\033[2J"); 
                    System.out.flush();
                    
                    System.out.println("Id da tarefa: ");
                    int busc = scanner.nextInt();
                    scanner.nextLine();
                    
                    Tarefa tconcluir = ger.buscar(busc);
                    
                    if(tconcluir != null){
                        System.out.println("Deseja concluir a tarefa? (sim / nao): ");
                        String tResposta = scanner.nextLine();
                        
                        if(tResposta.equalsIgnoreCase("sim")){
                            ger.concluir(busc);
                            System.out.println("Tarefa concluída!");
                        }else if(tResposta.equalsIgnoreCase("nao")){
                            System.out.println("Tarefa não concluída!");
                        }else{
                            System.out.println("Digite uma respota válida!");
                        }
                    }else{
                        System.out.println("Tarefa não encontrada!");
                    }
                    
                    break;
                    
                case 3:
                    System.out.print("\033[H\033[2J"); 
                    System.out.flush();
                    
                    ger.listar();
                    break;
                    
                case 4:
                    System.out.print("\033[H\033[2J"); 
                    System.out.flush();
                    
                    System.out.println("Id da tarefa: ");
                    int numid = scanner.nextInt();
                    
                    Tarefa tBuscar = ger.buscar(numid);
                    
                    if(tBuscar != null){
                        tBuscar.info();
                        break;
                    }else{
                        System.out.println("Tarefa não encontrada!");
                        break;
                    }
                    
                case 5:
                    System.out.print("\033[H\033[2J"); 
                    System.out.flush();
                    
                    System.out.println("Digite o id: ");
                    int tRemover = scanner.nextInt();
                    scanner.nextLine();
                    
                    boolean removida = ger.remover(tRemover);
                    
                    if(removida){
                        System.out.println("Tarefa removida com sucesso!");
                    }else{
                        System.out.println("Tarefa não encontrata!");
                    }
                    
                    break;

                case 0:
                    System.out.println("Saindo...");
                    break;

                default:
                    System.out.println("Escolha uma opção válida!");
                    break;
            }

        } while (opcao != 0);

        scanner.close();
    }
}