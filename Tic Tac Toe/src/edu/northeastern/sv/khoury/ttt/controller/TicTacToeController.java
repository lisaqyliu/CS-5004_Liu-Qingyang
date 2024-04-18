package edu.northeastern.sv.khoury.ttt.controller;

import edu.northeastern.sv.khoury.ttt.model.TicTacToeModel;
import edu.northeastern.sv.khoury.ttt.view.TicTacToeView;

/**
 * Controller for the Tic Tac Toe game. This class handles user interaction
 * and updates the model and view accordingly.
 */
public class TicTacToeController {

  private TicTacToeModel model;
  private TicTacToeView view;

  /**
   * Constructs a new TicTacToeController.
   *
   * @param model the game model
   * @param view  the game view
   */
  public TicTacToeController(TicTacToeModel model, TicTacToeView view) {
    this.model = model;
    this.view = view;
  }

  /**
   * Starts the game interaction loop.
   */
  public void startGame() {
    while (!model.isGameOver()) {
      view.displayGame();
    }
  }

  /**
   * Sets the model associated with this controller.
   *
   * @param model the model to be used for fetching game data
   */
  public void setModel(TicTacToeModel model) {
    this.model = model;
  }
}