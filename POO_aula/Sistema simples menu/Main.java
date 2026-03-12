import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Escreva o valor de a: ");
        int a = scanner.nextInt();
        System.out.println("Escreva o valor de b: ");
        int b = scanner.nextInt();
        
        int opcao;
        
        do{
            System.out.println("=== Soma e média ===");
            System.out.println("1. Soma");
            System.out.println("2. Média");
            System.out.println("0. Sair...");
            
            System.out.println("Escolha a sua opção: ");
            opcao = scanner.nextInt();
            
            switch(opcao){
                case 1:
                    int soma = (a + b);;
                    System.out.println("Soma dos valores: " + soma);
                    break;
                    
                case 2:
                    double media = (a + b) / 2.0;;
                    System.out.println("Média dos valores: " + media);
                    break;
                    
                case 0:
                    System.out.println("Saindo...");
                    break;
                    
                default:
                    System.out.println("Opição inválida!");
            }
        }while(opcao != 0);
        
        scanner.close();
    }
}