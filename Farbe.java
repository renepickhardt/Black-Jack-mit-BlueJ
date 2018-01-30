
/**
 * Hier wird der Farbwert der Karte in Kleinbuchstaben abgespeichert.
 * Durch den enumerated Datentyp der hier als public definiert ist können wir überall im Programm
 * auf Farbe.karo, Farbe.herz, Farbe.pik und Farbe.kreuz zugreifen. 
 * 
 * Insbesondere funktioniert die Zuweisung:
 * 
 * Farbe f = Farbe.karo;
 * 
 * es lässt sich dann auch mit if überprüfen, ob eine Farbe f zum Beispiel den Wert Farbe.karo angenommen hat:
 * 
 * if (f == Farbe.karo){
 *      //Mach irgendwas, wenn die Farbe karo sein soll    
 * }
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
public enum Farbe{
    karo, herz, pik, kreuz
    
};
    
