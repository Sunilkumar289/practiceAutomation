package SDETProgram;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class stringLengthwithoutLengthMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(firstNonrepeatedChar1("suni l"));
	}
	
	public static int firstNonrepeatedChar1(String input)
	{
		int count=0;
		for(char c:input.toCharArray()) {
			
			count++;
		}
			
		return count;
	}

}
