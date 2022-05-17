package week1day1assesment;

public class FibonacciSeries {
	
// method created for Fibonacci series	
	public void fiboSer()
	{
		System.out.println("Fibonacci Series");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FibonacciSeries Series = new FibonacciSeries();
		Series.fiboSer();
		
	int limit = 10;
	int FirstNumber = 0;
	int SecondNumber = 1;
	int sum;
	System.out.println(FirstNumber);
	System.out.println(SecondNumber);
	
	for(int i = 1; i <= limit; i++)
	{
		sum = FirstNumber + SecondNumber;
		FirstNumber = SecondNumber;
		SecondNumber = sum;
		
	System.out.println(sum);
	}
	}
}
