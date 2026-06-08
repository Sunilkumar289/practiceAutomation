package SDETProgram;

import java.util.Scanner;

public class reverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		System.out.println(reverseString("automation"));
		System.out.println(reverseString1("automation"));
	}
	
	public static String reverseString(String input)
	{
		if(input==null) {
			System.out.println("input string is null");
			return null;
		}
		char[] chars = input.toCharArray();
		int left=0;
		int right=chars.length-1;
		while(left<right)
		{
			char temp =chars[left];
			chars[left]=chars[right];
			chars[right]=temp;
			left++;
			right--; 
		}
		return new String(chars);
	}
	
	public static String reverseString1(String input)
	{
		String[] str=input.split("");
		String reverse="";
		for(int i=str.length-1;i>0;i--) {
			reverse=reverse+str[i];
		}
		return reverse;
		
	}

}
