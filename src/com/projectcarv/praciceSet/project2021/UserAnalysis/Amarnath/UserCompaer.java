package UserAnalysis;

import java.util.ArrayList;
import java.util.List;

public class UserCompaer{

	public int compare(User obj1, User obj2) {
		if (obj1.name.compareTo((obj2.name)) == 0) {
			return 0;
		} else if (obj1.name.compareTo((obj1.name)) > 0) {
			return 1;
		} else
			return -1;
	}
	public static void main(String args[]){
		List<String> arrayList = new ArrayList<String>();
		String s1 = "Amar";
		String s2 = "Samar";
		String s3 = "Channdra";
		String s4 = "Daneswar";
		arrayList.add(s1);
		arrayList.add(s2);
		arrayList.add(s3);
		arrayList.add(s4);
		System.out.println(arrayList);
		arrayList.compare(s1,s2);
	}

}
