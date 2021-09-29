package br.inatel.cdg.jogador;
import br.inatel.cdg.inimigo.Inimigo;

public abstract class Jogador {

    protected String nome;
    protected double vida;
    protected String arma;

    public Jogador(String nome, String arma, double vida) {
        this.nome = nome;
        this.vida = vida;
        this.arma = arma;
    }

    public abstract void atacar();

    public void mostraInfo(){
        System.out.println("Nome: "+nome);
        System.out.println("Arma: "+arma);
        System.out.println("Vida: "+vida);
    };
}
