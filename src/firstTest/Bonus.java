package firstTest;
import java.util.ArrayList;
import java.util.List;

public class Bonus {
	public static void main(String[] args) {
		printBonusDatesBetween(2010, 2015);
	}
	
	public static void printBonusDatesBetween(int fromYear, int toYear){
		List<Integer> listOfYear = getNumberRange(fromYear, toYear);
		
		int dayNR = 0;
		int monthNR = 0;
		String originalYear = "";
		
		for(int element:listOfYear) {
			originalYear = Integer.toString(element);
			String days = reverse(originalYear.substring(0,2)); //days
			String months = reverse(originalYear.substring(2, 4)); //months
			dayNR = Integer.parseInt(days);
			monthNR = Integer.parseInt(months);
			
			if(dayNR < 32 && monthNR < 13) {
				System.out.println(originalYear + "-" + months + "-" + days );
			}
			
		};	
	}
	
	public static String reverse(String str) {
		StringBuilder sb=new StringBuilder(str); 
		sb.reverse();
		return sb.toString();  
	}
	
	public static List<Integer> getNumberRange(int start, int end) {
	    List<Integer> result = new ArrayList<>();
	    for (int i = start; i < end; i++) {
	        result.add(i);
	    }
	    return result;
	}	
}
