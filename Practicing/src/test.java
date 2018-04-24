
public class test {

	public static void main(String arg[]) {

		int a = 3, b = 2;
		// a = (a + b) - a;
		// b = (b + a) - b;

		a = a + b;
		b = a - b;
		a = a - b;
		System.out.println(a + " " + b);
	}

}
