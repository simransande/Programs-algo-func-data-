package RicePulseWheat;

import java.io.FileReader;
import java.io.IOException;

import org.json.simple.parser.ParseException;

import com.bridgelabz.utility.Utility;

public class RisePulseWheat 
{
	public static void main(String arghs[]) throws IOException, ParseException, java.text.ParseException {
		 Utility u=new Utility();
		FileReader fileread=Utility.fileRead("RisePulseWheat.json");
		u.RisePulseWheat(fileread);
	}
		
		
	}

