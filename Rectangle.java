package classprograms;

public class Rectangle {
 
	int width;
	int height;
	public int area(int width, int height)
	{
		return width*height;
	}
	public int peri(int width,int height)
	{
		return 2*(width+height);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Rectangle r = new Rectangle();
		System.out.println(r.area(10,20));
		System.out.println(r.peri(10,20));
	}

}
