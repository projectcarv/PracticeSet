package UserAnalysis;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import UserAnalysis.UserCompaer;
public class UserMain {

	public static void main(String[] args) {
		
		User user = new User("User-1", "User-1 address", "754129", "12/12/2019");
		User user2 = new User("User-3", "User-3 address", "754126", "12/10/2020");
		User user3 = new User("User-4", "User-4 address", "754127", "12/09/2017");
		User user1 = new User("User-2", "User-2 address", "754125", "12/11/2018");
		
		List<User> userList = new ArrayList<User>();
		userList.add(user);
		userList.add(user2);
		userList.add(user1);
		userList.add(user3);
		
		System.out.println(userList);
		
		//Collections.sort(userList);
		compare(userList);
		
		System.out.println(userList);
		
		/*List<String> nameList = new ArrayList<String>();
		nameList.add("Twinkle");
		nameList.add("Abhi");
		nameList.add("Amar");
		nameList.add("Dharma");
		nameList.add("Jiten");
		nameList.add("Manisha");
		
		System.out.println(nameList);
		Collections.sort(nameList);
		System.out.println(nameList);
		Collections.reverse(nameList);
		System.out.println(nameList);*/
		
		

	}
}
