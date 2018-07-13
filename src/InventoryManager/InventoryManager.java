package InventoryManager;

import com.bridgelabz.utility.Utility;


		
		import java.io.FileReader;
		import java.io.IOException;

		import org.json.simple.parser.ParseException;

		import com.bridgelabz.utility.Utility;

		public class InventoryManager 
		{
				
			public static void main(String[] args) throws IOException, ParseException, java.text.ParseException 
			{
				Utility u=new Utility();
				FileReader fileRead2=Utility.fileRead("RisePulseWheat.json");
				u.InventoryManager(fileRead2);
			}


	}

