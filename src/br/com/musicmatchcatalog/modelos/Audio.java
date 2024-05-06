package br.com.musicmatchcatalog.modelos;

public class Audio {
    private String titulo;
    private int duracao;
    private int totalDeReproducoes;
    private int totalDeCurtidas;
    private double classificacao;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getDuracao() {
        return duracao;
    }

    public int getTotalDeReproducoes() {
        return totalDeReproducoes;
    }

    public int getTotalDeCurtidas() {
        return totalDeCurtidas;
    }

    public double getClassificacao() {
        return classificacao;
    }

    public void curte(){
        this.totalDeCurtidas++;
    }

    public void reproduz(){
        this.totalDeReproducoes++;
    }


}
