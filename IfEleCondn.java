package classprograms;

public class IfEleCondn {

	public int minFunction(int n, int m)
	{
		int min;
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
		System.out.println(result.minFunction(11,12));
		}

}
