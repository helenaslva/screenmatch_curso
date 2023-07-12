package screenmatch.modelos;

import com.google.gson.annotations.SerializedName;
import screenmatch.excecao.ErroDeConversaoDeAnoException;

public class Titulo implements Comparable<Titulo>{


    public Titulo(String nome, int anoLancamento) {
        this.nome = nome;
        this.anoLancamento = anoLancamento;
    }

    public Titulo(TituloOmdb meuTituloOmdb) {
        this.nome = meuTituloOmdb.title();
        if(meuTituloOmdb.year().length()>4){
            throw new ErroDeConversaoDeAnoException("Não consegui converter o ano, mais de 4 caracteres");
        }
        this.anoLancamento = Integer.valueOf(meuTituloOmdb.year());
        this.duracaoEmMinutos = Integer.valueOf(meuTituloOmdb.runtime().substring(0,2));
    }

    public String getNome() {
        return nome;
    }

    @SerializedName("Title")
    private String nome;

    public int getAnoLancamento() {
        return anoLancamento;
    }

    @SerializedName("Year")
    private int anoLancamento;
    private boolean incluidoNoPlano;
    private double somaAvaliacoes;
    private int totalDeAvaliacoes;

    private int duracaoEmMinutos;

    public int getTotalDeAvaliacoes(){
        return totalDeAvaliacoes;
    }
    public double getSomaAvaliacoes(){
        return somaAvaliacoes;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIncluidoNoPlano(boolean incluidoNoPlano) {
        this.incluidoNoPlano = incluidoNoPlano;
    }

    public void setAnoLancamento(int anoLancamento) {
        this.anoLancamento = anoLancamento;
    }

    public void setDuracaoEmMinutos(int duracaoEmMinutos) {
        this.duracaoEmMinutos = duracaoEmMinutos;
    }

    public int getDuracaoEmMinutos() {
        return duracaoEmMinutos;
    }

    public void imprimeFichaTecnica(){

        System.out.println("Nome do filme: " + nome);
        System.out.println("Ano de lançamento: " + anoLancamento);

    }

    public void avaliaFilme(double nota){
        somaAvaliacoes += nota;
        totalDeAvaliacoes++;

    }

    public double retornaMedia(){
        double media = (somaAvaliacoes/totalDeAvaliacoes);

        return media;
    }

    @Override
    public int compareTo(Titulo outroTitulo) {
       return this.getNome().compareTo(outroTitulo.getNome());
    }

    @Override
    public String toString() {
        return  "\n"+
                "nome: " + nome  + "\n" +
                "anoLancamento: " + anoLancamento + "\n" +
                "duracaoEmMinutos: " + duracaoEmMinutos;
    }
}
