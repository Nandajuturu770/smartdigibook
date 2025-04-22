package web;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.function.BiFunction;

import org.apache.commons.collections4.map.HashedMap;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import web.generic.BaseTest;
import web.pages.LoginPage;

public class LoginPageTests {

	String mobileNumber = "7702425817";
	String password = "111111";
	LoginPage loginPage;

	@BeforeMethod(alwaysRun = true)
	public void initialization() {
		// loginPage = new LoginPage(driver);
	}

	@Test
	public void verifyLoginFeaturesAndLoginIntoApplication() {
		loginPage.verifyLoginPage();
		//        loginPage.loginIntoApplication(mobileNumber, password);
		loginPage.getCreateNewAccountBtn().click();
		loginPage.verifyCreateAccountFeature();
	}

	@Test
	public void mapsComapare() {
		Map<String , String > map1  = new HashedMap<String, String>();
		map1.put("a", "1");
		map1.put("b", "3");
		map1.put("c", "3");
		map1.put("d", "4");
		System.out.println(map1);
		Map<String, String> map2 = new HashMap<String, String>();
		map2.put("b", "2");
		map2.put("c", "3");
		map2.put("d", "4");
		map2.put("a", "1");
		System.out.println(map2);
		System.out.println(map1.keySet());
		System.out.println(map2.keySet());
		System.out.println(map1.keySet().equals(map2.keySet()));
		if(map1.containsKey("b")) {
			if(map1.get("b").equals(map2.get("b")))
				System.out.println(map1.get("b") +"="+ map2.get("b"));
			else
				System.err.println("value are not matched");
			Set<String> map1keys = map1.keySet(); Set<String> map2keys = map2.keySet();
			if(map1.size()<=map2.size())
				compareMapsBasedOnKey(map1, map2);
			else
				compareMapsBasedOnKey(map2, map1);
		}
	}
	public boolean compareMapsBasedOnKey(Map<String , String> map1 , Map<String , String> map2) {
		boolean finalStatus = false;
		for(String key : map1.keySet()) {
			if(map2.containsKey(key)) {
				if(!map1.get(key).equals(map2.get(key)))
					System.out.println("Key :: "+key+"-> map1 value : "+map1.get(key) +" is not mathed with mpa2 value : "+map2.get(key));
				else
					System.out.println("Key :: "+key+"-> map1 value : "+map1.get(key) +" is matched with mpa2 value : "+map2.get(key));

			}
		}
		return finalStatus;
	}

	@Test
	public void contains() {
		String string = "Grade";
		String[] stringArray = string.split(" ");
		for(String word : stringArray)
			System.out.println(word);
	}

}
