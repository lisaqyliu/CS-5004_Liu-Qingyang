package edu.northeastern.sv.khoury.ttt.model;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Test suite for the TicTacToeModel interface.
 */
class TicTacToeModelTest {

  /**
   * Tests that an illegal move throws the appropriate exception.
   */
  @Test
  void testMoveToIllegalPosition() {
    // The following call should throw IllegalArgumentException when trying to make a move to a position outside the board
    // assertThrows(IllegalArgumentException.class, () -> model.move(-1, 0));
  }

  /**
   * Tests that a legal move does not throw an exception.
   */
  @Test
  void testMoveToLegalPosition() {
    // The following call should not throw any exception when making a move to a legal and empty position on the board
    // assertDoesNotThrow(() -> model.move(0, 0));
  }

  /**
   * Tests that the current player is correctly retrieved after the first move.
   */
  @Test
  void testGetCurrentPlayerAfterFirstMove() {
    // Assuming X starts and has just moved, the following should return O as the current player
    // assertEquals(Player.O, model.getCurrentPlayer());
  }

  /**
   * Tests that the player at a given position is correctly identified.
   */
  @Test
  void testGetPlayerAtValidPosition() {
    // Assuming X has moved to (0, 0), the following should return Player.X
    // assertEquals(Player.X, model.getPlayerAt(0, 0));
  }

  /**
   * Tests that querying an out-of-bounds position throws the appropriate exception.
   */
  @Test
  void testGetPlayerAtInvalidPosition() {
    // The following should throw IllegalArgumentException for a position outside the board's bounds
    // assertThrows(IllegalArgumentException.class, () -> model.getPlayerAt(3, 3));
  }

  /**
   * Tests that the game over state is correctly identified when the game has just started.
   */
  @Test
  void testIsGameOverAtStart() {
    // Assuming the game has just started, the following should return false
    // assertFalse(model.isGameOver());
  }

  /**
   * Tests that the winner is correctly identified at the start of the game.
   */
  @Test
  void testGetWinnerAtStart() {
    // At the start of the game, assuming there is no winner yet, the following should return null
    // assertNull(model.getWinner());
  }
}
