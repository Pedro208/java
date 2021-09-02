import java.sql.SQLOutput;

public class Mesa {
    String madeira;
    String cor;
    float peso;
    float area;

    void mostraInfo(){
        System.out.println();
        System.out.println("Tipo de madeira: "+ madeira);
        System.out.println("Cor da mesa "+ cor);
        System.out.println("Peso da mesa é "+ peso);
        System.out.println("A área da mesa é "+ area);
    }
}
