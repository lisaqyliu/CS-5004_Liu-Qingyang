import java.util.*;
import java.util.ArrayList;
//<p>
//FlawFound 3: The class does not have import statement for arraylist, so I added it above.
//<p>
/**
 *  Implements a BookStoreInventory as an ArrayList of BookStoreItems
 *  <p>
 *  Uses ArrayList.sort(Comparator<BookStoreItem>) to sort by author last name
 */
public class BookStoreInventory {
   ArrayList<BookStoreItem> inventory;

   /**
    * Constructor for a new, empty inventory
    * <p>
    * An inventory is implemented as an ArrayList of BookStoreItems
    * NB: Additional List-based methods could be added as needed
    * Also relies on ArrayList.sort() for sorting with a Comparator method
    */
   public BookStoreInventory() {
      inventory = new ArrayList<>();
   }

   /**
    * Add an item to the Library, relying on built-in ArrayList methods
    * <p>
    * @param pub1 A BookStoreItem to be added to the Library
    */
   public void addToInventory(BookStoreItem pub1) {
      inventory.add(pub1);
   }

   public int size() {
      return inventory.size(); }

   /**
    * Get a book from the Library, relying on built-in List/ArrayList methods
    * >
    * @param index a non-negative int within the range being used
    * @return a BookStoreItem from the Inventory, such as a Book or Magazine
    */
   public BookStoreItem getFromInventory(int index) throws IndexOutOfBoundsException {
      return inventory.get(index);
   }

   /**
    * Determine whether inventory contains a given BookStoreItem
    * <p>
    * @param pub a BookStoreItem to check for
    * @return boolean, true iff pub is in the Library
    */
   public boolean inventoryContains(BookStoreItem pub) {
      return inventory.contains(pub);
   }

   /**
    * Given existing library, sort in order determined by provided Comparator
    * <p>
    * @param comp a Class that implements Comparator<BookStoreItem>
    * inventory will be sorted in place
    */
   public void sortInventory(Comparator<BookStoreItem> comp) {
      this.inventory.sort(comp);
   }

   /**
    * Return a String representation of inventory, sorted by author
    * <p>
    * @return the String representation, with each BookStoreItem on a new line
    */
   //<p>
   //FlawFound 4: I changed strBuilder append to append the string representation of the BookStoreItem.
   //<p>
   @Override
   public String toString() {
      // Use StringBuilder to build up the final String
      StringBuilder strBuilder = new StringBuilder("Inventory:");
      for ( BookStoreItem pub : this.inventory) {
         strBuilder.append("\n-----\n").append(pub.toString());
      }
      return strBuilder.toString();
   }

}
