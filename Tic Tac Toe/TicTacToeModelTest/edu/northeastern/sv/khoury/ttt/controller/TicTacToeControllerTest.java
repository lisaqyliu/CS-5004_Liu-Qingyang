package edu.northeastern.sv.khoury.ttt.controller;

import edu.northeastern.sv.khoury.ttt.model.Player;
import edu.northeastern.sv.khoury.ttt.model.TicTacToeModel;
import edu.northeastern.sv.khoury.ttt.view.TicTacToeView;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Test suite for TicTacToeController without using Mockito.
 */
public class TicTacToeControllerTest {

  private TicTacToeViewStub view;
  private TicTacToeController controller;

  @BeforeEach
  void setUp() {
    TicTacToeModelStub model = new TicTacToeModelStub();
    view = new TicTacToeViewStub();
    controller = new TicTacToeController(model, view);
  }

  @Test
  void testStartGameCallsDisplay() {
    controller.startGame();
    assertTrue(view.displayCalled);
  }

  // Test stub for TicTacToeModel
  private static class TicTacToeModelStub implements TicTacToeModel {
    boolean gameOver = false;
    int displayCount = 0;

    @Override
    public void move(int row, int col) {

    }

    @Override
    public Player getCurrentPlayer() {

      return null;
    }

    @Override
    public Player getPlayerAt(int row, int col) {
      // Not implemented for stub
      return null;
    }

    @Override
    public boolean isGameOver() {
      displayCount++;
      return displayCount > 2; // Game over after two calls
    }

    @Override
    public Player getWinner() {

      return null;
    }
  }

  // Test stub for TicTacToeView
  private static class TicTacToeViewStub implements TicTacToeView {
    boolean displayCalled = false;

    @Override
    public void displayGame() {
      displayCalled = true;
    }

    @Override
    public void setModel(TicTacToeModel model) {

    }

    @Override
    public void setController(TicTacToeController controller) {

    }
  }
}
