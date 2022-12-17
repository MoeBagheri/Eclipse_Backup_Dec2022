package codingBat;

import java.util.Arrays;

public class Project  {
    public static void main(String[] args) {
		// Note, these examples don't cover full test cases. 
    	
     	creditCardCheck("4003600000000014"); // AMEX	
   // 	creditCardCheck("378282246310005"); // AMEX
  //    creditCardCheck("4012888888881881"); // VISA
 //		creditCardCheck("5105105105105100"); // MASTERCARD
 //       creditCardCheck("123"); // INVALID
    }

	public static void creditCardCheck(String creditCard) {
		if (creditCard.contains("-")) {
			System.out.println("INVALID");
		}
		/*
	//	char[] card = creditCard.toCharArray();
		// System.out.println(creditCard);
		// System.out.println(card[1]);
		int sum = 0;
		 
		for (int i = creditCard.length()-1; i >= 0; i--) {

		//	System.out.println(creditCard.charAt(i));
			if (i%2==0) {
				String str =creditCard.substring(i,i+1);
			//	System.out.println(str);
				int[] num = new int[creditCard.length()];
				for (int j = 0; j < creditCard.length(); j++) {
					num[j] = Integer.parseInt(creditCard.substring(j, j + 1));
					System.out.println(Arrays.toString(num));				}

			}

			// sum += numAtInDex;
			// System.out.println(sum);
		}
		*/
	///////////////////////////////////////////////////////////
		
		if (creditCard.length()%2==0) {
		int[] num = new int[creditCard.length()];
        for (int i = 0; i < creditCard.length(); i++) {
           
            if (i%2==0) {
    			System.out.println(Arrays.toString(num));
    			 num[i] = Integer.parseInt(creditCard.substring(i, i + 1));
    			 
            }
        }
        System.out.println(Arrays.toString(num));
        
		}
        
        
        
        
    

	}
}