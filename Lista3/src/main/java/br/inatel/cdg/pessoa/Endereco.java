package br.inatel.cdg.pessoa;

import jdk.swing.interop.SwingInterOpUtils;

public class Endereco {
    public String rua;
    public String bairro;
    public int num;

    //Construtor
    public Endereco(String bairro, String rua, int num) {
        this.rua = rua;
        this.bairro = bairro;
        this.num = num;
    }

    //Mostra as informações
    public void mostraInfo(){
        System.out.println("Bairro: " + bairro);
        System.out.println("Rua: " + rua);
        System.out.println("Numero: "+ num);
    }
}
