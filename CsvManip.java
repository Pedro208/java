package br.inatel.C206;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.*;

public class CsvManip {

    public static void fSemFilhos(Path arquivo) {
        Path funcSemFilhos = Paths.get("funcSemFilhos.csv");

        try {
           List<String> linhas = Files.readAllLines(arquivo);

           linhas.forEach(l->{
               int i=0;
               String linhaSep[] = l.split(",");
               Funcionarios aux = new Funcionarios(
                       Integer.parseInt(linhaSep[0]),
                       Integer.parseInt(linhaSep[3]),
                       Double.parseDouble(linhaSep[4]));

               if(aux.getNumFilhos() > 0){

                   try {
                       StringBuilder linhaPronta = new StringBuilder();

                       linhaPronta.append( aux.getId() + "," +
                               aux.getNumFilhos() + "," +
                               aux.getSalario() + "\n");

                       Files.writeString(funcSemFilhos,
                               linhaPronta,
                               StandardOpenOption.CREATE,
                               StandardOpenOption.APPEND);

                   } catch (IOException e) {
                       e.printStackTrace();
                   }
               }
           });
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
