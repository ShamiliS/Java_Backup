
public class str {

	public static void main(String[] args) {
		String a = "10000111";

		
		int cnt1 = 0, cnt2 = 0;
		char output = 0;
		int i;
		char[] input = a.toCharArray();

		for (i = 0; i < input.length - 1; i++) {
			if (input[i] == input[i + 1]) {
				cnt1 = cnt1 + 1;
			} else if (cnt2 < cnt1) {
				output = input[i];
				cnt2 = cnt1;
				cnt1 = 0;
			}
		}
		System.out.println(output);
		System.out.println(a.indexOf(output));
		System.out.println(cnt2+1);
	}

}
