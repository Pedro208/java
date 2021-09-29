package br.inatel.cdg.jogador;

public class Guerreiro extends Jogador{
    public Guerreiro(String nome, String arma, double vida) {
        super(nome,arma, vida);
    }
    private double estamina = 100;

    @Override
    public void atacar(){
        System.out.println("Mago atacando inimigo");
        estamina -= 12;
    }

    @Override
    public void mostraInfo(){
        super.mostraInfo();
        System.out.println("Estamina: "+ estamina);
    }
}
