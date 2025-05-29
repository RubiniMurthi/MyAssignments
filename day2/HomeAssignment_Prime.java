package week1.day2;

public class HomeAssignment_Prime {

	public static void main(String[] args) {
		//prime from 0-20
		for(int i=0; i<=20; i++) {
			int count =0; // to have track of how many number divisible by i (With no reminder)
			for(int a=1; a<=i; a++) {
				if(i%a==0) {
					count++;
			}
			}
			if(count==2){
				System.out.println(i);
			}
			}
		}

	}


