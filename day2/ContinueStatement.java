package week1.day2;

public class ContinueStatement {

	public static void main(String[] args) {
		for(int i=1; i<=10; i++) {
			
			if(i==5){
				
				System.out.println("skip number 5");
				continue;
			}
			System.out.println(i);	

	}

}
}