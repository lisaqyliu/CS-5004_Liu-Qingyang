import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class ListOfIntsTest {

  private ListOfInts emptyList;
  private ListOfInts singleItemList;
  private ListOfInts multipleItemList;

  @Before
  public void setUp() {
    // Setup lists to be used in tests
    emptyList = new EmptyNode();
    singleItemList = new ElementNode(5, new EmptyNode());
    multipleItemList = new ElementNode(10, new ElementNode(20, new ElementNode(30, new EmptyNode())));
  }

  @Test
  public void testPrependToEmptyList() {
    ListOfInts result = emptyList.prepend(10);
    assertEquals("[10]", result.toString());
  }

  @Test
  public void testAppendToEmptyList() {
    ListOfInts result = emptyList.append(10);
    assertEquals("[10]", result.toString());
  }

  @Test
  public void testInsertAtIndexInEmptyList() {
    assertThrows(IndexOutOfBoundsException.class, () -> emptyList.insertAtIndex(10, 1));
  }


  @Test
  public void testGetDataAtIndexFromSingleItemList() {
    int data = singleItemList.getDataAtIndex(0);
    assertEquals(5, data);
  }

  @Test(expected = IndexOutOfBoundsException.class)
  public void testGetDataAtIndexOutOfBounds() {
    singleItemList.getDataAtIndex(1); // This should throw an exception
  }

  @Test
  public void testGetCountEmptyList() {
    assertEquals(0, emptyList.getCount());
  }

  @Test
  public void testGetCountMultipleItemsList() {
    assertEquals(3, multipleItemList.getCount());
  }

  @Test
  public void testGetSumEmptyList() {
    assertEquals(0, emptyList.getSum());
  }

  @Test
  public void testGetSumMultipleItemsList() {
    assertEquals(60, multipleItemList.getSum());
  }

  @Test
  public void testAppendToNonEmptyList() {
    ListOfInts result = singleItemList.append(15);
    assertEquals("[5, 15]", result.toString());
  }

  @Test
  public void testPrependToNonEmptyList() {
    ListOfInts result = singleItemList.prepend(1);
    assertEquals("[1, 5]", result.toString());
  }

  @Test
  public void testInsertAtIndex() {
    ListOfInts result = multipleItemList.insertAtIndex(25, 2);
    assertEquals("[10, 20, 25, 30]", result.toString());
  }

}
