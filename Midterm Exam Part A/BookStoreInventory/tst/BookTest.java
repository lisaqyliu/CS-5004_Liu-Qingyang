import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * JUnit 4 test Class for Book
 * <p>
 * Methods shared by Publications are tested in AbstractBookStoreItemTest
 * Methods with unique Book implementations are tested here
 */
public class BookTest {

  private Book book1;
  private Book book2;
  private Book book3;
  private Person pat;
  private Person john;



  /**
   * Set up some examples of Person and Book for testing
   */
  @Before
  public void setUp() {
    // Examples of Person
    Person pat = new Person("Pat", "Conroy", 1948);
    Person john = new Person("John", "Steinbeck", 1902);
    // Examples of Book
    book1 = new Book ("Beaches", pat, 2020, 5.0);
    book2 = new Book("Sunsets", pat, 2021, 25.00);
    book3 = new Book("The Grapes of Wrath", john, 1939, 50.00);
  }
  //<p>
  //FlawFound : it is missing test for getAuthor, getPrice, getTitle, getYear, sameAuthor method, so I add them below.
  //<p>
  @Test
  public void testBookString() {
    String expected;
    expected = """
        Kind: Book
        Title: Beaches
        Author: Pat Conroy
        Year: 2020
        Price: 500""";
    assertEquals(expected,book1.toString());
  }

  @Test
  public void testGetTitle() {
    assertEquals("Beaches", book1.getTitle());
    assertEquals("Sunsets", book2.getTitle());
    assertEquals("The Grapes of Wrath", book3.getTitle());
  }

  @Test
  public void testGetYear() {
    assertEquals(2020, book1.getYear());
    assertEquals(2021, book2.getYear());
    assertEquals(1939, book3.getYear());
  }

  @Test
  public void testGetAuthor() {
    Person pat = new Person("Pat", "Conroy", 1948);
    assertEquals(pat, book1.getAuthor());
    Person john = new Person("John", "Steinbeck", 1902);
    assertEquals(john, book3.getAuthor());

  }

  @Test
  public void testGetPrice() {
    assertEquals(5.0, book1.getPrice(), 0.001);
    assertEquals(25.0, book2.getPrice(), 0.001);
  }

  @Test
  public void testSameAuthor() {
    assertTrue(book1.sameAuthor(book2));
    assertFalse(book1.sameAuthor(book3));
  }
  //<p>
  //FlawFound 9: I added the test for hashCode method.
  //<p>
  @Test
  public void testHashCode() {
    Book book1 = new Book("Beaches", pat, 2020, 5.0);
    assertEquals(book1.hashCode(), book1.hashCode());
  }

}
