import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.Comparator;

public class HandImplTest {

  private Hand<Card> hand;
  private Card cardAceSpades;
  private Card cardKingHearts;

  @BeforeEach
  void setUp() {
    hand = new HandImpl();
    cardAceSpades = new Card(Card.Suit.SPADES, 1); // Assuming Ace is represented as 1
    cardKingHearts = new Card(Card.Suit.HEARTS, 13); // Assuming King is represented as 13
  }

  @Test
  void addCardIncreasesSize() {
    hand.add(cardAceSpades);
    assertEquals(1, hand.getSize(), "Hand size should increase by 1 after adding a card.");
  }

  @Test
  void discardRemovesCorrectCard() {
    hand.add(cardAceSpades);
    hand.add(cardKingHearts);
    hand.discard(0); // Discard the first card, which is Ace of Spades
    assertFalse(hand.find(cardAceSpades) != -1, "Ace of Spades should be removed from the hand.");
    assertEquals(1, hand.getSize(), "Hand size should decrease by 1 after discarding a card.");
  }

  @Test
  void getReturnsCorrectCard() {
    hand.add(cardAceSpades);
    assertEquals(cardAceSpades, hand.get(0), "get(0) should return the first card added to the hand.");
  }

  @Test
  void isEmptyReturnsTrueForNewHand() {
    assertTrue(hand.isEmpty(), "A new hand should be empty.");
  }

  @Test
  void findReturnsCorrectIndex() {
    hand.add(cardAceSpades);
    assertEquals(0, hand.find(cardAceSpades), "find should return the correct index of the card in the hand.");
  }

  @Test
  void sortHandOrdersCardsByRank() {
    hand.add(cardKingHearts);
    hand.add(cardAceSpades);
    hand.sortHand(Comparator.comparingInt(Card::getRank));
    assertEquals(cardAceSpades, hand.get(0), "After sorting, the Ace should be the first card in the hand.");
    assertEquals(cardKingHearts, hand.get(1), "After sorting, the King should be the second card in the hand.");
  }

  @Test
  void getHandFiltersCorrectly() {
    hand.add(cardAceSpades);
    hand.add(cardKingHearts);
    // Assuming you want to filter for cards that are hearts
    Hand<Card> filteredHand = hand.getHand(card -> card.getSuit() == Card.Suit.HEARTS);
    assertEquals(1, filteredHand.getSize(), "Filtered hand should only contain cards of hearts.");
    assertTrue(filteredHand.find(cardKingHearts) != -1, "Filtered hand should include the King of Hearts.");
  }

  @Test
  void rankSumCalculatesCorrectly() {
    hand.add(cardAceSpades); // Rank 1
    hand.add(cardKingHearts); // Rank 13
    // The sum should be 14 (1 + 13)
    assertEquals(14, hand.rankSum(), "Rank sum should correctly sum the ranks of all cards in the hand.");
  }

  @Test
  void getMapAppliesFunctionCorrectly() {
    hand.add(cardAceSpades); // Rank 1
    // Apply a function to increase each card's rank by 1
    Hand<Card> mappedHand = hand.getMap(card -> new Card(card.getSuit(), card.getRank() + 1));
    Card mappedCard = mappedHand.get(0);
    assertEquals(2, mappedCard.getRank(), "Mapped hand should contain cards with their rank increased by 1.");
  }

}
