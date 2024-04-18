package edu.northeastern.sv.khoury.ttt.view;

import edu.northeastern.sv.khoury.ttt.controller.TicTacToeController;
import edu.northeastern.sv.khoury.ttt.model.TicTacToeModel;

/**
 * Interface defining the view for a Tic Tac Toe game. This includes methods
 * for displaying the game state to the user.
 */
public interface TicTacToeView {
  /**
   * Displays the current state of the game.
   */
  void displayGame();

  /**
   * Sets the model associated with this view.
   *
   * @param model the model to be used for fetching game data
   */
  void setModel(TicTacToeModel model);

  /**
   * Sets the controller associated with this view.
   *
   * @param controller the controller to be used for handling user input
   */
  void setController(TicTacToeController controller);

}