package findLargestelement;

public class palindromString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//       String str = "ABBA";
//       String str = "BAB";
//       String str = "BAAB";
         String str = "BAADAAB";
 //      String str = "BAADEAAB";
       str = str.toLowerCase();
       String rev_val = "";
       String orginal_val = str;
       
       for(int i = str.length() - 1; i >= 0; i--) {
    	   rev_val = rev_val + str.charAt(i);
       }
       System.out.println("The reverse String is :"+rev_val);
       
       if (orginal_val.equals(rev_val)) {
    	   System.out.println("Yes/True, This is Palindrome :"+orginal_val);
       } else {
    	   System.out.println("No/False, This is not Palindrome :"+orginal_val);
       }
	}

}
