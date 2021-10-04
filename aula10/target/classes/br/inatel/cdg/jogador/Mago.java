package br.inatel.cdg.jogador;
import br.inatel.cdg.inimigo.ZumbiLerdo;

public class Mago extends Jogador{
    public Mago(String nome, String arma, double vida) {
        super(nome,arma, vida);
    }
    private double mana = 100;

    @Override
    public void atacar(){
        System.out.println("Mago atacando inimigo");
        mana -= 10;
    }
    
    @Override
    public void mostraInfo(){
        super.mostraInfo();
        System.out.println("Mana: "+ mana);
    }
}