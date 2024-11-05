import processing.core.PApplet;

import processing.core.PImage;

public class Sketch extends PApplet {



    /** Represents one ball */
    private Ball ball1;
    private Ball ball2;
    private Ball ball3;
    private Ball ball4;
    private Bubble bubble1;
    private Bubble bubble2;
    private Bubble bubble3;
    private Bubble bubble4;
    private Snowflake Snowflake1;
    private Snowflake Snowflake2;
    private Snowflake Snowflake3;
    private Snowflake Snowflake4;

    private PImage backgroundTexture;
    /**
     * This method can only be used to change the window size. It runs before the
     * window is created.
     */
    public void settings() {
        size(500, 500);
    }

    /**
     * Runs once at the beginning of the program, after the window is created. Use
     * this to initialize the sketch.
     */
    public void setup() {

        backgroundTexture = loadImage("Backdrop.jpg");


        ball1 = new Ball(this);
        ball2 = new Ball(this,30,400,400,5,3);
        ball3 = new Ball(this,10,40,40,2,7);
        ball4 = new Ball(this,20,300,250,-4,5);

        ball2.setColors(color(40,220,30),0);
        ball3.setColors(color(90,20,250),0);
        ball4.setColors(color(190,80,60),0);

        bubble1 = new Bubble(this);
        bubble2 = new Bubble(this,30,120,390,2,5);
        bubble3 = new Bubble(this,50,500,80,5,-5);
        bubble4 = new Bubble(this,38,5,400,-3,7);

        Snowflake1 = new Snowflake(this,30,5,400,-3,7);
        Snowflake2 = new Snowflake(this,50,250,400,4,2);
        Snowflake3 = new Snowflake(this,70,33,400,6,7);
        Snowflake4 = new Snowflake(this,20,120,400,2,5);
    }

    /**
     * This method runs over and over and over, approximately 60 times per second!
     * By moving objects a tiny bit each frame, you can get the appearance of
     * movement.
     */
    public void draw() {
        background(backgroundTexture);
        ball1.draw();
        ball1.move();
        ball2.draw();
        ball2.move();
        ball3.draw();
        ball3.move();
        ball4.draw();
        ball4.move();
        bubble1.draw();
        bubble1.move();
        bubble2.draw();
        bubble2.move();
        bubble3.draw();
        bubble3.move();
        bubble4.draw();
        bubble4.move();
        Snowflake1.draw();
        Snowflake1.move();
        Snowflake2.draw();
        Snowflake2.move();
        Snowflake3.draw();
        Snowflake3.move();
        Snowflake4.draw();
        Snowflake4.move();

    /** this code makes it so that each ball is calling on the check collision method that is inside the Ball code
     * All possible ball combinations are accounted for in this code
     */
        ball1.checkCollision(ball2);
        ball1.checkCollision(ball3);
        ball1.checkCollision(ball4);
        ball2.checkCollision(ball3);
        ball2.checkCollision(ball4);
        ball3.checkCollision(ball4);
    }

    /** All processing sketches have to use this main method. Don't touch this! */
    public static void main(String[] args) {
        PApplet.main("Sketch");
    }
}
