package practice;

import java.util.*;

public class ThreeSum {
	public static List<List<Integer>> threeSum(int[] nums){
		List<List<Integer>> res= new ArrayList<>();
		int sum=0;
		
		for(int i=0;i< nums.length; i++) {
			
			int a=nums[i];
			int l=i+1;
			int r= nums.length-1;
			while (l<r) {
				sum= a+nums[l]+nums[r];
				if (sum<0) {
					l+=1;
				}
				else if(sum>0) {
					r-=1;
				}else {
					res.add(Arrays.asList(a, nums[l], nums[r]));
					l+=1;
					while(nums[l]==nums[l+1] && l<r) {
						l+=1;
					}
				}
			}
		}
		return res;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums= {-1,0,1,2,-1,-4};
		System.out.println(threeSum(nums));
		

			
		}


}
