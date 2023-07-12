package screenmatch.principal;

import screenmatch.modelos.Filme;
import screenmatch.modelos.Serie;
import screenmatch.modelos.Titulo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class PrincipalComListas {
    public static void main(String[] args) {
        Filme filmeUm = new Filme("O rei leão", 1994);
        filmeUm.avaliaFilme(9);
        Serie minhaSerie = new Serie("Game of Thrones", 2011);
        Filme filmeDois = new Filme("O rei leão 2", 1998);
        Filme filmeTres = new Filme("Irmão urso", 2003);

        ArrayList<Titulo> list = new ArrayList<>();
        list.add(filmeTres);
        list.add(filmeDois);
        list.add(filmeUm);
        list.add(minhaSerie);
        for (Titulo item: list) {
            System.out.println(item.getNome());
            if(item instanceof Filme filme){
                System.out.println("Classificação: " + filme.getClassificacao());
            }
        }

        List<String> buscaPorArtista = new ArrayList<>();
        buscaPorArtista.add("Adam Sandler");
        buscaPorArtista.add("Paulo");
        buscaPorArtista.add("JaccqueLine");
        System.out.println(buscaPorArtista);

        Collections.sort(buscaPorArtista);
        System.out.println("Depois da ordenação: " + buscaPorArtista);
        ;
        System.out.println("Lista de titulos ordenados: ");
        Collections.sort(list);
        System.out.println(list);

        list.sort(Comparator.comparing(Titulo::getAnoLancamento));
        System.out.println("Ordenando pelo ano de lançamento: " + list);
    }
}
