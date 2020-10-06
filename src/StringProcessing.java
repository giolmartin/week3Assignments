	/**
	 * 
	 */
	import java.text.DecimalFormat;

	import acm.program.*;


	public class StringProcessing extends ConsoleProgram{

		private char ch ;
		private String str;
		public void run() {
		
			/*
			while(true) {
				String digits = readLine("Enter a numeric string: ");
				if(digits.length() ==0)break;
				println(addCommasToNumericString(digits));
			}
			*/	
				// toLower('D');
			
			
			isPalindrome("bob");
				
		}
		
		private String addCommasToNumericString(String digits) {
			
			DecimalFormat dF = new DecimalFormat("#.##");
			dF.setGroupingUsed(true);
			dF.setGroupingSize(3);
			
			double numbers = Double.parseDouble(digits);
			digits  = dF.format(numbers);
			digits = digits.toString();
			return digits;
			
		}
		
		private String addCommas() {
			return "";
		}
		
		private void toLower(char ch) { //this can be used to create a small encryption program.
			if (ch >= 'A' && ch <= 'Z') {
			ch = (char) (ch -'A' + 'a'); 
			System.out.println(ch);
			}
		}
		
		private boolean isPalindrome(String str) {
			for(int i =0; i < str.length() / 2; i++) {
				if (str.charAt(i) != 
						str.charAt(str.length() - (i + 1))) {
					System.out.println("No");
					return false;
				}
			}
			System.out.println("Yes");
			return true;
			
		}
		
	}

