public class Square {
    private int a;
    private int x;
    private int y;
    private String color;
    private boolean isVisible;

    public Square() {
        a = 1;
        x = 0;
        y = 0;
        color = "blue";
        isVisible = true;
    }

    public void makeVisible() {
        isVisible = true;
        draw();
    }

    public void makeInvisible() {
        erase();
        isVisible = false;
    }

    public void moveRight() {
        moveHorizontal(20);
    }

    public void moveLeft() {
        moveHorizontal(-20);
    }

    public void moveUp() {
        moveVertical(-20);
    }

    public void moveDown() {
        moveVertical(20);
    }

    public void moveHorizontal(int d) {
        erase();
        x += d;
        draw();
    }

    public void moveVertical(int d) {
        erase();
        y += d;
        draw();
    }

    public void slowMoveHorizontal(int d) {
        int delta;
        if (d < 0) {
            delta = -1;
            d = -d;
        } else {
            delta = 1;
        }
        for (int i = 0; i < d; i++) {
            x += delta;
            draw();
        }
    }

    public void slowMoveVertical(int d) {
        int delta;
        if (d < 0) {
            delta = -1;
            d = -d;
        } else {
            delta = 1;
        }

        for (int i = 0; i < d; i++) {
            y += delta;
            draw();
        }
    }

    public void changeSize(int newA) {
        erase();
        a = newA;
        draw();
    }

    public void changeColor(String newColor) {
        color = newColor;
        draw();
    }

    private void draw() {
        if (isVisible) {
            Canvas canvas = Canvas.getCanvas();
            //canvas.draw(this, color, new Rectangle(x, y, a, a));
            canvas.wait(10);
        }
    }

    private void erase() {
        if (isVisible) {
            Canvas canvas = Canvas.getCanvas();
            canvas.erase(this);
        }
    }

}
