package tests;

import game.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class GameModelTest {
    @Test
    public void testSpaceshipMovement() {
        GameModel model = new GameModel();
        Spaceship spaceship = model.getSpaceship();
        spaceship.accelerate();
        spaceship.move();
        assertNotEquals(0, spaceship.getX());
        assertNotEquals(0, spaceship.getY());
    }

    @Test
    public void testAsteroidSpawn() {
        GameModel model = new GameModel();
        assertEquals(10, model.getAsteroids().size());
    }

    @Test
    public void testBulletFiring() {
        GameModel model = new GameModel();
        int initialBulletCount = model.getBullets().size();
        model.fireBullet();
        assertEquals(initialBulletCount + 1, model.getBullets().size());
    }
}
