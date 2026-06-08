package SDETProgram;

public class longestWordInsentence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	System.out.println(longestWordSentence("automation is powerful"));
		
		
	}
	
	public static String longestWordSentence(String input)
	{
		String header="";
		String longestWord="";
		int longestwordlength=0;
		
		for(String str1:input.trim().split(" "))
		{
			if(str1.length()>longestwordlength)
			{
				longestWord=str1;
				longestwordlength=str1.length();
			}
			
		}
		return longestWord;
		

}

}
