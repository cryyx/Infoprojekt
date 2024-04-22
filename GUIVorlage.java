import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.JMenuBar;

/**
 * Eine GUI fuer die Schulverwaltung
 *
 * @version 1.0 
 * @author bpunkta
 */

public class GUIVorlage extends JFrame {
    // Anfang Attribute
    private Verwaltung schule;
    private int m=1;
    private JLabel l_start = new JLabel();
    private JLabel l_optionen = new JLabel();
    private JLabel l_suchen1 = new JLabel();
    private JLabel l_suchen2 = new JLabel();
    private JLabel l_su_all = new JLabel();
    private JLabel l_einfuegen = new JLabel();
    private JLabel l_einfuegen2 = new JLabel();
    private JLabel l_ein_spieler1 = new JLabel();
    private JLabel l_ein_spieler2 = new JLabel();
    private JLabel l_ein_spieler3 = new JLabel();
    private JLabel l_ein_spieler4 = new JLabel();
    private JLabel l_ein_spieler5 = new JLabel();
    private JLabel l_ein_spieler6 = new JLabel();
    private JLabel l_ein_spieler7 = new JLabel();
    private JLabel l_ein_spieler8 = new JLabel();
    private JLabel l_ein_spieler9 = new JLabel();
    private JLabel l_ein_spieler10 = new JLabel();
    private JLabel l_loeschen = new JLabel();
    private JLabel l_loeschen2 = new JLabel();
    private JLabel l_loeschen3 = new JLabel();
    private JLabel l_loeschen4 = new JLabel();
    private JLabel l_loeschen5 = new JLabel();
    private JLabel l_loeschen6 = new JLabel();
    private JLabel l_aendern1 = new JLabel();
    private JLabel l_aendern2 = new JLabel();
    private JLabel l_aendern3 = new JLabel();
    private JLabel l_aendern4 = new JLabel();
    private JLabel l_aendern5 = new JLabel();
    private JLabel l_aendern6 = new JLabel();
    private JLabel l_aendern7 = new JLabel();
    private JLabel l_aendern8 = new JLabel();
    private JLabel l_aendern9 = new JLabel();
    private JLabel l_aendern10 = new JLabel();
    private JLabel l_aendern11 = new JLabel();
    private JLabel l_aendern12 = new JLabel();
    private JLabel l_aendern13 = new JLabel();
    private JLabel l_aendern14 = new JLabel();
    private JLabel l_aendern15 = new JLabel();
    
    
    
    private JTextField t_name = new JTextField();
    private JTextField t_ein_spieler1 = new JTextField();
    private JTextField t_ein_spieler2 = new JTextField();
    private JTextField t_ein_spieler3 = new JTextField();
    private JTextField t_ein_spieler4 = new JTextField();
    private JTextField t_ein_spieler5 = new JTextField();
    private JTextField t_ein_spieler6 = new JTextField();
    private JTextField t_ein_spieler7 = new JTextField();
    private JTextField t_ein_spieler8 = new JTextField();
    private JTextField t_ein_spieler9 = new JTextField();
    private JTextField t_ein_spieler10 = new JTextField();
    private JTextField t_loeschen1 = new JTextField();
    private JTextField t_loeschen2 = new JTextField();
    private JTextField t_aendern1 = new JTextField();
    private JTextField t_aendern2 = new JTextField();
    private JTextField t_aendern3 = new JTextField();
    private JTextField t_aendern4 = new JTextField();
    private JTextField t_aendern5 = new JTextField();
    private JTextField t_aendern6 = new JTextField();
    private JTextField t_aendern7 = new JTextField();
    private JTextField t_aendern8 = new JTextField();
    private JTextField t_aendern9 = new JTextField();
    private JTextField t_aendern10 = new JTextField();
    private JTextField t_aendern11 = new JTextField();
    private JTextField t_aendern12 = new JTextField();
    
    
    private JButton b_start = new JButton();
    private JButton b_name = new JButton();
    private JButton b_suchen = new JButton();   
    private JButton b_einfuegen = new JButton();
    private JButton b_loeschen = new JButton();
    private JButton b_aendern = new JButton();
    private JButton b_all_suche = new JButton();
    private JButton b_erw_suche = new JButton();
    private JButton b_spe_suche = new JButton();
    private JButton b_su_all1 = new JButton();
    private JButton b_su_all2 = new JButton();
    private JButton b_su_all3 = new JButton();
    private JButton b_su_all4 = new JButton();
    private JButton b_ein_spieler = new JButton();
    private JButton b_ein_verein = new JButton();
    private JButton b_ein_sportart = new JButton();
    private JButton b_ein_trainer = new JButton();
    private JButton b_ver_verein = new JButton();
    private JButton b_ver_vereinges = new JButton();
    private JButton b_ein_spieler9 = new JButton();
    private JButton b_ein_spieler10 = new JButton();
    private JButton b_ein_spielerges = new JButton();
    private JButton b_ein_vereinges = new JButton();
    private JButton b_ein_verein_sportart = new JButton();
    private JButton b_ein_sportartges = new JButton();
    private JButton b_ein_trainerges = new JButton();
    private JButton b_loeschen_bestaetigen = new JButton();
    private JButton b_aendern_bestaetigen = new JButton();
    private JButton b_aendern1 = new JButton();
    private JButton b_aendern2 = new JButton();
    private JButton b_aendern3 = new JButton();
    private JButton b_aendern4 = new JButton();
    private JButton b_aendern5 = new JButton();
    private JButton b_aendern6 = new JButton();
    private JButton b_aendern7 = new JButton();
    private JButton b_aendern8 = new JButton();
    private JButton b_aendern9 = new JButton();
    private JButton b_aendern10 = new JButton();
    
    private JTable ergebnisse;
    private JScrollPane scrollpane;
    
    
    
    
    
    private JButton bMaskeLeeren = new JButton();
    private JTextArea textfeld;
    // Ende Attribute
    
    String[][] arr1=new String[][]{{"1", "2", "3", "4", "5", "6"}, {"1", "2", "3", "4", "5", "6"}, {"1", "2", "3", "4", "5", "6"}, {"1", "2", "3", "4", "5", "6"}, {"1", "2", "3", "4", "5", "6"}, {"1", "2", "3", "4", "5", "6"}};
    String[] arr_spieler=new String[]{"ID", "Vorname", "Name", "Gehalt", "Preis", "Position", "Nationalität", "Verein", "Leihverein", "Gerüchtsverein", "Sportart"};
    String[] arr_trainer=new String[]{"ID", "Vorname", "Name", "Gehalt", "Nationalität", "Verein", "Sportart"};
    String[] arr_verein=new String[]{"ID", "Name", "Budget"};
    String[] arr_sportart=new String[]{"ID", "Name", "Popularität", "Ballgröße"};
    
    
    
    
    private boolean ein_spieler9=true;
    private boolean ein_spieler10=true;
    private boolean aendern1=true;
    private boolean aendern2=true;
    private boolean aendern3=true;
    private boolean aendern4=true;
    private boolean aendern5=true;
    private boolean aendern6=true;
    private boolean aendern7=true;
    private boolean aendern8=true;
    private boolean aendern9=true;
    private boolean aendern10=true;
    private int l=1;
    private int a=1;
    private int z=0;
    private String id;
    private String art;
    
    Container cp;
    
    private Verwaltung v1 = new Verwaltung();
    
    
    
    public GUIVorlage() {

        // Frame-Initialisierung
        super("Transfermarkt deines Vertrauens");
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        int frameWidth = 1000; 
        int frameHeight = 800;
        setSize(frameWidth, frameHeight);
        Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
        int x = (d.width - getSize().width) / 2;
        int y = (d.height - getSize().height) / 2;
        setLocation(x, y);
        cp = getContentPane();
        cp.setLayout(null);

        //Verwaltung/Datenbank
        schule=new Verwaltung();
        
        JMenuBar menu_Bar = new JMenuBar();
    
        JMenu menu = new JMenu("Optionen");
        JMenuItem zurueck = new JMenuItem("zurück");
        
        menu.setMnemonic(KeyEvent.VK_A);
        menu.getAccessibleContext().setAccessibleDescription("The only menu in this program that has menu items");
        menu_Bar.add(menu);
        menu.add(zurueck);
        setJMenuBar(menu_Bar);
        

        
        
        
        
        zurueck.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent evt) {
                    zurueck_ActionPerformed(evt);
                }
            });
        
        // /* Erzeugung eines neuen Menü-Dialoges (EXPERIMENTELL) */
        // JDialog meinJDialog = new JDialog();
        // meinJDialog.setTitle("Schulverwaltung - Menü");
        // // Wir setzen die Breite auf 600 und die Höhe 600 Pixel
        // meinJDialog.setSize(600,600);
        // // Zur Veranschaulichung erstellen wir hier eine Border
        // Border bo = new LineBorder(Color.black);
        // // Erstellung einer Menüleiste
        // JMenuBar bar = new JMenuBar();
        // // Wir setzen unsere Umrandung für unsere JMenuBar
        // bar.setBorder(bo);
        // // Erzeugung eines Objektes der Klasse JMenu
        // JMenu menu = new JMenu("Schüler einfügen");
        // // Menü wird der Menüleiste hinzugefügt
        // bar.add(menu);
        // // JMenu menu2 = new JMenu("Lehrer einfügen");
        // // // Menü wird der Menüleiste hinzugefügt
        // // bar.add(menu2);
        // // menu2.addActionListener(new ActionListener() {
        // // public void actionPerformed(ActionEvent evt) {
        // // menu2_ActionPerformed(evt);
        // // }
        // // });
        // // JMenu menu3 = new JMenu("Kurs anlegen");
        // // // Menü wird der Menüleiste hinzugefügt
        // // bar.add(menu3);
        // // JMenu menu4 = new JMenu("Kurs zuweisen");
        // // // Menü wird der Menüleiste hinzugefügt
        // // bar.add(menu4);
        // // JMenu menu5 = new JMenu("Kursinfo");
        // // // Menü wird der Menüleiste hinzugefügt
        // // bar.add(menu5);
        // // Menüleiste wird für den Dialog gesetzt
        // meinJDialog.setJMenuBar(bar);
        // // Wir lassen unseren Dialog anzeigen
        // meinJDialog.setVisible(true);

        // Anfang Komponenten
        
         // JTextArea textfeld = new JTextArea(5, 30);
         // textfeld.setText("Lorem ipsum dolor sit amet");
        // //Zeilenumbruch wird eingeschaltet
        // textfeld.setLineWrap(true);
        // //Zeilenumbrüche erfolgen nur nach ganzen Wörtern
        // textfeld.setWrapStyleWord(true);
        
        
        
        
        
        // //Ein JScrollPane, der das Textfeld beinhaltet, wird erzeugt
        // JScrollPane scrollpane = new JScrollPane(textfeld); 
        // cp.add(scrollpane);
        // cp.add(textfeld);
        // textfeld.paste();
        
        
        
        
        
        
        l_start.setBounds(200, 10, 800, 23);
        l_start.setText("Willkommen in unserer Transfermarkt-Datenbank");
        l_start.setFont(new Font("Arial", Font.PLAIN, 17));
        cp.add(l_start);
        
        l_optionen.setBounds(150, 10, 800, 23);
        l_optionen.setFont(new Font("Arial", Font.PLAIN, 17));
        
        
        
        l_suchen1.setBounds(200, 10, 800, 23);
        l_suchen1.setText("Wir bieten in unserer Datenbank verschiedene Such-Optionen an!");
        l_suchen1.setFont(new Font("Arial", Font.PLAIN, 17));
        
        l_suchen2.setBounds(200, 25, 800, 23);
        l_suchen2.setText("Bitte entscheide dich für eine der drei unten stehenden Arten:");
        l_suchen2.setFont(new Font("Arial", Font.PLAIN, 17));
        
        l_su_all.setBounds(200, 17, 800, 23);
        l_su_all.setText("Wähle die Tabelle aus, die du ausgeben lassen möchtest");
        l_su_all.setFont(new Font("Arial", Font.PLAIN, 17));
        
        l_einfuegen.setBounds(50, 17, 1000, 23);
        l_einfuegen.setText("Du möchtest also etwas neues einfügen bzw. registrieren? Wähle bitte die Art des Objekts aus!");
        l_einfuegen.setFont(new Font("Arial", Font.PLAIN, 17));
        
        l_einfuegen2.setBounds(50, 40, 800, 23);
        l_einfuegen2.setText("Wenn du fertig bist, klicke bitte auf den Knopf 'Einfügen'!");
        l_einfuegen2.setFont(new Font("Arial", Font.PLAIN, 17));
        
        l_ein_spieler1.setBounds(50, 80, 800, 23);
        l_ein_spieler1.setText("Nachname:");
        l_ein_spieler1.setFont(new Font("Arial", Font.PLAIN, 17));
        
        l_ein_spieler2.setBounds(50, 130, 800, 23);
        l_ein_spieler2.setText("Vorname:");
        l_ein_spieler2.setFont(new Font("Arial", Font.PLAIN, 17));
        
        l_ein_spieler3.setBounds(50, 180, 800, 23);
        l_ein_spieler3.setText("Gehalt:");
        l_ein_spieler3.setFont(new Font("Arial", Font.PLAIN, 17));
        
        l_ein_spieler4.setBounds(50, 230, 800, 23);
        l_ein_spieler4.setText("Preis:");
        l_ein_spieler4.setFont(new Font("Arial", Font.PLAIN, 17));
        
        l_ein_spieler5.setBounds(50, 280, 800, 23);
        l_ein_spieler5.setText("Position:");
        l_ein_spieler5.setFont(new Font("Arial", Font.PLAIN, 17));
        
        l_ein_spieler6.setBounds(50, 330, 800, 23);
        l_ein_spieler6.setText("Nationalität:");
        l_ein_spieler6.setFont(new Font("Arial", Font.PLAIN, 17));
        
        l_ein_spieler7.setBounds(50, 380, 800, 23);
        l_ein_spieler7.setText("Verein:");
        l_ein_spieler7.setFont(new Font("Arial", Font.PLAIN, 17));
        
        l_ein_spieler8.setBounds(50, 430, 800, 23);
        l_ein_spieler8.setText("Sportart:");
        l_ein_spieler8.setFont(new Font("Arial", Font.PLAIN, 17));
        
        l_ein_spieler9.setBounds(300, 480, 800, 23);
        l_ein_spieler9.setText("Leihverein:");
        l_ein_spieler9.setFont(new Font("Arial", Font.PLAIN, 17));
        
        l_ein_spieler10.setBounds(300, 530, 800, 23);
        l_ein_spieler10.setText("Gerüchtsverein:");
        l_ein_spieler10.setFont(new Font("Arial", Font.PLAIN, 17));
        
        l_loeschen.setBounds(30, 17, 1000, 23);
        l_loeschen.setText("Herzlich willkommen im Lösch-Menü unserer Datenbank. Ein Warnhinweis vorab: das Löschen deiner Daten ist permanent");
        l_loeschen.setFont(new Font("Arial", Font.PLAIN, 17));
        
        l_loeschen2.setBounds(30, 50, 1000, 23);
        l_loeschen2.setText("und Sie sind nicht wiederherstellbar, überlege es dir also gut! Bist du sicher, dass du fortfahren möchtest?");
        l_loeschen2.setFont(new Font("Arial", Font.PLAIN, 17));
        
        l_loeschen3.setBounds(30, 83, 1000, 23);
        l_loeschen3.setText("");
        l_loeschen3.setFont(new Font("Arial", Font.PLAIN, 17));
        
        l_loeschen4.setBounds(30, 160, 1000, 23);
        l_loeschen4.setText("");
        l_loeschen4.setFont(new Font("Arial", Font.PLAIN, 17));
        
        l_loeschen5.setBounds(30, 280, 1000, 23);
        l_loeschen5.setText("");
        l_loeschen5.setFont(new Font("Arial", Font.PLAIN, 17));
        
        l_loeschen6.setBounds(30, 320, 1000, 23);
        l_loeschen6.setText("");
        l_loeschen6.setFont(new Font("Arial", Font.PLAIN, 17));
        
        l_aendern1.setBounds(30, 17, 1000, 23);
        l_aendern1.setText("Herzlich willkommen in dem Änderungs-Menü unserer Datenbank.");
        l_aendern1.setFont(new Font("Arial", Font.PLAIN, 17));
        
        l_aendern2.setBounds(30, 50, 1000, 23);
        l_aendern2.setText("Sobald ein Datensatz geändert wurde, lässt sich dies allerdings nicht mehr rückgängig machen!");
        l_aendern2.setFont(new Font("Arial", Font.PLAIN, 17));
        
        l_aendern3.setBounds(30, 83, 1000, 23);
        l_aendern3.setText("Bitte gebe erst die Art des Objekts ein, von dem du einen Datensatz ändern möchtest:");
        l_aendern3.setFont(new Font("Arial", Font.PLAIN, 17));
        
        l_aendern4.setBounds(30, 160, 1000, 23);
        l_aendern4.setText("Bitte bestätige die Art des Objekts:");
        l_aendern4.setFont(new Font("Arial", Font.PLAIN, 17));
        
        l_aendern5.setBounds(30, 280, 1000, 23);
        l_aendern5.setText("Deine beiden angegebenen Objektarten stimmen nicht überein! Bitte versuche es erneut.");
        l_aendern5.setFont(new Font("Arial", Font.PLAIN, 17));
        
        l_aendern6.setBounds(300, 120, 800, 23);
        l_aendern6.setText("Nachname:");
        l_aendern6.setFont(new Font("Arial", Font.PLAIN, 17));
        
        l_aendern7.setBounds(300, 170, 800, 23);
        l_aendern7.setText("Vorname:");
        l_aendern7.setFont(new Font("Arial", Font.PLAIN, 17));
        
        l_aendern8.setBounds(300, 220, 800, 23);
        l_aendern8.setText("Gehalt:");
        l_aendern8.setFont(new Font("Arial", Font.PLAIN, 17));
        
        l_aendern9.setBounds(300, 270, 800, 23);
        l_aendern9.setText("Preis:");
        l_aendern9.setFont(new Font("Arial", Font.PLAIN, 17));
        
        l_aendern10.setBounds(300, 320, 800, 23);
        l_aendern10.setText("Position:");
        l_aendern10.setFont(new Font("Arial", Font.PLAIN, 17));
        
        l_aendern11.setBounds(300, 370, 800, 23);
        l_aendern11.setText("Nationalität:");
        l_aendern11.setFont(new Font("Arial", Font.PLAIN, 17));
        
        l_aendern12.setBounds(300, 420, 800, 23);
        l_aendern12.setText("Verein:");
        l_aendern12.setFont(new Font("Arial", Font.PLAIN, 17));
        
        l_aendern13.setBounds(300, 470, 800, 23);
        l_aendern13.setText("Leihverein:");
        l_aendern13.setFont(new Font("Arial", Font.PLAIN, 17));
        
        l_aendern14.setBounds(300, 520, 800, 23);
        l_aendern14.setText("Gerüchtsverein:");
        l_aendern14.setFont(new Font("Arial", Font.PLAIN, 17));
        
        l_aendern15.setBounds(300, 570, 800, 23);
        l_aendern15.setText("Sportart:");
        l_aendern15.setFont(new Font("Arial", Font.PLAIN, 17));
        
        
        
        
        
        
        t_name.setBounds(300, 40, 230, 30);
        t_name.setText("");
        t_name.setFont(new Font("Arial", Font.PLAIN, 17));
        
        t_ein_spieler1.setBounds(170, 80, 230, 30);
        t_ein_spieler1.setText("");
        t_ein_spieler1.setFont(new Font("Arial", Font.PLAIN, 17));
        
        t_ein_spieler2.setBounds(170, 130, 230, 30);
        t_ein_spieler2.setText("");
        t_ein_spieler2.setFont(new Font("Arial", Font.PLAIN, 17));
        
        t_ein_spieler3.setBounds(170, 180, 230, 30);
        t_ein_spieler3.setText("");
        t_ein_spieler3.setFont(new Font("Arial", Font.PLAIN, 17));
        
        t_ein_spieler4.setBounds(170, 230, 230, 30);
        t_ein_spieler4.setText("");
        t_ein_spieler4.setFont(new Font("Arial", Font.PLAIN, 17));
        
        t_ein_spieler5.setBounds(170, 280, 230, 30);
        t_ein_spieler5.setText("");
        t_ein_spieler5.setFont(new Font("Arial", Font.PLAIN, 17));
        
        t_ein_spieler6.setBounds(170, 330, 230, 30);
        t_ein_spieler6.setText("");
        t_ein_spieler6.setFont(new Font("Arial", Font.PLAIN, 17));
        
        t_ein_spieler7.setBounds(170, 380, 230, 30);
        t_ein_spieler7.setText("");
        t_ein_spieler7.setFont(new Font("Arial", Font.PLAIN, 17));
        
        t_ein_spieler8.setBounds(170, 430, 230, 30);
        t_ein_spieler8.setText("");
        t_ein_spieler8.setFont(new Font("Arial", Font.PLAIN, 17));
        
        t_ein_spieler9.setBounds(430, 480, 230, 30);
        t_ein_spieler9.setText("");
        t_ein_spieler9.setFont(new Font("Arial", Font.PLAIN, 17));
        
        t_ein_spieler10.setBounds(430, 530, 230, 30);
        t_ein_spieler10.setText("");
        t_ein_spieler10.setFont(new Font("Arial", Font.PLAIN, 17));
        
        t_loeschen1.setBounds(350, 90, 230, 30);
        t_loeschen1.setText("");
        t_loeschen1.setFont(new Font("Arial", Font.PLAIN, 17));
        
        t_loeschen2.setBounds(430, 530, 230, 30);
        t_loeschen2.setText("");
        t_loeschen2.setFont(new Font("Arial", Font.PLAIN, 17));
        
        t_aendern1.setBounds(350, 120, 230, 30);
        t_aendern1.setText("");
        t_aendern1.setFont(new Font("Arial", Font.PLAIN, 17));
        
        t_aendern2.setBounds(350, 200, 230, 30);
        t_aendern2.setText("");
        t_aendern2.setFont(new Font("Arial", Font.PLAIN, 17));
        
        t_aendern3.setBounds(430, 120, 230, 30);
        t_aendern3.setText("");
        t_aendern3.setFont(new Font("Arial", Font.PLAIN, 17));
        
        t_aendern4.setBounds(430, 170, 230, 30);
        t_aendern4.setText("");
        t_aendern4.setFont(new Font("Arial", Font.PLAIN, 17));
        
        t_aendern5.setBounds(430, 220, 230, 30);
        t_aendern5.setText("");
        t_aendern5.setFont(new Font("Arial", Font.PLAIN, 17));
        
        t_aendern6.setBounds(430, 270, 230, 30);
        t_aendern6.setText("");
        t_aendern6.setFont(new Font("Arial", Font.PLAIN, 17));
        
        t_aendern7.setBounds(430, 320, 230, 30);
        t_aendern7.setText("");
        t_aendern7.setFont(new Font("Arial", Font.PLAIN, 17));
        
        t_aendern8.setBounds(430, 370, 230, 30);
        t_aendern8.setText("");
        t_aendern8.setFont(new Font("Arial", Font.PLAIN, 17));
        
        t_aendern9.setBounds(430, 420, 230, 30);
        t_aendern9.setText("");
        t_aendern9.setFont(new Font("Arial", Font.PLAIN, 17));
        
        t_aendern10.setBounds(430, 470, 230, 30);
        t_aendern10.setText("");
        t_aendern10.setFont(new Font("Arial", Font.PLAIN, 17));
        
        t_aendern11.setBounds(430, 520, 230, 30);
        t_aendern11.setText("");
        t_aendern11.setFont(new Font("Arial", Font.PLAIN, 17));
        
        t_aendern12.setBounds(430, 570, 230, 30);
        t_aendern12.setText("");
        t_aendern12.setFont(new Font("Arial", Font.PLAIN, 17));
        
        b_name.setBounds(350, 90, 115, 33);
        b_name.setText("Los geht's!");
        b_name.setMargin(new Insets(2, 2, 2, 2));
        b_name.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent evt) {
                    b_name_ActionPerformed(evt);
                }
            });
        b_name.setFont(new Font("Dialog", Font.PLAIN, 13));
        
        b_suchen.setBounds(50, 180, 115, 33);
        b_suchen.setText("Daten suchen");
        b_suchen.setMargin(new Insets(2, 2, 2, 2));
        b_suchen.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent evt) {
                    b_suchen_ActionPerformed(evt);
                }
            });
        b_suchen.setFont(new Font("Dialog", Font.PLAIN, 13));
        
        b_einfuegen.setBounds(283, 180, 115, 33);
        b_einfuegen.setText("Daten einfügen");
        b_einfuegen.setMargin(new Insets(2, 2, 2, 2));
        b_einfuegen.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent evt) {
                    b_einfuegen_ActionPerformed(evt);
                }
            });
        b_einfuegen.setFont(new Font("Dialog", Font.PLAIN, 13));
        
        b_loeschen.setBounds(516, 180, 115, 33);
        b_loeschen.setText("Daten löschen");
        b_loeschen.setMargin(new Insets(2, 2, 2, 2));
        b_loeschen.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent evt) {
                    b_loeschen_ActionPerformed(evt);
                }
            });
        b_loeschen.setFont(new Font("Dialog", Font.PLAIN, 13));
        
        b_aendern.setBounds(750, 180, 115, 33);
        b_aendern.setText("Daten ändern");
        b_aendern.setMargin(new Insets(2, 2, 2, 2));
        b_aendern.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent evt) {
                    b_aendern_ActionPerformed(evt);
                }
            });
        b_aendern.setFont(new Font("Dialog", Font.PLAIN, 13));
        
        b_all_suche.setBounds(50, 180, 180, 33);
        b_all_suche.setText("Ganze Tabellen suchen");
        b_all_suche.setMargin(new Insets(2, 2, 2, 2));
        b_all_suche.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent evt) {
                    b_all_suche_ActionPerformed(evt);
                }
            });
        b_all_suche.setFont(new Font("Dialog", Font.PLAIN, 13));
        
        b_erw_suche.setBounds(300, 180, 115, 33);
        b_erw_suche.setText("Erweiterte Suche");
        b_erw_suche.setMargin(new Insets(2, 2, 2, 2));
        b_erw_suche.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent evt) {
                    b_erw_suche_ActionPerformed(evt);
                }
            });
        b_erw_suche.setFont(new Font("Dialog", Font.PLAIN, 13));
        
        b_spe_suche.setBounds(550, 180, 290, 33);
        b_spe_suche.setText("Sportarten abhängig vom Verein suchen");
        b_spe_suche.setMargin(new Insets(2, 2, 2, 2));
        b_spe_suche.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent evt) {
                    b_spe_suche_ActionPerformed(evt);
                }
            });
        b_spe_suche.setFont(new Font("Dialog", Font.PLAIN, 13));
        
        b_su_all1.setBounds(30, 180, 150, 33);
        b_su_all1.setText("Spieler suchen");
        b_su_all1.setMargin(new Insets(2, 2, 2, 2));
        b_su_all1.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent evt) {
                    b_su_all1_ActionPerformed(evt);
                }
            });
        b_su_all1.setFont(new Font("Dialog", Font.PLAIN, 13));
        
        b_su_all2.setBounds(263, 180, 150, 33);
        b_su_all2.setText("Trainer suchen");
        b_su_all2.setMargin(new Insets(2, 2, 2, 2));
        b_su_all2.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent evt) {
                    b_su_all2_ActionPerformed(evt);
                }
            });
        b_su_all2.setFont(new Font("Dialog", Font.PLAIN, 13));
        
        b_su_all3.setBounds(496, 180, 150, 33);
        b_su_all3.setText("Sportarten suchen");
        b_su_all3.setMargin(new Insets(2, 2, 2, 2));
        b_su_all3.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent evt) {
                    b_su_all3_ActionPerformed(evt);
                }
            });
        b_su_all3.setFont(new Font("Dialog", Font.PLAIN, 13));
        
        b_su_all4.setBounds(730, 180, 150, 33);
        b_su_all4.setText("Vereine suchen");
        b_su_all4.setMargin(new Insets(2, 2, 2, 2));
        b_su_all4.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent evt) {
                    b_su_all4_ActionPerformed(evt);
                }
            });
        b_su_all4.setFont(new Font("Dialog", Font.PLAIN, 13));
        
        b_ein_spieler.setBounds(730, 180, 150, 33);
        b_ein_spieler.setText("Spieler registrieren");
        b_ein_spieler.setMargin(new Insets(2, 2, 2, 2));
        b_ein_spieler.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent evt) {
                    b_ein_spieler_ActionPerformed(evt);
                }
            });
        b_ein_spieler.setFont(new Font("Dialog", Font.PLAIN, 13));

        
        b_ein_trainer.setBounds(496, 180, 150, 33);
        b_ein_trainer.setText("Trainer registrieren");
        b_ein_trainer.setMargin(new Insets(2, 2, 2, 2));
        b_ein_trainer.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent evt) {
                    b_ein_trainer_ActionPerformed(evt);
                }
            });
        b_ein_trainer.setFont(new Font("Dialog", Font.PLAIN, 13));
        
        b_ein_verein.setBounds(263, 180, 150, 33);
        b_ein_verein.setText("Verein registrieren");
        b_ein_verein.setMargin(new Insets(2, 2, 2, 2));
        b_ein_verein.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent evt) {
                    b_ein_verein_ActionPerformed(evt);
                }
            });
        b_ein_verein.setFont(new Font("Dialog", Font.PLAIN, 13));
        
        b_ein_sportart.setBounds(30, 180, 150, 33);
        b_ein_sportart.setText("Sportart hinzufügen");
        b_ein_sportart.setMargin(new Insets(2, 2, 2, 2));
        b_ein_sportart.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent evt) {
                    b_ein_sportart_ActionPerformed(evt);
                }
            });
        b_ein_sportart.setFont(new Font("Dialog", Font.PLAIN, 13));
        
        b_ver_verein.setBounds(340, 250, 225, 33);
        b_ver_verein.setText("Sportart mit Verein verknüpfen");
        b_ver_verein.setMargin(new Insets(2, 2, 2, 2));
        b_ver_verein.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent evt) {
                    b_ver_verein_ActionPerformed(evt);
                }
            });
        b_ver_verein.setFont(new Font("Dialog", Font.PLAIN, 13));
        
        b_ein_spieler9.setBounds(50, 480, 150, 33);
        b_ein_spieler9.setText("Leihverein");
        b_ein_spieler9.setMargin(new Insets(2, 2, 2, 2));
        b_ein_spieler9.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent evt) {
                    b_ein_spieler9_ActionPerformed(evt);
                }
            });
        b_ein_spieler9.setFont(new Font("Dialog", Font.PLAIN, 13));
        
        b_ein_spieler10.setBounds(50, 530, 150, 33);
        b_ein_spieler10.setText("Gerüchtsverein");
        b_ein_spieler10.setMargin(new Insets(2, 2, 2, 2));
        b_ein_spieler10.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent evt) {
                    b_ein_spieler10_ActionPerformed(evt);
                }
            });
        b_ein_spieler10.setFont(new Font("Dialog", Font.PLAIN, 13));
        
        b_ein_spielerges.setBounds(300, 600, 150, 33);
        b_ein_spielerges.setText("Einfügen");
        b_ein_spielerges.setMargin(new Insets(2, 2, 2, 2));
        b_ein_spielerges.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent evt) {
                    b_ein_spielerges_ActionPerformed(evt);
                }
            });
        b_ein_spielerges.setFont(new Font("Dialog", Font.PLAIN, 13));
        
        b_ein_vereinges.setBounds(300, 600, 150, 33);
        b_ein_vereinges.setText("Einfügen");
        b_ein_vereinges.setMargin(new Insets(2, 2, 2, 2));
        b_ein_vereinges.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent evt) {
                    b_ein_vereinges_ActionPerformed(evt);
                }
            });
        b_ein_vereinges.setFont(new Font("Dialog", Font.PLAIN, 13));
        
        b_ein_verein_sportart.setBounds(300, 600, 150, 33);
        b_ein_verein_sportart.setText("Einfügen");
        b_ein_verein_sportart.setMargin(new Insets(2, 2, 2, 2));
        b_ein_verein_sportart.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent evt) {
                    b_ein_verein_sportart_ActionPerformed(evt);
                }
            });
        b_ein_verein_sportart.setFont(new Font("Dialog", Font.PLAIN, 13));
        
        b_ver_vereinges.setBounds(300, 600, 150, 33);
        b_ver_vereinges.setText("Einfügen");
        b_ver_vereinges.setMargin(new Insets(2, 2, 2, 2));
        b_ver_vereinges.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent evt) {
                    b_ver_vereinges_ActionPerformed(evt);
                }
            });
        b_ver_vereinges.setFont(new Font("Dialog", Font.PLAIN, 13));
        
        b_ein_spielerges.setBounds(300, 600, 150, 33);
        b_ein_spielerges.setText("Einfügen");
        b_ein_spielerges.setMargin(new Insets(2, 2, 2, 2));
        b_ein_spielerges.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent evt) {
                    b_ein_spielerges_ActionPerformed(evt);
                }
            });
        b_ein_spielerges.setFont(new Font("Dialog", Font.PLAIN, 13));
        
        b_ein_sportartges.setBounds(300, 600, 150, 33);
        b_ein_sportartges.setText("Einfügen");
        b_ein_sportartges.setMargin(new Insets(2, 2, 2, 2));
        b_ein_sportartges.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent evt) {
                    b_ein_sportartges_ActionPerformed(evt);
                }
            });
        b_ein_sportartges.setFont(new Font("Dialog", Font.PLAIN, 13));
        
        b_ein_trainerges.setBounds(300, 600, 150, 33);
        b_ein_trainerges.setText("Einfügen");
        b_ein_trainerges.setMargin(new Insets(2, 2, 2, 2));
        b_ein_trainerges.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent evt) {
                    b_ein_trainerges_ActionPerformed(evt);
                }
            });
        b_ein_trainerges.setFont(new Font("Dialog", Font.PLAIN, 13));
        
        b_loeschen_bestaetigen.setBounds(350, 90, 115, 33);
        b_loeschen_bestaetigen.setText("Ich bin sicher!");
        b_loeschen_bestaetigen.setMargin(new Insets(2, 2, 2, 2));
        b_loeschen_bestaetigen.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent evt) {
                    b_loeschen_bestaetigen_ActionPerformed(evt);
                }
            });
        b_loeschen_bestaetigen.setFont(new Font("Dialog", Font.PLAIN, 13));
        
        b_aendern_bestaetigen.setBounds(350, 90, 115, 33);
        b_aendern_bestaetigen.setText("Weiter");
        b_aendern_bestaetigen.setMargin(new Insets(2, 2, 2, 2));
        b_aendern_bestaetigen.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent evt) {
                    b_aendern_bestaetigen_ActionPerformed(evt);
                }
            });
        b_loeschen_bestaetigen.setFont(new Font("Dialog", Font.PLAIN, 13));
        
        b_aendern1.setBounds(50, 120, 150, 33);
        b_aendern1.setText("Vorname");
        b_aendern1.setMargin(new Insets(2, 2, 2, 2));
        b_aendern1.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent evt) {
                    b_aendern1_ActionPerformed(evt);
                }
            });
        b_aendern1.setFont(new Font("Dialog", Font.PLAIN, 13));
        
        b_aendern2.setBounds(50, 170, 150, 33);
        b_aendern2.setText("Nachname");
        b_aendern2.setMargin(new Insets(2, 2, 2, 2));
        b_aendern2.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent evt) {
                    b_aendern2_ActionPerformed(evt);
                }
            });
        b_aendern2.setFont(new Font("Dialog", Font.PLAIN, 13));
        
        b_aendern3.setBounds(50, 220, 150, 33);
        b_aendern3.setText("Gehalt");
        b_aendern3.setMargin(new Insets(2, 2, 2, 2));
        b_aendern3.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent evt) {
                    b_aendern3_ActionPerformed(evt);
                }
            });
        b_aendern3.setFont(new Font("Dialog", Font.PLAIN, 13));
        
        b_aendern4.setBounds(50, 270, 150, 33);
        b_aendern4.setText("Preis");
        b_aendern4.setMargin(new Insets(2, 2, 2, 2));
        b_aendern4.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent evt) {
                    b_aendern4_ActionPerformed(evt);
                }
            });
        b_aendern4.setFont(new Font("Dialog", Font.PLAIN, 13));
        
        b_aendern5.setBounds(50, 320, 150, 33);
        b_aendern5.setText("Position");
        b_aendern5.setMargin(new Insets(2, 2, 2, 2));
        b_aendern5.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent evt) {
                    b_aendern5_ActionPerformed(evt);
                }
            });
        b_aendern5.setFont(new Font("Dialog", Font.PLAIN, 13));
        
        b_aendern6.setBounds(50, 370, 150, 33);
        b_aendern6.setText("Nationalität");
        b_aendern6.setMargin(new Insets(2, 2, 2, 2));
        b_aendern6.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent evt) {
                    b_aendern6_ActionPerformed(evt);
                }
            });
        b_aendern6.setFont(new Font("Dialog", Font.PLAIN, 13));
        
        b_aendern7.setBounds(50, 420, 150, 33);
        b_aendern7.setText("Verein");
        b_aendern7.setMargin(new Insets(2, 2, 2, 2));
        b_aendern7.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent evt) {
                    b_aendern7_ActionPerformed(evt);
                }
            });
        b_aendern7.setFont(new Font("Dialog", Font.PLAIN, 13));
        
        b_aendern8.setBounds(50, 470, 150, 33);
        b_aendern8.setText("Leihverein");
        b_aendern8.setMargin(new Insets(2, 2, 2, 2));
        b_aendern8.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent evt) {
                    b_aendern8_ActionPerformed(evt);
                }
            });
        b_aendern8.setFont(new Font("Dialog", Font.PLAIN, 13));
        
        b_aendern9.setBounds(50, 520, 150, 33);
        b_aendern9.setText("Gerüchtsverein");
        b_aendern9.setMargin(new Insets(2, 2, 2, 2));
        b_aendern9.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent evt) {
                    b_aendern9_ActionPerformed(evt);
                }
            });
        b_aendern9.setFont(new Font("Dialog", Font.PLAIN, 13));
        
        b_aendern10.setBounds(50, 570, 150, 33);
        b_aendern10.setText("Sportart");
        b_aendern10.setMargin(new Insets(2, 2, 2, 2));
        b_aendern10.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent evt) {
                    b_aendern10_ActionPerformed(evt);
                }
            });
        b_aendern10.setFont(new Font("Dialog", Font.PLAIN, 13));
        
        
        
        
        
        
        b_start.setBounds(350, 50, 115, 33);
        b_start.setText("Los geht's!");
        b_start.setMargin(new Insets(2, 2, 2, 2));
        b_start.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent evt) {
                    b_start_ActionPerformed(evt);
                }
            });
        b_start.setFont(new Font("Dialog", Font.PLAIN, 13));
        cp.add(b_start);
        
        

        bMaskeLeeren.setBounds(400, 210, 115, 33);
        bMaskeLeeren.setText("Maske leeren");
        bMaskeLeeren.setMargin(new Insets(2, 2, 2, 2));
        bMaskeLeeren.addActionListener(new ActionListener() { 
                public void actionPerformed(ActionEvent evt) { 
                    bMaskeLeeren_ActionPerformed(evt);
                }
            });
        bMaskeLeeren.setFont(new Font("Arial", Font.PLAIN, 14));
        // Ende Komponenten
        
        
        revalidate();
        repaint();
        setResizable(false);
        setVisible(true);

    }

    // Anfang Methoden

    public void  menue1_ActionPerformed(ActionEvent evt){
        m=1;
        l_start.setText("Name:");
    }

    public void b_start_ActionPerformed(ActionEvent evt) {
        l_start.setText("Bevor du loslegen kannst, nenne uns bitte deinen Namen:");
        cp.remove(b_start);
        cp.revalidate();
        cp.repaint();
        cp.add(t_name);
        cp.add(b_name);
        z=1;
    }
    
    public void b_name_ActionPerformed(ActionEvent evt) {
        cp.remove(l_start);
        cp.remove(b_name);
        cp.remove(t_name);
        cp.revalidate();
        cp.repaint();
        l_optionen.setText("Herzlich willkommen "+t_name.getText()+"! Wähle bitte aus, was du in unserer Datenbank machen möchtest:");
        cp.add(l_optionen);
        cp.add(b_suchen);
        cp.add(b_einfuegen);
        cp.add(b_loeschen);
        cp.add(b_aendern);
        z=2;
    }
    
    public void b_suchen_ActionPerformed(ActionEvent evt) {
        cp.remove(l_optionen);
        cp.remove(b_suchen);
        cp.remove(b_einfuegen);
        cp.remove(b_loeschen);
        cp.remove(b_aendern);
        cp.revalidate();
        cp.repaint();
        cp.add(l_suchen1);
        cp.add(l_suchen2);
        cp.add(b_all_suche);
        cp.add(b_erw_suche);
        cp.add(b_spe_suche);
        z=3;
    }
    
    public void b_all_suche_ActionPerformed(ActionEvent evt) {
        cp.remove(l_suchen1);
        cp.remove(l_suchen2);
        cp.remove(b_all_suche);
        cp.remove(b_erw_suche);
        cp.remove(b_spe_suche);
        cp.revalidate();
        cp.repaint();
        cp.add(l_su_all);
        cp.add(b_su_all1);
        cp.add(b_su_all2);
        cp.add(b_su_all3);
        cp.add(b_su_all4);
        z=4;
    }
    
    public void b_su_all1_ActionPerformed(ActionEvent evt) {
        cp.remove(b_su_all1);
        cp.remove(b_su_all2);
        cp.remove(b_su_all3);
        cp.remove(b_su_all4);
        
        String sqlBefehl="Select * From Spieler";
        v1.meinConnector.executeStatement(sqlBefehl);
        String [][] ergebnis=v1.meinConnector.getCurrentQueryResult().getData();
        
        ergebnisse = new JTable(ergebnis, arr_spieler);
        scrollpane = new JScrollPane(ergebnisse);
        
        scrollpane.setBounds(200, 100, 600, 100);
        
        cp.add(scrollpane);
        
        cp.revalidate();
        cp.repaint();
        l_su_all.setText("Hier sind deine Ergebnisse:");
        
        z=5;
    }
    
    public void b_su_all2_ActionPerformed(ActionEvent evt) {
        cp.remove(b_su_all1);
        cp.remove(b_su_all2);
        cp.remove(b_su_all3);
        cp.remove(b_su_all4);
        
        String sqlBefehl="Select * From Trainer";
        v1.meinConnector.executeStatement(sqlBefehl);
        String [][] ergebnis=v1.meinConnector.getCurrentQueryResult().getData();
        
        ergebnisse = new JTable(ergebnis, arr_trainer);
        scrollpane = new JScrollPane(ergebnisse);
        
        scrollpane.setBounds(200, 100, 600, 100);
        
        cp.add(scrollpane);
        
        cp.revalidate();
        cp.repaint();
        l_su_all.setText("Hier sind deine Ergebnisse:");
        z=6;
    }
    
    public void b_su_all3_ActionPerformed(ActionEvent evt) {
        cp.remove(b_su_all1);
        cp.remove(b_su_all2);
        cp.remove(b_su_all3);
        cp.remove(b_su_all4);
        
        String sqlBefehl="Select * From Sportart";
        v1.meinConnector.executeStatement(sqlBefehl);
        String [][] ergebnis=v1.meinConnector.getCurrentQueryResult().getData();
        
        ergebnisse = new JTable(ergebnis, arr_sportart);
        scrollpane = new JScrollPane(ergebnisse);
        
        scrollpane.setBounds(200, 100, 600, 100);
        
        cp.add(scrollpane);
        
        cp.revalidate();
        cp.repaint();
        l_su_all.setText("Hier sind deine Ergebnisse:");
        z=7;
    }
    
    public void b_su_all4_ActionPerformed(ActionEvent evt) {
        cp.remove(b_su_all1);
        cp.remove(b_su_all2);
        cp.remove(b_su_all3);
        cp.remove(b_su_all4);
        
        String sqlBefehl="Select * From Verein";
        v1.meinConnector.executeStatement(sqlBefehl);
        String [][] ergebnis=v1.meinConnector.getCurrentQueryResult().getData();
        
        ergebnisse = new JTable(ergebnis, arr_verein);
        scrollpane = new JScrollPane(ergebnisse);
        
        scrollpane.setBounds(200, 100, 600, 100);
        
        cp.add(scrollpane);
        
        cp.revalidate();
        cp.repaint();
        l_su_all.setText("Hier sind deine Ergebnisse:");
        z=8;
    }
    
    public void b_erw_suche_ActionPerformed(ActionEvent evt) {
        l_start.setText("Wir bieten in unserer Datenbank verschiedene Such-Optionen an!");
        cp.remove(b_name);
        cp.remove(t_name);
        cp.revalidate();
        cp.repaint();
        cp.add(b_suchen);
        cp.add(b_einfuegen);
        cp.add(b_loeschen);
        cp.add(b_aendern);
        z=9;
    }
    
    public void b_spe_suche_ActionPerformed(ActionEvent evt) {
        l_start.setText("Wir bieten in unserer Datenbank verschiedene Such-Optionen an!");
        cp.remove(b_name);
        cp.remove(t_name);
        cp.revalidate();
        cp.repaint();
        cp.add(b_suchen);
        cp.add(b_einfuegen);
        cp.add(b_loeschen);
        cp.add(b_aendern);
        z=10;
    }
    
    public void b_einfuegen_ActionPerformed(ActionEvent evt) {
        cp.remove(l_optionen);
        cp.remove(b_suchen);
        cp.remove(b_einfuegen);
        cp.remove(b_loeschen);
        cp.remove(b_aendern);
        cp.revalidate();
        cp.repaint();
        cp.add(l_einfuegen);
        cp.add(b_ein_spieler);
        cp.add(b_ein_trainer);
        cp.add(b_ein_sportart);
        cp.add(b_ein_verein);
        cp.add(b_ver_verein);
        z=11;
    }
    
    public void b_ein_spieler_ActionPerformed(ActionEvent evt) {
        l_einfuegen.setText("Bitte fülle alle Felder aus! Die Felder, die sich mit einem Knopf anzeigen lassen, sind optional.");
        cp.remove(b_ein_spieler);
        cp.remove(b_ein_trainer);
        cp.remove(b_ein_sportart);
        cp.remove(b_ein_verein);
        cp.remove(b_ver_verein);
        cp.revalidate();
        cp.repaint();
        cp.add(l_einfuegen2);
        l_ein_spieler1.setText("Nachname:");
        cp.add(l_ein_spieler1);
        l_ein_spieler2.setText("Vorname:");
        cp.add(l_ein_spieler2);
        l_ein_spieler3.setText("Gehalt:");
        cp.add(l_ein_spieler3);
        l_ein_spieler4.setText("Preis:");
        cp.add(l_ein_spieler4);
        l_ein_spieler5.setText("Position:");
        cp.add(l_ein_spieler5);
        l_ein_spieler6.setText("Nationalität:");
        cp.add(l_ein_spieler6);
        l_ein_spieler7.setText("Verein:");
        cp.add(l_ein_spieler7);
        l_ein_spieler8.setText("Sportart:");
        cp.add(l_ein_spieler8);
        cp.add(t_ein_spieler1);
        cp.add(t_ein_spieler2);
        cp.add(t_ein_spieler3);
        cp.add(t_ein_spieler4);
        cp.add(t_ein_spieler5);
        cp.add(t_ein_spieler6);
        cp.add(t_ein_spieler7);
        cp.add(t_ein_spieler8);
        cp.add(b_ein_spieler9);
        cp.add(b_ein_spieler10);
        cp.add(b_ein_spielerges);
        z=12;
    }
    
    public void b_ein_spieler9_ActionPerformed(ActionEvent evt) {
        if (ein_spieler9) {
            cp.revalidate();
            cp.repaint();
            l_ein_spieler9.setText("Leihverein:");
            cp.add(l_ein_spieler9);
            cp.add(t_ein_spieler9);
            cp.revalidate();
            cp.repaint();
            ein_spieler9=false;
        }
        else {
            cp.revalidate();
            cp.repaint();            
            cp.remove(l_ein_spieler9);
            cp.remove(t_ein_spieler9);
            cp.revalidate();
            cp.repaint();
            ein_spieler9=true;
        }
    }
    
    public void b_ein_spieler10_ActionPerformed(ActionEvent evt) {
        if (ein_spieler10) {
            cp.revalidate();
            cp.repaint();
            l_ein_spieler10.setText("Gerüchtsverein:");
            cp.add(l_ein_spieler10);
            cp.add(t_ein_spieler10);
            cp.revalidate();
            cp.repaint();
            ein_spieler10=false;
        }
        else {
            cp.revalidate();
            cp.repaint();
            cp.remove(l_ein_spieler10);
            cp.remove(t_ein_spieler10);
            cp.revalidate();
            cp.repaint();
            ein_spieler10=true;
        }
    }
    
    public void b_ein_verein_ActionPerformed(ActionEvent evt) {
        l_einfuegen.setText("Bitte fülle alle Felder aus!");
        cp.remove(b_ein_spieler);
        cp.remove(b_ein_trainer);
        cp.remove(b_ein_sportart);
        cp.remove(b_ein_verein);
        cp.remove(b_ver_verein);
        cp.revalidate();
        cp.repaint();
        cp.add(l_einfuegen2);
        l_ein_spieler1.setText("Name:");
        cp.add(l_ein_spieler1);
        l_ein_spieler2.setText("Budget:");
        cp.add(l_ein_spieler2);
        cp.add(t_ein_spieler1);
        cp.add(t_ein_spieler2);
        cp.add(b_ein_vereinges);
        z=13;
    }
    
    public void b_ein_sportart_ActionPerformed(ActionEvent evt) {
        l_einfuegen.setText("Bitte fülle alle Felder aus!");
        cp.remove(b_ein_spieler);
        cp.remove(b_ein_trainer);
        cp.remove(b_ein_sportart);
        cp.remove(b_ein_verein);
        cp.remove(b_ver_verein);
        cp.revalidate();
        cp.repaint();
        cp.add(l_einfuegen2);
        l_ein_spieler1.setText("Name:");
        cp.add(l_ein_spieler1);
        l_ein_spieler2.setText("Popularität:");
        cp.add(l_ein_spieler2);
        l_ein_spieler3.setText("Ballgröße:");
        cp.add(l_ein_spieler3);
        cp.add(t_ein_spieler1);
        cp.add(t_ein_spieler2);
        cp.add(t_ein_spieler3);
        cp.add(b_ein_sportartges);
        z=14;
    }
    
    public void b_ein_trainer_ActionPerformed(ActionEvent evt) {
        l_einfuegen.setText("Bitte fülle alle Felder aus!");
        cp.remove(b_ein_spieler);
        cp.remove(b_ein_trainer);
        cp.remove(b_ein_sportart);
        cp.remove(b_ein_verein);
        cp.remove(b_ver_verein);
        cp.revalidate();
        cp.repaint();
        cp.add(l_einfuegen2);
        l_ein_spieler1.setText("Nachname:");
        cp.add(l_ein_spieler1);
        l_ein_spieler2.setText("Vorname:");
        cp.add(l_ein_spieler2);
        l_ein_spieler3.setText("Gehalt:");
        cp.add(l_ein_spieler3);
        l_ein_spieler4.setText("Nationalität:");
        cp.add(l_ein_spieler4);
        l_ein_spieler5.setText("Verein:");
        cp.add(l_ein_spieler5);
        l_ein_spieler6.setText("Sportart:");
        cp.add(l_ein_spieler6);
        cp.add(t_ein_spieler1);
        cp.add(t_ein_spieler2);
        cp.add(t_ein_spieler3);
        cp.add(t_ein_spieler4);
        cp.add(t_ein_spieler5);
        cp.add(t_ein_spieler6);
        cp.add(b_ein_trainerges);
        z=15;
    }
    
    public void b_ein_trainerges_ActionPerformed(ActionEvent evt) {
        v1.einfuegen_gui("Trainer", t_ein_spieler1.getText(), t_ein_spieler2.getText(), t_ein_spieler3.getText(), t_ein_spieler4.getText(), t_ein_spieler5.getText(), t_ein_spieler6.getText(), t_ein_spieler7.getText(), t_ein_spieler8.getText(), t_ein_spieler9.getText(), t_ein_spieler10.getText());
    }
    
    public void b_ein_sportartges_ActionPerformed(ActionEvent evt) {
        v1.einfuegen_gui("Sportart", t_ein_spieler1.getText(), t_ein_spieler2.getText(), t_ein_spieler3.getText(), t_ein_spieler4.getText(), t_ein_spieler5.getText(), t_ein_spieler6.getText(), t_ein_spieler7.getText(), t_ein_spieler8.getText(), t_ein_spieler9.getText(), t_ein_spieler10.getText());
    }
    
    public void b_ein_spielerges_ActionPerformed(ActionEvent evt) {
        v1.einfuegen_gui("Spieler", t_ein_spieler1.getText(), t_ein_spieler2.getText(), t_ein_spieler3.getText(), t_ein_spieler4.getText(), t_ein_spieler5.getText(), t_ein_spieler6.getText(), t_ein_spieler7.getText(), t_ein_spieler8.getText(), t_ein_spieler9.getText(), t_ein_spieler10.getText());
    }
    
    public void b_ein_vereinges_ActionPerformed(ActionEvent evt) {
        l_einfuegen.setText("Wenn du dem Verein noch eine Sportart hinzufügen möchtest, fülle das Feld aus und bestätige deine Eingabe!");
        l_ein_spieler2.setText("Sportart:");
        cp.remove(b_ein_vereinges);
        cp.revalidate();
        cp.repaint();
        cp.add(b_ein_verein_sportart);
        v1.einfuegen_gui("Verein", t_ein_spieler1.getText(), t_ein_spieler2.getText(), t_ein_spieler3.getText(), t_ein_spieler4.getText(), t_ein_spieler5.getText(), t_ein_spieler6.getText(), t_ein_spieler7.getText(), t_ein_spieler8.getText(), t_ein_spieler9.getText(), t_ein_spieler10.getText());
        t_ein_spieler2.setText("");
        z=16;
    }
    
    public void b_ein_verein_sportart_ActionPerformed(ActionEvent evt) {
        l_einfuegen.setText("Wenn du dem Verein noch eine Sportart hinzufügen möchtest, fülle das Feld aus und bestätige deine Eingabe!");
        l_ein_spieler2.setText("Sportart:");
        cp.revalidate();
        cp.repaint();
        v1.einfuegen_gui("hat", t_ein_spieler1.getText(), t_ein_spieler2.getText(), t_ein_spieler3.getText(), t_ein_spieler4.getText(), t_ein_spieler5.getText(), t_ein_spieler6.getText(), t_ein_spieler7.getText(), t_ein_spieler8.getText(), t_ein_spieler9.getText(), t_ein_spieler10.getText());
        t_ein_spieler2.setText("");
    }
    
    public void b_ver_verein_ActionPerformed(ActionEvent evt) {
        cp.remove(b_ein_spieler);
        cp.remove(b_ein_trainer);
        cp.remove(b_ein_sportart);
        cp.remove(b_ein_verein);
        cp.remove(b_ver_verein);
        t_ein_spieler1.setBounds(250, 80, 230, 30);
        t_ein_spieler2.setBounds(250, 130, 230, 30);
        cp.revalidate();
        cp.repaint();
        l_einfuegen.setText("Fülle alle Felder aus und bestätige deine Eingabe!");
        l_ein_spieler1.setText("Name des Vereins:");
        cp.add(l_ein_spieler1);
        l_ein_spieler2.setText("Sportart:");
        cp.add(l_ein_spieler2);
        cp.add(t_ein_spieler1);
        cp.add(t_ein_spieler2);
        cp.add(b_ver_vereinges);
        z=17;
    }
    
    public void b_ver_vereinges_ActionPerformed(ActionEvent evt) {
        v1.einfuegen_gui("hat", t_ein_spieler1.getText(), t_ein_spieler2.getText(), t_ein_spieler3.getText(), t_ein_spieler4.getText(), t_ein_spieler5.getText(), t_ein_spieler6.getText(), t_ein_spieler7.getText(), t_ein_spieler8.getText(), t_ein_spieler9.getText(), t_ein_spieler10.getText());
    }
    
    public void b_loeschen_ActionPerformed(ActionEvent evt) {
        cp.remove(l_optionen);
        cp.remove(b_suchen);
        cp.remove(b_einfuegen);
        cp.remove(b_loeschen);
        cp.remove(b_aendern);
        cp.revalidate();
        cp.repaint();
        cp.add(l_loeschen);
        cp.add(l_loeschen2);
        cp.add(l_loeschen3);
        cp.add(l_loeschen4);
        cp.add(l_loeschen5);
        cp.add(l_loeschen6);
        cp.add(b_loeschen_bestaetigen);
        z=18;
    }
    
    public void b_loeschen_bestaetigen_ActionPerformed(ActionEvent evt) {
        if (l==1) {
            l_loeschen.setText("Bist du wirklich ganz sicher?");
            l_loeschen2.setText("");
            l++;
            z=19;
        }
        else if (l==2) {
            l_loeschen.setText("Also wirklich sehr sicher?");
            l_loeschen2.setText("Deine Daten gehen sonst für immer verloren (oder werden von uns ins Darknet gestellt)");
            l++;
            z=20;
        }
        else if (l==3) {
            l_loeschen.setText("Da du dir sehr sicher zu sein scheinst, kannst du nun deine Daten löschen!");
            l_loeschen2.setText("Zu deiner Sicherheit und zu der, der anderen Datenbanknutzer kannst du deine Daten nur über deine persönliche ID löschen.");
            l_loeschen3.setText("Nenne bitte zu erst deine Art des Objektes, welches du löschen möchtest:");
            cp.add(t_loeschen1);
            t_loeschen1.setBounds(350, 120, 115, 33);
            b_loeschen_bestaetigen.setBounds(350, 160, 115, 33);
            b_loeschen_bestaetigen.setText("Bestätigen!");
            l++;
            z=21;
        }
        else if (l==4) {
            l_loeschen4.setText("Bitte bestätige die Art des zu löschenden Objektes:");
            cp.add(t_loeschen2);
            t_loeschen2.setBounds(350, 200, 115, 33);
            b_loeschen_bestaetigen.setBounds(350, 240, 115, 33);
            l++;
            z=22;
        }
        else if (l==5) {
            if(t_loeschen1.getText().equals(t_loeschen2.getText())) {
                l_loeschen5.setText("");
                l_loeschen6.setText("");
                if (t_loeschen1.getText().equals("Spieler")) {
                    art=t_loeschen1.getText();
                    t_loeschen1.setText("");
                    t_loeschen2.setText("");
                    b_loeschen_bestaetigen.setBounds(350, 160, 115, 33);
                    b_loeschen_bestaetigen.setText("Bestätigen!");
                    cp.remove(t_loeschen2);
                    l_loeschen4.setText("");
                    l_loeschen3.setText("Gebe die ID des zu löschenden Spielers an:");
                    l=6;
                    z=24;
                }
                else if (t_loeschen1.getText().equals("Trainer")) {
                    art=t_loeschen1.getText();
                    t_loeschen1.setText("");
                    t_loeschen2.setText("");
                    b_loeschen_bestaetigen.setBounds(350, 160, 115, 33);
                    b_loeschen_bestaetigen.setText("Bestätigen!");
                    cp.remove(t_loeschen2);
                    l_loeschen4.setText("");
                    l_loeschen3.setText("Gebe die ID des zu löschenden Trainers an:");
                    l=6;
                    z=25;
                }
                else if (t_loeschen1.getText().equals("Verein")) {
                    art=t_loeschen1.getText();
                    t_loeschen1.setText("");
                    t_loeschen2.setText("");
                    b_loeschen_bestaetigen.setBounds(350, 160, 115, 33);
                    b_loeschen_bestaetigen.setText("Bestätigen!");
                    cp.remove(t_loeschen2);
                    l_loeschen4.setText("");
                    l_loeschen3.setText("Gebe die ID des zu löschenden Vereins an:");
                    l=6;
                    z=26;
                }
                else {
                    l_loeschen5.setText("Leider gibt es diese Art von Objekt nicht oder du hast versucht eine Sportart zu löschen,");
                    l_loeschen6.setText("was in dieser Datenbank grundsätzlich untersagt ist!");
                    z=27;
                }
            }
            
            else {
                l_loeschen5.setText("Deine beiden angegebenen Objektarten stimmen nicht überein! Bitte versuche es erneut.");
                z=23;
            }
        }
        else if(l==6) {
                l_loeschen4.setText("Bitte gebe den Bestätigungscode ein, den wir dir per E-Mail geschickt haben");
                l_loeschen5.setBounds(30, 200, 1000, 23);
                l_loeschen5.setText("(da die Datenbank keine E-Mails unterstützt ist der Bestätigungscode deine ID)");
                cp.add(t_loeschen2);
                t_loeschen2.setBounds(350, 240, 115, 33);
                b_loeschen_bestaetigen.setBounds(350, 280, 115, 33);
                l=7;
                z=28;
            }
        else if(l==7) {
            if (t_loeschen1.getText().equals(t_loeschen2.getText())) {
                v1.loeschen_gui(art, t_loeschen1.getText());
                l_loeschen6.setBounds(30, 320, 1000, 23);
                l_loeschen6.setText("Das Löschen des Objekts war erfolgreich!");
                z=29;
            }
            else {
                l_loeschen6.setBounds(30, 320, 1000, 23);
                l_loeschen6.setText("Der eingegebene Code ist falsch, bitte versuche es erneut!");
                z=30;
            }
        }
    }
    
    public void b_aendern_ActionPerformed(ActionEvent evt) {
        cp.remove(l_optionen);
        cp.remove(b_suchen);
        cp.remove(b_einfuegen);
        cp.remove(b_loeschen);
        cp.remove(b_aendern);
        cp.revalidate();
        cp.repaint();
        cp.add(l_aendern1);
        cp.add(l_aendern2);
        cp.add(b_aendern_bestaetigen);
        a=1;
        z=31;
    }
    
    public void b_aendern_bestaetigen_ActionPerformed(ActionEvent evt) {
        if (a==1) {
            cp.add(l_aendern3);
            cp.add(t_aendern1);
            cp.revalidate();
            cp.repaint();
            b_aendern_bestaetigen.setBounds(350, 160, 115, 33);
            a++;
            z=32;
        }
        else if (a==2) {
            cp.add(l_aendern4);
            cp.add(t_aendern2);
            cp.revalidate();
            cp.repaint();
            b_aendern_bestaetigen.setBounds(350, 240, 115, 33);
            z=33;
            a++;
        }
        else if (a==3) {
            if (t_aendern1.getText().equals(t_aendern2.getText())) {
                cp.remove(l_aendern5);
                art=t_aendern1.getText();
                if (t_aendern1.getText().equals("Spieler")) {
                    t_aendern1.setText("");
                    cp.remove(l_aendern4);
                    cp.remove(t_aendern2);
                    cp.revalidate();
                    cp.repaint();
                    b_aendern_bestaetigen.setBounds(350, 160, 115, 33);
                    l_aendern3.setText("Gebe aus Sicherheitsgründen bitte deine Spieler-ID ein:");
                    a=4;
                    z=35;
                }
                else if (t_aendern1.getText().equals("Trainer")) {
                    t_aendern1.setText("");
                    cp.remove(l_aendern4);
                    cp.remove(t_aendern2);
                    cp.revalidate();
                    cp.repaint();
                    b_aendern_bestaetigen.setBounds(350, 160, 115, 33);
                    l_aendern3.setText("Gebe aus Sicherheitsgründen bitte deine Trainer-ID ein:");
                    a=5;
                    z=36;
                }
                else if (t_aendern1.getText().equals("Verein")) {
                    t_aendern1.setText("");
                    cp.remove(l_aendern4);
                    cp.remove(t_aendern2);
                    cp.revalidate();
                    cp.repaint();
                    b_aendern_bestaetigen.setBounds(350, 160, 115, 33);
                    l_aendern3.setText("Gebe aus Sicherheitsgründen bitte deine Vereins-ID ein:");
                    a=6;
                    z=37;
                }
                else if (t_aendern1.getText().equals("Sportart")) {
                    t_aendern1.setText("");
                    cp.remove(l_aendern4);
                    cp.remove(t_aendern2);
                    cp.revalidate();
                    cp.repaint();
                    b_aendern_bestaetigen.setBounds(350, 160, 115, 33);
                    l_aendern3.setText("Gebe aus Sicherheitsgründen bitte die ID deiner Sportart ein:");
                    a=7;
                    z=38;
                }
                else {
                    l_aendern5.setText("Bitte gebe ein gültiges Objekt ein!");
                    z=39;
                }
            }
            else {
                cp.add(l_aendern5);
                cp.revalidate();
                cp.repaint();
                z=34;
            }
        }
        else if (a==4) {
            id=t_aendern1.getText();
            cp.remove(t_aendern1);
            cp.revalidate();
            cp.repaint();
            l_aendern3.setText("Klicke auf jedes Attribut, das geändert werden soll und fülle die Felder aus!");
            cp.add(b_aendern1);
            cp.add(b_aendern2);
            cp.add(b_aendern3);
            cp.add(b_aendern4);
            cp.add(b_aendern5);
            cp.add(b_aendern6);
            cp.add(b_aendern7);
            cp.add(b_aendern8);
            cp.add(b_aendern9);
            cp.add(b_aendern10);
            b_aendern_bestaetigen.setBounds(350, 610, 115, 33);
            a=8;
            z=40;
        }
        else if (a==5) {
            id=t_aendern1.getText();
            cp.remove(t_aendern1);
            cp.revalidate();
            cp.repaint();
            l_aendern3.setText("Klicke auf jedes Attribut, das geändert werden soll und fülle die Felder aus!");
            b_aendern4.setText("Nationalität");
            b_aendern5.setText("Verein");
            b_aendern6.setText("Sportart");
            l_aendern9.setText("Nationalität:");
            l_aendern10.setText("Verein:");
            l_aendern11.setText("Sportart:");
            cp.add(b_aendern1);
            cp.add(b_aendern2);
            cp.add(b_aendern3);
            cp.add(b_aendern4);
            cp.add(b_aendern5);
            cp.add(b_aendern6);
            b_aendern_bestaetigen.setBounds(350, 410, 115, 33);
            a=8;
            z=41;
        }
        else if(a==6) {
            id=t_aendern1.getText();
            cp.remove(t_aendern1);
            cp.revalidate();
            cp.repaint();
            l_aendern3.setText("Klicke auf jedes Attribut, das geändert werden soll und fülle die Felder aus!");
            b_aendern1.setText("Name");
            b_aendern2.setText("Budget");
            l_aendern6.setText("Name:");
            l_aendern7.setText("Budget:");
            cp.add(b_aendern1);
            cp.add(b_aendern2);
            b_aendern_bestaetigen.setBounds(350, 210, 115, 33);
            a=8;
            z=42;
            }
        else if(a==7) {
            id=t_aendern1.getText();
            cp.remove(t_aendern1);
            cp.revalidate();
            cp.repaint();
            l_aendern3.setText("Klicke auf jedes Attribut, das geändert werden soll und fülle die Felder aus!");
            b_aendern1.setText("Popularität");
            b_aendern2.setText("Ballgröße");
            l_aendern6.setText("Popularität:");
            l_aendern7.setText("Ballgröße:");
            cp.add(b_aendern1);
            cp.add(b_aendern2);
            b_aendern_bestaetigen.setBounds(350, 210, 115, 33);
            a=8;
            z=43;
        }
        else if(a==8) {
            v1.aendern_gui(id, art, t_aendern3.getText(), t_aendern4.getText(), t_aendern5.getText(), t_aendern6.getText(), t_aendern7.getText(), t_aendern8.getText(), t_aendern9.getText(), t_aendern10.getText(), t_aendern11.getText(), t_aendern12.getText());
        }
    }
    
    public void b_aendern1_ActionPerformed(ActionEvent evt) {
        if (aendern1) {
            cp.revalidate();
            cp.repaint();
            cp.add(l_aendern6);
            cp.add(t_aendern3);
            cp.revalidate();
            cp.repaint();
            aendern1=false;
        }
        else {
            cp.revalidate();
            cp.repaint();            
            cp.remove(l_aendern6);
            cp.remove(t_aendern3);
            cp.revalidate();
            cp.repaint();
            aendern1=true;
        }
    }
    
    public void b_aendern2_ActionPerformed(ActionEvent evt) {
        if (aendern2) {
            cp.revalidate();
            cp.repaint();
            cp.add(l_aendern7);
            cp.add(t_aendern4);
            cp.revalidate();
            cp.repaint();
            aendern2=false;
        }
        else {
            cp.revalidate();
            cp.repaint();            
            cp.remove(l_aendern7);
            cp.remove(t_aendern4);
            cp.revalidate();
            cp.repaint();
            aendern2=true;
        }
    }
    
    public void b_aendern3_ActionPerformed(ActionEvent evt) {
        if (aendern3) {
            cp.revalidate();
            cp.repaint();
            cp.add(l_aendern8);
            cp.add(t_aendern5);
            cp.revalidate();
            cp.repaint();
            aendern3=false;
        }
        else {
            cp.revalidate();
            cp.repaint();            
            cp.remove(l_aendern8);
            cp.remove(t_aendern5);
            cp.revalidate();
            cp.repaint();
            aendern3=true;
        }
    }
    
    public void b_aendern4_ActionPerformed(ActionEvent evt) {
        if (aendern4) {
            cp.revalidate();
            cp.repaint();
            cp.add(l_aendern9);
            cp.add(t_aendern6);
            cp.revalidate();
            cp.repaint();
            aendern4=false;
        }
        else {
            cp.revalidate();
            cp.repaint();            
            cp.remove(l_aendern9);
            cp.remove(t_aendern6);
            cp.revalidate();
            cp.repaint();
            aendern4=true;
        }
    }
    
    public void b_aendern5_ActionPerformed(ActionEvent evt) {
        if (aendern5) {
            cp.revalidate();
            cp.repaint();
            cp.add(l_aendern10);
            cp.add(t_aendern7);
            cp.revalidate();
            cp.repaint();
            aendern5=false;
        }
        else {
            cp.revalidate();
            cp.repaint();            
            cp.remove(l_aendern10);
            cp.remove(t_aendern7);
            cp.revalidate();
            cp.repaint();
            aendern5=true;
        }
    }
    
    public void b_aendern6_ActionPerformed(ActionEvent evt) {
        if (aendern6) {
            cp.revalidate();
            cp.repaint();
            cp.add(l_aendern11);
            cp.add(t_aendern8);
            cp.revalidate();
            cp.repaint();
            aendern6=false;
        }
        else {
            cp.revalidate();
            cp.repaint();            
            cp.remove(l_aendern11);
            cp.remove(t_aendern8);
            cp.revalidate();
            cp.repaint();
            aendern6=true;
        }
    }
    
    public void b_aendern7_ActionPerformed(ActionEvent evt) {
        if (aendern7) {
            cp.revalidate();
            cp.repaint();
            cp.add(l_aendern12);
            cp.add(t_aendern9);
            cp.revalidate();
            cp.repaint();
            aendern7=false;
        }
        else {
            cp.revalidate();
            cp.repaint();            
            cp.remove(l_aendern12);
            cp.remove(t_aendern9);
            cp.revalidate();
            cp.repaint();
            aendern7=true;
        }
    }
    
    public void b_aendern8_ActionPerformed(ActionEvent evt) {
        if (aendern8) {
            cp.revalidate();
            cp.repaint();
            cp.add(l_aendern13);
            cp.add(t_aendern10);
            cp.revalidate();
            cp.repaint();
            aendern8=false;
        }
        else {
            cp.revalidate();
            cp.repaint();            
            cp.remove(l_aendern13);
            cp.remove(t_aendern10);
            cp.revalidate();
            cp.repaint();
            aendern8=true;
        }
    }
    
    public void b_aendern9_ActionPerformed(ActionEvent evt) {
        if (aendern9) {
            cp.revalidate();
            cp.repaint();
            cp.add(l_aendern14);
            cp.add(t_aendern11);
            cp.revalidate();
            cp.repaint();
            aendern9=false;
        }
        else {
            cp.revalidate();
            cp.repaint();            
            cp.remove(l_aendern14);
            cp.remove(t_aendern11);
            cp.revalidate();
            cp.repaint();
            aendern9=true;
        }
    }
    
    public void b_aendern10_ActionPerformed(ActionEvent evt) {
        if (aendern10) {
            cp.revalidate();
            cp.repaint();
            cp.add(l_aendern15);
            cp.add(t_aendern12);
            cp.revalidate();
            cp.repaint();
            aendern10=false;
        }
        else {
            cp.revalidate();
            cp.repaint();            
            cp.remove(l_aendern15);
            cp.remove(t_aendern12);
            cp.revalidate();
            cp.repaint();
            aendern10=true;
        }
    }
    
    public void bMaskeLeeren_ActionPerformed(ActionEvent evt) {
        maskeLeeren();
    }

    public void b4_ActionPerformed(ActionEvent evt) {
        dispose();

    }

    public void b5_ActionPerformed(ActionEvent evt) {

    }
    
    
    public void zurueck_ActionPerformed(ActionEvent evt) {
        if (z==1) {
            l_start.setText("Willkommen in unserer Transfermarkt-Datenbank");
            cp.remove(t_name);
            cp.remove(b_name);
            cp.add(b_start);
            cp.revalidate();
            cp.repaint();
            z=0;
        }
        else if (z==2) {
            cp.remove(l_optionen);
            cp.remove(b_suchen);
            cp.remove(b_einfuegen);
            cp.remove(b_loeschen);
            cp.remove(b_aendern);
            cp.add(l_start);
            cp.add(b_name);
            cp.add(t_name);
            cp.revalidate();
            cp.repaint();
            z=1;
        }

        else if (z==3){
            cp.remove(l_suchen1);
            cp.remove(l_suchen2);
            cp.remove(b_all_suche);
            cp.remove(b_erw_suche);
            cp.remove(b_spe_suche);
            cp.revalidate();
            cp.repaint();
            cp.add(l_optionen);
            cp.add(b_suchen);
            cp.add(b_einfuegen);
            cp.add(b_loeschen);
            cp.add(b_aendern);
            z=2;
        }
        else if (z==4){
            cp.remove(l_su_all);
            cp.remove(b_su_all1);
            cp.remove(b_su_all2);
            cp.remove(b_su_all3);
            cp.remove(b_su_all4);
            cp.revalidate();
            cp.repaint();
            cp.add(l_suchen1);
            cp.add(l_suchen2);
            cp.add(b_all_suche);
            cp.add(b_erw_suche);
            cp.add(b_spe_suche);
            z=3;    
        }
        else if (z==5){
            cp.add(b_su_all1);
            cp.add(b_su_all2);
            cp.add(b_su_all3);
            cp.add(b_su_all4);
            cp.remove(scrollpane);
            cp.revalidate();
            cp.repaint();
            l_su_all.setText("Wähle die Tabelle aus, die du ausgeben lassen möchtest");
            cp.add(l_su_all);
            z=4;    
        }
        else if (z==6){
            cp.add(b_su_all1);
            cp.add(b_su_all2);
            cp.add(b_su_all3);
            cp.add(b_su_all4);
            cp.remove(scrollpane);
            cp.revalidate();
            cp.repaint();
            l_su_all.setText("Wähle die Tabelle aus, die du ausgeben lassen möchtest");
            cp.add(l_su_all);
            z=4;   
        }
        else if (z==7){
            cp.add(b_su_all1);
            cp.add(b_su_all2);
            cp.add(b_su_all3);
            cp.add(b_su_all4);
            cp.remove(scrollpane);
            cp.revalidate();
            cp.repaint();
            l_su_all.setText("Wähle die Tabelle aus, die du ausgeben lassen möchtest");
            cp.add(l_su_all);
            z=4;
        }
        else if (z==8){
            cp.add(b_su_all1);
            cp.add(b_su_all2);
            cp.add(b_su_all3);
            cp.add(b_su_all4);
            cp.remove(scrollpane);
            cp.revalidate();
            cp.repaint();
            l_su_all.setText("Wähle die Tabelle aus, die du ausgeben lassen möchtest");
            cp.add(l_su_all);
            z=4;
        }
        else if (z==9){
            
        }
        else if (z==10){
            
        }
        else if (z==11){
            cp.add(l_optionen);
            cp.add(b_suchen);
            cp.add(b_einfuegen);
            cp.add(b_loeschen);
            cp.add(b_aendern);
            cp.revalidate();
            cp.repaint();
            l_optionen.setText("Herzlich willkommen "+t_name.getText()+"! Wähle bitte aus, was du in unserer Datenbank machen möchtest:");
            cp.remove(b_ein_trainer);
            cp.remove(b_ein_sportart);
            cp.remove(b_ein_verein);
            cp.remove(b_ver_verein);
            cp.remove(l_einfuegen);
            z=2;    
        }
        else if (z==12){
            
        }
        else if (z==13){
            
        }
        else if (z==14){
            
        }
        else if (z==15){
            
        }
        else if (z==16){
            
        }
        else if (z==17){
            
        }
        else if (z==18){
            
        }
        else if (z==19){
            
        }
        else if (z==20){
            
        }
        else if (z==21){
            
        }
        else if (z==22){
            
        }
        else if (z==23){
            
        }
        else if (z==24){
            
        }
        else if (z==25){
            
        }
        else if (z==26){
            
        }
        else if (z==27){
            
        }
        else if (z==28){
            
        }
        else if (z==29){
            
        }
        else if (z==30){
            
        }
    }

    
    
    private void maskeLeeren() {
        t_name.setText("");
    }

    // Ende Methoden

}