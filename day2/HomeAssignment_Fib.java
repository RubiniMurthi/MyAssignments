package week1.day2;

public class HomeAssignment_Fib {

	public static void main(String[] args) {
		int n = 8;           // Numb of terms to print
        int first = 0;       // 1st number in Fibonacci series
        int second = 1;     // Second number

        for (int i = 1; i <= n; i++) {
            System.out.print(first + " ");

                                            // Calculate the next number
            int next = first + second;
                                            // Update values for next loop
            first = second;
            second = next;
	}
	}
}
