package SDETProgram;

public class extractOnlyDigitsInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(extractDigits("order42xyz99"));
	}

	public static String extractDigits(String input)
	{
		String str1="";
		for(char c:input.toCharArray())
		{
			if(Character.isDigit(c))
			{
				str1=str1+c;
			}
			
}
		return str1;
	}
}
