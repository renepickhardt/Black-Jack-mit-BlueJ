import java.util.ArrayList;
/**
 * Spielt BlackJack
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
public class Croupier
{
    Hand hand;

    /**
     * Konstruktor für Objekte der Klasse Player
     */
    public Croupier()
    {
        hand = new Hand();
    }

    
    
    /**
     * Sobald die Funktionen maxWetDerHandUnter21 und minWertDerHandUnter21 vorhanden sind, kann man
     * hier sehr viel mehr spiellogik einbauen. 
     */
    public boolean sollKarteGezogenWerden(ArrayList<Player> gegnerinnen){
        int eigenerWert = hand.minimalerWertDerHand();
        for (Player p: gegnerinnen){
            if (p.getHand().minimalerWertDerHand()>eigenerWert)
            return true;
        }
        return false;
    }
    
    public int fuegeKarteZurHandHinzu(Karte karte){
        hand.add(karte);
        return hand.minimalerWertDerHand();
    }
    
    public int getWertDerHand(){
        return hand.minimalerWertDerHand();
    }
    
    public void handAusgeben(){
        hand.handAusgeben();
    }
}

