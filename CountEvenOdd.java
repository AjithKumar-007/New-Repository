package day6For1;

public class CountEvenOdd {
public static void main(String[]args) {
	int a=25;
	int b=25;
	int evenCount=0;
	int oddCount=0;
	for(int i=0;i<=10;i++) {
		if(i%2==0) {
			evenCount++;
		}
		else {
			oddCount++;
		}
	}
	System.out.println("Even Count is "+evenCount);
	System.out.println("Odd Count is "+oddCount);
	System.out.println(a+b);
}
}


