package problem2;

	public class Point {
		double x;
		  double y;
		  double distance;

		  public Point() {}

		  public Point(double x, double y) {
		    this.x = x;
		    this.y = y;
		  }

		  public double distance() {
		    return Math.sqrt(x * x + y * y);
		  }

		  public double distance(Point point) {
		    return Math.sqrt((point.x - x) * (point.x - x) + (point.y - y) * (point.y - y));
		  }

		  public void setX1(double x1) {
		    this.x = x1;
		  }

		  public void setY1(double y1) {
		    this.y = y1;
		  }
	}


