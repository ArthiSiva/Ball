import processing.core.PApplet;

public class ProcessingBalls extends PApplet {
    public static final int WIDTH = 640;
    public static final int HEIGHT = 480;
    public static final int RADIUS = 10;

    public static void main(String[] args) {
        PApplet.main("ProcessingBalls",args);
    }
    @Override
    public void settings() {
        super.settings();
        size(WIDTH, HEIGHT);
    }

    @Override
    public void setup() {
        super.setup();
    }

    @Override
    public void draw() {
        ellipse(0,HEIGHT*1/5, RADIUS, RADIUS);
    }
}
