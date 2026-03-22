package br.edu.insper.desagil.pi.freela;

import java.util.HashMap;
import java.util.Map;

public class Data extends Momento {
    private int ano = 1970;
    private int mes = 1;
    private int dia = 1;
    private Map<Integer, Integer> limite;

    public Data(){
        Map<Integer, Integer> limite = new HashMap<>();
        limite.put(1, 31);
        limite.put(2, 28);
        limite.put(3, 31);
        limite.put(4, 30);
        limite.put(5, 31);
        limite.put(6, 30);
        limite.put(7, 31);
        limite.put(8, 31);
        limite.put(9, 30);
        limite.put(10, 31);
        limite.put(11, 30);
        limite.put(12, 31);
        this.limite = limite;
    }

    public int getAno() {
        return ano;
    }

    public int getMes() {
        return mes;
    }

    public int getDia() {
        return dia;
    }

    public void atualiza(int novoAno, int novoMes, int novoDia){
        ano = ajusta(novoAno, 1970, 2070);
        mes = ajusta(novoMes, 1, 12);
        dia = ajusta(novoDia, 1, limite.get(mes));
    }

    @Override
    public int minutos() {
        int minutos = 0;
        int anos = ano - 1970;
        int dias = anos * 365 + (dia - 1);
        int meses = mes;
        for (int i = 1; i < meses; i++) {
            dias += limite.get(i);
        }
        minutos += dias*24*60;
        return minutos;
    }
}
