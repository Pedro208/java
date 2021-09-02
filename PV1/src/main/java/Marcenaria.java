import java.util.SimpleTimeZone;

public class Marcenaria {
    String nome;
    String telefone;
    String email;

    Mesa[] mesas = new Mesa[30];

    Marcenaria(String nome, String telefone, String email){
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
    }

    void addMesa(Mesa mesa){
        for(int i=0; i<mesas.length; i++){
            if(mesas[i] == null){
                mesas[i] = mesa;
                break;
            }
        }
    }

    int mediaArea(){
        float area = 0, q = 0;
        int a;

        for(int i=0; i<mesas.length; i++){
            if(mesas[i] != null) {
                if (mesas[i].area < 4) {
                    area += mesas[i].area;
                    q++;
                }
            }
        }
        a = (int) (area/q);
        return a;
    }

    int quantidadeMesas(){
        int q = 0;
        for(int i=0; i<mesas.length; i++){
            if(mesas[i] != null) {
                if (mesas[i].peso > 50) {
                    q++;
                }
            }
        }
        return q;
    }

    void mostraInfo(){
        System.out.println("Marcenaria "+ nome);
        System.out.println("Telefone: "+ telefone);
        System.out.println("E-mail: "+ email);
        System.out.println();
        for(int i=0; i<mesas.length; i++)
            if(mesas[i] != null){
                mesas[i].mostraInfo();
            }
    }

}
