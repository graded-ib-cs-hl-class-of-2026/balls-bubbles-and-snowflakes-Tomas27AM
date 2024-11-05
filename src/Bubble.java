

class Bubble {

 /** The sketch that the ball is inside */
 private Sketch s;
 /** the radius of the ball */
 private float radius;
 private float x;
 private float y;
 /** The number of pixels the ball moves right per frame */
 private float xSpeed;
 /** The number of pixels the ball moves down per frame */
 private float ySpeed;
 /** The color of the inside of the ball */
 private int fillColor;
 /** The color of the outside of the ball */
 private int borderColor;

 /** Empty constructor to keep the defaults. Only sets up our link. */
 public Bubble(Sketch sketch) {
     s = sketch;
     radius = 20;
     x = 100;
     y = 100;
     xSpeed = 2;
     ySpeed = -1;
     fillColor = s.color(255, 255, 255,0);
     borderColor = s.color(0, 0, 0);
     
 }

 /** Fully specified constructor to allow changes to size, position, speed */
 /** Does NOT allow changing color! Need to use setColors() for that. */
 public Bubble(Sketch sketch, float radius, float x, float y, float xspeed, float yspeed) {
     this.s = sketch;
     this.radius = radius;
     this.x = x;
     this.y = y;
     this.xSpeed = xspeed;
     this.ySpeed = yspeed;
     fillColor = s.color(255, 255, 255,120);
     borderColor = s.color(0, 0, 0);
 }

    public float getRadius() {
        return radius;
    }

    public float getDiameter() {
        return radius * 2;
    }

    public float getX() {
        return x;
    }

    public float getY() {
        return y;
    }
/**This method draws the bubble on the screen */
    public void draw() {
        s.stroke(borderColor);
        s.fill(fillColor);
        s.circle(x, y, radius*2);
    }
/**This method determines the movement of the bubbles */
    public void move() {
        x = x + xSpeed;
        y = y + ySpeed;
        if (x > s.width - radius) {
            x = radius;
        } else if(x < radius) {
            x = s.width - radius;
        } else if (y > s.height - radius) {
            y = radius;
        } else if (y < radius) {
            y = s.height - radius;
        }
    }

}
