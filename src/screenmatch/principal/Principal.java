package screenmatch.principal;

import screenmatch.calculo.CalculadoraDeTempo;
import screenmatch.calculo.FiltroRecomendacao;
import screenmatch.modelos.Episodio;
import screenmatch.modelos.Filme;
import screenmatch.modelos.Serie;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        Filme filmeUm = new Filme("O rei leão", 1994);//criar um NOVO objeto do tipo filme;
        //filmeUm.setNome("O rei leão");
        //filmeUm.setAnoLancamento(1993);
        filmeUm.setDuracaoEmMinutos(120);

        filmeUm.imprimeFichaTecnica();
        filmeUm.avaliaFilme(4);
        filmeUm.avaliaFilme(5);
        filmeUm.avaliaFilme(6);

        System.out.println(filmeUm.getSomaAvaliacoes());
        System.out.println(filmeUm.getTotalDeAvaliacoes());
        System.out.println(filmeUm.retornaMedia());

        Serie minhaSerie = new Serie("Game of Thrones", 2011);

        //minhaSerie.setNome("Game of Thrones");
        minhaSerie.setTemporadas(8);
        minhaSerie.setEpisodiosPorTemporada(9);
        minhaSerie.setMinutosPorEpisodio(54);

        System.out.println("A duração da série é " + minhaSerie.getDuracaoEmMinutos() + " minutos");
        Filme filmeDois = new Filme("O rei leão 2", 1998);//criar um NOVO objeto do tipo filme;
        //filmeDois.setNome("O rei leão 2");
       //filmeDois.setAnoLancamento(1998);
        filmeDois.setDuracaoEmMinutos(134);

        CalculadoraDeTempo calculadoraDeTempo = new CalculadoraDeTempo();

        calculadoraDeTempo.inclui(filmeUm);
        calculadoraDeTempo.inclui(filmeDois);
        System.out.println(calculadoraDeTempo.getTempoTotal());

        FiltroRecomendacao filtro = new FiltroRecomendacao();
        filtro.filtra(filmeUm);

        Episodio episodio = new Episodio();
        episodio.setNumero(1);
        episodio.setTotalVisualizacoes(300);
        filtro.filtra(episodio);

        Filme filmeTres = new Filme("Irmão urso", 2003);
        //filmeTres.setNome("Irmão urso");
        //filmeTres.setDuracaoEmMinutos(2003);
        filmeTres.setAnoLancamento(1997);
        filmeTres.avaliaFilme(10);

        ArrayList<Filme> listaDeFilmes = new ArrayList<>();
        listaDeFilmes.add(filmeTres);
        listaDeFilmes.add(filmeDois);
        listaDeFilmes.add(filmeUm);
        System.out.println("Tamanho da lista: " + listaDeFilmes.size());
        System.out.println(listaDeFilmes.get(0).toString());






    }
}