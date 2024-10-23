import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            GameModel model = new GameModel();
            GameView view = new GameView(model);
            GameController controller = new GameController(model, view);

            JFrame frame = new JFrame("Asteroid Game");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.add(view);
            frame.pack();
            frame.setVisible(true);

            controller.startGameLoop();
        });
    }
}
