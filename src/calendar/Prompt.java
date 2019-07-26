package calendar;

import java.util.Scanner;

public class Prompt {
	
	private final static String PROMPT = "cal> ";
		
	public void runPrompt() {
		Calendar cal = new Calendar();
		Scanner sc = new Scanner(System.in);
		
		int month = 1;
		int year = 0;
		while(true) {
			
			System.out.println("\n년도를 입력하시오\n"); 
			System.out.println(PROMPT);
			year = sc.nextInt();
			System.out.println("\n월을 입력하시오\n"); 
			System.out.println(PROMPT); 
			month = sc.nextInt();
			if(month == -1) {
				break;
			}
			if(month > 12) {
				continue;
			}
			cal.printSampleCalendar(year, month);
			
		}
		System.out.println("Bye");
		sc.close();
			
	}

	public static void main(String[] args) {
		
		Prompt p = new Prompt();
		p.runPrompt();
		
		
		
	}

}
