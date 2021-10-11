package br.inatel.heroi;

public class Superman extends Heroi implements Golpear{
    public Superman(String nome, double vida) {
        this.nome = nome;
        this.vida = vida;
    }

    @Override
    public void atacar() {
        System.out.println("O Superman está atacando!");
    }
}
