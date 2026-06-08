package SDETProgram;

public class plaindromecheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(plaindrome("Madam"));
	}

	public static boolean plaindrome(String input)
	
	{
		Boolean isPlaindrome=true;
		String inputString[] = input.toLowerCase().split("");
		String reverseString="";
		for(int i=inputString.length-1;i>=0;i--)
		{
			if(!inputString[i].equals(inputString[(inputString.length-1)-i]))
			{
				isPlaindrome=false;
				break;
			}
			
				reverseString=reverseString+inputString[i];
			}
		
		if(reverseString.equals(input))
		{
			isPlaindrome=true;
		}
		return isPlaindrome;
		
	}
}
