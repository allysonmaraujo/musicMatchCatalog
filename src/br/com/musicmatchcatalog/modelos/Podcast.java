package br.com.musicmatchcatalog.modelos;

public class Podcast extends Audio{
    private String host;
    private String participantes;
    private String descricao;

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public String getParticipantes() {
        return participantes;
    }

    public void setParticipantes(String participantes) {
        this.participantes = participantes;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public double getClassificacao() {
       if (this.getClassificacao() > 1000){
           return 10;
       } else {
           return 6;
       }
    }
}


