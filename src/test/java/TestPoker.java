import org.junit.Test;
import static org.junit.Assert.*;
public class TestPoker {

    @Test
    public void draw5cards(){
        Deck deck = new Deck();
        deck.shuffle();
        Player p = new Player("Daniel Negreanu");
        p.addCard(deck.drawCard());
        p.addCard(deck.drawCard());
        p.addCard(deck.drawCard());
        p.addCard(deck.drawCard());
        p.addCard(deck.drawCard());
        p.showHand();
        assertEquals(p.hand.size(), 5);
        System.out.println(p.hasPair());

    }
    @Test
    public void testHasPair(){
        Player p = new Player("Daniel Negreanu");
        p.addCard(new Kort(Suit.HEARTS,2));
        p.addCard(new Kort(Suit.HEARTS,11));
        p.addCard(new Kort(Suit.HEARTS,2));
        p.addCard(new Kort(Suit.HEARTS,4));
        p.addCard(new Kort(Suit.HEARTS,12));
        assertEquals(5, p.hand.size());
        assertEquals(true,p.hasPair());

    }
    @Test
    public void testHasThreeOfAKind(){
        Player p = new Player("Daniel Negreanu");
        p.addCard(new Kort(Suit.HEARTS,2));
        p.addCard(new Kort(Suit.HEARTS,11));
        p.addCard(new Kort(Suit.HEARTS,2));
        p.addCard(new Kort(Suit.HEARTS,2));
        p.addCard(new Kort(Suit.HEARTS,5));
        assertEquals(5, p.hand.size());
        assertEquals(true,p.hasThreeOfAKind());
    }
}
