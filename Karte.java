
/**
 * Karten können genutzt werden, um Black Jack oder andere Kartenspiele zu spielen.
 * Karten bestehen grundsätzlich aus einer Farbe und einem Wert.
 * Karten können ihren Wert und ihre Farbe nicht ändern.
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
     * Der Standard Konstruktor für Objekte der Klasse Karte wurde privat definiert, da es nicht möglich sein soll, 
     * dass man Karten erstellen kann, die keine Farbe und keinen Wert haben.
     * 
     * Der Aufruf new Karte(), welcher bei den meisten Klassen ein Objekt der Klasse erzeugt, wird hier zu einer
     * Fehlermeldung führen. Das ist gut, damit wir nicht ausversehen ein Objekt erzeugen. 
     */
    private Karte()
    {
    }
    
    /**
     * Der Conversion Konstruktor erwartet 2 Parameter, eine Farbe und einen Wert. Es lässt sich zum Beispiel ein
     * neues Herz Ass mit dem folgenden Aufruf erzeugen:
     * 
     * new Karte(Farbe.herz, Wert.ass); 
     * 
     */
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
    
    /**
     * Dise Funktion gibt einen String Zurück, der die Farbe und den Wert der Karte getrennt mit einem Komma auflistet
     * 
     * Der Aufruf
     * new Karte(Farbe.kreuz, Wert.zehn).toString();
     * gibt also den String "kreuz zehn" zurück.
     * 
     * @return String mit dem Namen der Karte. 
     */
    public String toString(){
        String s;
        s = getFarbe() + " " + getWert();
        return s;
    }

}
