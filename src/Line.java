
public class Line
{
	double a;
	double b;
	double c;
	
	public Line(double a, double b, double c)
	{
		this.a = a;
		this.b = b;
		this.c = c;
	}
	
	public Line(Point A, Point B)
	{
		a = B.y - A.y;
		b = A.x - B.x;
		c = (a * A.x) + (b * A.y);
	}
	
	public Line(LineSegment AB)
	{
		Point A = AB.getA();
		Point B = AB.getB();
		a = B.y - A.y;
		b = A.x - B.x;
		c = (a * A.x) + (b * A.y);
	}
	
	public double getA()
	{
		return a;
	}
	
	public double getB()
	{
		return b;
	}
	
	public double getC()
	{
		return c;
	}
	
	public Line getPerpendicular(Point A)
	{
		Line l = new Line((-1) * b, a, ((-1) * b * A.x) + (a * A.y));
		return l;
	}
	
}
