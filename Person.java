package classprograms;

public class Person {

	String name;
	int age;
	
	public Person(String name1, int age1)
	{
		name=name1;
		age=age1;
	}
	public String getName()
	{
		return name;
	}
	public int getAge()
	{
		return age;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Person pn=new Person("Sayali",22);
		System.out.println(pn.getName());
		System.out.println(pn.getAge());
		
		
	}

}
