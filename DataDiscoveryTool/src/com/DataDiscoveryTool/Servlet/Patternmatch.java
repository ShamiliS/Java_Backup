package com.DataDiscoveryTool.Servlet;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

import com.DataDiscoveryTool.beans.UserBean;

public class Patternmatch {

	public void PatternmatchfromDB() {

		String names[] = null;
		Map<String, String> map;
		ArrayList<String> Columnname = UserBean.Columnname_sql;
		int i = 0;
		names = new String[Columnname.size()];
		if (Columnname.size() > 0) {
			Iterator<String> itr = Columnname.iterator();
			while (itr.hasNext()) {
				names[i] = itr.next();
				System.out.println(names[i]);

				map = ValidationPattern.validateCoulmn(names[i]);
				if (map.size() > 0) {
					Iterator it = map.entrySet().iterator();
					while (it.hasNext()) {
						Map.Entry entry = (Entry) it.next();
						System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());
						it.remove();
					}
				}

				i++;
				itr.remove();
			}
		}

		/*
		 * for (String name : names) { Map<String, String> map =
		 * ValidationPattern.validateCoulmn(name); if (map.size() > 0) { Iterator it =
		 * map.entrySet().iterator(); while (it.hasNext()) { Map.Entry entry = (Entry)
		 * it.next(); System.out.println("Key = " + entry.getKey() + ", Value = " +
		 * entry.getValue()); it.remove(); } } }
		 */

	}
}
