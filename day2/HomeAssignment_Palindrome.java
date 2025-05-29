package week1.day2;

public class HomeAssignment_Palindrome {

	public static void main(String[] args) {
		int number = 121; 
        int originalNumber = number;
        int reversed = 0;

        // Reverse the number ; - referes to empty coz is already initialized.
        for (;number > 0; number = number / 10) {
            int digit = number % 10;             // Get the last digit
            reversed = reversed * 10 + digit;   // Build the reversed number
        }

        if (originalNumber == reversed) {
            System.out.println(originalNumber + " is a palindrome.");
        } 
        else {
            System.out.println(originalNumber + " is not a palindrome.");

	}

}
}
