package br.inatel.heroi;

public class Batman extends Heroi implements Golpear{
    public Batman(String nome, double vida) {
        this.nome = nome;
        this.vida = vida;
    }

    @Override
    public void atacar() {
        System.out.println("O Batman está atacando!");
    }
}
