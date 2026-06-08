package SDETProgram;

public class vowelsConstants {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String input="Selenium 4.0";
		String vowels="aeiou";
		char[] chars = input.toCharArray();
		int vowelcount=0;
		int constantcount=0;
		for(int i=0;i<chars.length;i++)
		{
			
			if(vowels.indexOf(chars[i])!=-1)
			{
				vowelcount++;
			}
			if(!Character.isLetter(chars[i]))
			{
				constantcount++;
			}
		}
		
		System.out.println(vowelcount);
		System.out.println(constantcount);
	}

	
}
