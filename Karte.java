
/**
 * Karten können genutzt werden, um Black Jack oder andere Kartenspiele zu spielen.
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
public class Karte
{
    // Instanzvariablen - ersetzen Sie das folgende Beispiel mit Ihren Variablen
    private Farbe farbe;
    private Wert wert;

    /**
     * Konstruktor für Objekte der Klasse Karte
     */
    private Karte()
    {
    }
    
    public Karte(Farbe f, Wert w){
        farbe =f;
        wert = w;
    }

    /**
     * greift auf den Farbwert der Karte zu
     * 
     * @return der Farbwert
     */
    public Farbe getFarbe()
    {
        return farbe;
    }

    /**
     * greift auf den Wert der Karte zu
     * 
     * @return der Kartenwert
     */
    public Wert getWert()
    {
        return wert;
    }
    
    public String toString(){
        String s;
        s = getFarbe() + " " + getWert();
        return s;
    }

}
