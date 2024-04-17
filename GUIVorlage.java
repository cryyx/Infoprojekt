import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;

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
    
    
    
    private JTextField t_name = new JTextField();
    
    
    private JButton b_start = new JButton();
    private JButton b_name = new JButton();
    private JButton b_suchen = new JButton();    //Schüler
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
    
    
    private JButton bMaskeLeeren = new JButton();
    private JTextArea textfeld;
    // Ende Attribute
        
    Container cp;
    
    public GUIVorlage() {

        // Frame-Initialisierung
        super("Schulverwaltung");
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        int frameWidth = 900; 
        int frameHeight = 590;
        setSize(frameWidth, frameHeight);
        Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
        int x = (d.width - getSize().width) / 2;
        int y = (d.height - getSize().height) / 2;
        setLocation(x, y);
        cp = getContentPane();
        cp.setLayout(null);

        //Verwaltung/Datenbank
        schule=new Verwaltung();

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
        // JMenu menu2 = new JMenu("Lehrer einfügen");
        // // Menü wird der Menüleiste hinzugefügt
        // bar.add(menu2);
        // menu2.addActionListener(new ActionListener() {
        // public void actionPerformed(ActionEvent evt) {
        // menu2_ActionPerformed(evt);
        // }
        // });
        // JMenu menu3 = new JMenu("Kurs anlegen");
        // // Menü wird der Menüleiste hinzugefügt
        // bar.add(menu3);
        // JMenu menu4 = new JMenu("Kurs zuweisen");
        // // Menü wird der Menüleiste hinzugefügt
        // bar.add(menu4);
        // JMenu menu5 = new JMenu("Kursinfo");
        // // Menü wird der Menüleiste hinzugefügt
        // bar.add(menu5);
        // // Menüleiste wird für den Dialog gesetzt
        // meinJDialog.setJMenuBar(bar);
        // // Wir lassen unseren Dialog anzeigen
        // meinJDialog.setVisible(true);

        // Anfang Komponenten
        
         JTextArea textfeld = new JTextArea(5, 30);
         textfeld.setText("Lorem ipsum dolor sit amet");
        //Zeilenumbruch wird eingeschaltet
        textfeld.setLineWrap(true);
        //Zeilenumbrüche erfolgen nur nach ganzen Wörtern
        textfeld.setWrapStyleWord(true);
        
        //Ein JScrollPane, der das Textfeld beinhaltet, wird erzeugt
        JScrollPane scrollpane = new JScrollPane(textfeld); 
        cp.add(scrollpane);
        cp.add(textfeld);
        textfeld.paste();
        
        
        
        l_start.setBounds(90, 10, 800, 23);
        l_start.setText("Willkommen in unserer Transfermarkt-Datenbank");
        l_start.setFont(new Font("Arial", Font.PLAIN, 17));
        cp.add(l_start);
        
        l_optionen.setBounds(90, 10, 800, 23);
        l_optionen.setFont(new Font("Arial", Font.PLAIN, 17));
        
        
        
        l_suchen1.setBounds(90, 10, 800, 23);
        l_suchen1.setText("Wir bieten in unserer Datenbank verschiedene Such-Optionen an!");
        l_suchen1.setFont(new Font("Arial", Font.PLAIN, 17));
        
        l_suchen2.setBounds(90, 25, 800, 23);
        l_suchen2.setText("Bitte entscheide dich für eine der drei unten stehenden Arten:");
        l_suchen2.setFont(new Font("Arial", Font.PLAIN, 17));
        
        l_su_all.setBounds(90, 17, 800, 23);
        l_su_all.setText("Wähle die Tabelle aus, die du ausgeben lassen möchtest");
        l_su_all.setFont(new Font("Arial", Font.PLAIN, 17));
        
        t_name.setBounds(100, 40, 230, 30);
        t_name.setText("");
        t_name.setFont(new Font("Arial", Font.PLAIN, 17));
        
        
        b_name.setBounds(100, 90, 115, 33);
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
                    menue1_ActionPerformed(evt);
                }
            });
        b_einfuegen.setFont(new Font("Dialog", Font.PLAIN, 13));
        
        b_loeschen.setBounds(516, 180, 115, 33);
        b_loeschen.setText("Daten löschen");
        b_loeschen.setMargin(new Insets(2, 2, 2, 2));
        b_loeschen.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent evt) {
                    menue1_ActionPerformed(evt);
                }
            });
        b_loeschen.setFont(new Font("Dialog", Font.PLAIN, 13));
        
        b_aendern.setBounds(750, 180, 115, 33);
        b_aendern.setText("Daten ändern");
        b_aendern.setMargin(new Insets(2, 2, 2, 2));
        b_aendern.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent evt) {
                    menue1_ActionPerformed(evt);
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
        
        b_start.setBounds(230, 50, 115, 33);
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
    }
    
    public void b_su_all1_ActionPerformed(ActionEvent evt) {
        cp.remove(b_su_all1);
        cp.remove(b_su_all2);
        cp.remove(b_su_all3);
        cp.remove(b_su_all4);
        cp.revalidate();
        cp.repaint();
        System.out.println("test");
        l_su_all.setText("Hier sind deine Ergebnisse:");
        cp.add(l_su_all);
    }
    
    public void b_su_all2_ActionPerformed(ActionEvent evt) {
        cp.remove(b_su_all1);
        cp.remove(b_su_all2);
        cp.remove(b_su_all3);
        cp.remove(b_su_all4);
        l_su_all.setText("Hier sind deine Ergebnisse:");
        cp.revalidate();
        cp.repaint();
    }
    
    public void b_su_all3_ActionPerformed(ActionEvent evt) {
        cp.remove(b_su_all1);
        cp.remove(b_su_all2);
        cp.remove(b_su_all3);
        cp.remove(b_su_all4);
        l_su_all.setText("Hier sind deine Ergebnisse:");
        cp.revalidate();
        cp.repaint();
    }
    
    public void b_su_all4_ActionPerformed(ActionEvent evt) {
        cp.remove(b_su_all1);
        cp.remove(b_su_all2);
        cp.remove(b_su_all3);
        cp.remove(b_su_all4);
        l_su_all.setText("Hier sind deine Ergebnisse:");
        cp.revalidate();
        cp.repaint();
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
    }
    
    public void bMaskeLeeren_ActionPerformed(ActionEvent evt) {
        maskeLeeren();
    }

    public void b4_ActionPerformed(ActionEvent evt) {
        dispose();

    }

    public void b5_ActionPerformed(ActionEvent evt) {

    }

    private void maskeLeeren() {
        t_name.setText("");
    }

    // Ende Methoden

}