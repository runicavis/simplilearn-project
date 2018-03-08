package devops.numbers;

import java.util.Arrays;
import java.util.List;

public class NumberWords {

	List<String> list = Arrays.asList ("","One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Eleven", "Twleve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Ninteen"); 
	List<String> Tenlist = Arrays.asList(" ", "Ten", "Twenty", "Thirty", "Fourty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety");
	List<String> TenMultiple = Arrays.asList("Hundred");
	
	
	public String toWords( int number ) {
		String result = "";
		result = toWords(number,"");
		return result.trim();
	}

	public String toWords( int number,String result1 ) {
		String result = result1.trim();
		
		
		if(number < 0){
			result = "Number out of Range, please provide number in range from 1 to 999 only";
		}
		
		if (number > 999){
		//	System.out.println("Please try again Max number supported 999");
			result = "Please try again Max number supported 999";
		}
		
		if (number >0 && number <= 19){
			result = list.get(number);
		}
		
			if(number >19 && number <= 99){
				int n1 = number / 10;
				int n2 = number % 10;
				result = Tenlist.get(n1) + " " +list.get(n2);
			}
			
				if(number >99 && number <= 999){
					int n1 = number / 100;
					int n2 = number % 100;
					result = list.get(n1) + " " + TenMultiple.get(0)+ " " + toWords(n2);
				}
				
				
				return result.trim();
	}
}
