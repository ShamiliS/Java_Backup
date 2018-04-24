import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class strPattern {

	public static void main(String arg[]) {

		String str1 = "abcdbbbbcccbbabcdr";
		String pat = "abc";
		String subStr;
		int cnt = 0;
		int cnt1 = pat.length();

		for (int i = 0; i < str1.length() - (cnt1 - 1); i++) {
			subStr = str1.substring(i, cnt1 + i);
			if (subStr.equals(pat)) {
				cnt++;
			}
		}

		System.out.println(cnt);

		// ########################################
		String str = "helloslkhellodjladfjhello";
		Pattern p = Pattern.compile("hello");
		Matcher m = p.matcher(str);
		int count = 0;
		while (m.find()) {
			count += 1;
		}
		System.out.println(count);

		// ########################################
		String str11 = "abacabhujjhjcabc";

		String pattern = "abca";
		String sstr[] = str11.split(pattern);

		System.out.println(sstr.length);
	}
}
