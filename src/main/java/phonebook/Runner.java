

import java.util.*;

public class Runner {

	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		System.out.println("Введите ФИО (пример: Петров П.П.)");
		String query = in.nextLine();
		Phones phones = new Phones();
		ArrayList<String>  phoneList = phones.getPhoneList(query);
		for (String phone : phoneList){
			System.out.println(phone);
		}
		
	}

}