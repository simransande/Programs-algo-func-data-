package StockReport;

import com.bridgelabz.utility.Utility;
import java.io.FileReader;
import java.io.IOException;
import org.json.simple.parser.ParseException;
import com.bridgelabz.utility.Utility;

	public class StockReport 
	{
public static void main(String[] args) throws IOException, ParseException, java.text.ParseException {
			 Utility u=new Utility();
			FileReader fileread=Utility.fileRead("report.json");
			u.stockReport(fileread);
		}

	}

