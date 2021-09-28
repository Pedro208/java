public class TiaCuriosa extends Pessoa implements Desconforto{

    private int numFilhos;

    TiaCuriosa(String nome, int idade, int nivelStress) {
        super(nome, idade, nivelStress);
    }

    @Override
    public void mostraInfo(){
        System.out.println("Tia Curiosa");
        super.mostraInfo();
        System.out.println("Ela tem " + numFilhos + " filhos");
    }

    @Override
    public void brigar(){
        super.brigar();
    }

    @Override
    public void serInconveniente() {
        System.out.println("Já arrumou uma namorada?");
        setNivelStress(20);
    }
}
