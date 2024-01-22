package runner;

import threadClasses.GoogleFeatureThread;

public class GoogleTestRunner {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Thread t1=new GoogleFeatureThread("chrome thread", "chrome");
		Thread t2=new GoogleFeatureThread("firefox thread", "firefox");
		
		System.out.println("thread..started");
		t1.start();
		t2.start();

	}

}
