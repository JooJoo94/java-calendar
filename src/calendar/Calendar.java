package calendar;

public class Calendar {
	
	private final int[] MaxDays =  { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
	private final int[] LeapMaxDays =  { 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
	
	public boolean isLeapYear(int year) {
		if(year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) {
			return true;
		}
		else {
		return false;
		}
	}
	
	public int getmaxDaysOfMonth(int year, int month) {
		
		if(isLeapYear(year)) {
			return LeapMaxDays[month-1];
		}
		else {
			return MaxDays[month-1];
				
		}
	}
	
	
	public void printSampleCalendar(int year, int month, int weekday) {
		System.out.printf("      <<%d %d>>\n ", year, month);
		System.out.println("SU MO TU WE TH FR SA");
		System.out.println("---------------------");
		Calendar cal = new Calendar();
	
	
		int maxDay = getmaxDaysOfMonth(year, month);
		
		for(int j = 0; j < weekday; j++ ) {
			
			System.out.print("   ");
			
		}
		
		for(int i = 1; i <= maxDay; i++) {
			
			System.out.printf("%3d", i);
			if((i + weekday) % 7 == 0) {
				System.out.println();
			}
		}
		
		
	}
		
		
		


//		System.out.println(" 1  2  3  4  5  6  7 ");
//		System.out.println(" 8  9 10 11 12 13 14 ");
//		System.out.println("15 16 17 18 19 20 21 ");
//		System.out.println("22 23 24 25 26 27 28 ");	
//	}
	
	public static void main(String[] args) { 
		
		//숫자를 입력받아 달의 최대 일수를 출력하는 프로그램
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
