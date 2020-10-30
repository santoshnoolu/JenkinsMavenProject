package JsonReader;
import java.io.FileReader;
import java.io.IOException;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class DataTable {
	static String testName;
	
	public static String getData(String Key) throws IOException, ParseException
	{
		String TCName=Thread.currentThread().getStackTrace()[2].getMethodName();
		String strValue = null;
		JSONParser jsonparser= new JSONParser();
		FileReader file=new FileReader(System.getProperty("user.dir")+"\\src\\test\\java\\TestData\\JsonDataFile.json");
		Object obj=jsonparser.parse(file);
		JSONObject jsonObj=(JSONObject)obj;
		if(jsonObj.containsKey(TCName))
		{
			JSONObject jsonNestObj=(JSONObject)jsonObj.get(TCName);
			strValue=(String)jsonNestObj.get(Key);
		}
		return strValue;
	}

}
