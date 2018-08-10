package phonebook;

import java.util.*;

public class PhoneBook{

		private static PhoneBook instance;

		private PhoneBook(){}

		public static PhoneBook get(){
			
			if (instance == null){
				instance = new PhoneBook();
			}

			return instance;
		}

		public HashMap getBook(){
			ArrayList <String> phonesIvanov = new ArrayList();
			phonesIvanov.add("+8 800 2000 500");
			phonesIvanov.add("+8 800 200 600");
			ArrayList <String> phonesPetrov = new ArrayList();
			phonesPetrov.add("+8 800 2000 700");
			ArrayList <String> phonesSidorov = new ArrayList();
			phonesSidorov.add("+8 800 2000 800");
			phonesSidorov.add("+8 800 2000 900");
			phonesSidorov.add("+8 800 2000 000");

			HashMap<String, ArrayList<String>> personMap = new HashMap();
			personMap.put("Иванов И.И.", phonesIvanov);
			personMap.put("Петров П.П.", phonesPetrov);
			personMap.put("Сидоров С.С.", phonesSidorov);
			
			return personMap;
		}
}