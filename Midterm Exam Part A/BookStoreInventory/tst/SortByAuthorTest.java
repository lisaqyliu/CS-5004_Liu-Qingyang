import junit.framework.TestCase;
//<p>
//FlawFound 8: it is missing test for compare method, so I add them below.
//<p>
public class SortByAuthorTest extends TestCase {

  public void testCompare() {
    Person pat = new Person("Pat", "Conroy", 1948);
    Person john = new Person("John", "Steinbeck", 1902);
    Book book1 = new Book("Beaches", pat, 2020, 5.0);
    Book book2 = new Book("Sunsets", pat, 2021, 25.00);
    Book book3 = new Book("The Grapes of Wrath", john, 1939, 50.00);
    SortByAuthor sortByAuthor = new SortByAuthor();
    assertEquals(-1, sortByAuthor.compare(book1, book3));
    assertEquals(1, sortByAuthor.compare(book3, book1));
    assertEquals(0, sortByAuthor.compare(book2, book2));
  }
}