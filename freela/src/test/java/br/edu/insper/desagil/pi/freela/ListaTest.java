package br.edu.insper.desagil.pi.freela;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ListaTest {
    private Lista l;

    @BeforeEach
    void setUp(){
        l = new Lista();
    }

    @Test
    void constroi(){
        assertEquals(0, l.getTarefas().size());
    }

    @Test
    void adicionaIguais(){
        Tarefa t1 = new Tarefa(1);
        Tarefa t2 = new Tarefa(1);
        l.adiciona(t1);
        l.adiciona(t2);
        assertEquals(1, l.getTarefas().size());
    }

    @Test
    void adicionaDiferentes(){
        Tarefa t1 = new Tarefa(1);
        Tarefa t2 = new Tarefa(2);
        l.adiciona(t1);
        l.adiciona(t2);
        assertEquals(2, l.getTarefas().size());
    }
}
