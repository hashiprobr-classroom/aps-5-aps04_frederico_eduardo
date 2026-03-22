package br.edu.insper.desagil.pi.freela;

public class Tarefa {
    private int id;
    private String descricao = "";
    private Momento inicio = null;
    private Momento fim = null;

    public Tarefa(int id){
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Momento getInicio() {
        return inicio;
    }

    public Momento getFim() {
        return fim;
    }

    public void atualiza(Momento novoInicio, Momento novoFim) {
        if (novoInicio.minutos() < novoFim.minutos()) {
            inicio = novoInicio;
            fim = novoFim;
        } else {
            throw new IllegalArgumentException("Fim antes do início!");
        }
    }
}