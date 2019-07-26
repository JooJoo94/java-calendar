package calendar;

import java.util.Scanner;

public class Sum {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("두 수를 입력하시오");
		
		String num1 = sc.next();
		String num2 = sc.next();
		
		int sum = Integer.parseInt(num1) +  Integer.parseInt(num2);
		System.out.println("두수의 합은 :");
		System.out.println(sum);
		sc.close();

	}

}
