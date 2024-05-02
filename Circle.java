package classprograms;

public class Circle {

	int radius;
	public double area(double radius)
	{
		return 3.14*radius*radius;
	}
	public double circum(double radius)
	{
		return 2*3.14*radius;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Circle c= new Circle();
		System.out.println(c.area(5));
		System.out.println(c.circum(5));

	}

}
