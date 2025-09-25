package alfo.entities;

import java.time.LocalDate;

public class Concerto extends Evento {
    private genere genere;
    private boolean inStreaming;

    public Concerto() {
    }

    ;

    public Concerto(genere genere, boolean inStreaming) {
        this.genere = genere;
        this.inStreaming = inStreaming;
    }

    public Concerto(String titolo, LocalDate dataEvento, String descrizione, tipoEvento tipoEvento, genere genere, boolean inStreaming) {
        super(titolo, dataEvento, descrizione, tipoEvento);
        this.genere = genere;
        this.inStreaming = inStreaming;
    }


    public genere getGenere() {
        return genere;
    }

    public void setGenere(genere genere) {
        this.genere = genere;
    }

    public boolean isInStreaming() {
        return inStreaming;
    }

    public void setInStreaming(boolean inStreaming) {
        this.inStreaming = inStreaming;
    }


    @Override
    public String toString() {
        return "Concerto{" +
                "genere=" + genere +
                ", inStreaming=" + inStreaming +
                '}';
    }
}
