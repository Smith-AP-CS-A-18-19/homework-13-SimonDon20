import java.awt.geom.Rectangle2D;
/* All SmithShape triangles have one edge that is on
 * the horizontal and are defined by the angle (in degrees)
 * of the lower left corner.
 */
public class Triangle implements SmithShape{
/* The constructor for the Triangle object should be as below.
 * You may change the names of the parameters, but their order
 * must remain the same for the assignment to be scored
 * correctly
 */

 private int xCoord;
 private int yCoord;
 private int w;
 private int h;
 private double theta;

public Triangle(int x, int y, int width, int height, double angle) {
  xCoord = x;
  yCoord = y;
  w = width;
  h = height;
  theta = angle;
}
/* You will need to add a getAngle() method that returns
 * the angle of the triangle
 */
 public int getX() {
   return xCoord;
 }

 // The lower left y coordinate
 public int getY() {
   return yCoord;
 }

 // The width of the shape
 public int getWidth(){
   return w;
 }

 // The height of the shape
 public int getHeight(){
   return h;
 }

 // The overall area of the shape
 public double getArea(){
   double area = (w * h) / 2;
   return area;
 }

 public double getAngle() {
   return theta;
 }

/* Add the method toSquare() to the Triangle class. This creates
 * and returns a new Rectangle2D object. The x and y of the new
 * Rectangle should be the same as the Triangle. The width and
 * height of the Rectangle2D should be the same (it is a square)
 * and the area should be equal to the area of the Triangle
 */
 public Rectangle2D toSquare(){
    double length = Math.pow(getArea(), 0.5);
    Rectangle2D rect = new Rectangle2D.Double(xCoord, yCoord, length, length);
    return rect;
  }
/* Override the method toString(). It should return
 * the String:
 * Width: width
 * Height: height
 * Angle: angle
 * Remember that to insert a new line into a String,
 * use \n
 */
 @Override
public String toString(){
  String wi = "Width: " + getWidth();
  String he = "Height: " + getHeight();
  String an = "Angle: " + getAngle();
  String answer = wi + "\n" + he + "\n" + an;
  return answer;
}

}
