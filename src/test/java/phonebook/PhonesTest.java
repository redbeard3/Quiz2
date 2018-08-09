
import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import java.util.*;
import phonebook.Phones;

public class PhonesTest{
	private static Phones phones;

	@Before
	public static void initPhones(){
		phones = new Phones();
	}

	@After
	public static void clearPhones(){
		phones = null;
	}

	@Test
	public void getPhoneList(){
		ArrayList<String> list = new ArrayList<String>();
		list.add("+8 800 2000 500");
		list.add("+8 800 200 600");
		ArrayList<String> expected = list;
		ArrayList<String> actual = phones.getPhoneList("Иванов И.И.");
		assertEquals(expected, actual);
	}
}

