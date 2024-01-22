package practice;

public class LargestBetnTwoWithoutIf {
	public int largest(int a, int b){
		int d= a*((a/b) > 0?1:0)+ b*((b/a) > 0?1:0);
		return a>b?a:b;
		//return d;
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=5;
		int b=56;
		LargestBetnTwoWithoutIf lr = new LargestBetnTwoWithoutIf();
		System.out.println("Largest number is : " + String.valueOf(lr.largest(a, b)));

	}

}
