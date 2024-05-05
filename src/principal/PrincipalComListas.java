package principal;

import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.screenmatch.modelos.Titulo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class PrincipalComListas {
    public static void main(String[] args) {
        Filme filme1 = new Filme("Piratas do Caribe", 1970);
        filme1.avalia(9);
        Filme filme2 = new Filme("Avatar", 2006);
        filme2.avalia(10);
        var filmeDoFlavio = new Filme("Tranformens", 2008);
        filmeDoFlavio.avalia(10);
        Serie breakingBad = new Serie("Breaking Bad", 2005);
        breakingBad.avalia(9);

        ArrayList<Titulo> lista = new ArrayList<>();
        lista.add(filmeDoFlavio);
        lista.add(filme2);
        lista.add(filme1);
        lista.add(breakingBad);

        for (Titulo item: lista){
            System.out.println(item.getNome());
            if (item instanceof Filme filme && filme.getClassificacao() > 2){
                System.out.println("Classificação: " + filme.getClassificacao());
            }
        }

        ArrayList<String> buscaPorArtistas = new ArrayList<>();
        buscaPorArtistas.add("Adam Sandler");
        buscaPorArtistas.add("Paulo");
        buscaPorArtistas.add("Jaqueline");
        System.out.println(buscaPorArtistas);

        Collections.sort(buscaPorArtistas);
        System.out.println("Depois de ordenar: ");
        System.out.println(buscaPorArtistas);
        System.out.println("Lista de titulos depois de ordenar: ");
        Collections.sort(lista);
        System.out.println(lista);
        lista.sort(Comparator.comparing(Titulo::getAnoLancamento));
        System.out.println("Ordenando por ano: ");
        System.out.println(lista);



    }
}
