package calendar;

import java.util.Scanner;

public class Prompt {
	
	private final static String PROMPT = "cal> ";
	
	// weekday =  요일명
	//  return 0~6
	public int parseDay(String str_weekday) {
		if(str_weekday.equals("SU")) {
			return 0;
		}
		else if(str_weekday.equals("MO")) {
			return 1;
		}
		
		else if(str_weekday.equals("TU")) {
			return 2;
		}
		
		else if(str_weekday.equals("WE")) {
			return 3;
		}
		
		else if(str_weekday.equals("TH")) {
			return 4;
		}
		
		else if(str_weekday.equals("FR")) {
			return 5;
		}
		
		else if(str_weekday.equals("SA")) {
			return 6;
		}
		
		else return 0;
	}
		
	public void runPrompt() {
		Calendar cal = new Calendar();
		Scanner sc = new Scanner(System.in);
		
		int month = 1;
		int year = 0;
		int week;
		while(true) {
			
			System.out.println("\n년도를 입력하시오\n"); 
			System.out.println(PROMPT);
			year = sc.nextInt();
			System.out.println("\n월을 입력하시오\n"); 
			System.out.println(PROMPT); 
			month = sc.nextInt();
			System.out.println("첫번째 요일을 입력하시오(SU, MO, TU, WE, TH, FR, SA)");
			System.out.println(PROMPT);
			String str_weekday = sc.next();
			week = parseDay(str_weekday);
			
			
			cal.printSampleCalendar(year, month, week);
		
			
		
			
	
			
		
		
			
			}
			
		}

	public static void main(String[] args) {
		
		Prompt p = new Prompt();
		p.runPrompt();
		
		
		
	}

}
