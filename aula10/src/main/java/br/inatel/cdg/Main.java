package br.inatel.cdg;

import br.inatel.cdg.inimigo.CavNegro;
import br.inatel.cdg.inimigo.ZumbiLerdo;
import br.inatel.cdg.inimigo.Inimigo;
import br.inatel.cdg.jogador.Jogador;
import br.inatel.cdg.jogador.Mago;

public class Main {
    public static void main(String[] args) {

        Inimigo ini = new ZumbiLerdo(200, "Boomer");
        Inimigo z1 = new ZumbiLerdo(100,"lerdao");
        Inimigo c1 = new CavNegro(150,"ChavesBK");

        Jogador j1 = new Mago("João", "Cajado", 300);
        j1.atacar();
        j1.mostraInfo();
    }
}
