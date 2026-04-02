package stringreverse;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.IconifyAction;

public class ReverseString {
//first i do normal reverseString without the recursion 
	
//	public static String reverseNormal(String str) {
//        if (str == null) return null;
//        char[] cstr= str.toCharArray();
//        int left = 0;
//        int right = cstr.length - 1;
//        while(left<right) {
//        char temp=cstr[left];
//        cstr[left]=cstr[right];
//        cstr[right]=temp;
//        left++;
//        right--;
//        }
//		return new String(cstr);
//	
//}
	public static void Helper(char[] arr , int left , int right) {
		// base case:
	if(left>=right){
		return;
	}
	 // recursive case:
	char temp = arr[left];
	arr[left]=arr[right];
	arr[right]=temp;
	Helper(arr, left+1, right-1);
	}
	public static String reversebyrecursion(String str) {
		// base case:
		 if (str == null) return null;
		 // recursive case:
        char[] cstr= str.toCharArray();
        Helper(cstr, 0, str.length()-1);
		return new String(cstr);
	}
	public static boolean isPalinDrom(String str) {
		//base case:
		if (str == null) return false;
        if (str.length() <= 1) return true; 
        
        String reversed = reversebyrecursion(str);
        
        return str.equals(reversed);
	}
	public static int fabonacci(int n) {
		if(n==0|| n==1) {
			return n;
		}
		return fabonacci(n-1)+fabonacci(n-2);
	}
	public static void main(String[] args) {
		String string="Hello";
		String string2="Madam".toLowerCase();
	
		System.out.println(reversebyrecursion(string));
		System.out.println(isPalinDrom(string2));
	}
	}
