public class VoPreocupada extends Pessoa implements EngordaNeto{

    private String paranoiaPrincipal = "Nossa vc está magrinho. Está comendo direitinho?";

    VoPreocupada(String nome, int idade, int nivelStress) {
        super(nome, idade, nivelStress);
    }

    @Override
    public void mostraInfo(){
        System.out.println("Avó preocupada");
        super.mostraInfo();
        System.out.println(paranoiaPrincipal);
    }

    @Override
    public void taMagrinho() {
        System.out.println(paranoiaPrincipal);
    }
}
