package br.com.musicmatchcatalog.principal;

import br.com.musicmatchcatalog.modelos.Musica;
import br.com.musicmatchcatalog.modelos.Podcast;

public class Principal {
    public static void main(String[] args) {

    Musica rock = new Musica();
    rock.setTitulo("Tres Cinco Nove");
    rock.setAlbum("Tres Cinco Nove");
    rock.setArtista("Plad Mod");
    rock.setGenero("Rock Nacional");
    for (int i = 0; i < 1000; i++) {
        rock.curte();
    }


    Podcast novoPodcast = new Podcast();
    novoPodcast.setTitulo("Dev Sem Fronteiras - Ep 3");
    novoPodcast.setHost("Fabricio Emanuel");
    novoPodcast.setDescricao("Sendo Dev na Austrália");
    novoPodcast.setParticipantes("Gabriel Geraldo e Jorge Fontanna");
    for (int i = 0; i < 1000; i++) {
        novoPodcast.curte();
    }
    for (int i = 0; i < 1000; i++) {
        novoPodcast.reproduz();
    }



    }
}
