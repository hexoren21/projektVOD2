package produkty;

import java.net.URI;
import java.util.ArrayDeque;
import java.util.Queue;

public class Film extends ProdukGlowny {
    private String gatunek;
    private Queue<String> lista_aktorow;
    private Queue<URI> linki_zwiastunow = new ArrayDeque<>();
    private String czas_wielokrotnego_ogladania;
    private int promocja;

    public Film() {
    }


    public int getPromocja() {
        return promocja;
    }

    public void setPromocja(int promocja) {
        this.promocja = promocja;
    }

    public String getGatunek() {
        return gatunek;
    }

    public void setGatunek(String gatunek) {
        this.gatunek = gatunek;
    }

    public Queue<String> getLista_aktorow() {
        return lista_aktorow;
    }

    public void setLista_aktorow(Queue<String> lista_aktorow) {
        this.lista_aktorow = lista_aktorow;
    }

    public Queue<URI> getLinki_zwiastunow() {
        return linki_zwiastunow;
    }

    public void setLinki_zwiastunow(Queue<URI> linki_zwiastunow) {
        this.linki_zwiastunow = linki_zwiastunow;
    }

    public String getCzas_wielokrotnego_ogladania() {
        return czas_wielokrotnego_ogladania;
    }

    public void setCzas_wielokrotnego_ogladania(String czas_wielokrotnego_ogladania) {
        this.czas_wielokrotnego_ogladania = czas_wielokrotnego_ogladania;
    }
}
