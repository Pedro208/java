package br.inatel.cdg.pessoa;

import javax.xml.stream.events.EntityReference;

public class Pessoa {
    public String nome;
    public long cpf;
    public int qtdEnd;

    //Construtor
    public Pessoa(String nome, int cpf, int qtdEnd){
        this.nome = nome;
        this.cpf = cpf;
        this.qtdEnd = qtdEnd;
    }

    //Cria o vetor
    Endereco[] endereco = new Endereco[qtdEnd];
    Endereco nEndereco = new Endereco("teste", "teste", 2);

    //Adiciona endereços
    public void addEndereco(){
        System.out.println("Adicione os " + qtdEnd +" endereços");

        nEndereco.bairro = "teste";

        for(int i=0; i<endereco.length; i++){
            if(endereco[i] == null){
                endereco[i] = nEndereco;
                break;
            }
        }
    }

    //Mostra Info da pessoa e seus endereços
    public void mostraInfo(){
        System.out.printf("Nome: " + nome);
        System.out.println("CPF: " + cpf );

        //Mostra info dos endereços
        for(int i = 0; i<endereco.length; i++){
            if(endereco[i] != null){
                endereco[i].mostraInfo();
            }
        }
    }
}
