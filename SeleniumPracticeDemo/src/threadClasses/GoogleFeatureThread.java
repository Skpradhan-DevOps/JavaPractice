package threadClasses;

import multiThreading.GooglePage;

public class GoogleFeatureThread extends Thread{
	
	public String browserName;
	GooglePage googlePage;

	public GoogleFeatureThread(String threadName, String browserName) {
		super(threadName);
		this.browserName=browserName;	
		googlePage=new GooglePage();
	}
	@Override
	public void run() {
		System.out.println("thread...started" + Thread.currentThread().getName());
		try {
			Thread.sleep(1000);
			googlePage.setUp(this.browserName);
			googlePage.googleSearchTest();
			
		}
		catch (Exception e){
			e.printStackTrace();
			
		}
		finally {
			googlePage.TearDown();
		}
		System.out.println("Thread...Ended" +Thread.currentThread().getName());

	}

}
