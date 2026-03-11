package Anotações;

class Tarefa {

    private int id;
    private String descricao;
    private boolean concluida;

    public Tarefa(int id, String descricao){
        this.id = id;
        this.descricao = descricao;
        this.concluida = false;
    }

    public int getId(){
        return id;
    }

    public void concluir(){
        concluida = true;
    }

    public void mostrar(){
        System.out.println("ID: " + id);
        System.out.println("Descrição: " + descricao);
        System.out.println("Concluída: " + concluida);
    }
}