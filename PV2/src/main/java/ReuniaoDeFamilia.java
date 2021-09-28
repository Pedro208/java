public class ReuniaoDeFamilia {

    Pessoa[] convidados = new Pessoa[5];

    public void addPessoa(Pessoa pessoa){
        for(int i=0; i<convidados.length; i++){
            if(convidados[i] == null){
                convidados[i] = pessoa;
                break;
            }
        }
    }

    public void listarPessoas(){
        for(int i=0; i<convidados.length; i++)
            if(convidados[i] != null){
                convidados[i].mostraInfo();
            }
    }


}
