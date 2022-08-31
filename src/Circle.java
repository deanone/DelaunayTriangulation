public class Circle {
	Point c;
	double r;

	public Circle(Point c, double r) {
		this.c = c;
		this.r = r;
	}
	
	public void setCenter(Point c) {
		this.c = c;
	}
	
	public void setRadius(double r) {
		this.r = r;
	}
	
	public Point getCenter() {
		return c;
	}
	
	public double getRadius() {
		return r;
	}
	
	public double getArea() {
		return Math.PI * (this.r * this.r);
	}
	
	public double getLength() {
		return 2 * Math.PI * this.r;
	}
	
	public double getDiameter() {
		return 2 * this.r;
	}
	
	public boolean isInside(Point A) {
		double distanceFromCenter = Math.sqrt(Math.pow(A.x - this.c.x, 2) + Math.pow(A.y - this.c.y, 2));
		if (distanceFromCenter < this.r) {
			return true;
		}
		else {
			return false;
		}
	}
}