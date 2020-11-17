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
		
		// VEZBE 4
		System.out.println(p1);
		System.out.println(l1);
		System.out.println(r1);
		System.out.println(c1);
		
		p1 = p2;
		
		Point p3 = new Point(6, 7);
		Line l3 = new Line(p2, new Point(12, 13));
		Rectangle r3 = new Rectangle(new Point(p2.getX(), p2.getY()), 50, 100);

		p2.setX(50);
		r2.getUpperLeft().setX(p2.getX());

		Circle c2 = new Circle(new Point(), 10, true);

		System.out.println("X, Y center c2: " + c2.getCenter().getX() + " " + c2.getCenter().getY());
		System.out.println("p2 x: " + p2.getX());
		System.out.println("l2 x startPoint: " + l2.getStartPoint().getX());
		System.out.println("r2 upperLeft x: " + r2.getUpperLeft().getX());

		// kreirati pravougaonik r3 tako da ima iste koordinate kao pocetna tacka l2
		// tako da se promenom x i y pocetne tacke l2 ne promene x, y r3
		// visina duzina linije l2
		// sirina povrsina r2 umanjena za povrsina c2
		// selected vrednost izraza konjunkcije selected krajnje tacke l2 i p1

		Rectangle r4 = new Rectangle(new Point(l2.getStartPoint().getX(), l2.getStartPoint().getY()),
				(int) (r2.area() - c2.area()), (int) (l2.length()), l2.getEndPoint().isSelected() && p1.isSelected());

		System.out.println(p1);
		System.out.println(l2);
		System.out.println(r4 + " selected = " + r4.isSelected());
		System.out.println(c2);

		Point p5 = new Point(5, 6);
		Point p6 = p5;
		Point p7 = new Point(5, 6);

		System.out.println("p5 == p6: " + (p5 == p6));
		System.out.println("p5 == p7: " + (p5 == p7));

		System.out.println("p5 equals p6: " + p5.equals(l1));
		System.out.println("p5 equals p7: " + p5.equals(p7));

		Line l4 = new Line(new Point(10, 11), new Point(12, 13));
		Line l5 = new Line(new Point(10, 11), new Point(12, 13));

		System.out.println("l3 equals l4: " + l3.equals(l4));
	}

}
