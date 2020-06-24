
public class Triangle
{
	Point A;
	Point B;
	Point C;
	Point circumcenter;
	
	public Triangle(Point A, Point B, Point C)
	{
		this.A = A;
		this.B = B;
		this.C = C;
	}
	
	public Point getA()
	{
		return A;
	}
	
	public Point getB()
	{
		return B;
	}
	
	public Point getC()
	{
		return C;
	}
}
