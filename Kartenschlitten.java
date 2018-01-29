import java.util.ArrayList;
import java.util.Collections;
/**
 * Der Kartenschlitten besteht aus 6 Kartendecks, die jeweils die Werte
 * 2,3,4,...,10, Bube, Dame, Koenig, Ass haben.
 * 
 * Die 6 Kartendecks werten in ArrayList Datenstruktur gespeichert. 
 * 
 * Der Kartenschlitten stellt öffentlich nur die Funktion "zieheKarte()" bereit
 * 
 * Um die Klasse zu verstehen könnte es sich rentieren zu verstehen, wie man ArrayLists
 * in Java verwendet. Die offizielle Dokumentation ist zu finden unter: 
 * https://docs.oracle.com/javase/7/docs/api/java/util/ArrayList.html
 * Wenn dir die Dokumentation zu kompliziert ist, dann kannst du auch nach "ArrayList Tutorial Java"
 * oder ähnliche Begriffe in einer Suchmaschiene eingeben.
 * 
 * Weiterhin könnte es wichtig sein, den enum-Datentyp zu verstehen. Dieser ist hier erklärt:
 * https://docs.oracle.com/javase/tutorial/java/javaOO/enum.html
 * Auch hier gilt. Die Dokumentation setzt ggf. zu viel Vorwissen voraus, dann auch hier einfach 
 * etwas wie "java enum beispiel" bei einer Suchmaschiene deiner Wahl eintippen.
 * 
 * @author Rene Pickhardt (https://github.com/renepickhardt)
 * @version 0.1 
 * @license Dieses Programm ist freie software im sinne der Freien Software Foundation. Es ist lizenziert 
 * unter der Gnu Public License in der Dritten Version (GPLv3) Der ausführliche Lizenztext lässt sich finden
 * unter: http://www.gnu.de/documents/gpl.de.html Ich behalte mir das Recht vor Lizenzbrüche sowohl straf- als
 * auch zivilrechtlich zu verfolgen.
 * 
 * Die GPLv3 ermöglicht vielfältige Einsatzmöglichkeiten der Software sowohl im Unterricht, als auch 
 * darüber hinaus.
 */
public class Kartenschlitten
{
    // Instanzvariablen - ersetzen Sie das folgende Beispiel mit Ihren Variablen
    private ArrayList<Karte> kartenStapel;

    /**
     * der Konstruktur soll einen neuen Kartenschlitten erstellen. Wichtig ist, dass die Karten im 
     * Kartenschlitten auch gut gemischt sind. 
     */
    public Kartenschlitten()
    {
        //Das Objekt kartenstapel (in unserem Fall eine Instanzvariable) muss zunaechst initializiert werden
        //das geschieht in dem wir den Konstruktor der Klasse ArrayList<> mit new aufrufen.
        kartenStapel = new ArrayList<Karte>();
        
        //Gehe 6 Mal durch alle möglichen Farben und Kartenwerte und erstelle jeweils eine 
        //neue Karte mit dem entsprechenden Farbenwert und Kartenwert und fuege diesen zum 
        //Kartenstapel hinzu. 
        //Mit .values() kann man auf die Werte einer enum Datenstruktur zugreifen
        for (int i = 0;i<6;i++){
            for (Wert w : Wert.values()){
                for (Farbe f: Farbe.values()){    
                    Karte neuGenerierteKarte = new Karte(f,w);
                    kartenStapel.add(neuGenerierteKarte);
                }
            }
        }
        kartenStapelMischen();
    }
    
    /**
     * Diese Funktion sollte von dir implementiert werden. Das Ziel ist es, dass die Karten
     * im Kartenstapel zufällig vertauscht werden, so dass jede Runde ein anderer Kartenstapel
     * verwendet wird. 
     * 
     * Beachte, dass es sich bei dieser Funktion um eine private Funktion handelt. Diese kann also nur
     * von Methoden innerhalb der Klasse aufgerufen werden. 
     */
    private void kartenStapelMischen(){
        Collections.shuffle(kartenStapel);
    }
    
    /**
     * Gibt die oberste Karte vom Kartenstapel im Schlitten zurück und entfernt diese
     * aus dem Schlitten. 
     * 
     * TODO: eigentlich sollte der Aufruf dieser Funktion NULL zurück geben, wenn bereits
     * zu viele Karten gezogen wurden, da die Spielerinnen und Spieler sich sonst einen 
     * Vorteil durch zählen verschaffen könnten. Diesen (semantischen) "Fehler" bitte beheben.
     * 
     * TODO: wenn der Kartenstapel leer ist, wird das Programm mit einer IndexOutOfBound Exception
     * abstürzen. Verwende ein if-Statement, um dieses Problem zu umgehen. In diesem Fall sollten die
     * Funktion NULL zurück geben. Passe diesen Funktionskommentar entsprechend an. 
     * 
     * @return eine Karte
     */
    public Karte zieheKarte(){
        
        // Um diese Zeile zu verstehen bietet es sich an 
        return kartenStapel.remove(kartenStapel.size()-1);
    }
    
}
