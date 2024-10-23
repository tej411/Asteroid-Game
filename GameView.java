package game;

import java.awt.*;
import javax.swing.*;

public class GameView extends JPanel {
    private GameModel model;

    public GameView(GameModel model) {
        this.model = model;
        setPreferredSize(new Dimension(GameConstants.SCREEN_WIDTH, GameConstants.SCREEN_HEIGHT));
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        drawBackground(g);
        drawSpaceship(g);
        drawAsteroids(g);
        drawBullets(g);
    }

    private void drawBackground(Graphics g) {
        g.setColor(Color.BLACK);
        g.fillRect(0, 0, getWidth(), getHeight());
    }

    private void drawSpaceship(Graphics g) {
        Spaceship spaceship = model.getSpaceship();
        g.drawImage(spaceship.getImage(), spaceship.getX(), spaceship.getY(), null);
    }

    private void drawAsteroids(Graphics g) {
        for (Asteroid asteroid : model.getAsteroids()) {
            g.drawImage(asteroid.getImage(), asteroid.getX(), asteroid.getY(), null);
        }
    }

    private void drawBullets(Graphics g) {
        g.setColor(Color.RED);
        for (Bullet bullet : model.getBullets()) {
            g.fillOval(bullet.getX(), bullet.getY(), 5, 5);
        }
    }
}
