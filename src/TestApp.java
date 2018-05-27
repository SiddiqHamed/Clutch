
public class TestApp {
	public static void main (String agrs[])
	{
		System.out.println("Hello world");
		int age = 13 ;
		int birthYear = 2000 ;
		
		int thisYear = calcYear( age , birthYear);
		
		System.out.println("the result = "+thisYear);
		System.out.println("I am actully the master branch");
		
	}
	
	public static int calcYear(int x , int y)
	{
		return x + y ;
	}
	
	public static int calcYear(int x , int y , int z)
	{
		return x + y ;
	}

}
