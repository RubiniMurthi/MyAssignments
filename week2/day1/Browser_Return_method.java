package week2.day1;

public class Browser_Return_method {
	
	public String launchBrowser(String name) {
		return name;
		

	}
	public int loadUrl(int number) {
		return number;

	}

	public static void main(String[] args) {
		Browser_Return_method browserOptions=new Browser_Return_method();
		String launchBrowser = browserOptions.launchBrowser("Browser launched successfully");
		System.out.println(launchBrowser);
		int url = browserOptions.loadUrl(7);
		System.out.println(url);
	}

}
