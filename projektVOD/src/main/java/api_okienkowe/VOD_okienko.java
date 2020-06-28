package api_okienkowe;

import account.User;
import dodanie_nowych_produktow.NoweFilmy;
import dodanie_nowych_produktow.NoweLiveStreamy;
import dodanie_nowych_produktow.NoweSeriale;
import produkty.*;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.TableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.net.URI;
import java.util.ArrayDeque;
import java.util.List;
import java.util.Queue;

public class VOD_okienko {
    public JPanel panel1;
    private JButton okButton;
    private JButton nowyButton;
    private JPasswordField PasswordField_oknoLoginu_haslo;
    private JTextField TextField_oknoLoginu_login;
    private JTextField textField3;
    private JPasswordField passwordField1;
    private JButton newButton;
    private JButton cancelButton;
    private JPasswordField passwordField2;
    private JPanel panel_loginu;
    private JPanel panel_rejestracji;
    private JPanel JPanel_pojedynczyFilm;
    private JPanel JPanel_menu;
    private JPanel JPanel_gosc_film;
    private JLabel Label_a_f_tytul;
    private JLabel Label_a_f_czasTrwania;
    private JLabel Label_a_f_opis;
    private JLabel Label_a_f_cena;
    private JPanel JPanel_a_f_hyperlinki;
    private JLabel Label_a_f_zdjecie;
    private JPanel JPanel_wyborFilmu;
    private JButton button_a_w_przod;
    private JButton button_a_w_wstecz;
    private JLabel Label_a_w_zdj1;
    private JLabel Label_a_w_zdj2;
    private JLabel Label_a_w_zdj3;
    private JLabel Label_a_w_tytul1;
    private JLabel Label_a_w_tytul2;
    private JLabel Label_a_w_tytul3;
    private JTextField wyszukajProduktTextField;
    private JButton filmyButton;
    private JButton serialeButton;
    private JButton liveButton;
    private JLabel Label_m_login;
    private JPanel JP_menu_dolny1;
    private JPanel JPanel_menu_gorny;
    private JPanel JPanel_menu_dolny;
    private JButton dodajButton;
    private JButton edytujButton;
    private JButton usunButton;
    private JPanel JP_menu_dolny_admin;
    private JPanel JP_menu_dolny_tabela;
    private JTable tabela_produktow;
    private JLabel Label_a_f_gatunek1;
    private JLabel Label_a_f_dataProdukcji1;
    private JLabel Label_a_f_krajeProdukcji1;
    private JLabel Label_a_f_listaAktorow1;
    private JLabel Label_a_f_cena1;
    private JLabel Label_a_f_czasWielokrotnegoObejrzenia1;
    private JLabel Label_a_f_promocja1;
    private JLabel Label_a_f_ocenaUzytkownika1;
    private JPanel JPanel_admin_film1;
    private JLabel loginLabel;
    private JLabel hasloLabel;
    private JLabel JLabel_linki;
    private JPanel JPanel_a_f_linki;
    private JLabel Label_a_f_czasWielokrotnegoObejrzenia;
    private JLabel Label_a_f_promocja;
    private JLabel JLabel_zwiastun;
    private JPanel JPanel_sezon;
    private JButton wsteczButton;
    private JSpinner spinner1;
    private JScrollPane scrollPane1;
    private JLabel JLabel_odcinek_wyswietl;
    private JLabel Label_a_f_dataProdukcji;
    private JLabel Label_a_f_gatunek;
    private JLabel Label_a_f_listaAktorow;
    private JScrollPane JScrollPane_tabela_produktow;
    private List<ProdukGlowny> produktArrayList;/* = new ArrayList<>();*/
   // private List<Serial> serialArrayList;
//    private List<LiveStream> liveStreamsArrayList;

    public VOD_okienko() {
        JP_menu_dolny_tabela.setLayout(new BoxLayout(JP_menu_dolny_tabela, BoxLayout.Y_AXIS));
        NoweFilmy noweFilmy = new NoweFilmy();
        produktArrayList = noweFilmy.getLista_filmow();
        nowyButton.setVisible(true);//set false;
        TextField_oknoLoginu_login.setEditable(true);
        PasswordField_oknoLoginu_haslo.setEditable(true);
        createTable(produktArrayList);

        cancelButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                panel1.removeAll();
                panel1.add(panel_loginu);
                panel1.repaint();
                panel1.revalidate();
            }
        });
        newButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                panel1.removeAll();
                panel1.add(panel_loginu);
                panel1.repaint();
                panel1.revalidate();
            }
        });
        nowyButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                panel1.removeAll();
                panel1.add(panel_rejestracji);
                panel1.repaint();
                panel1.revalidate();
            }
        });
        okButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //Wstepnie ustawianie loginu i hasla jako gosc na sztywno
                User user = new User();
                user.setUser(TextField_oknoLoginu_login.getText(), String.valueOf(PasswordField_oknoLoginu_haslo.getPassword()));
                if (user.getName().equals("gosc")){
                    if (user.getPassword().equals("gosc")) {
                        Label_m_login.setText("gosc");
                        Label_m_login.setForeground(Color.red);
                        panel1.removeAll();
                        panel1.add(JPanel_menu);
                        panel1.repaint();
                        panel1.revalidate();
                        JP_menu_dolny_admin.setVisible(false);
                    }
                }
            }
        });
        tabela_produktow.addMouseListener(dodaniePrzyciskuTabeli(produktArrayList));

        filmyButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JPanel_menu_dolny.removeAll();
                JPanel_menu_dolny.add(JP_menu_dolny1);
                JPanel_menu_dolny.repaint();
                JPanel_menu_dolny.revalidate();
                NoweFilmy noweFilmy = new NoweFilmy();
                produktArrayList = noweFilmy.getLista_filmow();
                //tabela_produktow.removeAll();
                createTable(produktArrayList);
            }
        });
        serialeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JPanel_menu_dolny.removeAll();
                JPanel_menu_dolny.add(JP_menu_dolny1);
                JPanel_menu_dolny.repaint();
                JPanel_menu_dolny.revalidate();
                NoweSeriale noweSeriale = new NoweSeriale();
                produktArrayList = noweSeriale.getLista_seriali();
                createTable(produktArrayList);
            }
        });
        wsteczButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                JPanel_menu_dolny.removeAll();
                JPanel_menu_dolny.add(JPanel_gosc_film);
                JPanel_menu_dolny.repaint();
                JPanel_menu_dolny.revalidate();
            }
        });


        spinner1.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
               //System.out.println(tabela_produktow.getSelectedRow());
                Serial serial = (Serial) produktArrayList.get(tabela_produktow.getSelectedRow());
                int numerSezonu = Integer.parseInt(spinner1.getValue().toString().substring(6)) - 1;
                Sezon sezon = serial.getLista_sezonow().get(numerSezonu);
                JLabel_odcinek_wyswietl.setText(sezon.zwrocWyswietlanieOdcinkow());

            }
        });
        liveButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JPanel_menu_dolny.removeAll();
                JPanel_menu_dolny.add(JP_menu_dolny1);
                JPanel_menu_dolny.repaint();
                JPanel_menu_dolny.revalidate();
                NoweLiveStreamy noweLiveStreamy = new NoweLiveStreamy();
                produktArrayList = noweLiveStreamy.getLista_liveStream();
                createTable(produktArrayList);
            }
        });
    }

    private List<Film> createTable(List<ProdukGlowny> arrayList) {
        //dodajFilm();
        Object[][] dane = new Object[arrayList.size()][4];
        for (int i = 0; i < arrayList.size(); i++){
            ProdukGlowny produkt = arrayList.get(i);
            dane[i][0] = produkt.getData_produkcji();
            dane[i][1] = produkt.getTytul();
            dane[i][2] = produkt.toStringKraje();
            dane[i][3] = "pokaz";


        }
        Object[] nazwyKolumn = {"Rok", "nazwa", "kraje", "statystyka oglądalnosci"};

        tabela_produktow = new JTable(dane, nazwyKolumn){
            @Override
            public Class<?> getColumnClass(int column) {
                if(convertColumnIndexToModel(column)==3) return String.class;
                return super.getColumnClass(column);
            }
        };
        tabela_produktow.setDefaultRenderer(String.class, new DefaultTableCellRenderer(){
            @Override
            public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
                Component c = super.getTableCellRendererComponent(table,value,isSelected,hasFocus,row,column);
                c.setForeground(((String) value).equals("pokaz") ? Color.BLUE : Color.RED);
                return c;
            }
        });
        //tabela_produktow.setAutoCreateRowSorter(true);
        //do sortowania lecz trzeba zmienic sortowanie po obiektach oraz wysietlanie statystyk ogladalnosci
        tabela_produktow.setPreferredScrollableViewportSize(new Dimension(800, 200));
        tabela_produktow.addMouseListener(dodaniePrzyciskuTabeli(arrayList));
        JScrollPane_tabela_produktow = new JScrollPane(tabela_produktow);// aby były suwaki i nagłówki kolumn!
        JP_menu_dolny_tabela.removeAll();
        JP_menu_dolny_tabela.add(JScrollPane_tabela_produktow);
        JP_menu_dolny_tabela.repaint();
        JP_menu_dolny_tabela.revalidate();
        return null;
    }

    private void hyperlink(JLabel label, URI uri) {
        label.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent me) {
                try {
                    Desktop.getDesktop().browse(uri);
                } catch (Exception ex) {
                    System.out.println(ex);
                }
            }
        });
    }

    private MouseAdapter dodaniePrzyciskuTabeli(List<ProdukGlowny> arrayList){
        MouseAdapter mouseAdapter = new MouseAdapter(){
            @Override
            public void mouseClicked (MouseEvent e){
                super.mouseClicked(e);
                if (tabela_produktow.getSelectedColumn() == 3) {
                    //pokazanie statystyk
                    int row = tabela_produktow.getSelectedRow();
                    int col = tabela_produktow.getSelectedColumn();
                    TableModel komorka = tabela_produktow.getModel();
                    String text = (String) komorka.getValueAt(row, col);
                    if (text.equals("pokaz")) {
                        komorka.setValueAt(Integer.toString(produktArrayList.get(row).getStatystyka_ogladalnosci()) + " zobaczyło", row, col);
                    } else {
                        komorka.setValueAt("pokaz", row, col);
                    }
                } else {
                    if (produktArrayList.get(tabela_produktow.getSelectedRow()) instanceof Film) {
                        Film produkt = (Film) produktArrayList.get(tabela_produktow.getSelectedRow());
                        ustawFilm(produkt);
                    }
                    else if(produktArrayList.get(tabela_produktow.getSelectedRow()) instanceof Serial){
                       Serial produkt = (Serial)produktArrayList.get(tabela_produktow.getSelectedRow());
                       ustawSerial(produkt);
                    }
                   else {
                        LiveStream produkt = (LiveStream) produktArrayList.get(tabela_produktow.getSelectedRow());
                        ustawLiveStream(produkt);
                    }
                }
            }
        };
        return mouseAdapter;
    }
    public void ustawFilm(Film produkt){
        Label_a_f_tytul.setText(produkt.getTytul());
        Label_a_f_czasTrwania.setText(produkt.getCzas_trwania());
        Label_a_f_opis.setText(produkt.getOpis());
        Label_a_f_zdjecie.setText("");
        JLabel_zwiastun.setVisible(true);
        JLabel_zwiastun.removeAll();
        JLabel_zwiastun.setText("zwiastuny");
        JLabel_zwiastun.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
        JLabel_zwiastun.setForeground(Color.black);

        ImageIcon icon1 = new ImageIcon(new ImageIcon(produkt.getZdjecie_sciezka()).getImage().getScaledInstance(300, 300, Image.SCALE_DEFAULT));
        //dodanie linkow do Jpanel_a_f_Linki
        //sprawdz czy wql jest kolejka!
        JPanel_a_f_linki.setLayout(new BoxLayout(JPanel_a_f_linki, BoxLayout.Y_AXIS));
        JPanel_a_f_linki.removeAll();
        if (produkt.getLinki_zwiastunow().size() != 0) {
            JLabel jlabels[] = new JLabel[produkt.getLinki_zwiastunow().size()];
            //tworzymy kopie kolejki
            Queue<URI> linki = new ArrayDeque<>(produkt.getLinki_zwiastunow());
            for (int i = 0; i < jlabels.length; i++) {
                URI uri = linki.remove();
                jlabels[i] = new JLabel();
                jlabels[i].setText("<html> <a href=\"\">" + "link " + (i + 1) + "</a></html>");
                jlabels[i].setCursor(new Cursor(Cursor.HAND_CURSOR));
                hyperlink(jlabels[i], uri);
                JPanel_a_f_linki.add(jlabels[i]);
            }
        }
        JPanel_a_f_linki.validate();
        JPanel_a_f_linki.repaint();
        Label_a_f_zdjecie.setIcon(icon1);
        Label_a_f_gatunek1.setVisible(true);
        Label_a_f_gatunek.setVisible(true);
        Label_a_f_gatunek1.setText(produkt.getGatunek());
        Label_a_f_dataProdukcji.setText("data produkcji");
        Label_a_f_dataProdukcji1.setText(produkt.getData_produkcji());
        //lista
        String nazwy_krajow = "";
        for (String kraj : produkt.getKraje_produkcji())
            nazwy_krajow = nazwy_krajow + kraj + " ";
        Label_a_f_krajeProdukcji1.setText(new NoweFilmy().ustawHTML(100, nazwy_krajow));
        Label_a_f_listaAktorow.setVisible(true);
        Label_a_f_listaAktorow1.setVisible(true);
        String aktorzy = "";
        for (String aktor : produkt.getLista_aktorow())
            aktorzy = aktorzy + aktor + "<br/>";
        Label_a_f_listaAktorow1.setText("<html>" + aktorzy + "</html>");
        Label_a_f_cena1.setText(Double.toString(produkt.getCena()) + "zl");

        //dla filmu
        Label_a_f_czasWielokrotnegoObejrzenia1.setVisible(true);
        Label_a_f_czasWielokrotnegoObejrzenia.setVisible(true);
        Label_a_f_promocja1.setVisible(true);
        Label_a_f_promocja.setVisible(true);
        Label_a_f_czasWielokrotnegoObejrzenia1.setText(produkt.getCzas_wielokrotnego_ogladania());
        Label_a_f_promocja1.setText(Integer.toString(produkt.getPromocja()));

        Label_a_f_ocenaUzytkownika1.setText(Double.toString(produkt.getOcena_uzytkownika()));
        JPanel_menu_dolny.removeAll();
        JPanel_menu_dolny.add(JPanel_gosc_film);
        JPanel_menu_dolny.repaint();
        JPanel_menu_dolny.revalidate();

    }
    private void ustawSezon(JLabel label, Serial produkt) {
        label.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent me) {
                if (label.getText().equals("sezony")) {
                    try {
                        //zmiana na wyswietlanie sezonow
                        //wyswietlenie ilosci sezonow w spinerze
                        String[] nazwaSezonow;
                        String opisOdcinkow = "";
                        if (!produkt.getLista_sezonow().isEmpty()) {
                            nazwaSezonow = new String[produkt.getLista_sezonow().size()];
                            for (int i = 0; i < produkt.getLista_sezonow().size(); i++)
                                nazwaSezonow[i] = "sezon " + (i + 1);
                            Sezon sezon = produkt.getLista_sezonow().get(0);
                            opisOdcinkow = sezon.zwrocWyswietlanieOdcinkow();
                        }
                        else {
                            nazwaSezonow = new String[1];
                            nazwaSezonow[0] = "brak sezonow";
                        }
                        SpinnerListModel spinnerListModel = new SpinnerListModel(nazwaSezonow);
                        spinner1.setModel(spinnerListModel);
                        JLabel_odcinek_wyswietl.setText(opisOdcinkow);

                        JPanel_menu_dolny.removeAll();
                        JPanel_menu_dolny.add(JPanel_sezon);
                        JPanel_menu_dolny.repaint();
                        JPanel_menu_dolny.revalidate();
                    } catch (Exception ex) {
                        System.out.println(ex);
                    }
                }
            }
        });
    }
    public void ustawSerial(Serial produkt){
        Label_a_f_tytul.setText(produkt.getTytul());
        Label_a_f_czasTrwania.setText(produkt.getCzas_trwania());
        Label_a_f_opis.setText(produkt.getOpis());
        Label_a_f_zdjecie.setText("");
        ImageIcon icon1 = new ImageIcon(new ImageIcon(produkt.getZdjecie_sciezka()).getImage().getScaledInstance(300, 300, Image.SCALE_DEFAULT));
        //dodanie linkow do Jpanel_a_f_Linki
        //sprawdz czy wql jest kolejka!
        JPanel_a_f_linki.setLayout(new BoxLayout(JPanel_a_f_linki, BoxLayout.X_AXIS));
        JPanel_a_f_linki.removeAll();

        //przycisk sezony
        JLabel_zwiastun.setVisible(true);
        JLabel_zwiastun.setText("sezony");
        JLabel_zwiastun.setForeground(Color.blue);
        JLabel_zwiastun.setCursor(new Cursor(Cursor.HAND_CURSOR));
        ustawSezon(JLabel_zwiastun, produkt);
        JPanel_a_f_linki.validate();
        JPanel_a_f_linki.repaint();
        Label_a_f_zdjecie.setIcon(icon1);
        Label_a_f_gatunek1.setVisible(true);
        Label_a_f_gatunek.setVisible(true);
        Label_a_f_gatunek1.setText(produkt.getGatunek());
        Label_a_f_dataProdukcji.setText("data produkcji");
        Label_a_f_dataProdukcji1.setText(produkt.getData_produkcji());
        //lista
        String nazwy_krajow = "";
        for (String kraj : produkt.getKraje_produkcji())
            nazwy_krajow = nazwy_krajow + kraj + " ";
        Label_a_f_krajeProdukcji1.setText(new NoweFilmy().ustawHTML(100, nazwy_krajow));
        Label_a_f_listaAktorow.setVisible(true);
        Label_a_f_listaAktorow1.setVisible(true);
        String aktorzy = "";
        for (String aktor : produkt.getLista_aktorow())
            aktorzy = aktorzy + aktor + "<br/>";
        Label_a_f_listaAktorow1.setText("<html>" + aktorzy + "</html>");
        Label_a_f_cena1.setText(Double.toString(produkt.getCena()) + "zl");

        //dla Serialu

        Label_a_f_czasWielokrotnegoObejrzenia1.setVisible(false);
        Label_a_f_czasWielokrotnegoObejrzenia.setVisible(false);
        Label_a_f_promocja1.setVisible(false);
        Label_a_f_promocja.setVisible(false);

        Label_a_f_ocenaUzytkownika1.setText(Double.toString(produkt.getOcena_uzytkownika()));
        JPanel_menu_dolny.removeAll();
        JPanel_menu_dolny.add(JPanel_gosc_film);
        JPanel_menu_dolny.repaint();
        JPanel_menu_dolny.revalidate();

    }
    public void ustawLiveStream(LiveStream produkt){
        Label_a_f_tytul.setText(produkt.getTytul());
        Label_a_f_czasTrwania.setText(produkt.getCzas_trwania());
        Label_a_f_opis.setText(produkt.getOpis());
        Label_a_f_zdjecie.setText("");
        ImageIcon icon1 = new ImageIcon(new ImageIcon(produkt.getZdjecie_sciezka()).getImage().getScaledInstance(300, 300, Image.SCALE_DEFAULT));
        //dodanie linkow do Jpanel_a_f_Linki
        //sprawdz czy wql jest kolejka!
        JPanel_a_f_linki.setLayout(new BoxLayout(JPanel_a_f_linki, BoxLayout.X_AXIS));
        JPanel_a_f_linki.removeAll();

        //przycisk sezony
        JLabel_zwiastun.setVisible(false);

        JPanel_a_f_linki.validate();
        JPanel_a_f_linki.repaint();
        Label_a_f_zdjecie.setIcon(icon1);
        Label_a_f_gatunek1.setVisible(false);
        Label_a_f_gatunek.setVisible(false);
        Label_a_f_dataProdukcji.setText("data wyswietlenia");
        Label_a_f_dataProdukcji1.setText(produkt.getDataWyswietlenia());
        //lista
        String nazwy_krajow = "";
        for (String kraj : produkt.getKraje_produkcji())
            nazwy_krajow = nazwy_krajow + kraj + " ";
        Label_a_f_krajeProdukcji1.setText(new NoweFilmy().ustawHTML(100, nazwy_krajow));
        Label_a_f_listaAktorow.setVisible(false);
        Label_a_f_listaAktorow1.setVisible(false);
        Label_a_f_cena1.setText(Double.toString(produkt.getCena()) + "zl");

        //dla LiveStreamu

        Label_a_f_czasWielokrotnegoObejrzenia1.setVisible(false);
        Label_a_f_czasWielokrotnegoObejrzenia.setVisible(false);
        Label_a_f_promocja1.setVisible(true);
        Label_a_f_promocja.setVisible(true);

        Label_a_f_ocenaUzytkownika1.setText(Double.toString(produkt.getOcena_uzytkownika()));
        JPanel_menu_dolny.removeAll();
        JPanel_menu_dolny.add(JPanel_gosc_film);
        JPanel_menu_dolny.repaint();
        JPanel_menu_dolny.revalidate();

    }
    private void createUIComponents() {
        // TODO: place custom component creation code here


        loginLabel =  new JLabel();
        loginLabel.setFont(new Font("Serif", Font.PLAIN, 30));

        hasloLabel = new JLabel();
        hasloLabel.setFont(new Font("Serif", Font.PLAIN, 30));

        TextField_oknoLoginu_login = new JTextField();
        TextField_oknoLoginu_login.setFont(new Font("Serif", Font.PLAIN, 30));

        PasswordField_oknoLoginu_haslo = new JPasswordField();
        PasswordField_oknoLoginu_haslo.setFont(new Font("Serif", Font.PLAIN, 30));
        Label_a_f_tytul = new JLabel();
        Label_a_f_tytul.setFont(new Font("Serif", Font.ITALIC, 50));

        scrollPane1 = new JScrollPane(JLabel_odcinek_wyswietl, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);

    }
}
