package practice;

public class MaxSubArray {
	public int maxSub(int nums[]) {
		int curSum=0;
		int maxSum=0;
		
		for(int i=0; i<nums.length; i++) {
			if(curSum<0) {
				curSum=0;
			}
			curSum=curSum+nums[i];
			if(curSum>maxSum) {
				maxSum=curSum;
			}

		}
		return maxSum;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MaxSubArray ms=new MaxSubArray();
		int nums[]= {-2,1,-3,4,-1,2,1,-5,4};
		System.out.println(ms.maxSub(nums));
		String s1 = "abc";
		StringBuffer s2 = new StringBuffer(s1);
		System.out.println(s1.equals(s2));
		
		

	}

}
