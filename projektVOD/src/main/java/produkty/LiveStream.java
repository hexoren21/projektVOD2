package produkty;

public class LiveStream extends ProdukGlowny {

    private double jednorazowa_cena;
    private int promocja;
    private String dataWyswietlenia;
    public LiveStream() {
    }

    public String getDataWyswietlenia() {
        return dataWyswietlenia;
    }

    public void setDataWyswietlenia(String dataWyswietlenia) {
        this.dataWyswietlenia = dataWyswietlenia;
    }

    public double getJednorazowa_cena() {
        return jednorazowa_cena;
    }

    public void setJednorazowa_cena(double jednorazowa_cena) {
        this.jednorazowa_cena = jednorazowa_cena;
    }

    public int getPromocja() {
        return promocja;
    }

    public void setPromocja(int promocja) {
        this.promocja = promocja;
    }
}
