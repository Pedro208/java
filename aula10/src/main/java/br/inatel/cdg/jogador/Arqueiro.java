package br.inatel.cdg.jogador;

public class Arqueiro extends Jogador{
    public Arqueiro(String nome, String arma, double vida) {
        super(nome,arma, vida);
    }
    private int flechas = 20;

    @Override
    public void atacar(){
        System.out.println("Arqueiro atacando inimigo");
        flechas -= 1;
    }

    @Override
    public void mostraInfo(){
        super.mostraInfo();
        System.out.println("Flechas restantes: "+ flechas);
    }
}