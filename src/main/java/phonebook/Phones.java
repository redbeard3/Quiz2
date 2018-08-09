import java.util.*;

public class Phones{

	public ArrayList<String>  getPhoneList(String query){

		ArrayList<String>  phoneList = new ArrayList<String>();
		
		PhoneBook book = PhoneBook.get();

		HashMap<String, ArrayList<String>> personMap = book.getBook();
		int count = 0;
		if (personMap.containsKey(query)){
			for (String phone : personMap.get(query)){
				String str = ++count + ". " + phone;
				phoneList.add(str);				
			}	
			 
		} else {
			String str = "Такого ФИО нет в базе данных.";
			phoneList.add(str);
		}

		return phoneList;
	}

}