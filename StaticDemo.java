package classprograms;

public class StaticDemo {

	int a = 0;
	public void display()
	{
		a++;
		System.out.println(a);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
		StaticDemo sd1=new StaticDemo();
		sd1.display();
		StaticDemo sd2=new StaticDemo();
		sd2.display();
	}

}
