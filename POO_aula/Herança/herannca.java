package POO_aula.Herança;

class Pessoa{
    String nome;
    int idade;
}

class Funcionario extends Pessoa{
    double salario;
}

public class herannca {
    public static void main(String[] args){

        Funcionario f1 = new Funcionario();

        f1.nome = "Guilherme";
        f1.idade = 19;
        f1.salario = 1509;
        

        System.out.println(f1.nome);
        System.out.println(f1.idade);
        System.out.println(f1.salario);
    }
}
