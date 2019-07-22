import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Player {
    String name;
    List<Kort> hand;

    public Player(String name){
        this.name = name;
        hand = new ArrayList<>();
    }

    public void addCard(Kort card){
        hand.add(card);
    }
    public void removeCard(Kort card){
        hand.remove(card);
    }
    public boolean hasPair(){
        if (hand.size()<2){
            return false;
        }
        sortByRank();
        showHand();
        int lastValue = 0;
        for (Kort k : hand){
            if (k.number == lastValue){
                return true;
            }
            lastValue = k.number;
        }
        return false;
    }
    public boolean hasThreeOfAKind(){
        if (hand.size()<3){
            return false;
        }
        sortByRank();
        showHand();
        int lastValue = 0;
        int counter = 0;
        for (Kort k : hand){
            if (k.number == lastValue){
                counter++;
            } else{
                counter = 0;
            }
            if (counter == 2){
                return true;
            }
            lastValue = k.number;
        }
        return false;
    }
    public void showHand(){
        System.out.println("Showing " + this.name + "'s hand:");
        for (Kort k : hand){
            System.out.println(k.number + " " + k.suit);
        }
        System.out.println("--------------");
    }

    //TODO: Skal implementeres
    public boolean beatsPlayer(Player opponent){
        return false;
    }

    private void sortByRank(){
        Collections.sort(hand, Comparator.comparingInt(a -> a.number));
    }
    private void sortBySuit(){
        hand.sort(Comparator.comparing((Kort k) -> k.suit));
    }
}
