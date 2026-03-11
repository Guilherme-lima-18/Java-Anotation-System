package Anotações;

import java.util.ArrayList;

class GerenciadorTarefas {

    private ArrayList<Tarefa> tarefas = new ArrayList<>();

    public void adicionar(Tarefa t){
        tarefas.add(t);
    }

    public void listar(){

        for(Tarefa t : tarefas){
            t.mostrar();
            System.out.println();
        }

    }

}
