package Anotacoes;
class Tarefa{
    
    private int id;
    private String descricao;
    private boolean concluir;
    
    public Tarefa(int id, String descricao){
        this.id = id;
        this.descricao = descricao;
        this.concluir = false;
    }
    
    public int getId(){
        return id;
    }
    
    public void concluir(){
        concluir = true;
    }
    
    public void info(){
        System.out.println("--------------------");
        System.out.println("ID: " + id);
        System.out.println("Descrição: " + descricao);
        System.out.println("concluir: " + concluir);
        System.out.println("--------------------");
    }
}