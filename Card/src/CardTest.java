import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
/**
 * Test class for Card.
 */
class CardTest {

  private Card cardSpadesA;
  private Card cardHeartsA;
  private Card cardSpades2;

  @BeforeEach
  public void setUp() {
    cardSpadesA = new Card(Card.Suit.SPADES, 1); // Assuming 'A' stands for Ace, which can be represented as 1
    cardHeartsA = new Card(Card.Suit.HEARTS, 1); // Assuming 'A' stands for Ace, which can be represented as 1
    cardSpades2 = new Card(Card.Suit.SPADES, 2); // For the card 2 of Spades
  }

  /**
   * Tests the getSuit method of Card.
   */
  @Test
  void getSuit() {
    assertEquals(Card.Suit.SPADES, cardSpadesA.getSuit(), "getSuit should return Suit.SPADES");
  }

  /**
   * Tests the getRank method of Card.
   */
  @Test
  void getRank() {
    assertEquals(1, cardSpadesA.getRank(), "getRank should return 1 for an Ace");
  }

  /**
   * Tests the getColor method of Card.
   */
  @Test
  void getColor() {
    assertEquals(Card.Color.BLACK, cardSpadesA.getColor(),
        "getColor should return Color.BLACK for Spades");
    assertEquals(Card.Color.RED, cardHeartsA.getColor(),
        "getColor should return Color.RED for Hearts");
  }

    /**
     * Tests the compareTo method of Card.
     */
  @Test
  void compareTo() {
    assertTrue(cardSpadesA.compareTo(cardSpades2) < 0, "A should be considered lower than 2 for sorting");
    assertEquals(0, cardSpadesA.compareTo(cardHeartsA), "Cards of same rank should be considered equal");
  }

  /**
   * Tests the equals method of Card.
   */
  @Test
  void testEquals() {
    Card cardSpadesA = new Card(Card.Suit.SPADES, 1); // Correctly constructed Card object
    Card anotherSpadesA = new Card(Card.Suit.SPADES, 1); // Another correctly constructed Card object for comparison
    Card cardHeartsA = new Card(Card.Suit.HEARTS, 1); // Different suit

    assertEquals(cardSpadesA, anotherSpadesA, "Cards with same rank and suit should be equal");
    assertNotEquals(cardSpadesA, cardHeartsA, "Cards with different suits should not be equal");
  }

  /**
   * Tests the hashCode method of Card.
   */
  @Test
  void testHashCode() {
    Card cardSpadesA = new Card(Card.Suit.SPADES, 1);
    Card anotherSpadesA = new Card(Card.Suit.SPADES, 1);

    assertEquals(cardSpadesA.hashCode(), anotherSpadesA.hashCode(), "Hashcode should be equal for equal objects");
  }

  /**
   * Tests the toString method of Card.
   */
  @Test
  void testToString() {
    assertEquals("Card{suit=SPADES, rank=1}", cardSpadesA.toString(), "toString should return 'Card{suit=SPADES, rank=1}'");
  }


  /**
   * Tests sorting of Cards based on their natural ordering.
   */
  @Test
  void testSortingWithComparable() {
    List<Card> cards = Arrays.asList(cardSpades2, cardHeartsA, cardSpadesA);
    cards.sort(null);
    assertEquals(Arrays.asList(cardHeartsA, cardSpadesA, cardSpades2), cards, "Cards should be sorted by rank in ascending order.");
  }



  /**
   * Tests sorting of Cards using a custom Comparator.
   */
  @Test
  void testSortingWithComparator() {
    Comparator<Card> bySuit = new SuitComparator();
    List<Card> cards = Arrays.asList(cardSpades2, cardHeartsA, cardSpadesA);
    cards.sort(bySuit); // Sorting with a custom comparator by suit
    assertEquals(Arrays.asList(cardHeartsA, cardSpadesA, cardSpades2), cards, "Cards should be sorted by suit.");
  }



  /**
   * Tests filtering Cards using a Predicate with a named class.
   */
  @Test
  void testFilteringWithNamedClassPredicate() {
    Predicate<Card> isAce = new IsAcePredicate();
    assertTrue(isAce.test(cardSpadesA), "Predicate should return true for an Ace.");
    assertFalse(isAce.test(cardSpades2), "Predicate should return false for a non-Ace.");
  }

  /**
   * Named class implementation of Predicate for testing.
   */
  static class IsAcePredicate implements Predicate<Card> {
    @Override
    public boolean test(Card card) {
      return card.getRank() == 1; // Assuming Ace is represented by 1
    }
  }

  /**
   * Tests filtering Cards using a Predicate with an anonymous class.
   */
  @Test
  void testFilteringWithAnonymousClassPredicate() {
    Predicate<Card> isSpade = card -> card.getSuit() == Card.Suit.SPADES;
    assertTrue(isSpade.test(cardSpadesA), "Predicate should return true for a Spade.");
    assertFalse(isSpade.test(cardHeartsA), "Predicate should return false for a non-Spade.");
  }

  /**
   * Tests filtering Cards using a Predicate with a lambda expression.
   */
  @Test
  void testFilteringWithLambdaPredicate() {
    Predicate<Card> isRedCard = card -> card.getColor() == Card.Color.RED;
    assertTrue(isRedCard.test(cardHeartsA), "Predicate should return true for a red card.");
    assertFalse(isRedCard.test(cardSpadesA), "Predicate should return false for a non-red card.");
  }

}
