package Anotacoes;
import java.util.ArrayList;

class GerenciarTarefa{
    
    private ArrayList<Tarefa> tarefas = new ArrayList<>();
    
    public void addTarefa(Tarefa t){
        tarefas.add(t);
    }
    
    public void listar(){
        
        if(tarefas.isEmpty()){
            System.out.println("Nenhuma tarefa cadastrada!");
            return;
        }
        
        for(Tarefa t : tarefas){
            t.info();
        }
    }
    
    public Tarefa buscar(int num) {
        for (Tarefa t : tarefas) {
            if (t.getId() == num) {
                return t;
            }
        }
        return null;
    }
    
    public boolean concluir(int num) {
        Tarefa t = buscar(num);

        if (t != null) {
            t.concluir();
            return true;
        }

        return false;
    }
    
    public boolean remover(int num) {
        Tarefa t = buscar(num);

        if (t != null) {
            tarefas.remove(t);
            return true;
        }

        return false;
    }
}
