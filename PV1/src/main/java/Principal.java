import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o nome da marcenaria: ");
        String nome = sc.nextLine();
        System.out.println("Digite o telefone da marcenaria: ");
        String telefone = sc.nextLine();
        System.out.println("Digite o e-mail da marcenaria: ");
        String email = sc.nextLine();

        Marcenaria marcenaria = new Marcenaria(nome, telefone, email);
        int r, x = -1;


        while(x != 0){
            System.out.println("(1) - Cadastrar uma nova mesa");
            System.out.println("(2) - Média das mesas com menos de 4m² de área");
            System.out.println("(3) - Quantidade de mesas com mais de 50Kg");
            System.out.println("(4) - Informações da marcenaria de das mesas");
            System.out.println("(0) - SAIR");

            x = sc.nextInt();

            switch (x){
                case 1:
                    Mesa mAux = new Mesa();
                    sc.nextLine();
                    System.out.println("Madeira da mesa: ");
                    mAux.madeira = sc.nextLine();
                    System.out.println("Cor da mesa: ");
                    mAux.cor = sc.nextLine();
                    System.out.println("Peso da mesa: ");
                    mAux.peso = sc.nextFloat();
                    System.out.println("Área da mesa: ");
                    mAux.area = sc.nextFloat();
                    marcenaria.addMesa(mAux);
                    break;

                case 2:
                    System.out.print("A media da(s) mesa(s) com menos de 4m² é ");
                    r = marcenaria.mediaArea();
                    System.out.println(r);
                    break;

                case 3:
                    System.out.print("Tem ");
                    r = marcenaria.quantidadeMesas();
                    System.out.print(r);
                    System.out.println(" mesa(s) com mais de 50Kg");
                    break;

                case 4:
                    marcenaria.mostraInfo();
                    break;

            }
            System.out.println();
        }
    }
}
