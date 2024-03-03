import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

/**
 * Represents a generic hand of elements, such as cards, in a game. This interface defines operations
 * for managing and manipulating a collection of elements.
 *
 * @param <C> the type of elements in this hand, e.g., Card.
 */
public interface Hand<C> {

  /**
   * Adds an element to the hand.
   *
   * @param c the element to add
   */
  void add(C c);

  /**
   * Discards an element from the hand based on its index.
   *
   * @param index the index of the element to discard
   * @throws IndexOutOfBoundsException if the index is out of range (index < 0 || index >= getSize())
   */
  void discard(int index);

  /**
   * Retrieves an element from the hand by its index.
   *
   * @param index the index of the element to retrieve
   * @return the element at the specified index
   * @throws IndexOutOfBoundsException if the index is out of range (index < 0 || index >= getSize())
   */
  C get(int index);

  /**
   * Returns the number of elements in the hand.
   *
   * @return the size of the hand
   */
  int getSize();

  /**
   * Checks if the hand is empty.
   *
   * @return true if the hand is empty, false otherwise
   */
  boolean isEmpty();

  /**
   * Finds the index of the first occurrence of the specified element in the hand.
   *
   * @param c the element to find in the hand
   * @return the index of the first occurrence of the specified element, or -1 if not found
   */
  int find(C c);

  /**
   * Sorts the elements in the hand according to the order induced by the specified comparator.
   *
   * @param comparator a comparator that compares two elements of type C to determine their order
   */
  void sortHand(Comparator<? super C> comparator);

  /**
   * Returns a new Hand instance containing all elements that match the given predicate.
   *
   * @param filter a predicate to apply to each element to determine if it should be included
   * @return a new Hand instance with elements that match the predicate
   */
  Hand<C> getHand(Predicate<? super C> filter);

  /**
   * Computes and returns the sum of ranks of all elements in the hand, assuming each element has a
   * rank attribute or method.
   *
   * @return the sum of ranks of all elements in the hand
   */
  int rankSum();

  /**
   * Applies a mapping function to each element in the hand and returns a new Hand instance with
   * the results of applying the mapper to each element.
   *
   * @param mapper a function to apply to each element
   * @return a new Hand instance containing the mapped elements
   */
  Hand<C> getMap(Function<C, C> mapper);
}

