package principal;

import br.com.alura.screenmatch.calculo.CalculadoraDeTempo;
import br.com.alura.screenmatch.calculo.FiltroRecomendacao;
import br.com.alura.screenmatch.modelos.Episodio;
import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        Filme filme1 = new Filme("Piratas do Caribe", 1970);
        filme1.setDuracaoEmMinutos(180);
        System.out.println("Duração do filme: " + filme1.getDuracaoEmMinutos());

        filme1.exibeFichaTecnica();
        filme1.avalia(8);
        filme1.avalia(5);
        filme1.avalia(10);
        System.out.println("Total de avaliações: " + filme1.getTotalDeAvaliacao());
        System.out.println(filme1.retornaMedia());
        System.out.println("**************************************");


        Serie breakingBad = new Serie("Breaking Bad", 2005);
        breakingBad.setTemporadas(10);
        breakingBad.setEpisodiosPorTemporada(10);
        breakingBad.setMinutosPorEpisodio(50);
        breakingBad.exibeFichaTecnica();
        System.out.println("Duração para maratonar: " + breakingBad.getDuracaoEmMinutos());

        Filme filme2 = new Filme("Avatar", 2006);
        filme2.setDuracaoEmMinutos(200);

        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(filme1);
        calculadora.inclui(filme2);
        calculadora.inclui(breakingBad);
        System.out.println(calculadora.getTempoTotal());

        FiltroRecomendacao filtro1 = new FiltroRecomendacao();
        filtro1.filtra(filme1);

        Episodio episodio1 = new Episodio();
        episodio1.setNumero(1);
        episodio1.setSerie(breakingBad);
        episodio1.setTotalVisualizacoes(300);
        filtro1.filtra(episodio1);

        var filmeDoFlavio = new Filme("Tranformens", 2008);
        filmeDoFlavio.setDuracaoEmMinutos(200);
        filmeDoFlavio.avalia(10);

        ArrayList<Filme> listaDeFilmes = new ArrayList<>();
        listaDeFilmes.add(filmeDoFlavio);
        listaDeFilmes.add(filme2);
        listaDeFilmes.add(filme1);
        System.out.println("Tamanho da lista: " + listaDeFilmes.size());
        System.out.println("Primeiro filme da lista: " + listaDeFilmes.get(0).getNome());
        System.out.println(listaDeFilmes);


    }
}
