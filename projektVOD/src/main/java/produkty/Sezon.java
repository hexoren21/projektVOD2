package produkty;

import java.util.List;

public class Sezon {
    private List<Odcinek> odciniki;

    public List<Odcinek> getOdciniki() {
        return odciniki;
    }

    public void setOdciniki(List<Odcinek> odciniki) {
        this.odciniki = odciniki;
    }

    public String zwrocWyswietlanieOdcinkow(){
        if (odciniki.isEmpty()) {
            return "";
        }
        else{
            String wyswietlenie = "<html><body>";
            String nazwaOdcinka = "";
            String dataPremiery = "";
            for (int i = 0; i < odciniki.size(); i++){
                Odcinek odcinek = odciniki.get(i);
                nazwaOdcinka = "<p>" +
                        "<font size=\"8\" face=\"arial\" color=\"black\">\n" +
                        (i+1) + " - " + odcinek.getNazwa() +
                        "</font>" +
                        "</p>";
                dataPremiery = "<p>\n" +
                        "<font size=\"5\" face=\"verdana\" color=\"gray\">\n" +
                        odcinek.getDataPremiery() +
                        "</font>\n" +
                        "</p>\n";
                wyswietlenie = wyswietlenie + nazwaOdcinka + dataPremiery;
            }
            wyswietlenie = wyswietlenie + "</body></html>";
            return wyswietlenie;
        }
    }
}
