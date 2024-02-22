import processing.core.PApplet;

/**
 * A program Sketch.java that draws a flower in the middle of a field
 * with clouds in the sky. It is also able to resize proportionally to 
 * the window.
 * @author: Kayla Jin
 */

public class Sketch extends PApplet {
	
  public void settings() {
	  
    // Size of window
    size(800, 800);
  }

  public void setup() {
    
    // Background colour
    background(137, 206, 214);
  }

  public void draw() {

    // Flower stem
    fill(150, 255, 173);
    stroke(150, 255, 173);
    rect(width * 12/25, height / 2, width /25, height / 2);
    
    // Flower petals
    fill(250, 180, 180);
    stroke(250, 180, 180);
    ellipse(width * 7/16, height * 7/16, width * 13/80, height * 13/80);
    ellipse(width * 9/16, height * 7/16, width * 13/80, height * 13/80);
    ellipse(width * 7/16, height * 9/16, width * 13/80, height * 13/80);
    ellipse(width * 9/16, height * 9/16, width * 13/80, height * 13/80);
    
    // Flower centre
    fill(240, 231, 163);
    stroke(240, 231, 163);
    ellipse(width / 2, height / 2, width * 3/20, height * 3/20);

    // Grass
    fill(135, 250, 141);
    stroke(135, 250, 141);
    rect(0, height * 13/16, width, height * 3/16);

    // Grass Textures
    stroke(71, 181, 76);
    line(width / 8, height * 7/8, width * 3/8, height * 7/8);
    line(width / 40, height * 15/16, width * 3/20, height * 15/16);
    line(width * 5/8, height * 367/400, width * 3/4, height * 367/400);
    line(width * 187/400, height * 389/400, width * 234/400, height * 389/400);

    // Left Cloud
    fill(255, 255, 255);
    stroke(255, 255, 255);
    ellipse(width * 50/400, height * 50/400, width * 50/400, height * 50/400);
    ellipse(width * 75/400, height * 60/400, width * 50/400, height * 50/400);
    ellipse(width * 85/400, height * 45/400, width * 50/400, height * 50/400);
    ellipse(width * 100/400, height * 64/400, width * 50/400, height * 50/400);

    // Right Cloud
    ellipse(width * 250/400, height * 70/400, width * 50/400, height * 50/400);
    ellipse(width * 275/400, height * 80/400, width * 50/400, height * 50/400);
    ellipse(width * 310/400, height * 65/400, width * 50/400, height * 50/400);
    ellipse(width * 300/400, height * 84/400, width * 50/400, height * 50/400);
    ellipse(width * 280/400, height * 60/400, width * 50/400, height * 50/400);
  }
}