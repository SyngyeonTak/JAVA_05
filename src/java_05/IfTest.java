package java_05;

import java.util.Scanner;

public class IfTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num1 = 0, num2 =0;
		String n1Msg = "num1 : ";
		String n2Msg = "num2 : ";
		
		System.out.print(n1Msg);
		num1 = sc.nextInt();
		System.out.print(n2Msg);
		num2 =sc.nextInt();
		
		if(num1 > num2) {
			System.out.println("num1 is bigger");
		} else if(num2 == num1){
			System.out.println("same number");
		} else {
			System.out.println("num2 is bigger");
		}
	}


}
