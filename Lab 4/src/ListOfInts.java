/**
 * This interface represents all operations for a list of integers.
 */
public interface ListOfInts {

  /**
   * Adds an integer to the front of this list.
   * @param data the integer to add
   * @return a new list with the integer added to the front
   */
  ListOfInts prepend(int data);

  /**
   * Adds an integer to the back of this list.
   * @param data the integer to add
   * @return a new list with the integer added to the back
   */
  ListOfInts append(int data);

  /**
   * Inserts an integer at the specified index in this list.
   * If the index is greater than the size of the list, the integer is added to the end.
   * @param data the integer to insert
   * @param index the position to insert the integer
   * @return a new list with the integer inserted
   * @throws IndexOutOfBoundsException if the index is negative
   */
  ListOfInts insertAtIndex(int data, int index) throws IndexOutOfBoundsException;

  /**
   * Retrieves the integer at the specified index in this list.
   * @param index the index of the integer to retrieve
   * @return the integer at the specified index
   * @throws IndexOutOfBoundsException if the index is invalid
   */
  int getDataAtIndex(int index) throws IndexOutOfBoundsException;

  /**
   * Returns a list of all elements except the first.
   * @return a list of all elements except the first
   */
  ListOfInts getRest();

  /**
   * Returns the number of elements in this list.
   * @return the number of elements
   */
  int getCount();

  /**
   * Returns the sum of all integers in this list.
   * @return the sum of integers
   */
  int getSum();

  /**
   * Returns a string representation of this list.
   * @return a string representation
   */
  @Override
  String toString();
}
