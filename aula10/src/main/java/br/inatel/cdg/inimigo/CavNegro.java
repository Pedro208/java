package br.inatel.cdg.inimigo;

public class CavNegro extends Inimigo {
    public CavNegro(double vida, String nome) {
        super(vida, nome);
    }

    @Override
    public void atacando() {
        System.out.println("CavNegro "+ nome + " está atacando");
    }
    @Override
    public void tomarDano(){
        System.out.println("CavNegro "+ nome+ " está tomando dano");
    }
}
