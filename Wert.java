
/**
 * Hier wird der Name des Kartenwertes in Kleinbuchstaben abgespeichert.
 * Durch den enumerated Datentyp der hier als public definiert ist können wir überall im Programm
 * auf Wert.zwei, Wert.drei, Wert.vier,... zugreifen. 
 * 
 * Insbesondere funktioniert die Zuweisung:
 * 
 * Wert w = Wert.drei;
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
public enum Wert{
    zwei, drei, vier, fuenf, sechs, sieben, acht, neun, zehn, bube, dame, koenig, ass
};