package screenmatch.modelos;

import screenmatch.calculo.Classificavel;

public class Filme extends Titulo implements Classificavel {

    private String diretor;

    public Filme(String nome, int anoLancamento) {
        super(nome, anoLancamento);
    }


    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    public String getDiretor() {
        return diretor;
    }

    @Override
    public int getClassificacao() {
        return (int) retornaMedia()/2;
    }


    @Override
    public String toString(){
        return "Filme: " + this.getNome() + " (" + this.getAnoLancamento() + ")";
    }
}
