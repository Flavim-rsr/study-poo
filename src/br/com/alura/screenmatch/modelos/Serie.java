package br.com.alura.screenmatch.modelos;

public class Serie extends Titulo{
    private int temporadas, episodiosPorTemporada, minutosPorEpisodio;
    private boolean ativa;

    public Serie(String nome, int anoLancamento) {
        super(nome, anoLancamento);
    }

    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }

    public void setEpisodiosPorTemporada(int episodiosPorTemporada) {
        this.episodiosPorTemporada = episodiosPorTemporada;
    }

    public void setMinutosPorEpisodio(int minutosPorEpisodio) {
        this.minutosPorEpisodio = minutosPorEpisodio;
    }

    public void setAtiva(boolean ativa) {
        this.ativa = ativa;
    }

    public int getTemporadas() {
        return temporadas;
    }

    public int getEpisodiosPorTemporada() {
        return episodiosPorTemporada;
    }

    public int getMinutosPorEpisodio() {
        return minutosPorEpisodio;
    }

    public boolean getAtiva() {
        return ativa;
    }

    @Override
    public int getDuracaoEmMinutos() {
        return temporadas * episodiosPorTemporada * minutosPorEpisodio;
    }

    @Override
    public  String toString(){
        return "Serie: " + this.getNome() + " (" + this.getAnoLancamento() + ")";
    }


}
