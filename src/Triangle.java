
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
	
	static Point lineLineIntersection(Line l1, Line l2)
	{
		double a1 = l1.getA();
		double b1 = l1.getB();
		double c1 = l1.getC();
		
		double a2 = l2.getA();
		double b2 = l2.getB();
		double c2 = l2.getC();
		
		double det = (a1 * b2) - (a2 * b1);
		if (det == 0)
		{
			System.out.println("The lines are parallel");
			return new Point(Double.MAX_VALUE, Double.MAX_VALUE);
		}
		else
		{
            double x = ((b2 * c1) - (b1 * c2)) / det; 
            double y = ((a1 * c2) - (a2 * c1)) / det; 
            return new Point(x, y); 
		}
	}
	
	void computeCircumcenter()
	{
		if (circumcenter == null)
		{
			Line side1 = new Line(A, B);
			Point side1Mid = new Point((A.x + B.x) / 2, (A.y + B.y) / 2);
			Line side1Perpendicular = side1.getPerpendicular(side1Mid);
			
			Line side2 = new Line(B, C);
			Point side2Mid = new Point((B.x + C.x) / 2, (B.y + C.y) / 2);
			Line side2Perpendicular = side2.getPerpendicular(side2Mid);
			
			circumcenter = lineLineIntersection(side1Perpendicular, side2Perpendicular);
		}
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
	
	public Point getCircumcenter()
	{
		return circumcenter;
	}
}
