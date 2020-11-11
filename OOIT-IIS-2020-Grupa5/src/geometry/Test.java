package geometry;

public class Test {

	public static void main(String[] args) {
		// Vezbe 2
		Point p1 = new Point();
		p1.setX(3);
		p1.setY(5);
		p1.setSelected(true);
		
		System.out.println("X p1: " + p1.getX());
		System.out.println("Y p1: " + p1.getY());
		System.out.println("Selected p1: " + p1.isSelected());
		
		Point p2 = new Point();
		p2.setX(13);
		p2.setY(15);
		p2.setSelected(true);
		
		System.out.println("Udaljenost izmedju tacaka p1 i p2: " + p1.distance(p2.getX(), p2.getY()));
		p1.setX(p2.getX());
		System.out.println("Udaljenost izmedju tacaka p1 i p2: " + p1.distance(p2.getX(), p2.getY()));
	
		// Vezbe 3
		Line l1 = new Line();
		l1.setStartPoint(p1);
		l1.setEndPoint(p2);
		l1.setSelected(true);
		
		p1.setX(33);
		l1.getStartPoint().setX(55);
		
		System.out.println("X startPoint l1: " + l1.getStartPoint().getX());
		System.out.println("X p1: " + p1.getX());
		
		Line l2 = new Line();
		l2.setStartPoint(new Point());
		l2.getStartPoint().setY(p1.getX());
		
		l2.setEndPoint(p2);
		System.out.println("Y endPoint l2: " + l2.getEndPoint().getY());
		
		Rectangle r1 = new Rectangle();
		System.out.println("Area r1: " + r1.area());
		r1.setUpperLeft(p1);
		r1.setWidth(5);
		r1.setHeight((int) l2.length());
		
		System.out.println("Area r1: " + r1.area());
		
		Rectangle r2 = new Rectangle();
		r2.setUpperLeft(l1.getEndPoint());
		
		Circle c1 = new Circle();
		c1.setCenter(p2);
		System.out.println("\n\nX center c1: " + c1.getCenter().getX() +
				"\nY center c1: " + c1.getCenter().getY() +
				"\nRadius c1: " + c1.getR() +
				"\nSelected c1: " + c1.isSelected());
		
		c1.setR((int) c1.getCenter().distance(l1.getStartPoint().getX(), l1.getStartPoint().getY()));
		System.out.println("Radius c1: " + c1.getR());
		
		c1.setSelected(c1.getCenter().getX() > r1.getUpperLeft().getY());
		System.out.println("Selected c1: " + c1.isSelected());
		
		l1.getEndPoint().setY((int) ((c1.getCenter().getX() - c1.getCenter().getY())
				-
				(r1.getUpperLeft().getX() + c1.area())));
		System.out.println(l1.getEndPoint().getY());
	}

}
