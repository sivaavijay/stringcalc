import java.util.Scanner;

public class Calculator {

public static int Add(String numbers)
	{
		int sum=0;
        for(int i = 0; i < numbers.length() ; i++){
            if( Character.isDigit(numbers.charAt(i)) ){
                sum = sum + Character.getNumericValue(numbers.charAt(i));
            }
        }
		
		return sum;
	}
	
	public static void main(String args[])
	{
		Scanner scanner = new Scanner(System.in);
		String num = scanner.next();
		System.out.println(Add(num));
		
	}
}
