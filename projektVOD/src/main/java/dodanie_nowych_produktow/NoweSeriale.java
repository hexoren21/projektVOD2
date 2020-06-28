package dodanie_nowych_produktow;

import produkty.Odcinek;
import produkty.ProdukGlowny;
import produkty.Serial;
import produkty.Sezon;

import java.util.*;

import static dodanie_nowych_produktow.NoweFilmy.ustawHTML;

public class NoweSeriale {
    private List<ProdukGlowny> lista_seriali;
    public NoweSeriale(){
        dodajSerial();
    }

    public List<ProdukGlowny> getLista_seriali() {
        return lista_seriali;
    }

    public void setLista_seriali(List<ProdukGlowny> lista_seriali) {
        this.lista_seriali = lista_seriali;
    }

    private void dodajSerial() {
        String opis1;
        String opis2;
        Serial serial1, serial2;

        // -----------------produkt Glowny---------------------
        serial1 = new Serial();
        serial1.setTytul("Gra o tron");
        serial1.setCzas_trwania("(58 min)");
        opis1 = "Adaptacja sagi George'a R.R. Martina. W królestwie Westeros walka o władzę, spiski oraz zbrodnie są na porządku dziennym.";
        serial1.setOpis(ustawHTML(400,opis1));
        serial1.setData_produkcji("2011 - 2019");
        serial1.setZdjecie_sciezka("zdjecia/gra_o_tron.jpg");
        serial1.setOcena_uzytkownika(8.9);
        serial1.setCena(15.00);
        serial1.setStatystyka_ogladalnosci(3000000);
        Queue<String> kraje = new ArrayDeque<>();
        kraje.add("USA");
        kraje.add("Wielka Brytania");
        serial1.setKraje_produkcji(kraje);
        // wartosci serialu
        serial1.setGatunek("Dramat");
        Queue<String> aktorzy1 = new ArrayDeque<>();
        aktorzy1.add("Lena Headey");
        aktorzy1.add("Peter Dinklage");
        serial1.setLista_aktorow(aktorzy1);
        // wartosc sezonu
        Sezon sezon = new Sezon();
        List<Odcinek> listaOdcinkow = new ArrayList<>();
        Odcinek odcinek = new Odcinek();
        odcinek.setNazwa("Winter Is Coming");
        odcinek.setDataPremiery("18.04.2011");
        listaOdcinkow.add(odcinek);
        odcinek = new Odcinek();
        odcinek.setNazwa("The Kingsroad");
        odcinek.setDataPremiery("25.04.2011");
        listaOdcinkow.add(odcinek);
        sezon.setOdciniki(listaOdcinkow);

        odcinek = new Odcinek();
        odcinek.setNazwa("Lord Snow");
        odcinek.setDataPremiery("2.05.2011");
        listaOdcinkow.add(odcinek);
        sezon.setOdciniki(listaOdcinkow);

        odcinek = new Odcinek();
        odcinek.setNazwa("Cripples, Bastards, and Broken Things");
        odcinek.setDataPremiery("9.05.2011");
        listaOdcinkow.add(odcinek);
        sezon.setOdciniki(listaOdcinkow);

        odcinek = new Odcinek();
        odcinek.setNazwa("The Wolf and the Lion");
        odcinek.setDataPremiery("16.05.2011");
        listaOdcinkow.add(odcinek);
        sezon.setOdciniki(listaOdcinkow);

        odcinek = new Odcinek();
        odcinek.setNazwa("A Golden Crown");
        odcinek.setDataPremiery("23.05.2011");
        listaOdcinkow.add(odcinek);
        sezon.setOdciniki(listaOdcinkow);

        odcinek = new Odcinek();
        odcinek.setNazwa("You Win or You Die");
        odcinek.setDataPremiery("30.05.2011");
        listaOdcinkow.add(odcinek);
        sezon.setOdciniki(listaOdcinkow);

        odcinek = new Odcinek();
        odcinek.setNazwa("The Pointy End");
        odcinek.setDataPremiery("6.06.2011");
        listaOdcinkow.add(odcinek);
        sezon.setOdciniki(listaOdcinkow);

        odcinek = new Odcinek();
        odcinek.setNazwa("Baelor");
        odcinek.setDataPremiery("13.06.2011");
        listaOdcinkow.add(odcinek);
        sezon.setOdciniki(listaOdcinkow);

        odcinek = new Odcinek();
        odcinek.setNazwa("Fire and Blood");
        odcinek.setDataPremiery("20.06.2011");
        listaOdcinkow.add(odcinek);
        sezon.setOdciniki(listaOdcinkow);

        Sezon sezon2 = new Sezon();
        listaOdcinkow = new ArrayList<>();
        odcinek = new Odcinek();
        odcinek.setNazwa("The North Remembers");
        odcinek.setDataPremiery("2.04.2012");
        listaOdcinkow.add(odcinek);
        odcinek = new Odcinek();
        odcinek.setNazwa("The Night Lands");
        odcinek.setDataPremiery("9.04.2012");
        listaOdcinkow.add(odcinek);
        sezon2.setOdciniki(listaOdcinkow);

        odcinek = new Odcinek();
        odcinek.setNazwa("What Is Dead May Never Die");
        odcinek.setDataPremiery("16.04.2012");
        listaOdcinkow.add(odcinek);
        sezon2.setOdciniki(listaOdcinkow);

        odcinek = new Odcinek();
        odcinek.setNazwa("Garden of Bones");
        odcinek.setDataPremiery("23.04.2012");
        listaOdcinkow.add(odcinek);
        sezon2.setOdciniki(listaOdcinkow);

        odcinek = new Odcinek();
        odcinek.setNazwa("The Ghost of Harrenhal");
        odcinek.setDataPremiery("30.04.2012");
        listaOdcinkow.add(odcinek);
        sezon2.setOdciniki(listaOdcinkow);

        odcinek = new Odcinek();
        odcinek.setNazwa("The Old Gods and the New");
        odcinek.setDataPremiery("7.05.2012");
        listaOdcinkow.add(odcinek);
        sezon2.setOdciniki(listaOdcinkow);

        odcinek = new Odcinek();
        odcinek.setNazwa("A Man Without Honor");
        odcinek.setDataPremiery("14.05.2012");
        listaOdcinkow.add(odcinek);
        sezon2.setOdciniki(listaOdcinkow);

        odcinek = new Odcinek();
        odcinek.setNazwa("The Prince of Winterfell");
        odcinek.setDataPremiery("21.05.2012");
        listaOdcinkow.add(odcinek);
        sezon2.setOdciniki(listaOdcinkow);

        odcinek = new Odcinek();
        odcinek.setNazwa("Blackwater");
        odcinek.setDataPremiery("28.05.2012");
        listaOdcinkow.add(odcinek);
        sezon2.setOdciniki(listaOdcinkow);

        odcinek = new Odcinek();
        odcinek.setNazwa("Valar Morghulis");
        odcinek.setDataPremiery("4.06.2012");
        listaOdcinkow.add(odcinek);
        sezon2.setOdciniki(listaOdcinkow);


        // dodanie sezonow
        List<Sezon> listaSezonow = new ArrayList<>();
        listaSezonow.add(sezon);
        listaSezonow.add(sezon2);
        serial1.setLista_sezonow(listaSezonow);

        // -----------------produkt Glowny---------------------
        serial2 = new Serial();
        serial2.setTytul("Przyjaciele");
        serial2.setCzas_trwania("(22 min)");
        opis2 = "Losy szóstki przyjaciół, którzy mieszkają i pracują w Nowym Jorku.";
        serial2.setOpis(ustawHTML(400,opis2));
        serial2.setData_produkcji("1994 - 2004");
        serial2.setZdjecie_sciezka("zdjecia/przyjaciele.jpg");
        serial2.setOcena_uzytkownika(8.2);
        serial2.setCena(5.00);
        serial2.setStatystyka_ogladalnosci(288000);
        kraje = new ArrayDeque<>();
        kraje.add("USA");
        serial2.setKraje_produkcji(kraje);
    // wartosci serialu
        serial2.setGatunek("Komedia");
        Queue<String> aktorzy2 = new ArrayDeque<>();
        aktorzy2.add("Jennifer Aniston");
        aktorzy2.add("Courteney Cox");
        serial2.setLista_aktorow(aktorzy2);
        // wartosc sezonu
        sezon = new Sezon();
        listaOdcinkow = new ArrayList<>();
        odcinek = new Odcinek();
        odcinek.setNazwa("Pilot");
        odcinek.setDataPremiery("22.09.1994");
        listaOdcinkow.add(odcinek);

        odcinek = new Odcinek();
        odcinek.setNazwa("The One with the Sonogram at the End");
        odcinek.setDataPremiery("29.09.1994");
        listaOdcinkow.add(odcinek);
        sezon.setOdciniki(listaOdcinkow);

        odcinek = new Odcinek();
        odcinek.setNazwa("The One with the Thumb");
        odcinek.setDataPremiery("6.10.1994");
        listaOdcinkow.add(odcinek);
        sezon.setOdciniki(listaOdcinkow);

        odcinek = new Odcinek();
        odcinek.setNazwa("The One with George Stephanopoulos");
        odcinek.setDataPremiery("13.10.1994");
        listaOdcinkow.add(odcinek);
        sezon.setOdciniki(listaOdcinkow);

        odcinek = new Odcinek();
        odcinek.setNazwa("The One with the East German Laundry Detergent");
        odcinek.setDataPremiery("20.10.1994");
        listaOdcinkow.add(odcinek);
        sezon.setOdciniki(listaOdcinkow);

        odcinek = new Odcinek();
        odcinek.setNazwa("The One with the Butt");
        odcinek.setDataPremiery("27.10.1994");
        listaOdcinkow.add(odcinek);
        sezon.setOdciniki(listaOdcinkow);

        odcinek = new Odcinek();
        odcinek.setNazwa("The One with the Blackout");
        odcinek.setDataPremiery("3.11.1994");
        listaOdcinkow.add(odcinek);
        sezon.setOdciniki(listaOdcinkow);

        odcinek = new Odcinek();
        odcinek.setNazwa("The One Where Nana Dies Twice");
        odcinek.setDataPremiery("10.11.1994");
        listaOdcinkow.add(odcinek);
        sezon.setOdciniki(listaOdcinkow);

        odcinek = new Odcinek();
        odcinek.setNazwa("The One Where Underdog Gets Away");
        odcinek.setDataPremiery("17.11.1994");
        listaOdcinkow.add(odcinek);
        sezon.setOdciniki(listaOdcinkow);

        odcinek = new Odcinek();
        odcinek.setNazwa("The One with the Monkey");
        odcinek.setDataPremiery("15.12.1994");
        listaOdcinkow.add(odcinek);
        sezon.setOdciniki(listaOdcinkow);

        odcinek = new Odcinek();
        odcinek.setNazwa("The One with Mrs. Bing");
        odcinek.setDataPremiery("5.01.1995");
        listaOdcinkow.add(odcinek);
        sezon.setOdciniki(listaOdcinkow);

        odcinek = new Odcinek();
        odcinek.setNazwa("The One with the Blackout");
        odcinek.setDataPremiery("3.11.1994");
        listaOdcinkow.add(odcinek);
        sezon.setOdciniki(listaOdcinkow);

        odcinek = new Odcinek();
        odcinek.setNazwa("The One with the Dozen Lasagnas");
        odcinek.setDataPremiery("12.01.1995");
        listaOdcinkow.add(odcinek);
        sezon.setOdciniki(listaOdcinkow);

        odcinek = new Odcinek();
        odcinek.setNazwa("The One with the Boobies");
        odcinek.setDataPremiery("19.01.1995");
        listaOdcinkow.add(odcinek);
        sezon.setOdciniki(listaOdcinkow);


        sezon2 = new Sezon();
        listaOdcinkow = new ArrayList<>();
        odcinek = new Odcinek();
        odcinek.setNazwa("The One with Ross's New Girlfriend");
        odcinek.setDataPremiery("21.09.1995");
        listaOdcinkow.add(odcinek);

        odcinek = new Odcinek();
        odcinek.setNazwa("The One with the Breast Milk");
        odcinek.setDataPremiery("28.09.1995");
        listaOdcinkow.add(odcinek);
        sezon2.setOdciniki(listaOdcinkow);

        odcinek = new Odcinek();
        odcinek.setNazwa("The One Where Heckles Dies");
        odcinek.setDataPremiery("5.10.1995");
        listaOdcinkow.add(odcinek);
        sezon2.setOdciniki(listaOdcinkow);

        odcinek = new Odcinek();
        odcinek.setNazwa("The One with Phoebe's Husband");
        odcinek.setDataPremiery("12.10.1995");
        listaOdcinkow.add(odcinek);
        sezon2.setOdciniki(listaOdcinkow);

        odcinek = new Odcinek();
        odcinek.setNazwa("The One with Five Steaks and an Eggplant");
        odcinek.setDataPremiery("19.10.1995");
        listaOdcinkow.add(odcinek);
        sezon2.setOdciniki(listaOdcinkow);

        odcinek = new Odcinek();
        odcinek.setNazwa("The One with the Baby on the Bus");
        odcinek.setDataPremiery("2.11.1995");
        listaOdcinkow.add(odcinek);
        sezon2.setOdciniki(listaOdcinkow);

        odcinek = new Odcinek();
        odcinek.setNazwa("The One Where Ross Finds Out");
        odcinek.setDataPremiery("9.11.1995");
        listaOdcinkow.add(odcinek);
        sezon2.setOdciniki(listaOdcinkow);

        odcinek = new Odcinek();
        odcinek.setNazwa("The One with the List");
        odcinek.setDataPremiery("16.11.1995");
        listaOdcinkow.add(odcinek);
        sezon2.setOdciniki(listaOdcinkow);

        odcinek = new Odcinek();
        odcinek.setNazwa("The One with Phoebe's Dad");
        odcinek.setDataPremiery("14.12.1995");
        listaOdcinkow.add(odcinek);
        sezon2.setOdciniki(listaOdcinkow);

        odcinek = new Odcinek();
        odcinek.setNazwa("The One with Russ");
        odcinek.setDataPremiery("4.01.1996");
        listaOdcinkow.add(odcinek);
        sezon2.setOdciniki(listaOdcinkow);
        // dodanie sezonow
        listaSezonow = new ArrayList<>();
        listaSezonow.add(sezon);
        listaSezonow.add(sezon2);
        serial2.setLista_sezonow(listaSezonow);

        this.setLista_seriali(Arrays.asList(serial1, serial2));
    }
}

