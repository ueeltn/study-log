package br.com.alura.screematch.modelos;

public class Serie extends Titulo{
    private int temporadas;
    private boolean ativa;
    private int epsodiodPorTemporada;
    private int minutosPorEpisodios;

    public int getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }

    public boolean isAtiva() {
        return ativa;
    }

    public void setAtiva(boolean ativa) {
        this.ativa = ativa;
    }

    public int getEpsodiodPorTemporada() {
        return epsodiodPorTemporada;
    }

    public void setEpsodiodPorTemporada(int epsodiodPorTemporada) {
        this.epsodiodPorTemporada = epsodiodPorTemporada;
    }

    public int getMinutosPorEpisodios() {
        return minutosPorEpisodios;
    }

    public void setMinutosPorEpisodios(int minutosPorEpisodios) {
        this.minutosPorEpisodios = minutosPorEpisodios;
    }

    @Override
    public int getDuracaoEmMinutos() {
        return temporadas * epsodiodPorTemporada * minutosPorEpisodios;
    }
}
