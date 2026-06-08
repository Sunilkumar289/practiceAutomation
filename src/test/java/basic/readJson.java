package basic;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

public class readJson {
	
	@DataProvider
	public Object[][]testjson() throws IOException
	{
		Object[][] jsonData= null;
		ObjectMapper mapper = new ObjectMapper();
		File file =new File("./src/test/java/testDataManagement/userJ.json");
		JsonNode node =mapper.readTree(file);
		JsonNode customers=node.get("customers");
		int rowCount = node.get("customers").size();
		int columCount = node.get("customers").get(0).size();
		
		jsonData= new Object[rowCount][columCount];
		
		for(int i=0;i<rowCount;i++)
		{
			
				jsonData[i][0]=customers.get(i).get("firstName").asText();
				jsonData[i][1]=customers.get(i).get("lastName").asText();
				jsonData[i][2]=customers.get(i).get("ID").asText();
			
		}
		
		return jsonData;	
		
	}

}
