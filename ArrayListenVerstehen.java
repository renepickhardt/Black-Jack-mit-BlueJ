import java.util.ArrayList;
/**
 * Diese Klasse hat keine Funktion fÜr das Spiel sondern ist nur vorhanden, damit
 * man an Hand eines simplen Beispiels lernen kann, wie man java.util.ArrayList 
 * verwenden kann.
 * 
 * @author Rene Pickhardt
 * @version 0.2
 */
public class ArrayListenVerstehen
{
    /**
     * Konstruktor für Objekte der Klasse ArrayListenVerstehen
     */
    public ArrayListenVerstehen()
    {
    }

    public void testMethode(){       
        //Wir erstellen 3 neue Objekte der Klasse Karte und weisen Ihnen beim Erstellen einen Wert zu
        //Objekte von Klassen werden so ähnlich erstellt wie Variablen eines Datentypes.
        // Die folgende Tabelle soll als Erklärung für die Analogie dienen 
        // Datentyp/Klasse | Variablen- bzw. Objektname | Gleichheitszeichen | Zuweisung eines Wertes 
        //  int                       zahl                        =                9;  
        //  Karte                      k                          =            new Karte(Farbe.herz, Wert.neun)
        Karte karteA = new Karte(Farbe.herz, Wert.neun);
        Karte karteB = new Karte(Farbe.kreuz, Wert.neun);
        Karte karteC = new Karte(Farbe.herz, Wert.bube);
        
        //Wir wollen den Computer zählen lassen, wie viele Karten den Wert 9 haben.
        //Das könnten wir natürlich in diesem kleinen Beispiel tun, in dem wir das von Hand zählen
        int anzahl = 0;
        if (karteA.getWert()==Wert.neun)
            anzahl++;
        if (karteB.getWert()==Wert.neun)
            anzahl++;
        if (karteC.getWert()==Wert.neun)
            anzahl++;
            
        // Problem: Wenn wir nicht nur 3 Objekte der Klasse Karte haben sondern 300, dann müssen wir 
        // sehr viel Code schreiben. Auch wenn wir nicht auf den Wert neun testen wollen, sondern auf 
        // einen anderen, dann müssen wir den Code überall anpassen.
        
        // Lösung: Verwende eine ArrayListe von Karten (das ist sozusagen eine Sammlung von Karten)
        
        // Wir definieren zunächst ein Objekt von der Klasse ArrayList<Karte>
        // Das geht analog zum erstellen von einzelnen Karten
        // Allerdings muss man dem Computer erst noch mitteilen, dass er die Klasse zur verfügung stellen muss.
        // am Anfang des Codes muss man import java.util.ArrayList; schreiben
        ArrayList<Karte> liste = new ArrayList<Karte>();
        // Weil man Arraylisten auch von anderen Objekten zum Beispiel Player definieren kann, gibt man 
        // zwischen den spitzen Klammern an, von welcher Klasse man Objekte in der Liste verwalten möchte
        
        // nun können wir unsere Karten der Arrayliste hinzufügen.
        // Wie bei anderen Objekten auch kann man mit einem Punkt (.) nach dem Objektnamen auf die Methoden
        // die in der Klasse bereit gestellt werden zugreifen. Welche Methoden für die Klasse ArrayList<T > 
        // existieren kann man im Web und in der Dokumentation direkt nachlesen.
        liste.add(karteA);
        liste.add(karteB);
        liste.add(karteC);
        
        // jetzt können wir mit einer Speziellen Form der for-Schleife über alle Objekte in unserer Liste iterieren:
        int z = 0;
        for (Karte k : liste){
            if (k.getWert()==Wert.neun)
                z++;
        }
        
        // auf der Variable z sollte jetzt auch die Anzahl der der gezählten neuen von unseren 3 Karten stehen. 
        // wir testen, ob mit beiden varianten des Zählens das gleiche Ergebnis heraus kam:
        
        if (anzahl == z){ // ACHTUNG!!! Auf Gleichheit testet man mit 2 Gleichzeichen ==
            System.out.println("Es gibt im Deck " + z + " Mal den Wert neun");
        }
        
        // Wir können der Arrayliste auch direkt weitere neue Objekte (Karten) hinzufügen, ohne sie vorher als Variablen
        // gespeichert haben zu müssen
        liste.add(new Karte(Farbe.pik,Wert.neun));
        liste.add(new Karte(Farbe.karo,Wert.zehn));
        liste.add(new Karte(Farbe.karo,Wert.neun));
        
        //wenn wir nun wissen wollen, wieviele Karten in unserer Liste sind, kann man die Methode size() aufrufen.
        System.out.println(liste.size());
        // wenn wir wissen wollen, wieviele Karten mit dem Wert neun in der liste sind können wir entweder
        // den code von oben hier hin kopieren oder 
        // uns schnell (mit dem code von oben) eine neue Methode programmieren und diese aufrufen:
        
        anzahl = anzahlNeun(liste);
        System.out.println("Die Anzahl der Karten mit dem Wert neun in der ArrayList beträgt: " + anzahl);
  
    }
    
    public int anzahlNeun(ArrayList<Karte> derParamaeterDerMethodeKannEinenBeliebigenNamenHabenWobeiDieserNichtSoGutIst){
        int anzahl = 0;
        for (Karte k : derParamaeterDerMethodeKannEinenBeliebigenNamenHabenWobeiDieserNichtSoGutIst){
            if (k.getWert()==Wert.neun)
                anzahl++;
        }
        return anzahl;
    }
}
