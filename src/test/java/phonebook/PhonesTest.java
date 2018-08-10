
package phonebook;

import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import java.util.*;
import phonebook.Phones;

public class PhonesTest{
	private static Phones phones;

	@Before
	public void initPhones(){
		phones = new Phones();
	}

	@After
	public void clearPhones(){
		phones = null;
	}

	@Test
	public void getPhoneListTest(){
		ArrayList<String> list = new ArrayList<String>();
		list.add("1. +8 800 2000 500");
		list.add("2. +8 800 200 600");
		ArrayList<String> expected = list;
		ArrayList<String> actual = phones.getPhoneList("Иванов И.И.");
		assertEquals(expected, actual);
	}

	@Test
	public void getPhoneListTwoTest(){
		ArrayList<String> list = new ArrayList<String>();
		list.add("Такого ФИО нет в базе данных.");
		ArrayList<String> expected = list;
		ArrayList<String> actual = phones.getPhoneList("Васильков А.А.");
		assertEquals(expected, actual);
	}
}

