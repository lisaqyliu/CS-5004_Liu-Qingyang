import java.util.Objects;

/**
 * Represents a card in a deck with a suit and rank.
 */
public class Card implements Comparable<Card> {
  public enum Suit {
    CLUBS, DIAMONDS, HEARTS, SPADES
  }

  public enum Color {
    RED, BLACK
  }

  private final Suit suit; // The suit of the card
  private final int rank; // The rank of the card, from 1 to 13

  /**
   * Constructs a Card with the given suit and rank.
   *
   * @param suit The suit of the card.
   * @param rank The rank of the card, must be between 1 and 13.
   * @throws IllegalArgumentException if the rank is not between 1 and 13.
   */
  public Card(Suit suit, int rank) {
    this.suit = suit;
    this.rank = rank;
  }

  /**
   * Returns the suit of this card.
   *
   * @return the suit of this card.
   */
  public Suit getSuit( ){
    return suit;
  }

  /**
   * Returns the rank of this card.
   *
   * @return the rank of this card.
   */
  public int getRank( ){
    return rank;
  }

  /**
   * Returns the color of this card based on its suit.
   *
   * @return the color of this card, either RED or BLACK.
   */
  public Color getColor() {
    return switch (this.suit) {
      case DIAMONDS, HEARTS -> Color.RED;
      case CLUBS, SPADES -> Color.BLACK;
    };
  }

  /**
   * Compares this card with another card for order based on the rank.
   *
   * @param other The card to be compared with this card.
   * @return a negative integer, zero, or a positive integer as this card is less than, equal to,
   *         or greater than the specified card.
   */
  @Override
  public int compareTo(Card other) {
    return Integer.compare(this.rank, other.rank);
  }


  /**
   * Indicates whether some other object is "equal to" this one.
   *
   * @param obj the reference object with which to compare.
   * @return true if this object is the same as the obj argument; false otherwise.
   */
  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null || getClass() != obj.getClass()) return false;
    Card card = (Card) obj;
    return rank == card.rank && suit == card.suit;
  }

  /**
   * Returns a hash code value for the object.
   *
   * @return a hash code value for this object.
   */
  @Override
  public int hashCode() {
    return Objects.hash(suit, rank);
  }

  /**
   * Returns a string representation of the card.
   *
   * @return a string representation of the card's suit and rank.
   */
  @Override
  public String toString() {
    return "Card{" + "suit=" + suit + ", rank=" + rank + '}';
  }

}
