package phonebook;

import java.util.*;

public class Printer{

	public static void print(ArrayList<String> phoneList){
		for (String phone : phoneList){
			System.out.println(phone);
		}
	}

}

