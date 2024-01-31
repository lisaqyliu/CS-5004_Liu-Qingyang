import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
public class PetRockTest {
  private PetRock rocky;
  @Before
  public void myTestSetUp() throws Exception{
    rocky = new PetRock("Rocky", 300.0);
  }

  @Test
  public void getName() throws Exception {
    assertEquals("Rocky", rocky.getName());
  }

  @Test
  public void testUnhappyToStart() throws Exception {
    assertFalse(rocky.isHappy());
  }

  @Test
  public void testHappyAfterPlay() throws Exception {
    rocky.playWithRock();
    assertTrue(rocky.isHappy());
  }

  @Test(expected = IllegalStateException.class)
  public void getHappyMessageUnhappyState() throws Exception {
    rocky.getHappyMessage();
  }

  @Test(expected = IllegalStateException.class)
  public void getHappyMessageHappyState() throws Exception {
    rocky.getHappyMessage();
    assertEquals("I'm happy!", rocky.getHappyMessage());
  }

  @Test
  public void testFavNum() throws Exception {
    assertEquals(42, rocky.getFavNumber());
  }

  @Test(expected = IllegalStateException.class)
  public void emptyNameFail() {
    new PetRock("", 300.0);
  }

  @Test
  public void testMass() throws Exception{
    assertEquals(300.0, rocky.getMass(), 0.0);
  }

  @Test
  public void toStringTest() {
    String expected = "PetRock{" +
        "name='" + rocky.getName() + '\'' +
        ", happy=" + rocky.isHappy() +
        ", mass=" + rocky.getMass() + "}";
    assertEquals(expected, rocky.toString());
  }



}


