public class commonEnd{
	// Given 2 arrays of ints, a and b, 
	// return true if they have the same first element 
	// or they have the same last element. Both arrays will be length 1 or more.
	
	public static boolean commonEnd(int[] a, int[] b) {
        return (a[a.length - 1] == b[b.length - 1]) || (a[0] == b[0]);
    }
	public static void main(String[] args) {
		int[] test1 = {1, 2, 3};
		int[] test2 = {7, 3};
		int[] test3 = {1, 2, 3};
		int[] test4 = {7, 3, 2};
		int[] test5 = {1, 2, 3};
		int[] test6 = {1, 3};
		int[] test7 = {1, 2, 3};
		int[] test8 = {1};
		int[] test9 = {1, 2, 3};
		int[] test10 = {2};
	
		System.out.println(commonEnd(test1, test2));
		System.out.println(commonEnd(test3, test4));
		System.out.println(commonEnd(test5, test6));
		System.out.println(commonEnd(test7, test8));
		System.out.println(commonEnd(test9, test10));
	
	}
}
