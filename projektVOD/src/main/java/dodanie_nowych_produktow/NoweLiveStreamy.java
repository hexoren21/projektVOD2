package dodanie_nowych_produktow;

import produkty.LiveStream;
import produkty.ProdukGlowny;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.List;
import java.util.Queue;

import static dodanie_nowych_produktow.NoweFilmy.ustawHTML;

public class NoweLiveStreamy {
    private List<ProdukGlowny> lista_liveStream;
    public NoweLiveStreamy() {dodajLiveStream();}

    public List<ProdukGlowny> getLista_liveStream() {
        return lista_liveStream;
    }

    public void setLista_liveStream(List<ProdukGlowny> lista_liveStream) {
        this.lista_liveStream = lista_liveStream;
    }

    public void dodajLiveStream(){
        String opis1;
        String opis2;
        LiveStream liveStream1, liveStream2;

        // -----------------produkt Glowny---------------------
        liveStream1 = new LiveStream();
        liveStream1.setTytul("Mecz AC Milan vs SSC Napoli");
        liveStream1.setCzas_trwania("(105 min)");
        opis1 = "AC Milan zagra z SSC Napoli w ćwierćfinale Pucharu Włoch." +
                " Oba zespoły spotkały się w sobotę w meczu 21. kolejki Serie A. Na stadionie San Siro padł bezbramkowy remis.";
        liveStream1.setOpis(ustawHTML(400,opis1));
        liveStream1.setData_produkcji("2019");
        liveStream1.setZdjecie_sciezka("zdjecia/live_stream1.jpg");
        liveStream1.setOcena_uzytkownika(9.4);
        liveStream1.setCena(23.00);
        liveStream1.setStatystyka_ogladalnosci(25000);
        Queue<String> kraje = new ArrayDeque<>();
        kraje.add("Włochy");
        liveStream1.setKraje_produkcji(kraje);

        //wartosci LiveStreamu
        liveStream1.setDataWyswietlenia("29.01.19 godz: 20:45");
        liveStream1.setJednorazowa_cena(3.00);
        liveStream1.setPromocja(0);
        //--------------------------===-----------------

        // -----------------produkt Glowny---------------------
        liveStream2 = new LiveStream();
        liveStream2.setTytul("Wprowadzenie do Angular 7");
        liveStream2.setCzas_trwania("(8 h)");
        opis2 = "Zapisz się już dziś na szkolenie Angular 7 - wprowadzenie do frameworka.\n" +
                "\n" +
                "Będzie to 8 godzinne szkolenie, które pomoże ci rozpocząć pracę z tym framworkiem. \n" +
                "\n" +
                "Poznasz TypeScript, uruchomisz projekt i dowiesz się jak pobierać dane z zewnętrznych API. \n" +
                "\n" +
                "Szkolenie jest wprowadzeniem w tematykę, dlatego wystarczy, że wiesz co to jest HTML i JavaScript, masz za sobą próby stworzenia pierwszej strony www lub uczysz się np. Javy, a chciałbyś poznać jakiś frontendowy framework.\n" +
                "\n" +
                "Przez 8 godzin będziemy budować aplikację, która wykorzysta API, będzie posiadać kilka podstron i wykresów, pozwoli na wczytanie plików na serwer i zarządzanie nimi. \n" +
                "\n" +
                "Przejdziemy wspólnie przez:\n" +
                "\n" +
                "- instalację środowiska VSC\n" +
                "\n" +
                "- instalację Node JS\n" +
                "\n" +
                "- instalację Angular/CLI\n" +
                "\n" +
                "- zainstalujemy ciekawe rozszerzenia do VSC\n" +
                "\n" +
                "- rozpoczniemy pracę od wprowadzenia w TypeScript\n" +
                "\n" +
                "- stworzymy pierwszy projekt w Angular i uruchomimy go\n" +
                "\n" +
                "- rozwiniemy aplikację o moduły, dodamy routing, wykorzystamy biblioteki HttpClient\n" +
                "\n" +
                "- podłączymy się do zewnętrznego API\n" +
                "\n" +
                "- zaimplementujemy wykresy Charts.js lub GoogleCharts\n" +
                "\n" +
                "- stworzymy tabelę z paginacją stron oraz filtrowaniem.";
        liveStream2.setOpis(ustawHTML(400, opis2));
        liveStream2.setData_produkcji("2019");
        liveStream2.setZdjecie_sciezka("zdjecia/live_stream2.jpg");
        liveStream2.setOcena_uzytkownika(4.5);
        liveStream2.setCena(13.00);
        liveStream2.setStatystyka_ogladalnosci(450);
        Queue<String> kraje2 = new ArrayDeque<>();
        kraje2.add("Polska");
        liveStream2.setKraje_produkcji(kraje2);

        //wartosci LiveStreamu
        liveStream2.setDataWyswietlenia("4.02.19 godz: 15:00");
        liveStream2.setPromocja(0);
        liveStream2.setJednorazowa_cena(5.00);
        this.setLista_liveStream(Arrays.asList(liveStream1, liveStream2));
    }
}
