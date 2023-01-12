package day6For1;

public class SamplePalindrome {
public static void main(String[]args) {
	String a="Madam";
	String b="";
	for(int i=a.length()-1;i>=0;i--) {
		b=b+a.charAt(i);
	}
	if(b.equalsIgnoreCase(a)) {
		System.out.println("It is palindrome");
	}
	else {
		System.out.println("It is not a palindrome");
	}
}
}
