package produkty;

import java.util.List;
import java.util.Queue;

public class Serial extends ProdukGlowny{
    private String gatunek;
    private Queue<String> lista_aktorow;
    private List<Sezon> lista_sezonow;
    private int odcinki;
    public Serial() {
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

    public int getOdcinki() {
        return odcinki;
    }

    public void setOdcinki(int odcinki) {
        this.odcinki = odcinki;
    }

    public List<Sezon> getLista_sezonow() {
        return lista_sezonow;
    }

    public void setLista_sezonow(List<Sezon> lista_sezonow) {
        this.lista_sezonow = lista_sezonow;
    }
}
