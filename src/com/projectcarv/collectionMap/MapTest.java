package com.projectcarv.collectionMap;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapTest {

	public static void main(String[] args) {
		
		Map<String, Integer> departmentMap = new HashMap<String, Integer>();
		departmentMap.put("it", new Integer(500));
		departmentMap.put("hr", new Integer(100));
		departmentMap.put("ops", new Integer(300));
		departmentMap.put("admin", new Integer(400));

		// Returns Set view
		/*Set<Map.Entry<String, Integer>> st = departmentMap.entrySet();

		for (Map.Entry<String, Integer> me : st) {
			System.out.print(me.getKey() + ":");
			System.out.println(me.getValue());
		}*/
		
		/*Set<String> keySet = departmentMap.keySet();
		System.out.println(keySet);
		System.out.println(departmentMap.values());*/
	}

}
