package game;

public class Bullet {
    private int x, y, speed;
    private int direction;

    public Bullet(int x, int y, int direction) {
        this.x = x;
        this.y = y;
        this.speed = 10;
        this.direction = direction;
    }

    public void move() {
        x += speed * Math.cos(Math.toRadians(direction));
        y += speed * Math.sin(Math.toRadians(direction));

        // Remove bullet if it goes off screen
        if (x < 0 || x > GameConstants.SCREEN_WIDTH || y < 0 || y > GameConstants.SCREEN_HEIGHT) {
            speed = 0;  // Essentially "destroy" the bullet
        }
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}
