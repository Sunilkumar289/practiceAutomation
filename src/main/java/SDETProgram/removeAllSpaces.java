package SDETProgram;

public class removeAllSpaces {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String str =" s u n i  l k";
		//System.out.println(str.replaceAll(" ", ""));
		
		String str1="";
		for(char c:str.toCharArray())
		{
			if(!Character.isWhitespace(c))
			{
				str1=str1+c;
			}
		}
		System.out.println(str1);
	}

}
