package classprograms;

public class IfEleCondn2 {
	
	public double minFunction(double n, double m)
	{
		double min;
		if(n>m)
		{
			min=m;
		}
		else
		{
			min=n;
		}
		return min;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		IfEleCondn result=new IfEleCondn();
		System.out.println(result.minFunction(10,20));
	}

}
