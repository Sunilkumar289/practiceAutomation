package SDETProgram;

public class toggleCaseEachCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(togglecase("SeLeNiUm4"));
	}

	public static String togglecase(String input)
	{
		String str1="";
		for(char c:input.toCharArray())
		{
			if(Character.isLowerCase(c)) {
				c = Character.toUpperCase(c);
				str1=str1+c;
				continue;
			}
			else if(Character.isUpperCase(c)) {
				c = Character.toLowerCase(c);
				str1=str1+c;
			}
			else {
				str1=str1+c;
			}
		}
		return str1;
	}
}
