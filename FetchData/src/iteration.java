import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class iteration {

	public static void main(String arg[]) {

		ArrayList<String> signBlocks = new ArrayList<String>();
		signBlocks.add("one");
		signBlocks.add("two");
		signBlocks.add("three");

		Map<String, String> map = new HashMap<String, String>();
		map.put("TableName", "EMP_DETAILS_VIEW");
		map.put("ColumnName", "first_name");
		map.put("PII_Data", "Name");

		Iterator<String> itr = signBlocks.iterator();
		while (itr.hasNext()) {
			String signBlock = itr.next();
			System.out.println(signBlock);
			if (map.size() > 0) {
				Iterator it = map.entrySet().iterator();
				while (it.hasNext()) {
					Map.Entry entry = (Entry) it.next();
					System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());
					it.remove();
				}
			}
			itr.remove();
		}
	}
}
