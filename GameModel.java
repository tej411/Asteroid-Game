package game;

import java.util.ArrayList;
import java.util.List;

public class GameModel {
    private Spaceship spaceship;
    private List<Asteroid> asteroids;
    private List<Bullet> bullets;

    public GameModel() {
        spaceship = new Spaceship(GameConstants.SCREEN_WIDTH / 2, GameConstants.SCREEN_HEIGHT / 2);
        asteroids = new ArrayList<>();
        bullets = new ArrayList<>();
        initializeAsteroids();
    }

    public void update() {
        spaceship.move();
        for (Asteroid asteroid : asteroids) {
            asteroid.move();
        }
        for (Bullet bullet : bullets) {
            bullet.move();
        }
    }

    public void initializeAsteroids() {
        for (int i = 0; i < 10; i++) {
            asteroids.add(new Asteroid());
        }
    }

    public void fireBullet() {
        bullets.add(new Bullet(spaceship.getX(), spaceship.getY(), spaceship.getAngle()));
    }

    public Spaceship getSpaceship() {
        return spaceship;
    }

    public List<Asteroid> getAsteroids() {
        return asteroids;
    }

    public List<Bullet> getBullets() {
        return bullets;
    }
}
