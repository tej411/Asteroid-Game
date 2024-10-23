package game;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.*;

public class GameController implements KeyListener {
    private GameModel model;
    private GameView view;
    private Timer timer;

    public GameController(GameModel model, GameView view) {
        this.model = model;
        this.view = view;
        view.addKeyListener(this);
        view.setFocusable(true);
    }

    public void startGameLoop() {
        timer = new Timer(16, e -> {
            model.update();
            view.repaint();
        });
        timer.start();
    }

    @Override
    public void keyPressed(KeyEvent e) {
        switch (e.getKeyCode()) {
            case KeyEvent.VK_UP -> model.getSpaceship().accelerate();
            case KeyEvent.VK_LEFT -> model.getSpaceship().rotateLeft();
            case KeyEvent.VK_RIGHT -> model.getSpaceship().rotateRight();
            case KeyEvent.VK_SPACE -> model.fireBullet();
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
    }

    @Override
    public void keyTyped(KeyEvent e) {
    }
}
