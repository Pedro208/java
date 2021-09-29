package br.inatel.cdg.inimigo;

public class ZumbiLerdo extends Inimigo {
    public ZumbiLerdo(double vida, String nome) {
        super(vida, nome);
    }

    @Override
    public void atacando(){
        System.out.println("Zumbi lerdo "+ nome + " está atacando!");
    }

    @Override
    public void tomarDano() {
        System.out.println("Zumbi lerdo "+ nome + " está tomando dano");
    }
}
