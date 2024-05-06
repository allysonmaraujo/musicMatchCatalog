package br.com.musicmatchcatalog.modelos;

public class Preferidas {
    public void inclui(Audio audio){
        if(audio.getClassificacao() > 8){
            System.out.println(audio.getTitulo() + " é considerado sucesso absoluto");
        } else {
            System.out.println(audio.getTitulo() + " todos estão curtindo no momento");
        }
    }
}
