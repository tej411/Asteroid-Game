package game;

import java.awt.*;
import javax.swing.*;

public class Spaceship {
    private int x, y, angle;
    private int speed;
    private Image image;

    public Spaceship(int x, int y) {
        this.x = x;
        this.y = y;
        this.speed = 0;
        this.angle = 0;
        this.image = new ImageIcon("resources/spaceship.png").getImage();
    }

    public void move() {
        x += speed * Math.cos(Math.toRadians(angle));
        y += speed * Math.sin(Math.toRadians(angle));

        // Wrap the spaceship around the screen
        if (x < 0) x = GameConstants.SCREEN_WIDTH;
        if (x > GameConstants.SCREEN_WIDTH) x = 0;
        if (y < 0) y = GameConstants.SCREEN_HEIGHT;
        if (y > GameConstants.SCREEN_HEIGHT) y = 0;
    }

    public void accelerate() {
        speed = Math.min(speed + 1, 10);
    }

    public void rotateLeft() {
        angle -= 10;
    }

    public void rotateRight() {
        angle += 10;
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

    public int getAngle() {
        return angle;
    }
}
