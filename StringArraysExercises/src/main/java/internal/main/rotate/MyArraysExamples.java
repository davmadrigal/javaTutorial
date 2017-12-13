package internal.main.rotate;

import java.util.Arrays;

public class MyArraysExamples {
	
	public void rotateArray(Integer [] nums, int pos) {
		
		System.out.println(Arrays.toString(nums));
		
		System.out.println(pos%nums.length);
		
		Integer [] aux = new  Integer[nums.length];
		
		int j=0;
		for(int i=nums.length-pos;i<nums.length;i++) {
			aux[j]=nums[i];
			j++;
		}
		
		for (int i=0; i<nums.length-pos;i++) {
			aux[j]=nums[i];
			j++;
		}
		
		System.out.println(Arrays.toString(aux));
		
	}
	
//	public void rotateArray2(Integer [] nums, int pos) {
//		if (nums == null || pos<0) {
//			throw new IllegalArgumentException("Illegall Argument");
//		}
//		
//		for (int i=0; i<pos; i++){
//			for (int j=)
//		}
//	}


}
