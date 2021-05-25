import processing.core.PApplet;

public class ProcessingBalls extends PApplet {
    public static final int WIDTH = 640;
    public static final int HEIGHT = 480;
    public static final int RADIUS = 10;
    int ballOne=1;
    int ballTwo=1;
    int ballThree=1;
    int ballFour=1;

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

        ellipse(ballOne,HEIGHT*1/5, RADIUS, RADIUS);
        ellipse(ballTwo,HEIGHT*2/5, RADIUS, RADIUS);
        ellipse(ballThree,HEIGHT*3/5, RADIUS, RADIUS);
        ellipse(ballFour,HEIGHT*4/5, RADIUS, RADIUS);

    }
}
