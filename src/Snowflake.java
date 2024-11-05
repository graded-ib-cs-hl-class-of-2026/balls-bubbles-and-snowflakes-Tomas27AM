
class Snowflake {
  
 /** The sketch that the snowflake is inside */
 private Sketch s;
 /** the radius of the snowflake */
 private float radius;
 private float x;
 private float y;
 /** The number of pixels the ball moves right per frame */
 private float xSpeed;
 /** The number of pixels the ball moves down per frame */
 private float ySpeed;



 

 /** Empty constructor to keep the defaults. Only sets up our link. */
 public Snowflake(Sketch sketch) {
     s = sketch;
     radius = 20;
     x = 100;
     y = 100;
     xSpeed = 2;
     ySpeed = -1;
    
    
     
 }

 /** Fully specified constructor to allow changes to size, position, speed */
 /** Does NOT allow changing color! Need to use setColors() for that. */
 public Snowflake(Sketch sketch, float radius, float x, float y, float xspeed, float yspeed) {
     this.s = sketch;
     this.radius = radius;
     this.x = x;
     this.y = y;
     this.xSpeed = xspeed;
     this.ySpeed = yspeed;
    
 
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
/** This method draws the snowflake determining where the lines are drawn */
    public void draw() {
        s.stroke(s.color(255,255,255));
        s.line(x+radius,y,x-radius,y);
        s.line(x,y+radius,x,y-radius);
        s.line(x+radius*.707f,y+radius*.707f,x-radius*.707f,y-radius*.707f);
        s.line(x+radius*.707f,y-radius*.707f,x-radius*.707f,y+radius*.707f);
    }


/** This method moves the snowflakes. It determines how they are to move around on the screen. */
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

