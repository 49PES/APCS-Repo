public class firstLast6{
	// Given an array of ints, 
	// return true if 6 appears as either the first or last element in the array. 
	// The array will be length 1 or more.
	
	public static boolean firstLast6(int[] nums) {
        return (nums[0] == 6) || (nums[nums.length - 1] == 6);
    }
	public static void main(String[] args) {
		int[] test1 = {1, 2, 6};
		int[] test2 = {6, 1, 2, 3};
		int[] test3 = {13, 6, 1, 2, 3};
		int[] test4 = {13, 6, 1, 2, 6};
		int[] test5 = {3, 2, 1};
		int[] test6 = {3, 6, 1};
		int[] test7 = {3, 6};
		int[] test8 = {6};
		int[] test9 = {3};
		int[] test10 = {5, 6};
		int[] test11 = {5, 5};
		int[] test12 = {1, 2, 3, 4, 6};
		int[] test13 = {1, 2, 3, 4};
		System.out.println(firstLast6(test1));
		System.out.println(firstLast6(test2));
		System.out.println(firstLast6(test3));
		System.out.println(firstLast6(test4));
		System.out.println(firstLast6(test5));
		System.out.println(firstLast6(test6));
		System.out.println(firstLast6(test7));
		System.out.println(firstLast6(test8));
		System.out.println(firstLast6(test9));
		System.out.println(firstLast6(test10));
		System.out.println(firstLast6(test11));
		System.out.println(firstLast6(test12));
		System.out.println(firstLast6(test13));
	}
}
