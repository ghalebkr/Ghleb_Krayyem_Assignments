package assignment_Constructor_Methods;


public class CalculateArea {
	double reclength;
	double recwidth;
	double sqlength;
	int radius;
	
	

public CalculateArea()
{
}
public CalculateArea(double s)
{
	sqlength =s;
}
public CalculateArea(double l, double w)
{
	reclength =l;
	recwidth = w;
}
public CalculateArea(int r )
{
	radius = r;
}

public void SquareArea ( double s)
{
	System.out.println("The Area of Square is " +(s*s));
}
public void RectangleArea ( double l, double w)
{
	System.out.println("The Area of Rectangle is " +(l*w));
}
public void CircleArea ( int r)
{
	System.out.println("The Area of Circle is " +(Math.PI*r*r));
}
public void Area (double d1, double d2)
{
	System.out.println("The Area of Rhombus is " +(d1*d2*0.5));
}
public void Area (int h, int b)
{
	System.out.println("The Area of Triangle is " +(h*b*0.5));
}

public static void main(String[] args) {
	CalculateArea ca = new CalculateArea();
	ca.CircleArea(3);
	ca.RectangleArea(5, 10);
    ca.SquareArea(2);
    ca.Area(3.1, 5.2);
    ca.Area(2, 4);
}
}