import processing.core.PApplet;

public class ProcessingBalls extends PApplet {
    public static final int WIDTH = 640;
    public static final int HEIGHT = 480;

    public static void main(String[] args) {
        PApplet.main("ProcessingBalls",args);
    }
    @Override
    public void settings() {
        super.settings();
        size(WIDTH, HEIGHT);

    }

}
