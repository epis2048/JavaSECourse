public class Picture {
    private Square wall;
    private Square window;
    private Circle sun;

    public Picture() {
    }

    public void draw() {
        wall = new Square();
        wall.moveVertical(80);
        wall.changeSize(100);
        wall.makeVisible();

        window = new Square();
        window.changeColor("black");
        window.moveHorizontal(20);
        window.moveVertical(100);
        window.makeVisible();

        sun = new Circle();
        sun.changeColor("yellow");
        sun.moveHorizontal(180);
        sun.moveVertical(-10);
        sun.changeSize(60);
        sun.makeVisible();
    }

    public void sunset(){ //落日
        sun.slowMoveVertical(-1000);
    }

    public void setBlackAndWhite() {
        if (wall != null) {
            wall.changeColor("black");
            window.changeColor("white");
            sun.changeColor("black");
        }
    }

    public void setColor() {
        if (wall != null) {
            wall.changeColor("red");
            window.changeColor("black");
            sun.changeColor("yellow");
        }
    }

    public static void main(String[] args) {
        Picture picture = new Picture();
        picture.draw();
    }

}