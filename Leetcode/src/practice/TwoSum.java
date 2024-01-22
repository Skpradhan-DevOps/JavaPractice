package practice;

import java.util.HashMap;

public class TwoSum {
	public static int[] twoSum(int[] numbers, int target) {
		HashMap<Integer, Integer> map= new HashMap<Integer, Integer>();
		for(int i=0; i<numbers.length; i++) {
			Integer diff= target-numbers[i];
			if(map.containsKey(diff)) {
				int toReturn[]= {map.get(diff),i};
				return toReturn;
			}else {
				map.put(numbers[i], i);
			}
			
		}
		return null;
	}
	public static void main(String[] args) {
		int nums[]= {2,7,11,15};
		int target=9;
		System.out.println(TwoSum.twoSum(nums,target));
	}

}


