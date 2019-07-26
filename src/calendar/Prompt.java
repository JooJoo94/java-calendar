package calendar;

import java.util.Scanner;

public class Prompt {
	
	private final static String PROMPT = "cal> ";
		
	public void runPrompt() {
		Calendar cal = new Calendar();
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("\n월을 입력하시오\n"); 
			System.out.println(PROMPT); 
			
			int month = sc.nextInt();
			if(month == -1) {
				break;
			}
			if(month > 12) {
				continue;
			}
			cal.printSampleCalendar(2017, month);
			
		}
		System.out.println("Bye");
		sc.close();
			
	}

	public static void main(String[] args) {
		
		Prompt p = new Prompt();
		p.runPrompt();
		
		
		
	}

}
