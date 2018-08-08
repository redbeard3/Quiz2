import java.util.*;

public class Phones{

	public void run(String query){

		PhoneBook book = PhoneBook.get();

		HashMap<String, ArrayList<String>> personMap = book.getBook();
		int count = 0;
		if (personMap.containsKey(query)){
			for (String phone : personMap.get(query)){
				System.out.println(++count + ". " + phone);
			}	
			 
		} else {System.out.println("Такого ФИО нет в базе данных.");}
	}

}