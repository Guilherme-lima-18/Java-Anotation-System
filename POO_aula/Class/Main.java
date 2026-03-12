// 1. Conceito um Objeto

class Pessoa{
    String nome;
    int idade;
}

public class Main{
    public static void main(String[] args){
        
        // 2. Criando Objeto
        //-> Agora usamos esse molde
        
        Pessoa p1 = new Pessoa();
        
        // Agora p1 é um Objeto
        
        // 3. Atribuindo valores
        
        p1.nome = "Guilherme";
        p1.idade = 19;
        
        // 4. Exibindo valores
        System.out.println("Nome: " + p1.nome);
        System.out.println("Idade: " + p1.idade);
    }
}