import processing.core.PApplet;

public class ProcessingBalls extends PApplet {
    public static final int WIDTH = 640;
    public static final int HEIGHT = 480;
    public static final int RADIUS = 10;
    int ballOne=1, ballTwo=1, ballThree=1, ballFour=1;

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

        ellipse(ballOne,HEIGHT/5, RADIUS, RADIUS);
        ballOne+=1;
        ellipse(ballTwo,HEIGHT*2/5, RADIUS, RADIUS);
        ballTwo+=2;
        ellipse(ballThree,HEIGHT*3/5, RADIUS, RADIUS);
        ballThree+=3;
        ellipse(ballFour,HEIGHT*4/5, RADIUS, RADIUS);
        ballFour+=4;

    }
}
