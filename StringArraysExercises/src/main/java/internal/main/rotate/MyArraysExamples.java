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
	
	// reversal two strings
	public void rotateArray2(Integer [] nums, int pos) {
		if (nums == null || nums.length==0 || pos<0) {
			throw new IllegalArgumentException("Illegall Argument");
		}
		
		if (pos > nums.length) {
			pos = pos%nums.length;
		}
		
		int a = nums.length - pos;
		
		reverse(nums,0,a-1);
		reverse(nums,a,nums.length-1);
		reverse(nums,0,nums.length-1);
		
		
	}

	private void reverse(Integer[] nums, int left, int right) {
		
		int temp;
		
			while (left<right) {
				temp = nums[left];
				nums[left] = nums[right];
				nums[right] = temp;
				left++;
				right--;
			}
			
		System.out.println(Arrays.toString(nums));
		
	}


}
