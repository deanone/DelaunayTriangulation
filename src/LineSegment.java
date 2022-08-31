public class LineSegment {
	Point A;
	Point B;
	
	public LineSegment() {
		this.A = null;
		this.B = null;
	}
	
	public LineSegment(Point A, Point B) {
		this.A = A;
		this.B = B;
	}
	
	public void setA(Point A) {
		this.A = A;
	}
	
	public void setB(Point B) {
		this.B = B;
	}
	
	public Point getA() {
		return A;
	}
	
	public Point getB() {
		return B;
	}
	
	public Point getMid() {
		return new Point((A.x + B.x) / 2, (A.y + B.y) / 2);
	}
	
	public double getLength() {
		double length = 0.0;
		length = Math.sqrt(Math.pow(A.x - B.x, 2) + Math.pow(A.y - B.y, 2));
		return length;
	}
}