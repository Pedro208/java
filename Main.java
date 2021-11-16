package br.inatel.C206;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {
    public static void main(String[] args) {

        Path funcionarios = Paths.get("funcionarios.csv");

        CsvManip.fSemFilhos(funcionarios);
    }
}
