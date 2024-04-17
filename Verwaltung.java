import java.util.Scanner;
public class Verwaltung {
    //Test
    DatabaseConnector meinConnector;
    Scanner sc;
    public Verwaltung(){
        /**Ein Objekt der Klasse DatabaseConnector wird erstellt.
         *SQLite verlangt als einzige Angabe den Namen der Datei!
         *Die anderen Angaben sind irrelevant.
         */  
        meinConnector = new DatabaseConnector("", 0, "Transfermarkt.db", "", "");
        sc=new Scanner(System.in);
    }

    public void aktuelleFehlermeldung(){
        /**
         *Zur Sicherheit sollten wir sehr häufig die Fehlermeldungen der Datenbank prüfen.
         */
        System.out.println(meinConnector.getErrorMessage());
        /**
         *Das Ergebnis wird auf der Konsole angezeigt.
         */
    }
    
    public void test(){
        String auftrag="Select VID, SpID from hat where VID=1 OR VID=4 OR VID=4";
        aktuelleFehlermeldung();
        sqlBefehlAusfuehren(auftrag);
        String auftrag1="Hello";
        auftrag1.concat("World");
        System.out.println(auftrag1);
        String s1 = "Hello ";
        s1=s1.concat("World");
        System.out.println(s1);
    }
    
    public void sqlBefehlAusfuehren(String sqlBefehl){
        meinConnector.executeStatement(sqlBefehl);  //Die Methode executeStatement der Klasse DatabaseConnector wird ausgeführt. Der sql-Befehl wird als String übergeben.

        for (int i=0; i<meinConnector.getCurrentQueryResult().getRowCount(); i=i+1) {               //verschachtelte for-Schleifen, die das 'QueryResult' auslesen.

            for (int j=0; j<meinConnector.getCurrentQueryResult().getColumnCount(); j=j+1) {
                System.out.print(meinConnector.getCurrentQueryResult().getData()[i][j]+" ");

            }
            System.out.println();
        }
    }

    public void Ausgeben(){        //Nur, um zu sehen, wie es geht...
        System.out.println("Möchtest du in die erweiterte Suche (e) oder dir ganze Tabellen (g) ausgeben lassen? Wenn du dir ausgeben lassen möchtest, welche Vereine welche Sportarten anbieten oder umgekehrt, gebe bitte 's' ein!");
        String abfrage=sc.nextLine();
        if (abfrage.equals("g")) {
            System.out.println("Bitte gebe die Tabelle an, die ausgegeben werden soll.");
            String x=sc.nextLine();
            String auftrag="select * from "+x;
            sqlBefehlAusfuehren(auftrag);
        }
        else if (abfrage.equals("e")) {
            System.out.println("In welcher Tabelle möchtest du die erweiterte Suche verwenden?");
            String tabelle=sc.nextLine();
            if(tabelle.equals("Verein")){
                String auftrag="Select ";
                System.out.println("Möchtest du das Budget ausgeben lassen?");
                String budget_a=sc.nextLine();
                if(budget_a.equals("ja")){
                    auftrag=auftrag.concat("Budget, ");
                }
                System.out.println("Möchtest du den Namen ausgeben lassen?");
                String name_a=sc.nextLine();
                if(name_a.equals("ja")) {
                    auftrag=auftrag.concat("Name, ");
                }
                auftrag=auftrag.concat("VID from Verein Where ");
                System.out.println("Möchtest du nach dem Budget filtern?");
                String budget=sc.nextLine();
                if (budget.equals("ja")){
                    System.out.println("Was ist das Mindestbudget?");
                    String min=sc.nextLine();
                    System.out.println("Was ist das maximale Budget?");
                    String max=sc.nextLine();
                    auftrag=auftrag.concat("Budget>="+min+" AND Budget<="+max+" AND ");
                }
                System.out.println("Möchtest du nach dem Namen filtern?");
                String name=sc.nextLine();
                if (name.equals("ja")){
                        String nam_weiter="ja";
                        while (nam_weiter.equals("ja")) {
                            System.out.println("Gebe bitte den Namen oder Bestandteile des Namens unten ein. Solltest du nur den Anfang und das Ende des Namens kennen, gebe bitte ein 'ausnahme'");
                            String name_filter=sc.nextLine();
                            if (name_filter.equals("ausnahme")) {
                                System.out.println("Gebe bitte den Anfang des Namens ein!");
                                String anfang=sc.nextLine();
                                System.out.println("Gebe bitte das Ende des Namens ein!");
                                String ende=sc.nextLine();
                                auftrag=auftrag.concat("Name Like '%"+anfang+"%"+ende+"%' Or ");
                                System.out.println("Wenn du einen weiteren Namen zu deinem Filter hinzufügen möchtest, dann schreibe jetzt 'ja':");
                                nam_weiter=sc.nextLine();
                            }
                            else {
                                auftrag=auftrag.concat("Name Like '%"+name_filter+"%' Or ");
                                System.out.println("Wenn du einen weiteren Namen zu deinem Filter hinzufügen möchtest, dann schreibe jetzt 'ja':");
                                nam_weiter=sc.nextLine();
                            }
                        }
                        auftrag=auftrag.concat("0=5 AND ");
                }
                auftrag=auftrag.concat("VID>-1");
                System.out.println(auftrag);
                sqlBefehlAusfuehren(auftrag);
            }
            else if(tabelle.equals("Sportart")){
                String auftrag="Select ";
                System.out.println("Möchtest du den Namen ausgeben lassen?");
                String name_a=sc.nextLine();
                if(name_a.equals("ja")){
                    auftrag=auftrag.concat("Name, ");
                }
                System.out.println("Möchtest du die Popularität ausgeben lassen?");
                String pop_a=sc.nextLine();
                if(pop_a.equals("ja")) {
                    auftrag=auftrag.concat("Popularität, ");
                }
                System.out.println("Möchtest du die Ballgröße ausgeben lassen?");
                String bg_a=sc.nextLine();
                if(bg_a.equals("ja")) {
                    auftrag=auftrag.concat("Ballgröße, ");
                }
                auftrag=auftrag.concat("SpID from Sportart Where ");
                System.out.println("Möchtest du nach der Ballgröße filtern?");
                String bg=sc.nextLine();
                if (bg.equals("ja")){
                    System.out.println("Was ist die Mindestgröße?");
                    String min=sc.nextLine();
                    System.out.println("Was ist die maximale Größe?");
                    String max=sc.nextLine();
                    auftrag=auftrag.concat("Ballgröße>="+min+" AND Ballgröße<="+max+" AND ");
                }
                System.out.println("Möchtest du nach dem Namen filtern?");
                String name=sc.nextLine();
                if (name.equals("ja")){
                        String nam_weiter="ja";
                        while (nam_weiter.equals("ja")) {
                            System.out.println("Gebe bitte den Namen oder Bestandteile des Namens unten ein. Solltest du nur den Anfang und das Ende des Namens kennen, gebe bitte ein 'ausnahme'");
                            String name_filter=sc.nextLine();
                            if (name_filter.equals("ausnahme")) {
                                System.out.println("Gebe bitte den Anfang des Namens ein!");
                                String anfang=sc.nextLine();
                                System.out.println("Gebe bitte das Ende des Namens ein!");
                                String ende=sc.nextLine();
                                auftrag=auftrag.concat("Name Like '%"+anfang+"%"+ende+"%' Or ");
                                System.out.println("Wenn du einen weiteren Namen zu deinem Filter hinzufügen möchtest, dann schreibe jetzt 'ja':");
                                nam_weiter=sc.nextLine();
                            }
                            else {
                                auftrag=auftrag.concat("Name Like '%"+name_filter+"%' Or ");
                                System.out.println("Wenn du einen weiteren Namen zu deinem Filter hinzufügen möchtest, dann schreibe jetzt 'ja':");
                                nam_weiter=sc.nextLine();
                            }
                        }
                        auftrag=auftrag.concat("0=5 AND ");
                }
                System.out.println("Möchtest du nach der Popularität filtern?");
                String pop=sc.nextLine();
                if (pop.equals("ja")){
                    String pop_in="Popularität in (";
                    String pop_weiter="ja";
                    while (pop_weiter.equals("ja")){
                        System.out.println("Gebe bitte die gewünschte Popularität ein:");
                        String popu=sc.nextLine();
                        pop_in=pop_in.concat("'"+popu+"', ");
                        System.out.println("Möchtest du noch eine weitere Popularität eingeben?");
                        pop_weiter=sc.nextLine();
                    }
                    pop_in=pop_in.concat("null) AND ");
                    auftrag=auftrag.concat(pop_in);
                }
                auftrag=auftrag.concat("SpID>-1");
                System.out.println(auftrag);
                sqlBefehlAusfuehren(auftrag);
            }
            else if(tabelle.equals("Trainer")){
                String auftrag="Select ";
                System.out.println("Möchtest du den Vornamen ausgeben lassen?");
                String vorname_a=sc.nextLine();
                if(vorname_a.equals("ja")) {
                    auftrag=auftrag.concat("Vorname, ");
                }
                System.out.println("Möchtest du den Namen ausgeben lassen?");
                String name_a=sc.nextLine();
                if(name_a.equals("ja")){
                    auftrag=auftrag.concat("Name, ");
                }
                System.out.println("Möchtest du das Gehalt ausgeben lassen?");
                String g_a=sc.nextLine();
                if(g_a.equals("ja")) {
                    auftrag=auftrag.concat("Gehalt, ");
                }
                System.out.println("Möchtest du die Nationalität ausgeben lassen?");
                String n_a=sc.nextLine();
                if(n_a.equals("ja")) {
                    auftrag=auftrag.concat("Nationalität, ");
                }
                System.out.println("Möchtest du den Verein ausgeben lassen?");
                String v_a=sc.nextLine();
                if(v_a.equals("ja")) {
                    auftrag=auftrag.concat("VID, ");
                }
                System.out.println("Möchtest du die Sportart ausgeben lassen?");
                String s_a=sc.nextLine();
                if(s_a.equals("ja")) {
                    auftrag=auftrag.concat("SpID, ");
                }
                auftrag=auftrag.concat("TID from Trainer Where ");
                System.out.println("Möchtest du nach dem Namen filtern?");
                String name=sc.nextLine();
                if (name.equals("ja")){
                        String nam_weiter="ja";
                        while (nam_weiter.equals("ja")) {
                            System.out.println("Gebe bitte den Namen oder Bestandteile des Namens unten ein. Solltest du nur den Anfang und das Ende des Namens kennen, gebe bitte ein 'ausnahme'");
                            String name_filter=sc.nextLine();
                            if (name_filter.equals("ausnahme")) {
                                System.out.println("Gebe bitte den Anfang des Namens ein!");
                                String anfang=sc.nextLine();
                                System.out.println("Gebe bitte das Ende des Namens ein!");
                                String ende=sc.nextLine();
                                auftrag=auftrag.concat("Name Like '%"+anfang+"%"+ende+"%' Or ");
                                System.out.println("Wenn du einen weiteren Namen zu deinem Filter hinzufügen möchtest, dann schreibe jetzt 'ja':");
                                nam_weiter=sc.nextLine();
                            }
                            else {
                                auftrag=auftrag.concat("Name Like '%"+name_filter+"%' Or ");
                                System.out.println("Wenn du einen weiteren Namen zu deinem Filter hinzufügen möchtest, dann schreibe jetzt 'ja':");
                                nam_weiter=sc.nextLine();
                            }
                        }
                        auftrag=auftrag.concat("0=5 AND ");
                }
                System.out.println("Möchtest du nach dem Vornamen filtern?");
                String vname=sc.nextLine();
                if (vname.equals("ja")){
                        String vnam_weiter="ja";
                        while (vnam_weiter.equals("ja")) {
                            System.out.println("Gebe bitte den Vornamen oder Bestandteile des Vornamens unten ein. Solltest du nur den Anfang und das Ende des Vornamens kennen, gebe bitte ein 'ausnahme'");
                            String vname_filter=sc.nextLine();
                            if (vname_filter.equals("ausnahme")) {
                                System.out.println("Gebe bitte den Anfang des Vornamens ein!");
                                String anfang=sc.nextLine();
                                System.out.println("Gebe bitte das Ende des Vornamens ein!");
                                String ende=sc.nextLine();
                                auftrag=auftrag.concat("Vorname Like '%"+anfang+"%"+ende+"%' Or ");
                                System.out.println("Wenn du einen weiteren Vornamen zu deinem Filter hinzufügen möchtest, dann schreibe jetzt 'ja':");
                                vnam_weiter=sc.nextLine();
                            }
                            else {
                                auftrag=auftrag.concat("Vorname Like '%"+vname_filter+"%' Or ");
                                System.out.println("Wenn du einen weiteren Vornamen zu deinem Filter hinzufügen möchtest, dann schreibe jetzt 'ja':");
                                vnam_weiter=sc.nextLine();
                            }
                        }
                        auftrag=auftrag.concat("0=5 AND ");
                }
                System.out.println("Möchtest du nach dem Gehalt filtern?");
                String gehalt=sc.nextLine();
                if (gehalt.equals("ja")){
                    System.out.println("Was ist das Mindestgehalt?");
                    String min=sc.nextLine();
                    System.out.println("Was ist das maximale Gehalt?");
                    String max=sc.nextLine();
                    auftrag=auftrag.concat("Gehalt>="+min+" AND Gehalt<="+max+" AND ");
                }
                System.out.println("Möchtest du nach der Nationalität filtern?");
                String nat=sc.nextLine();
                if (nat.equals("ja")){
                    String nat_in="Nationalität in (";
                    String nat_weiter="ja";
                    while (nat_weiter.equals("ja")){
                        System.out.println("Gebe bitte die gewünschte Nationalität ein:");
                        String nati=sc.nextLine();
                        nat_in=nat_in.concat("'"+nati+"', ");
                        System.out.println("Möchtest du noch eine weitere Nationalität eingeben?");
                        nat_weiter=sc.nextLine();
                    }
                    nat_in=nat_in.concat("null) AND ");
                    auftrag=auftrag.concat(nat_in);
                }
                System.out.println("Möchtest du nach dem Verein filtern?");
                String ver=sc.nextLine();
                if (ver.equals("ja")){
                    String ver_in="VID in (";
                    String ver_weiter="ja";
                    while (ver_weiter.equals("ja")){
                        System.out.println("Gebe bitte den gewünschten Verein ein:");
                        String verein=sc.nextLine();
                        String verein_id="select VID from Verein where Name like '"+verein+"'";
                        meinConnector.executeStatement(verein_id);
                        aktuelleFehlermeldung();
                        verein=meinConnector.getCurrentQueryResult().getData()[0][0];
                        ver_in=ver_in.concat("'"+verein+"', ");
                        System.out.println("Möchtest du noch einen weiteren Verein eingeben?");
                        ver_weiter=sc.nextLine();
                    }
                    ver_in=ver_in.concat("null) AND ");
                    auftrag=auftrag.concat(ver_in);
                }
                System.out.println("Möchtest du nach der Sportart filtern?");
                String spo=sc.nextLine();
                if (spo.equals("ja")){
                    String spo_in="SpID in (";
                    String spo_weiter="ja";
                    while (spo_weiter.equals("ja")){
                        System.out.println("Gebe bitte die gewünschte Sportart ein:");
                        String sportart=sc.nextLine();
                        String sportart_id="select SpID from Sportart where Name like '"+sportart+"'";
                        meinConnector.executeStatement(sportart_id);
                        aktuelleFehlermeldung();
                        sportart=meinConnector.getCurrentQueryResult().getData()[0][0];
                        spo_in=spo_in.concat("'"+sportart+"', ");
                        System.out.println("Möchtest du noch eine weitere Sportart eingeben?");
                        spo_weiter=sc.nextLine();
                    }
                    spo_in=spo_in.concat("null) AND ");
                    auftrag=auftrag.concat(spo_in);
                }
                auftrag=auftrag.concat("TID>-1");
                System.out.println(auftrag);
                sqlBefehlAusfuehren(auftrag);
            }
            else if(tabelle.equals("Spieler")){
                String auftrag="Select ";
                System.out.println("Möchtest du den Vornamen ausgeben lassen?");
                String vorname_a=sc.nextLine();
                if(vorname_a.equals("ja")) {
                    auftrag=auftrag.concat("Vorname, ");
                }
                System.out.println("Möchtest du den Namen ausgeben lassen?");
                String name_a=sc.nextLine();
                if(name_a.equals("ja")){
                    auftrag=auftrag.concat("Name, ");
                }
                System.out.println("Möchtest du das Gehalt ausgeben lassen?");
                String g_a=sc.nextLine();
                if(g_a.equals("ja")) {
                    auftrag=auftrag.concat("Gehalt, ");
                }
                System.out.println("Möchtest du den Preis ausgeben lassen?");
                String p_a=sc.nextLine();
                if(p_a.equals("ja")) {
                    auftrag=auftrag.concat("Preis, ");
                }
                System.out.println("Möchtest du die Position ausgeben lassen?");
                String po_a=sc.nextLine();
                if(po_a.equals("ja")) {
                    auftrag=auftrag.concat("Position, ");
                }
                System.out.println("Möchtest du die Nationalität ausgeben lassen?");
                String n_a=sc.nextLine();
                if(n_a.equals("ja")) {
                    auftrag=auftrag.concat("Nationalität, ");
                }
                System.out.println("Möchtest du den Verein ausgeben lassen?");
                String v_a=sc.nextLine();
                if(v_a.equals("ja")) {
                    auftrag=auftrag.concat("SVID, ");
                }
                System.out.println("Möchtest du den Leihverein ausgeben lassen?");
                String Lv_a=sc.nextLine();
                if(Lv_a.equals("ja")) {
                    auftrag=auftrag.concat("LVID, ");
                }
                System.out.println("Möchtest du den Gerüchtsverein ausgeben lassen?");
                String Gv_a=sc.nextLine();
                if(Gv_a.equals("ja")) {
                    auftrag=auftrag.concat("GVID, ");
                }
                System.out.println("Möchtest du die Sportart ausgeben lassen?");
                String s_a=sc.nextLine();
                if(s_a.equals("ja")) {
                    auftrag=auftrag.concat("SpID, ");
                }
                auftrag=auftrag.concat("SID from Spieler Where ");
                System.out.println("Möchtest du nach dem Namen filtern?");
                String name=sc.nextLine();
                if (name.equals("ja")){
                        String nam_weiter="ja";
                        while (nam_weiter.equals("ja")) {
                            System.out.println("Gebe bitte den Namen oder Bestandteile des Namens unten ein. Solltest du nur den Anfang und das Ende des Namens kennen, gebe bitte ein 'ausnahme'");
                            String name_filter=sc.nextLine();
                            if (name_filter.equals("ausnahme")) {
                                System.out.println("Gebe bitte den Anfang des Namens ein!");
                                String anfang=sc.nextLine();
                                System.out.println("Gebe bitte das Ende des Namens ein!");
                                String ende=sc.nextLine();
                                auftrag=auftrag.concat("Name Like '%"+anfang+"%"+ende+"%' Or ");
                                System.out.println("Wenn du einen weiteren Namen zu deinem Filter hinzufügen möchtest, dann schreibe jetzt 'ja':");
                                nam_weiter=sc.nextLine();
                            }
                            else {
                                auftrag=auftrag.concat("Name Like '%"+name_filter+"%' Or ");
                                System.out.println("Wenn du einen weiteren Namen zu deinem Filter hinzufügen möchtest, dann schreibe jetzt 'ja':");
                                nam_weiter=sc.nextLine();
                            }
                        }
                        auftrag=auftrag.concat("0=5 AND ");
                }
                System.out.println("Möchtest du nach dem Vornamen filtern?");
                String vname=sc.nextLine();
                if (vname.equals("ja")){
                        String vnam_weiter="ja";
                        while (vnam_weiter.equals("ja")) {
                            System.out.println("Gebe bitte den Vornamen oder Bestandteile des Vornamens unten ein. Solltest du nur den Anfang und das Ende des Vornamens kennen, gebe bitte ein 'ausnahme'");
                            String vname_filter=sc.nextLine();
                            if (vname_filter.equals("ausnahme")) {
                                System.out.println("Gebe bitte den Anfang des Vornamens ein!");
                                String anfang=sc.nextLine();
                                System.out.println("Gebe bitte das Ende des Vornamens ein!");
                                String ende=sc.nextLine();
                                auftrag=auftrag.concat("Vorname Like '%"+anfang+"%"+ende+"%' Or ");
                                System.out.println("Wenn du einen weiteren Vornamen zu deinem Filter hinzufügen möchtest, dann schreibe jetzt 'ja':");
                                vnam_weiter=sc.nextLine();
                            }
                            else {
                                auftrag=auftrag.concat("Vorname Like '%"+vname_filter+"%' Or ");
                                System.out.println("Wenn du einen weiteren Vornamen zu deinem Filter hinzufügen möchtest, dann schreibe jetzt 'ja':");
                                vnam_weiter=sc.nextLine();
                            }
                        }
                        auftrag=auftrag.concat("0=5 AND ");
                }
                System.out.println("Möchtest du nach dem Gehalt filtern?");
                String gehalt=sc.nextLine();
                if (gehalt.equals("ja")){
                    System.out.println("Was ist das Mindestgehalt?");
                    String min=sc.nextLine();
                    System.out.println("Was ist das maximale Gehalt?");
                    String max=sc.nextLine();
                    auftrag=auftrag.concat("Gehalt>="+min+" AND Gehalt<="+max+" AND ");
                }
                System.out.println("Möchtest du nach dem Preis filtern?");
                String preis=sc.nextLine();
                if (preis.equals("ja")){
                    System.out.println("Was ist der Mindestpreis?");
                    String min=sc.nextLine();
                    System.out.println("Was ist der maximale Preis?");
                    String max=sc.nextLine();
                    auftrag=auftrag.concat("Preis>="+min+" AND Preis<="+max+" AND ");
                }
                System.out.println("Möchtest du nach der Position filtern?");
                String pos=sc.nextLine();
                if (pos.equals("ja")){
                    String pos_in="Position in (";
                    String pos_weiter="ja";
                    while (pos_weiter.equals("ja")){
                        System.out.println("Gebe bitte die gewünschte Nationalität ein:");
                        String posi=sc.nextLine();
                        pos_in=pos_in.concat("'"+posi+"', ");
                        System.out.println("Möchtest du noch eine weitere Position eingeben?");
                        pos_weiter=sc.nextLine();
                    }
                    pos_in=pos_in.concat("null) AND ");
                    auftrag=auftrag.concat(pos_in);
                }
                System.out.println("Möchtest du nach der Nationalität filtern?");
                String nat=sc.nextLine();
                if (nat.equals("ja")){
                    String nat_in="Nationalität in (";
                    String nat_weiter="ja";
                    while (nat_weiter.equals("ja")){
                        System.out.println("Gebe bitte die gewünschte Nationalität ein:");
                        String nati=sc.nextLine();
                        nat_in=nat_in.concat("'"+nati+"', ");
                        System.out.println("Möchtest du noch eine weitere Nationalität eingeben?");
                        nat_weiter=sc.nextLine();
                    }
                    nat_in=nat_in.concat("null) AND ");
                    auftrag=auftrag.concat(nat_in);
                }
                System.out.println("Möchtest du nach dem Verein filtern?");
                String ver=sc.nextLine();
                if (ver.equals("ja")){
                    String ver_in="SVID in (";
                    String ver_weiter="ja";
                    while (ver_weiter.equals("ja")){
                        System.out.println("Gebe bitte den gewünschten Verein ein:");
                        String verein=sc.nextLine();
                        String verein_id="select VID from Verein where Name like '"+verein+"'";
                        meinConnector.executeStatement(verein_id);
                        aktuelleFehlermeldung();
                        verein=meinConnector.getCurrentQueryResult().getData()[0][0];
                        ver_in=ver_in.concat("'"+verein+"', ");
                        System.out.println("Möchtest du noch einen weiteren Verein eingeben?");
                        ver_weiter=sc.nextLine();
                    }
                    ver_in=ver_in.concat("null) AND ");
                    auftrag=auftrag.concat(ver_in);
                }
                System.out.println("Möchtest du nach dem Leiherein filtern?");
                String lver=sc.nextLine();
                if (lver.equals("ja")){
                    String lver_in="VID in (";
                    String lver_weiter="ja";
                    while (lver_weiter.equals("ja")){
                        System.out.println("Gebe bitte den gewünschten Leihverein ein:");
                        String verein=sc.nextLine();
                        String verein_id="select VID from Verein where Name like '"+verein+"'";
                        meinConnector.executeStatement(verein_id);
                        aktuelleFehlermeldung();
                        verein=meinConnector.getCurrentQueryResult().getData()[0][0];
                        lver_in=lver_in.concat("'"+verein+"', ");
                        System.out.println("Möchtest du noch einen weiteren Leiherein eingeben?");
                        lver_weiter=sc.nextLine();
                    }
                    lver_in=lver_in.concat("null) AND ");
                    auftrag=auftrag.concat(lver_in);
                }
                System.out.println("Möchtest du nach dem Gerüchtsverein filtern?");
                String gver=sc.nextLine();
                if (gver.equals("ja")){
                    String gver_in="VID in (";
                    String gver_weiter="ja";
                    while (gver_weiter.equals("ja")){
                        System.out.println("Gebe bitte den gewünschten Gerüchtsverein ein:");
                        String verein=sc.nextLine();
                        String verein_id="select VID from Verein where Name like '"+verein+"'";
                        meinConnector.executeStatement(verein_id);
                        aktuelleFehlermeldung();
                        verein=meinConnector.getCurrentQueryResult().getData()[0][0];
                        gver_in=gver_in.concat("'"+verein+"', ");
                        System.out.println("Möchtest du noch einen weiteren Gerüchtsverein eingeben?");
                        gver_weiter=sc.nextLine();
                    }
                    gver_in=gver_in.concat("null) AND ");
                    auftrag=auftrag.concat(gver_in);
                }
                System.out.println("Möchtest du nach der Sportart filtern?");
                String spo=sc.nextLine();
                if (spo.equals("ja")){
                    String spo_in="SpID in (";
                    String spo_weiter="ja";
                    while (spo_weiter.equals("ja")){
                        System.out.println("Gebe bitte die gewünschte Sportart ein:");
                        String sportart=sc.nextLine();
                        String sportart_id="select SpID from Sportart where Name like '"+sportart+"'";
                        meinConnector.executeStatement(sportart_id);
                        aktuelleFehlermeldung();
                        sportart=meinConnector.getCurrentQueryResult().getData()[0][0];
                        spo_in=spo_in.concat("'"+sportart+"', ");
                        System.out.println("Möchtest du noch eine weitere Sportart eingeben?");
                        spo_weiter=sc.nextLine();
                    }
                    spo_in=spo_in.concat("null) AND ");
                    auftrag=auftrag.concat(spo_in);
                }
                auftrag=auftrag.concat("SID>-1");
                System.out.println(auftrag);
                aktuelleFehlermeldung();
                sqlBefehlAusfuehren(auftrag);
            }
        }
        else if (abfrage.equals("s")) {
            System.out.println("Möchtest du dir die gesamte Liste (g) mit Vereinen und Sportarten angucken oder möchtest du nach einem der Attribute filtern (f)?");
            String s_abfrage=sc.nextLine();
            if(s_abfrage.equals("g")){
                System.out.println("Vereine (links) und zugehörige Sportarten (rechts):");
                String auftrag="Select * from hat";
                sqlBefehlAusfuehren(auftrag);
            }
            else if (s_abfrage.equals("f")) {
                String auftrag="Select ";
                System.out.println("Willst du am Ende, also nach dem Filtern, die Vereine mit ausgeben lassen?");
                String vereine=sc.nextLine();
                System.out.println("Willst du am Ende, also nach dem Filtern, die Sportarten mit ausgeben lassen?");
                String sportarten=sc.nextLine();
                if (vereine.equals("ja") ) {
                    if(sportarten.equals("ja")) {
                        auftrag=auftrag.concat("VID, SpID From hat Where ");
                    }
                    else {
                        auftrag=auftrag.concat("VID From hat Where ");
                    }
                }
                else if (sportarten.equals("ja")) {
                    auftrag=auftrag.concat("SpID From hat Where ");
                }
                System.out.println("Nach welchem Attribut willst du filtern, Verein oder Sportart?");
                String filter=sc.nextLine();
                String weiter="ja";
                while (weiter.equals("ja") && filter.equals("Verein")) {
                    System.out.println("Nach welchem Verein möchtest du Filtern?");
                    String verein_filter=sc.nextLine();
                    String verein_id="select VID from Verein where Name like '"+verein_filter+"'";
                    meinConnector.executeStatement(verein_id);
                    aktuelleFehlermeldung();
                    verein_filter=meinConnector.getCurrentQueryResult().getData()[0][0];
                    auftrag=auftrag.concat("VID="+verein_filter+" Or ");
                    System.out.println("Wenn du einen weiteren Verein zu deinem Filter hinzufügen möchtest, dann schreibe jetzt 'ja':");
                    weiter=sc.nextLine();
                }
                while (weiter.equals("ja") && filter.equals("Sportart")) {
                    System.out.println("Nach welcher Sportart möchtest du Filtern?");
                    String sportart_filter=sc.nextLine();
                    String sportart_id="select SpID from Sportart where Name like '"+sportart_filter+"'";
                    meinConnector.executeStatement(sportart_id);
                    aktuelleFehlermeldung();
                    sportart_filter=meinConnector.getCurrentQueryResult().getData()[0][0];
                    auftrag=auftrag.concat("SpID="+sportart_filter+" Or ");
                    System.out.println("Wenn du eine weitere Sportart zu deinem Filter hinzufügen möchtest, dann schreibe jetzt 'ja':");
                    weiter=sc.nextLine();
                }
                auftrag=auftrag.concat("VID=-20");
                System.out.println(auftrag);
                sqlBefehlAusfuehren(auftrag);
            }
            else {
                System.out.println("Bitte wähle nächstes Mal eine der beiden Antwortmöglichkeiten aus!");
            }
        }
        else {
            System.out.println("Bitte gebe eine der Antwortmöglichkeiten (in den Klammern) ein, möchtest du die Aussage erneut starten?");
            String neu=sc.nextLine();
            if (neu.equals("ja")) {
                Ausgeben();
            }
        }
    }
    
    public void loeschen(){
        System.out.println("Herzlich willkommen im Lösch-Menü unserer Datenbank. Ein Warnhinweis vorab: das Löschen deiner Daten ist permanent und Sie sind nicht wiederherstellbar, überlege es dir also gut! Bist du sicher, dass du fortfahren möchtest?");
        String eins=sc.nextLine();
        if (eins.equals("ja")){
            System.out.println("Bist du wirklich ganz sicher?");
            String zwei=sc.nextLine();
            if (zwei.equals("ja")){
                System.out.println("Also wirklich sehr sicher, deine Daten gehen sonst für immer verloren (oder werden von uns ins Darknet gestellt)");
                String drei=sc.nextLine();
                if (drei.equals("ja")) {
                    System.out.println("Da du dir sehr sicher zu sein scheinst, kannst du nun deine Daten löschen!");
                    System.out.println("Zu deiner Sicherheit und zu der, der anderen Datenbanknutzer kannst du deine Daten nur über deine persönliche ID löschen. Nenne bitte zu erst deine Art des Objektes, welches du löschen möchtest:");
                    String vier=sc.nextLine();
                    System.out.println("Bestätige die Art des Objektes:");
                    String fuenf=sc.nextLine();
                    if(vier.equals(fuenf)){
                        if(vier.equals("Spieler")) {
                            System.out.println("Bitte gebe die ID des Spielers ein!");
                            String SID=sc.nextLine();
                            System.out.println("Bitte gebe den Bestätigungscode ein, den wir dir per E-Mail geschickt haben (da die Datenbank keine E-Mails unterstützt ist der Bestätigungscode deine ID)");
                            String code=sc.nextLine();
                            while (!(code.equals("abbrechen"))){
                                if (SID.equals(code)){
                                    System.out.println("das Löschen des Objekts wird jetzt vorbereitet...");
                                    String auftrag="Delete from Spieler where SID ="+SID;
                                    meinConnector.executeStatement(auftrag);
                                    aktuelleFehlermeldung();
                                    code="abbrechen";
                                    System.out.println("das Löschen des Objekts war erfolgreich!");
                                }
                                else {
                                    System.out.println("Dein Code war falsch, gebe ihn bitte erneut ein oder gebe abbrechen ein, um das Menü zu verlassen!");
                                }
                            }
                        }
                        else if(vier.equals("Trainer")){
                            System.out.println("Bitte gebe die ID des Trainers ein!");
                            String TID=sc.nextLine();
                            System.out.println("Bitte gebe den Bestätigungscode ein, den wir dir per E-Mail geschickt haben (da die Datenbank keine E-Mails unterstützt ist der Bestätigungscode deine ID)");
                            String code=sc.nextLine();
                            while (!(code.equals("abbrechen"))){
                                if (TID.equals(code)){
                                    System.out.println("das Löschen des Objekts wird jetzt vorbereitet...");
                                    String auftrag="Delete from Trainer where TID ="+TID;
                                    meinConnector.executeStatement(auftrag);
                                    aktuelleFehlermeldung();
                                    code="abbrechen";
                                    System.out.println("das Löschen des Objekts war erfolgreich!");
                                }
                                else {
                                    System.out.println("Dein Code war falsch, gebe ihn bitte erneut ein oder gebe abbrechen ein, um das Menü zu verlassen!");
                                }
                            }
                        }
                        else if(vier.equals("Verein")){
                            System.out.println("Bitte gebe die ID des Vereins ein!");
                            String VID=sc.nextLine();
                            System.out.println("Bitte gebe den Bestätigungscode ein, den wir dir per E-Mail geschickt haben (da die Datenbank keine E-Mails unterstützt ist der Bestätigungscode deine ID)");
                            String code=sc.nextLine();
                            while (!(code.equals("abbrechen"))){
                                if (VID.equals(code)){
                                    System.out.println("das Löschen des Objekts wird jetzt vorbereitet...");
                                    String auftrag="Delete from hat where VID ="+VID;
                                    meinConnector.executeStatement(auftrag);
                                    aktuelleFehlermeldung();
                                    auftrag="Update Spieler Set SVID=0 Where SVID="+VID;
                                    meinConnector.executeStatement(auftrag);
                                    aktuelleFehlermeldung();
                                    auftrag="Update Spieler Set LVID=0 Where LVID="+VID;
                                    meinConnector.executeStatement(auftrag);
                                    aktuelleFehlermeldung();
                                    auftrag="Update Spieler Set GVID=0 Where GVID="+VID;
                                    meinConnector.executeStatement(auftrag);
                                    aktuelleFehlermeldung();
                                    auftrag="Update Trainer Set VID=0 Where VID="+VID;
                                    meinConnector.executeStatement(auftrag);
                                    aktuelleFehlermeldung();
                                    auftrag="Delete from hat where VID ="+VID;
                                    meinConnector.executeStatement(auftrag);
                                    aktuelleFehlermeldung();
                                    auftrag="Delete from Verein where VID ="+VID;
                                    meinConnector.executeStatement(auftrag);
                                    aktuelleFehlermeldung();
                                    code="abbrechen";
                                    System.out.println("das Löschen des Objekts war erfolgreich!");
                                }
                                else {
                                    System.out.println("Dein Code war falsch, gebe ihn bitte erneut ein oder gebe abbrechen ein, um das Menü zu verlassen!");
                                }
                            }
                        }
                        else{
                            System.out.println("Leider gibt es diese Art von Objekt nicht oder du hast versucht eine Sportart zu löschen, was in dieser Datenbank grundsätzlich untersagt ist!");
                        }
                    }
                    else {
                        System.out.println("Deine Eingaben stimmten nicht überein!");
                    }
                }
            }
        }
    }
    
    
    /**
     * Alle nicht implementierten Methoden müssen geschrieben werden!
     */
    
    public void Einfuegen() {
        System.out.println("Was möchtest du einfügen?");
        String x=sc.nextLine();
        System.out.println(x);
        if (x.equals("Spieler")){
            System.out.println("Nachname des Spielers:");
            String pN=sc.nextLine();
            System.out.println("Vorname des Spielers:");
            String pV=sc.nextLine();
            System.out.println("Gehalt des Spielers:");
            String pG=sc.nextLine();
            System.out.println("Preis des Spielers:");
            String pP=sc.nextLine();
            System.out.println("Position des Spielers:");
            String pPo=sc.nextLine();
            System.out.println("Nationalität des Spielers:");
            String pNa=sc.nextLine();
            System.out.println("Verein des Spielers:");
            String pSv=sc.nextLine();
            String verein="select VID from Verein where Name like '"+pSv+"'";
            meinConnector.executeStatement(verein);
            aktuelleFehlermeldung();
            pSv=meinConnector.getCurrentQueryResult().getData()[0][0];
            System.out.println("An welchen Verein ist er geliehen (falls keinen, dann 0)?");
            String pLv=sc.nextLine();
            String leih_verein="select VID from Verein where Name like '"+pLv+"'";
            meinConnector.executeStatement(leih_verein);
            aktuelleFehlermeldung();
            pLv=meinConnector.getCurrentQueryResult().getData()[0][0];
            System.out.println("An welchen Verein gibt es Transfergerüchte (falls keinen dann 0)?");
            String pGv=sc.nextLine();
            String geruecht_verein="select VID from Verein where Name like '"+pGv+"'";
            meinConnector.executeStatement(geruecht_verein);
            aktuelleFehlermeldung();
            pGv=meinConnector.getCurrentQueryResult().getData()[0][0];
            System.out.println("Sportart des Spielers:");
            String pSp=sc.nextLine();
            String sportart="select SpID from Sportart where Name like '"+pSp+"'";
            meinConnector.executeStatement(sportart);
            aktuelleFehlermeldung();
            pSp=meinConnector.getCurrentQueryResult().getData()[0][0];
            String auftrag="INSERT INTO 'Spieler' ('SID', 'Name', 'Vorname', 'Gehalt', 'Preis','Position','Nationalität','SvID','LvID','GvID', 'SpID') VALUES (NULL, '"+pN+"', '"+pV+"', '"+pG+"', '"+pP+"', '"+pPo+"', '"+pNa+"', '"+pSv+"', '"+pLv+"', '"+pGv+"', '"+pSp+"')";
            meinConnector.executeStatement(auftrag);
            aktuelleFehlermeldung();
        }
        else if (x.equals("Verein")){
            System.out.println("Name des Vereins:");
            String pN=sc.nextLine();
            System.out.println("Budget des Vereins:");
            String pB=sc.nextLine();
            String auftrag="INSERT INTO 'Verein' ('VID' ,'Name', 'Budget') VALUES (NULL, '"+pN+"', '"+pB+"')";
            meinConnector.executeStatement(auftrag);
            aktuelleFehlermeldung();
            boolean mehr_sportarten=true;
            while (mehr_sportarten) {
                System.out.println("Welche Sportart soll der Verein haben?");
                String sportart=sc.nextLine();
                String VID="select VID from Verein where Name like '"+pN+"'";
                meinConnector.executeStatement(VID);
                aktuelleFehlermeldung();
                VID=meinConnector.getCurrentQueryResult().getData()[0][0];
                String SpID="select SpID from Sportart where name like '"+sportart+"'";
                meinConnector.executeStatement(SpID);
                aktuelleFehlermeldung();
                SpID=meinConnector.getCurrentQueryResult().getData()[0][0];
                String auftrag2="Insert Into 'hat' ('VID','SpID') VALUES ('"+VID+"', '"+SpID+"')";
                meinConnector.executeStatement(auftrag2);
                aktuelleFehlermeldung();
                System.out.println("Möchtest du noch eine weitere Sportart einfügen?");
                String abfrage=sc.nextLine();
                if (abfrage.equals("nein")) {
                    mehr_sportarten=false;
                }
                else {
                    
                }
            }
        }
        else if (x.equals("Sportart")){
            System.out.println("Name der Sportart:");
            String pN=sc.nextLine();
            System.out.println("Popularität der Sportart (niedrig, mittel, hoch, sehr hoch):");
            String pP=sc.nextLine();
            System.out.println("Ballgröße:");
            String pB=sc.nextLine();
            String auftrag="INSERT INTO 'Sportart' ('SpID' ,'Name', 'Popularität', 'Ballgröße') VALUES (NULL, '"+pN+"', '"+pP+"', '"+pB+"')";
            meinConnector.executeStatement(auftrag);
            aktuelleFehlermeldung();
        }
        else if (x.equals("Trainer")){
            System.out.println("Nachname des Trainers:");
            String pN=sc.nextLine();
            System.out.println("Vorname des Trainers:");
            String pV=sc.nextLine();
            System.out.println("Gehalt des Trainers:");
            String pG=sc.nextLine();
            System.out.println("Nationalität des Trainers:");
            String pNa=sc.nextLine();
            System.out.println("Verein des Trainers:");
            String pVID=sc.nextLine();
            String verein="select VID from Verein where Name like '"+pVID+"'";
            meinConnector.executeStatement(verein);
            aktuelleFehlermeldung();
            pVID=meinConnector.getCurrentQueryResult().getData()[0][0];
            System.out.println("Sportart:");
            String pSPID=sc.nextLine();
            String sportart="select SPID from Sportart where Name like '"+pSPID+"'";
            meinConnector.executeStatement(sportart);
            pSPID=meinConnector.getCurrentQueryResult().getData()[0][0];
            String auftrag="INSERT INTO 'Trainer' ('TID' ,'Name', 'Vorname', 'Gehalt', 'Nationalität', 'VID', 'SpID') VALUES (NULL, '"+pN+"', '"+pV+"', '"+pG+"', '"+pNa+"', '"+pVID+"', '"+pSPID+"')";
            meinConnector.executeStatement(auftrag);
            aktuelleFehlermeldung();
        }
        else{
            System.out.println("Es gibt diese Art von Objekt in der Datenbank nicht.");
        }
    }
    
    public void SpielerEinfuegen(String pN, String pV, int pG, int pP, String pPo, String pNa, int pSv, int pLv, int pGv, int pSp)      //Nur, um zu sehen, wie es geht...
    {
        String auftrag="INSERT INTO 'Spieler' ('SID', 'Name', 'Vorname', 'Gehalt', 'Preis','Position','Nationalität','SvID','LvID','GvID', 'SpID') VALUES (NULL, '"+pN+"', '"+pV+"', '"+pG+"', '"+pP+"', '"+pPo+"', '"+pNa+"', '"+pSv+"', '"+pLv+"', '"+pGv+"', '"+pSp+"')";
        meinConnector.executeStatement(auftrag);
        aktuelleFehlermeldung();
    }

    public void vereinEinfuegen(String pN, int pB)     //Alle Parameter übergeben
    {
        String auftrag="INSERT INTO 'Verein' ('VID' ,'Name', 'Budget') VALUES (NULL, '"+pN+"', '"+pB+"')";
        meinConnector.executeStatement(auftrag);
        aktuelleFehlermeldung();
    }

    public void sportartEinfuegen(String pN, String pP, int pB)   //Parameter übergeben
    {
        String auftrag="INSERT INTO 'Sportart' ('SpID' ,'Name', 'Popularität', 'Ballgröße') VALUES (NULL, '"+pN+"', '"+pP+"', '"+pB+"')";
        meinConnector.executeStatement(auftrag);
        aktuelleFehlermeldung();
    }
    
    public void trainerEinfuegen(String pN, String pV, int pG, String pNa, int pVID, int pSPID)   //Parameter übergeben
    {
        String auftrag="INSERT INTO 'Trainer' ('TID' ,'Name', 'Vorname', 'Gehalt', 'Nationalität', 'VID', 'SpID') VALUES (NULL, '"+pN+"', '"+pV+"', '"+pG+"', '"+pNa+"', '"+pVID+"', '"+pSPID+"')";
        meinConnector.executeStatement(auftrag);
        aktuelleFehlermeldung();
    }

    //und noch viele eigene Methoden schreiben ...
}

