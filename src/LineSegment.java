public class LineSegment
{
	Point A;
	Point B;
	
	public LineSegment(Point A, Point B)
	{
		this.A = A;
		this.B = B;
	}
	
	public Point getA()
	{
		return A;
	}
	
	public Point getB()
	{
		return B;
	}
	
	public Point getMid()
	{
		return new Point((A.x + B.x) / 2, (A.y + B.y) / 2);
	}
}
