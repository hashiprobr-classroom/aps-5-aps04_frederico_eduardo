package br.edu.insper.desagil.pi.freela;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class TarefaTest {
    private Tarefa t;

    @BeforeEach
    void setUp(){
        t = new Tarefa(1);
    }

    @Test
    void constroi(){
        assertEquals(1, t.getId());
        assertEquals("", t.getDescricao());
        assertNull(t.getInicio());
        assertNull(t.getFim());
    }

    @Test
    void mudaDescricao(){
        t.setDescricao("Teste");
        assertEquals("Teste", t.getDescricao());
    }

    @Test
    void momentosValidos() {
        Momento inicio = mock(Momento.class);
        Momento fim = mock(Momento.class);
        when(inicio.minutos()).thenReturn(50);
        when(fim.minutos()).thenReturn(100);
        t.atualiza(inicio, fim);
        assertEquals(inicio, t.getInicio());
        assertEquals(fim, t.getFim());
    }

    @Test
    void momentosInvalidos() {
        Momento inicio = mock(Momento.class);
        Momento fim = mock(Momento.class);
        when(inicio.minutos()).thenReturn(100);
        when(fim.minutos()).thenReturn(50);
        assertThrows(IllegalArgumentException.class, () -> {
            t.atualiza(inicio, fim);
        });
    }
}