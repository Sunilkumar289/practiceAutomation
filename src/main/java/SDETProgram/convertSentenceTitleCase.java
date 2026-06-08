package SDETProgram;

public class convertSentenceTitleCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(convertToSentence("the contet of page"));
	}
	
	public static String convertToSentence(String input)
	{
		String header="";
		for(String str1:input.trim().split(" "))
		{
			if(str1.isBlank())
			{
				header=header+str1;
			}
			else {
				
				str1 =str1.replace(str1.charAt(0), Character.toUpperCase(str1.charAt(0)));
				header=header+str1+" ";
			}
			
		}
		return header;
		

}
}