package bomber.oop.entities;

import javafx.scene.canvas.GraphicsContext;
import bomber.oop.graphics.Sprite;

public class Wall extends Entity {

    public Wall(int x, int y, Sprite sprite) {
        super(x, y, sprite);
    }

    @Override
    public void render(GraphicsContext gc) {
        gc.drawImage(sprite.getFxImage(), x, y);
    }

    @Override
    public void update() {
    }
}
