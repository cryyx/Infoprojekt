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
        System.out.println("Bitte gebe die Tabelle an, die ausgegeben werden soll.");
        String x=sc.nextLine();
        String auftrag="select * from "+x;
        sqlBefehlAusfuehren(auftrag);
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
            System.out.println("An welchen Verein ist er geliehen (falls keinen, dann 0)?");
            String pLv=sc.nextLine();
            System.out.println("An welchen Verein gibt es Transfergerüchte (falls keinen dann 0)?");
            String pGv=sc.nextLine();
            System.out.println("Sportart des Spielers:");
            String pSp=sc.nextLine();
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
            String verein="Select 'VID' FROM 'Verein' WHERE 'Name' LIKE '"+pVID+"'";
            meinConnector.executeStatement(verein);
            aktuelleFehlermeldung();
            pVID=meinConnector.getCurrentQueryResult().toString();
            System.out.println("Sportart:");
            String pSPID=sc.nextLine();
            String sportart="Select 'SPID' FROM 'Sportart' WHERE 'Name' LIKE '"+pVID+"'";
            meinConnector.executeStatement(sportart);
            pVID=meinConnector.getCurrentQueryResult().toString();
            String auftrag="INSERT INTO 'Trainer' ('TID' ,'Name', 'Vorname', 'Gehalt', 'Nationalität', 'VID', 'SpID') VALUES (NULL, '"+pN+"', '"+pV+"', '"+pG+"', '"+pNa+"', '"+pVID+"', '"+pSPID+"')";
            meinConnector.executeStatement(auftrag);
            aktuelleFehlermeldung();
        }
        else{
            System.out.println("Es gibt diese Art von Objekt in der Datenbank nicht");
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

