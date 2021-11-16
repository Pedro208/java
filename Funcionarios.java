package br.inatel.C206;

public class Funcionarios {

    private int id;
    private double salario;
    private int numFilhos;

    public Funcionarios(int id, int numFilhos, double salario) {
        this.id = id;
        this.salario = salario;
        this.numFilhos = numFilhos;
    }

    public double getSalario() {
        return salario;
    }

    public int getId() {
        return id;
    }

    public int getNumFilhos() {
        return numFilhos;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNumFilhos(int numFilhos) {
        this.numFilhos = numFilhos;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
