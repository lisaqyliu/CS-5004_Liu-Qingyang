import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.Comparator;


/**
 * A concrete implementation of the Hand interface that manages a hand of cards.
 */
public class HandImpl implements Hand<Card> {
  private List<Card> cards;

  /**
   * Constructs an empty hand.
   */
  public HandImpl() {
    this.cards = new ArrayList<>();
  }

  @Override
  public void add(Card card) {
    cards.add(card);
  }

  @Override
  public void discard(int index) {
    if (index < 0 || index >= cards.size()) {
      throw new IndexOutOfBoundsException("Index out of bounds.");
    }
    cards.remove(index);
  }

  @Override
  public Card get(int index) {
    if (index < 0 || index >= cards.size()) {
      throw new IndexOutOfBoundsException("Index out of bounds.");
    }
    return cards.get(index);
  }

  @Override
  public int getSize() {
    return cards.size();
  }

  @Override
  public boolean isEmpty() {
    return cards.isEmpty();
  }

  @Override
  public int find(Card card) {
    return cards.indexOf(card);
  }

  @Override
  public void sortHand(Comparator<? super Card> comparator) {
    cards.sort(comparator);
  }

  @Override
  public Hand<Card> getHand(Predicate<? super Card> filter) {
    HandImpl filteredHand = new HandImpl();
    filteredHand.cards = this.cards.stream().filter(filter).collect(Collectors.toList());
    return filteredHand;
  }


  @Override
  public int rankSum() {
    return cards.stream().mapToInt(Card::getRank).sum();
  }

  @Override
  public Hand<Card> getMap(Function<Card, Card> mapper) {
    HandImpl mappedHand = new HandImpl();
    mappedHand.cards = this.cards.stream().map(mapper).collect(Collectors.toList());
    return mappedHand;
  }
}
