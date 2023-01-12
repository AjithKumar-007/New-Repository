package day6For1;

public class AddEvenOdd {
public static void main(String[]args) {
	int even=0;
	int odd=0;
	for(int i=0;i<10;i++) {
		if(i%2==0) {
			even=even+i;
		}
		else {
			odd=odd+i;
		}
	
	}
	System.out.println("Sum of even number is "+even);
	System.out.println("Sum of odd number is "+odd);
}
}
