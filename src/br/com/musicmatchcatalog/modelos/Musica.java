package br.com.musicmatchcatalog.modelos;

public class Musica extends Audio{
    private String album;
    private String artista;
    private String genero;

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    @Override
    public double getClassificacao() {
        if (this.getTotalDeCurtidas() > 500){
            return 10;
        } else {
            return 8;
        }
    }

    public void exibirInfoMusica(){
        System.out.println("Album: " + this.getArtista());
        System.out.println("Artista: " + this.getArtista());
        System.out.println("Genero: " + this.getGenero());
        System.out.println("Curtidas: " + this.getTotalDeCurtidas());
    }
}
