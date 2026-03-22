package br.edu.insper.desagil.pi.freela;

import java.util.ArrayList;
import java.util.List;

public class Lista {
    private List<Tarefa> tarefas = new ArrayList<>();

    public List<Tarefa> getTarefas() {
        return tarefas;
    }

    public void adiciona(Tarefa tarefa){
        int id = tarefa.getId();
        boolean condicao = true;
        for (Tarefa t : tarefas){
            if (t.getId() == id){
                condicao = false;
            }
        }
        if (condicao){
            tarefas.add(tarefa);
        }
    }
}