package game;

import java.awt.*;
import java.util.Random;
import javax.swing.*;

public class Asteroid {
    private int x, y, speedX, speedY;
    private Image image;

    public Asteroid() {
        Random rand = new Random();
        this.x = rand.nextInt(GameConstants.SCREEN_WIDTH);
        this.y = rand.nextInt(GameConstants.SCREEN_HEIGHT);
        this.speedX = rand.nextInt(5) + 1;
        this.speedY = rand.nextInt(5) + 1;
        this.image = new ImageIcon("resources/asteroid.png").getImage();
    }

    public void move() {
        x += speedX;
        y += speedY;

        // Wrap around screen
        if (x < 0) x = GameConstants.SCREEN_WIDTH;
        if (x > GameConstants.SCREEN_WIDTH) x = 0;
        if (y < 0) y = GameConstants.SCREEN_HEIGHT;
        if (y > GameConstants.SCREEN_HEIGHT) y = 0;
    }

    public Image getImage() {
        return image;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}
