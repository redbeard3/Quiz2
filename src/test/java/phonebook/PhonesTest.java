
import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import java.util.*;
import phonebook.Phones;

public class PhonesTest{
	private static Phones phohes;

	@Before
	public static void initPhones(){
		phohes = new Phones();
	}

	@After
	public static void clearPhones(){
		phohes = null;
	}

	@Test
	public void getPhoneList(){
		ArrayList<String> list = new ArrayList<String>();
		list.add("+8 800 2000 500");
		list.add("+8 800 200 600");
		ArrayList<String> expected = list;
		ArrayList<String> actual = phohes.getPhoneList("Иванов И.И.");
		assertEquals(expected, actual);
	}
}

