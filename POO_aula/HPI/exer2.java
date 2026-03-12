package POO_aula.HPI;
import java.util.Scanner;

class Veiculo{
    String marca;
    String modelo;

    void mostrarInfo(){
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
    }
}

class Carro extends Veiculo{
    int portas;

    @Override
    void mostrarInfo(){
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Portas: " + portas);
    }
}

class Moto extends Veiculo{
    int cilindradas;

    @Override
    void mostrarInfo(){
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Cilíndradas: " + cilindradas);
    }
}

public class exer2 {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        int opcao;

        do{

            System.out.println("\n===== Modelo Veiculo =====");
            System.out.println("1. Carro");
            System.out.println("2. Moto");
            System.out.println("3. Sair...");
            
            System.out.println("Escolha a opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine();

            Veiculo v = null;
            
            switch(opcao){
                case 1:

                    Carro c = new Carro();

                    System.out.println("Esceva a marca do veiculo: ");
                    c.marca = scanner.nextLine();
                    System.out.println("Eecreva o modelo do veiculo: ");
                    c.modelo = scanner.nextLine();
                    System.out.println("Escreva quantas portas: ");
                    c.portas = scanner.nextInt();
                    scanner.nextLine();

                    v = c;
                    break;
                
                case 2:

                    Moto m = new Moto();

                    System.out.println("Esceva a marca do veiculo: ");
                    m.marca = scanner.nextLine();
                    System.out.println("Eecreva o modelo do veiculo: ");
                    m.modelo = scanner.nextLine();
                    System.out.println("Escreva quantas cilindradas: ");
                    m.cilindradas = scanner.nextInt();
                    scanner.nextLine();

                    v = m;
                    break;

                case 3:
                    System.out.println("Saindo...");
                    break;
            
                default:
                    System.out.println("Opção inválida!");
                    break;
            }

            if(v != null){
                System.out.println();
                v.mostrarInfo();
            }

        }while(opcao != 3);

        scanner.close();

    }
}