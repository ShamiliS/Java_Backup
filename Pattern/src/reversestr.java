public class reversestr {

	public static void main(String arg) {
		String arr = "java";
		int a = 2, b = 3;
		
		a = a + b - a;
		b = b + a - b;

		System.out.println(a + " " + b);
		
		for (int i = 0; i < arr.length(); i++) {
			System.out.println(arr.charAt(i));
		}

	}
}
