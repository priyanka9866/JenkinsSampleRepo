package pack1;

import org.testng.annotations.Test;

public class ContactTest {
	@Test
	public void createContactTest() {
		String urL = System.getProperty("url");
		System.out.println(urL);
		String browseR = System.getProperty("browser");
		System.out.println(browseR);
		String userName = System.getProperty("username");
		System.out.println(userName);
		String passWord = System.getProperty("password");
		System.out.println(passWord);
		System.out.println("Execute CreateContactTest");
	}
	
	@Test
	public void modifyContactTest() {
		System.out.println("Execute ModifyContactTest");
	}
}
