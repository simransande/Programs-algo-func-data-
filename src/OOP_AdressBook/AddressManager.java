package OOP_AdressBook;
	import java.io.BufferedReader;
	import java.io.File;

	import java.io.FileReader;

	import java.io.IOException;
	import java.util.ArrayList;
	import java.util.Scanner;

	import org.codehaus.jackson.JsonParseException;
	import org.codehaus.jackson.map.JsonMappingException;
	import org.codehaus.jackson.map.ObjectMapper;
	import org.codehaus.jackson.type.TypeReference;
	import com.bridgelabz.utility.Utility;
	
public class AddressManager implements AddressManagerInterface {
	ObjectMapper objectMapper = new ObjectMapper();
	AddressBookInterface addressbook=new AddressBook();
	ArrayList<Person> arraylist=new ArrayList<Person>();
	File file;File newfile;
	static Scanner s=new Scanner(System.in);
	
	public void create() {
		System.out.println("Give a name to your new address book:");

		file = new File(Utility.ipstring()+".json");
		try {
			if (file.createNewFile()) {
				System.out.println("Address book is created!");
			}else
				{
					System.out.println("Cannot create new Addressbook");
				}
			
		} catch (IOException e) {
			System.out.println("Cannot create new Addressbook.");
			create();
		}
	}
	
	public void open() {
		System.out.println("Enter the name of address book");
		file = new File(Utility.ipstring()+".json");
				
		
				TypeReference<ArrayList<Person>> type = new TypeReference<ArrayList<Person>>() {
				};
				try {
					arraylist = objectMapper.readValue(file, type);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		
		addressbook.operation(arraylist);
	}
	
	public void save() {
		ArrayList<Person> arrayList = addressbook.list();

		try {
			objectMapper.writeValue(file, arrayList);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	
	public void saveAs() {
		System.out.println("Give a name to your new file");
		newfile = new File(Utility.ipstring()+".json");
		ArrayList<Person> arrayList = addressbook.list();

		try {
			objectMapper.writeValue(newfile, arrayList);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	
	public void quit() {
		System.exit(0);
	}
}
