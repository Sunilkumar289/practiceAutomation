package SDETProgram;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class duplicateCharInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		firstNonrepeatedChar1("programming");
		
	}
	public static void firstNonrepeatedChar1(String input)
	{
		Map<Character,Integer> freq = new LinkedHashMap();
		for(char c: input.toCharArray()) {
			freq.merge(c, 1, Integer::sum);
		}
		
		for(Entry<Character, Integer> entry :freq.entrySet()) {
			
			if(entry.getValue()>1)
			{
				System.out.println(entry.getKey()+"->"+entry.getValue());
			}
		}
	}

}
