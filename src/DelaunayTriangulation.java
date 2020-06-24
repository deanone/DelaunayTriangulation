import java.util.Random;
import java.util.ArrayList;
import javax.swing.JFrame;

public class DelaunayTriangulation
{

	public static void main(String[] args) 
	{
		// Generate random points in the 2d plane
		int numOfPoints = 100;
		double minX = 0;
		double maxX = 1000;
		double minY = minX;
		double maxY = maxX;
		
		ArrayList<Point> points = new ArrayList<Point>();
		for (int i = 0; i < numOfPoints; i++)
		{
			Random r = new Random();
			double x = minX + (maxX - minX) * r.nextDouble();
			double y = minY + (maxY - minY) * r.nextDouble();
			Point p = new Point(x, y);
			points.add(p);
		}
		
		// plot points in 2d plane
		DelaunayDrawer drawer = new DelaunayDrawer(points);
		JFrame frame = new JFrame("Results");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(drawer);
		frame.setSize(1000, 1000);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);

	}

}
