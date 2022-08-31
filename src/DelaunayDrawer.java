import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.JPanel;

public class DelaunayDrawer extends JPanel {
	ArrayList<Point> points;
	public DelaunayDrawer(ArrayList<Point> points) {
		this.points = new ArrayList<Point>();
		this.points = points;
	}
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		Graphics2D g2dObject = (Graphics2D) g;
		for (int i = 0; i < points.size(); i++) {
			Point p = points.get(i);
			double x = p.getX();
			double y = p.getY();
			Color c = Color.RED;
			g2dObject.setColor(c);
			g2dObject.fillOval((int)x, (int)y, 10, 10);
		}		
	}
}