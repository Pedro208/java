public class TioZoeiro extends Pessoa implements Engracado, Desconforto{

    private boolean piadaBoa;
    private String piada = "Pq sua avó n usa relogio? Pq ela e uma sem hora (senhora)";
        int rStress;

    TioZoeiro(String nome, int idade, int nivelStress) {
        super(nome, idade, nivelStress);
    }

    public void brigar(){
        System.out.println(piada);
        int contaStress = getNivelStress();
        double r = contaStress * 1.15;
        setNivelStress((int)r);
    }
    @Override
    public void mostraInfo() {
        System.out.println("Tio Zoeiro");
        super.mostraInfo();
        System.out.println(piada);
        System.out.println("A piada foi boa? " + piadaBoa);
    }

    @Override
    public void contarPiada() {
        System.out.println(piada);
    }

    @Override
    public void serInconveniente() {
        System.out.println("Eai, já arrumou emprego?");
        setNivelStress(20);
    }
}

