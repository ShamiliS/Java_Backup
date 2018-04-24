import java.util.regex.Pattern;

public class patternMatch {

	public static void main(String arg[]) {

		/*
		 * String column = "First_Name";
		 * 
		 * String regex =
		 * "(koinh|mc|nick|employee|emp|agent|locksmith|customer|cust|cus|officer|office|long|shrt|[fF]irst|last|middle|user|organisation|organization|org|title|letter|name)?(__)?(_)?( )?()?(-)*(organization|organisation|org|let|[nN]ame\\d*|text|txt|middle)?"
		 * ;
		 * 
		 * // if(pattern.contains(column)){ // System.out.print("Matched"); // }
		 * System.out.println(Pattern.matches(regex, column));
		 */

		String arr = "java";

		for (int i = arr.length() - 1; i >= 0; i--) {
			System.out.print(arr.charAt(i));
		}

		StringBuilder str = new StringBuilder(arr);
		System.out.println(str.reverse());

	}
}