package edu.northeastern.sv.khoury.ttt.view;

import edu.northeastern.sv.khoury.ttt.model.TicTacToeModel;
import edu.northeastern.sv.khoury.ttt.model.TicTacToeModelImpl;
import org.junit.jupiter.api.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * Test class for TicTacToeConsoleView.
 */
public class TicTacToeConsoleViewTest {
  @Test
  void testDisplayGame() {
    TicTacToeModel model = new TicTacToeModelImpl();
    TicTacToeView view = new TicTacToeConsoleView();
    view.setModel(model);

    ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    System.setOut(new PrintStream(outContent));

    view.displayGame();

    String output = outContent.toString();
    assertTrue(output.contains("Current Player: X")); // Check if the correct output is displayed
    System.setOut(System.out);
  }
}