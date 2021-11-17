public class sameFirstLast{
	// Given an array of ints
	// return true if the array is length 1 or more
	// and the first element and the last element are equal.
	
	public static boolean sameFirstLast(int[] nums) {
        return (nums.length>= 1 && nums[0] == nums[nums.length - 1] );
    }
	public static void main(String[] args) {
		int[] test1 = {1, 2, 3};
		int[] test2 = {1, 2, 3, 1};
		int[] test3 = {1, 2, 1};
		int[] test4 = {7};
		int[] test5 = {};
		int[] test6 = {1, 2, 3, 4, 5, 1};
		int[] test7 = {1, 2, 3, 4, 5, 13};
		int[] test8 = {13, 2, 3, 4, 5, 13};
		int[] test9 = {7, 7};
	
		System.out.println(sameFirstLast(test1));
		System.out.println(sameFirstLast(test2));
		System.out.println(sameFirstLast(test3));
		System.out.println(sameFirstLast(test4));
		System.out.println(sameFirstLast(test5));
		System.out.println(sameFirstLast(test6));
		System.out.println(sameFirstLast(test7));
		System.out.println(sameFirstLast(test8));
		System.out.println(sameFirstLast(test9));
	
	}
}
