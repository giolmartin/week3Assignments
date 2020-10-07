	/**
	 * 
	 */
	import java.text.DecimalFormat;

	import acm.program.*;
	import java.util.*;


	public class StringProcessing extends ConsoleProgram{

		private char ch ;
		private String str;
		
	
		public void run() {
		
			
			while(true) {
				String digits = readLine("Enter a numeric string: ");
				if(digits.length() ==0)break;
				System.out.println(addCommas(digits));
			}		
		}
		
		
		/** Function of Variables  : 
		 *	- amountSpace to represent the real length of the string, starting from 0
 		 *	- result to write the resulting string that was being looped
		 *  - counter  */
		
		private String addCommas(String digits) {
			int amountSpace =   digits.length() - 1;    // ((digits.length() -1)  / 3 ) + digits.length();
			String result = "";
			int counter = 0;
				for(int i = amountSpace; i >= 0; i--) {
				result =  digits.charAt(i) + result   ; 
				counter++;
					if(((counter % 3) == 0) && (i > 0)) {
					result =    "," + result ; 
					}
				}
				return result;	
		}
		
		/** Found this method that belongs to the java.text library  when doing the bank app 
		 * needs to initialize that it wants to group numbers
		 * the amount that numbers that are grouped
		 * use parseDouble to convert String to double
		 * and format the variable
		*/
		private String addCommasToNumericString(String digits) {
			
			DecimalFormat dF = new DecimalFormat("#.##");
			dF.setGroupingUsed(true);
			dF.setGroupingSize(3);
			
			double numbers = Double.parseDouble(digits);
			digits  = dF.format(numbers);
			digits = digits.toString();
			return digits;
			
		}	
		
		
	}

