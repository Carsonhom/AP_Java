//Carson Hom
//Recieved help from Sebastion Detering
import java.awt.*;
import java.awt.geom.Rectangle2D;
import java.util.Formatter;
/*
 * You will need to alter code in this class!
 * First, make sure a single ball bounces 
 * around the screen correctly.
 * Then, add collision between multiple objects.
 */
public class Ball {
   public double x, y;           // Ball's center x and y (package access)
   public double speedX, speedY; // Ball's speed per step in x and y (package access)
   public double radius;         // Ball's radius (package access)
   private Color color;  // Ball's color  

   public Ball(double x, double y, double radius, double speed, double angleInDegree,
         Color color) {
      this.x = x;
      this.y = y;
      // Convert (speed, angle) to (x, y)
      this.speedX = (speed * Math.cos(Math.toRadians(angleInDegree)));
      this.speedY = (-speed * Math.sin(Math.toRadians(angleInDegree)));
      this.radius = radius;
      this.color = color;
   }
   
   public void draw(Graphics g) {
      g.setColor(color);
      g.fillOval((int) x, (int) y, (int)(2 * radius), (int)(2 * radius));
   }
   
   /** 
    * Move, check for collision and react accordingly if collision occurs.
    * 
    * @param box: the container (obstacle) for this ball. 
    */
   // Determine how to reflect off the walls of the screen
   public void moveOneStepWithCollisionDetection(ContainerBox box) {
      // Use the variable box to get the max/min x/y values of the screen
	  int minX = box.minX;
	  int maxX = box.maxX;
	  int minY = box.minY;
	  int maxY = box.maxY;
	  if(x >= maxX - 2 * radius){ //detects whether the ball hits the right side of the window
		  speedX = -Math.abs(speedX); //makes the ball bounce off of the right side
	  }
	  if(y >= maxY - 2 * radius){ //detects whether the ball hits the bottom of the window
		  speedY = -Math.abs(speedY); //makes the ball bounce up
	  }
	  if(x <= minX){ //detects whether the ball hits the left side of the window
		  speedX = Math.abs(speedX); // makes the ball bounce to the right
	  }
	  if(y <= minY){ // detects if the ball hits the top of the window
		  speedY = Math.abs(speedY); //makes the ball bounce down
	  }
	   
	  // Next step
	   this.x += speedX;
	   this.y += speedY;
	   
   }
   public void collides(Ball b2){
	   // Use this classes x, y, and radius
	   // Compare versus the b2.x, b2.y, and b2.radius
	   // Determine if they collide and have them bounce off each other
//	   if((x + radius) + (b2.x + b2.radius) <= radius + b2.radius && (y + radius) + (b2.y + b2.radius) <= radius + b2.radius){
//		   speedX = -speedX;
//		   speedY = -speedY;
//		   b2.speedX = -b2.speedX;
//		   b2.speedY = -b2.speedY;
//	   }
	   //uses the distance formula to detect if the two balls hit eachother
	   if(Math.sqrt(Math.pow((b2.x + b2.radius) - (x + radius), 2) + Math.pow((b2.y + b2.radius) - (y + radius), 2)) <= b2.radius + radius){
		   speedX = -speedX; //if they hit each other make them bounce in the opposite direction they were traveling before
		   speedY = -speedY;
		   b2.speedX = -b2.speedX;
		   b2.speedY = -b2.speedY;
	   }
	   
	   
	   
	   
   }
   
   /** Return the magnitude of speed. */
   public double getSpeed() {
      return Math.sqrt(speedX * speedX + speedY * speedY);
   }
   
   /** Return the direction of movement in degrees (counter-clockwise). */
   public double getMoveAngle() {
      return Math.toDegrees(Math.atan2(-speedY, speedX));
   }
}