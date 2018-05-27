
public class TestApp {
	public static void main (String agrs[])
	{
		System.out.println("Hello world");
		int age = 13 ;
		int birthYear = 2000 ;
		
		int thisYear = calcYear( age , birthYear);
		
		System.out.println("the result = "+thisYear);
		
	}
	
	public static int calcYear(int x , int y)
	{
		return x + y ;
	}

}
