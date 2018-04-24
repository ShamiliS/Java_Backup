import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashSetex {
	public static void main(String args[]) {
		// create a hash set

		ArrayList<String> Columnname = new ArrayList<String>();

		Columnname.add("Prabu");
		Columnname.add("Sham");

		for (Iterator<String> iterator = Columnname.iterator(); iterator.hasNext();) {
			String value = iterator.next();
			Map<String, String> map = new HashMap<String, String>();
			map.put("1", "1");
			map.put("2", "2");
			map.put("3", "3");

			for (int j = 0; j < map.size(); j++) {
			}
		}
	}
}