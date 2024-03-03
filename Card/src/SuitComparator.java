import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SuitComparator implements Comparator<Card> {
  @Override
  public int compare(Card card1, Card card2) {
    List<Card.Suit> suitOrder = Arrays.asList(Card.Suit.CLUBS, Card.Suit.HEARTS, Card.Suit.DIAMONDS, Card.Suit.SPADES);
    return Integer.compare(suitOrder.indexOf(card1.getSuit()), suitOrder.indexOf(card2.getSuit()));
  }
}
