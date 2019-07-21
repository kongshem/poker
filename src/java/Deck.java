import java.util.*;

public class Deck {

    List<Kort> deck;

    public Deck(){
        this.deck = shuffle();
    }

    public List<Kort> shuffle(){
        List<Kort> list = new ArrayList<>();
        for (Suit s: Suit.values()) {
            for (int j = 1; j < 14; j++) {
                list.add(new Kort(s, j));
            }
        }
        Collections.shuffle(list);
        return list;
    }
    public Kort drawCard(){
        Kort kort = deck.get(0);
        deck.remove(kort);
        return kort;
    }
}
