package br.edu.insper.desagil.pi.freela;

public class DataHorario extends Momento{
    private int hora = 0;
    private int minuto = 0;
    private Data data;

    public DataHorario(Data data){
        this.data = data;
    }

    public int getHora() {
        return hora;
    }

    public int getMinuto() {
        return minuto;
    }

    public Data getData() {
        return data;
    }

    public void setData(Data data) {
        this.data = data;
    }

    public void atualiza(int novaHora, int novoMinuto){
        hora = ajusta(novaHora, 0, 23);
        minuto = ajusta(novoMinuto, 0, 59);
    }

    @Override
    public int minutos() {
        return data.minutos() + hora*60 + minuto;
    }
}
