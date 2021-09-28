public abstract class Pessoa{

    protected String nome;
    protected int idade;
    protected int nivelStress;

    Comida comida = new Comida();

    Pessoa(String nome, int idade, int nivelStress){
        this.nome = nome;
        this.idade = idade;
        this.nivelStress = nivelStress;
    }

    public void mostraInfo(){
        System.out.println("Nome: "+ nome);
        System.out.println("Idade: "+ idade);
        System.out.println("Estresse: " + nivelStress);
    }
    public void brigar(){
        boolean pcomer = comida.getComestivel();
        if(pcomer == true){
            int contaStress = getNivelStress();
            double r = contaStress * 1.5;
            setNivelStress((int)r);
        }
        else{
            int contaStress = getNivelStress();
            double r = contaStress * 0.80;
            setNivelStress((int)r);
        }
    }

    public int getNivelStress() {
        return nivelStress;
    }

    public void setNivelStress(int nivelStress) {
        this.nivelStress += nivelStress;
    }

}
