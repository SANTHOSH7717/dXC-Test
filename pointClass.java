package problem2;

	public class pointClass {
		  public static void main(String[] args) {
		    Point p1 = new Point();
		    p1.setX1(2);
		    p1.setY1(3);
		    System.out.println("Distance of p1 from origin: " + p1.distance());

		    Point p2 = new Point();
		    p2.setX1(5);
		    p2.setY1(6);
		    System.out.println("Distance between p1 and p2: " + p1.distance(p2));
		  }
		  }

