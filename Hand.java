import java.util.ArrayList;
/**
 * Beschreiben Sie hier die Klasse Hand.
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
public class Hand
{
    private ArrayList<Karte> karten;

    /**
     * Konstruktor für Objekte der Klasse Player
     */
    public Hand()
    {
        karten = new ArrayList<Karte>();
    }
    
    /** 
     * Berechnet den minimalen Wert einer Hand, in dem alle Asse mit 1 gewertet werden. 

     * TODO: Wir benötigen also vielleicht eine Funktion 
     * maxWertUnter21DerHand() und eine Funktion minWertUnter21DerHand()
     */
    public int minimalerWertDerHand(){
        int wert = 0;
        for (Karte k : karten){
            Wert w = k.getWert();
            switch(w){
                case zwei:
                    wert+=2;
                    break;
                case drei:
                    wert+=3;
                    break;
                case vier:
                    wert+=4;
                    break;
                case fuenf:
                    wert+=5;
                    break;
                case sechs:
                    wert+=6;
                    break;
                case sieben:
                    wert+=7;
                    break;
                case acht:
                    wert+=8;
                    break;
                case neun:
                    wert+=9;
                    break;
                case zehn:
                    wert+=10;
                    break;
                case bube:
                    wert+=10;
                    break;
                case dame:
                    wert+=10;
                    break;
                case koenig:
                    wert+=10;
                    break;
                case ass:
                    wert+=1;
                    break;
            }
        }
        return wert;
    }
    
    public void add(Karte karte){
        karten.add(karte);
    }
    
    public void handAusgeben(){
        for (Karte k:karten){
            System.out.println(k.toString());
        }
    }
}


