package day6For1;

public class SamplePrimeNo {
public static void main(String[]args) {
	int num=10;
	boolean isPrime=true;
	for(int i=2;i<num;i++) {
		if(num%i==0) {
			isPrime=false;
		}
	}
	if(isPrime==true) {
		System.out.println(num+" is prime number");
	}
	else {
		System.out.println(num+" is not a prime number");
	}
}
}
