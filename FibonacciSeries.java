package week1.day1;

public class FibonacciSeries {

	public static void main(String[] args) {
	
		int a=0;
		int b=1;
		int c;
		int i;
		int count=7;
		System.out.println("Fibonacci Series upto range 8");
		System.out.println(""+a);
		System.out.println(""+b);
		
		for(i=2;i<count;i++) {
			c=a+b;
			System.out.println(""+c);
			a=b;
			b=c;
		}

	}

}
