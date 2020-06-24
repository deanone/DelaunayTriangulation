
public class Circle 
{
	Point c;
	double r;

	public Circle(Point c, double r)
	{
		this.c = c;
		this.r = r;
	}
	
	public Point getCenter()
	{
		return c;
	}
	
	public double getRadius()
	{
		return r;
	}
}
