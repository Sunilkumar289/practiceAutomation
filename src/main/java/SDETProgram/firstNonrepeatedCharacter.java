package SDETProgram;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class firstNonrepeatedCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(firstNonrepeatedChar("swiss"));
		System.out.println(firstNonrepeatedChar1("swisws"));
	}
	

	public static String firstNonrepeatedChar(String input)
	{
		
		
		String str1[] = input.split("");
		String NonrepeatedChar="";
		outer:
		for(int i=0;i<str1.length;i++)
		{
			inner:
			for(int j=i+1;j<str1.length;j++)
			{
				if(str1[i].equals(str1[j]))
				{
					continue outer;
				}
			}
			
			 NonrepeatedChar=str1[i];
			break;
		}
		
		return NonrepeatedChar;
		
	}
	
	public static Character firstNonrepeatedChar1(String input)
	{
		
		
		Map<Character,Integer> freq = new LinkedHashMap();
		for(char c: input.toCharArray()) {
			freq.merge(c, 1, Integer::sum);
		}
		
		
		for(Entry<Character, Integer> entry :freq.entrySet()) {
			
			if(entry.getValue()==1)
			{
				return entry.getKey();
			}
		}
		
		
		return null;
		
		
	}
}
