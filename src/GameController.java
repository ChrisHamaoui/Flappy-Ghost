/**
 * The GameController class acts as the middle man between the GUI and the GameModel class.
 */
public class GameController {

    private FlappyGhost view;
    private GameModel gameModel;

    /**
     * Constructor for the GameController class.
     * @param view The GUI.
     */
    public GameController(FlappyGhost view) {

        this.view = view;
        this.gameModel = new GameModel(view.getCANVAS_WIDTH(), view.getCANVAS_HEIGHT());
    }

    /**
     * Calls the model's update method to update every logic element of the game.
     * @param dt The amount of time it took to render the last frame.
     */
    public void update(double dt) {
        gameModel.update(dt);
    }

    // GETTERS & SETTERS
    public FlappyGhost getView() {
        return view;
    }

    public void setView(FlappyGhost view) {
        this.view = view;
    }

    public GameModel getGameModel() {
        return gameModel;
    }

    public void setGameModel(GameModel gameModel) {
        this.gameModel = gameModel;
    }

}