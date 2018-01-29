import java.util.ArrayList;
/**
 * Ein Spieltisch besteht aus dem Croupier, den Spielern und Spielerinnen sowie dem Kartenschlitten
 * von welche weitere Karten zu ziehen sind.
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
public class Spieltisch
{
    // Instanzvariablen - ersetzen Sie das folgende Beispiel mit Ihren Variablen
    private Kartenschlitten kartenschlitten;
    private ArrayList<Player> players;
    private Croupier croupier;
    
    /**
     * Konstruktor für Objekte der Klasse Spieltisch
     * 
     * TODO: man kann schon sehen dass der Croupier und Player eine sehr ähnliche API haben, 
     * das schreit nach Vererbung! Lerne mehr über Vererbung unter: 
     * https://de.wikipedia.org/wiki/Vererbung_(Programmierung) oder benutze eine Suchmaschiene deiner Wahl
     */
    public Spieltisch()
    {
        System.out.println("\nBeginne neue Runde:");
        kartenschlitten = new Kartenschlitten();
        kartenAusteilen();
    }
 
    private void kartenAusteilen(){
        int numPlayers = 2;
        players = new ArrayList<Player>(numPlayers);
        croupier = new Croupier();
        for (int i =0 ; i<numPlayers; i++){
            Player p = new Player();
            p.fuegeKarteZurHandHinzu(kartenschlitten.zieheKarte());
            p.fuegeKarteZurHandHinzu(kartenschlitten.zieheKarte());
            players.add(p);
        }
        croupier.fuegeKarteZurHandHinzu(kartenschlitten.zieheKarte());
        croupier.fuegeKarteZurHandHinzu(kartenschlitten.zieheKarte());
    }
    
    /**
     * Diese Funktion ist 
     */
    public String zieheKarte()
    {
        // tragen Sie hier den Code ein
        return kartenschlitten.zieheKarte().toString();
    }
    
    /**
     * Spielt eine Runde Blackjack. Dafür werden zu erst alle spielenden Menschen gefragt, ob sie noch 
     * eine Karte wünschen. Anschließend entscheidet der Croupier, ob er noch eine Karte möchte.
     * Wenn noch nicht entschieden ist ob das spiel für eine der Parteien gewonnen ist, wird eine neue 
     * Runde Karten ausgeteilt.
     * 
     * Es muss auch entlang des Regelwerkes entschieden wer gewonnen hat
     * 
     * @return gibt wahr zurück, wenn der Croupier gewonnen hat und false wenn er Verloren hat.
     */
    public boolean spieleRunde(){
        boolean croupierMussZiehen = false;
        boolean nochSpielerAktiv = false;
        boolean keinPlayerHatGezogen = true;
        int wertDesCroupiers = croupier.getWertDerHand();
        
        /**
         * Entscheide für alle Player am Tisch, ob sie weitere Karten ziehen wollen und ziehe diese
         * ggf. auch. Bestimme dabei noch, ob der Croupier am Ende der Runde noch ziehen wird. 
         */
        for (Player p: players){
            int wertDesSpielers = p.getWertDerHand();
            if(wertDesSpielers - 4 < wertDesCroupiers){
                wertDesSpielers = p.fuegeKarteZurHandHinzu(kartenschlitten.zieheKarte());
                keinPlayerHatGezogen = true;
            }
            
            if (wertDesSpielers <= 21 && wertDesSpielers > wertDesCroupiers){
                    croupierMussZiehen = true;
            }
            
            if (wertDesSpielers <= 21){
                nochSpielerAktiv = true;
            }
            System.out.println("Player's Hand hat Wert:" + p.getWertDerHand());
            p.handAusgeben();

        }
        
        if (croupierMussZiehen && keinPlayerHatGezogen){
            wertDesCroupiers = croupier.fuegeKarteZurHandHinzu(kartenschlitten.zieheKarte());
        }

        System.out.println("Hand des Croupiers hat Wert:" + croupier.getWertDerHand());
        croupier.handAusgeben();

        /**
         * Füge hier einen geeigneten Kommentar ein
         */
        if (wertDesCroupiers > 21 || nochSpielerAktiv){
            kartenAusteilen();
            return false;
        }
        
        /**
         * Füge hier einen geeigneten Kommentar ein
         */
        if (wertDesCroupiers <= 21 && !nochSpielerAktiv){
            kartenAusteilen();
            return true;
        }
        
        return spieleRunde();
    }
        
}
