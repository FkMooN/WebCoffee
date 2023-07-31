package Helptools;
import Exception.*;
import java.util.regex.*;
public class AccountValidator {
	public static boolean isValidPhoneNumber(String s)
    {
        // The given argument to compile() method
        // is regular expression. With the help of
        // regular expression we can validate mobile
        // number.
        // The number should be of 10 digits.
 
        // Creating a Pattern class object
        Pattern p = Pattern.compile("^\\d{10}$");
 
        // Pattern class contains matcher() method
        // to find matching between given number
        // and regular expression for which
        // object of Matcher class is created
        Matcher m = p.matcher(s);
 
        // Returning boolean value
        return (m.matches());
    }
    public static boolean isOnlyChaAndSpace(String str)
	    {
		System.out.println("str "+str);
	       // String s=toKhongDau(str);
	        String s=str;
	        System.out.println("s "+s);
	        for (int i = 0; i < s.length(); i++) {
	        	 
	            // Checking the character for not being a
	            // letter,digit or space
	            if ((!Character.isLetter(s.charAt(i)))&&(!Character.isWhitespace(s.charAt(i)))) {
	            	System.out.println("sai "+"i: "+i+" "+s.charAt(i));
	            	return false;
	            }
	        }
			return true;   
	    }
	public static boolean isValidUsername(String name)
    {
  
        // Regex to check valid username.
        String regex = "^[A-Za-z]\\w{5,29}$";
  
        // Compile the ReGex
        Pattern p = Pattern.compile(regex);
  
        // If the username is empty
        // return false
        if (name == null) {
            return false;
        }
  
        // Pattern class contains matcher() method
        // to find matching between given username
        // and regular expression.
        Matcher m = p.matcher(name);
  
        // Return if the username
        // matched the ReGex
        return m.matches();
    }
    // A utility function to check
    // whether a password is valid or not
    public static void isValidPassword(String password) throws InvalidPasswordException
    {
  
        // for checking if password length
        // is between 8 and 15
        if (!((password.length() >= 8)
              && (password.length() <= 15))) {
            throw new InvalidPasswordException(1);
        }
  
        // to check space
        if (password.contains(" ")) {
            throw new InvalidPasswordException(2);
        }
        if (true) {
            int count = 0;
  
            // check digits from 0 to 9
            for (int i = 0; i <= 9; i++) {
  
                // to convert int to string
                String str1 = Integer.toString(i);
  
                if (password.contains(str1)) {
                    count = 1;
                }
            }
            if (count == 0) {
                throw new InvalidPasswordException(3);
            }
        }
  
        // for special characters
        if (!(password.contains("@") || password.contains("#")
              || password.contains("!") || password.contains("~")
              || password.contains("$") || password.contains("%")
              || password.contains("^") || password.contains("&")
              || password.contains("*") || password.contains("(")
              || password.contains(")") || password.contains("-")
              || password.contains("+") || password.contains("/")
              || password.contains(":") || password.contains(".")
              || password.contains(", ") || password.contains("<")
              || password.contains(">") || password.contains("?")
              || password.contains("|"))) {
            throw new InvalidPasswordException(4);
        }
  
        if (true) {
            int count = 0;
  
            // checking capital letters
            for (int i = 65; i <= 90; i++) {
  
                // type casting
                char c = (char)i;
  
                String str1 = Character.toString(c);
                if (password.contains(str1)) {
                    count = 1;
                }
            }
            if (count == 0) {
                throw new InvalidPasswordException(5);
            }
        }
  
        if (true) {
            int count = 0;
  
            // checking small letters
            for (int i = 90; i <= 122; i++) {
  
                // type casting
                char c = (char)i;
                String str1 = Character.toString(c);
  
                if (password.contains(str1)) {
                    count = 1;
                }
            }
            if (count == 0) {
                throw new InvalidPasswordException(6);
            }
        }
  
        // The password is valid
    }
}