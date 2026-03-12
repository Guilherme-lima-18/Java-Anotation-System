package POO_aula.Polimorfismo;

class Animal{
    void som_animal(){
        System.out.println("Som do animal");
    }
}

class Cao extends Animal{
    void som_animal(){
        System.out.println("au au");
    }
}

class Gato extends Animal{
    void som_animal(){
        System.out.println("Miau");
    }
}

public class poli {
    public static void main(String[] args){

        Cao c1 = new Cao();
        Gato g1 = new Gato();
        
        c1.som_animal();
        g1.som_animal();

    }
    
}
